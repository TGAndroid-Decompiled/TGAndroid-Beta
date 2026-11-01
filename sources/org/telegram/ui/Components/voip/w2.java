package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i20;
import org.telegram.messenger.tc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
public final class w2 {
    public final d5 f31775a;
    public ValueAnimator f31776b;
    public int f31777c;
    public int d;
    public int e;
    public int f31778f;
    public int f31779g;
    public int h;
    public int f31780i;
    public int f31781j;
    public final g2 f31782k;
    public final int f31783l;
    public int f31784m = 0;
    public float f31785n = 0.0f;
    public int f31786o;
    public int f31787p;
    public boolean f31788q;
    public ValueAnimator f31789r;

    public w2(TLRPC.User user, g2 g2Var, int i10) {
        this.f31782k = g2Var;
        this.f31783l = i10;
        boolean e = tc.e(512);
        long m10 = i20.m(user);
        if (e && m10 != 0) {
            d5 d5Var = new d5(i10, 13, g2Var, false);
            this.f31775a = d5Var;
            d5Var.j(m10, false);
            d5Var.k(-16777216);
            d5Var.f25376w = this.f31784m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f31776b = ofFloat;
            ofFloat.addUpdateListener(new ag.p2(20, this, g2Var));
            this.e = org.telegram.messenger.i0.L(12.0f) + this.f31777c;
            this.f31778f = org.telegram.messenger.i0.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.f14520b;
            this.f31777c = org.telegram.messenger.i0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.i0.L(16.0f));
            this.d = org.telegram.messenger.i0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.i0.L(16.0f));
            this.f31776b.setInterpolator(new LinearInterpolator());
            this.f31776b.addListener(new v2(this));
            this.f31776b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        d5 d5Var = this.f31775a;
        if (d5Var == null) {
            return;
        }
        canvas.save();
        float f7 = this.f31785n;
        canvas.scale(f7, f7, this.f31786o / 2.0f, org.telegram.messenger.i0.L(300.0f));
        canvas.translate(this.f31780i - this.f31787p, this.f31781j);
        int i10 = this.f31779g;
        int i11 = this.h;
        int i12 = this.f31783l;
        d5Var.setBounds(i10, i11, i10 + i12, i12 + i11);
        d5Var.f25376w = this.f31784m;
        d5Var.draw(canvas);
        canvas.restore();
    }

    public final void b(int i10, int i11) {
        int i12;
        ag.c2 c2Var;
        d5 d5Var = this.f31775a;
        if (d5Var != null) {
            this.f31780i = i10;
            this.f31781j = i11;
            this.f31782k.invalidate();
            if (!this.f31788q) {
                Drawable drawable = d5Var.f25372f[0];
                if ((drawable instanceof f5) && ((c2Var = ((f5) drawable).f26070k) == null || !c2Var.J())) {
                    return;
                }
                this.f31788q = true;
                if (this.f31780i > this.f31786o / 2) {
                    i12 = org.telegram.messenger.i0.L(12);
                } else {
                    i12 = -org.telegram.messenger.i0.L(12);
                }
                this.f31787p = i12;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new gr(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new u2(this, 0));
                long j10 = 350;
                ofFloat.setDuration(j10);
                long j11 = 180;
                ofFloat.setStartDelay(j11);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(gr.f26523f);
                ofInt.addUpdateListener(new u2(this, 1));
                ofInt.setStartDelay(j11);
                ofInt.setDuration(j10);
                ofInt.start();
            }
        }
    }
}
