package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.o10;
import org.telegram.messenger.pc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p5;
public final class i3 {
    public final n5 f41064a;
    public ValueAnimator f41065b;
    public int f41066c;
    public int d;
    public int f41067e;
    public int f41068f;
    public int f41069g;
    public int h;
    public int f41070i;
    public int f41071j;
    public final u2 f41072k;
    public final int f41073l;
    public int f41074m = 0;
    public float f41075n = 0.0f;
    public int f41076o;
    public int f41077p;
    public boolean f41078q;
    public ValueAnimator f41079r;

    public i3(TLRPC.User user, u2 u2Var, int i7) {
        this.f41072k = u2Var;
        this.f41073l = i7;
        boolean e10 = pc.e(512);
        long n10 = o10.n(user);
        if (e10 && n10 != 0) {
            n5 n5Var = new n5(i7, 13, u2Var, false);
            this.f41064a = n5Var;
            n5Var.j(n10, false);
            n5Var.k(-16777216);
            n5Var.f37777w = this.f41074m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f41065b = ofFloat;
            ofFloat.addUpdateListener(new ch.w(20, this, u2Var));
            this.f41067e = org.telegram.messenger.g0.L(12.0f) + this.f41066c;
            this.f41068f = org.telegram.messenger.g0.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.f22805b;
            this.f41066c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.f41065b.setInterpolator(new LinearInterpolator());
            this.f41065b.addListener(new h3(this));
            this.f41065b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        n5 n5Var = this.f41064a;
        if (n5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f41075n;
        canvas.scale(f10, f10, this.f41076o / 2.0f, org.telegram.messenger.g0.L(300.0f));
        canvas.translate(this.f41070i - this.f41077p, this.f41071j);
        int i7 = this.f41069g;
        int i10 = this.h;
        int i11 = this.f41073l;
        n5Var.setBounds(i7, i10, i7 + i11, i11 + i10);
        n5Var.f37777w = this.f41074m;
        n5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i7, int i10) {
        int i11;
        fi.s2 s2Var;
        n5 n5Var = this.f41064a;
        if (n5Var != null) {
            this.f41070i = i7;
            this.f41071j = i10;
            this.f41072k.invalidate();
            if (!this.f41078q) {
                Drawable drawable = n5Var.f37773f[0];
                if ((drawable instanceof p5) && ((s2Var = ((p5) drawable).f38501k) == null || !s2Var.J())) {
                    return;
                }
                this.f41078q = true;
                if (this.f41070i > this.f41076o / 2) {
                    i11 = org.telegram.messenger.g0.L(12);
                } else {
                    i11 = -org.telegram.messenger.g0.L(12);
                }
                this.f41077p = i11;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new nr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new g3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(nr.f37956f);
                ofInt.addUpdateListener(new g3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
