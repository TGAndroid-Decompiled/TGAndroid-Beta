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
public final class no0 extends org.telegram.ui.Components.uu0 {
    public int f40008f0;
    public boolean f40009g0;
    public boolean f40010h0;
    public int f40011i0;
    public int f40012j0;
    public VelocityTracker f40013k0;
    public boolean f40014l0;
    public final oo0 m0;

    public no0(oo0 oo0Var, Context context) {
        super(context, null);
        this.m0 = oo0Var;
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.no0.X():boolean");
    }

    public final boolean Y(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.l lVar;
        oo0 oo0Var = this.m0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = oo0Var.f40353n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = oo0Var.h;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i11 = scrollSlidingTextTabStrip.f24181n;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i12 = sparseIntArray.get(i11 + i10, -1);
        if (i12 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f40010h0 = false;
        this.f40009g0 = true;
        this.f40011i0 = (int) motionEvent.getX();
        lVar = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
        lVar.setEnabled(false);
        oo0Var.h.setEnabled(false);
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
        h5Var.f20379b = i12;
        h5Var.setVisibility(0);
        oo0Var.f40356w = z10;
        oo0Var.n0(true);
        if (z10) {
            h5VarArr[1].setTranslationX(h5VarArr[0].getMeasuredWidth());
            return true;
        }
        h5VarArr[1].setTranslationX(-h5VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        super.dispatchDraw(canvas);
        oo0 oo0Var = this.m0;
        lVar = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
        int measuredHeight = lVar.getMeasuredHeight();
        lVar2 = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
        float translationY = measuredHeight + ((int) lVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.t6.f21052k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        oo0 oo0Var = this.m0;
        Paint paint = oo0Var.f40352f;
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20872a7, false));
        lVar = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
        lVar2 = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
        canvas.drawRect(0.0f, lVar2.getTranslationY() + lVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.no0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.no0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.z4 z4Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.l lVar;
        boolean z10;
        float measuredWidth;
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        int measuredWidth2;
        org.telegram.ui.ActionBar.h5 h5Var3;
        org.telegram.ui.ActionBar.h5 h5Var4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        oo0 oo0Var = this.m0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = oo0Var.f40353n;
        z4Var = ((org.telegram.ui.ActionBar.k2) oo0Var).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) z4Var).i() || X()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f40013k0 == null) {
                this.f40013k0 = VelocityTracker.obtain();
            }
            this.f40013k0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f40009g0 && !this.f40010h0) {
            this.f40008f0 = motionEvent.getPointerId(0);
            this.f40010h0 = true;
            this.f40011i0 = (int) motionEvent.getX();
            this.f40012j0 = (int) motionEvent.getY();
            this.f40013k0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f40008f0) {
            int x10 = (int) (motionEvent.getX() - this.f40011i0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f40012j0);
            if (this.f40009g0 && (((z12 = oo0Var.f40356w) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!Y(motionEvent, z13)) {
                    this.f40010h0 = true;
                    this.f40009g0 = false;
                    h5VarArr[0].setTranslationX(0.0f);
                    org.telegram.ui.ActionBar.h5 h5Var5 = h5VarArr[1];
                    if (oo0Var.f40356w) {
                        i10 = h5VarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -h5VarArr[0].getMeasuredWidth();
                    }
                    h5Var5.setTranslationX(i10);
                    oo0Var.h.i(0.0f, h5VarArr[1].f20379b);
                }
            }
            if (this.f40010h0 && !this.f40009g0) {
                if (Math.abs(x10) >= org.telegram.messenger.i0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    Y(motionEvent, z14);
                }
            } else if (this.f40009g0) {
                h5VarArr[0].setTranslationX(x10);
                if (oo0Var.f40356w) {
                    h5VarArr[1].setTranslationX(h5VarArr[0].getMeasuredWidth() + x10);
                } else {
                    h5VarArr[1].setTranslationX(x10 - h5VarArr[0].getMeasuredWidth());
                }
                oo0Var.h.i(Math.abs(x10) / h5VarArr[0].getMeasuredWidth(), h5VarArr[1].f20379b);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f40008f0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f40013k0.computeCurrentVelocity(1000, oo0Var.f40358y);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.f40013k0.getXVelocity();
                f10 = this.f40013k0.getYVelocity();
                if (!this.f40009g0 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    if (f7 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Y(motionEvent, z11);
                }
            } else {
                f7 = 0.0f;
                f10 = 0.0f;
            }
            if (this.f40009g0) {
                float x11 = h5VarArr[0].getX();
                oo0Var.f40354r = new AnimatorSet();
                if (Math.abs(x11) < h5VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                oo0Var.f40357x = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (oo0Var.f40356w) {
                        oo0Var.f40354r.playTogether(ObjectAnimator.ofFloat(h5VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(h5VarArr[1], property, h5Var4.getMeasuredWidth()));
                    } else {
                        oo0Var.f40354r.playTogether(ObjectAnimator.ofFloat(h5VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(h5VarArr[1], property, -h5Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = h5VarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (oo0Var.f40356w) {
                        oo0Var.f40354r.playTogether(ObjectAnimator.ofFloat(h5VarArr[0], property, -h5Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(h5VarArr[1], property, 0.0f));
                    } else {
                        oo0Var.f40354r.playTogether(ObjectAnimator.ofFloat(h5VarArr[0], property, h5Var.getMeasuredWidth()), ObjectAnimator.ofFloat(h5VarArr[1], property, 0.0f));
                    }
                }
                oo0Var.f40354r.setInterpolator(oo0.D);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.i0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f7);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                oo0Var.f40354r.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                oo0Var.f40354r.addListener(new org.telegram.ui.Components.voip.h2(this, 20));
                oo0Var.f40354r.start();
                oo0Var.f40355s = true;
                this.f40009g0 = false;
            } else {
                this.f40010h0 = false;
                lVar = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
                lVar.setEnabled(true);
                oo0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f40013k0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f40013k0 = null;
            }
        }
        return this.f40009g0;
    }

    @Override
    public final void requestLayout() {
        if (this.f40014l0) {
            return;
        }
        super.requestLayout();
    }
}
