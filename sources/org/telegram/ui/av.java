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
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class av extends FrameLayout {
    public int f35837a;
    public boolean f35838b;
    public boolean f35839c;
    public int d;
    public int e;
    public VelocityTracker f35840f;
    public boolean h;
    public final cv f35841n;

    public av(cv cvVar, Context context) {
        super(context);
        this.f35841n = cvVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.av.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.l lVar;
        cv cvVar = this.f35841n;
        bv[] bvVarArr = cvVar.f36418f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = cvVar.e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i11 = scrollSlidingTextTabStrip.f24182n;
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
        this.f35839c = false;
        this.f35838b = true;
        this.d = (int) motionEvent.getX();
        lVar = ((org.telegram.ui.ActionBar.k2) cvVar).actionBar;
        lVar.setEnabled(false);
        cvVar.e.setEnabled(false);
        bv bvVar = bvVarArr[1];
        bvVar.f36120f = i12;
        bvVar.setVisibility(0);
        cvVar.f36420r = z10;
        cvVar.r0(true);
        if (z10) {
            bvVarArr[1].setTranslationX(bvVarArr[0].getMeasuredWidth());
            return true;
        }
        bvVarArr[1].setTranslationX(-bvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        super.dispatchDraw(canvas);
        cv cvVar = this.f35841n;
        z4Var = ((org.telegram.ui.ActionBar.k2) cvVar).parentLayout;
        if (z4Var != null) {
            z4Var2 = ((org.telegram.ui.ActionBar.k2) cvVar).parentLayout;
            lVar = ((org.telegram.ui.ActionBar.k2) cvVar).actionBar;
            int measuredHeight = lVar.getMeasuredHeight();
            lVar2 = ((org.telegram.ui.ActionBar.k2) cvVar).actionBar;
            ((ActionBarLayout) z4Var2).q(canvas, measuredHeight + ((int) lVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        cv cvVar = this.f35841n;
        Paint paint = cvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false));
        lVar = ((org.telegram.ui.ActionBar.k2) cvVar).actionBar;
        lVar2 = ((org.telegram.ui.ActionBar.k2) cvVar).actionBar;
        canvas.drawRect(0.0f, lVar2.getTranslationY() + lVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f35841n.e.H && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        cv cvVar = this.f35841n;
        bv[] bvVarArr = cvVar.f36418f;
        lVar = ((org.telegram.ui.ActionBar.k2) cvVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        lVar2 = ((org.telegram.ui.ActionBar.k2) cvVar).actionBar;
        int measuredHeight = lVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < bvVarArr.length; i12++) {
            bv bvVar = bvVarArr[i12];
            if (bvVar != null) {
                org.telegram.ui.Components.uk0 uk0Var = bvVar.d;
                if (uk0Var != null) {
                    uk0Var.setPadding(0, measuredHeight, 0, 0);
                }
                ag.b1 b1Var = bvVarArr[i12].e;
                if (b1Var != null) {
                    b1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar3 = ((org.telegram.ui.ActionBar.k2) cvVar).actionBar;
                if (childAt != lVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.z4 z4Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.l lVar;
        boolean z10;
        float measuredWidth;
        bv bvVar;
        bv bvVar2;
        int measuredWidth2;
        bv bvVar3;
        bv bvVar4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        cv cvVar = this.f35841n;
        bv[] bvVarArr = cvVar.f36418f;
        z4Var = ((org.telegram.ui.ActionBar.k2) cvVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) z4Var).i() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f35840f == null) {
                this.f35840f = VelocityTracker.obtain();
            }
            this.f35840f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f35838b && !this.f35839c) {
            this.f35837a = motionEvent.getPointerId(0);
            this.f35839c = true;
            this.d = (int) motionEvent.getX();
            this.e = (int) motionEvent.getY();
            this.f35840f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f35837a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.f35838b && (((z12 = cvVar.f36420r) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f35839c = true;
                    this.f35838b = false;
                    bvVarArr[0].setTranslationX(0.0f);
                    bv bvVar5 = bvVarArr[1];
                    if (cvVar.f36420r) {
                        i10 = bvVarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -bvVarArr[0].getMeasuredWidth();
                    }
                    bvVar5.setTranslationX(i10);
                    cvVar.e.i(0.0f, bvVarArr[1].f36120f);
                }
            }
            if (this.f35839c && !this.f35838b) {
                if (Math.abs(x10) >= org.telegram.messenger.i0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f35838b) {
                bvVarArr[0].setTranslationX(x10);
                if (cvVar.f36420r) {
                    bvVarArr[1].setTranslationX(bvVarArr[0].getMeasuredWidth() + x10);
                } else {
                    bvVarArr[1].setTranslationX(x10 - bvVarArr[0].getMeasuredWidth());
                }
                cvVar.e.i(Math.abs(x10) / bvVarArr[0].getMeasuredWidth(), bvVarArr[1].f36120f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f35837a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f35840f.computeCurrentVelocity(1000, cvVar.f36422w);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.f35840f.getXVelocity();
                f10 = this.f35840f.getYVelocity();
                if (!this.f35838b && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    if (f7 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b(motionEvent, z11);
                }
            } else {
                f7 = 0.0f;
                f10 = 0.0f;
            }
            if (this.f35838b) {
                float x11 = bvVarArr[0].getX();
                cvVar.h = new AnimatorSet();
                if (Math.abs(x11) < bvVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cvVar.f36421s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (cvVar.f36420r) {
                        cvVar.h.playTogether(ObjectAnimator.ofFloat(bvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(bvVarArr[1], property, bvVar4.getMeasuredWidth()));
                    } else {
                        cvVar.h.playTogether(ObjectAnimator.ofFloat(bvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(bvVarArr[1], property, -bvVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = bvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (cvVar.f36420r) {
                        cvVar.h.playTogether(ObjectAnimator.ofFloat(bvVarArr[0], property, -bvVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(bvVarArr[1], property, 0.0f));
                    } else {
                        cvVar.h.playTogether(ObjectAnimator.ofFloat(bvVarArr[0], property, bvVar.getMeasuredWidth()), ObjectAnimator.ofFloat(bvVarArr[1], property, 0.0f));
                    }
                }
                cvVar.h.setInterpolator(cv.f36414y);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.i0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f7);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                cvVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                cvVar.h.addListener(new org.telegram.ui.Components.voip.i2(this, 4));
                cvVar.h.start();
                cvVar.f36419n = true;
                this.f35838b = false;
            } else {
                this.f35839c = false;
                lVar = ((org.telegram.ui.ActionBar.k2) cvVar).actionBar;
                lVar.setEnabled(true);
                cvVar.e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f35840f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f35840f = null;
            }
        }
        return this.f35838b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
