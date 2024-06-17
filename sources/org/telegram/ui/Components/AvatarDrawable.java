package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatInvite;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;

public class AvatarDrawable extends Drawable {
    public static final int[][] advancedGradients = {new int[]{-636796, -1090751, -612560, -35006}, new int[]{-693938, -690388, -11246, -22717}, new int[]{-8160001, -5217281, -36183, -1938945}, new int[]{-16133536, -10560448, -4070106, -8331477}, new int[]{-10569989, -14692629, -12191817, -14683687}, new int[]{-11694593, -13910017, -14622003, -15801871}, new int[]{-439392, -304000, -19910, -98718}};
    private GradientTools advancedGradient;
    private int alpha;
    private float archivedAvatarProgress;
    private int avatarType;
    private int color;
    private int color2;
    private boolean drawAvatarBackground;
    private boolean drawDeleted;
    private LinearGradient gradient;
    private int gradientBottom;
    private int gradientColor1;
    private int gradientColor2;
    private boolean hasAdvancedGradient;
    private boolean hasGradient;
    private boolean invalidateTextLayout;
    private TextPaint namePaint;
    private boolean needApplyColorAccent;
    private Theme.ResourcesProvider resourcesProvider;
    private boolean rotate45Background;
    private int roundRadius;
    private float scaleSize;
    private StringBuilder stringBuilder;
    private float textHeight;
    private StaticLayout textLayout;
    private float textLeft;
    private float textWidth;

    @Override
    public int getIntrinsicHeight() {
        return 0;
    }

    @Override
    public int getIntrinsicWidth() {
        return 0;
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setProfile(boolean z) {
    }

    public AvatarDrawable() {
        this((Theme.ResourcesProvider) null);
    }

    public AvatarDrawable(Theme.ResourcesProvider resourcesProvider) {
        this.scaleSize = 1.0f;
        this.stringBuilder = new StringBuilder(5);
        this.roundRadius = -1;
        this.drawAvatarBackground = true;
        this.rotate45Background = false;
        this.alpha = 255;
        this.resourcesProvider = resourcesProvider;
        TextPaint textPaint = new TextPaint(1);
        this.namePaint = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        this.namePaint.setTextSize(AndroidUtilities.dp(18.0f));
    }

    public AvatarDrawable(TLRPC$User tLRPC$User) {
        this(tLRPC$User, false);
    }

    public AvatarDrawable(TLRPC$Chat tLRPC$Chat) {
        this(tLRPC$Chat, false);
    }

    public AvatarDrawable(TLRPC$User tLRPC$User, boolean z) {
        this();
        if (tLRPC$User != null) {
            setInfo(tLRPC$User.id, tLRPC$User.first_name, tLRPC$User.last_name, null);
            this.drawDeleted = UserObject.isDeleted(tLRPC$User);
        }
    }

    public AvatarDrawable(TLRPC$Chat tLRPC$Chat, boolean z) {
        this();
        setInfo(tLRPC$Chat);
    }

    public void setDrawAvatarBackground(boolean z) {
        this.drawAvatarBackground = z;
    }

    public static int getPeerColorIndex(int i) {
        float[] tempHsv = Theme.getTempHsv(5);
        Color.colorToHSV(i, tempHsv);
        int i2 = (int) tempHsv[0];
        if (i2 >= 345 || i2 < 29) {
            return 0;
        }
        if (i2 < 67) {
            return 1;
        }
        if (i2 < 140) {
            return 3;
        }
        if (i2 < 199) {
            return 4;
        }
        if (i2 < 234) {
            return 5;
        }
        return i2 < 301 ? 2 : 6;
    }

    public static int getColorIndex(long j) {
        return (int) Math.abs(j % Theme.keys_avatar_background.length);
    }

    public static int getColorForId(long j) {
        return Theme.getColor(Theme.keys_avatar_background[getColorIndex(j)]);
    }

    public static int getIconColorForId(long j, Theme.ResourcesProvider resourcesProvider) {
        return Theme.getColor(Theme.key_avatar_actionBarIconBlue, resourcesProvider);
    }

    public static int getProfileColorForId(long j, Theme.ResourcesProvider resourcesProvider) {
        return Theme.getColor(Theme.keys_avatar_background[getColorIndex(j)], resourcesProvider);
    }

    public static int getProfileTextColorForId(long j, Theme.ResourcesProvider resourcesProvider) {
        return Theme.getColor(Theme.key_avatar_subtitleInProfileBlue, resourcesProvider);
    }

    public static int getProfileBackColorForId(long j, Theme.ResourcesProvider resourcesProvider) {
        return Theme.getColor(Theme.key_avatar_backgroundActionBarBlue, resourcesProvider);
    }

    public static String colorName(int i) {
        return LocaleController.getString(new int[]{R.string.ColorRed, R.string.ColorOrange, R.string.ColorViolet, R.string.ColorGreen, R.string.ColorCyan, R.string.ColorBlue, R.string.ColorPink}[i % 7]);
    }

    public void setInfo(TLRPC$User tLRPC$User) {
        setInfo(UserConfig.selectedAccount, tLRPC$User);
    }

    public void setInfo(int i, TLRPC$User tLRPC$User) {
        if (tLRPC$User != null) {
            setInfo(tLRPC$User.id, tLRPC$User.first_name, tLRPC$User.last_name, null, tLRPC$User.color != null ? Integer.valueOf(UserObject.getColorId(tLRPC$User)) : null, UserObject.getPeerColorForAvatar(i, tLRPC$User));
            this.drawDeleted = UserObject.isDeleted(tLRPC$User);
        }
    }

    public void setInfo(TLObject tLObject) {
        if (tLObject instanceof TLRPC$User) {
            setInfo((TLRPC$User) tLObject);
        } else if (tLObject instanceof TLRPC$Chat) {
            setInfo((TLRPC$Chat) tLObject);
        } else if (tLObject instanceof TLRPC$ChatInvite) {
            setInfo((TLRPC$ChatInvite) tLObject);
        }
    }

    public void setInfo(int i, TLObject tLObject) {
        if (tLObject instanceof TLRPC$User) {
            setInfo(i, (TLRPC$User) tLObject);
        } else if (tLObject instanceof TLRPC$Chat) {
            setInfo(i, (TLRPC$Chat) tLObject);
        } else if (tLObject instanceof TLRPC$ChatInvite) {
            setInfo(i, (TLRPC$ChatInvite) tLObject);
        }
    }

    public void setScaleSize(float f) {
        this.scaleSize = f;
    }

    public void setAvatarType(int i) {
        this.avatarType = i;
        boolean z = false;
        this.rotate45Background = false;
        this.hasAdvancedGradient = false;
        this.hasGradient = false;
        if (i == 13) {
            int color = Theme.getColor(Theme.key_chats_actionBackground);
            this.color2 = color;
            this.color = color;
        } else if (i == 2) {
            int themedColor = getThemedColor(Theme.key_avatar_backgroundArchivedHidden);
            this.color2 = themedColor;
            this.color = themedColor;
        } else if (i == 12 || i == 1 || i == 14) {
            this.hasGradient = true;
            this.color = getThemedColor(Theme.key_avatar_backgroundSaved);
            this.color2 = getThemedColor(Theme.key_avatar_background2Saved);
        } else if (i == 20) {
            this.rotate45Background = true;
            this.hasGradient = true;
            this.color = getThemedColor(Theme.key_stories_circle1);
            this.color2 = getThemedColor(Theme.key_stories_circle2);
        } else if (i == 3) {
            this.hasGradient = true;
            this.color = getThemedColor(Theme.keys_avatar_background[getColorIndex(5L)]);
            this.color2 = getThemedColor(Theme.keys_avatar_background2[getColorIndex(5L)]);
        } else if (i == 4) {
            this.hasGradient = true;
            this.color = getThemedColor(Theme.keys_avatar_background[getColorIndex(5L)]);
            this.color2 = getThemedColor(Theme.keys_avatar_background2[getColorIndex(5L)]);
        } else if (i == 5) {
            this.hasGradient = true;
            this.color = getThemedColor(Theme.keys_avatar_background[getColorIndex(4L)]);
            this.color2 = getThemedColor(Theme.keys_avatar_background2[getColorIndex(4L)]);
        } else if (i == 6 || i == 23) {
            this.hasGradient = true;
            this.color = getThemedColor(Theme.keys_avatar_background[getColorIndex(3L)]);
            this.color2 = getThemedColor(Theme.keys_avatar_background2[getColorIndex(3L)]);
        } else if (i == 7 || i == 24) {
            this.hasGradient = true;
            this.color = getThemedColor(Theme.keys_avatar_background[getColorIndex(1L)]);
            this.color2 = getThemedColor(Theme.keys_avatar_background2[getColorIndex(1L)]);
        } else if (i == 8) {
            this.hasGradient = true;
            this.color = getThemedColor(Theme.keys_avatar_background[getColorIndex(0L)]);
            this.color2 = getThemedColor(Theme.keys_avatar_background2[getColorIndex(0L)]);
        } else if (i == 9) {
            this.hasGradient = true;
            this.color = getThemedColor(Theme.keys_avatar_background[getColorIndex(6L)]);
            this.color2 = getThemedColor(Theme.keys_avatar_background2[getColorIndex(6L)]);
        } else if (i == 10) {
            this.hasGradient = true;
            this.color = getThemedColor(Theme.keys_avatar_background[getColorIndex(5L)]);
            this.color2 = getThemedColor(Theme.keys_avatar_background2[getColorIndex(5L)]);
        } else if (i == 17) {
            this.hasGradient = true;
            this.color = getThemedColor(Theme.keys_avatar_background[getColorIndex(5L)]);
            this.color2 = getThemedColor(Theme.keys_avatar_background2[getColorIndex(5L)]);
        } else if (i == 21) {
            this.hasAdvancedGradient = true;
            if (this.advancedGradient == null) {
                this.advancedGradient = new GradientTools();
            }
            this.advancedGradient.setColors(-8160001, -5217281, -36183, -1938945);
        } else if (i == 22) {
            this.hasAdvancedGradient = true;
            if (this.advancedGradient == null) {
                this.advancedGradient = new GradientTools();
            }
            this.advancedGradient.setColors(-11694593, -13910017, -14622003, -15801871);
        } else {
            this.hasGradient = true;
            this.color = getThemedColor(Theme.keys_avatar_background[getColorIndex(4L)]);
            this.color2 = getThemedColor(Theme.keys_avatar_background2[getColorIndex(4L)]);
        }
        int i2 = this.avatarType;
        if (i2 != 2 && i2 != 1 && i2 != 20 && i2 != 21 && i2 != 12 && i2 != 14) {
            z = true;
        }
        this.needApplyColorAccent = z;
    }

    public void setArchivedAvatarHiddenProgress(float f) {
        this.archivedAvatarProgress = f;
    }

    public int getAvatarType() {
        return this.avatarType;
    }

    public void setInfo(TLRPC$Chat tLRPC$Chat) {
        setInfo(UserConfig.selectedAccount, tLRPC$Chat);
    }

    public void setInfo(int i, TLRPC$Chat tLRPC$Chat) {
        if (tLRPC$Chat != null) {
            setInfo(tLRPC$Chat.id, tLRPC$Chat.title, null, null, tLRPC$Chat.color != null ? Integer.valueOf(ChatObject.getColorId(tLRPC$Chat)) : null, ChatObject.getPeerColorForAvatar(i, tLRPC$Chat));
        }
    }

    public void setInfo(TLRPC$ChatInvite tLRPC$ChatInvite) {
        setInfo(UserConfig.selectedAccount, tLRPC$ChatInvite);
    }

    public void setInfo(int i, TLRPC$ChatInvite tLRPC$ChatInvite) {
        if (tLRPC$ChatInvite != null) {
            String str = tLRPC$ChatInvite.title;
            TLRPC$Chat tLRPC$Chat = tLRPC$ChatInvite.chat;
            setInfo(0L, str, null, null, (tLRPC$Chat == null || tLRPC$Chat.color == null) ? null : Integer.valueOf(ChatObject.getColorId(tLRPC$Chat)), ChatObject.getPeerColorForAvatar(i, tLRPC$ChatInvite.chat));
        }
    }

    public void setColor(int i) {
        this.hasGradient = false;
        this.hasAdvancedGradient = false;
        this.color2 = i;
        this.color = i;
        this.needApplyColorAccent = false;
    }

    public void setColor(int i, int i2) {
        this.hasGradient = true;
        this.hasAdvancedGradient = false;
        this.color = i;
        this.color2 = i2;
        this.needApplyColorAccent = false;
    }

    public void setTextSize(int i) {
        this.namePaint.setTextSize(i);
    }

    public void setInfo(long j, String str, String str2) {
        setInfo(j, str, str2, null, null, null);
    }

    public int getColor() {
        return this.needApplyColorAccent ? Theme.changeColorAccent(this.color) : this.color;
    }

    public int getColor2() {
        return this.needApplyColorAccent ? Theme.changeColorAccent(this.color2) : this.color2;
    }

    private static String takeFirstCharacter(String str) {
        ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(str);
        if (parseEmojis != null && !parseEmojis.isEmpty() && parseEmojis.get(0).start == 0) {
            return str.substring(0, parseEmojis.get(0).end);
        }
        return str.substring(0, str.offsetByCodePoints(0, Math.min(str.codePointCount(0, str.length()), 1)));
    }

    public void setInfo(long j, String str, String str2, String str3) {
        setInfo(j, str, str2, str3, null, null);
    }

    public void setInfo(long j, String str, String str2, String str3, Integer num, MessagesController.PeerColor peerColor) {
        setInfo(j, str, str2, str3, num, peerColor, false);
    }

    public void setInfo(long j, String str, String str2, String str3, Integer num, MessagesController.PeerColor peerColor, boolean z) {
        MessagesController.PeerColors peerColors;
        this.invalidateTextLayout = true;
        if (z) {
            this.hasGradient = false;
            this.hasAdvancedGradient = true;
            if (this.advancedGradient == null) {
                this.advancedGradient = new GradientTools();
            }
        } else {
            this.hasGradient = true;
            this.hasAdvancedGradient = false;
        }
        if (peerColor != null) {
            if (z) {
                int[] iArr = advancedGradients[getPeerColorIndex(peerColor.getAvatarColor1())];
                this.advancedGradient.setColors(iArr[0], iArr[1], iArr[2], iArr[3]);
            } else {
                this.color = peerColor.getAvatarColor1();
                this.color2 = peerColor.getAvatarColor2();
            }
        } else if (num != null) {
            if (num.intValue() >= 14) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                if (messagesController != null && (peerColors = messagesController.peerColors) != null && peerColors.getColor(num.intValue()) != null) {
                    int color1 = messagesController.peerColors.getColor(num.intValue()).getColor1();
                    if (z) {
                        int[] iArr2 = advancedGradients[getPeerColorIndex(color1)];
                        this.advancedGradient.setColors(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                    } else {
                        this.color = getThemedColor(Theme.keys_avatar_background[getPeerColorIndex(color1)]);
                        this.color2 = getThemedColor(Theme.keys_avatar_background2[getPeerColorIndex(color1)]);
                    }
                } else if (z) {
                    int[] iArr3 = advancedGradients[getColorIndex(num.intValue())];
                    this.advancedGradient.setColors(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
                } else {
                    this.color = getThemedColor(Theme.keys_avatar_background[getColorIndex(num.intValue())]);
                    this.color2 = getThemedColor(Theme.keys_avatar_background2[getColorIndex(num.intValue())]);
                }
            } else if (z) {
                int[] iArr4 = advancedGradients[getColorIndex(num.intValue())];
                this.advancedGradient.setColors(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
            } else {
                this.color = getThemedColor(Theme.keys_avatar_background[getColorIndex(num.intValue())]);
                this.color2 = getThemedColor(Theme.keys_avatar_background2[getColorIndex(num.intValue())]);
            }
        } else if (z) {
            int[] iArr5 = advancedGradients[getColorIndex(j)];
            this.advancedGradient.setColors(iArr5[0], iArr5[1], iArr5[2], iArr5[3]);
        } else {
            this.color = getThemedColor(Theme.keys_avatar_background[getColorIndex(j)]);
            this.color2 = getThemedColor(Theme.keys_avatar_background2[getColorIndex(j)]);
        }
        this.needApplyColorAccent = j == 5;
        this.avatarType = 0;
        this.drawDeleted = false;
        if (str == null || str.length() == 0) {
            str = str2;
            str2 = null;
        }
        getAvatarSymbols(str, str2, str3, this.stringBuilder);
    }

    public static void getAvatarSymbols(String str, String str2, String str3, StringBuilder sb) {
        sb.setLength(0);
        if (str3 != null) {
            sb.append(str3);
            return;
        }
        if (str != null && str.length() > 0) {
            sb.append(takeFirstCharacter(str));
        }
        if (str2 != null && str2.length() > 0) {
            int lastIndexOf = str2.lastIndexOf(32);
            if (lastIndexOf >= 0) {
                str2 = str2.substring(lastIndexOf + 1);
            }
            if (Build.VERSION.SDK_INT > 17) {
                sb.append("\u200c");
            }
            sb.append(takeFirstCharacter(str2));
            return;
        }
        if (str == null || str.length() <= 0) {
            return;
        }
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) == ' ' && length != str.length() - 1 && str.charAt(length + 1) != ' ') {
                int length2 = sb.length();
                if (Build.VERSION.SDK_INT > 17) {
                    sb.append("\u200c");
                }
                sb.append(takeFirstCharacter(str.substring(length2)));
                return;
            }
        }
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable;
        GradientTools gradientTools;
        android.graphics.Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        int width = bounds.width();
        this.namePaint.setColor(ColorUtils.setAlphaComponent(getThemedColor(Theme.key_avatar_text), this.alpha));
        Paint paint = Theme.avatar_backgroundPaint;
        if (this.hasAdvancedGradient && (gradientTools = this.advancedGradient) != null) {
            gradientTools.setBounds(bounds.left, bounds.top, r4 + width, r8 + width);
            paint = this.advancedGradient.paint;
        } else if (this.hasGradient) {
            int alphaComponent = ColorUtils.setAlphaComponent(getColor(), this.alpha);
            int alphaComponent2 = ColorUtils.setAlphaComponent(getColor2(), this.alpha);
            if (this.gradient == null || this.gradientBottom != bounds.height() || this.gradientColor1 != alphaComponent || this.gradientColor2 != alphaComponent2) {
                int height = bounds.height();
                this.gradientBottom = height;
                this.gradientColor1 = alphaComponent;
                this.gradientColor2 = alphaComponent2;
                this.gradient = new LinearGradient(0.0f, 0.0f, 0.0f, height, alphaComponent, alphaComponent2, Shader.TileMode.CLAMP);
            }
            paint.setShader(this.gradient);
        } else {
            paint.setShader(null);
            paint.setColor(ColorUtils.setAlphaComponent(getColor(), this.alpha));
        }
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        if (this.drawAvatarBackground) {
            if (this.rotate45Background) {
                canvas.save();
                float f = width / 2.0f;
                canvas.rotate(-45.0f, f, f);
            }
            if (this.roundRadius > 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f2 = width;
                rectF.set(0.0f, 0.0f, f2, f2);
                int i = this.roundRadius;
                canvas.drawRoundRect(rectF, i, i, paint);
            } else {
                float f3 = width / 2.0f;
                canvas.drawCircle(f3, f3, f3, paint);
            }
            if (this.rotate45Background) {
                canvas.restore();
            }
        }
        int i2 = this.avatarType;
        if (i2 == 2) {
            if (this.archivedAvatarProgress != 0.0f) {
                int i3 = Theme.key_avatar_backgroundArchived;
                paint.setColor(ColorUtils.setAlphaComponent(getThemedColor(i3), this.alpha));
                float f4 = width / 2.0f;
                canvas.drawCircle(f4, f4, this.archivedAvatarProgress * f4, paint);
                if (Theme.dialogs_archiveAvatarDrawableRecolored) {
                    Theme.dialogs_archiveAvatarDrawable.beginApplyLayerColors();
                    Theme.dialogs_archiveAvatarDrawable.setLayerColor("Arrow1.**", Theme.getNonAnimatedColor(i3));
                    Theme.dialogs_archiveAvatarDrawable.setLayerColor("Arrow2.**", Theme.getNonAnimatedColor(i3));
                    Theme.dialogs_archiveAvatarDrawable.commitApplyLayerColors();
                    Theme.dialogs_archiveAvatarDrawableRecolored = false;
                }
            } else if (!Theme.dialogs_archiveAvatarDrawableRecolored) {
                Theme.dialogs_archiveAvatarDrawable.beginApplyLayerColors();
                Theme.dialogs_archiveAvatarDrawable.setLayerColor("Arrow1.**", this.color);
                Theme.dialogs_archiveAvatarDrawable.setLayerColor("Arrow2.**", this.color);
                Theme.dialogs_archiveAvatarDrawable.commitApplyLayerColors();
                Theme.dialogs_archiveAvatarDrawableRecolored = true;
            }
            int intrinsicWidth = Theme.dialogs_archiveAvatarDrawable.getIntrinsicWidth();
            int intrinsicHeight = Theme.dialogs_archiveAvatarDrawable.getIntrinsicHeight();
            int i4 = (width - intrinsicWidth) / 2;
            int i5 = (width - intrinsicHeight) / 2;
            canvas.save();
            Theme.dialogs_archiveAvatarDrawable.setBounds(i4, i5, intrinsicWidth + i4, intrinsicHeight + i5);
            Theme.dialogs_archiveAvatarDrawable.draw(canvas);
            canvas.restore();
        } else if (i2 != 0) {
            if (i2 == 1) {
                drawable = Theme.avatarDrawables[0];
            } else if (i2 == 4) {
                drawable = Theme.avatarDrawables[2];
            } else if (i2 == 5) {
                drawable = Theme.avatarDrawables[3];
            } else if (i2 == 6) {
                drawable = Theme.avatarDrawables[4];
            } else if (i2 == 7) {
                drawable = Theme.avatarDrawables[5];
            } else if (i2 == 8) {
                drawable = Theme.avatarDrawables[6];
            } else if (i2 == 9) {
                drawable = Theme.avatarDrawables[7];
            } else if (i2 == 10) {
                drawable = Theme.avatarDrawables[8];
            } else if (i2 == 3) {
                drawable = Theme.avatarDrawables[10];
            } else if (i2 == 12) {
                drawable = Theme.avatarDrawables[11];
            } else if (i2 == 14) {
                drawable = Theme.avatarDrawables[12];
            } else if (i2 == 15) {
                drawable = Theme.avatarDrawables[13];
            } else if (i2 == 16) {
                drawable = Theme.avatarDrawables[14];
            } else if (i2 == 19) {
                drawable = Theme.avatarDrawables[15];
            } else if (i2 == 18) {
                drawable = Theme.avatarDrawables[16];
            } else if (i2 == 20) {
                drawable = Theme.avatarDrawables[17];
            } else if (i2 == 21) {
                drawable = Theme.avatarDrawables[18];
            } else if (i2 == 22) {
                drawable = Theme.avatarDrawables[19];
            } else if (i2 == 23) {
                drawable = Theme.avatarDrawables[21];
            } else if (i2 == 24) {
                drawable = Theme.avatarDrawables[20];
            } else {
                drawable = Theme.avatarDrawables[9];
            }
            if (drawable != null) {
                int intrinsicWidth2 = (int) (drawable.getIntrinsicWidth() * this.scaleSize);
                int intrinsicHeight2 = (int) (drawable.getIntrinsicHeight() * this.scaleSize);
                int i6 = (width - intrinsicWidth2) / 2;
                int i7 = (width - intrinsicHeight2) / 2;
                drawable.setBounds(i6, i7, intrinsicWidth2 + i6, intrinsicHeight2 + i7);
                int i8 = this.alpha;
                if (i8 != 255) {
                    drawable.setAlpha(i8);
                    drawable.draw(canvas);
                    drawable.setAlpha(255);
                } else {
                    drawable.draw(canvas);
                }
            }
        } else {
            if (this.drawDeleted) {
                Drawable[] drawableArr = Theme.avatarDrawables;
                if (drawableArr[1] != null) {
                    int intrinsicWidth3 = drawableArr[1].getIntrinsicWidth();
                    int intrinsicHeight3 = Theme.avatarDrawables[1].getIntrinsicHeight();
                    if (intrinsicWidth3 > width - AndroidUtilities.dp(6.0f) || intrinsicHeight3 > width - AndroidUtilities.dp(6.0f)) {
                        float dp = width / AndroidUtilities.dp(50.0f);
                        intrinsicWidth3 = (int) (intrinsicWidth3 * dp);
                        intrinsicHeight3 = (int) (intrinsicHeight3 * dp);
                    }
                    int i9 = (width - intrinsicWidth3) / 2;
                    int i10 = (width - intrinsicHeight3) / 2;
                    Theme.avatarDrawables[1].setBounds(i9, i10, intrinsicWidth3 + i9, intrinsicHeight3 + i10);
                    Theme.avatarDrawables[1].draw(canvas);
                }
            }
            if (this.invalidateTextLayout) {
                this.invalidateTextLayout = false;
                if (this.stringBuilder.length() > 0) {
                    CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) this.stringBuilder.toString().toUpperCase(), this.namePaint.getFontMetricsInt(), AndroidUtilities.dp(16.0f), true);
                    StaticLayout staticLayout = this.textLayout;
                    if (staticLayout == null || !TextUtils.equals(replaceEmoji, staticLayout.getText())) {
                        try {
                            StaticLayout staticLayout2 = new StaticLayout(replaceEmoji, this.namePaint, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            this.textLayout = staticLayout2;
                            if (staticLayout2.getLineCount() > 0) {
                                this.textLeft = this.textLayout.getLineLeft(0);
                                this.textWidth = this.textLayout.getLineWidth(0);
                                this.textHeight = this.textLayout.getLineBottom(0);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } else {
                    this.textLayout = null;
                }
            }
            if (this.textLayout != null) {
                float f5 = width;
                float dp2 = f5 / AndroidUtilities.dp(50.0f);
                float f6 = f5 / 2.0f;
                canvas.scale(dp2, dp2, f6, f6);
                canvas.translate(((f5 - this.textWidth) / 2.0f) - this.textLeft, (f5 - this.textHeight) / 2.0f);
                this.textLayout.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override
    public void setAlpha(int i) {
        this.alpha = i;
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public void setRoundRadius(int i) {
        this.roundRadius = i;
    }
}
