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
    public final g5 f39145a;
    public ValueAnimator f39146b;
    public int f39147c;
    public int d;
    public int f39148e;
    public int f39149f;
    public int f39150g;
    public int h;
    public int f39151i;
    public int f39152j;
    public final r2 f39153k;
    public final int f39154l;
    public int f39155m = 0;
    public float f39156n = 0.0f;
    public int f39157o;
    public int f39158p;
    public boolean f39159q;
    public ValueAnimator f39160r;

    public f3(TLRPC.User user, r2 r2Var, int i7) {
        this.f39153k = r2Var;
        this.f39154l = i7;
        boolean e10 = rc.e(512);
        long m10 = t10.m(user);
        if (e10 && m10 != 0) {
            g5 g5Var = new g5(i7, 13, r2Var, false);
            this.f39145a = g5Var;
            g5Var.j(m10, false);
            g5Var.k(-16777216);
            g5Var.f33862w = this.f39155m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f39146b = ofFloat;
            ofFloat.addUpdateListener(new de(21, this, r2Var));
            this.f39148e = org.telegram.messenger.g0.L(12.0f) + this.f39147c;
            this.f39149f = org.telegram.messenger.g0.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.f21331b;
            this.f39147c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.f39146b.setInterpolator(new LinearInterpolator());
            this.f39146b.addListener(new e3(this));
            this.f39146b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        g5 g5Var = this.f39145a;
        if (g5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f39156n;
        canvas.scale(f10, f10, this.f39157o / 2.0f, org.telegram.messenger.g0.L(300.0f));
        canvas.translate(this.f39151i - this.f39158p, this.f39152j);
        int i7 = this.f39150g;
        int i10 = this.h;
        int i11 = this.f39154l;
        g5Var.setBounds(i7, i10, i7 + i11, i11 + i10);
        g5Var.f33862w = this.f39155m;
        g5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i7, int i10) {
        int i11;
        di.z2 z2Var;
        g5 g5Var = this.f39145a;
        if (g5Var != null) {
            this.f39151i = i7;
            this.f39152j = i10;
            this.f39153k.invalidate();
            if (!this.f39159q) {
                Drawable drawable = g5Var.f33858f[0];
                if ((drawable instanceof i5) && ((z2Var = ((i5) drawable).f34505k) == null || !z2Var.J())) {
                    return;
                }
                this.f39159q = true;
                if (this.f39151i > this.f39157o / 2) {
                    i11 = org.telegram.messenger.g0.L(12);
                } else {
                    i11 = -org.telegram.messenger.g0.L(12);
                }
                this.f39158p = i11;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new xq(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new d3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(xq.f40310f);
                ofInt.addUpdateListener(new d3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
