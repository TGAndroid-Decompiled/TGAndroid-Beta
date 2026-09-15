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
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u9;
import w7.x5;
public final class t0 extends FrameLayout {
    public final s0 f29229a;
    public final u9 f29230b;
    public AnimatorSet f29231c;
    public boolean d;
    public boolean e;
    public final boolean f29232f;

    public t0(Activity activity) {
        super(activity);
        s0 s0Var = new s0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.f29229a = s0Var;
        s0Var.b(3.0d);
        if (!s0Var.e) {
            invalidate();
        }
        s0Var.e = true;
        u9 u9Var = new u9(activity);
        this.f29230b = u9Var;
        addView(u9Var, x5.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f29231c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f29231c.setInterpolator(qr.f27424g);
        this.f29231c.setDuration(3000L);
        boolean isEnabled = LiteMode.isEnabled(512);
        this.f29232f = isEnabled;
        if (isEnabled) {
            this.f29231c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f29231c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f29231c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f29231c.setInterpolator(qr.f27424g);
        this.f29231c.setDuration(400L);
        this.f29231c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.e != z10) {
            this.e = z10;
            s0 s0Var = this.f29229a;
            if (z10) {
                s0Var.b(3.0d);
            }
            if (s0Var.h != z10) {
                s0Var.h = z10;
                ValueAnimator valueAnimator = s0Var.f29198j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    s0Var.f29198j.cancel();
                }
                if (z10) {
                    s0Var.f29198j = ValueAnimator.ofFloat(s0Var.f29197i, 0.0f);
                    s0Var.f29199k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    s0Var.f29199k = 0;
                    s0Var.f29198j = ValueAnimator.ofFloat(s0Var.f29197i, 1.0f);
                }
                s0Var.f29198j.addUpdateListener(new r0(s0Var, 0));
                if (z11) {
                    s0Var.f29198j.setDuration(150L);
                } else {
                    s0Var.f29198j.setDuration(1000L);
                }
                s0Var.f29198j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f29232f) {
            s0 s0Var = this.f29229a;
            s0Var.c();
            s0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.e) {
            return;
        }
        s0 s0Var = this.f29229a;
        if (d > 1.5d) {
            s0Var.b(d);
        } else {
            s0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f29230b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        s0 s0Var = this.f29229a;
        if (s0Var.e != z10) {
            invalidate();
        }
        s0Var.e = z10;
    }
}
