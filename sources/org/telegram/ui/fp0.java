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
public final class fp0 extends View {
    public final int f32875a;
    public final boolean f32876b;
    public final boolean f32877c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final Drawable e;
    public final org.telegram.ui.Components.t01 f32878f;
    public final jp0 h;
    public final Paint f32879n;
    public org.telegram.ui.Components.t01 f32880r;
    public int f32881s;
    public boolean v;
    public vp0 f32882w;
    public vp0 f32883x;

    public fp0(int i10, long j3, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        this.f32879n = new Paint(1);
        this.f32881s = -1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
        this.f32875a = i10;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32876b = z10;
        if (z10 && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32877c = z11;
        this.d = f6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.menu_edit_appearance).mutate();
        this.e = mutate;
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
                this.h = new jp0(Math.max(i14, min9), context, f6Var, true);
            }
        }
        setContentDescription(string);
        this.f32878f = new org.telegram.ui.Components.t01(string, 16.0f, null);
        a();
    }

    public final void a() {
        int i10;
        int i11;
        Paint paint;
        int i12;
        boolean z10 = this.f32876b;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.j6.f18091m6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.q6;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        this.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
        if (z10) {
            i11 = org.telegram.ui.ActionBar.j6.G6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.q6;
        }
        this.f32878f.o(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (this.f32880r != null && (paint = this.f32879n) != null && (i12 = this.f32881s) != -1) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
            this.f32880r.o(v02);
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
        Drawable drawable = this.e;
        xf.p.d(drawable, dp4, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth4 = getMeasuredWidth() - AndroidUtilities.dp(171.0f);
        int i11 = 0;
        jp0 jp0Var = this.h;
        if (jp0Var != null) {
            i10 = AndroidUtilities.dp(8.0f) + jp0Var.getIntrinsicWidth();
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.t01 t01Var = this.f32878f;
        t01Var.f27257p = measuredWidth4 - i10;
        if (LocaleController.isRTL) {
            dp = (getMeasuredWidth() - t01Var.l()) - AndroidUtilities.dp(58.0f);
        } else {
            dp = AndroidUtilities.dp(58.0f);
        }
        t01Var.e(canvas, dp, getMeasuredHeight() / 2.0f);
        if (jp0Var != null) {
            int l4 = (int) (t01Var.l() + dp + AndroidUtilities.dp(6.0f));
            jp0Var.setBounds(l4, 0, l4, getHeight());
            jp0Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        boolean z10 = this.f32877c;
        if (z10 && this.f32883x != null) {
            if (LocaleController.isRTL) {
                measuredWidth3 = AndroidUtilities.dp(58.0f);
            } else {
                measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            }
            this.f32883x.setBounds(measuredWidth3 - AndroidUtilities.dp(11.0f), org.telegram.messenger.em.y(11.0f, getMeasuredHeight(), 2), measuredWidth3, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.f32883x.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var));
            this.f32883x.draw(canvas);
        } else if (this.f32882w != null && this.f32883x != null) {
            if (LocaleController.isRTL) {
                measuredWidth2 = AndroidUtilities.dp(58.0f);
            } else {
                measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            }
            this.f32883x.setBounds(measuredWidth2 - AndroidUtilities.dp(11.0f), org.telegram.messenger.em.y(11.0f, getMeasuredHeight(), 2), measuredWidth2, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            vp0 vp0Var = this.f32883x;
            float dpf2 = AndroidUtilities.dpf2(3.0f);
            int i12 = org.telegram.ui.ActionBar.j6.f17928d6;
            vp0Var.f(dpf2, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
            this.f32883x.draw(canvas);
            int dp5 = measuredWidth2 - AndroidUtilities.dp(18.0f);
            this.f32882w.setBounds(dp5 - AndroidUtilities.dp(11.0f), org.telegram.messenger.em.y(11.0f, getMeasuredHeight(), 2), dp5, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.f32882w.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
            this.f32882w.draw(canvas);
        } else if (this.f32880r != null && !z10) {
            float measuredWidth5 = getMeasuredWidth() - AndroidUtilities.dp(116.0f);
            float l10 = t01Var.l();
            if (jp0Var == null) {
                dp2 = 0;
            } else {
                dp2 = AndroidUtilities.dp(12.0f) + jp0Var.getIntrinsicWidth();
            }
            float min = (int) (measuredWidth5 - Math.min(l10 + dp2, getMeasuredWidth() - AndroidUtilities.dp(164.0f)));
            int min2 = (int) Math.min(this.f32880r.l(), min);
            RectF rectF = AndroidUtilities.rectTmp;
            if (LocaleController.isRTL) {
                B = AndroidUtilities.dp(15.0f);
            } else {
                B = org.telegram.messenger.a2.B(33.0f, getMeasuredWidth(), min2);
            }
            float f7 = B;
            float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(22.0f)) / 2.0f;
            if (LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(33.0f) + min2;
            } else {
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(15.0f);
            }
            rectF.set(f7, measuredHeight, measuredWidth, (AndroidUtilities.dp(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f32879n);
            org.telegram.ui.Components.t01 t01Var2 = this.f32880r;
            t01Var2.f27257p = min;
            if (LocaleController.isRTL) {
                B2 = AndroidUtilities.dp(24.0f);
            } else {
                B2 = org.telegram.messenger.a2.B(24.0f, getMeasuredWidth(), min2);
            }
            t01Var2.e(canvas, B2, getMeasuredHeight() / 2.0f);
        }
        if (this.v) {
            if (f6Var != null) {
                paint = f6Var.F("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.j6.f18049k0;
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
        vp0 vp0Var;
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
        this.f32880r = new org.telegram.ui.Components.t01(Emoji.replaceEmoji(trim, org.telegram.ui.ActionBar.j6.f18122o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
        vp0 vp0Var2 = this.f32882w;
        MessagesController.PeerColor peerColor = null;
        if (vp0Var2 != null) {
            vp0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i13 = this.f32875a;
        if (z10) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i14 = vp0.f37598j;
            int i15 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.f32882w = new vp0(tL_emojiStatusCollectible.document_id, i15, i15, i15);
        } else {
            if (UserObject.getProfileColorId(user) >= 0) {
                vp0Var = vp0.c(i13, UserObject.getProfileColorId(user));
                vp0Var.f37599a = AndroidUtilities.dp(11.0f);
                vp0Var.d();
            } else {
                vp0Var = null;
            }
            this.f32882w = vp0Var;
        }
        vp0 vp0Var3 = this.f32882w;
        if (vp0Var3 != null) {
            vp0Var3.e(this);
        }
        TLRPC.PeerColor peerColor2 = user.color;
        boolean z11 = peerColor2 instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.f32879n;
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
            this.f32880r.o(i10);
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i10));
            vp0 vp0Var4 = new vp0(tL_peerColorCollectible.gift_emoji_id, intValue, i11, i12);
            vp0Var4.f37599a = AndroidUtilities.dp(11.0f);
            vp0Var4.d();
            this.f32883x = vp0Var4;
            vp0Var4.e(this);
            return;
        }
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            int i16 = org.telegram.ui.ActionBar.j6.f18182r8[colorId];
            this.f32881s = i16;
            v02 = org.telegram.ui.ActionBar.j6.v0(i16, f6Var);
        } else {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
            if (peerColors != null) {
                peerColor = peerColors.getColor(colorId);
            }
            if (peerColor != null) {
                this.f32881s = -1;
                v02 = peerColor.getColor1();
            } else {
                int i17 = org.telegram.ui.ActionBar.j6.f18182r8[0];
                this.f32881s = i17;
                v02 = org.telegram.ui.ActionBar.j6.v0(i17, f6Var);
            }
        }
        this.f32880r.o(v02);
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, v02));
        vp0 a2 = vp0.a(i13, colorId);
        a2.f37599a = AndroidUtilities.dp(11.0f);
        a2.d();
        this.f32883x = a2;
    }
}
