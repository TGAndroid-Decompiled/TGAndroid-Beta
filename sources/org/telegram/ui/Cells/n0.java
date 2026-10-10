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
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.m11;
public final class n0 {
    public final u1 f22489a;
    public final org.telegram.ui.Components.j9[] f22490b;
    public final ImageReceiver[] f22491c;
    public final TextPaint d;
    public final CharSequence f22492e;
    public StaticLayout f22493f;
    public final boolean f22494g;
    public final Drawable h;
    public final Paint f22495i;
    public final Paint f22496j;
    public final m11 f22497k;
    public boolean f22498l;
    public boolean f22499m;
    public final bd f22500n;
    public final TLObject f22501o;

    public n0(int i10, u1 u1Var, TLObject[] tLObjectArr, int i11) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f22495i = new Paint(1);
        this.f22496j = new Paint(1);
        new Paint(1);
        this.f22489a = u1Var;
        this.f22501o = tLObjectArr[0];
        this.f22500n = new l0(u1Var, u1Var, 0);
        this.f22491c = new ImageReceiver[3];
        this.f22490b = new org.telegram.ui.Components.j9[3];
        for (int i12 = 0; i12 < 3; i12++) {
            this.f22491c[i12] = new ImageReceiver(u1Var);
            this.f22491c[i12].setParentView(u1Var);
            this.f22491c[i12].setRoundRadius(AndroidUtilities.dp(54.0f));
            this.f22490b[i12] = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
            if (i12 < tLObjectArr.length && (tLObject = tLObjectArr[i12]) != null) {
                this.f22490b[i12].j(i10, tLObject);
                this.f22491c[i12].setForUserOrChat(tLObjectArr[i12], this.f22490b[i12]);
            } else {
                Paint paint = new Paint(1);
                int v = org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21063ra, u1Var.Id), org.telegram.ui.ActionBar.i6.m1(0.5f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21185y6, u1Var.Id)));
                paint.setColor(v);
                this.f22491c[i12].setImageBitmap(new m0(paint, v));
            }
        }
        if (u1Var.M0) {
            a();
        }
        this.d.setTextSize(AndroidUtilities.dp(11.0f));
        boolean isPremium = UserConfig.getInstance(u1Var.I7).isPremium();
        this.f22492e = LocaleController.getString(isPremium ? R.string.MoreSimilar : R.string.UnlockSimilar);
        this.f22495i.setStyle(Paint.Style.STROKE);
        this.f22494g = true;
        this.h = isPremium ? null : u1Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (b(this.f22501o) == null) {
            this.f22497k = null;
        } else {
            this.f22497k = new m11(hg.c.h(i11, "+"), 9.33f, AndroidUtilities.bold());
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
            ImageReceiver[] imageReceiverArr = this.f22491c;
            if (i10 < imageReceiverArr.length) {
                imageReceiverArr[i10].onAttachedToWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    public n0(int i10, u1 u1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f22495i = new Paint(1);
        this.f22496j = new Paint(1);
        new Paint(1);
        this.f22489a = u1Var;
        this.f22501o = tLObject;
        this.f22500n = new l0(u1Var, u1Var, 1);
        this.f22491c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(u1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.setParentView(u1Var);
        imageReceiverArr[0].setRoundRadius(AndroidUtilities.dp(54.0f));
        if (u1Var.M0) {
            a();
        }
        this.f22490b = r1;
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.j9[] j9VarArr = {j9Var};
        j9Var.j(i10, tLObject);
        imageReceiverArr[0].setForUserOrChat(tLObject, j9VarArr[0]);
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
        this.f22492e = charSequence;
        this.f22495i.setStyle(Paint.Style.STROKE);
        this.f22494g = false;
        this.h = u1Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (b(tLObject) == null) {
            this.f22497k = null;
        } else {
            this.f22497k = new m11(b(tLObject), 9.33f, AndroidUtilities.bold());
        }
    }
}
