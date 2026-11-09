package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import bi.de;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sc;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.xq;
public final class f3 {
    public final g5 f39287a;
    public ValueAnimator f39288b;
    public int f39289c;
    public int d;
    public int f39290e;
    public int f39291f;
    public int f39292g;
    public int h;
    public int f39293i;
    public int f39294j;
    public final r2 f39295k;
    public final int f39296l;
    public int f39297m = 0;
    public float f39298n = 0.0f;
    public int f39299o;
    public int f39300p;
    public boolean f39301q;
    public ValueAnimator f39302r;

    public f3(TLRPC.User user, r2 r2Var, int i7) {
        this.f39295k = r2Var;
        this.f39296l = i7;
        boolean e10 = sc.e(512);
        long m10 = t10.m(user);
        if (e10 && m10 != 0) {
            g5 g5Var = new g5(i7, 13, r2Var, false);
            this.f39287a = g5Var;
            g5Var.j(m10, false);
            g5Var.k(-16777216);
            g5Var.f33870w = this.f39297m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f39288b = ofFloat;
            ofFloat.addUpdateListener(new de(21, this, r2Var));
            this.f39290e = org.telegram.messenger.g0.L(12.0f) + this.f39289c;
            this.f39291f = org.telegram.messenger.g0.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.f21334b;
            this.f39289c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.f39288b.setInterpolator(new LinearInterpolator());
            this.f39288b.addListener(new e3(this));
            this.f39288b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        g5 g5Var = this.f39287a;
        if (g5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f39298n;
        canvas.scale(f10, f10, this.f39299o / 2.0f, org.telegram.messenger.g0.L(300.0f));
        canvas.translate(this.f39293i - this.f39300p, this.f39294j);
        int i7 = this.f39292g;
        int i10 = this.h;
        int i11 = this.f39296l;
        g5Var.setBounds(i7, i10, i7 + i11, i11 + i10);
        g5Var.f33870w = this.f39297m;
        g5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i7, int i10) {
        int i11;
        di.z2 z2Var;
        g5 g5Var = this.f39287a;
        if (g5Var != null) {
            this.f39293i = i7;
            this.f39294j = i10;
            this.f39295k.invalidate();
            if (!this.f39301q) {
                Drawable drawable = g5Var.f33866f[0];
                if ((drawable instanceof i5) && ((z2Var = ((i5) drawable).f34568k) == null || !z2Var.J())) {
                    return;
                }
                this.f39301q = true;
                if (this.f39293i > this.f39299o / 2) {
                    i11 = org.telegram.messenger.g0.L(12);
                } else {
                    i11 = -org.telegram.messenger.g0.L(12);
                }
                this.f39300p = i11;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new xq(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new d3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(xq.f40458f);
                ofInt.addUpdateListener(new d3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
