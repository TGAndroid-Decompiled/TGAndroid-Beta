package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import ci.uc;
import ei.c3;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.l10;
import org.telegram.messenger.lc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.xq;
public final class u2 {
    public final e5 f39632a;
    public ValueAnimator f39633b;
    public int f39634c;
    public int d;
    public int f39635e;
    public int f39636f;
    public int f39637g;
    public int h;
    public int f39638i;
    public int f39639j;
    public final g2 f39640k;
    public final int f39641l;
    public int f39642m = 0;
    public float f39643n = 0.0f;
    public int f39644o;
    public int f39645p;
    public boolean f39646q;
    public ValueAnimator f39647r;

    public u2(TLRPC.User user, g2 g2Var, int i3) {
        this.f39640k = g2Var;
        this.f39641l = i3;
        boolean e10 = lc.e(512);
        long m10 = l10.m(user);
        if (e10 && m10 != 0) {
            e5 e5Var = new e5(i3, 13, g2Var, false);
            this.f39632a = e5Var;
            e5Var.j(m10, false);
            e5Var.k(-16777216);
            e5Var.f33290w = this.f39642m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f39633b = ofFloat;
            ofFloat.addUpdateListener(new uc(21, this, g2Var));
            this.f39635e = org.telegram.messenger.g0.L(12.0f) + this.f39634c;
            this.f39636f = org.telegram.messenger.g0.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.f21385b;
            this.f39634c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.f39633b.setInterpolator(new LinearInterpolator());
            this.f39633b.addListener(new t2(this));
            this.f39633b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        e5 e5Var = this.f39632a;
        if (e5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f39643n;
        canvas.scale(f10, f10, this.f39644o / 2.0f, org.telegram.messenger.g0.L(300.0f));
        canvas.translate(this.f39638i - this.f39645p, this.f39639j);
        int i3 = this.f39637g;
        int i10 = this.h;
        int i11 = this.f39641l;
        e5Var.setBounds(i3, i10, i3 + i11, i11 + i10);
        e5Var.f33290w = this.f39642m;
        e5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i3, int i10) {
        int i11;
        c3 c3Var;
        e5 e5Var = this.f39632a;
        if (e5Var != null) {
            this.f39638i = i3;
            this.f39639j = i10;
            this.f39640k.invalidate();
            if (!this.f39646q) {
                Drawable drawable = e5Var.f33286f[0];
                if ((drawable instanceof g5) && ((c3Var = ((g5) drawable).f33971k) == null || !c3Var.J())) {
                    return;
                }
                this.f39646q = true;
                if (this.f39638i > this.f39644o / 2) {
                    i11 = org.telegram.messenger.g0.L(12);
                } else {
                    i11 = -org.telegram.messenger.g0.L(12);
                }
                this.f39645p = i11;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new xq(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new s2(this, 0));
                long j10 = 350;
                ofFloat.setDuration(j10);
                long j11 = 180;
                ofFloat.setStartDelay(j11);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(xq.f40452f);
                ofInt.addUpdateListener(new s2(this, 1));
                ofInt.setStartDelay(j11);
                ofInt.setDuration(j10);
                ofInt.start();
            }
        }
    }
}
