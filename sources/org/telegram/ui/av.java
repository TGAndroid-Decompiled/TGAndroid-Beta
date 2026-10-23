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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class av extends FrameLayout {
    public int f35783a;
    public boolean f35784b;
    public boolean f35785c;
    public int d;
    public int e;
    public VelocityTracker f35786f;
    public boolean h;
    public final cv f35787n;

    public av(cv cvVar, Context context) {
        super(context);
        this.f35787n = cvVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.av.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        cv cvVar = this.f35787n;
        bv[] bvVarArr = cvVar.f36432f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = cvVar.e;
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
        this.f35785c = false;
        this.f35784b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
        kVar.setEnabled(false);
        cvVar.e.setEnabled(false);
        bv bvVar = bvVarArr[1];
        bvVar.f36175f = i12;
        bvVar.setVisibility(0);
        cvVar.f36434r = z10;
        cvVar.m0(true);
        if (z10) {
            bvVarArr[1].setTranslationX(bvVarArr[0].getMeasuredWidth());
            return true;
        }
        bvVarArr[1].setTranslationX(-bvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        cv cvVar = this.f35787n;
        h5Var = ((org.telegram.ui.ActionBar.o2) cvVar).parentLayout;
        if (h5Var != null) {
            h5Var2 = ((org.telegram.ui.ActionBar.o2) cvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
            ((ActionBarLayout) h5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cv cvVar = this.f35787n;
        Paint paint = cvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false));
        kVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f35787n.e.H && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        cv cvVar = this.f35787n;
        bv[] bvVarArr = cvVar.f36432f;
        kVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < bvVarArr.length; i12++) {
            bv bvVar = bvVarArr[i12];
            if (bvVar != null) {
                org.telegram.ui.Components.mm0 mm0Var = bvVar.d;
                if (mm0Var != null) {
                    mm0Var.setPadding(0, measuredHeight, 0, 0);
                }
                ai.u1 u1Var = bvVarArr[i12].e;
                if (u1Var != null) {
                    u1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.h5 h5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
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
        cv cvVar = this.f35787n;
        bv[] bvVarArr = cvVar.f36432f;
        h5Var = ((org.telegram.ui.ActionBar.o2) cvVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) h5Var).i() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f35786f == null) {
                this.f35786f = VelocityTracker.obtain();
            }
            this.f35786f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f35784b && !this.f35785c) {
            this.f35783a = motionEvent.getPointerId(0);
            this.f35785c = true;
            this.d = (int) motionEvent.getX();
            this.e = (int) motionEvent.getY();
            this.f35786f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f35783a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.f35784b && (((z12 = cvVar.f36434r) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f35785c = true;
                    this.f35784b = false;
                    bvVarArr[0].setTranslationX(0.0f);
                    bv bvVar5 = bvVarArr[1];
                    if (cvVar.f36434r) {
                        i10 = bvVarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -bvVarArr[0].getMeasuredWidth();
                    }
                    bvVar5.setTranslationX(i10);
                    cvVar.e.i(0.0f, bvVarArr[1].f36175f);
                }
            }
            if (this.f35785c && !this.f35784b) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f35784b) {
                bvVarArr[0].setTranslationX(x10);
                if (cvVar.f36434r) {
                    bvVarArr[1].setTranslationX(bvVarArr[0].getMeasuredWidth() + x10);
                } else {
                    bvVarArr[1].setTranslationX(x10 - bvVarArr[0].getMeasuredWidth());
                }
                cvVar.e.i(Math.abs(x10) / bvVarArr[0].getMeasuredWidth(), bvVarArr[1].f36175f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f35783a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f35786f.computeCurrentVelocity(1000, cvVar.v);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.f35786f.getXVelocity();
                f10 = this.f35786f.getYVelocity();
                if (!this.f35784b && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
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
            if (this.f35784b) {
                float x11 = bvVarArr[0].getX();
                cvVar.h = new AnimatorSet();
                if (Math.abs(x11) < bvVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cvVar.f36435s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (cvVar.f36434r) {
                        cvVar.h.playTogether(ObjectAnimator.ofFloat(bvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(bvVarArr[1], property, bvVar4.getMeasuredWidth()));
                    } else {
                        cvVar.h.playTogether(ObjectAnimator.ofFloat(bvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(bvVarArr[1], property, -bvVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = bvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (cvVar.f36434r) {
                        cvVar.h.playTogether(ObjectAnimator.ofFloat(bvVarArr[0], property, -bvVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(bvVarArr[1], property, 0.0f));
                    } else {
                        cvVar.h.playTogether(ObjectAnimator.ofFloat(bvVarArr[0], property, bvVar.getMeasuredWidth()), ObjectAnimator.ofFloat(bvVarArr[1], property, 0.0f));
                    }
                }
                cvVar.h.setInterpolator(cv.f36428x);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f7);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                cvVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                cvVar.h.addListener(new org.telegram.ui.Components.p31(this, 22));
                cvVar.h.start();
                cvVar.f36433n = true;
                this.f35784b = false;
            } else {
                this.f35785c = false;
                kVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
                kVar.setEnabled(true);
                cvVar.e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f35786f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f35786f = null;
            }
        }
        return this.f35784b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
