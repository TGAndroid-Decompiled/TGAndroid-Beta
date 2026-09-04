package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class gp0 extends View {
    public final int f36735a;
    public final boolean f36736b;
    public final boolean f36737c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final Drawable f36738e;
    public final org.telegram.ui.Components.f01 f36739f;
    public final kp0 h;
    public final Paint f36740n;
    public org.telegram.ui.Components.f01 f36741r;
    public int f36742s;
    public boolean v;
    public wp0 f36743w;
    public wp0 f36744x;

    public gp0(int i10, long j3, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        this.f36740n = new Paint(1);
        this.f36742s = -1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
        this.f36735a = i10;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36736b = z10;
        if (z10 && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f36737c = z11;
        this.d = f6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.menu_edit_appearance).mutate();
        this.f36738e = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q6, f6Var), PorterDuff.Mode.SRC_IN));
        if (z10) {
            if (z11) {
                i11 = R.string.ChangeGroupAppearance;
            } else {
                i11 = R.string.ChangeChannelNameColor2;
            }
        } else {
            i11 = R.string.ChangeUserNameColor;
        }
        String string = LocaleController.getString(i11);
        if (z10 && !z11 && MessagesController.getInstance(i10).getMainSettings().getInt("boostingappearance", 0) < 3) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            int i13 = Integer.MAX_VALUE;
            if (peerColors != null) {
                int min = Math.min(Integer.MAX_VALUE, peerColors.maxLevel());
                int max = Math.max(0, messagesController.peerColors.maxLevel());
                int min2 = Math.min(min, messagesController.peerColors.minLevel());
                int max2 = Math.max(max, messagesController.peerColors.minLevel());
                i13 = min2;
                i12 = max2;
            } else {
                i12 = 0;
            }
            int min3 = Math.min(i13, messagesController.channelBgIconLevelMin);
            int min4 = Math.min(i12, messagesController.channelBgIconLevelMin);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            if (peerColors2 != null) {
                int min5 = Math.min(min3, peerColors2.maxLevel());
                int max3 = Math.max(min4, messagesController.profilePeerColors.maxLevel());
                min3 = Math.min(min5, messagesController.profilePeerColors.minLevel());
                min4 = Math.max(max3, messagesController.profilePeerColors.minLevel());
            }
            int min6 = Math.min(min3, messagesController.channelProfileIconLevelMin);
            int max4 = Math.max(min4, messagesController.channelProfileIconLevelMin);
            int min7 = Math.min(min6, messagesController.channelEmojiStatusLevelMin);
            int max5 = Math.max(max4, messagesController.channelEmojiStatusLevelMin);
            int min8 = Math.min(min7, messagesController.channelWallpaperLevelMin);
            int max6 = Math.max(max5, messagesController.channelWallpaperLevelMin);
            int min9 = Math.min(min8, messagesController.channelCustomWallpaperLevelMin);
            int max7 = Math.max(max6, messagesController.channelCustomWallpaperLevelMin);
            int i14 = chat != null ? chat.level : 0;
            if (i14 < max7) {
                this.h = new kp0(Math.max(i14, min9), context, f6Var, true);
            }
        }
        setContentDescription(string);
        this.f36739f = new org.telegram.ui.Components.f01(string, 16.0f, null);
        a();
    }

    public final void a() {
        int i10;
        int i11;
        Paint paint;
        int i12;
        boolean z10 = this.f36736b;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.j6.f20827m6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.q6;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        this.f36738e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
        if (z10) {
            i11 = org.telegram.ui.ActionBar.j6.G6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.q6;
        }
        this.f36739f.o(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (this.f36741r != null && (paint = this.f36740n) != null && (i12 = this.f36742s) != -1) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
            this.f36741r.o(v02);
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, v02));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        float dp;
        int dp2;
        int B;
        int measuredWidth;
        int B2;
        int measuredWidth2;
        Paint paint;
        float dp3;
        int measuredWidth3;
        int dp4 = AndroidUtilities.dp(28.0f);
        if (LocaleController.isRTL) {
            dp4 = getMeasuredWidth() - dp4;
        }
        Drawable drawable = this.f36738e;
        yf.p.d(drawable, dp4, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth4 = getMeasuredWidth() - AndroidUtilities.dp(171.0f);
        int i11 = 0;
        kp0 kp0Var = this.h;
        if (kp0Var != null) {
            i10 = AndroidUtilities.dp(8.0f) + kp0Var.getIntrinsicWidth();
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.f01 f01Var = this.f36739f;
        f01Var.f25858p = measuredWidth4 - i10;
        if (LocaleController.isRTL) {
            dp = (getMeasuredWidth() - f01Var.l()) - AndroidUtilities.dp(58.0f);
        } else {
            dp = AndroidUtilities.dp(58.0f);
        }
        f01Var.e(canvas, dp, getMeasuredHeight() / 2.0f);
        if (kp0Var != null) {
            int l4 = (int) (f01Var.l() + dp + AndroidUtilities.dp(6.0f));
            kp0Var.setBounds(l4, 0, l4, getHeight());
            kp0Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        boolean z10 = this.f36737c;
        if (z10 && this.f36744x != null) {
            if (LocaleController.isRTL) {
                measuredWidth3 = AndroidUtilities.dp(58.0f);
            } else {
                measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            }
            this.f36744x.setBounds(measuredWidth3 - AndroidUtilities.dp(11.0f), org.telegram.messenger.wl.y(11.0f, getMeasuredHeight(), 2), measuredWidth3, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.f36744x.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var));
            this.f36744x.draw(canvas);
        } else if (this.f36743w != null && this.f36744x != null) {
            if (LocaleController.isRTL) {
                measuredWidth2 = AndroidUtilities.dp(58.0f);
            } else {
                measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            }
            this.f36744x.setBounds(measuredWidth2 - AndroidUtilities.dp(11.0f), org.telegram.messenger.wl.y(11.0f, getMeasuredHeight(), 2), measuredWidth2, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            wp0 wp0Var = this.f36744x;
            float dpf2 = AndroidUtilities.dpf2(3.0f);
            int i12 = org.telegram.ui.ActionBar.j6.f20663d6;
            wp0Var.f(dpf2, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
            this.f36744x.draw(canvas);
            int dp5 = measuredWidth2 - AndroidUtilities.dp(18.0f);
            this.f36743w.setBounds(dp5 - AndroidUtilities.dp(11.0f), org.telegram.messenger.wl.y(11.0f, getMeasuredHeight(), 2), dp5, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.f36743w.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
            this.f36743w.draw(canvas);
        } else if (this.f36741r != null && !z10) {
            float measuredWidth5 = getMeasuredWidth() - AndroidUtilities.dp(116.0f);
            float l10 = f01Var.l();
            if (kp0Var == null) {
                dp2 = 0;
            } else {
                dp2 = AndroidUtilities.dp(12.0f) + kp0Var.getIntrinsicWidth();
            }
            float min = (int) (measuredWidth5 - Math.min(l10 + dp2, getMeasuredWidth() - AndroidUtilities.dp(164.0f)));
            int min2 = (int) Math.min(this.f36741r.l(), min);
            RectF rectF = AndroidUtilities.rectTmp;
            if (LocaleController.isRTL) {
                B = AndroidUtilities.dp(15.0f);
            } else {
                B = org.telegram.messenger.w1.B(33.0f, getMeasuredWidth(), min2);
            }
            float f7 = B;
            float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(22.0f)) / 2.0f;
            if (LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(33.0f) + min2;
            } else {
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(15.0f);
            }
            rectF.set(f7, measuredHeight, measuredWidth, (AndroidUtilities.dp(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f36740n);
            org.telegram.ui.Components.f01 f01Var2 = this.f36741r;
            f01Var2.f25858p = min;
            if (LocaleController.isRTL) {
                B2 = AndroidUtilities.dp(24.0f);
            } else {
                B2 = org.telegram.messenger.w1.B(24.0f, getMeasuredWidth(), min2);
            }
            f01Var2.e(canvas, B2, getMeasuredHeight() / 2.0f);
        }
        if (this.v) {
            if (f6Var != null) {
                paint = f6Var.G("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.j6.f20785k0;
            }
            Paint paint2 = paint;
            if (LocaleController.isRTL) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(58.0f);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth6 = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i11 = AndroidUtilities.dp(58.0f);
            }
            canvas.drawLine(dp3, measuredHeight2, measuredWidth6 - i11, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void set(TLRPC.User user) {
        String trim;
        wp0 wp0Var;
        int v02;
        boolean q6;
        int i10;
        ArrayList<Integer> arrayList;
        int i11;
        int i12;
        if (user == null) {
            return;
        }
        String str = user.first_name;
        if (str == null) {
            trim = "";
        } else {
            trim = str.trim();
        }
        int indexOf = trim.indexOf(" ");
        if (indexOf > 0) {
            trim = trim.substring(0, indexOf);
        }
        this.f36741r = new org.telegram.ui.Components.f01(Emoji.replaceEmoji(trim, org.telegram.ui.ActionBar.j6.f20858o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
        wp0 wp0Var2 = this.f36743w;
        MessagesController.PeerColor peerColor = null;
        if (wp0Var2 != null) {
            wp0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i13 = this.f36735a;
        if (z10) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i14 = wp0.f42448j;
            int i15 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.f36743w = new wp0(tL_emojiStatusCollectible.document_id, i15, i15, i15);
        } else {
            if (UserObject.getProfileColorId(user) >= 0) {
                wp0Var = wp0.c(i13, UserObject.getProfileColorId(user));
                wp0Var.f42449a = AndroidUtilities.dp(11.0f);
                wp0Var.d();
            } else {
                wp0Var = null;
            }
            this.f36743w = wp0Var;
        }
        wp0 wp0Var3 = this.f36743w;
        if (wp0Var3 != null) {
            wp0Var3.e(this);
        }
        TLRPC.PeerColor peerColor2 = user.color;
        boolean z11 = peerColor2 instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.f36740n;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z11) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor2;
            if (f6Var != null) {
                q6 = f6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.j6.I.q();
            }
            if (q6 && (tL_peerColorCollectible.flags & 1) != 0) {
                i10 = tL_peerColorCollectible.dark_accent_color;
            } else {
                i10 = tL_peerColorCollectible.accent_color;
            }
            if (!q6 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                arrayList = tL_peerColorCollectible.colors;
            }
            int intValue = arrayList.get(0).intValue() | (-16777216);
            if (arrayList.size() >= 2) {
                i11 = arrayList.get(1).intValue() | (-16777216);
            } else {
                i11 = intValue;
            }
            if (arrayList.size() >= 3) {
                i12 = arrayList.get(2).intValue() | (-16777216);
            } else {
                i12 = intValue;
            }
            this.f36741r.o(i10);
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i10));
            wp0 wp0Var4 = new wp0(tL_peerColorCollectible.gift_emoji_id, intValue, i11, i12);
            wp0Var4.f42449a = AndroidUtilities.dp(11.0f);
            wp0Var4.d();
            this.f36744x = wp0Var4;
            wp0Var4.e(this);
            return;
        }
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            int i16 = org.telegram.ui.ActionBar.j6.f20918r8[colorId];
            this.f36742s = i16;
            v02 = org.telegram.ui.ActionBar.j6.v0(i16, f6Var);
        } else {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
            if (peerColors != null) {
                peerColor = peerColors.getColor(colorId);
            }
            if (peerColor != null) {
                this.f36742s = -1;
                v02 = peerColor.getColor1();
            } else {
                int i17 = org.telegram.ui.ActionBar.j6.f20918r8[0];
                this.f36742s = i17;
                v02 = org.telegram.ui.ActionBar.j6.v0(i17, f6Var);
            }
        }
        this.f36741r.o(v02);
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, v02));
        wp0 a2 = wp0.a(i13, colorId);
        a2.f42449a = AndroidUtilities.dp(11.0f);
        a2.d();
        this.f36744x = a2;
    }
}
