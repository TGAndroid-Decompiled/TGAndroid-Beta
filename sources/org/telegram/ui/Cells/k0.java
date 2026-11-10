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
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.my0;
public final class k0 {
    public final q1 f29407a;
    public final org.telegram.ui.Components.v8[] f29408b;
    public final ImageReceiver[] f29409c;
    public final TextPaint d;
    public final CharSequence f29410e;
    public StaticLayout f29411f;
    public final boolean f29412g;
    public final Drawable h;
    public final Paint f29413i;
    public final Paint f29414j;
    public final my0 f29415k;
    public boolean f29416l;
    public boolean f29417m;
    public final hc f29418n;
    public final TLObject f29419o;

    public k0(q1 q1Var, TLObject[] tLObjectArr, int i7) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f29413i = new Paint(1);
        this.f29414j = new Paint(1);
        new Paint(1);
        this.f29407a = q1Var;
        this.f29419o = tLObjectArr[0];
        this.f29418n = new j0(q1Var, q1Var, 0);
        this.f29409c = new ImageReceiver[3];
        this.f29408b = new org.telegram.ui.Components.v8[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f29409c[i10] = new ImageReceiver(q1Var);
            this.f29409c[i10].H0(q1Var);
            this.f29409c[i10].J0(org.telegram.messenger.g0.L(54.0f));
            this.f29408b[i10] = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
            if (i10 < tLObjectArr.length && (tLObject = tLObjectArr[i10]) != null) {
                this.f29408b[i10].p(tLObject);
                this.f29409c[i10].i0(tLObjectArr[i10], this.f29408b[i10], null);
            } else {
                Paint paint = new Paint(1);
                int[] iArr = {org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28153ra, q1Var.Pb), org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28282y6, q1Var.Pb)))};
                paint.setColor(iArr[0]);
                this.f29409c[i10].w0(new org.telegram.ui.ActionBar.v2(q1Var, iArr, paint));
            }
        }
        if (q1Var.N0) {
            a();
        }
        this.d.setTextSize(org.telegram.messenger.g0.L(11.0f));
        boolean q10 = p10.i(q1Var.Z5).q();
        this.f29410e = id.M0(q10 ? 2131748330 : 2131743854, null);
        this.f29413i.setStyle(Paint.Style.STROKE);
        this.f29412g = true;
        this.h = q10 ? null : q1Var.getContext().getResources().getDrawable(2131231976).mutate();
        if (b(this.f29419o) == null) {
            this.f29415k = null;
        } else {
            this.f29415k = new my0(jg.g.j(i7, "+"), 9.33f, org.telegram.messenger.g0.o());
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
            ImageReceiver[] imageReceiverArr = this.f29409c;
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
        this.f29413i = new Paint(1);
        this.f29414j = new Paint(1);
        new Paint(1);
        this.f29407a = q1Var;
        this.f29419o = tLObject;
        this.f29418n = new j0(q1Var, q1Var, 1);
        this.f29409c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.H0(q1Var);
        imageReceiverArr[0].J0(org.telegram.messenger.g0.L(54.0f));
        if (q1Var.N0) {
            a();
        }
        this.f29408b = r1;
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.v8[] v8VarArr = {v8Var};
        v8Var.p(tLObject);
        imageReceiverArr[0].i0(tLObject, v8VarArr[0], null);
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
        this.f29410e = charSequence;
        this.f29413i.setStyle(Paint.Style.STROKE);
        this.f29412g = false;
        this.h = q1Var.getContext().getResources().getDrawable(2131231970).mutate();
        if (b(tLObject) == null) {
            this.f29415k = null;
        } else {
            this.f29415k = new my0(b(tLObject), 9.33f, org.telegram.messenger.g0.o());
        }
    }
}
