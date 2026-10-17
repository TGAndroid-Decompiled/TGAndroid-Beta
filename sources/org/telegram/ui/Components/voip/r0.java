package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import ei.i6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.w9;
import w7.z5;
public final class r0 extends FrameLayout {
    public final q0 f31701a;
    public final w9 f31702b;
    public AnimatorSet f31703c;
    public boolean d;
    public boolean e;
    public final boolean f31704f;

    public r0(Activity activity) {
        super(activity);
        q0 q0Var = new q0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.f31701a = q0Var;
        q0Var.b(3.0d);
        if (!q0Var.e) {
            invalidate();
        }
        q0Var.e = true;
        w9 w9Var = new w9(activity);
        this.f31702b = w9Var;
        addView(w9Var, z5.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f31703c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f31703c.setInterpolator(bs.f25031g);
        this.f31703c.setDuration(3000L);
        boolean isEnabled = LiteMode.isEnabled(512);
        this.f31704f = isEnabled;
        if (isEnabled) {
            this.f31703c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f31703c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31703c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f31703c.setInterpolator(bs.f25031g);
        this.f31703c.setDuration(400L);
        this.f31703c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.e != z10) {
            this.e = z10;
            q0 q0Var = this.f31701a;
            if (z10) {
                q0Var.b(3.0d);
            }
            if (q0Var.h != z10) {
                q0Var.h = z10;
                ValueAnimator valueAnimator = q0Var.f31678j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    q0Var.f31678j.cancel();
                }
                if (z10) {
                    q0Var.f31678j = ValueAnimator.ofFloat(q0Var.f31677i, 0.0f);
                    q0Var.f31679k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    q0Var.f31679k = 0;
                    q0Var.f31678j = ValueAnimator.ofFloat(q0Var.f31677i, 1.0f);
                }
                q0Var.f31678j.addUpdateListener(new i6(q0Var, 8));
                if (z11) {
                    q0Var.f31678j.setDuration(150L);
                } else {
                    q0Var.f31678j.setDuration(1000L);
                }
                q0Var.f31678j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f31704f) {
            q0 q0Var = this.f31701a;
            q0Var.c();
            q0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.e) {
            return;
        }
        int i10 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        q0 q0Var = this.f31701a;
        if (i10 > 0) {
            q0Var.b(d);
        } else {
            q0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f31702b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        q0 q0Var = this.f31701a;
        if (q0Var.e != z10) {
            invalidate();
        }
        q0Var.e = z10;
    }
}
