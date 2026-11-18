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
    public final r1 f30952a;
    public final org.telegram.ui.Components.b9[] f30953b;
    public final ImageReceiver[] f30954c;
    public final TextPaint d;
    public final CharSequence f30955e;
    public StaticLayout f30956f;
    public final boolean f30957g;
    public final Drawable h;
    public final Paint f30958i;
    public final Paint f30959j;
    public final vy0 f30960k;
    public boolean f30961l;
    public boolean f30962m;
    public final mc f30963n;
    public final TLObject f30964o;

    public l0(r1 r1Var, TLObject[] tLObjectArr, int i7) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f30958i = new Paint(1);
        this.f30959j = new Paint(1);
        new Paint(1);
        this.f30952a = r1Var;
        this.f30964o = tLObjectArr[0];
        this.f30963n = new k0(r1Var, r1Var, 0);
        this.f30954c = new ImageReceiver[3];
        this.f30953b = new org.telegram.ui.Components.b9[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f30954c[i10] = new ImageReceiver(r1Var);
            this.f30954c[i10].H0(r1Var);
            this.f30954c[i10].J0(org.telegram.messenger.g0.L(54.0f));
            this.f30953b[i10] = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
            if (i10 < tLObjectArr.length && (tLObject = tLObjectArr[i10]) != null) {
                this.f30953b[i10].p(tLObject);
                this.f30954c[i10].i0(tLObjectArr[i10], this.f30953b[i10], null);
            } else {
                Paint paint = new Paint(1);
                int[] iArr = {org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29657ra, r1Var.Qb), org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29786y6, r1Var.Qb)))};
                paint.setColor(iArr[0]);
                this.f30954c[i10].w0(new org.telegram.ui.ActionBar.w2(r1Var, iArr, paint));
            }
        }
        if (r1Var.O0) {
            a();
        }
        this.d.setTextSize(org.telegram.messenger.g0.L(11.0f));
        boolean q10 = j10.i(r1Var.f31330a6).q();
        this.f30955e = gd.M0(q10 ? 2131748138 : 2131743617, null);
        this.f30958i.setStyle(Paint.Style.STROKE);
        this.f30957g = true;
        this.h = q10 ? null : r1Var.getContext().getResources().getDrawable(2131231977).mutate();
        if (b(this.f30964o) == null) {
            this.f30960k = null;
        } else {
            this.f30960k = new vy0(i5.c.i(i7, "+"), 9.33f, org.telegram.messenger.g0.o());
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
            ImageReceiver[] imageReceiverArr = this.f30954c;
            if (i7 < imageReceiverArr.length) {
                imageReceiverArr[i7].P();
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
        this.f30958i = new Paint(1);
        this.f30959j = new Paint(1);
        new Paint(1);
        this.f30952a = r1Var;
        this.f30964o = tLObject;
        this.f30963n = new k0(r1Var, r1Var, 1);
        this.f30954c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(r1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.H0(r1Var);
        imageReceiverArr[0].J0(org.telegram.messenger.g0.L(54.0f));
        if (r1Var.O0) {
            a();
        }
        this.f30953b = r1;
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
        this.f30955e = charSequence;
        this.f30958i.setStyle(Paint.Style.STROKE);
        this.f30957g = false;
        this.h = r1Var.getContext().getResources().getDrawable(2131231971).mutate();
        if (b(tLObject) == null) {
            this.f30960k = null;
        } else {
            this.f30960k = new vy0(b(tLObject), 9.33f, org.telegram.messenger.g0.o());
        }
    }
}
