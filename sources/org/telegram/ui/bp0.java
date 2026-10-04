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
public final class bp0 extends View {
    public final int f35164a;
    public final boolean f35165b;
    public final boolean f35166c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final Drawable f35167e;
    public final org.telegram.ui.Components.e11 f35168f;
    public final fp0 h;
    public final Paint f35169n;
    public org.telegram.ui.Components.e11 f35170r;
    public int f35171s;
    public boolean v;
    public rp0 f35172w;
    public rp0 f35173x;

    public bp0(int i10, long j3, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        this.f35169n = new Paint(1);
        this.f35171s = -1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
        this.f35164a = i10;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35165b = z10;
        if (z10 && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f35166c = z11;
        this.d = d6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.menu_edit_appearance).mutate();
        this.f35167e = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.q6, d6Var), PorterDuff.Mode.SRC_IN));
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
                this.h = new fp0(Math.max(i14, min9), context, d6Var, true);
            }
        }
        setContentDescription(string);
        this.f35168f = new org.telegram.ui.Components.e11(string, 16.0f, null);
        a();
    }

    public final void a() {
        int i10;
        int i11;
        Paint paint;
        int i12;
        boolean z10 = this.f35165b;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.i6.f20988m6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.q6;
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        this.f35167e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), PorterDuff.Mode.SRC_IN));
        if (z10) {
            i11 = org.telegram.ui.ActionBar.i6.G6;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.q6;
        }
        this.f35168f.o(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        if (this.f35170r != null && (paint = this.f35169n) != null && (i12 = this.f35171s) != -1) {
            int v02 = org.telegram.ui.ActionBar.i6.v0(i12, d6Var);
            this.f35170r.o(v02);
            paint.setColor(org.telegram.ui.ActionBar.i6.l1(0.1f, v02));
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
        Drawable drawable = this.f35167e;
        yf.p.d(drawable, dp4, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth4 = getMeasuredWidth() - AndroidUtilities.dp(171.0f);
        int i11 = 0;
        fp0 fp0Var = this.h;
        if (fp0Var != null) {
            i10 = AndroidUtilities.dp(8.0f) + fp0Var.getIntrinsicWidth();
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.e11 e11Var = this.f35168f;
        e11Var.f25895p = measuredWidth4 - i10;
        if (LocaleController.isRTL) {
            dp = (getMeasuredWidth() - e11Var.l()) - AndroidUtilities.dp(58.0f);
        } else {
            dp = AndroidUtilities.dp(58.0f);
        }
        e11Var.e(canvas, dp, getMeasuredHeight() / 2.0f);
        if (fp0Var != null) {
            int l4 = (int) (e11Var.l() + dp + AndroidUtilities.dp(6.0f));
            fp0Var.setBounds(l4, 0, l4, getHeight());
            fp0Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        boolean z10 = this.f35166c;
        if (z10 && this.f35173x != null) {
            if (LocaleController.isRTL) {
                measuredWidth3 = AndroidUtilities.dp(58.0f);
            } else {
                measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            }
            this.f35173x.setBounds(measuredWidth3 - AndroidUtilities.dp(11.0f), org.telegram.messenger.bi.z(11.0f, getMeasuredHeight(), 2), measuredWidth3, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.f35173x.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20822d6, d6Var));
            this.f35173x.draw(canvas);
        } else if (this.f35172w != null && this.f35173x != null) {
            if (LocaleController.isRTL) {
                measuredWidth2 = AndroidUtilities.dp(58.0f);
            } else {
                measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            }
            this.f35173x.setBounds(measuredWidth2 - AndroidUtilities.dp(11.0f), org.telegram.messenger.bi.z(11.0f, getMeasuredHeight(), 2), measuredWidth2, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            rp0 rp0Var = this.f35173x;
            float dpf2 = AndroidUtilities.dpf2(3.0f);
            int i12 = org.telegram.ui.ActionBar.i6.f20822d6;
            rp0Var.f(dpf2, org.telegram.ui.ActionBar.i6.v0(i12, d6Var));
            this.f35173x.draw(canvas);
            int dp5 = measuredWidth2 - AndroidUtilities.dp(18.0f);
            this.f35172w.setBounds(dp5 - AndroidUtilities.dp(11.0f), org.telegram.messenger.bi.z(11.0f, getMeasuredHeight(), 2), dp5, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.f35172w.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.i6.v0(i12, d6Var));
            this.f35172w.draw(canvas);
        } else if (this.f35170r != null && !z10) {
            float measuredWidth5 = getMeasuredWidth() - AndroidUtilities.dp(116.0f);
            float l10 = e11Var.l();
            if (fp0Var == null) {
                dp2 = 0;
            } else {
                dp2 = AndroidUtilities.dp(12.0f) + fp0Var.getIntrinsicWidth();
            }
            float min = (int) (measuredWidth5 - Math.min(l10 + dp2, getMeasuredWidth() - AndroidUtilities.dp(164.0f)));
            int min2 = (int) Math.min(this.f35170r.l(), min);
            RectF rectF = AndroidUtilities.rectTmp;
            if (LocaleController.isRTL) {
                B = AndroidUtilities.dp(15.0f);
            } else {
                B = org.telegram.messenger.q.B(33.0f, getMeasuredWidth(), min2);
            }
            float f7 = B;
            float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(22.0f)) / 2.0f;
            if (LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(33.0f) + min2;
            } else {
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(15.0f);
            }
            rectF.set(f7, measuredHeight, measuredWidth, (AndroidUtilities.dp(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f35169n);
            org.telegram.ui.Components.e11 e11Var2 = this.f35170r;
            e11Var2.f25895p = min;
            if (LocaleController.isRTL) {
                B2 = AndroidUtilities.dp(24.0f);
            } else {
                B2 = org.telegram.messenger.q.B(24.0f, getMeasuredWidth(), min2);
            }
            e11Var2.e(canvas, B2, getMeasuredHeight() / 2.0f);
        }
        if (this.v) {
            if (d6Var != null) {
                paint = d6Var.H("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.i6.f20945k0;
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
        rp0 rp0Var;
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
        this.f35170r = new org.telegram.ui.Components.e11(Emoji.replaceEmoji(trim, org.telegram.ui.ActionBar.i6.f21021o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
        rp0 rp0Var2 = this.f35172w;
        MessagesController.PeerColor peerColor = null;
        if (rp0Var2 != null) {
            rp0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i13 = this.f35164a;
        if (z10) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i14 = rp0.f40177j;
            int i15 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.f35172w = new rp0(tL_emojiStatusCollectible.document_id, i15, i15, i15);
        } else {
            if (UserObject.getProfileColorId(user) >= 0) {
                rp0Var = rp0.c(i13, UserObject.getProfileColorId(user));
                rp0Var.f40178a = AndroidUtilities.dp(11.0f);
                rp0Var.d();
            } else {
                rp0Var = null;
            }
            this.f35172w = rp0Var;
        }
        rp0 rp0Var3 = this.f35172w;
        if (rp0Var3 != null) {
            rp0Var3.e(this);
        }
        TLRPC.PeerColor peerColor2 = user.color;
        boolean z11 = peerColor2 instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.f35169n;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        if (z11) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor2;
            if (d6Var != null) {
                q6 = d6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.i6.I.q();
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
            this.f35170r.o(i10);
            paint.setColor(org.telegram.ui.ActionBar.i6.l1(0.1f, i10));
            rp0 rp0Var4 = new rp0(tL_peerColorCollectible.gift_emoji_id, intValue, i11, i12);
            rp0Var4.f40178a = AndroidUtilities.dp(11.0f);
            rp0Var4.d();
            this.f35173x = rp0Var4;
            rp0Var4.e(this);
            return;
        }
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            int i16 = org.telegram.ui.ActionBar.i6.f21084r8[colorId];
            this.f35171s = i16;
            v02 = org.telegram.ui.ActionBar.i6.v0(i16, d6Var);
        } else {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
            if (peerColors != null) {
                peerColor = peerColors.getColor(colorId);
            }
            if (peerColor != null) {
                this.f35171s = -1;
                v02 = peerColor.getColor1();
            } else {
                int i17 = org.telegram.ui.ActionBar.i6.f21084r8[0];
                this.f35171s = i17;
                v02 = org.telegram.ui.ActionBar.i6.v0(i17, d6Var);
            }
        }
        this.f35170r.o(v02);
        paint.setColor(org.telegram.ui.ActionBar.i6.l1(0.1f, v02));
        rp0 a2 = rp0.a(i13, colorId);
        a2.f40178a = AndroidUtilities.dp(11.0f);
        a2.d();
        this.f35173x = a2;
    }
}
