package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.qz0;
public final class k0 {
    public final q1 f22103a;
    public final org.telegram.ui.Components.r8[] f22104b;
    public final ImageReceiver[] f22105c;
    public final TextPaint d;
    public final CharSequence e;
    public StaticLayout f22106f;
    public final boolean f22107g;
    public final Drawable h;
    public final Paint f22108i;
    public final Paint f22109j;
    public final qz0 f22110k;
    public boolean f22111l;
    public boolean f22112m;
    public final dc f22113n;
    public final TLObject f22114o;

    public k0(q1 q1Var, TLObject[] tLObjectArr, int i10) {
        TLObject tLObject;
        this.d = new TextPaint(1);
        this.f22108i = new Paint(1);
        this.f22109j = new Paint(1);
        new Paint(1);
        this.f22103a = q1Var;
        this.f22114o = tLObjectArr[0];
        this.f22113n = new j0(q1Var, q1Var, 0);
        this.f22105c = new ImageReceiver[3];
        this.f22104b = new org.telegram.ui.Components.r8[3];
        for (int i11 = 0; i11 < 3; i11++) {
            this.f22105c[i11] = new ImageReceiver(q1Var);
            this.f22105c[i11].H0(q1Var);
            this.f22105c[i11].J0(org.telegram.messenger.i0.L(54.0f));
            this.f22104b[i11] = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            if (i11 < tLObjectArr.length && (tLObject = tLObjectArr[i11]) != null) {
                this.f22104b[i11].p(tLObject);
                this.f22105c[i11].i0(tLObjectArr[i11], this.f22104b[i11], null);
            } else {
                Paint paint = new Paint(1);
                int[] iArr = {org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21190ra, q1Var.Ob), org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21311y6, q1Var.Ob)))};
                paint.setColor(iArr[0]);
                this.f22105c[i11].w0(new org.telegram.ui.ActionBar.y2(q1Var, iArr, paint));
            }
        }
        if (q1Var.N0) {
            a();
        }
        this.d.setTextSize(org.telegram.messenger.i0.L(11.0f));
        boolean q6 = d20.i(q1Var.Y5).q();
        this.e = cd.L0(q6 ? 2131748345 : 2131743879, null);
        this.f22108i.setStyle(Paint.Style.STROKE);
        this.f22107g = true;
        this.h = q6 ? null : q1Var.getContext().getResources().getDrawable(2131231975).mutate();
        if (b(this.f22114o) == null) {
            this.f22110k = null;
        } else {
            this.f22110k = new qz0(i0.a.i(i10, "+"), 9.33f, org.telegram.messenger.i0.o());
        }
    }

    public static String b(TLObject tLObject) {
        int i10;
        if (tLObject instanceof TLRPC.Chat) {
            int i11 = ((TLRPC.Chat) tLObject).participants_count;
            if (i11 > 1) {
                return cd.S(null, i11);
            }
        } else if ((tLObject instanceof TLRPC.User) && (i10 = ((TLRPC.User) tLObject).bot_active_users) > 1) {
            return cd.S(null, i10);
        }
        return null;
    }

    public final void a() {
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.f22105c;
            if (i10 < imageReceiverArr.length) {
                imageReceiverArr[i10].P();
                i10++;
            } else {
                return;
            }
        }
    }

    public k0(q1 q1Var, TLObject tLObject) {
        CharSequence charSequence;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.f22108i = new Paint(1);
        this.f22109j = new Paint(1);
        new Paint(1);
        this.f22103a = q1Var;
        this.f22114o = tLObject;
        this.f22113n = new j0(q1Var, q1Var, 1);
        this.f22105c = r2;
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        ImageReceiver[] imageReceiverArr = {imageReceiver};
        imageReceiver.H0(q1Var);
        imageReceiverArr[0].J0(org.telegram.messenger.i0.L(54.0f));
        if (q1Var.N0) {
            a();
        }
        this.f22104b = r1;
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.r8[] r8VarArr = {r8Var};
        r8Var.p(tLObject);
        imageReceiverArr[0].i0(tLObject, r8VarArr[0], null);
        textPaint.setTextSize(org.telegram.messenger.i0.L(11.0f));
        if (tLObject instanceof TLRPC.Chat) {
            charSequence = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.User) {
            charSequence = h20.p((TLRPC.User) tLObject);
        } else {
            charSequence = "";
        }
        try {
            charSequence = org.telegram.messenger.k6.m(charSequence, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        this.e = charSequence;
        this.f22108i.setStyle(Paint.Style.STROKE);
        this.f22107g = false;
        this.h = q1Var.getContext().getResources().getDrawable(2131231969).mutate();
        if (b(tLObject) == null) {
            this.f22110k = null;
        } else {
            this.f22110k = new qz0(b(tLObject), 9.33f, org.telegram.messenger.i0.o());
        }
    }
}
