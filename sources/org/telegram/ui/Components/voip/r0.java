package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import lh.d5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.t9;
public final class r0 extends FrameLayout {
    public final q0 f33961a;
    public final t9 f33962b;
    public AnimatorSet f33963c;
    public boolean d;
    public boolean f33964e;
    public final boolean f33965f;

    public r0(Activity activity) {
        super(activity);
        q0 q0Var = new q0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.f33961a = q0Var;
        q0Var.b(3.0d);
        if (!q0Var.f33933e) {
            invalidate();
        }
        q0Var.f33933e = true;
        t9 t9Var = new t9(activity);
        this.f33962b = t9Var;
        addView(t9Var, f6.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f33963c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f33963c.setInterpolator(jr.f29801g);
        this.f33963c.setDuration(3000L);
        boolean isEnabled = LiteMode.isEnabled(512);
        this.f33965f = isEnabled;
        if (isEnabled) {
            this.f33963c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f33963c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33963c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f33963c.setInterpolator(jr.f29801g);
        this.f33963c.setDuration(400L);
        this.f33963c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f33964e != z10) {
            this.f33964e = z10;
            q0 q0Var = this.f33961a;
            if (z10) {
                q0Var.b(3.0d);
            }
            if (q0Var.h != z10) {
                q0Var.h = z10;
                ValueAnimator valueAnimator = q0Var.f33937j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    q0Var.f33937j.cancel();
                }
                if (z10) {
                    q0Var.f33937j = ValueAnimator.ofFloat(q0Var.f33936i, 0.0f);
                    q0Var.f33938k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    q0Var.f33938k = 0;
                    q0Var.f33937j = ValueAnimator.ofFloat(q0Var.f33936i, 1.0f);
                }
                q0Var.f33937j.addUpdateListener(new d5(q0Var, 16));
                if (z11) {
                    q0Var.f33937j.setDuration(150L);
                } else {
                    q0Var.f33937j.setDuration(1000L);
                }
                q0Var.f33937j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f33965f) {
            q0 q0Var = this.f33961a;
            q0Var.c();
            q0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f33964e) {
            return;
        }
        q0 q0Var = this.f33961a;
        if (d > 1.5d) {
            q0Var.b(d);
        } else {
            q0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f33962b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        q0 q0Var = this.f33961a;
        if (q0Var.f33933e != z10) {
            invalidate();
        }
        q0Var.f33933e = z10;
    }
}
