package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import k7.c6;
import oh.f5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
public final class r0 extends FrameLayout {
    public final q0 f32303a;
    public final p9 f32304b;
    public AnimatorSet f32305c;
    public boolean d;
    public boolean f32306e;
    public final boolean f32307f;

    public r0(Activity activity) {
        super(activity);
        q0 q0Var = new q0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.f32303a = q0Var;
        q0Var.b(3.0d);
        if (!q0Var.f32287e) {
            invalidate();
        }
        q0Var.f32287e = true;
        p9 p9Var = new p9(activity);
        this.f32304b = p9Var;
        addView(p9Var, c6.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f32305c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f32305c.setInterpolator(pr.f30169g);
        this.f32305c.setDuration(3000L);
        boolean isEnabled = LiteMode.isEnabled(512);
        this.f32307f = isEnabled;
        if (isEnabled) {
            this.f32305c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f32305c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f32305c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f32305c.setInterpolator(pr.f30169g);
        this.f32305c.setDuration(400L);
        this.f32305c.start();
    }

    public final void b(boolean z4, boolean z10) {
        if (this.f32306e != z4) {
            this.f32306e = z4;
            q0 q0Var = this.f32303a;
            if (z4) {
                q0Var.b(3.0d);
            }
            if (q0Var.h != z4) {
                q0Var.h = z4;
                ValueAnimator valueAnimator = q0Var.f32291j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    q0Var.f32291j.cancel();
                }
                if (z4) {
                    q0Var.f32291j = ValueAnimator.ofFloat(q0Var.f32290i, 0.0f);
                    q0Var.f32292k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    q0Var.f32292k = 0;
                    q0Var.f32291j = ValueAnimator.ofFloat(q0Var.f32290i, 1.0f);
                }
                q0Var.f32291j.addUpdateListener(new f5(q0Var, 3));
                if (z10) {
                    q0Var.f32291j.setDuration(150L);
                } else {
                    q0Var.f32291j.setDuration(1000L);
                }
                q0Var.f32291j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f32307f) {
            q0 q0Var = this.f32303a;
            q0Var.c();
            q0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f32306e) {
            return;
        }
        q0 q0Var = this.f32303a;
        if (d > 1.5d) {
            q0Var.b(d);
        } else {
            q0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f32304b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z4) {
        q0 q0Var = this.f32303a;
        if (q0Var.f32287e != z4) {
            invalidate();
        }
        q0Var.f32287e = z4;
    }
}
