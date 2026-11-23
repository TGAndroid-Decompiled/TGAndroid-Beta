package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.wy0;
public final class l0 {
    public final r1 f31048a;
    public final org.telegram.ui.Components.a9[] f31049b;
    public final ImageReceiver[] f31050c;
    public final TextPaint d;
    public final CharSequence f31051e;
    public StaticLayout f31052f;
    public final boolean f31053g;
    public final Drawable h;
    public final Paint f31054i;
    public final Paint f31055j;
    public final wy0 f31056k;
    public boolean f31057l;
    public boolean f31058m;
    public final lc f31059n;
    public final TLObject f31060o;

    public l0(r1 r1Var, TLObject[] tLObjectArr, int i7) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f31054i = new Paint(1);
        this.f31055j = new Paint(1);
        new Paint(1);
        this.f31048a = r1Var;
        this.f31060o = tLObjectArr[0];
        this.f31059n = new k0(r1Var, r1Var, 0);
        this.f31050c = new ImageReceiver[3];
        this.f31049b = new org.telegram.ui.Components.a9[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f31050c[i10] = new ImageReceiver(r1Var);
            this.f31050c[i10].I0(r1Var);
            this.f31050c[i10].K0(org.telegram.messenger.g0.L(54.0f));
            this.f31049b[i10] = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
            if (i10 < tLObjectArr.length && (tLObject = tLObjectArr[i10]) != null) {
                this.f31049b[i10].p(tLObject);
                this.f31050c[i10].j0(tLObjectArr[i10], this.f31049b[i10], null);
            } else {
                Paint paint = new Paint(1);
                int[] iArr = {org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29714ra, r1Var.Qb), org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29843y6, r1Var.Qb)))};
                paint.setColor(iArr[0]);
                this.f31050c[i10].x0(new org.telegram.ui.ActionBar.v2(r1Var, iArr, paint));
            }
        }
        if (r1Var.O0) {
            a();
        }
        this.d.setTextSize(org.telegram.messenger.g0.L(11.0f));
        boolean q10 = i10.i(r1Var.f31411a6).q();
        this.f31051e = gd.N0(q10 ? 2131748137 : 2131743607, null);
        this.f31054i.setStyle(Paint.Style.STROKE);
        this.f31053g = true;
        this.h = q10 ? null : r1Var.getContext().getResources().getDrawable(2131231980).mutate();
        if (b(this.f31060o) == null) {
            this.f31056k = null;
        } else {
            this.f31056k = new wy0(i5.c.i(i7, "+"), 9.33f, org.telegram.messenger.g0.o());
        }
    }

    public static String b(TLObject tLObject) {
        int i7;
        if (tLObject instanceof TLRPC.Chat) {
            int i10 = ((TLRPC.Chat) tLObject).participants_count;
            if (i10 > 1) {
                return gd.S(null, i10);
            }
        } else if ((tLObject instanceof TLRPC.User) && (i7 = ((TLRPC.User) tLObject).bot_active_users) > 1) {
            return gd.S(null, i7);
        }
        return null;
    }

    public final void a() {
        int i7 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.f31050c;
            if (i7 < imageReceiverArr.length) {
                imageReceiverArr[i7].Q();
                i7++;
            } else {
                return;
            }
        }
    }

    public l0(r1 r1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f31054i = new Paint(1);
        this.f31055j = new Paint(1);
        new Paint(1);
        this.f31048a = r1Var;
        this.f31060o = tLObject;
        this.f31059n = new k0(r1Var, r1Var, 1);
        this.f31050c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(r1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.I0(r1Var);
        imageReceiverArr[0].K0(org.telegram.messenger.g0.L(54.0f));
        if (r1Var.O0) {
            a();
        }
        this.f31049b = r1;
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.a9[] a9VarArr = {a9Var};
        a9Var.p(tLObject);
        imageReceiverArr[0].j0(tLObject, a9VarArr[0], null);
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
        if (tLObject instanceof TLRPC.Chat) {
            charSequence = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.User) {
            charSequence = n10.q((TLRPC.User) tLObject);
        } else {
            charSequence = "";
        }
        try {
            charSequence = org.telegram.messenger.j6.m(charSequence, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        this.f31051e = charSequence;
        this.f31054i.setStyle(Paint.Style.STROKE);
        this.f31053g = false;
        this.h = r1Var.getContext().getResources().getDrawable(2131231974).mutate();
        if (b(tLObject) == null) {
            this.f31056k = null;
        } else {
            this.f31056k = new wy0(b(tLObject), 9.33f, org.telegram.messenger.g0.o());
        }
    }
}
