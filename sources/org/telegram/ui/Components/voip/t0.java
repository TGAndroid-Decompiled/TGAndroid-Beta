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
    public final s0 f32145a;
    public final w9 f32146b;
    public AnimatorSet f32147c;
    public boolean d;
    public boolean f32148e;
    public final boolean f32149f;

    public t0(Activity activity) {
        super(activity);
        s0 s0Var = new s0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.f32145a = s0Var;
        s0Var.b(3.0d);
        if (!s0Var.f32123e) {
            invalidate();
        }
        s0Var.f32123e = true;
        w9 w9Var = new w9(activity);
        this.f32146b = w9Var;
        addView(w9Var, z5.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f32147c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f32147c.setInterpolator(tr.f31141g);
        this.f32147c.setDuration(3000L);
        boolean isEnabled = LiteMode.isEnabled(512);
        this.f32149f = isEnabled;
        if (isEnabled) {
            this.f32147c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f32147c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f32147c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f32147c.setInterpolator(tr.f31141g);
        this.f32147c.setDuration(400L);
        this.f32147c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f32148e != z10) {
            this.f32148e = z10;
            s0 s0Var = this.f32145a;
            if (z10) {
                s0Var.b(3.0d);
            }
            if (s0Var.h != z10) {
                s0Var.h = z10;
                ValueAnimator valueAnimator = s0Var.f32127j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    s0Var.f32127j.cancel();
                }
                if (z10) {
                    s0Var.f32127j = ValueAnimator.ofFloat(s0Var.f32126i, 0.0f);
                    s0Var.f32128k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    s0Var.f32128k = 0;
                    s0Var.f32127j = ValueAnimator.ofFloat(s0Var.f32126i, 1.0f);
                }
                s0Var.f32127j.addUpdateListener(new r0(s0Var, 0));
                if (z11) {
                    s0Var.f32127j.setDuration(150L);
                } else {
                    s0Var.f32127j.setDuration(1000L);
                }
                s0Var.f32127j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f32149f) {
            s0 s0Var = this.f32145a;
            s0Var.c();
            s0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f32148e) {
            return;
        }
        s0 s0Var = this.f32145a;
        if (d > 1.5d) {
            s0Var.b(d);
        } else {
            s0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f32146b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        s0 s0Var = this.f32145a;
        if (s0Var.f32123e != z10) {
            invalidate();
        }
        s0Var.f32123e = z10;
    }
}
