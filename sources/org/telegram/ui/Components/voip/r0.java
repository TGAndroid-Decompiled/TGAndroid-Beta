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
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.x9;
import w7.x5;
public final class r0 extends FrameLayout {
    public final q0 f31754a;
    public final x9 f31755b;
    public AnimatorSet f31756c;
    public boolean d;
    public boolean f31757e;
    public final boolean f31758f;

    public r0(Activity activity) {
        super(activity);
        q0 q0Var = new q0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.f31754a = q0Var;
        q0Var.b(3.0d);
        if (!q0Var.f31726e) {
            invalidate();
        }
        q0Var.f31726e = true;
        x9 x9Var = new x9(activity);
        this.f31755b = x9Var;
        addView(x9Var, x5.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f31756c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f31756c.setInterpolator(pr.f29467g);
        this.f31756c.setDuration(3000L);
        boolean isEnabled = LiteMode.isEnabled(512);
        this.f31758f = isEnabled;
        if (isEnabled) {
            this.f31756c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f31756c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31756c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f31756c.setInterpolator(pr.f29467g);
        this.f31756c.setDuration(400L);
        this.f31756c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f31757e != z10) {
            this.f31757e = z10;
            q0 q0Var = this.f31754a;
            if (z10) {
                q0Var.b(3.0d);
            }
            if (q0Var.h != z10) {
                q0Var.h = z10;
                ValueAnimator valueAnimator = q0Var.f31730j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    q0Var.f31730j.cancel();
                }
                if (z10) {
                    q0Var.f31730j = ValueAnimator.ofFloat(q0Var.f31729i, 0.0f);
                    q0Var.f31731k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    q0Var.f31731k = 0;
                    q0Var.f31730j = ValueAnimator.ofFloat(q0Var.f31729i, 1.0f);
                }
                q0Var.f31730j.addUpdateListener(new ki.a(q0Var, 1));
                if (z11) {
                    q0Var.f31730j.setDuration(150L);
                } else {
                    q0Var.f31730j.setDuration(1000L);
                }
                q0Var.f31730j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f31758f) {
            q0 q0Var = this.f31754a;
            q0Var.c();
            q0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f31757e) {
            return;
        }
        q0 q0Var = this.f31754a;
        if (d > 1.5d) {
            q0Var.b(d);
        } else {
            q0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f31755b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        q0 q0Var = this.f31754a;
        if (q0Var.f31726e != z10) {
            invalidate();
        }
        q0Var.f31726e = z10;
    }
}
