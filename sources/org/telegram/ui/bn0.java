package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class bn0 extends org.telegram.ui.Components.tt0 {
    public int f44073f0;
    public boolean f44074g0;
    public boolean f44075h0;
    public int f44076i0;
    public int f44077j0;
    public VelocityTracker f44078k0;
    public boolean f44079l0;
    public final cn0 m0;

    public bn0(cn0 cn0Var, Context context) {
        super(context, null);
        this.m0 = cn0Var;
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn0.X():boolean");
    }

    public final boolean Y(MotionEvent motionEvent, boolean z9) {
        int i7;
        org.telegram.ui.ActionBar.k kVar;
        cn0 cn0Var = this.m0;
        org.telegram.ui.ActionBar.x4[] x4VarArr = cn0Var.f44717n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = cn0Var.h;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i10 = scrollSlidingTextTabStrip.f31543n;
        if (z9) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i11 = sparseIntArray.get(i10 + i7, -1);
        if (i11 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f44075h0 = false;
        this.f44074g0 = true;
        this.f44076i0 = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.f2) cn0Var).actionBar;
        kVar.setEnabled(false);
        cn0Var.h.setEnabled(false);
        org.telegram.ui.ActionBar.x4 x4Var = x4VarArr[1];
        x4Var.f28749b = i11;
        x4Var.setVisibility(0);
        cn0Var.f44720w = z9;
        cn0Var.o0(true);
        if (z9) {
            x4VarArr[1].setTranslationX(x4VarArr[0].getMeasuredWidth());
            return true;
        }
        x4VarArr[1].setTranslationX(-x4VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        cn0 cn0Var = this.m0;
        kVar = ((org.telegram.ui.ActionBar.f2) cn0Var).actionBar;
        int measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.f2) cn0Var).actionBar;
        float translationY = measuredHeight + ((int) kVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.l6.f27988k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cn0 cn0Var = this.m0;
        Paint paint = cn0Var.f44716f;
        paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27809a7, false));
        kVar = ((org.telegram.ui.ActionBar.f2) cn0Var).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.f2) cn0Var).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!X() && !this.m0.h.H && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bn0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.q4 q4Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        boolean z9;
        float measuredWidth;
        org.telegram.ui.ActionBar.x4 x4Var;
        org.telegram.ui.ActionBar.x4 x4Var2;
        int measuredWidth2;
        org.telegram.ui.ActionBar.x4 x4Var3;
        org.telegram.ui.ActionBar.x4 x4Var4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        cn0 cn0Var = this.m0;
        org.telegram.ui.ActionBar.x4[] x4VarArr = cn0Var.f44717n;
        q4Var = ((org.telegram.ui.ActionBar.f2) cn0Var).parentLayout;
        boolean z13 = false;
        if (((ActionBarLayout) q4Var).i() || X()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f44078k0 == null) {
                this.f44078k0 = VelocityTracker.obtain();
            }
            this.f44078k0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f44074g0 && !this.f44075h0) {
            this.f44073f0 = motionEvent.getPointerId(0);
            this.f44075h0 = true;
            this.f44076i0 = (int) motionEvent.getX();
            this.f44077j0 = (int) motionEvent.getY();
            this.f44078k0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f44073f0) {
            int x10 = (int) (motionEvent.getX() - this.f44076i0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f44077j0);
            if (this.f44074g0 && (((z11 = cn0Var.f44720w) && x10 > 0) || (!z11 && x10 < 0))) {
                if (x10 < 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!Y(motionEvent, z12)) {
                    this.f44075h0 = true;
                    this.f44074g0 = false;
                    x4VarArr[0].setTranslationX(0.0f);
                    org.telegram.ui.ActionBar.x4 x4Var5 = x4VarArr[1];
                    if (cn0Var.f44720w) {
                        i7 = x4VarArr[0].getMeasuredWidth();
                    } else {
                        i7 = -x4VarArr[0].getMeasuredWidth();
                    }
                    x4Var5.setTranslationX(i7);
                    cn0Var.h.i(0.0f, x4VarArr[1].f28749b);
                }
            }
            if (this.f44075h0 && !this.f44074g0) {
                if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z13 = true;
                    }
                    Y(motionEvent, z13);
                }
            } else if (this.f44074g0) {
                x4VarArr[0].setTranslationX(x10);
                if (cn0Var.f44720w) {
                    x4VarArr[1].setTranslationX(x4VarArr[0].getMeasuredWidth() + x10);
                } else {
                    x4VarArr[1].setTranslationX(x10 - x4VarArr[0].getMeasuredWidth());
                }
                cn0Var.h.i(Math.abs(x10) / x4VarArr[0].getMeasuredWidth(), x4VarArr[1].f28749b);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f44073f0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f44078k0.computeCurrentVelocity(1000, cn0Var.f44722y);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f44078k0.getXVelocity();
                f11 = this.f44078k0.getYVelocity();
                if (!this.f44074g0 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    if (f10 < 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Y(motionEvent, z10);
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (this.f44074g0) {
                float x11 = x4VarArr[0].getX();
                cn0Var.f44718r = new AnimatorSet();
                if (Math.abs(x11) < x4VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                cn0Var.f44721x = z9;
                Property property = View.TRANSLATION_X;
                if (z9) {
                    measuredWidth = Math.abs(x11);
                    if (cn0Var.f44720w) {
                        cn0Var.f44718r.playTogether(ObjectAnimator.ofFloat(x4VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(x4VarArr[1], property, x4Var4.getMeasuredWidth()));
                    } else {
                        cn0Var.f44718r.playTogether(ObjectAnimator.ofFloat(x4VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(x4VarArr[1], property, -x4Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = x4VarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (cn0Var.f44720w) {
                        cn0Var.f44718r.playTogether(ObjectAnimator.ofFloat(x4VarArr[0], property, -x4Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(x4VarArr[1], property, 0.0f));
                    } else {
                        cn0Var.f44718r.playTogether(ObjectAnimator.ofFloat(x4VarArr[0], property, x4Var.getMeasuredWidth()), ObjectAnimator.ofFloat(x4VarArr[1], property, 0.0f));
                    }
                }
                cn0Var.f44718r.setInterpolator(cn0.D);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs2 = Math.abs(f10);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                cn0Var.f44718r.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                cn0Var.f44718r.addListener(new f30(this, 9));
                cn0Var.f44718r.start();
                cn0Var.f44719s = true;
                this.f44074g0 = false;
            } else {
                this.f44075h0 = false;
                kVar = ((org.telegram.ui.ActionBar.f2) cn0Var).actionBar;
                kVar.setEnabled(true);
                cn0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f44078k0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f44078k0 = null;
            }
        }
        return this.f44074g0;
    }

    @Override
    public final void requestLayout() {
        if (this.f44079l0) {
            return;
        }
        super.requestLayout();
    }
}
