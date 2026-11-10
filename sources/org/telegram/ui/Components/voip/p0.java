package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import fi.v3;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.wq;
public final class p0 extends FrameLayout {
    public final o0 f39464a;
    public final k9 f39465b;
    public AnimatorSet f39466c;
    public boolean d;
    public boolean f39467e;
    public final boolean f39468f;

    public p0(Activity activity) {
        super(activity);
        o0 o0Var = new o0(org.telegram.messenger.g0.L(104.0f), org.telegram.messenger.g0.L(111.0f), org.telegram.messenger.g0.L(12.0f), 8);
        this.f39464a = o0Var;
        o0Var.b(3.0d);
        if (!o0Var.f39441e) {
            invalidate();
        }
        o0Var.f39441e = true;
        k9 k9Var = new k9(activity);
        this.f39465b = k9Var;
        addView(k9Var, ha.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f39466c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f39466c.setInterpolator(wq.f40047g);
        this.f39466c.setDuration(3000L);
        boolean e10 = sc.e(512);
        this.f39468f = e10;
        if (e10) {
            this.f39466c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f39466c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f39466c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f39466c.setInterpolator(wq.f40047g);
        this.f39466c.setDuration(400L);
        this.f39466c.start();
    }

    public final void b(boolean z9, boolean z10) {
        if (this.f39467e != z9) {
            this.f39467e = z9;
            o0 o0Var = this.f39464a;
            if (z9) {
                o0Var.b(3.0d);
            }
            if (o0Var.h != z9) {
                o0Var.h = z9;
                ValueAnimator valueAnimator = o0Var.f39445j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    o0Var.f39445j.cancel();
                }
                if (z9) {
                    o0Var.f39445j = ValueAnimator.ofFloat(o0Var.f39444i, 0.0f);
                    o0Var.f39446k = (int) (2000.0f / org.telegram.messenger.g0.f22570t);
                } else {
                    o0Var.f39446k = 0;
                    o0Var.f39445j = ValueAnimator.ofFloat(o0Var.f39444i, 1.0f);
                }
                o0Var.f39445j.addUpdateListener(new v3(o0Var, 17));
                if (z10) {
                    o0Var.f39445j.setDuration(150L);
                } else {
                    o0Var.f39445j.setDuration(1000L);
                }
                o0Var.f39445j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f39468f) {
            o0 o0Var = this.f39464a;
            o0Var.c();
            o0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f39467e) {
            return;
        }
        int i7 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        o0 o0Var = this.f39464a;
        if (i7 > 0) {
            o0Var.b(d);
        } else {
            o0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i7) {
        this.f39465b.setRoundRadius(i7);
    }

    public void setShowWaves(boolean z9) {
        o0 o0Var = this.f39464a;
        if (o0Var.f39441e != z9) {
            invalidate();
        }
        o0Var.f39441e = z9;
    }
}
