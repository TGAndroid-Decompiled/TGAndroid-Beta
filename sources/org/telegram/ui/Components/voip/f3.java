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
    public final g5 f39163a;
    public ValueAnimator f39164b;
    public int f39165c;
    public int d;
    public int f39166e;
    public int f39167f;
    public int f39168g;
    public int h;
    public int f39169i;
    public int f39170j;
    public final r2 f39171k;
    public final int f39172l;
    public int f39173m = 0;
    public float f39174n = 0.0f;
    public int f39175o;
    public int f39176p;
    public boolean f39177q;
    public ValueAnimator f39178r;

    public f3(TLRPC.User user, r2 r2Var, int i7) {
        this.f39171k = r2Var;
        this.f39172l = i7;
        boolean e10 = rc.e(512);
        long m10 = t10.m(user);
        if (e10 && m10 != 0) {
            g5 g5Var = new g5(i7, 13, r2Var, false);
            this.f39163a = g5Var;
            g5Var.j(m10, false);
            g5Var.k(-16777216);
            g5Var.f33829w = this.f39173m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f39164b = ofFloat;
            ofFloat.addUpdateListener(new de(21, this, r2Var));
            this.f39166e = org.telegram.messenger.g0.L(12.0f) + this.f39165c;
            this.f39167f = org.telegram.messenger.g0.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.f21331b;
            this.f39165c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.f39164b.setInterpolator(new LinearInterpolator());
            this.f39164b.addListener(new e3(this));
            this.f39164b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        g5 g5Var = this.f39163a;
        if (g5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f39174n;
        canvas.scale(f10, f10, this.f39175o / 2.0f, org.telegram.messenger.g0.L(300.0f));
        canvas.translate(this.f39169i - this.f39176p, this.f39170j);
        int i7 = this.f39168g;
        int i10 = this.h;
        int i11 = this.f39172l;
        g5Var.setBounds(i7, i10, i7 + i11, i11 + i10);
        g5Var.f33829w = this.f39173m;
        g5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i7, int i10) {
        int i11;
        di.z2 z2Var;
        g5 g5Var = this.f39163a;
        if (g5Var != null) {
            this.f39169i = i7;
            this.f39170j = i10;
            this.f39171k.invalidate();
            if (!this.f39177q) {
                Drawable drawable = g5Var.f33825f[0];
                if ((drawable instanceof i5) && ((z2Var = ((i5) drawable).f34497k) == null || !z2Var.J())) {
                    return;
                }
                this.f39177q = true;
                if (this.f39169i > this.f39175o / 2) {
                    i11 = org.telegram.messenger.g0.L(12);
                } else {
                    i11 = -org.telegram.messenger.g0.L(12);
                }
                this.f39176p = i11;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new xq(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new d3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(xq.f40345f);
                ofInt.addUpdateListener(new d3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
