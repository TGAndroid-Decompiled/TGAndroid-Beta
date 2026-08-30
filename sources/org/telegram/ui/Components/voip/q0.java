package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import k7.b6;
import nh.e5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p9;
public final class q0 extends FrameLayout {
    public final p0 f29862a;
    public final p9 f29863b;
    public AnimatorSet f29864c;
    public boolean d;
    public boolean e;
    public final boolean f29865f;

    public q0(Activity activity) {
        super(activity);
        p0 p0Var = new p0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.f29862a = p0Var;
        p0Var.b(3.0d);
        if (!p0Var.e) {
            invalidate();
        }
        p0Var.e = true;
        p9 p9Var = new p9(activity);
        this.f29863b = p9Var;
        addView(p9Var, b6.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f29864c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f29864c.setInterpolator(nr.f27347g);
        this.f29864c.setDuration(3000L);
        boolean isEnabled = LiteMode.isEnabled(512);
        this.f29865f = isEnabled;
        if (isEnabled) {
            this.f29864c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f29864c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f29864c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f29864c.setInterpolator(nr.f27347g);
        this.f29864c.setDuration(400L);
        this.f29864c.start();
    }

    public final void b(boolean z4, boolean z10) {
        if (this.e != z4) {
            this.e = z4;
            p0 p0Var = this.f29862a;
            if (z4) {
                p0Var.b(3.0d);
            }
            if (p0Var.h != z4) {
                p0Var.h = z4;
                ValueAnimator valueAnimator = p0Var.f29851j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    p0Var.f29851j.cancel();
                }
                if (z4) {
                    p0Var.f29851j = ValueAnimator.ofFloat(p0Var.f29850i, 0.0f);
                    p0Var.f29852k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    p0Var.f29852k = 0;
                    p0Var.f29851j = ValueAnimator.ofFloat(p0Var.f29850i, 1.0f);
                }
                p0Var.f29851j.addUpdateListener(new e5(p0Var, 4));
                if (z10) {
                    p0Var.f29851j.setDuration(150L);
                } else {
                    p0Var.f29851j.setDuration(1000L);
                }
                p0Var.f29851j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f29865f) {
            p0 p0Var = this.f29862a;
            p0Var.c();
            p0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.e) {
            return;
        }
        p0 p0Var = this.f29862a;
        if (d > 1.5d) {
            p0Var.b(d);
        } else {
            p0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f29863b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z4) {
        p0 p0Var = this.f29862a;
        if (p0Var.e != z4) {
            invalidate();
        }
        p0Var.e = z4;
    }
}
