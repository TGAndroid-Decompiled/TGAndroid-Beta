package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import hi.s3;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.p9;
public final class q0 extends FrameLayout {
    public final p0 f41155a;
    public final p9 f41156b;
    public AnimatorSet f41157c;
    public boolean d;
    public boolean f41158e;
    public final boolean f41159f;

    public q0(Activity activity) {
        super(activity);
        p0 p0Var = new p0(org.telegram.messenger.g0.L(104.0f), org.telegram.messenger.g0.L(111.0f), org.telegram.messenger.g0.L(12.0f), 8);
        this.f41155a = p0Var;
        p0Var.b(3.0d);
        if (!p0Var.f41129e) {
            invalidate();
        }
        p0Var.f41129e = true;
        p9 p9Var = new p9(activity);
        this.f41156b = p9Var;
        addView(p9Var, na.e(135, 135, 17));
        setWillNotDraw(false);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f41157c = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 1.05f, 1.0f, 1.05f, 1.0f));
        this.f41157c.setInterpolator(kr.f36859g);
        this.f41157c.setDuration(3000L);
        boolean e10 = pc.e(512);
        this.f41159f = e10;
        if (e10) {
            this.f41157c.start();
        }
        setClipChildren(false);
    }

    public final void a() {
        if (this.d) {
            return;
        }
        AnimatorSet animatorSet = this.f41157c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = true;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f41157c = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, getScaleX(), 1.05f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, getScaleY(), 1.05f, 1.0f));
        this.f41157c.setInterpolator(kr.f36859g);
        this.f41157c.setDuration(400L);
        this.f41157c.start();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f41158e != z10) {
            this.f41158e = z10;
            p0 p0Var = this.f41155a;
            if (z10) {
                p0Var.b(3.0d);
            }
            if (p0Var.h != z10) {
                p0Var.h = z10;
                ValueAnimator valueAnimator = p0Var.f41133j;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    p0Var.f41133j.cancel();
                }
                if (z10) {
                    p0Var.f41133j = ValueAnimator.ofFloat(p0Var.f41132i, 0.0f);
                    p0Var.f41134k = (int) (2000.0f / org.telegram.messenger.g0.f24229t);
                } else {
                    p0Var.f41134k = 0;
                    p0Var.f41133j = ValueAnimator.ofFloat(p0Var.f41132i, 1.0f);
                }
                p0Var.f41133j.addUpdateListener(new s3(p0Var, 17));
                if (z11) {
                    p0Var.f41133j.setDuration(150L);
                } else {
                    p0Var.f41133j.setDuration(1000L);
                }
                p0Var.f41133j.start();
                invalidate();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41159f) {
            p0 p0Var = this.f41155a;
            p0Var.c();
            p0Var.a(canvas, getWidth() / 2, getHeight() / 2, this);
        }
        super.onDraw(canvas);
    }

    public void setAmplitude(double d) {
        if (this.f41158e) {
            return;
        }
        int i7 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        p0 p0Var = this.f41155a;
        if (i7 > 0) {
            p0Var.b(d);
        } else {
            p0Var.b(0.0d);
        }
    }

    public void setRoundRadius(int i7) {
        this.f41156b.setRoundRadius(i7);
    }

    public void setShowWaves(boolean z10) {
        p0 p0Var = this.f41155a;
        if (p0Var.f41129e != z10) {
            invalidate();
        }
        p0Var.f41129e = z10;
    }
}
