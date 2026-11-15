package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.messenger.qc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i9;
public final class q0 extends FrameLayout {
    public final p0 f40879a;
    public final i9 f40880b;
    public AnimatorSet f40881c;
    public boolean d;
    public boolean f40882e;
    public final boolean f40883f;

    public q0(Activity activity) {
        super(activity);
        p0 p0Var = new p0(org.telegram.messenger.g0.L(104.0f), org.telegram.messenger.g0.L(111.0f), org.telegram.messenger.g0.L(12.0f), 8);
        this.f40879a = p0Var;
        p0Var.b(3.0d);
        if (!p0Var.f40859e) {
            invalidate();
        }
        p0Var.f40859e = true;
        i9 i9Var = new i9(activity);
        this.f40880b = i9Var;
        addView(i9Var, ja.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f40881c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f40881c.setInterpolator(er.f34420g);
        this.f40881c.setDuration(3000L);
        boolean e10 = qc.e(512);
        this.f40883f = e10;
        if (e10) {
            this.f40881c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f40881c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f40881c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f40881c.setInterpolator(er.f34420g);
        this.f40881c.setDuration(400L);
        this.f40881c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f40882e != z10) {
            this.f40882e = z10;
            p0 p0Var = this.f40879a;
            if (z10) {
                p0Var.b(3.0d);
            }
            if (p0Var.h != z10) {
                p0Var.h = z10;
                ValueAnimator valueAnimator = p0Var.f40863j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    p0Var.f40863j.cancel();
                }
                if (z10) {
                    p0Var.f40863j = ValueAnimator.ofFloat(p0Var.f40862i, 0.0f);
                    p0Var.f40864k = (int) (2000.0f / org.telegram.messenger.g0.f23614t);
                } else {
                    p0Var.f40864k = 0;
                    p0Var.f40863j = ValueAnimator.ofFloat(p0Var.f40862i, 1.0f);
                }
                p0Var.f40863j.addUpdateListener(new hi.j3(p0Var, 17));
                if (z11) {
                    p0Var.f40863j.setDuration(150L);
                } else {
                    p0Var.f40863j.setDuration(1000L);
                }
                p0Var.f40863j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40883f) {
            p0 p0Var = this.f40879a;
            p0Var.c();
            p0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f40882e) {
            return;
        }
        int i7 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        p0 p0Var = this.f40879a;
        if (i7 > 0) {
            p0Var.b(d);
        } else {
            p0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i7) {
        this.f40880b.setRoundRadius(i7);
    }

    public void setShowWaves(boolean z10) {
        p0 p0Var = this.f40879a;
        if (p0Var.f40859e != z10) {
            invalidate();
        }
        p0Var.f40859e = z10;
    }
}
