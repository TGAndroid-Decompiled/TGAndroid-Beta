package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class rc {
    public View f30720a;
    public final float f30721b;
    public final float f30722c;
    public final float d;
    public long f30723e;
    public Runnable f30724f;
    public ValueAnimator f30725g;
    public boolean h;
    public float f30726i;

    public rc(View view) {
        this(view, 1.0f, 5.0f);
    }

    public final float a(float f10) {
        return e2.c.w(1.0f, this.f30726i, f10, 1.0f - f10);
    }

    public void b() {
        View view = this.f30720a;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f30724f;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z4) {
        float f10;
        if (this.h != z4) {
            this.h = z4;
            ValueAnimator valueAnimator = this.f30725g;
            this.f30725g = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f30726i;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f30725g = ofFloat;
            ofFloat.addUpdateListener(new f6(this, 7));
            this.f30725g.addListener(new eg.u2(21, this, z4));
            if (this.h) {
                this.f30725g.setInterpolator(pr.f30168f);
                this.f30725g.setDuration(this.f30721b * 60.0f);
                this.f30725g.setStartDelay(0L);
            } else {
                this.f30725g.setInterpolator(new OvershootInterpolator(this.d));
                this.f30725g.setDuration(this.f30722c * 350.0f);
                this.f30725g.setStartDelay(this.f30723e);
            }
            this.f30725g.start();
        }
    }

    public rc(View view, float f10, float f11) {
        this.f30723e = 0L;
        this.f30720a = view;
        this.f30722c = f10;
        this.f30721b = f10;
        this.d = f11;
    }

    public rc(qh.z4 z4Var) {
        this.f30723e = 0L;
        this.f30720a = z4Var;
        this.f30721b = 1.5f;
        this.f30722c = 1.0f;
        this.d = 2.0f;
    }
}
