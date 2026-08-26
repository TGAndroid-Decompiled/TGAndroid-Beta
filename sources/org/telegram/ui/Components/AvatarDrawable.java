package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;

public class AvatarDrawable extends Drawable {
    public static final int[][] advancedGradients = {new int[]{-636796, -1090751, -612560, -35006}, new int[]{-693938, -690388, -11246, -22717}, new int[]{-8160001, -5217281, -36183, -1938945}, new int[]{-16133536, -10560448, -4070106, -8331477}, new int[]{-10569989, -14692629, -12191817, -14683687}, new int[]{-11694593, -13910017, -14622003, -15801871}, new int[]{-439392, -304000, -19910, -98718}};
    public GradientTools advancedGradient;
    public int alpha;
    public float archivedAvatarProgress;
    public int avatarType;
    public int color;
    public int color2;
    public Drawable customIconDrawable;
    public boolean drawAvatarBackground;
    public boolean drawDeleted;
    public LinearGradient gradient;
    public int gradientBottom;
    public int gradientColor1;
    public int gradientColor2;
    public boolean hasAdvancedGradient;
    public boolean hasGradient;
    public boolean invalidateTextLayout;
    public boolean isProfile;
    public final TextPaint namePaint;
    public boolean needApplyColorAccent;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean rotate45Background;
    public int roundRadius;
    public float scaleSize;
    public final StringBuilder stringBuilder;
    public float textHeight;
    public StaticLayout textLayout;
    public float textLeft;
    public float textWidth;

    public AvatarDrawable() {
        this((Theme.ResourcesProvider) null);
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
            int iLastIndexOf = str2.lastIndexOf(32);
            if (iLastIndexOf >= 0) {
                str2 = str2.substring(iLastIndexOf + 1);
            }
            sb.append("\u200c");
            sb.append(takeFirstCharacter(str2));
            return;
        }
        if (str == null || str.length() <= 0) {
            return;
        }
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) == ' ' && length != str.length() - 1 && str.charAt(length + 1) != ' ') {
                int length2 = sb.length();
                sb.append("\u200c");
                sb.append(takeFirstCharacter(str.substring(length2)));
                return;
            }
        }
    }

    public static int getColorForId(long j) {
        return Theme.getColor(null, Theme.keys_avatar_background[getColorIndex(j)], false);
    }

    public static int getColorIndex(long j) {
        return (int) Math.abs(j % ((long) Theme.keys_avatar_background.length));
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

    public static String takeFirstCharacter(String str) {
        ArrayList<Emoji.EmojiSpanRange> emojis = Emoji.parseEmojis(str);
        return (emojis == null || emojis.isEmpty() || emojis.get(0).start != 0) ? str.substring(0, str.offsetByCodePoints(0, Math.min(str.codePointCount(0, str.length()), 1))) : str.substring(0, emojis.get(0).end);
    }

    @Override
    public final void draw(Canvas canvas) {
        int iChangeColorAccent;
        Drawable drawable;
        Drawable[] drawableArr;
        Drawable drawable2;
        float fDp;
        float f;
        GradientTools gradientTools;
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        int iWidth = bounds.width();
        TextPaint textPaint = this.namePaint;
        int i = Theme.key_avatar_text;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        textPaint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(i, resourcesProvider), this.alpha));
        Paint paint = Theme.avatar_backgroundPaint;
        if (this.hasAdvancedGradient && (gradientTools = this.advancedGradient) != null) {
            int i2 = bounds.left;
            int i3 = bounds.top;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(i2, i3, i2 + iWidth, i3 + iWidth);
            gradientTools.setBounds(rectF);
            paint = this.advancedGradient.paint;
        } else if (this.hasGradient) {
            int alphaComponent = ColorUtils.setAlphaComponent(getColor(), this.alpha);
            if (this.needApplyColorAccent) {
                int i4 = this.color2;
                Theme.ThemeAccent accent = Theme.currentTheme.getAccent(false);
                iChangeColorAccent = Theme.changeColorAccent(Theme.currentTheme, accent != null ? accent.accentColor : 0, i4);
            } else {
                iChangeColorAccent = this.color2;
            }
            int alphaComponent2 = ColorUtils.setAlphaComponent(iChangeColorAccent, this.alpha);
            if (this.gradient == null || this.gradientBottom != bounds.height() || this.gradientColor1 != alphaComponent || this.gradientColor2 != alphaComponent2) {
                int iHeight = bounds.height();
                this.gradientBottom = iHeight;
                this.gradientColor1 = alphaComponent;
                this.gradientColor2 = alphaComponent2;
                this.gradient = new LinearGradient(0.0f, 0.0f, 0.0f, iHeight, alphaComponent, alphaComponent2, Shader.TileMode.CLAMP);
            }
            paint.setShader(this.gradient);
            paint.setAlpha(this.alpha);
        } else {
            paint.setShader(null);
            paint.setColor(ColorUtils.setAlphaComponent(getColor(), this.alpha));
        }
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        if (this.drawAvatarBackground) {
            if (this.rotate45Background) {
                canvas.save();
                float f2 = iWidth / 2.0f;
                canvas.rotate(-45.0f, f2, f2);
            }
            if (this.roundRadius > 0) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f3 = iWidth;
                rectF2.set(0.0f, 0.0f, f3, f3);
                float f4 = this.roundRadius;
                canvas.drawRoundRect(rectF2, f4, f4, paint);
            } else {
                float f5 = iWidth / 2.0f;
                canvas.drawCircle(f5, f5, f5, paint);
            }
            if (this.rotate45Background) {
                canvas.restore();
            }
        }
        int i5 = this.avatarType;
        if (i5 == 2) {
            if (this.archivedAvatarProgress != 0.0f) {
                int i6 = Theme.key_avatar_backgroundArchived;
                paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(i6, resourcesProvider), this.alpha));
                float f6 = iWidth / 2.0f;
                canvas.drawCircle(f6, f6, this.archivedAvatarProgress * f6, paint);
                if (Theme.dialogs_archiveAvatarDrawableRecolored) {
                    RLottieDrawable rLottieDrawable = Theme.dialogs_archiveAvatarDrawable;
                    rLottieDrawable.applyingLayerColors = true;
                    OKLCH.m(Theme.getColor(null, i6, true), rLottieDrawable.newColorUpdates, "Arrow1", rLottieDrawable);
                    RLottieDrawable rLottieDrawable2 = Theme.dialogs_archiveAvatarDrawable;
                    OKLCH.m(Theme.getColor(null, i6, true), rLottieDrawable2.newColorUpdates, "Arrow2", rLottieDrawable2);
                    Theme.dialogs_archiveAvatarDrawable.commitApplyLayerColors();
                    Theme.dialogs_archiveAvatarDrawableRecolored = false;
                }
            } else if (!Theme.dialogs_archiveAvatarDrawableRecolored) {
                RLottieDrawable rLottieDrawable3 = Theme.dialogs_archiveAvatarDrawable;
                rLottieDrawable3.applyingLayerColors = true;
                OKLCH.m(this.color, rLottieDrawable3.newColorUpdates, "Arrow1", rLottieDrawable3);
                RLottieDrawable rLottieDrawable4 = Theme.dialogs_archiveAvatarDrawable;
                OKLCH.m(this.color, rLottieDrawable4.newColorUpdates, "Arrow2", rLottieDrawable4);
                Theme.dialogs_archiveAvatarDrawable.commitApplyLayerColors();
                Theme.dialogs_archiveAvatarDrawableRecolored = true;
            }
            RLottieDrawable rLottieDrawable5 = Theme.dialogs_archiveAvatarDrawable;
            int i7 = rLottieDrawable5.width;
            int i8 = (iWidth - i7) / 2;
            int i9 = rLottieDrawable5.height;
            int i10 = (iWidth - i9) / 2;
            canvas.save();
            Theme.dialogs_archiveAvatarDrawable.setBounds(i8, i10, i7 + i8, i9 + i10);
            Theme.dialogs_archiveAvatarDrawable.draw(canvas);
            canvas.restore();
        } else if (i5 != 0 || this.customIconDrawable != null) {
            Drawable drawable3 = this.customIconDrawable;
            if (drawable3 == null) {
                if (i5 == 1) {
                    drawable = Theme.avatarDrawables[0];
                } else if (i5 == 4) {
                    drawable = Theme.avatarDrawables[2];
                } else if (i5 == 5) {
                    drawable = Theme.avatarDrawables[3];
                } else if (i5 == 6) {
                    drawable = Theme.avatarDrawables[4];
                } else if (i5 == 7) {
                    drawable = Theme.avatarDrawables[5];
                } else if (i5 == 8) {
                    drawable = Theme.avatarDrawables[6];
                } else if (i5 == 9) {
                    drawable = Theme.avatarDrawables[7];
                } else if (i5 == 10) {
                    drawable = Theme.avatarDrawables[8];
                } else if (i5 == 3) {
                    drawable = Theme.avatarDrawables[10];
                } else if (i5 == 12) {
                    drawable = Theme.avatarDrawables[11];
                } else if (i5 == 14) {
                    drawable = Theme.avatarDrawables[12];
                } else if (i5 == 15) {
                    drawable = Theme.avatarDrawables[13];
                } else if (i5 == 16) {
                    drawable = Theme.avatarDrawables[14];
                } else if (i5 == 19) {
                    drawable = Theme.avatarDrawables[15];
                } else if (i5 == 18) {
                    drawable = Theme.avatarDrawables[16];
                } else if (i5 == 20) {
                    drawable = Theme.avatarDrawables[17];
                } else if (i5 == 21) {
                    drawable = Theme.avatarDrawables[18];
                } else if (i5 == 22) {
                    drawable = Theme.avatarDrawables[19];
                } else if (i5 == 23) {
                    drawable = Theme.avatarDrawables[21];
                } else if (i5 == 24) {
                    drawable = Theme.avatarDrawables[20];
                } else if (i5 == 25) {
                    drawable = Theme.avatarDrawables[22];
                } else if (i5 == 26) {
                    drawable = Theme.avatarDrawables[23];
                } else {
                    drawable = i5 == 27 ? Theme.avatarDrawables[24] : Theme.avatarDrawables[9];
                }
                drawable3 = drawable;
            }
            if (drawable3 != null) {
                int intrinsicWidth = (int) (drawable3.getIntrinsicWidth() * this.scaleSize);
                int intrinsicHeight = (int) (drawable3.getIntrinsicHeight() * this.scaleSize);
                int i11 = (iWidth - intrinsicWidth) / 2;
                int i12 = (iWidth - intrinsicHeight) / 2;
                drawable3.setBounds(i11, i12, intrinsicWidth + i11, intrinsicHeight + i12);
                int i13 = this.alpha;
                if (i13 != 255) {
                    drawable3.setAlpha(i13);
                    drawable3.draw(canvas);
                    drawable3.setAlpha(255);
                } else {
                    drawable3.draw(canvas);
                }
            }
        } else if (!this.drawDeleted || (drawable2 = (drawableArr = Theme.avatarDrawables)[1]) == null) {
            if (this.invalidateTextLayout) {
                this.invalidateTextLayout = false;
                StringBuilder sb = this.stringBuilder;
                if (sb.length() > 0) {
                    CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(sb.toString().toUpperCase(), textPaint.getFontMetricsInt(), true);
                    StaticLayout staticLayout = this.textLayout;
                    if (staticLayout == null || !TextUtils.equals(charSequenceReplaceEmoji, staticLayout.getText())) {
                        try {
                            StaticLayout staticLayout2 = new StaticLayout(charSequenceReplaceEmoji, textPaint, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
                float f7 = iWidth;
                float fDp2 = f7 / AndroidUtilities.dp(50.0f);
                float f8 = f7 / 2.0f;
                canvas.scale(fDp2, fDp2, f8, f8);
                canvas.translate(((f7 - this.textWidth) / 2.0f) - this.textLeft, (f7 - this.textHeight) / 2.0f);
                this.textLayout.draw(canvas);
            }
        } else {
            int intrinsicWidth2 = drawable2.getIntrinsicWidth();
            int intrinsicHeight2 = drawableArr[1].getIntrinsicHeight();
            if (this.isProfile) {
                f = intrinsicWidth2;
                fDp = this.scaleSize;
            } else {
                if (intrinsicWidth2 > iWidth - AndroidUtilities.dp(6.0f) || intrinsicHeight2 > iWidth - AndroidUtilities.dp(6.0f)) {
                    fDp = iWidth / AndroidUtilities.dp(50.0f);
                    f = intrinsicWidth2;
                }
                int i14 = (iWidth - intrinsicWidth2) / 2;
                int i15 = (iWidth - intrinsicHeight2) / 2;
                drawableArr[1].setBounds(i14, i15, intrinsicWidth2 + i14, intrinsicHeight2 + i15);
                drawableArr[1].draw(canvas);
            }
            intrinsicWidth2 = (int) (f * fDp);
            intrinsicHeight2 = (int) (intrinsicHeight2 * fDp);
            int i16 = (iWidth - intrinsicWidth2) / 2;
            int i17 = (iWidth - intrinsicHeight2) / 2;
            drawableArr[1].setBounds(i16, i17, intrinsicWidth2 + i16, intrinsicHeight2 + i17);
            drawableArr[1].draw(canvas);
        }
        canvas.restore();
    }

    public final int getColor() {
        if (!this.needApplyColorAccent) {
            return this.color;
        }
        int i = this.color;
        Theme.ThemeAccent accent = Theme.currentTheme.getAccent(false);
        return Theme.changeColorAccent(Theme.currentTheme, accent != null ? accent.accentColor : 0, i);
    }

    @Override
    public final int getIntrinsicHeight() {
        return 0;
    }

    @Override
    public final int getIntrinsicWidth() {
        return 0;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.alpha = i;
    }

    public final void setAvatarType(int i) {
        this.avatarType = i;
        boolean z = false;
        this.rotate45Background = false;
        this.hasAdvancedGradient = false;
        this.hasGradient = false;
        if (i == 13) {
            int color = Theme.getColor(null, Theme.key_chats_actionBackground, false);
            this.color2 = color;
            this.color = color;
        } else {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (i == 2) {
                int color2 = Theme.getColor(Theme.key_avatar_backgroundArchivedHidden, resourcesProvider);
                this.color2 = color2;
                this.color = color2;
            } else if (i == 27 || i == 12 || i == 1 || i == 14) {
                this.hasGradient = true;
                this.color = Theme.getColor(Theme.key_avatar_backgroundSaved, resourcesProvider);
                this.color2 = Theme.getColor(Theme.key_avatar_background2Saved, resourcesProvider);
            } else if (i == 20) {
                this.rotate45Background = true;
                this.hasGradient = true;
                this.color = Theme.getColor(Theme.key_stories_circle1, resourcesProvider);
                this.color2 = Theme.getColor(Theme.key_stories_circle2, resourcesProvider);
            } else if (i == 3) {
                this.hasGradient = true;
                this.color = Theme.getColor(Theme.keys_avatar_background[getColorIndex(5L)], resourcesProvider);
                this.color2 = Theme.getColor(Theme.keys_avatar_background2[getColorIndex(5L)], resourcesProvider);
            } else if (i == 25) {
                this.hasGradient = true;
                this.color = Theme.getColor(Theme.keys_avatar_background[getColorIndex(2L)], resourcesProvider);
                this.color2 = Theme.getColor(Theme.keys_avatar_background2[getColorIndex(2L)], resourcesProvider);
            } else if (i == 26) {
                this.hasGradient = true;
                this.color = Theme.getColor(Theme.keys_avatar_background[getColorIndex(1L)], resourcesProvider);
                this.color2 = Theme.getColor(Theme.keys_avatar_background2[getColorIndex(1L)], resourcesProvider);
            } else if (i == 4) {
                this.hasGradient = true;
                this.color = Theme.getColor(Theme.keys_avatar_background[getColorIndex(5L)], resourcesProvider);
                this.color2 = Theme.getColor(Theme.keys_avatar_background2[getColorIndex(5L)], resourcesProvider);
            } else if (i == 5) {
                this.hasGradient = true;
                this.color = Theme.getColor(Theme.keys_avatar_background[getColorIndex(4L)], resourcesProvider);
                this.color2 = Theme.getColor(Theme.keys_avatar_background2[getColorIndex(4L)], resourcesProvider);
            } else if (i == 6 || i == 23) {
                this.hasGradient = true;
                this.color = Theme.getColor(Theme.keys_avatar_background[getColorIndex(3L)], resourcesProvider);
                this.color2 = Theme.getColor(Theme.keys_avatar_background2[getColorIndex(3L)], resourcesProvider);
            } else if (i == 7 || i == 24) {
                this.hasGradient = true;
                this.color = Theme.getColor(Theme.keys_avatar_background[getColorIndex(1L)], resourcesProvider);
                this.color2 = Theme.getColor(Theme.keys_avatar_background2[getColorIndex(1L)], resourcesProvider);
            } else if (i == 8) {
                this.hasGradient = true;
                this.color = Theme.getColor(Theme.keys_avatar_background[getColorIndex(0L)], resourcesProvider);
                this.color2 = Theme.getColor(Theme.keys_avatar_background2[getColorIndex(0L)], resourcesProvider);
            } else if (i == 9) {
                this.hasGradient = true;
                this.color = Theme.getColor(Theme.keys_avatar_background[getColorIndex(6L)], resourcesProvider);
                this.color2 = Theme.getColor(Theme.keys_avatar_background2[getColorIndex(6L)], resourcesProvider);
            } else if (i == 10 || i == 17) {
                this.hasGradient = true;
                this.color = Theme.getColor(Theme.keys_avatar_background[getColorIndex(5L)], resourcesProvider);
                this.color2 = Theme.getColor(Theme.keys_avatar_background2[getColorIndex(5L)], resourcesProvider);
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
                this.color = Theme.getColor(Theme.keys_avatar_background[getColorIndex(4L)], resourcesProvider);
                this.color2 = Theme.getColor(Theme.keys_avatar_background2[getColorIndex(4L)], resourcesProvider);
            }
        }
        int i2 = this.avatarType;
        if (i2 != 2 && i2 != 1 && i2 != 20 && i2 != 21 && i2 != 27 && i2 != 12 && i2 != 14) {
            z = true;
        }
        this.needApplyColorAccent = z;
    }

    public final void setColor(int i, int i2) {
        this.hasGradient = true;
        this.hasAdvancedGradient = false;
        this.color = i;
        this.color2 = i2;
        this.needApplyColorAccent = false;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setInfo(TLRPC.User user) {
        setInfo(UserConfig.selectedAccount, user);
    }

    public final void setPeerColor(int i) {
        MessagesController.PeerColors peerColors;
        GradientTools gradientTools = this.advancedGradient;
        if (gradientTools != null) {
            this.hasGradient = false;
            this.hasAdvancedGradient = true;
        } else {
            this.hasGradient = true;
            this.hasAdvancedGradient = false;
        }
        int[][] iArr = advancedGradients;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (i < 14) {
            if (gradientTools != null) {
                int[] iArr2 = iArr[getColorIndex(i)];
                this.advancedGradient.setColors(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                return;
            } else {
                long j = i;
                this.color = Theme.getColor(Theme.keys_avatar_background[getColorIndex(j)], resourcesProvider);
                this.color2 = Theme.getColor(Theme.keys_avatar_background2[getColorIndex(j)], resourcesProvider);
                return;
            }
        }
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        if (messagesController == null || (peerColors = messagesController.peerColors) == null || peerColors.getColor(i) == null) {
            if (this.advancedGradient != null) {
                int[] iArr3 = iArr[getColorIndex(i)];
                this.advancedGradient.setColors(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
                return;
            } else {
                long j2 = i;
                this.color = Theme.getColor(Theme.keys_avatar_background[getColorIndex(j2)], resourcesProvider);
                this.color2 = Theme.getColor(Theme.keys_avatar_background2[getColorIndex(j2)], resourcesProvider);
                return;
            }
        }
        int color1 = messagesController.peerColors.getColor(i).getColor1();
        if (this.advancedGradient != null) {
            int[] iArr4 = iArr[getPeerColorIndex(color1)];
            this.advancedGradient.setColors(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
        } else {
            this.color = Theme.getColor(Theme.keys_avatar_background[getPeerColorIndex(color1)], resourcesProvider);
            this.color2 = Theme.getColor(Theme.keys_avatar_background2[getPeerColorIndex(color1)], resourcesProvider);
        }
    }

    public final void setProfile() {
        this.isProfile = true;
    }

    public AvatarDrawable(TLRPC.Chat chat) {
        this((Theme.ResourcesProvider) null);
        this.isProfile = false;
        setInfo(UserConfig.selectedAccount, chat);
    }

    public final void setInfo(int i, TLRPC.User user) {
        if (user != null) {
            setInfo(user.id, user.first_name, user.last_name, user.color != null ? Integer.valueOf(UserObject.getColorId(user)) : null, UserObject.getPeerColorForAvatar(i, user));
            this.drawDeleted = UserObject.isDeleted(user);
        }
    }

    public AvatarDrawable(TLRPC.User user) {
        this((Theme.ResourcesProvider) null);
        this.isProfile = false;
        if (user != null) {
            setInfo(user.id, user.first_name, user.last_name, null, null);
            this.drawDeleted = UserObject.isDeleted(user);
        }
    }

    public final void setInfo(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            setInfo(UserConfig.selectedAccount, (TLRPC.User) tLObject);
            return;
        }
        if (tLObject instanceof TLRPC.Chat) {
            setInfo(UserConfig.selectedAccount, (TLRPC.Chat) tLObject);
            return;
        }
        if (tLObject instanceof TLRPC.ChatInvite) {
            TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject;
            int i = UserConfig.selectedAccount;
            if (chatInvite != null) {
                String str = chatInvite.title;
                TLRPC.Chat chat = chatInvite.chat;
                setInfo(0L, str, null, (chat == null || chat.color == null) ? null : Integer.valueOf(ChatObject.getColorId(chat)), ChatObject.getPeerColorForAvatar(i, chatInvite.chat));
            }
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
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
    }

    public final void setInfo(int i, TLObject tLObject) {
        TLRPC.ChatInvite chatInvite;
        if (tLObject instanceof TLRPC.User) {
            setInfo(i, (TLRPC.User) tLObject);
            return;
        }
        if (tLObject instanceof TLRPC.Chat) {
            setInfo(i, (TLRPC.Chat) tLObject);
        } else {
            if (!(tLObject instanceof TLRPC.ChatInvite) || (chatInvite = (TLRPC.ChatInvite) tLObject) == null) {
                return;
            }
            String str = chatInvite.title;
            TLRPC.Chat chat = chatInvite.chat;
            setInfo(0L, str, null, (chat == null || chat.color == null) ? null : Integer.valueOf(ChatObject.getColorId(chat)), ChatObject.getPeerColorForAvatar(i, chatInvite.chat));
        }
    }

    public final void setInfo(TLRPC.Chat chat) {
        setInfo(UserConfig.selectedAccount, chat);
    }

    public final void setInfo(int i, TLRPC.Chat chat) {
        if (chat != null) {
            setInfo(chat.id, chat.title, null, chat.color != null ? Integer.valueOf(ChatObject.getColorId(chat)) : null, ChatObject.getPeerColorForAvatar(i, chat));
        }
    }

    public final void setInfo(String str, String str2) {
        setInfo(0L, str, str2, null, null);
    }

    public final void setInfo(long j, String str, String str2, Integer num, MessagesController.PeerColor peerColor) {
        this.invalidateTextLayout = true;
        this.hasGradient = true;
        this.hasAdvancedGradient = false;
        if (peerColor != null) {
            this.color = peerColor.getAvatarColor1();
            this.color2 = peerColor.getAvatarColor2();
        } else if (num != null) {
            setPeerColor(num.intValue());
        } else {
            int i = Theme.keys_avatar_background[getColorIndex(j)];
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            this.color = Theme.getColor(i, resourcesProvider);
            this.color2 = Theme.getColor(Theme.keys_avatar_background2[getColorIndex(j)], resourcesProvider);
        }
        this.needApplyColorAccent = j == 5;
        this.avatarType = 0;
        this.drawDeleted = false;
        if (str == null || str.length() == 0) {
            str = str2;
            str2 = null;
        }
        getAvatarSymbols(str, str2, null, this.stringBuilder);
    }
}
