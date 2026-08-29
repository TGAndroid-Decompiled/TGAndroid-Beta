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
    public int f36605a;
    public boolean f36606b;
    public boolean f36607c;
    public int d;
    public int f36608e;
    public VelocityTracker f36609f;
    public boolean h;
    public final cv f36610n;

    public av(cv cvVar, Context context) {
        super(context);
        this.f36610n = cvVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.av.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.l lVar;
        cv cvVar = this.f36610n;
        bv[] bvVarArr = cvVar.f37222f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = cvVar.f37221e;
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
        this.f36607c = false;
        this.f36606b = true;
        this.d = (int) motionEvent.getX();
        lVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
        lVar.setEnabled(false);
        cvVar.f37221e.setEnabled(false);
        bv bvVar = bvVarArr[1];
        bvVar.f36927f = i12;
        bvVar.setVisibility(0);
        cvVar.f37224r = z10;
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
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        super.dispatchDraw(canvas);
        cv cvVar = this.f36610n;
        b5Var = ((org.telegram.ui.ActionBar.o2) cvVar).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.o2) cvVar).parentLayout;
            lVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
            int measuredHeight = lVar.getMeasuredHeight();
            lVar2 = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
            ((ActionBarLayout) b5Var2).q(canvas, measuredHeight + ((int) lVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        cv cvVar = this.f36610n;
        Paint paint = cvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        lVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
        lVar2 = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
        canvas.drawRect(0.0f, lVar2.getTranslationY() + lVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f36610n.f37221e.D && !onTouchEvent(motionEvent)) {
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
        cv cvVar = this.f36610n;
        bv[] bvVarArr = cvVar.f37222f;
        lVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        lVar2 = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
        int measuredHeight = lVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < bvVarArr.length; i12++) {
            bv bvVar = bvVarArr[i12];
            if (bvVar != null) {
                org.telegram.ui.Components.jl0 jl0Var = bvVar.d;
                if (jl0Var != null) {
                    jl0Var.setPadding(0, measuredHeight, 0, 0);
                }
                jh.e1 e1Var = bvVarArr[i12].f36926e;
                if (e1Var != null) {
                    e1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar3 = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
                if (childAt != lVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b5 b5Var;
        float f9;
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
        cv cvVar = this.f36610n;
        bv[] bvVarArr = cvVar.f37222f;
        b5Var = ((org.telegram.ui.ActionBar.o2) cvVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) b5Var).j() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f36609f == null) {
                this.f36609f = VelocityTracker.obtain();
            }
            this.f36609f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f36606b && !this.f36607c) {
            this.f36605a = motionEvent.getPointerId(0);
            this.f36607c = true;
            this.d = (int) motionEvent.getX();
            this.f36608e = (int) motionEvent.getY();
            this.f36609f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f36605a) {
            int x4 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f36608e);
            if (this.f36606b && (((z12 = cvVar.f37224r) && x4 > 0) || (!z12 && x4 < 0))) {
                if (x4 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f36607c = true;
                    this.f36606b = false;
                    bvVarArr[0].setTranslationX(0.0f);
                    bv bvVar5 = bvVarArr[1];
                    if (cvVar.f37224r) {
                        i10 = bvVarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -bvVarArr[0].getMeasuredWidth();
                    }
                    bvVar5.setTranslationX(i10);
                    cvVar.f37221e.j(0.0f, bvVarArr[1].f36927f);
                }
            }
            if (this.f36607c && !this.f36606b) {
                if (Math.abs(x4) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x4) > abs) {
                    if (x4 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f36606b) {
                bvVarArr[0].setTranslationX(x4);
                if (cvVar.f37224r) {
                    bvVarArr[1].setTranslationX(bvVarArr[0].getMeasuredWidth() + x4);
                } else {
                    bvVarArr[1].setTranslationX(x4 - bvVarArr[0].getMeasuredWidth());
                }
                cvVar.f37221e.j(Math.abs(x4) / bvVarArr[0].getMeasuredWidth(), bvVarArr[1].f36927f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f36605a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f36609f.computeCurrentVelocity(1000, cvVar.v);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f9 = this.f36609f.getXVelocity();
                f10 = this.f36609f.getYVelocity();
                if (!this.f36606b && Math.abs(f9) >= 3000.0f && Math.abs(f9) > Math.abs(f10)) {
                    if (f9 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b(motionEvent, z11);
                }
            } else {
                f9 = 0.0f;
                f10 = 0.0f;
            }
            if (this.f36606b) {
                float x10 = bvVarArr[0].getX();
                cvVar.h = new AnimatorSet();
                if (Math.abs(x10) < bvVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f9) < 3500.0f || Math.abs(f9) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cvVar.f37225s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x10);
                    if (cvVar.f37224r) {
                        cvVar.h.playTogether(ObjectAnimator.ofFloat(bvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(bvVarArr[1], property, bvVar4.getMeasuredWidth()));
                    } else {
                        cvVar.h.playTogether(ObjectAnimator.ofFloat(bvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(bvVarArr[1], property, -bvVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = bvVarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (cvVar.f37224r) {
                        cvVar.h.playTogether(ObjectAnimator.ofFloat(bvVarArr[0], property, -bvVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(bvVarArr[1], property, 0.0f));
                    } else {
                        cvVar.h.playTogether(ObjectAnimator.ofFloat(bvVarArr[0], property, bvVar.getMeasuredWidth()), ObjectAnimator.ofFloat(bvVarArr[1], property, 0.0f));
                    }
                }
                cvVar.h.setInterpolator(cv.f37217x);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f9);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                cvVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                cvVar.h.addListener(new org.telegram.ui.Components.p11(this, 23));
                cvVar.h.start();
                cvVar.f37223n = true;
                this.f36606b = false;
            } else {
                this.f36607c = false;
                lVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
                lVar.setEnabled(true);
                cvVar.f37221e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f36609f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f36609f = null;
            }
        }
        return this.f36606b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
