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
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.w9;
import w7.y5;
public final class t0 extends FrameLayout {
    public final s0 f29540a;
    public final w9 f29541b;
    public AnimatorSet f29542c;
    public boolean d;
    public boolean e;
    public final boolean f29543f;

    public t0(Activity activity) {
        super(activity);
        s0 s0Var = new s0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.f29540a = s0Var;
        s0Var.b(3.0d);
        if (!s0Var.e) {
            invalidate();
        }
        s0Var.e = true;
        w9 w9Var = new w9(activity);
        this.f29541b = w9Var;
        addView(w9Var, y5.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f29542c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f29542c.setInterpolator(sr.f28349g);
        this.f29542c.setDuration(3000L);
        boolean isEnabled = LiteMode.isEnabled(512);
        this.f29543f = isEnabled;
        if (isEnabled) {
            this.f29542c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f29542c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f29542c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f29542c.setInterpolator(sr.f28349g);
        this.f29542c.setDuration(400L);
        this.f29542c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.e != z10) {
            this.e = z10;
            s0 s0Var = this.f29540a;
            if (z10) {
                s0Var.b(3.0d);
            }
            if (s0Var.h != z10) {
                s0Var.h = z10;
                ValueAnimator valueAnimator = s0Var.f29524j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    s0Var.f29524j.cancel();
                }
                if (z10) {
                    s0Var.f29524j = ValueAnimator.ofFloat(s0Var.f29523i, 0.0f);
                    s0Var.f29525k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    s0Var.f29525k = 0;
                    s0Var.f29524j = ValueAnimator.ofFloat(s0Var.f29523i, 1.0f);
                }
                s0Var.f29524j.addUpdateListener(new r0(s0Var, 0));
                if (z11) {
                    s0Var.f29524j.setDuration(150L);
                } else {
                    s0Var.f29524j.setDuration(1000L);
                }
                s0Var.f29524j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f29543f) {
            s0 s0Var = this.f29540a;
            s0Var.c();
            s0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.e) {
            return;
        }
        s0 s0Var = this.f29540a;
        if (d > 1.5d) {
            s0Var.b(d);
        } else {
            s0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f29541b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        s0 s0Var = this.f29540a;
        if (s0Var.e != z10) {
            invalidate();
        }
        s0Var.e = z10;
    }
}
