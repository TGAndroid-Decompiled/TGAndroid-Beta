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
    public final n5 f41027a;
    public ValueAnimator f41028b;
    public int f41029c;
    public int d;
    public int f41030e;
    public int f41031f;
    public int f41032g;
    public int h;
    public int f41033i;
    public int f41034j;
    public final u2 f41035k;
    public final int f41036l;
    public int f41037m = 0;
    public float f41038n = 0.0f;
    public int f41039o;
    public int f41040p;
    public boolean f41041q;
    public ValueAnimator f41042r;

    public i3(TLRPC.User user, u2 u2Var, int i7) {
        this.f41035k = u2Var;
        this.f41036l = i7;
        boolean e10 = qc.e(512);
        long n10 = p10.n(user);
        if (e10 && n10 != 0) {
            n5 n5Var = new n5(i7, 13, u2Var, false);
            this.f41027a = n5Var;
            n5Var.j(n10, false);
            n5Var.k(-16777216);
            n5Var.f37737w = this.f41037m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f41028b = ofFloat;
            ofFloat.addUpdateListener(new ch.w(20, this, u2Var));
            this.f41030e = org.telegram.messenger.g0.L(12.0f) + this.f41029c;
            this.f41031f = org.telegram.messenger.g0.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.f22772b;
            this.f41029c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.f41028b.setInterpolator(new LinearInterpolator());
            this.f41028b.addListener(new h3(this));
            this.f41028b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        n5 n5Var = this.f41027a;
        if (n5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f41038n;
        canvas.scale(f10, f10, this.f41039o / 2.0f, org.telegram.messenger.g0.L(300.0f));
        canvas.translate(this.f41033i - this.f41040p, this.f41034j);
        int i7 = this.f41032g;
        int i10 = this.h;
        int i11 = this.f41036l;
        n5Var.setBounds(i7, i10, i7 + i11, i11 + i10);
        n5Var.f37737w = this.f41037m;
        n5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i7, int i10) {
        int i11;
        fi.s2 s2Var;
        n5 n5Var = this.f41027a;
        if (n5Var != null) {
            this.f41033i = i7;
            this.f41034j = i10;
            this.f41035k.invalidate();
            if (!this.f41041q) {
                Drawable drawable = n5Var.f37733f[0];
                if ((drawable instanceof p5) && ((s2Var = ((p5) drawable).f38457k) == null || !s2Var.J())) {
                    return;
                }
                this.f41041q = true;
                if (this.f41033i > this.f41039o / 2) {
                    i11 = org.telegram.messenger.g0.L(12);
                } else {
                    i11 = -org.telegram.messenger.g0.L(12);
                }
                this.f41040p = i11;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new nr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new g3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(nr.f37917f);
                ofInt.addUpdateListener(new g3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
