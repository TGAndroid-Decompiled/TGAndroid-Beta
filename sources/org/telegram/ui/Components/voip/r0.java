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
    public final q0 f31710a;
    public final w9 f31711b;
    public AnimatorSet f31712c;
    public boolean d;
    public boolean e;
    public final boolean f31713f;

    public r0(Activity activity) {
        super(activity);
        q0 q0Var = new q0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.f31710a = q0Var;
        q0Var.b(3.0d);
        if (!q0Var.e) {
            invalidate();
        }
        q0Var.e = true;
        w9 w9Var = new w9(activity);
        this.f31711b = w9Var;
        addView(w9Var, z5.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f31712c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f31712c.setInterpolator(bs.f25013g);
        this.f31712c.setDuration(3000L);
        boolean isEnabled = LiteMode.isEnabled(512);
        this.f31713f = isEnabled;
        if (isEnabled) {
            this.f31712c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f31712c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31712c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f31712c.setInterpolator(bs.f25013g);
        this.f31712c.setDuration(400L);
        this.f31712c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.e != z10) {
            this.e = z10;
            q0 q0Var = this.f31710a;
            if (z10) {
                q0Var.b(3.0d);
            }
            if (q0Var.h != z10) {
                q0Var.h = z10;
                ValueAnimator valueAnimator = q0Var.f31687j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    q0Var.f31687j.cancel();
                }
                if (z10) {
                    q0Var.f31687j = ValueAnimator.ofFloat(q0Var.f31686i, 0.0f);
                    q0Var.f31688k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    q0Var.f31688k = 0;
                    q0Var.f31687j = ValueAnimator.ofFloat(q0Var.f31686i, 1.0f);
                }
                q0Var.f31687j.addUpdateListener(new i6(q0Var, 8));
                if (z11) {
                    q0Var.f31687j.setDuration(150L);
                } else {
                    q0Var.f31687j.setDuration(1000L);
                }
                q0Var.f31687j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f31713f) {
            q0 q0Var = this.f31710a;
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
        q0 q0Var = this.f31710a;
        if (i10 > 0) {
            q0Var.b(d);
        } else {
            q0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f31711b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        q0 q0Var = this.f31710a;
        if (q0Var.e != z10) {
            invalidate();
        }
        q0Var.e = z10;
    }
}
