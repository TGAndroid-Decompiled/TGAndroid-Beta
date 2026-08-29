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
public final class bq0 extends org.telegram.ui.Components.hv0 {
    public int f36883s0;
    public boolean f36884t0;
    public boolean f36885u0;
    public int f36886v0;
    public int f36887w0;
    public VelocityTracker f36888x0;
    public boolean f36889y0;
    public final eq0 f36890z0;

    public bq0(eq0 eq0Var, Context context) {
        super(context, null);
        this.f36890z0 = eq0Var;
    }

    public final boolean Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bq0.Z():boolean");
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.l lVar;
        eq0 eq0Var = this.f36890z0;
        cq0[] cq0VarArr = eq0Var.f37891n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = eq0Var.h;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.K;
        int i11 = scrollSlidingTextTabStrip.f26538n;
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
        this.f36885u0 = false;
        this.f36884t0 = true;
        this.f36886v0 = (int) motionEvent.getX();
        lVar = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
        lVar.setEnabled(false);
        eq0Var.h.setEnabled(false);
        cq0 cq0Var = cq0VarArr[1];
        cq0Var.f37196e = i12;
        cq0Var.setVisibility(0);
        eq0Var.v = z10;
        eq0Var.j0(true);
        if (z10) {
            cq0VarArr[1].setTranslationX(cq0VarArr[0].getMeasuredWidth());
            return true;
        }
        cq0VarArr[1].setTranslationX(-cq0VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        super.dispatchDraw(canvas);
        eq0 eq0Var = this.f36890z0;
        lVar = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
        int measuredHeight = lVar.getMeasuredHeight();
        lVar2 = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
        float translationY = measuredHeight + ((int) lVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.g6.f23183k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        eq0 eq0Var = this.f36890z0;
        Paint paint = eq0Var.f37890f;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        lVar = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
        lVar2 = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
        canvas.drawRect(0.0f, lVar2.getTranslationY() + lVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!Z() && !this.f36890z0.h.D && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bq0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b5 b5Var;
        float f9;
        float f10;
        org.telegram.ui.ActionBar.l lVar;
        boolean z10;
        float measuredWidth;
        cq0 cq0Var;
        cq0 cq0Var2;
        int measuredWidth2;
        cq0 cq0Var3;
        cq0 cq0Var4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        eq0 eq0Var = this.f36890z0;
        cq0[] cq0VarArr = eq0Var.f37891n;
        b5Var = ((org.telegram.ui.ActionBar.o2) eq0Var).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) b5Var).j() || Z()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f36888x0 == null) {
                this.f36888x0 = VelocityTracker.obtain();
            }
            this.f36888x0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f36884t0 && !this.f36885u0) {
            this.f36883s0 = motionEvent.getPointerId(0);
            this.f36885u0 = true;
            this.f36886v0 = (int) motionEvent.getX();
            this.f36887w0 = (int) motionEvent.getY();
            this.f36888x0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f36883s0) {
            int x4 = (int) (motionEvent.getX() - this.f36886v0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f36887w0);
            if (this.f36884t0 && (((z12 = eq0Var.v) && x4 > 0) || (!z12 && x4 < 0))) {
                if (x4 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!a0(motionEvent, z13)) {
                    this.f36885u0 = true;
                    this.f36884t0 = false;
                    cq0VarArr[0].setTranslationX(0.0f);
                    cq0 cq0Var5 = cq0VarArr[1];
                    if (eq0Var.v) {
                        i10 = cq0VarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -cq0VarArr[0].getMeasuredWidth();
                    }
                    cq0Var5.setTranslationX(i10);
                    eq0Var.h.j(0.0f, cq0VarArr[1].f37196e);
                }
            }
            if (this.f36885u0 && !this.f36884t0) {
                if (Math.abs(x4) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x4) > abs) {
                    if (x4 < 0) {
                        z14 = true;
                    }
                    a0(motionEvent, z14);
                }
            } else if (this.f36884t0) {
                cq0VarArr[0].setTranslationX(x4);
                if (eq0Var.v) {
                    cq0VarArr[1].setTranslationX(cq0VarArr[0].getMeasuredWidth() + x4);
                } else {
                    cq0VarArr[1].setTranslationX(x4 - cq0VarArr[0].getMeasuredWidth());
                }
                eq0Var.h.j(Math.abs(x4) / cq0VarArr[0].getMeasuredWidth(), cq0VarArr[1].f37196e);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f36883s0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f36888x0.computeCurrentVelocity(1000, eq0Var.f37895x);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f9 = this.f36888x0.getXVelocity();
                f10 = this.f36888x0.getYVelocity();
                if (!this.f36884t0 && Math.abs(f9) >= 3000.0f && Math.abs(f9) > Math.abs(f10)) {
                    if (f9 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a0(motionEvent, z11);
                }
            } else {
                f9 = 0.0f;
                f10 = 0.0f;
            }
            if (this.f36884t0) {
                float x10 = cq0VarArr[0].getX();
                eq0Var.f37892r = new AnimatorSet();
                if (Math.abs(x10) < cq0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f9) < 3500.0f || Math.abs(f9) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eq0Var.f37894w = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x10);
                    if (eq0Var.v) {
                        eq0Var.f37892r.playTogether(ObjectAnimator.ofFloat(cq0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(cq0VarArr[1], property, cq0Var4.getMeasuredWidth()));
                    } else {
                        eq0Var.f37892r.playTogether(ObjectAnimator.ofFloat(cq0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(cq0VarArr[1], property, -cq0Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = cq0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (eq0Var.v) {
                        eq0Var.f37892r.playTogether(ObjectAnimator.ofFloat(cq0VarArr[0], property, -cq0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(cq0VarArr[1], property, 0.0f));
                    } else {
                        eq0Var.f37892r.playTogether(ObjectAnimator.ofFloat(cq0VarArr[0], property, cq0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(cq0VarArr[1], property, 0.0f));
                    }
                }
                eq0Var.f37892r.setInterpolator(eq0.f37885y);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f9);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                eq0Var.f37892r.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                eq0Var.f37892r.addListener(new e50(this, 8));
                eq0Var.f37892r.start();
                eq0Var.f37893s = true;
                this.f36884t0 = false;
            } else {
                this.f36885u0 = false;
                lVar = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
                lVar.setEnabled(true);
                eq0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f36888x0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f36888x0 = null;
            }
        }
        return this.f36884t0;
    }

    @Override
    public final void requestLayout() {
        if (this.f36889y0) {
            return;
        }
        super.requestLayout();
    }
}
