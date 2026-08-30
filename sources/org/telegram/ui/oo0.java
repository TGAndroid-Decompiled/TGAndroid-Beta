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
public final class oo0 extends View {
    public final int f36942a;
    public final boolean f36943b;
    public final boolean f36944c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final Drawable e;
    public final org.telegram.ui.Components.k01 f36945f;
    public final so0 h;
    public final Paint f36946n;
    public org.telegram.ui.Components.k01 f36947r;
    public int f36948s;
    public boolean v;
    public cp0 f36949w;
    public cp0 f36950x;

    public oo0(int i10, long j10, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        boolean z4;
        boolean z10;
        int i11;
        int i12;
        this.f36946n = new Paint(1);
        this.f36948s = -1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        this.f36942a = i10;
        if (j10 < 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f36943b = z4;
        if (z4 && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36944c = z10;
        this.d = f6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.menu_edit_appearance).mutate();
        this.e = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20140q6, f6Var), PorterDuff.Mode.SRC_IN));
        if (z4) {
            if (z10) {
                i11 = R.string.ChangeGroupAppearance;
            } else {
                i11 = R.string.ChangeChannelNameColor2;
            }
        } else {
            i11 = R.string.ChangeUserNameColor;
        }
        String string = LocaleController.getString(i11);
        if (z4 && !z10 && MessagesController.getInstance(i10).getMainSettings().getInt("boostingappearance", 0) < 3) {
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
                this.h = new so0(Math.max(i14, min9), context, f6Var, true);
            }
        }
        setContentDescription(string);
        this.f36945f = new org.telegram.ui.Components.k01(string, 16.0f, null);
        a();
    }

    public final void a() {
        int i10;
        int i11;
        Paint paint;
        int i12;
        boolean z4 = this.f36943b;
        if (z4) {
            i10 = org.telegram.ui.ActionBar.j6.f20067m6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f20140q6;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        this.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
        if (z4) {
            i11 = org.telegram.ui.ActionBar.j6.G6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f20140q6;
        }
        this.f36945f.o(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (this.f36947r != null && (paint = this.f36946n) != null && (i12 = this.f36948s) != -1) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
            this.f36947r.o(v02);
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
        lf.r.d(drawable, dp4, getMeasuredHeight() / 2.0f, 17);
        drawable.draw(canvas);
        int measuredWidth4 = getMeasuredWidth() - AndroidUtilities.dp(171.0f);
        int i11 = 0;
        so0 so0Var = this.h;
        if (so0Var != null) {
            i10 = AndroidUtilities.dp(8.0f) + so0Var.getIntrinsicWidth();
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.k01 k01Var = this.f36945f;
        k01Var.f26094p = measuredWidth4 - i10;
        if (LocaleController.isRTL) {
            dp = (getMeasuredWidth() - k01Var.l()) - AndroidUtilities.dp(58.0f);
        } else {
            dp = AndroidUtilities.dp(58.0f);
        }
        k01Var.e(canvas, dp, getMeasuredHeight() / 2.0f);
        if (so0Var != null) {
            int l10 = (int) (k01Var.l() + dp + AndroidUtilities.dp(6.0f));
            so0Var.setBounds(l10, 0, l10, getHeight());
            so0Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        boolean z4 = this.f36944c;
        if (z4 && this.f36950x != null) {
            if (LocaleController.isRTL) {
                measuredWidth3 = AndroidUtilities.dp(58.0f);
            } else {
                measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            }
            this.f36950x.setBounds(measuredWidth3 - AndroidUtilities.dp(11.0f), b.x(11.0f, getMeasuredHeight(), 2), measuredWidth3, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.f36950x.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var));
            this.f36950x.draw(canvas);
        } else if (this.f36949w != null && this.f36950x != null) {
            if (LocaleController.isRTL) {
                measuredWidth2 = AndroidUtilities.dp(58.0f);
            } else {
                measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            }
            this.f36950x.setBounds(measuredWidth2 - AndroidUtilities.dp(11.0f), b.x(11.0f, getMeasuredHeight(), 2), measuredWidth2, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            cp0 cp0Var = this.f36950x;
            float dpf2 = AndroidUtilities.dpf2(3.0f);
            int i12 = org.telegram.ui.ActionBar.j6.f19906d6;
            cp0Var.f(dpf2, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
            this.f36950x.draw(canvas);
            int dp5 = measuredWidth2 - AndroidUtilities.dp(18.0f);
            this.f36949w.setBounds(dp5 - AndroidUtilities.dp(11.0f), b.x(11.0f, getMeasuredHeight(), 2), dp5, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.f36949w.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
            this.f36949w.draw(canvas);
        } else if (this.f36947r != null && !z4) {
            float measuredWidth5 = getMeasuredWidth() - AndroidUtilities.dp(116.0f);
            float l11 = k01Var.l();
            if (so0Var == null) {
                dp2 = 0;
            } else {
                dp2 = AndroidUtilities.dp(12.0f) + so0Var.getIntrinsicWidth();
            }
            float min = (int) (measuredWidth5 - Math.min(l11 + dp2, getMeasuredWidth() - AndroidUtilities.dp(164.0f)));
            int min2 = (int) Math.min(this.f36947r.l(), min);
            RectF rectF = AndroidUtilities.rectTmp;
            if (LocaleController.isRTL) {
                B = AndroidUtilities.dp(15.0f);
            } else {
                B = org.telegram.messenger.y3.B(33.0f, getMeasuredWidth(), min2);
            }
            float f10 = B;
            float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(22.0f)) / 2.0f;
            if (LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(33.0f) + min2;
            } else {
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(15.0f);
            }
            rectF.set(f10, measuredHeight, measuredWidth, (AndroidUtilities.dp(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f36946n);
            org.telegram.ui.Components.k01 k01Var2 = this.f36947r;
            k01Var2.f26094p = min;
            if (LocaleController.isRTL) {
                B2 = AndroidUtilities.dp(24.0f);
            } else {
                B2 = org.telegram.messenger.y3.B(24.0f, getMeasuredWidth(), min2);
            }
            k01Var2.e(canvas, B2, getMeasuredHeight() / 2.0f);
        }
        if (this.v) {
            if (f6Var != null) {
                paint = f6Var.G("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.j6.f20025k0;
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
        cp0 cp0Var;
        int v02;
        boolean q10;
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
        this.f36947r = new org.telegram.ui.Components.k01(Emoji.replaceEmoji(trim, org.telegram.ui.ActionBar.j6.f20099o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
        cp0 cp0Var2 = this.f36949w;
        MessagesController.PeerColor peerColor = null;
        if (cp0Var2 != null) {
            cp0Var2.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z4 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i13 = this.f36942a;
        if (z4) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i14 = cp0.f33401j;
            int i15 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.f36949w = new cp0(tL_emojiStatusCollectible.document_id, i15, i15, i15);
        } else {
            if (UserObject.getProfileColorId(user) >= 0) {
                cp0Var = cp0.c(i13, UserObject.getProfileColorId(user));
                cp0Var.f33402a = AndroidUtilities.dp(11.0f);
                cp0Var.d();
            } else {
                cp0Var = null;
            }
            this.f36949w = cp0Var;
        }
        cp0 cp0Var3 = this.f36949w;
        if (cp0Var3 != null) {
            cp0Var3.e(this);
        }
        TLRPC.PeerColor peerColor2 = user.color;
        boolean z10 = peerColor2 instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.f36946n;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z10) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor2;
            if (f6Var != null) {
                q10 = f6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.j6.I.q();
            }
            if (q10 && (tL_peerColorCollectible.flags & 1) != 0) {
                i10 = tL_peerColorCollectible.dark_accent_color;
            } else {
                i10 = tL_peerColorCollectible.accent_color;
            }
            if (!q10 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
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
            this.f36947r.o(i10);
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i10));
            cp0 cp0Var4 = new cp0(tL_peerColorCollectible.gift_emoji_id, intValue, i11, i12);
            cp0Var4.f33402a = AndroidUtilities.dp(11.0f);
            cp0Var4.d();
            this.f36950x = cp0Var4;
            cp0Var4.e(this);
            return;
        }
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            int i16 = org.telegram.ui.ActionBar.j6.f20160r8[colorId];
            this.f36948s = i16;
            v02 = org.telegram.ui.ActionBar.j6.v0(i16, f6Var);
        } else {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
            if (peerColors != null) {
                peerColor = peerColors.getColor(colorId);
            }
            if (peerColor != null) {
                this.f36948s = -1;
                v02 = peerColor.getColor1();
            } else {
                int i17 = org.telegram.ui.ActionBar.j6.f20160r8[0];
                this.f36948s = i17;
                v02 = org.telegram.ui.ActionBar.j6.v0(i17, f6Var);
            }
        }
        this.f36947r.o(v02);
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, v02));
        cp0 a2 = cp0.a(i13, colorId);
        a2.f33402a = AndroidUtilities.dp(11.0f);
        a2.d();
        this.f36950x = a2;
    }
}
