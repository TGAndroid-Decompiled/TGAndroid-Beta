package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.vy0;
public final class l0 {
    public final q1 f30964a;
    public final org.telegram.ui.Components.b9[] f30965b;
    public final ImageReceiver[] f30966c;
    public final TextPaint d;
    public final CharSequence f30967e;
    public StaticLayout f30968f;
    public final boolean f30969g;
    public final Drawable h;
    public final Paint f30970i;
    public final Paint f30971j;
    public final vy0 f30972k;
    public boolean f30973l;
    public boolean f30974m;
    public final mc f30975n;
    public final TLObject f30976o;

    public l0(q1 q1Var, TLObject[] tLObjectArr, int i7) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f30970i = new Paint(1);
        this.f30971j = new Paint(1);
        new Paint(1);
        this.f30964a = q1Var;
        this.f30976o = tLObjectArr[0];
        this.f30975n = new k0(q1Var, q1Var, 0);
        this.f30966c = new ImageReceiver[3];
        this.f30965b = new org.telegram.ui.Components.b9[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f30966c[i10] = new ImageReceiver(q1Var);
            this.f30966c[i10].H0(q1Var);
            this.f30966c[i10].J0(org.telegram.messenger.g0.L(54.0f));
            this.f30965b[i10] = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
            if (i10 < tLObjectArr.length && (tLObject = tLObjectArr[i10]) != null) {
                this.f30965b[i10].p(tLObject);
                this.f30966c[i10].i0(tLObjectArr[i10], this.f30965b[i10], null);
            } else {
                Paint paint = new Paint(1);
                int[] iArr = {org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29659ra, q1Var.Qb), org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29788y6, q1Var.Qb)))};
                paint.setColor(iArr[0]);
                this.f30966c[i10].w0(new org.telegram.ui.ActionBar.w2(q1Var, iArr, paint));
            }
        }
        if (q1Var.O0) {
            a();
        }
        this.d.setTextSize(org.telegram.messenger.g0.L(11.0f));
        boolean q10 = j10.i(q1Var.f31280a6).q();
        this.f30967e = gd.M0(q10 ? 2131748138 : 2131743617, null);
        this.f30970i.setStyle(Paint.Style.STROKE);
        this.f30969g = true;
        this.h = q10 ? null : q1Var.getContext().getResources().getDrawable(2131231977).mutate();
        if (b(this.f30976o) == null) {
            this.f30972k = null;
        } else {
            this.f30972k = new vy0(i5.c.i(i7, "+"), 9.33f, org.telegram.messenger.g0.o());
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
            ImageReceiver[] imageReceiverArr = this.f30966c;
            if (i7 < imageReceiverArr.length) {
                imageReceiverArr[i7].P();
                i7++;
            } else {
                return;
            }
        }
    }

    public l0(q1 q1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f30970i = new Paint(1);
        this.f30971j = new Paint(1);
        new Paint(1);
        this.f30964a = q1Var;
        this.f30976o = tLObject;
        this.f30975n = new k0(q1Var, q1Var, 1);
        this.f30966c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.H0(q1Var);
        imageReceiverArr[0].J0(org.telegram.messenger.g0.L(54.0f));
        if (q1Var.O0) {
            a();
        }
        this.f30965b = r1;
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.b9[] b9VarArr = {b9Var};
        b9Var.p(tLObject);
        imageReceiverArr[0].i0(tLObject, b9VarArr[0], null);
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
        if (tLObject instanceof TLRPC.Chat) {
            charSequence = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.User) {
            charSequence = o10.q((TLRPC.User) tLObject);
        } else {
            charSequence = "";
        }
        try {
            charSequence = org.telegram.messenger.j6.m(charSequence, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        this.f30967e = charSequence;
        this.f30970i.setStyle(Paint.Style.STROKE);
        this.f30969g = false;
        this.h = q1Var.getContext().getResources().getDrawable(2131231971).mutate();
        if (b(tLObject) == null) {
            this.f30972k = null;
        } else {
            this.f30972k = new vy0(b(tLObject), 9.33f, org.telegram.messenger.g0.o());
        }
    }
}
