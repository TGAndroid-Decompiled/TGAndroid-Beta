package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public class AvatarDrawable extends Drawable {
    public static final int[][] advancedGradients = {new int[]{-636796, -1090751, -612560, -35006}, new int[]{-693938, -690388, -11246, -22717}, new int[]{-8160001, -5217281, -36183, -1938945}, new int[]{-16133536, -10560448, -4070106, -8331477}, new int[]{-10569989, -14692629, -12191817, -14683687}, new int[]{-11694593, -13910017, -14622003, -15801871}, new int[]{-439392, -304000, -19910, -98718}};
    private GradientTools advancedGradient;
    private int alpha;
    private float archivedAvatarProgress;
    private int avatarType;
    private int color;
    private int color2;
    private Drawable customIconDrawable;
    private boolean drawAvatarBackground;
    private boolean drawDeleted;
    private LinearGradient gradient;
    private int gradientBottom;
    private int gradientColor1;
    private int gradientColor2;
    private boolean hasAdvancedGradient;
    private boolean hasGradient;
    private int iconTx;
    private int iconTy;
    private boolean invalidateTextLayout;
    private boolean isProfile;
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

    public AvatarDrawable() {
        this((Theme.ResourcesProvider) null);
    }

    public AvatarDrawable(TLRPC.Chat chat) {
        this(chat, false);
    }

    public AvatarDrawable(TLRPC.Chat chat, boolean z) {
        this();
        this.isProfile = z;
        setInfo(chat);
    }

    public AvatarDrawable(TLRPC.User user) {
        this(user, false);
    }

    public AvatarDrawable(TLRPC.User user, boolean z) {
        this();
        this.isProfile = z;
        if (user != null) {
            setInfo(user.id, user.first_name, user.last_name, null);
            this.drawDeleted = UserObject.isDeleted(user);
        }
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

    public static String colorName(int i) {
        return LocaleController.getString(new int[]{R.string.ColorRed, R.string.ColorOrange, R.string.ColorViolet, R.string.ColorGreen, R.string.ColorCyan, R.string.ColorBlue, R.string.ColorPink}[i % 7]);
    }

    public static void getAvatarSymbols(String str, String str2, String str3, StringBuilder sb) {
        String takeFirstCharacter;
        sb.setLength(0);
        if (str3 != null) {
            sb.append(str3);
            return;
        }
        if (str != null && str.length() > 0) {
            sb.append(takeFirstCharacter(str));
        }
        if (str2 == null || str2.length() <= 0) {
            if (str == null || str.length() <= 0) {
                return;
            }
            for (int length = str.length() - 1; length >= 0; length--) {
                if (str.charAt(length) == ' ' && length != str.length() - 1 && str.charAt(length + 1) != ' ') {
                    int length2 = sb.length();
                    sb.append("\u200c");
                    takeFirstCharacter = takeFirstCharacter(str.substring(length2));
                }
            }
            return;
        }
        int lastIndexOf = str2.lastIndexOf(32);
        if (lastIndexOf >= 0) {
            str2 = str2.substring(lastIndexOf + 1);
        }
        sb.append("\u200c");
        takeFirstCharacter = takeFirstCharacter(str2);
        sb.append(takeFirstCharacter);
    }

    public static int getColorForId(long j) {
        return Theme.getColor(Theme.keys_avatar_background[getColorIndex(j)]);
    }

    public static int getColorIndex(long j) {
        return (int) Math.abs(j % Theme.keys_avatar_background.length);
    }

    public static int getIconColorForId(long j, Theme.ResourcesProvider resourcesProvider) {
        return Theme.getColor(Theme.key_avatar_actionBarIconBlue, resourcesProvider);
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

    public static int getProfileBackColorForId(long j, Theme.ResourcesProvider resourcesProvider) {
        return Theme.getColor(Theme.key_avatar_backgroundActionBarBlue, resourcesProvider);
    }

    public static int getProfileColorForId(long j, Theme.ResourcesProvider resourcesProvider) {
        return Theme.getColor(Theme.keys_avatar_background[getColorIndex(j)], resourcesProvider);
    }

    public static int getProfileTextColorForId(long j, Theme.ResourcesProvider resourcesProvider) {
        return Theme.getColor(Theme.key_avatar_subtitleInProfileBlue, resourcesProvider);
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    private static String takeFirstCharacter(String str) {
        ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(str);
        return str.substring(0, (parseEmojis == null || parseEmojis.isEmpty() || parseEmojis.get(0).start != 0) ? str.offsetByCodePoints(0, Math.min(str.codePointCount(0, str.length()), 1)) : parseEmojis.get(0).end);
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
            gradientTools.setBounds(bounds.left, bounds.top, r2 + width, r5 + width);
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
            paint.setAlpha(this.alpha);
        } else {
            paint.setShader(null);
            paint.setColor(ColorUtils.setAlphaComponent(getColor(), this.alpha));
        }
        Paint paint2 = paint;
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        if (this.drawAvatarBackground) {
            if (this.rotate45Background) {
                canvas.save();
                float f = width / 2.0f;
                canvas.rotate(-45.0f, f, f);
            }
            int i = this.roundRadius;
            if (i == 0) {
                float f2 = width;
                canvas.drawRect(0.0f, 0.0f, f2, f2, paint2);
            } else if (i > 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f3 = width;
                rectF.set(0.0f, 0.0f, f3, f3);
                float f4 = this.roundRadius;
                canvas.drawRoundRect(rectF, f4, f4, paint2);
            } else {
                float f5 = width / 2.0f;
                canvas.drawCircle(f5, f5, f5, paint2);
            }
            if (this.rotate45Background) {
                canvas.restore();
            }
        }
        int i2 = this.avatarType;
        if (i2 == 2) {
            if (this.archivedAvatarProgress != 0.0f) {
                int i3 = Theme.key_avatar_backgroundArchived;
                paint2.setColor(ColorUtils.setAlphaComponent(getThemedColor(i3), this.alpha));
                float f6 = width / 2.0f;
                canvas.drawCircle(f6, f6, this.archivedAvatarProgress * f6, paint2);
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
        } else if (i2 != 0 || this.customIconDrawable != null) {
            Drawable drawable2 = this.customIconDrawable;
            if (drawable2 == null) {
                drawable2 = i2 == 1 ? Theme.avatarDrawables[0] : i2 == 4 ? Theme.avatarDrawables[2] : i2 == 5 ? Theme.avatarDrawables[3] : i2 == 6 ? Theme.avatarDrawables[4] : i2 == 7 ? Theme.avatarDrawables[5] : i2 == 8 ? Theme.avatarDrawables[6] : i2 == 9 ? Theme.avatarDrawables[7] : i2 == 10 ? Theme.avatarDrawables[8] : i2 == 3 ? Theme.avatarDrawables[10] : i2 == 12 ? Theme.avatarDrawables[11] : i2 == 14 ? Theme.avatarDrawables[12] : i2 == 15 ? Theme.avatarDrawables[13] : i2 == 16 ? Theme.avatarDrawables[14] : i2 == 19 ? Theme.avatarDrawables[15] : i2 == 18 ? Theme.avatarDrawables[16] : i2 == 20 ? Theme.avatarDrawables[17] : i2 == 21 ? Theme.avatarDrawables[18] : i2 == 22 ? Theme.avatarDrawables[19] : i2 == 23 ? Theme.avatarDrawables[21] : i2 == 24 ? Theme.avatarDrawables[20] : i2 == 25 ? Theme.avatarDrawables[22] : i2 == 26 ? Theme.avatarDrawables[23] : i2 == 27 ? Theme.avatarDrawables[24] : Theme.avatarDrawables[9];
            }
            if (drawable2 != null) {
                int intrinsicWidth2 = (int) (drawable2.getIntrinsicWidth() * this.scaleSize);
                int intrinsicHeight2 = (int) (drawable2.getIntrinsicHeight() * this.scaleSize);
                int i6 = ((width - intrinsicWidth2) / 2) + this.iconTx;
                int i7 = ((width - intrinsicHeight2) / 2) + this.iconTy;
                drawable2.setBounds(i6, i7, intrinsicWidth2 + i6, intrinsicHeight2 + i7);
                int i8 = this.alpha;
                if (i8 != 255) {
                    drawable2.setAlpha(i8);
                    drawable2.draw(canvas);
                    drawable2.setAlpha(255);
                } else {
                    drawable2.draw(canvas);
                }
            }
        } else if (!this.drawDeleted || (drawable = Theme.avatarDrawables[1]) == null) {
            if (this.invalidateTextLayout) {
                this.invalidateTextLayout = false;
                if (this.stringBuilder.length() > 0) {
                    CharSequence replaceEmoji = Emoji.replaceEmoji(this.stringBuilder.toString().toUpperCase(), this.namePaint.getFontMetricsInt(), true);
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
                float f7 = width;
                float dp = f7 / AndroidUtilities.dp(50.0f);
                float f8 = f7 / 2.0f;
                canvas.scale(dp, dp, f8, f8);
                canvas.translate(((f7 - this.textWidth) / 2.0f) - this.textLeft, (f7 - this.textHeight) / 2.0f);
                this.textLayout.draw(canvas);
            }
        } else {
            int intrinsicWidth3 = drawable.getIntrinsicWidth();
            int intrinsicHeight3 = Theme.avatarDrawables[1].getIntrinsicHeight();
            if (intrinsicWidth3 > width - AndroidUtilities.dp(6.0f) || intrinsicHeight3 > width - AndroidUtilities.dp(6.0f)) {
                float dp2 = width / AndroidUtilities.dp(50.0f);
                intrinsicWidth3 = (int) (intrinsicWidth3 * dp2);
                intrinsicHeight3 = (int) (intrinsicHeight3 * dp2);
            }
            int i9 = (width - intrinsicWidth3) / 2;
            int i10 = (width - intrinsicHeight3) / 2;
            Theme.avatarDrawables[1].setBounds(i9, i10, intrinsicWidth3 + i9, intrinsicHeight3 + i10);
            Theme.avatarDrawables[1].draw(canvas);
        }
        canvas.restore();
    }

    public int getAvatarType() {
        return this.avatarType;
    }

    public int getColor() {
        return this.needApplyColorAccent ? Theme.changeColorAccent(this.color) : this.color;
    }

    public int getColor2() {
        return this.needApplyColorAccent ? Theme.changeColorAccent(this.color2) : this.color2;
    }

    public Drawable getCustomIcon() {
        return this.customIconDrawable;
    }

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
    public void setAlpha(int i) {
        this.alpha = i;
    }

    public void setArchivedAvatarHiddenProgress(float f) {
        this.archivedAvatarProgress = f;
    }

    public void setAvatarType(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AvatarDrawable.setAvatarType(int):void");
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

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setCustomIcon(Drawable drawable) {
        this.customIconDrawable = drawable;
    }

    public void setDrawAvatarBackground(boolean z) {
        this.drawAvatarBackground = z;
    }

    public void setIconTranslation(int i, int i2) {
        this.iconTx = i;
        this.iconTy = i2;
    }

    public void setInfo(int i, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            setInfo(i, (TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            setInfo(i, (TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            setInfo(i, (TLRPC.ChatInvite) tLObject);
        }
    }

    public void setInfo(int i, TLRPC.Chat chat) {
        if (chat != null) {
            setInfo(chat.id, chat.title, null, null, chat.color != null ? Integer.valueOf(ChatObject.getColorId(chat)) : null, ChatObject.getPeerColorForAvatar(i, chat));
        }
    }

    public void setInfo(int i, TLRPC.ChatInvite chatInvite) {
        if (chatInvite != null) {
            String str = chatInvite.title;
            TLRPC.Chat chat = chatInvite.chat;
            setInfo(0L, str, null, null, (chat == null || chat.color == null) ? null : Integer.valueOf(ChatObject.getColorId(chat)), ChatObject.getPeerColorForAvatar(i, chatInvite.chat));
        }
    }

    public void setInfo(int i, TLRPC.User user) {
        if (user != null) {
            setInfo(user.id, user.first_name, user.last_name, null, user.color != null ? Integer.valueOf(UserObject.getColorId(user)) : null, UserObject.getPeerColorForAvatar(i, user));
            this.drawDeleted = UserObject.isDeleted(user);
        }
    }

    public void setInfo(long j) {
        this.invalidateTextLayout = true;
        this.hasGradient = true;
        this.hasAdvancedGradient = false;
        this.color = getThemedColor(Theme.keys_avatar_background[getColorIndex(j)]);
        this.color2 = getThemedColor(Theme.keys_avatar_background2[getColorIndex(j)]);
        this.avatarType = 0;
        this.drawDeleted = false;
        getAvatarSymbols("", "", "", this.stringBuilder);
    }

    public void setInfo(long j, String str, String str2) {
        setInfo(j, str, str2, null, null, null);
    }

    public void setInfo(long j, String str, String str2, String str3) {
        setInfo(j, str, str2, str3, null, null);
    }

    public void setInfo(long j, String str, String str2, String str3, Integer num, MessagesController.PeerColor peerColor) {
        setInfo(j, str, str2, str3, num, peerColor, false);
    }

    public void setInfo(long j, String str, String str2, String str3, Integer num, MessagesController.PeerColor peerColor, boolean z) {
        int themedColor;
        GradientTools gradientTools;
        int i;
        int i2;
        int i3;
        int i4;
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
                gradientTools = this.advancedGradient;
                i = iArr[0];
                i2 = iArr[1];
                i3 = iArr[2];
                i4 = iArr[3];
                gradientTools.setColors(i, i2, i3, i4);
            } else {
                this.color = peerColor.getAvatarColor1();
                themedColor = peerColor.getAvatarColor2();
                this.color2 = themedColor;
            }
        } else if (num != null) {
            setPeerColor(num.intValue());
        } else if (z) {
            int[] iArr2 = advancedGradients[getColorIndex(j)];
            gradientTools = this.advancedGradient;
            i = iArr2[0];
            i2 = iArr2[1];
            i3 = iArr2[2];
            i4 = iArr2[3];
            gradientTools.setColors(i, i2, i3, i4);
        } else {
            this.color = getThemedColor(Theme.keys_avatar_background[getColorIndex(j)]);
            themedColor = getThemedColor(Theme.keys_avatar_background2[getColorIndex(j)]);
            this.color2 = themedColor;
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

    public void setInfo(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            setInfo((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            setInfo((TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            setInfo((TLRPC.ChatInvite) tLObject);
        }
    }

    public void setInfo(TLRPC.Chat chat) {
        setInfo(UserConfig.selectedAccount, chat);
    }

    public void setInfo(TLRPC.ChatInvite chatInvite) {
        setInfo(UserConfig.selectedAccount, chatInvite);
    }

    public void setInfo(TLRPC.User user) {
        setInfo(UserConfig.selectedAccount, user);
    }

    public void setPeerColor(int i) {
        int i2;
        GradientTools gradientTools;
        int i3;
        int i4;
        int i5;
        int i6;
        MessagesController.PeerColors peerColors;
        GradientTools gradientTools2 = this.advancedGradient;
        if (gradientTools2 != null) {
            this.hasGradient = false;
            this.hasAdvancedGradient = true;
        } else {
            this.hasGradient = true;
            this.hasAdvancedGradient = false;
        }
        if (i < 14) {
            if (gradientTools2 == null) {
                long j = i;
                this.color = getThemedColor(Theme.keys_avatar_background[getColorIndex(j)]);
                i2 = Theme.keys_avatar_background2[getColorIndex(j)];
                this.color2 = getThemedColor(i2);
                return;
            }
            int[] iArr = advancedGradients[getColorIndex(i)];
            gradientTools = this.advancedGradient;
            i3 = iArr[0];
            i4 = iArr[1];
            i5 = iArr[2];
            i6 = iArr[3];
            gradientTools.setColors(i3, i4, i5, i6);
        }
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        if (messagesController == null || (peerColors = messagesController.peerColors) == null || peerColors.getColor(i) == null) {
            if (this.advancedGradient == null) {
                long j2 = i;
                this.color = getThemedColor(Theme.keys_avatar_background[getColorIndex(j2)]);
                i2 = Theme.keys_avatar_background2[getColorIndex(j2)];
                this.color2 = getThemedColor(i2);
                return;
            }
            int[] iArr2 = advancedGradients[getColorIndex(i)];
            gradientTools = this.advancedGradient;
            i3 = iArr2[0];
            i4 = iArr2[1];
            i5 = iArr2[2];
            i6 = iArr2[3];
            gradientTools.setColors(i3, i4, i5, i6);
        }
        int color1 = messagesController.peerColors.getColor(i).getColor1();
        if (this.advancedGradient == null) {
            this.color = getThemedColor(Theme.keys_avatar_background[getPeerColorIndex(color1)]);
            i2 = Theme.keys_avatar_background2[getPeerColorIndex(color1)];
            this.color2 = getThemedColor(i2);
            return;
        }
        int[] iArr3 = advancedGradients[getPeerColorIndex(color1)];
        gradientTools = this.advancedGradient;
        i3 = iArr3[0];
        i4 = iArr3[1];
        i5 = iArr3[2];
        i6 = iArr3[3];
        gradientTools.setColors(i3, i4, i5, i6);
    }

    public void setProfile(boolean z) {
        this.isProfile = z;
    }

    public void setRoundRadius(int i) {
        this.roundRadius = i;
    }

    public void setScaleSize(float f) {
        this.scaleSize = f;
    }

    public void setText(String str) {
        this.invalidateTextLayout = true;
        this.avatarType = 0;
        this.drawDeleted = false;
        getAvatarSymbols(str, null, null, this.stringBuilder);
    }

    public void setTextSize(int i) {
        this.namePaint.setTextSize(i);
    }
}
