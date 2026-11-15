package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q10;
import org.telegram.messenger.qc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g5;
public final class j3 {
    public final e5 f40684a;
    public ValueAnimator f40685b;
    public int f40686c;
    public int d;
    public int f40687e;
    public int f40688f;
    public int f40689g;
    public int h;
    public int f40690i;
    public int f40691j;
    public final v2 f40692k;
    public final int f40693l;
    public int f40694m = 0;
    public float f40695n = 0.0f;
    public int f40696o;
    public int f40697p;
    public boolean f40698q;
    public ValueAnimator f40699r;

    public j3(TLRPC.User user, v2 v2Var, int i7) {
        this.f40692k = v2Var;
        this.f40693l = i7;
        boolean e10 = qc.e(512);
        long m10 = q10.m(user);
        if (e10 && m10 != 0) {
            e5 e5Var = new e5(i7, 13, v2Var, false);
            this.f40684a = e5Var;
            e5Var.j(m10, false);
            e5Var.k(-16777216);
            e5Var.f34185w = this.f40694m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f40685b = ofFloat;
            ofFloat.addUpdateListener(new ch.v(20, this, v2Var));
            this.f40687e = org.telegram.messenger.g0.L(12.0f) + this.f40686c;
            this.f40688f = org.telegram.messenger.g0.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.f22414b;
            this.f40686c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.f40685b.setInterpolator(new LinearInterpolator());
            this.f40685b.addListener(new i3(this));
            this.f40685b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        e5 e5Var = this.f40684a;
        if (e5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f40695n;
        canvas.scale(f10, f10, this.f40696o / 2.0f, org.telegram.messenger.g0.L(300.0f));
        canvas.translate(this.f40690i - this.f40697p, this.f40691j);
        int i7 = this.f40689g;
        int i10 = this.h;
        int i11 = this.f40693l;
        e5Var.setBounds(i7, i10, i7 + i11, i11 + i10);
        e5Var.f34185w = this.f40694m;
        e5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i7, int i10) {
        int i11;
        fi.u2 u2Var;
        e5 e5Var = this.f40684a;
        if (e5Var != null) {
            this.f40690i = i7;
            this.f40691j = i10;
            this.f40692k.invalidate();
            if (!this.f40698q) {
                Drawable drawable = e5Var.f34181f[0];
                if ((drawable instanceof g5) && ((u2Var = ((g5) drawable).f34813k) == null || !u2Var.J())) {
                    return;
                }
                this.f40698q = true;
                if (this.f40690i > this.f40696o / 2) {
                    i11 = org.telegram.messenger.g0.L(12);
                } else {
                    i11 = -org.telegram.messenger.g0.L(12);
                }
                this.f40697p = i11;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new er(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new h3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(er.f34419f);
                ofInt.addUpdateListener(new h3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
