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
public final class hv extends FrameLayout {
    public int f34277a;
    public boolean f34278b;
    public boolean f34279c;
    public int d;
    public int e;
    public VelocityTracker f34280f;
    public boolean h;
    public final jv f34281n;

    public hv(jv jvVar, Context context) {
        super(context);
        this.f34281n = jvVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hv.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        jv jvVar = this.f34281n;
        iv[] ivVarArr = jvVar.f34864f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = jvVar.e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i11 = scrollSlidingTextTabStrip.f22390n;
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
        this.f34279c = false;
        this.f34278b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
        kVar.setEnabled(false);
        jvVar.e.setEnabled(false);
        iv ivVar = ivVarArr[1];
        ivVar.f34572f = i12;
        ivVar.setVisibility(0);
        jvVar.f34866r = z10;
        jvVar.m0(true);
        if (z10) {
            ivVarArr[1].setTranslationX(ivVarArr[0].getMeasuredWidth());
            return true;
        }
        ivVarArr[1].setTranslationX(-ivVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        jv jvVar = this.f34281n;
        b5Var = ((org.telegram.ui.ActionBar.m2) jvVar).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) jvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
            ((ActionBarLayout) b5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        jv jvVar = this.f34281n;
        Paint paint = jvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
        kVar = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f34281n.e.H && !onTouchEvent(motionEvent)) {
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
        jv jvVar = this.f34281n;
        iv[] ivVarArr = jvVar.f34864f;
        kVar = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < ivVarArr.length; i12++) {
            iv ivVar = ivVarArr[i12];
            if (ivVar != null) {
                org.telegram.ui.Components.wl0 wl0Var = ivVar.d;
                if (wl0Var != null) {
                    wl0Var.setPadding(0, measuredHeight, 0, 0);
                }
                ai.w0 w0Var = ivVarArr[i12].e;
                if (w0Var != null) {
                    w0Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b5 b5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        float measuredWidth;
        iv ivVar;
        iv ivVar2;
        int measuredWidth2;
        iv ivVar3;
        iv ivVar4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        jv jvVar = this.f34281n;
        iv[] ivVarArr = jvVar.f34864f;
        b5Var = ((org.telegram.ui.ActionBar.m2) jvVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) b5Var).j() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f34280f == null) {
                this.f34280f = VelocityTracker.obtain();
            }
            this.f34280f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f34278b && !this.f34279c) {
            this.f34277a = motionEvent.getPointerId(0);
            this.f34279c = true;
            this.d = (int) motionEvent.getX();
            this.e = (int) motionEvent.getY();
            this.f34280f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f34277a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.f34278b && (((z12 = jvVar.f34866r) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f34279c = true;
                    this.f34278b = false;
                    ivVarArr[0].setTranslationX(0.0f);
                    iv ivVar5 = ivVarArr[1];
                    if (jvVar.f34866r) {
                        i10 = ivVarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -ivVarArr[0].getMeasuredWidth();
                    }
                    ivVar5.setTranslationX(i10);
                    jvVar.e.j(0.0f, ivVarArr[1].f34572f);
                }
            }
            if (this.f34279c && !this.f34278b) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f34278b) {
                ivVarArr[0].setTranslationX(x10);
                if (jvVar.f34866r) {
                    ivVarArr[1].setTranslationX(ivVarArr[0].getMeasuredWidth() + x10);
                } else {
                    ivVarArr[1].setTranslationX(x10 - ivVarArr[0].getMeasuredWidth());
                }
                jvVar.e.j(Math.abs(x10) / ivVarArr[0].getMeasuredWidth(), ivVarArr[1].f34572f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f34277a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f34280f.computeCurrentVelocity(1000, jvVar.v);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.f34280f.getXVelocity();
                f10 = this.f34280f.getYVelocity();
                if (!this.f34278b && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
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
            if (this.f34278b) {
                float x11 = ivVarArr[0].getX();
                jvVar.h = new AnimatorSet();
                if (Math.abs(x11) < ivVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jvVar.f34867s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (jvVar.f34866r) {
                        jvVar.h.playTogether(ObjectAnimator.ofFloat(ivVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(ivVarArr[1], property, ivVar4.getMeasuredWidth()));
                    } else {
                        jvVar.h.playTogether(ObjectAnimator.ofFloat(ivVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(ivVarArr[1], property, -ivVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = ivVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (jvVar.f34866r) {
                        jvVar.h.playTogether(ObjectAnimator.ofFloat(ivVarArr[0], property, -ivVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(ivVarArr[1], property, 0.0f));
                    } else {
                        jvVar.h.playTogether(ObjectAnimator.ofFloat(ivVarArr[0], property, ivVar.getMeasuredWidth()), ObjectAnimator.ofFloat(ivVarArr[1], property, 0.0f));
                    }
                }
                jvVar.h.setInterpolator(jv.f34860x);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f7);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                jvVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                jvVar.h.addListener(new org.telegram.ui.Components.q81(this, 16));
                jvVar.h.start();
                jvVar.f34865n = true;
                this.f34278b = false;
            } else {
                this.f34279c = false;
                kVar = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
                kVar.setEnabled(true);
                jvVar.e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f34280f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f34280f = null;
            }
        }
        return this.f34278b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
