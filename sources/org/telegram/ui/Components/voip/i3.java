package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p10;
import org.telegram.messenger.qc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p5;
public final class i3 {
    public final n5 f41065a;
    public ValueAnimator f41066b;
    public int f41067c;
    public int d;
    public int f41068e;
    public int f41069f;
    public int f41070g;
    public int h;
    public int f41071i;
    public int f41072j;
    public final u2 f41073k;
    public final int f41074l;
    public int f41075m = 0;
    public float f41076n = 0.0f;
    public int f41077o;
    public int f41078p;
    public boolean f41079q;
    public ValueAnimator f41080r;

    public i3(TLRPC.User user, u2 u2Var, int i7) {
        this.f41073k = u2Var;
        this.f41074l = i7;
        boolean e10 = qc.e(512);
        long n10 = p10.n(user);
        if (e10 && n10 != 0) {
            n5 n5Var = new n5(i7, 13, u2Var, false);
            this.f41065a = n5Var;
            n5Var.j(n10, false);
            n5Var.k(-16777216);
            n5Var.f37781w = this.f41075m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f41066b = ofFloat;
            ofFloat.addUpdateListener(new ch.w(20, this, u2Var));
            this.f41068e = org.telegram.messenger.g0.L(12.0f) + this.f41067c;
            this.f41069f = org.telegram.messenger.g0.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.f22808b;
            this.f41067c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.f41066b.setInterpolator(new LinearInterpolator());
            this.f41066b.addListener(new h3(this));
            this.f41066b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        n5 n5Var = this.f41065a;
        if (n5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f41076n;
        canvas.scale(f10, f10, this.f41077o / 2.0f, org.telegram.messenger.g0.L(300.0f));
        canvas.translate(this.f41071i - this.f41078p, this.f41072j);
        int i7 = this.f41070g;
        int i10 = this.h;
        int i11 = this.f41074l;
        n5Var.setBounds(i7, i10, i7 + i11, i11 + i10);
        n5Var.f37781w = this.f41075m;
        n5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i7, int i10) {
        int i11;
        fi.s2 s2Var;
        n5 n5Var = this.f41065a;
        if (n5Var != null) {
            this.f41071i = i7;
            this.f41072j = i10;
            this.f41073k.invalidate();
            if (!this.f41079q) {
                Drawable drawable = n5Var.f37777f[0];
                if ((drawable instanceof p5) && ((s2Var = ((p5) drawable).f38499k) == null || !s2Var.J())) {
                    return;
                }
                this.f41079q = true;
                if (this.f41071i > this.f41077o / 2) {
                    i11 = org.telegram.messenger.g0.L(12);
                } else {
                    i11 = -org.telegram.messenger.g0.L(12);
                }
                this.f41078p = i11;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new nr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new g3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(nr.f37960f);
                ofInt.addUpdateListener(new g3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
