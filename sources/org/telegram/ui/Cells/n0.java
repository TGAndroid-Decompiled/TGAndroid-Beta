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
import org.telegram.ui.Components.l11;
public final class n0 {
    public final u1 f22485a;
    public final org.telegram.ui.Components.j9[] f22486b;
    public final ImageReceiver[] f22487c;
    public final TextPaint d;
    public final CharSequence f22488e;
    public StaticLayout f22489f;
    public final boolean f22490g;
    public final Drawable h;
    public final Paint f22491i;
    public final Paint f22492j;
    public final l11 f22493k;
    public boolean f22494l;
    public boolean f22495m;
    public final bd f22496n;
    public final TLObject f22497o;

    public n0(int i10, u1 u1Var, TLObject[] tLObjectArr, int i11) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f22491i = new Paint(1);
        this.f22492j = new Paint(1);
        new Paint(1);
        this.f22485a = u1Var;
        this.f22497o = tLObjectArr[0];
        this.f22496n = new l0(u1Var, u1Var, 0);
        this.f22487c = new ImageReceiver[3];
        this.f22486b = new org.telegram.ui.Components.j9[3];
        for (int i12 = 0; i12 < 3; i12++) {
            this.f22487c[i12] = new ImageReceiver(u1Var);
            this.f22487c[i12].setParentView(u1Var);
            this.f22487c[i12].setRoundRadius(AndroidUtilities.dp(54.0f));
            this.f22486b[i12] = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
            if (i12 < tLObjectArr.length && (tLObject = tLObjectArr[i12]) != null) {
                this.f22486b[i12].j(i10, tLObject);
                this.f22487c[i12].setForUserOrChat(tLObjectArr[i12], this.f22486b[i12]);
            } else {
                Paint paint = new Paint(1);
                int v = org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21059ra, u1Var.Id), org.telegram.ui.ActionBar.i6.m1(0.5f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21181y6, u1Var.Id)));
                paint.setColor(v);
                this.f22487c[i12].setImageBitmap(new m0(paint, v));
            }
        }
        if (u1Var.M0) {
            a();
        }
        this.d.setTextSize(AndroidUtilities.dp(11.0f));
        boolean isPremium = UserConfig.getInstance(u1Var.I7).isPremium();
        this.f22488e = LocaleController.getString(isPremium ? R.string.MoreSimilar : R.string.UnlockSimilar);
        this.f22491i.setStyle(Paint.Style.STROKE);
        this.f22490g = true;
        this.h = isPremium ? null : u1Var.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        if (b(this.f22497o) == null) {
            this.f22493k = null;
        } else {
            this.f22493k = new l11(hg.c.h(i11, "+"), 9.33f, AndroidUtilities.bold());
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
            ImageReceiver[] imageReceiverArr = this.f22487c;
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
        this.f22491i = new Paint(1);
        this.f22492j = new Paint(1);
        new Paint(1);
        this.f22485a = u1Var;
        this.f22497o = tLObject;
        this.f22496n = new l0(u1Var, u1Var, 1);
        this.f22487c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(u1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.setParentView(u1Var);
        imageReceiverArr[0].setRoundRadius(AndroidUtilities.dp(54.0f));
        if (u1Var.M0) {
            a();
        }
        this.f22486b = r1;
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
        this.f22488e = charSequence;
        this.f22491i.setStyle(Paint.Style.STROKE);
        this.f22490g = false;
        this.h = u1Var.getContext().getResources().getDrawable(R.drawable.mini_reply_user).mutate();
        if (b(tLObject) == null) {
            this.f22493k = null;
        } else {
            this.f22493k = new l11(b(tLObject), 9.33f, AndroidUtilities.bold());
        }
    }
}
