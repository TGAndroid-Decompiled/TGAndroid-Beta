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
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m5;
import org.telegram.ui.Components.o5;
public final class i3 {
    public final m5 f40929a;
    public ValueAnimator f40930b;
    public int f40931c;
    public int d;
    public int f40932e;
    public int f40933f;
    public int f40934g;
    public int h;
    public int f40935i;
    public int f40936j;
    public final u2 f40937k;
    public final int f40938l;
    public int f40939m = 0;
    public float f40940n = 0.0f;
    public int f40941o;
    public int f40942p;
    public boolean f40943q;
    public ValueAnimator f40944r;

    public i3(TLRPC.User user, u2 u2Var, int i7) {
        this.f40937k = u2Var;
        this.f40938l = i7;
        boolean e10 = pc.e(512);
        long n10 = o10.n(user);
        if (e10 && n10 != 0) {
            m5 m5Var = new m5(i7, 13, u2Var, false);
            this.f40929a = m5Var;
            m5Var.j(n10, false);
            m5Var.k(-16777216);
            m5Var.f37365w = this.f40939m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f40930b = ofFloat;
            ofFloat.addUpdateListener(new ch.w(20, this, u2Var));
            this.f40932e = org.telegram.messenger.g0.L(12.0f) + this.f40931c;
            this.f40933f = org.telegram.messenger.g0.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.f22780b;
            this.f40931c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.f40930b.setInterpolator(new LinearInterpolator());
            this.f40930b.addListener(new h3(this));
            this.f40930b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        m5 m5Var = this.f40929a;
        if (m5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f40940n;
        canvas.scale(f10, f10, this.f40941o / 2.0f, org.telegram.messenger.g0.L(300.0f));
        canvas.translate(this.f40935i - this.f40942p, this.f40936j);
        int i7 = this.f40934g;
        int i10 = this.h;
        int i11 = this.f40938l;
        m5Var.setBounds(i7, i10, i7 + i11, i11 + i10);
        m5Var.f37365w = this.f40939m;
        m5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i7, int i10) {
        int i11;
        fi.s2 s2Var;
        m5 m5Var = this.f40929a;
        if (m5Var != null) {
            this.f40935i = i7;
            this.f40936j = i10;
            this.f40937k.invalidate();
            if (!this.f40943q) {
                Drawable drawable = m5Var.f37361f[0];
                if ((drawable instanceof o5) && ((s2Var = ((o5) drawable).f37976k) == null || !s2Var.J())) {
                    return;
                }
                this.f40943q = true;
                if (this.f40935i > this.f40941o / 2) {
                    i11 = org.telegram.messenger.g0.L(12);
                } else {
                    i11 = -org.telegram.messenger.g0.L(12);
                }
                this.f40942p = i11;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new lr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new g3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(lr.f37208f);
                ofInt.addUpdateListener(new g3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
