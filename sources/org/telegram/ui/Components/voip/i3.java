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
    public final n5 f41066a;
    public ValueAnimator f41067b;
    public int f41068c;
    public int d;
    public int f41069e;
    public int f41070f;
    public int f41071g;
    public int h;
    public int f41072i;
    public int f41073j;
    public final u2 f41074k;
    public final int f41075l;
    public int f41076m = 0;
    public float f41077n = 0.0f;
    public int f41078o;
    public int f41079p;
    public boolean f41080q;
    public ValueAnimator f41081r;

    public i3(TLRPC.User user, u2 u2Var, int i7) {
        this.f41074k = u2Var;
        this.f41075l = i7;
        boolean e10 = qc.e(512);
        long n10 = p10.n(user);
        if (e10 && n10 != 0) {
            n5 n5Var = new n5(i7, 13, u2Var, false);
            this.f41066a = n5Var;
            n5Var.j(n10, false);
            n5Var.k(-16777216);
            n5Var.f37782w = this.f41076m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f41067b = ofFloat;
            ofFloat.addUpdateListener(new ch.w(20, this, u2Var));
            this.f41069e = org.telegram.messenger.g0.L(12.0f) + this.f41068c;
            this.f41070f = org.telegram.messenger.g0.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.f22808b;
            this.f41068c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.f41067b.setInterpolator(new LinearInterpolator());
            this.f41067b.addListener(new h3(this));
            this.f41067b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        n5 n5Var = this.f41066a;
        if (n5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f41077n;
        canvas.scale(f10, f10, this.f41078o / 2.0f, org.telegram.messenger.g0.L(300.0f));
        canvas.translate(this.f41072i - this.f41079p, this.f41073j);
        int i7 = this.f41071g;
        int i10 = this.h;
        int i11 = this.f41075l;
        n5Var.setBounds(i7, i10, i7 + i11, i11 + i10);
        n5Var.f37782w = this.f41076m;
        n5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i7, int i10) {
        int i11;
        fi.s2 s2Var;
        n5 n5Var = this.f41066a;
        if (n5Var != null) {
            this.f41072i = i7;
            this.f41073j = i10;
            this.f41074k.invalidate();
            if (!this.f41080q) {
                Drawable drawable = n5Var.f37778f[0];
                if ((drawable instanceof p5) && ((s2Var = ((p5) drawable).f38500k) == null || !s2Var.J())) {
                    return;
                }
                this.f41080q = true;
                if (this.f41072i > this.f41078o / 2) {
                    i11 = org.telegram.messenger.g0.L(12);
                } else {
                    i11 = -org.telegram.messenger.g0.L(12);
                }
                this.f41079p = i11;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new nr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new g3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(nr.f37961f);
                ofInt.addUpdateListener(new g3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
