package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w9;
import w7.z5;
public final class t0 extends FrameLayout {
    public final s0 f32152a;
    public final w9 f32153b;
    public AnimatorSet f32154c;
    public boolean d;
    public boolean f32155e;
    public final boolean f32156f;

    public t0(Activity activity) {
        super(activity);
        s0 s0Var = new s0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.f32152a = s0Var;
        s0Var.b(3.0d);
        if (!s0Var.f32130e) {
            invalidate();
        }
        s0Var.f32130e = true;
        w9 w9Var = new w9(activity);
        this.f32153b = w9Var;
        addView(w9Var, z5.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f32154c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f32154c.setInterpolator(tr.f31148g);
        this.f32154c.setDuration(3000L);
        boolean isEnabled = LiteMode.isEnabled(512);
        this.f32156f = isEnabled;
        if (isEnabled) {
            this.f32154c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f32154c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f32154c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f32154c.setInterpolator(tr.f31148g);
        this.f32154c.setDuration(400L);
        this.f32154c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f32155e != z10) {
            this.f32155e = z10;
            s0 s0Var = this.f32152a;
            if (z10) {
                s0Var.b(3.0d);
            }
            if (s0Var.h != z10) {
                s0Var.h = z10;
                ValueAnimator valueAnimator = s0Var.f32134j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    s0Var.f32134j.cancel();
                }
                if (z10) {
                    s0Var.f32134j = ValueAnimator.ofFloat(s0Var.f32133i, 0.0f);
                    s0Var.f32135k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    s0Var.f32135k = 0;
                    s0Var.f32134j = ValueAnimator.ofFloat(s0Var.f32133i, 1.0f);
                }
                s0Var.f32134j.addUpdateListener(new r0(s0Var, 0));
                if (z11) {
                    s0Var.f32134j.setDuration(150L);
                } else {
                    s0Var.f32134j.setDuration(1000L);
                }
                s0Var.f32134j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f32156f) {
            s0 s0Var = this.f32152a;
            s0Var.c();
            s0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f32155e) {
            return;
        }
        s0 s0Var = this.f32152a;
        if (d > 1.5d) {
            s0Var.b(d);
        } else {
            s0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f32153b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        s0 s0Var = this.f32152a;
        if (s0Var.f32130e != z10) {
            invalidate();
        }
        s0Var.f32130e = z10;
    }
}
