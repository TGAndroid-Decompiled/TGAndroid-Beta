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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class oq0 extends org.telegram.ui.Components.ow0 {
    public int A0;
    public VelocityTracker B0;
    public boolean C0;
    public final rq0 D0;
    public int f40242w0;
    public boolean f40243x0;
    public boolean f40244y0;
    public int f40245z0;

    public oq0(rq0 rq0Var, Context context) {
        super(context, null);
        this.D0 = rq0Var;
    }

    public final boolean Y() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oq0.Y():boolean");
    }

    public final boolean Z(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        rq0 rq0Var = this.D0;
        pq0[] pq0VarArr = rq0Var.f41227n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = rq0Var.h;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i11 = scrollSlidingTextTabStrip.f24507n;
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
        this.f40244y0 = false;
        this.f40243x0 = true;
        this.f40245z0 = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.o2) rq0Var).actionBar;
        kVar.setEnabled(false);
        rq0Var.h.setEnabled(false);
        pq0 pq0Var = pq0VarArr[1];
        pq0Var.e = i12;
        pq0Var.setVisibility(0);
        rq0Var.v = z10;
        rq0Var.j0(true);
        if (z10) {
            pq0VarArr[1].setTranslationX(pq0VarArr[0].getMeasuredWidth());
            return true;
        }
        pq0VarArr[1].setTranslationX(-pq0VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        rq0 rq0Var = this.D0;
        kVar = ((org.telegram.ui.ActionBar.o2) rq0Var).actionBar;
        int measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.o2) rq0Var).actionBar;
        float translationY = measuredHeight + ((int) kVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.k6.f21304k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        rq0 rq0Var = this.D0;
        Paint paint = rq0Var.f41226f;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21125a7, false));
        kVar = ((org.telegram.ui.ActionBar.o2) rq0Var).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.o2) rq0Var).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!Y() && !this.D0.h.H && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oq0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.h5 h5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        float measuredWidth;
        pq0 pq0Var;
        pq0 pq0Var2;
        int measuredWidth2;
        pq0 pq0Var3;
        pq0 pq0Var4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        rq0 rq0Var = this.D0;
        pq0[] pq0VarArr = rq0Var.f41227n;
        h5Var = ((org.telegram.ui.ActionBar.o2) rq0Var).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) h5Var).i() || Y()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.B0 == null) {
                this.B0 = VelocityTracker.obtain();
            }
            this.B0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f40243x0 && !this.f40244y0) {
            this.f40242w0 = motionEvent.getPointerId(0);
            this.f40244y0 = true;
            this.f40245z0 = (int) motionEvent.getX();
            this.A0 = (int) motionEvent.getY();
            this.B0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f40242w0) {
            int x10 = (int) (motionEvent.getX() - this.f40245z0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.A0);
            if (this.f40243x0 && (((z12 = rq0Var.v) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!Z(motionEvent, z13)) {
                    this.f40244y0 = true;
                    this.f40243x0 = false;
                    pq0VarArr[0].setTranslationX(0.0f);
                    pq0 pq0Var5 = pq0VarArr[1];
                    if (rq0Var.v) {
                        i10 = pq0VarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -pq0VarArr[0].getMeasuredWidth();
                    }
                    pq0Var5.setTranslationX(i10);
                    rq0Var.h.i(0.0f, pq0VarArr[1].e);
                }
            }
            if (this.f40244y0 && !this.f40243x0) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    Z(motionEvent, z14);
                }
            } else if (this.f40243x0) {
                pq0VarArr[0].setTranslationX(x10);
                if (rq0Var.v) {
                    pq0VarArr[1].setTranslationX(pq0VarArr[0].getMeasuredWidth() + x10);
                } else {
                    pq0VarArr[1].setTranslationX(x10 - pq0VarArr[0].getMeasuredWidth());
                }
                rq0Var.h.i(Math.abs(x10) / pq0VarArr[0].getMeasuredWidth(), pq0VarArr[1].e);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f40242w0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.B0.computeCurrentVelocity(1000, rq0Var.f41231x);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.B0.getXVelocity();
                f10 = this.B0.getYVelocity();
                if (!this.f40243x0 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    if (f7 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Z(motionEvent, z11);
                }
            } else {
                f7 = 0.0f;
                f10 = 0.0f;
            }
            if (this.f40243x0) {
                float x11 = pq0VarArr[0].getX();
                rq0Var.f41228r = new AnimatorSet();
                if (Math.abs(x11) < pq0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rq0Var.f41230w = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (rq0Var.v) {
                        rq0Var.f41228r.playTogether(ObjectAnimator.ofFloat(pq0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(pq0VarArr[1], property, pq0Var4.getMeasuredWidth()));
                    } else {
                        rq0Var.f41228r.playTogether(ObjectAnimator.ofFloat(pq0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(pq0VarArr[1], property, -pq0Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = pq0VarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (rq0Var.v) {
                        rq0Var.f41228r.playTogether(ObjectAnimator.ofFloat(pq0VarArr[0], property, -pq0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(pq0VarArr[1], property, 0.0f));
                    } else {
                        rq0Var.f41228r.playTogether(ObjectAnimator.ofFloat(pq0VarArr[0], property, pq0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(pq0VarArr[1], property, 0.0f));
                    }
                }
                rq0Var.f41228r.setInterpolator(rq0.f41222y);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f7);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                rq0Var.f41228r.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                rq0Var.f41228r.addListener(new v70(this, 7));
                rq0Var.f41228r.start();
                rq0Var.f41229s = true;
                this.f40243x0 = false;
            } else {
                this.f40244y0 = false;
                kVar = ((org.telegram.ui.ActionBar.o2) rq0Var).actionBar;
                kVar.setEnabled(true);
                rq0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.B0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.B0 = null;
            }
        }
        return this.f40243x0;
    }

    @Override
    public final void requestLayout() {
        if (this.C0) {
            return;
        }
        super.requestLayout();
    }
}
