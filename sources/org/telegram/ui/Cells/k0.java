package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.my0;
public final class k0 {
    public final q1 f29392a;
    public final org.telegram.ui.Components.w8[] f29393b;
    public final ImageReceiver[] f29394c;
    public final TextPaint d;
    public final CharSequence f29395e;
    public StaticLayout f29396f;
    public final boolean f29397g;
    public final Drawable h;
    public final Paint f29398i;
    public final Paint f29399j;
    public final my0 f29400k;
    public boolean f29401l;
    public boolean f29402m;
    public final ic f29403n;
    public final TLObject f29404o;

    public k0(q1 q1Var, TLObject[] tLObjectArr, int i7) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f29398i = new Paint(1);
        this.f29399j = new Paint(1);
        new Paint(1);
        this.f29392a = q1Var;
        this.f29404o = tLObjectArr[0];
        this.f29403n = new j0(q1Var, q1Var, 0);
        this.f29394c = new ImageReceiver[3];
        this.f29393b = new org.telegram.ui.Components.w8[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f29394c[i10] = new ImageReceiver(q1Var);
            this.f29394c[i10].H0(q1Var);
            this.f29394c[i10].J0(org.telegram.messenger.g0.L(54.0f));
            this.f29393b[i10] = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
            if (i10 < tLObjectArr.length && (tLObject = tLObjectArr[i10]) != null) {
                this.f29393b[i10].p(tLObject);
                this.f29394c[i10].i0(tLObjectArr[i10], this.f29393b[i10], null);
            } else {
                Paint paint = new Paint(1);
                int[] iArr = {org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28115ra, q1Var.Pb), org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28244y6, q1Var.Pb)))};
                paint.setColor(iArr[0]);
                this.f29394c[i10].w0(new org.telegram.ui.ActionBar.u2(q1Var, iArr, paint));
            }
        }
        if (q1Var.N0) {
            a();
        }
        this.d.setTextSize(org.telegram.messenger.g0.L(11.0f));
        boolean q10 = p10.i(q1Var.Z5).q();
        this.f29395e = id.M0(q10 ? 2131748331 : 2131743857, null);
        this.f29398i.setStyle(Paint.Style.STROKE);
        this.f29397g = true;
        this.h = q10 ? null : q1Var.getContext().getResources().getDrawable(2131231976).mutate();
        if (b(this.f29404o) == null) {
            this.f29400k = null;
        } else {
            this.f29400k = new my0(jg.g.j(i7, "+"), 9.33f, org.telegram.messenger.g0.o());
        }
    }

    public static String b(TLObject tLObject) {
        int i7;
        if (tLObject instanceof TLRPC.Chat) {
            int i10 = ((TLRPC.Chat) tLObject).participants_count;
            if (i10 > 1) {
                return id.S(null, i10);
            }
        } else if ((tLObject instanceof TLRPC.User) && (i7 = ((TLRPC.User) tLObject).bot_active_users) > 1) {
            return id.S(null, i7);
        }
        return null;
    }

    public final void a() {
        int i7 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.f29394c;
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
        this.f29398i = new Paint(1);
        this.f29399j = new Paint(1);
        new Paint(1);
        this.f29392a = q1Var;
        this.f29404o = tLObject;
        this.f29403n = new j0(q1Var, q1Var, 1);
        this.f29394c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.H0(q1Var);
        imageReceiverArr[0].J0(org.telegram.messenger.g0.L(54.0f));
        if (q1Var.N0) {
            a();
        }
        this.f29393b = r1;
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.w8[] w8VarArr = {w8Var};
        w8Var.p(tLObject);
        imageReceiverArr[0].i0(tLObject, w8VarArr[0], null);
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
        if (tLObject instanceof TLRPC.Chat) {
            charSequence = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.User) {
            charSequence = t10.p((TLRPC.User) tLObject);
        } else {
            charSequence = "";
        }
        try {
            charSequence = org.telegram.messenger.i6.m(charSequence, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        this.f29395e = charSequence;
        this.f29398i.setStyle(Paint.Style.STROKE);
        this.f29397g = false;
        this.h = q1Var.getContext().getResources().getDrawable(2131231970).mutate();
        if (b(tLObject) == null) {
            this.f29400k = null;
        } else {
            this.f29400k = new my0(b(tLObject), 9.33f, org.telegram.messenger.g0.o());
        }
    }
}
