package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import bi.de;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rc;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.xq;
public final class f3 {
    public final g5 f39142a;
    public ValueAnimator f39143b;
    public int f39144c;
    public int d;
    public int f39145e;
    public int f39146f;
    public int f39147g;
    public int h;
    public int f39148i;
    public int f39149j;
    public final r2 f39150k;
    public final int f39151l;
    public int f39152m = 0;
    public float f39153n = 0.0f;
    public int f39154o;
    public int f39155p;
    public boolean f39156q;
    public ValueAnimator f39157r;

    public f3(TLRPC.User user, r2 r2Var, int i7) {
        this.f39150k = r2Var;
        this.f39151l = i7;
        boolean e10 = rc.e(512);
        long m10 = t10.m(user);
        if (e10 && m10 != 0) {
            g5 g5Var = new g5(i7, 13, r2Var, false);
            this.f39142a = g5Var;
            g5Var.j(m10, false);
            g5Var.k(-16777216);
            g5Var.f33793w = this.f39152m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f39143b = ofFloat;
            ofFloat.addUpdateListener(new de(21, this, r2Var));
            this.f39145e = org.telegram.messenger.g0.L(12.0f) + this.f39144c;
            this.f39146f = org.telegram.messenger.g0.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.f21331b;
            this.f39144c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.f39143b.setInterpolator(new LinearInterpolator());
            this.f39143b.addListener(new e3(this));
            this.f39143b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        g5 g5Var = this.f39142a;
        if (g5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f39153n;
        canvas.scale(f10, f10, this.f39154o / 2.0f, org.telegram.messenger.g0.L(300.0f));
        canvas.translate(this.f39148i - this.f39155p, this.f39149j);
        int i7 = this.f39147g;
        int i10 = this.h;
        int i11 = this.f39151l;
        g5Var.setBounds(i7, i10, i7 + i11, i11 + i10);
        g5Var.f33793w = this.f39152m;
        g5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i7, int i10) {
        int i11;
        di.z2 z2Var;
        g5 g5Var = this.f39142a;
        if (g5Var != null) {
            this.f39148i = i7;
            this.f39149j = i10;
            this.f39150k.invalidate();
            if (!this.f39156q) {
                Drawable drawable = g5Var.f33789f[0];
                if ((drawable instanceof i5) && ((z2Var = ((i5) drawable).f34450k) == null || !z2Var.J())) {
                    return;
                }
                this.f39156q = true;
                if (this.f39148i > this.f39154o / 2) {
                    i11 = org.telegram.messenger.g0.L(12);
                } else {
                    i11 = -org.telegram.messenger.g0.L(12);
                }
                this.f39155p = i11;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new xq(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new d3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(xq.f40329f);
                ofInt.addUpdateListener(new d3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
