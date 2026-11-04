package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ly0;
public final class k0 {
    public final q1 f29466a;
    public final org.telegram.ui.Components.u8[] f29467b;
    public final ImageReceiver[] f29468c;
    public final TextPaint d;
    public final CharSequence f29469e;
    public StaticLayout f29470f;
    public final boolean f29471g;
    public final Drawable h;
    public final Paint f29472i;
    public final Paint f29473j;
    public final ly0 f29474k;
    public boolean f29475l;
    public boolean f29476m;
    public final gc f29477n;
    public final TLObject f29478o;

    public k0(q1 q1Var, TLObject[] tLObjectArr, int i3) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f29472i = new Paint(1);
        this.f29473j = new Paint(1);
        new Paint(1);
        this.f29466a = q1Var;
        this.f29478o = tLObjectArr[0];
        this.f29477n = new j0(q1Var, q1Var, 0);
        this.f29468c = new ImageReceiver[3];
        this.f29467b = new org.telegram.ui.Components.u8[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f29468c[i10] = new ImageReceiver(q1Var);
            this.f29468c[i10].H0(q1Var);
            this.f29468c[i10].J0(org.telegram.messenger.g0.L(54.0f));
            this.f29467b[i10] = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
            if (i10 < tLObjectArr.length && (tLObject = tLObjectArr[i10]) != null) {
                this.f29467b[i10].p(tLObject);
                this.f29468c[i10].i0(tLObjectArr[i10], this.f29467b[i10], null);
            } else {
                Paint paint = new Paint(1);
                int[] iArr = {org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28143ra, q1Var.Pb), org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, q1Var.Pb)))};
                paint.setColor(iArr[0]);
                this.f29468c[i10].w0(new org.telegram.ui.ActionBar.s2(q1Var, iArr, paint));
            }
        }
        if (q1Var.O0) {
            a();
        }
        this.d.setTextSize(org.telegram.messenger.g0.L(11.0f));
        boolean q10 = h10.i(q1Var.Z5).q();
        this.f29469e = bd.M0(q10 ? 2131748338 : 2131743864, null);
        this.f29472i.setStyle(Paint.Style.STROKE);
        this.f29471g = true;
        this.h = q10 ? null : q1Var.getContext().getResources().getDrawable(2131231976).mutate();
        if (b(this.f29478o) == null) {
            this.f29474k = null;
        } else {
            this.f29474k = new ly0(k2.p1.i(i3, "+"), 9.33f, org.telegram.messenger.g0.o());
        }
    }

    public static String b(TLObject tLObject) {
        int i3;
        if (tLObject instanceof TLRPC.Chat) {
            int i10 = ((TLRPC.Chat) tLObject).participants_count;
            if (i10 > 1) {
                return bd.S(null, i10);
            }
        } else if ((tLObject instanceof TLRPC.User) && (i3 = ((TLRPC.User) tLObject).bot_active_users) > 1) {
            return bd.S(null, i3);
        }
        return null;
    }

    public final void a() {
        int i3 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.f29468c;
            if (i3 < imageReceiverArr.length) {
                imageReceiverArr[i3].P();
                i3++;
            } else {
                return;
            }
        }
    }

    public k0(q1 q1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f29472i = new Paint(1);
        this.f29473j = new Paint(1);
        new Paint(1);
        this.f29466a = q1Var;
        this.f29478o = tLObject;
        this.f29477n = new j0(q1Var, q1Var, 1);
        this.f29468c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.H0(q1Var);
        imageReceiverArr[0].J0(org.telegram.messenger.g0.L(54.0f));
        if (q1Var.O0) {
            a();
        }
        this.f29467b = r1;
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.u8[] u8VarArr = {u8Var};
        u8Var.p(tLObject);
        imageReceiverArr[0].i0(tLObject, u8VarArr[0], null);
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
        if (tLObject instanceof TLRPC.Chat) {
            charSequence = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.User) {
            charSequence = l10.p((TLRPC.User) tLObject);
        } else {
            charSequence = "";
        }
        try {
            charSequence = org.telegram.messenger.i6.m(charSequence, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        this.f29469e = charSequence;
        this.f29472i.setStyle(Paint.Style.STROKE);
        this.f29471g = false;
        this.h = q1Var.getContext().getResources().getDrawable(2131231970).mutate();
        if (b(tLObject) == null) {
            this.f29474k = null;
        } else {
            this.f29474k = new ly0(b(tLObject), 9.33f, org.telegram.messenger.g0.o());
        }
    }
}
