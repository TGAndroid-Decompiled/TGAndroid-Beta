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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.z9;
import w7.a6;
public final class r0 extends FrameLayout {
    public final q0 f30416a;
    public final z9 f30417b;
    public AnimatorSet f30418c;
    public boolean d;
    public boolean e;
    public final boolean f30419f;

    public r0(Activity activity) {
        super(activity);
        q0 q0Var = new q0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.f30416a = q0Var;
        q0Var.b(3.0d);
        if (!q0Var.e) {
            invalidate();
        }
        q0Var.e = true;
        z9 z9Var = new z9(activity);
        this.f30417b = z9Var;
        addView(z9Var, a6.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f30418c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f30418c.setInterpolator(es.f24772g);
        this.f30418c.setDuration(3000L);
        boolean isEnabled = LiteMode.isEnabled(512);
        this.f30419f = isEnabled;
        if (isEnabled) {
            this.f30418c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f30418c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f30418c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f30418c.setInterpolator(es.f24772g);
        this.f30418c.setDuration(400L);
        this.f30418c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.e != z10) {
            this.e = z10;
            q0 q0Var = this.f30416a;
            if (z10) {
                q0Var.b(3.0d);
            }
            if (q0Var.h != z10) {
                q0Var.h = z10;
                ValueAnimator valueAnimator = q0Var.f30408j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    q0Var.f30408j.cancel();
                }
                if (z10) {
                    q0Var.f30408j = ValueAnimator.ofFloat(q0Var.f30407i, 0.0f);
                    q0Var.f30409k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    q0Var.f30409k = 0;
                    q0Var.f30408j = ValueAnimator.ofFloat(q0Var.f30407i, 1.0f);
                }
                q0Var.f30408j.addUpdateListener(new ki.a(q0Var, 1));
                if (z11) {
                    q0Var.f30408j.setDuration(150L);
                } else {
                    q0Var.f30408j.setDuration(1000L);
                }
                q0Var.f30408j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f30419f) {
            q0 q0Var = this.f30416a;
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
        q0 q0Var = this.f30416a;
        if (i10 > 0) {
            q0Var.b(d);
        } else {
            q0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f30417b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        q0 q0Var = this.f30416a;
        if (q0Var.e != z10) {
            invalidate();
        }
        q0Var.e = z10;
    }
}
