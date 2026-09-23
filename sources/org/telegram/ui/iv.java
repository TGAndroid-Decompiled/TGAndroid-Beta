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
public final class iv extends FrameLayout {
    public int f34247a;
    public boolean f34248b;
    public boolean f34249c;
    public int d;
    public int e;
    public VelocityTracker f34250f;
    public boolean h;
    public final kv f34251n;

    public iv(kv kvVar, Context context) {
        super(context);
        this.f34251n = kvVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        kv kvVar = this.f34251n;
        jv[] jvVarArr = kvVar.f34806f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = kvVar.e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i11 = scrollSlidingTextTabStrip.f22153n;
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
        this.f34249c = false;
        this.f34248b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.n2) kvVar).actionBar;
        kVar.setEnabled(false);
        kvVar.e.setEnabled(false);
        jv jvVar = jvVarArr[1];
        jvVar.f34517f = i12;
        jvVar.setVisibility(0);
        kvVar.f34808r = z10;
        kvVar.m0(true);
        if (z10) {
            jvVarArr[1].setTranslationX(jvVarArr[0].getMeasuredWidth());
            return true;
        }
        jvVarArr[1].setTranslationX(-jvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        kv kvVar = this.f34251n;
        c5Var = ((org.telegram.ui.ActionBar.n2) kvVar).parentLayout;
        if (c5Var != null) {
            c5Var2 = ((org.telegram.ui.ActionBar.n2) kvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.n2) kvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.n2) kvVar).actionBar;
            ((ActionBarLayout) c5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        kv kvVar = this.f34251n;
        Paint paint = kvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
        kVar = ((org.telegram.ui.ActionBar.n2) kvVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.n2) kvVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f34251n.e.H && !onTouchEvent(motionEvent)) {
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
        kv kvVar = this.f34251n;
        jv[] jvVarArr = kvVar.f34806f;
        kVar = ((org.telegram.ui.ActionBar.n2) kvVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) kvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < jvVarArr.length; i12++) {
            jv jvVar = jvVarArr[i12];
            if (jvVar != null) {
                org.telegram.ui.Components.ml0 ml0Var = jvVar.d;
                if (ml0Var != null) {
                    ml0Var.setPadding(0, measuredHeight, 0, 0);
                }
                ai.w0 w0Var = jvVarArr[i12].e;
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
                kVar3 = ((org.telegram.ui.ActionBar.n2) kvVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.c5 c5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        float measuredWidth;
        jv jvVar;
        jv jvVar2;
        int measuredWidth2;
        jv jvVar3;
        jv jvVar4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        kv kvVar = this.f34251n;
        jv[] jvVarArr = kvVar.f34806f;
        c5Var = ((org.telegram.ui.ActionBar.n2) kvVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) c5Var).j() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f34250f == null) {
                this.f34250f = VelocityTracker.obtain();
            }
            this.f34250f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f34248b && !this.f34249c) {
            this.f34247a = motionEvent.getPointerId(0);
            this.f34249c = true;
            this.d = (int) motionEvent.getX();
            this.e = (int) motionEvent.getY();
            this.f34250f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f34247a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.f34248b && (((z12 = kvVar.f34808r) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f34249c = true;
                    this.f34248b = false;
                    jvVarArr[0].setTranslationX(0.0f);
                    jv jvVar5 = jvVarArr[1];
                    if (kvVar.f34808r) {
                        i10 = jvVarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -jvVarArr[0].getMeasuredWidth();
                    }
                    jvVar5.setTranslationX(i10);
                    kvVar.e.j(0.0f, jvVarArr[1].f34517f);
                }
            }
            if (this.f34249c && !this.f34248b) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f34248b) {
                jvVarArr[0].setTranslationX(x10);
                if (kvVar.f34808r) {
                    jvVarArr[1].setTranslationX(jvVarArr[0].getMeasuredWidth() + x10);
                } else {
                    jvVarArr[1].setTranslationX(x10 - jvVarArr[0].getMeasuredWidth());
                }
                kvVar.e.j(Math.abs(x10) / jvVarArr[0].getMeasuredWidth(), jvVarArr[1].f34517f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f34247a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f34250f.computeCurrentVelocity(1000, kvVar.v);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.f34250f.getXVelocity();
                f10 = this.f34250f.getYVelocity();
                if (!this.f34248b && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
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
            if (this.f34248b) {
                float x11 = jvVarArr[0].getX();
                kvVar.h = new AnimatorSet();
                if (Math.abs(x11) < jvVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kvVar.f34809s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (kvVar.f34808r) {
                        kvVar.h.playTogether(ObjectAnimator.ofFloat(jvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(jvVarArr[1], property, jvVar4.getMeasuredWidth()));
                    } else {
                        kvVar.h.playTogether(ObjectAnimator.ofFloat(jvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(jvVarArr[1], property, -jvVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = jvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (kvVar.f34808r) {
                        kvVar.h.playTogether(ObjectAnimator.ofFloat(jvVarArr[0], property, -jvVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(jvVarArr[1], property, 0.0f));
                    } else {
                        kvVar.h.playTogether(ObjectAnimator.ofFloat(jvVarArr[0], property, jvVar.getMeasuredWidth()), ObjectAnimator.ofFloat(jvVarArr[1], property, 0.0f));
                    }
                }
                kvVar.h.setInterpolator(kv.f34802x);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f7);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                kvVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                kvVar.h.addListener(new org.telegram.ui.Components.u81(this, 15));
                kvVar.h.start();
                kvVar.f34807n = true;
                this.f34248b = false;
            } else {
                this.f34249c = false;
                kVar = ((org.telegram.ui.ActionBar.n2) kvVar).actionBar;
                kVar.setEnabled(true);
                kvVar.e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f34250f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f34250f = null;
            }
        }
        return this.f34248b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
