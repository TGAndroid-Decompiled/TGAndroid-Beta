package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.oy0;
public final class k0 {
    public final q1 f30527a;
    public final org.telegram.ui.Components.t8[] f30528b;
    public final ImageReceiver[] f30529c;
    public final TextPaint d;
    public final CharSequence f30530e;
    public StaticLayout f30531f;
    public final boolean f30532g;
    public final Drawable h;
    public final Paint f30533i;
    public final Paint f30534j;
    public final oy0 f30535k;
    public boolean f30536l;
    public boolean f30537m;
    public final dc f30538n;
    public final TLObject f30539o;

    public k0(q1 q1Var, TLObject[] tLObjectArr, int i7) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f30533i = new Paint(1);
        this.f30534j = new Paint(1);
        new Paint(1);
        this.f30527a = q1Var;
        this.f30539o = tLObjectArr[0];
        this.f30538n = new j0(q1Var, q1Var, 0);
        this.f30529c = new ImageReceiver[3];
        this.f30528b = new org.telegram.ui.Components.t8[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f30529c[i10] = new ImageReceiver(q1Var);
            this.f30529c[i10].H0(q1Var);
            this.f30529c[i10].J0(org.telegram.messenger.g0.L(54.0f));
            this.f30528b[i10] = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
            if (i10 < tLObjectArr.length && (tLObject = tLObjectArr[i10]) != null) {
                this.f30528b[i10].p(tLObject);
                this.f30529c[i10].i0(tLObjectArr[i10], this.f30528b[i10], null);
            } else {
                Paint paint = new Paint(1);
                int[] iArr = {org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29112ra, q1Var.Qb), org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29241y6, q1Var.Qb)))};
                paint.setColor(iArr[0]);
                this.f30529c[i10].w0(new org.telegram.ui.ActionBar.t2(q1Var, iArr, paint));
            }
        }
        if (q1Var.O0) {
            a();
        }
        this.d.setTextSize(org.telegram.messenger.g0.L(11.0f));
        boolean q10 = m10.i(q1Var.f30908a6).q();
        this.f30530e = hd.M0(q10 ? 2131748330 : 2131743854, null);
        this.f30533i.setStyle(Paint.Style.STROKE);
        this.f30532g = true;
        this.h = q10 ? null : q1Var.getContext().getResources().getDrawable(2131231976).mutate();
        if (b(this.f30539o) == null) {
            this.f30535k = null;
        } else {
            this.f30535k = new oy0(i5.c.i(i7, "+"), 9.33f, org.telegram.messenger.g0.o());
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
            ImageReceiver[] imageReceiverArr = this.f30529c;
            if (i7 < imageReceiverArr.length) {
                imageReceiverArr[i7].P();
                i7++;
            } else {
                return;
            }
        }
    }

    public k0(q1 q1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f30533i = new Paint(1);
        this.f30534j = new Paint(1);
        new Paint(1);
        this.f30527a = q1Var;
        this.f30539o = tLObject;
        this.f30538n = new j0(q1Var, q1Var, 1);
        this.f30529c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.H0(q1Var);
        imageReceiverArr[0].J0(org.telegram.messenger.g0.L(54.0f));
        if (q1Var.O0) {
            a();
        }
        this.f30528b = r1;
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.t8[] t8VarArr = {t8Var};
        t8Var.p(tLObject);
        imageReceiverArr[0].i0(tLObject, t8VarArr[0], null);
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
        if (tLObject instanceof TLRPC.Chat) {
            charSequence = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.User) {
            charSequence = q10.p((TLRPC.User) tLObject);
        } else {
            charSequence = "";
        }
        try {
            charSequence = org.telegram.messenger.j6.m(charSequence, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        this.f30530e = charSequence;
        this.f30533i.setStyle(Paint.Style.STROKE);
        this.f30532g = false;
        this.h = q1Var.getContext().getResources().getDrawable(2131231970).mutate();
        if (b(tLObject) == null) {
            this.f30535k = null;
        } else {
            this.f30535k = new oy0(b(tLObject), 9.33f, org.telegram.messenger.g0.o());
        }
    }
}
