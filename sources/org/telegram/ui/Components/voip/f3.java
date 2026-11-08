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
    public final g5 f39198a;
    public ValueAnimator f39199b;
    public int f39200c;
    public int d;
    public int f39201e;
    public int f39202f;
    public int f39203g;
    public int h;
    public int f39204i;
    public int f39205j;
    public final r2 f39206k;
    public final int f39207l;
    public int f39208m = 0;
    public float f39209n = 0.0f;
    public int f39210o;
    public int f39211p;
    public boolean f39212q;
    public ValueAnimator f39213r;

    public f3(TLRPC.User user, r2 r2Var, int i7) {
        this.f39206k = r2Var;
        this.f39207l = i7;
        boolean e10 = sc.e(512);
        long m10 = t10.m(user);
        if (e10 && m10 != 0) {
            g5 g5Var = new g5(i7, 13, r2Var, false);
            this.f39198a = g5Var;
            g5Var.j(m10, false);
            g5Var.k(-16777216);
            g5Var.f33855w = this.f39208m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f39199b = ofFloat;
            ofFloat.addUpdateListener(new de(21, this, r2Var));
            this.f39201e = org.telegram.messenger.g0.L(12.0f) + this.f39200c;
            this.f39202f = org.telegram.messenger.g0.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.f21334b;
            this.f39200c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.f39199b.setInterpolator(new LinearInterpolator());
            this.f39199b.addListener(new e3(this));
            this.f39199b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        g5 g5Var = this.f39198a;
        if (g5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f39209n;
        canvas.scale(f10, f10, this.f39210o / 2.0f, org.telegram.messenger.g0.L(300.0f));
        canvas.translate(this.f39204i - this.f39211p, this.f39205j);
        int i7 = this.f39203g;
        int i10 = this.h;
        int i11 = this.f39207l;
        g5Var.setBounds(i7, i10, i7 + i11, i11 + i10);
        g5Var.f33855w = this.f39208m;
        g5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i7, int i10) {
        int i11;
        di.z2 z2Var;
        g5 g5Var = this.f39198a;
        if (g5Var != null) {
            this.f39204i = i7;
            this.f39205j = i10;
            this.f39206k.invalidate();
            if (!this.f39212q) {
                Drawable drawable = g5Var.f33851f[0];
                if ((drawable instanceof i5) && ((z2Var = ((i5) drawable).f34541k) == null || !z2Var.J())) {
                    return;
                }
                this.f39212q = true;
                if (this.f39204i > this.f39210o / 2) {
                    i11 = org.telegram.messenger.g0.L(12);
                } else {
                    i11 = -org.telegram.messenger.g0.L(12);
                }
                this.f39211p = i11;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new xq(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new d3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(xq.f40366f);
                ofInt.addUpdateListener(new d3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
