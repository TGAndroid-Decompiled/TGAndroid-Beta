package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.h20;
import org.telegram.messenger.sc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
public final class v2 {
    public final d5 f31695a;
    public ValueAnimator f31696b;
    public int f31697c;
    public int d;
    public int e;
    public int f31698f;
    public int f31699g;
    public int h;
    public int f31700i;
    public int f31701j;
    public final f2 f31702k;
    public final int f31703l;
    public int f31704m = 0;
    public float f31705n = 0.0f;
    public int f31706o;
    public int f31707p;
    public boolean f31708q;
    public ValueAnimator f31709r;

    public v2(TLRPC.User user, f2 f2Var, int i10) {
        this.f31702k = f2Var;
        this.f31703l = i10;
        boolean e = sc.e(512);
        long m10 = h20.m(user);
        if (e && m10 != 0) {
            d5 d5Var = new d5(i10, 13, f2Var, false);
            this.f31695a = d5Var;
            d5Var.j(m10, false);
            d5Var.k(-16777216);
            d5Var.f25305w = this.f31704m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f31696b = ofFloat;
            ofFloat.addUpdateListener(new ag.p2(20, this, f2Var));
            this.e = org.telegram.messenger.i0.L(12.0f) + this.f31697c;
            this.f31698f = org.telegram.messenger.i0.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.f14519b;
            this.f31697c = org.telegram.messenger.i0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.i0.L(16.0f));
            this.d = org.telegram.messenger.i0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.i0.L(16.0f));
            this.f31696b.setInterpolator(new LinearInterpolator());
            this.f31696b.addListener(new u2(this));
            this.f31696b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        d5 d5Var = this.f31695a;
        if (d5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f31705n;
        canvas.scale(f7, f7, this.f31706o / 2.0f, org.telegram.messenger.i0.L(300.0f));
        canvas.translate(this.f31700i - this.f31707p, this.f31701j);
        int i10 = this.f31699g;
        int i11 = this.h;
        int i12 = this.f31703l;
        d5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        d5Var.f25305w = this.f31704m;
        d5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        ag.c2 c2Var;
        d5 d5Var = this.f31695a;
        if (d5Var != null) {
            this.f31700i = i10;
            this.f31701j = i11;
            this.f31702k.invalidate();
            if (!this.f31708q) {
                Drawable drawable = d5Var.f25301f[0];
                if ((drawable instanceof f5) && ((c2Var = ((f5) drawable).f25975k) == null || !c2Var.J())) {
                    return;
                }
                this.f31708q = true;
                if (this.f31700i > this.f31706o / 2) {
                    i12 = org.telegram.messenger.i0.L(12);
                } else {
                    i12 = -org.telegram.messenger.i0.L(12);
                }
                this.f31707p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new gr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new t2(this, 0));
                long j10 = 350;
                ofFloat.setDuration(j10);
                long j11 = 180;
                ofFloat.setStartDelay(j11);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(gr.f26495f);
                ofInt.addUpdateListener(new t2(this, 1));
                ofInt.setStartDelay(j11);
                ofInt.setDuration(j10);
                ofInt.start();
            }
        }
    }
}
