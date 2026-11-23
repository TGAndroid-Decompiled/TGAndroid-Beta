package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.n10;
import org.telegram.messenger.pc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m5;
import org.telegram.ui.Components.o5;
public final class j3 {
    public final m5 f40960a;
    public ValueAnimator f40961b;
    public int f40962c;
    public int d;
    public int f40963e;
    public int f40964f;
    public int f40965g;
    public int h;
    public int f40966i;
    public int f40967j;
    public final v2 f40968k;
    public final int f40969l;
    public int f40970m = 0;
    public float f40971n = 0.0f;
    public int f40972o;
    public int f40973p;
    public boolean f40974q;
    public ValueAnimator f40975r;

    public j3(TLRPC.User user, v2 v2Var, int i7) {
        this.f40968k = v2Var;
        this.f40969l = i7;
        boolean e10 = pc.e(512);
        long n10 = n10.n(user);
        if (e10 && n10 != 0) {
            m5 m5Var = new m5(i7, 13, v2Var, false);
            this.f40960a = m5Var;
            m5Var.j(n10, false);
            m5Var.k(-16777216);
            m5Var.f37380w = this.f40970m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f40961b = ofFloat;
            ofFloat.addUpdateListener(new ch.w(20, this, v2Var));
            this.f40963e = org.telegram.messenger.g0.L(12.0f) + this.f40962c;
            this.f40964f = org.telegram.messenger.g0.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.f22875b;
            this.f40962c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
            this.f40961b.setInterpolator(new LinearInterpolator());
            this.f40961b.addListener(new i3(this));
            this.f40961b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        m5 m5Var = this.f40960a;
        if (m5Var == null) {
            return;
        }
        canvas.save();
        float f10 = this.f40971n;
        canvas.scale(f10, f10, this.f40972o / 2.0f, org.telegram.messenger.g0.L(300.0f));
        canvas.translate(this.f40966i - this.f40973p, this.f40967j);
        int i7 = this.f40965g;
        int i10 = this.h;
        int i11 = this.f40969l;
        m5Var.setBounds(i7, i10, i7 + i11, i11 + i10);
        m5Var.f37380w = this.f40970m;
        m5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i7, int i10) {
        int i11;
        fi.s2 s2Var;
        m5 m5Var = this.f40960a;
        if (m5Var != null) {
            this.f40966i = i7;
            this.f40967j = i10;
            this.f40968k.invalidate();
            if (!this.f40974q) {
                Drawable drawable = m5Var.f37376f[0];
                if ((drawable instanceof o5) && ((s2Var = ((o5) drawable).f38028k) == null || !s2Var.K())) {
                    return;
                }
                this.f40974q = true;
                if (this.f40966i > this.f40972o / 2) {
                    i11 = org.telegram.messenger.g0.L(12);
                } else {
                    i11 = -org.telegram.messenger.g0.L(12);
                }
                this.f40973p = i11;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new kr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new h3(this, 0));
                long j3 = 350;
                ofFloat.setDuration(j3);
                long j10 = 180;
                ofFloat.setStartDelay(j10);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(kr.f36858f);
                ofInt.addUpdateListener(new h3(this, 1));
                ofInt.setStartDelay(j10);
                ofInt.setDuration(j3);
                ofInt.start();
            }
        }
    }
}
