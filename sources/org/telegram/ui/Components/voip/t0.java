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
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.y9;
import w7.x5;
public final class t0 extends FrameLayout {
    public final s0 f32303a;
    public final y9 f32304b;
    public AnimatorSet f32305c;
    public boolean d;
    public boolean f32306e;
    public final boolean f32307f;

    public t0(Activity activity) {
        super(activity);
        s0 s0Var = new s0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.f32303a = s0Var;
        s0Var.b(3.0d);
        if (!s0Var.f32266e) {
            invalidate();
        }
        s0Var.f32266e = true;
        y9 y9Var = new y9(activity);
        this.f32304b = y9Var;
        addView(y9Var, x5.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f32305c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f32305c.setInterpolator(is.f27444g);
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
        this.f32305c.setInterpolator(is.f27444g);
        this.f32305c.setDuration(400L);
        this.f32305c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f32306e != z10) {
            this.f32306e = z10;
            s0 s0Var = this.f32303a;
            if (z10) {
                s0Var.b(3.0d);
            }
            if (s0Var.h != z10) {
                s0Var.h = z10;
                ValueAnimator valueAnimator = s0Var.f32270j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    s0Var.f32270j.cancel();
                }
                if (z10) {
                    s0Var.f32270j = ValueAnimator.ofFloat(s0Var.f32269i, 0.0f);
                    s0Var.f32271k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    s0Var.f32271k = 0;
                    s0Var.f32270j = ValueAnimator.ofFloat(s0Var.f32269i, 1.0f);
                }
                s0Var.f32270j.addUpdateListener(new r0(s0Var, 0));
                if (z11) {
                    s0Var.f32270j.setDuration(150L);
                } else {
                    s0Var.f32270j.setDuration(1000L);
                }
                s0Var.f32270j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f32307f) {
            s0 s0Var = this.f32303a;
            s0Var.c();
            s0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f32306e) {
            return;
        }
        int i10 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        s0 s0Var = this.f32303a;
        if (i10 > 0) {
            s0Var.b(d);
        } else {
            s0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f32304b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        s0 s0Var = this.f32303a;
        if (s0Var.f32266e != z10) {
            invalidate();
        }
        s0Var.f32266e = z10;
    }
}
