package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.h11;
public final class o0 {
    public final u1 f21603a;
    public final org.telegram.ui.Components.k9[] f21604b;
    public final ImageReceiver[] f21605c;
    public final TextPaint d;
    public final CharSequence e;
    public StaticLayout f21606f;
    public final boolean f21607g;
    public final Drawable h;
    public final Paint f21608i;
    public final Paint f21609j;
    public final h11 f21610k;
    public boolean f21611l;
    public boolean f21612m;
    public final ad f21613n;
    public final TLObject f21614o;

    public o0(int i10, u1 u1Var, TLObject[] tLObjectArr, int i11) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f21608i = new Paint(1);
        this.f21609j = new Paint(1);
        new Paint(1);
        this.f21603a = u1Var;
        this.f21614o = tLObjectArr[0];
        this.f21613n = new m0(u1Var, u1Var, 0);
        this.f21605c = new ImageReceiver[3];
        this.f21604b = new org.telegram.ui.Components.k9[3];
        for (int i12 = 0; i12 < 3; i12++) {
            this.f21605c[i12] = new ImageReceiver(u1Var);
            this.f21605c[i12].setParentView(u1Var);
            this.f21605c[i12].setRoundRadius(AndroidUtilities.dp(54.0f));
            this.f21604b[i12] = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
            if (i12 < tLObjectArr.length && (tLObject = tLObjectArr[i12]) != null) {
                this.f21604b[i12].j(i10, tLObject);
                this.f21605c[i12].setForUserOrChat(tLObjectArr[i12], this.f21604b[i12]);
            } else {
                Paint paint = new Paint(1);
                int v = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20162ra, u1Var.Id), org.telegram.ui.ActionBar.g6.m1(0.5f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20288y6, u1Var.Id)));
                paint.setColor(v);
                this.f21605c[i12].setImageBitmap(new n0(paint, v));
            }
        }
        if (u1Var.M0) {
            a();
        }
        this.d.setTextSize(AndroidUtilities.dp(11.0f));
        boolean isPremium = UserConfig.getInstance(u1Var.I7).isPremium();
        this.e = LocaleController.getString(isPremium ? R.string.MoreSimilar : R.string.UnlockSimilar);
        this.f21608i.setStyle(Paint.Style.STROKE);
        this.f21607g = true;
        this.h = isPremium ? null : u1Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (b(this.f21614o) == null) {
            this.f21610k = null;
        } else {
            this.f21610k = new h11(i2.d.i(i11, "+"), 9.33f, AndroidUtilities.bold());
        }
    }

    public static String b(TLObject tLObject) {
        int i10;
        if (tLObject instanceof TLRPC.Chat) {
            int i11 = ((TLRPC.Chat) tLObject).participants_count;
            if (i11 > 1) {
                return LocaleController.formatShortNumber(i11, null);
            }
        } else if ((tLObject instanceof TLRPC.User) && (i10 = ((TLRPC.User) tLObject).bot_active_users) > 1) {
            return LocaleController.formatShortNumber(i10, null);
        }
        return null;
    }

    public final void a() {
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.f21605c;
            if (i10 < imageReceiverArr.length) {
                imageReceiverArr[i10].onAttachedToWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    public o0(int i10, u1 u1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f21608i = new Paint(1);
        this.f21609j = new Paint(1);
        new Paint(1);
        this.f21603a = u1Var;
        this.f21614o = tLObject;
        this.f21613n = new m0(u1Var, u1Var, 1);
        this.f21605c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(u1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.setParentView(u1Var);
        imageReceiverArr[0].setRoundRadius(AndroidUtilities.dp(54.0f));
        if (u1Var.M0) {
            a();
        }
        this.f21604b = r1;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.k9[] k9VarArr = {k9Var};
        k9Var.j(i10, tLObject);
        imageReceiverArr[0].setForUserOrChat(tLObject, k9VarArr[0]);
        textPaint.setTextSize(AndroidUtilities.dp(11.0f));
        if (tLObject instanceof TLRPC.Chat) {
            charSequence = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.User) {
            charSequence = UserObject.getUserName((TLRPC.User) tLObject);
        } else {
            charSequence = "";
        }
        try {
            charSequence = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        this.e = charSequence;
        this.f21608i.setStyle(Paint.Style.STROKE);
        this.f21607g = false;
        this.h = u1Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (b(tLObject) == null) {
            this.f21610k = null;
        } else {
            this.f21610k = new h11(b(tLObject), 9.33f, AndroidUtilities.bold());
        }
    }
}
