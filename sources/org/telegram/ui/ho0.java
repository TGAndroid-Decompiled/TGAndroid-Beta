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
public final class ho0 extends View {
    public final int f38871a;
    public final boolean f38872b;
    public final boolean f38873c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final Drawable f38874e;
    public final org.telegram.ui.Components.nz0 f38875f;
    public final lo0 h;
    public final Paint f38876n;
    public org.telegram.ui.Components.nz0 f38877r;
    public int f38878s;
    public boolean v;
    public vo0 f38879w;
    public vo0 f38880x;

    public ho0(int i9, long j10, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        this.f38876n = new Paint(1);
        this.f38878s = -1;
        MessagesController messagesController = MessagesController.getInstance(i9);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        this.f38871a = i9;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38872b = z10;
        if (z10 && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f38873c = z11;
        this.d = b6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.menu_edit_appearance).mutate();
        this.f38874e = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23229q6, b6Var), PorterDuff.Mode.SRC_IN));
        if (z10) {
            if (z11) {
                i10 = R.string.ChangeGroupAppearance;
            } else {
                i10 = R.string.ChangeChannelNameColor2;
            }
        } else {
            i10 = R.string.ChangeUserNameColor;
        }
        String string = LocaleController.getString(i10);
        if (z10 && !z11 && MessagesController.getInstance(i9).getMainSettings().getInt("boostingappearance", 0) < 3) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            int i12 = Integer.MAX_VALUE;
            if (peerColors != null) {
                int min = Math.min(Integer.MAX_VALUE, peerColors.maxLevel());
                int max = Math.max(0, messagesController.peerColors.maxLevel());
                int min2 = Math.min(min, messagesController.peerColors.minLevel());
                int max2 = Math.max(max, messagesController.peerColors.minLevel());
                i12 = min2;
                i11 = max2;
            } else {
                i11 = 0;
            }
            int min3 = Math.min(i12, messagesController.channelBgIconLevelMin);
            int min4 = Math.min(i11, messagesController.channelBgIconLevelMin);
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
            int i13 = chat != null ? chat.level : 0;
            if (i13 < max7) {
                this.h = new lo0(Math.max(i13, min9), context, b6Var, true);
            }
        }
        setContentDescription(string);
        this.f38875f = new org.telegram.ui.Components.nz0(string, 16.0f, null);
        a();
    }

    public final void a() {
        int i9;
        int i10;
        Paint paint;
        int i11;
        boolean z10 = this.f38872b;
        if (z10) {
            i9 = org.telegram.ui.ActionBar.f6.f23162m6;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.f23229q6;
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        this.f38874e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), PorterDuff.Mode.SRC_IN));
        if (z10) {
            i10 = org.telegram.ui.ActionBar.f6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.f6.f23229q6;
        }
        this.f38875f.o(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        if (this.f38877r != null && (paint = this.f38876n) != null && (i11 = this.f38878s) != -1) {
            int v02 = org.telegram.ui.ActionBar.f6.v0(i11, b6Var);
            this.f38877r.o(v02);
            paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.1f, v02));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i9;
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
        Drawable drawable = this.f38874e;
        ff.s.d(drawable, dp4, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth4 = getMeasuredWidth() - AndroidUtilities.dp(171.0f);
        int i10 = 0;
        lo0 lo0Var = this.h;
        if (lo0Var != null) {
            i9 = AndroidUtilities.dp(8.0f) + lo0Var.getIntrinsicWidth();
        } else {
            i9 = 0;
        }
        org.telegram.ui.Components.nz0 nz0Var = this.f38875f;
        nz0Var.f31234p = measuredWidth4 - i9;
        if (LocaleController.isRTL) {
            dp = (getMeasuredWidth() - nz0Var.l()) - AndroidUtilities.dp(58.0f);
        } else {
            dp = AndroidUtilities.dp(58.0f);
        }
        nz0Var.e(canvas, dp, getMeasuredHeight() / 2.0f);
        if (lo0Var != null) {
            int l10 = (int) (nz0Var.l() + dp + AndroidUtilities.dp(6.0f));
            lo0Var.setBounds(l10, 0, l10, getHeight());
            lo0Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        boolean z10 = this.f38873c;
        if (z10 && this.f38880x != null) {
            if (LocaleController.isRTL) {
                measuredWidth3 = AndroidUtilities.dp(58.0f);
            } else {
                measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            }
            this.f38880x.setBounds(measuredWidth3 - AndroidUtilities.dp(11.0f), org.telegram.messenger.ll.y(11.0f, getMeasuredHeight(), 2), measuredWidth3, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.f38880x.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var));
            this.f38880x.draw(canvas);
        } else if (this.f38879w != null && this.f38880x != null) {
            if (LocaleController.isRTL) {
                measuredWidth2 = AndroidUtilities.dp(58.0f);
            } else {
                measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            }
            this.f38880x.setBounds(measuredWidth2 - AndroidUtilities.dp(11.0f), org.telegram.messenger.ll.y(11.0f, getMeasuredHeight(), 2), measuredWidth2, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            vo0 vo0Var = this.f38880x;
            float dpf2 = AndroidUtilities.dpf2(3.0f);
            int i11 = org.telegram.ui.ActionBar.f6.f23001d6;
            vo0Var.f(dpf2, org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
            this.f38880x.draw(canvas);
            int dp5 = measuredWidth2 - AndroidUtilities.dp(18.0f);
            this.f38879w.setBounds(dp5 - AndroidUtilities.dp(11.0f), org.telegram.messenger.ll.y(11.0f, getMeasuredHeight(), 2), dp5, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.f38879w.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
            this.f38879w.draw(canvas);
        } else if (this.f38877r != null && !z10) {
            float measuredWidth5 = getMeasuredWidth() - AndroidUtilities.dp(116.0f);
            float l11 = nz0Var.l();
            if (lo0Var == null) {
                dp2 = 0;
            } else {
                dp2 = AndroidUtilities.dp(12.0f) + lo0Var.getIntrinsicWidth();
            }
            float min = (int) (measuredWidth5 - Math.min(l11 + dp2, getMeasuredWidth() - AndroidUtilities.dp(164.0f)));
            int min2 = (int) Math.min(this.f38877r.l(), min);
            RectF rectF = AndroidUtilities.rectTmp;
            if (LocaleController.isRTL) {
                B = AndroidUtilities.dp(15.0f);
            } else {
                B = org.telegram.messenger.l0.B(33.0f, getMeasuredWidth(), min2);
            }
            float f10 = B;
            float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(22.0f)) / 2.0f;
            if (LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(33.0f) + min2;
            } else {
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(15.0f);
            }
            rectF.set(f10, measuredHeight, measuredWidth, (AndroidUtilities.dp(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f38876n);
            org.telegram.ui.Components.nz0 nz0Var2 = this.f38877r;
            nz0Var2.f31234p = min;
            if (LocaleController.isRTL) {
                B2 = AndroidUtilities.dp(24.0f);
            } else {
                B2 = org.telegram.messenger.l0.B(24.0f, getMeasuredWidth(), min2);
            }
            nz0Var2.e(canvas, B2, getMeasuredHeight() / 2.0f);
        }
        if (this.v) {
            if (b6Var != null) {
                paint = b6Var.O("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.f6.f23121k0;
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
                i10 = AndroidUtilities.dp(58.0f);
            }
            canvas.drawLine(dp3, measuredHeight2, measuredWidth6 - i10, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void set(TLRPC.User user) {
        String trim;
        vo0 vo0Var;
        int v02;
        boolean q10;
        int i9;
        ArrayList<Integer> arrayList;
        int i10;
        int i11;
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
        this.f38877r = new org.telegram.ui.Components.nz0(Emoji.replaceEmoji(trim, org.telegram.ui.ActionBar.f6.f23193o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
        vo0 vo0Var2 = this.f38879w;
        MessagesController.PeerColor peerColor = null;
        if (vo0Var2 != null) {
            vo0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i12 = this.f38871a;
        if (z10) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i13 = vo0.f43550j;
            int i14 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.f38879w = new vo0(tL_emojiStatusCollectible.document_id, i14, i14, i14);
        } else {
            if (UserObject.getProfileColorId(user) >= 0) {
                vo0Var = vo0.c(i12, UserObject.getProfileColorId(user));
                vo0Var.f43551a = AndroidUtilities.dp(11.0f);
                vo0Var.d();
            } else {
                vo0Var = null;
            }
            this.f38879w = vo0Var;
        }
        vo0 vo0Var3 = this.f38879w;
        if (vo0Var3 != null) {
            vo0Var3.e(this);
        }
        TLRPC.PeerColor peerColor2 = user.color;
        boolean z11 = peerColor2 instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.f38876n;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        if (z11) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor2;
            if (b6Var != null) {
                q10 = b6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.f6.I.q();
            }
            if (q10 && (tL_peerColorCollectible.flags & 1) != 0) {
                i9 = tL_peerColorCollectible.dark_accent_color;
            } else {
                i9 = tL_peerColorCollectible.accent_color;
            }
            if (!q10 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                arrayList = tL_peerColorCollectible.colors;
            }
            int intValue = arrayList.get(0).intValue() | (-16777216);
            if (arrayList.size() >= 2) {
                i10 = arrayList.get(1).intValue() | (-16777216);
            } else {
                i10 = intValue;
            }
            if (arrayList.size() >= 3) {
                i11 = arrayList.get(2).intValue() | (-16777216);
            } else {
                i11 = intValue;
            }
            this.f38877r.o(i9);
            paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.1f, i9));
            vo0 vo0Var4 = new vo0(tL_peerColorCollectible.gift_emoji_id, intValue, i10, i11);
            vo0Var4.f43551a = AndroidUtilities.dp(11.0f);
            vo0Var4.d();
            this.f38880x = vo0Var4;
            vo0Var4.e(this);
            return;
        }
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            int i15 = org.telegram.ui.ActionBar.f6.f23250r8[colorId];
            this.f38878s = i15;
            v02 = org.telegram.ui.ActionBar.f6.v0(i15, b6Var);
        } else {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
            if (peerColors != null) {
                peerColor = peerColors.getColor(colorId);
            }
            if (peerColor != null) {
                this.f38878s = -1;
                v02 = peerColor.getColor1();
            } else {
                int i16 = org.telegram.ui.ActionBar.f6.f23250r8[0];
                this.f38878s = i16;
                v02 = org.telegram.ui.ActionBar.f6.v0(i16, b6Var);
            }
        }
        this.f38877r.o(v02);
        paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.1f, v02));
        vo0 a2 = vo0.a(i12, colorId);
        a2.f43551a = AndroidUtilities.dp(11.0f);
        a2.d();
        this.f38880x = a2;
    }
}
