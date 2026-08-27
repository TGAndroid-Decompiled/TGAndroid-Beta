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

public final class io0 extends View {

    public final int f39135a;

    public final boolean f39136b;

    public final boolean f39137c;
    public final org.telegram.ui.ActionBar.c6 d;

    public final Drawable f39138e;

    public final org.telegram.ui.Components.pz0 f39139f;
    public final mo0 h;

    public final Paint f39140n;

    public org.telegram.ui.Components.pz0 f39141r;

    public int f39142s;
    public boolean v;

    public wo0 f39143w;

    public wo0 f39144x;

    public io0(int i10, long j10, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11;
        int i12;
        super(context);
        this.f39140n = new Paint(1);
        this.f39142s = -1;
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        this.f39135a = i10;
        boolean z10 = j10 < 0;
        this.f39136b = z10;
        boolean z11 = z10 && !ChatObject.isChannelAndNotMegaGroup(chat);
        this.f39137c = z11;
        this.d = c6Var;
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.menu_edit_appearance).mutate();
        this.f39138e = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q6, c6Var), PorterDuff.Mode.SRC_IN));
        if (z10) {
            i11 = z11 ? R.string.ChangeGroupAppearance : R.string.ChangeChannelNameColor2;
        } else {
            i11 = R.string.ChangeUserNameColor;
        }
        String string = LocaleController.getString(i11);
        if (z10 && !z11 && MessagesController.getInstance(i10).getMainSettings().getInt("boostingappearance", 0) < 3) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            int i13 = Integer.MAX_VALUE;
            if (peerColors != null) {
                int iMin = Math.min(Integer.MAX_VALUE, peerColors.maxLevel());
                int iMax = Math.max(0, messagesController.peerColors.maxLevel());
                int iMin2 = Math.min(iMin, messagesController.peerColors.minLevel());
                int iMax2 = Math.max(iMax, messagesController.peerColors.minLevel());
                i13 = iMin2;
                i12 = iMax2;
            } else {
                i12 = 0;
            }
            int iMin3 = Math.min(i13, messagesController.channelBgIconLevelMin);
            int iMin4 = Math.min(i12, messagesController.channelBgIconLevelMin);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            if (peerColors2 != null) {
                int iMin5 = Math.min(iMin3, peerColors2.maxLevel());
                int iMax3 = Math.max(iMin4, messagesController.profilePeerColors.maxLevel());
                iMin3 = Math.min(iMin5, messagesController.profilePeerColors.minLevel());
                iMin4 = Math.max(iMax3, messagesController.profilePeerColors.minLevel());
            }
            int iMin6 = Math.min(iMin3, messagesController.channelProfileIconLevelMin);
            int iMax4 = Math.max(iMin4, messagesController.channelProfileIconLevelMin);
            int iMin7 = Math.min(iMin6, messagesController.channelEmojiStatusLevelMin);
            int iMax5 = Math.max(iMax4, messagesController.channelEmojiStatusLevelMin);
            int iMin8 = Math.min(iMin7, messagesController.channelWallpaperLevelMin);
            int iMax6 = Math.max(iMax5, messagesController.channelWallpaperLevelMin);
            int iMin9 = Math.min(iMin8, messagesController.channelCustomWallpaperLevelMin);
            int iMax7 = Math.max(iMax6, messagesController.channelCustomWallpaperLevelMin);
            int i14 = chat != null ? chat.level : 0;
            if (i14 < iMax7) {
                this.h = new mo0(Math.max(i14, iMin9), context, c6Var, true);
            }
        }
        setContentDescription(string);
        this.f39139f = new org.telegram.ui.Components.pz0(string, 16.0f, null);
        a();
    }

    public final void a() {
        Paint paint;
        int i10;
        boolean z10 = this.f39136b;
        int i11 = z10 ? org.telegram.ui.ActionBar.g6.f23215m6 : org.telegram.ui.ActionBar.g6.q6;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        this.f39138e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.SRC_IN));
        this.f39139f.o(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.G6 : org.telegram.ui.ActionBar.g6.q6, c6Var));
        if (this.f39141r == null || (paint = this.f39140n) == null || (i10 = this.f39142s) == -1) {
            return;
        }
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        this.f39141r.o(iV0);
        paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, iV0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int iDp;
        int iDp2;
        int iDp3 = AndroidUtilities.dp(28.0f);
        if (LocaleController.isRTL) {
            iDp3 = getMeasuredWidth() - iDp3;
        }
        float measuredHeight = getMeasuredHeight() / 2.0f;
        Drawable drawable = this.f39138e;
        gf.s.d(drawable, iDp3, measuredHeight, 17);
        drawable.draw(canvas);
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(171.0f);
        mo0 mo0Var = this.h;
        if (mo0Var != null) {
            iDp = AndroidUtilities.dp(8.0f) + mo0Var.getIntrinsicWidth();
        } else {
            iDp = 0;
        }
        org.telegram.ui.Components.pz0 pz0Var = this.f39139f;
        pz0Var.f31708p = measuredWidth - iDp;
        float measuredWidth2 = LocaleController.isRTL ? (getMeasuredWidth() - pz0Var.l()) - AndroidUtilities.dp(58.0f) : AndroidUtilities.dp(58.0f);
        pz0Var.e(canvas, measuredWidth2, getMeasuredHeight() / 2.0f);
        if (mo0Var != null) {
            int iL = (int) (pz0Var.l() + measuredWidth2 + AndroidUtilities.dp(6.0f));
            mo0Var.setBounds(iL, 0, iL, getHeight());
            mo0Var.draw(canvas);
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        boolean z10 = this.f39137c;
        if (z10 && this.f39144x != null) {
            int iDp4 = LocaleController.isRTL ? AndroidUtilities.dp(58.0f) : getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            this.f39144x.setBounds(iDp4 - AndroidUtilities.dp(11.0f), org.telegram.messenger.rl.x(11.0f, getMeasuredHeight(), 2), iDp4, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.f39144x.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var));
            this.f39144x.draw(canvas);
        } else if (this.f39143w != null && this.f39144x != null) {
            int iDp5 = LocaleController.isRTL ? AndroidUtilities.dp(58.0f) : getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            this.f39144x.setBounds(iDp5 - AndroidUtilities.dp(11.0f), org.telegram.messenger.rl.x(11.0f, getMeasuredHeight(), 2), iDp5, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            wo0 wo0Var = this.f39144x;
            float fDpf2 = AndroidUtilities.dpf2(3.0f);
            int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
            wo0Var.f(fDpf2, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            this.f39144x.draw(canvas);
            int iDp6 = iDp5 - AndroidUtilities.dp(18.0f);
            this.f39143w.setBounds(iDp6 - AndroidUtilities.dp(11.0f), org.telegram.messenger.rl.x(11.0f, getMeasuredHeight(), 2), iDp6, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
            this.f39143w.f(AndroidUtilities.dpf2(3.0f), org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            this.f39143w.draw(canvas);
        } else if (this.f39141r != null && !z10) {
            float measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(116.0f);
            float fL = pz0Var.l();
            if (mo0Var == null) {
                iDp2 = 0;
            } else {
                iDp2 = AndroidUtilities.dp(12.0f) + mo0Var.getIntrinsicWidth();
            }
            float fMin = (int) (measuredWidth3 - Math.min(fL + iDp2, getMeasuredWidth() - AndroidUtilities.dp(164.0f)));
            int iMin = (int) Math.min(this.f39141r.l(), fMin);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(LocaleController.isRTL ? AndroidUtilities.dp(15.0f) : org.telegram.messenger.y1.B(33.0f, getMeasuredWidth(), iMin), (getMeasuredHeight() - AndroidUtilities.dp(22.0f)) / 2.0f, LocaleController.isRTL ? AndroidUtilities.dp(33.0f) + iMin : getMeasuredWidth() - AndroidUtilities.dp(15.0f), (AndroidUtilities.dp(22.0f) + getMeasuredHeight()) / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f39140n);
            org.telegram.ui.Components.pz0 pz0Var2 = this.f39141r;
            pz0Var2.f31708p = fMin;
            pz0Var2.e(canvas, LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : org.telegram.messenger.y1.B(24.0f, getMeasuredWidth(), iMin), getMeasuredHeight() / 2.0f);
        }
        if (this.v) {
            Paint paintN = c6Var != null ? c6Var.N("paintDivider") : null;
            if (paintN == null) {
                paintN = org.telegram.ui.ActionBar.g6.f23175k0;
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(58.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(58.0f) : 0), getMeasuredHeight() - 1, paintN);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.v ? 1 : 0), 1073741824));
    }

    public void set(TLRPC.User user) {
        wo0 wo0VarC;
        int iV0;
        ArrayList<Integer> arrayList;
        if (user == null) {
            return;
        }
        String str = user.first_name;
        String strTrim = str == null ? "" : str.trim();
        int iIndexOf = strTrim.indexOf(" ");
        if (iIndexOf > 0) {
            strTrim = strTrim.substring(0, iIndexOf);
        }
        this.f39141r = new org.telegram.ui.Components.pz0(Emoji.replaceEmoji(strTrim, org.telegram.ui.ActionBar.g6.f23247o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
        wo0 wo0Var = this.f39143w;
        if (wo0Var != null) {
            wo0Var.e(null);
        }
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        int i10 = this.f39135a;
        if (z10) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            int i11 = wo0.f44155j;
            int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
            this.f39143w = new wo0(tL_emojiStatusCollectible.document_id, i12, i12, i12);
        } else {
            if (UserObject.getProfileColorId(user) >= 0) {
                wo0VarC = wo0.c(i10, UserObject.getProfileColorId(user));
                wo0VarC.f44156a = AndroidUtilities.dp(11.0f);
                wo0VarC.d();
            } else {
                wo0VarC = null;
            }
            this.f39143w = wo0VarC;
        }
        wo0 wo0Var2 = this.f39143w;
        if (wo0Var2 != null) {
            wo0Var2.e(this);
        }
        TLRPC.PeerColor peerColor = user.color;
        boolean z11 = peerColor instanceof TLRPC.TL_peerColorCollectible;
        Paint paint = this.f39140n;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (z11) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
            boolean zA = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
            int i13 = (!zA || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
            if (!zA || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                arrayList = tL_peerColorCollectible.colors;
            }
            int iIntValue = arrayList.get(0).intValue() | (-16777216);
            int iIntValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : iIntValue;
            int iIntValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : iIntValue;
            this.f39141r.o(i13);
            paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, i13));
            wo0 wo0Var3 = new wo0(tL_peerColorCollectible.gift_emoji_id, iIntValue, iIntValue2, iIntValue3);
            wo0Var3.f44156a = AndroidUtilities.dp(11.0f);
            wo0Var3.d();
            this.f39144x = wo0Var3;
            wo0Var3.e(this);
            return;
        }
        int colorId = UserObject.getColorId(user);
        if (colorId < 7) {
            int i14 = org.telegram.ui.ActionBar.g6.f23303r8[colorId];
            this.f39142s = i14;
            iV0 = org.telegram.ui.ActionBar.g6.v0(i14, c6Var);
        } else {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
            MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
            if (color != null) {
                this.f39142s = -1;
                iV0 = color.getColor1();
            } else {
                int i15 = org.telegram.ui.ActionBar.g6.f23303r8[0];
                this.f39142s = i15;
                iV0 = org.telegram.ui.ActionBar.g6.v0(i15, c6Var);
            }
        }
        this.f39141r.o(iV0);
        paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, iV0));
        wo0 wo0VarA = wo0.a(i10, colorId);
        wo0VarA.f44156a = AndroidUtilities.dp(11.0f);
        wo0VarA.d();
        this.f39144x = wo0VarA;
    }
}
