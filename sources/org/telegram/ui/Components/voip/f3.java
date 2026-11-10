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
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.wq;
public final class f3 {
    public final f5 f39207a;
    public ValueAnimator f39208b;
    public int f39209c;
    public int d;
    public int f39210e;
    public int f39211f;
    public int f39212g;
    public int h;
    public int f39213i;
    public int f39214j;
    public final r2 f39215k;
    public final int f39216l;
    public int f39217m = 0;
    public float f39218n = 0.0f;
    public int f39219o;
    public int f39220p;
    public boolean f39221q;
    public ValueAnimator f39222r;

    public f3(TLRPC.User user, r2 r2Var, int i7) {
        this.f39215k = r2Var;
        this.f39216l = i7;
        boolean e10 = sc.e(512);
        long m10 = t10.m(user);
        if (e10 && m10 != 0) {
            f5 f5Var = new f5(i7, 13, r2Var, false);
            this.f39207a = f5Var;
            f5Var.j(m10, false);
            f5Var.k(-16777216);
            f5Var.f33468w = this.f39217m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f39208b = ofFloat;
            ofFloat.addUpdateListener(new de(21, this, r2Var));
            this.f39210e = org.telegram.messenger.g0.L(12.0f) + this.f39209c;
            this.f39211f = org.telegram.messenger.g0.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.f21339b;
            this.f39209c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.f39208b.setInterpolator(new LinearInterpolator());
            this.f39208b.addListener(new e3(this));
            this.f39208b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        f5 f5Var = this.f39207a;
        if (f5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f39218n;
        canvas.scale(f10, f10, this.f39219o / 2.0f, org.telegram.messenger.g0.L(300.0f));
        canvas.translate(this.f39213i - this.f39220p, this.f39214j);
        int i7 = this.f39212g;
        int i10 = this.h;
        int i11 = this.f39216l;
        f5Var.setBounds(i7, i10, i7 + i11, i11 + i10);
        f5Var.f33468w = this.f39217m;
        f5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i7, int i10) {
        int i11;
        di.z2 z2Var;
        f5 f5Var = this.f39207a;
        if (f5Var != null) {
            this.f39213i = i7;
            this.f39214j = i10;
            this.f39215k.invalidate();
            if (!this.f39221q) {
                Drawable drawable = f5Var.f33464f[0];
                if ((drawable instanceof h5) && ((z2Var = ((h5) drawable).f34176k) == null || !z2Var.J())) {
                    return;
                }
                this.f39221q = true;
                if (this.f39213i > this.f39219o / 2) {
                    i11 = org.telegram.messenger.g0.L(12);
                } else {
                    i11 = -org.telegram.messenger.g0.L(12);
                }
                this.f39220p = i11;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new wq(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new d3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(wq.f40046f);
                ofInt.addUpdateListener(new d3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
