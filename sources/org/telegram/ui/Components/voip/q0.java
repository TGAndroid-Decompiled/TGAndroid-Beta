package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import kh.g4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.o9;
public final class q0 extends FrameLayout {
    public final p0 f33758a;
    public final o9 f33759b;
    public AnimatorSet f33760c;
    public boolean d;
    public boolean f33761e;
    public final boolean f33762f;

    public q0(Activity activity) {
        super(activity);
        p0 p0Var = new p0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.f33758a = p0Var;
        p0Var.b(3.0d);
        if (!p0Var.f33743e) {
            invalidate();
        }
        p0Var.f33743e = true;
        o9 o9Var = new o9(activity);
        this.f33759b = o9Var;
        addView(o9Var, e6.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f33760c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f33760c.setInterpolator(gr.f28845g);
        this.f33760c.setDuration(3000L);
        boolean isEnabled = LiteMode.isEnabled(512);
        this.f33762f = isEnabled;
        if (isEnabled) {
            this.f33760c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f33760c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33760c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f33760c.setInterpolator(gr.f28845g);
        this.f33760c.setDuration(400L);
        this.f33760c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f33761e != z10) {
            this.f33761e = z10;
            p0 p0Var = this.f33758a;
            if (z10) {
                p0Var.b(3.0d);
            }
            if (p0Var.h != z10) {
                p0Var.h = z10;
                ValueAnimator valueAnimator = p0Var.f33747j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    p0Var.f33747j.cancel();
                }
                if (z10) {
                    p0Var.f33747j = ValueAnimator.ofFloat(p0Var.f33746i, 0.0f);
                    p0Var.f33748k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    p0Var.f33748k = 0;
                    p0Var.f33747j = ValueAnimator.ofFloat(p0Var.f33746i, 1.0f);
                }
                p0Var.f33747j.addUpdateListener(new g4(p0Var, 7));
                if (z11) {
                    p0Var.f33747j.setDuration(150L);
                } else {
                    p0Var.f33747j.setDuration(1000L);
                }
                p0Var.f33747j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f33762f) {
            p0 p0Var = this.f33758a;
            p0Var.c();
            p0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f33761e) {
            return;
        }
        p0 p0Var = this.f33758a;
        if (d > 1.5d) {
            p0Var.b(d);
        } else {
            p0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i9) {
        this.f33759b.setRoundRadius(i9);
    }

    public void setShowWaves(boolean z10) {
        p0 p0Var = this.f33758a;
        if (p0Var.f33743e != z10) {
            invalidate();
        }
        p0Var.f33743e = z10;
    }
}
