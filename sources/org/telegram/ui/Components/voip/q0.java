package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.n9;

public final class q0 extends FrameLayout {

    public final p0 f33808a;

    public final n9 f33809b;

    public AnimatorSet f33810c;
    public boolean d;

    public boolean f33811e;

    public final boolean f33812f;

    public q0(Activity activity) {
        super(activity);
        p0 p0Var = new p0(AndroidUtilities.dp(104.0f), AndroidUtilities.dp(111.0f), AndroidUtilities.dp(12.0f), 8);
        this.f33808a = p0Var;
        p0Var.b(3.0d);
        if (!p0Var.f33793e) {
            invalidate();
        }
        p0Var.f33793e = true;
        n9 n9Var = new n9(activity);
        this.f33809b = n9Var;
        addView(n9Var, z5.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f33810c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<q0, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<q0, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f33810c.setInterpolator(er.f28123g);
        this.f33810c.setDuration(3000L);
        boolean zIsEnabled = LiteMode.isEnabled(512);
        this.f33812f = zIsEnabled;
        if (zIsEnabled) {
            this.f33810c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f33810c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33810c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<q0, Float>) View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, (Property<q0, Float>) View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f33810c.setInterpolator(er.f28123g);
        this.f33810c.setDuration(400L);
        this.f33810c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f33811e != z10) {
            this.f33811e = z10;
            p0 p0Var = this.f33808a;
            if (z10) {
                p0Var.b(3.0d);
            }
            if (p0Var.h != z10) {
                p0Var.h = z10;
                ValueAnimator valueAnimator = p0Var.f33797j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    p0Var.f33797j.cancel();
                }
                if (z10) {
                    p0Var.f33797j = ValueAnimator.ofFloat(p0Var.f33796i, 0.0f);
                    p0Var.f33798k = (int) (2000.0f / AndroidUtilities.screenRefreshTime);
                } else {
                    p0Var.f33798k = 0;
                    p0Var.f33797j = ValueAnimator.ofFloat(p0Var.f33796i, 1.0f);
                }
                p0Var.f33797j.addUpdateListener(new lh.m2(p0Var, 10));
                if (z11) {
                    p0Var.f33797j.setDuration(150L);
                } else {
                    p0Var.f33797j.setDuration(1000L);
                }
                p0Var.f33797j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f33812f) {
            p0 p0Var = this.f33808a;
            p0Var.c();
            p0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f33811e) {
            return;
        }
        p0 p0Var = this.f33808a;
        if (d > 1.5d) {
            p0Var.b(d);
        } else {
            p0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i10) {
        this.f33809b.setRoundRadius(i10);
    }

    public void setShowWaves(boolean z10) {
        p0 p0Var = this.f33808a;
        if (p0Var.f33793e != z10) {
            invalidate();
        }
        p0Var.f33793e = z10;
    }
}
