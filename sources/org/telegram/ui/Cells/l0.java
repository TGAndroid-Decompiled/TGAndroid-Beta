package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.xy0;
public final class l0 {
    public final r1 f30983a;
    public final org.telegram.ui.Components.b9[] f30984b;
    public final ImageReceiver[] f30985c;
    public final TextPaint d;
    public final CharSequence f30986e;
    public StaticLayout f30987f;
    public final boolean f30988g;
    public final Drawable h;
    public final Paint f30989i;
    public final Paint f30990j;
    public final xy0 f30991k;
    public boolean f30992l;
    public boolean f30993m;
    public final mc f30994n;
    public final TLObject f30995o;

    public l0(r1 r1Var, TLObject[] tLObjectArr, int i7) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f30989i = new Paint(1);
        this.f30990j = new Paint(1);
        new Paint(1);
        this.f30983a = r1Var;
        this.f30995o = tLObjectArr[0];
        this.f30994n = new k0(r1Var, r1Var, 0);
        this.f30985c = new ImageReceiver[3];
        this.f30984b = new org.telegram.ui.Components.b9[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f30985c[i10] = new ImageReceiver(r1Var);
            this.f30985c[i10].H0(r1Var);
            this.f30985c[i10].J0(org.telegram.messenger.g0.L(54.0f));
            this.f30984b[i10] = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
            if (i10 < tLObjectArr.length && (tLObject = tLObjectArr[i10]) != null) {
                this.f30984b[i10].p(tLObject);
                this.f30985c[i10].i0(tLObjectArr[i10], this.f30984b[i10], null);
            } else {
                Paint paint = new Paint(1);
                int[] iArr = {org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29644ra, r1Var.Qb), org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29773y6, r1Var.Qb)))};
                paint.setColor(iArr[0]);
                this.f30985c[i10].w0(new org.telegram.ui.ActionBar.v2(r1Var, iArr, paint));
            }
        }
        if (r1Var.O0) {
            a();
        }
        this.d.setTextSize(org.telegram.messenger.g0.L(11.0f));
        boolean q10 = k10.i(r1Var.f31361a6).q();
        this.f30986e = hd.N0(q10 ? 2131748137 : 2131743609, null);
        this.f30989i.setStyle(Paint.Style.STROKE);
        this.f30988g = true;
        this.h = q10 ? null : r1Var.getContext().getResources().getDrawable(2131231977).mutate();
        if (b(this.f30995o) == null) {
            this.f30991k = null;
        } else {
            this.f30991k = new xy0(i5.c.i(i7, "+"), 9.33f, org.telegram.messenger.g0.o());
        }
    }

    public static String b(TLObject tLObject) {
        int i7;
        if (tLObject instanceof TLRPC.Chat) {
            int i10 = ((TLRPC.Chat) tLObject).participants_count;
            if (i10 > 1) {
                return hd.S(null, i10);
            }
        } else if ((tLObject instanceof TLRPC.User) && (i7 = ((TLRPC.User) tLObject).bot_active_users) > 1) {
            return hd.S(null, i7);
        }
        return null;
    }

    public final void a() {
        int i7 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.f30985c;
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
        this.f30989i = new Paint(1);
        this.f30990j = new Paint(1);
        new Paint(1);
        this.f30983a = r1Var;
        this.f30995o = tLObject;
        this.f30994n = new k0(r1Var, r1Var, 1);
        this.f30985c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(r1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.H0(r1Var);
        imageReceiverArr[0].J0(org.telegram.messenger.g0.L(54.0f));
        if (r1Var.O0) {
            a();
        }
        this.f30984b = r1;
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.b9[] b9VarArr = {b9Var};
        b9Var.p(tLObject);
        imageReceiverArr[0].i0(tLObject, b9VarArr[0], null);
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
        if (tLObject instanceof TLRPC.Chat) {
            charSequence = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.User) {
            charSequence = p10.q((TLRPC.User) tLObject);
        } else {
            charSequence = "";
        }
        try {
            charSequence = org.telegram.messenger.j6.m(charSequence, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        this.f30986e = charSequence;
        this.f30989i.setStyle(Paint.Style.STROKE);
        this.f30988g = false;
        this.h = r1Var.getContext().getResources().getDrawable(2131231971).mutate();
        if (b(tLObject) == null) {
            this.f30991k = null;
        } else {
            this.f30991k = new xy0(b(tLObject), 9.33f, org.telegram.messenger.g0.o());
        }
    }
}
