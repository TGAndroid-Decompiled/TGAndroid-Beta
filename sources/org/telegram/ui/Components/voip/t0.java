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
    public final s0 f32219a;
    public final w9 f32220b;
    public AnimatorSet f32221c;
    public boolean d;
    public boolean f32222e;
    public final boolean f32223f;

    public t0(Activity activity) {
        super(activity);
        s0 s0Var = new s0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.f32219a = s0Var;
        s0Var.b(3.0d);
        if (!s0Var.f32197e) {
            invalidate();
        }
        s0Var.f32197e = true;
        w9 w9Var = new w9(activity);
        this.f32220b = w9Var;
        addView(w9Var, z5.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f32221c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f32221c.setInterpolator(tr.f31216g);
        this.f32221c.setDuration(3000L);
        boolean isEnabled = LiteMode.isEnabled(512);
        this.f32223f = isEnabled;
        if (isEnabled) {
            this.f32221c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f32221c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f32221c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f32221c.setInterpolator(tr.f31216g);
        this.f32221c.setDuration(400L);
        this.f32221c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f32222e != z10) {
            this.f32222e = z10;
            s0 s0Var = this.f32219a;
            if (z10) {
                s0Var.b(3.0d);
            }
            if (s0Var.h != z10) {
                s0Var.h = z10;
                ValueAnimator valueAnimator = s0Var.f32201j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    s0Var.f32201j.cancel();
                }
                if (z10) {
                    s0Var.f32201j = ValueAnimator.ofFloat(s0Var.f32200i, 0.0f);
                    s0Var.f32202k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    s0Var.f32202k = 0;
                    s0Var.f32201j = ValueAnimator.ofFloat(s0Var.f32200i, 1.0f);
                }
                s0Var.f32201j.addUpdateListener(new r0(s0Var, 0));
                if (z11) {
                    s0Var.f32201j.setDuration(150L);
                } else {
                    s0Var.f32201j.setDuration(1000L);
                }
                s0Var.f32201j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f32223f) {
            s0 s0Var = this.f32219a;
            s0Var.c();
            s0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f32222e) {
            return;
        }
        s0 s0Var = this.f32219a;
        if (d > 1.5d) {
            s0Var.b(d);
        } else {
            s0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f32220b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        s0 s0Var = this.f32219a;
        if (s0Var.f32197e != z10) {
            invalidate();
        }
        s0Var.f32197e = z10;
    }
}
