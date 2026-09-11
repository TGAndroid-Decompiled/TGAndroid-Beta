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
public final class mv extends FrameLayout {
    public int f38766a;
    public boolean f38767b;
    public boolean f38768c;
    public int d;
    public int f38769e;
    public VelocityTracker f38770f;
    public boolean h;
    public final ov f38771n;

    public mv(ov ovVar, Context context) {
        super(context);
        this.f38771n = ovVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mv.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        ov ovVar = this.f38771n;
        nv[] nvVarArr = ovVar.f39321f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = ovVar.f39320e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i11 = scrollSlidingTextTabStrip.f24131n;
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
        this.f38768c = false;
        this.f38767b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
        kVar.setEnabled(false);
        ovVar.f39320e.setEnabled(false);
        nv nvVar = nvVarArr[1];
        nvVar.f39039f = i12;
        nvVar.setVisibility(0);
        ovVar.f39323r = z10;
        ovVar.m0(true);
        if (z10) {
            nvVarArr[1].setTranslationX(nvVarArr[0].getMeasuredWidth());
            return true;
        }
        nvVarArr[1].setTranslationX(-nvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        ov ovVar = this.f38771n;
        d5Var = ((org.telegram.ui.ActionBar.n2) ovVar).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) ovVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
            ((ActionBarLayout) d5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ov ovVar = this.f38771n;
        Paint paint = ovVar.d;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false));
        kVar = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f38771n.f39320e.H && !onTouchEvent(motionEvent)) {
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
        ov ovVar = this.f38771n;
        nv[] nvVarArr = ovVar.f39321f;
        kVar = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < nvVarArr.length; i12++) {
            nv nvVar = nvVarArr[i12];
            if (nvVar != null) {
                org.telegram.ui.Components.ll0 ll0Var = nvVar.d;
                if (ll0Var != null) {
                    ll0Var.setPadding(0, measuredHeight, 0, 0);
                }
                bi.o0 o0Var = nvVarArr[i12].f39038e;
                if (o0Var != null) {
                    o0Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.d5 d5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        float measuredWidth;
        nv nvVar;
        nv nvVar2;
        int measuredWidth2;
        nv nvVar3;
        nv nvVar4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        ov ovVar = this.f38771n;
        nv[] nvVarArr = ovVar.f39321f;
        d5Var = ((org.telegram.ui.ActionBar.n2) ovVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) d5Var).j() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f38770f == null) {
                this.f38770f = VelocityTracker.obtain();
            }
            this.f38770f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f38767b && !this.f38768c) {
            this.f38766a = motionEvent.getPointerId(0);
            this.f38768c = true;
            this.d = (int) motionEvent.getX();
            this.f38769e = (int) motionEvent.getY();
            this.f38770f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f38766a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f38769e);
            if (this.f38767b && (((z12 = ovVar.f39323r) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f38768c = true;
                    this.f38767b = false;
                    nvVarArr[0].setTranslationX(0.0f);
                    nv nvVar5 = nvVarArr[1];
                    if (ovVar.f39323r) {
                        i10 = nvVarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -nvVarArr[0].getMeasuredWidth();
                    }
                    nvVar5.setTranslationX(i10);
                    ovVar.f39320e.j(0.0f, nvVarArr[1].f39039f);
                }
            }
            if (this.f38768c && !this.f38767b) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f38767b) {
                nvVarArr[0].setTranslationX(x10);
                if (ovVar.f39323r) {
                    nvVarArr[1].setTranslationX(nvVarArr[0].getMeasuredWidth() + x10);
                } else {
                    nvVarArr[1].setTranslationX(x10 - nvVarArr[0].getMeasuredWidth());
                }
                ovVar.f39320e.j(Math.abs(x10) / nvVarArr[0].getMeasuredWidth(), nvVarArr[1].f39039f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f38766a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f38770f.computeCurrentVelocity(1000, ovVar.v);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.f38770f.getXVelocity();
                f10 = this.f38770f.getYVelocity();
                if (!this.f38767b && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
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
            if (this.f38767b) {
                float x11 = nvVarArr[0].getX();
                ovVar.h = new AnimatorSet();
                if (Math.abs(x11) < nvVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ovVar.f39324s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (ovVar.f39323r) {
                        ovVar.h.playTogether(ObjectAnimator.ofFloat(nvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(nvVarArr[1], property, nvVar4.getMeasuredWidth()));
                    } else {
                        ovVar.h.playTogether(ObjectAnimator.ofFloat(nvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(nvVarArr[1], property, -nvVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = nvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (ovVar.f39323r) {
                        ovVar.h.playTogether(ObjectAnimator.ofFloat(nvVarArr[0], property, -nvVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(nvVarArr[1], property, 0.0f));
                    } else {
                        ovVar.h.playTogether(ObjectAnimator.ofFloat(nvVarArr[0], property, nvVar.getMeasuredWidth()), ObjectAnimator.ofFloat(nvVarArr[1], property, 0.0f));
                    }
                }
                ovVar.h.setInterpolator(ov.f39316x);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f7);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                ovVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                ovVar.h.addListener(new org.telegram.ui.Components.k61(this, 18));
                ovVar.h.start();
                ovVar.f39322n = true;
                this.f38767b = false;
            } else {
                this.f38768c = false;
                kVar = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
                kVar.setEnabled(true);
                ovVar.f39320e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f38770f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f38770f = null;
            }
        }
        return this.f38767b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
