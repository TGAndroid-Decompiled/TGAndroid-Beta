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
    public int f35167a;
    public boolean f35168b;
    public boolean f35169c;
    public int d;
    public int e;
    public VelocityTracker f35170f;
    public boolean h;
    public final kv f35171n;

    public iv(kv kvVar, Context context) {
        super(context);
        this.f35171n = kvVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z4) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        kv kvVar = this.f35171n;
        jv[] jvVarArr = kvVar.f35821f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = kvVar.e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.L;
        int i11 = scrollSlidingTextTabStrip.f23168n;
        if (z4) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i12 = sparseIntArray.get(i11 + i10, -1);
        if (i12 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f35169c = false;
        this.f35168b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
        kVar.setEnabled(false);
        kvVar.e.setEnabled(false);
        jv jvVar = jvVarArr[1];
        jvVar.f35514f = i12;
        jvVar.setVisibility(0);
        kvVar.f35823r = z4;
        kvVar.m0(true);
        if (z4) {
            jvVarArr[1].setTranslationX(jvVarArr[0].getMeasuredWidth());
            return true;
        }
        jvVarArr[1].setTranslationX(-jvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        kv kvVar = this.f35171n;
        e5Var = ((org.telegram.ui.ActionBar.p2) kvVar).parentLayout;
        if (e5Var != null) {
            e5Var2 = ((org.telegram.ui.ActionBar.p2) kvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
            ((ActionBarLayout) e5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        kv kvVar = this.f35171n;
        Paint paint = kvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
        kVar = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f35171n.e.E && !onTouchEvent(motionEvent)) {
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
        kv kvVar = this.f35171n;
        jv[] jvVarArr = kvVar.f35821f;
        kVar = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < jvVarArr.length; i12++) {
            jv jvVar = jvVarArr[i12];
            if (jvVar != null) {
                org.telegram.ui.Components.sl0 sl0Var = jvVar.d;
                if (sl0Var != null) {
                    sl0Var.setPadding(0, measuredHeight, 0, 0);
                }
                lh.e1 e1Var = jvVarArr[i12].e;
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
                kVar3 = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.e5 e5Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        boolean z4;
        float measuredWidth;
        jv jvVar;
        jv jvVar2;
        int measuredWidth2;
        jv jvVar3;
        jv jvVar4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        kv kvVar = this.f35171n;
        jv[] jvVarArr = kvVar.f35821f;
        e5Var = ((org.telegram.ui.ActionBar.p2) kvVar).parentLayout;
        boolean z13 = false;
        if (((ActionBarLayout) e5Var).j() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f35170f == null) {
                this.f35170f = VelocityTracker.obtain();
            }
            this.f35170f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f35168b && !this.f35169c) {
            this.f35167a = motionEvent.getPointerId(0);
            this.f35169c = true;
            this.d = (int) motionEvent.getX();
            this.e = (int) motionEvent.getY();
            this.f35170f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f35167a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.f35168b && (((z11 = kvVar.f35823r) && x10 > 0) || (!z11 && x10 < 0))) {
                if (x10 < 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!b(motionEvent, z12)) {
                    this.f35169c = true;
                    this.f35168b = false;
                    jvVarArr[0].setTranslationX(0.0f);
                    jv jvVar5 = jvVarArr[1];
                    if (kvVar.f35823r) {
                        i10 = jvVarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -jvVarArr[0].getMeasuredWidth();
                    }
                    jvVar5.setTranslationX(i10);
                    kvVar.e.j(0.0f, jvVarArr[1].f35514f);
                }
            }
            if (this.f35169c && !this.f35168b) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z13 = true;
                    }
                    b(motionEvent, z13);
                }
            } else if (this.f35168b) {
                jvVarArr[0].setTranslationX(x10);
                if (kvVar.f35823r) {
                    jvVarArr[1].setTranslationX(jvVarArr[0].getMeasuredWidth() + x10);
                } else {
                    jvVarArr[1].setTranslationX(x10 - jvVarArr[0].getMeasuredWidth());
                }
                kvVar.e.j(Math.abs(x10) / jvVarArr[0].getMeasuredWidth(), jvVarArr[1].f35514f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f35167a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f35170f.computeCurrentVelocity(1000, kvVar.v);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f35170f.getXVelocity();
                f11 = this.f35170f.getYVelocity();
                if (!this.f35168b && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    if (f10 < 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b(motionEvent, z10);
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (this.f35168b) {
                float x11 = jvVarArr[0].getX();
                kvVar.h = new AnimatorSet();
                if (Math.abs(x11) < jvVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                kvVar.f35824s = z4;
                Property property = View.TRANSLATION_X;
                if (z4) {
                    measuredWidth = Math.abs(x11);
                    if (kvVar.f35823r) {
                        kvVar.h.playTogether(ObjectAnimator.ofFloat(jvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(jvVarArr[1], property, jvVar4.getMeasuredWidth()));
                    } else {
                        kvVar.h.playTogether(ObjectAnimator.ofFloat(jvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(jvVarArr[1], property, -jvVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = jvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (kvVar.f35823r) {
                        kvVar.h.playTogether(ObjectAnimator.ofFloat(jvVarArr[0], property, -jvVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(jvVarArr[1], property, 0.0f));
                    } else {
                        kvVar.h.playTogether(ObjectAnimator.ofFloat(jvVarArr[0], property, jvVar.getMeasuredWidth()), ObjectAnimator.ofFloat(jvVarArr[1], property, 0.0f));
                    }
                }
                kvVar.h.setInterpolator(kv.f35817x);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs2 = Math.abs(f10);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                kvVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                kvVar.h.addListener(new org.telegram.ui.Components.f91(this, 14));
                kvVar.h.start();
                kvVar.f35822n = true;
                this.f35168b = false;
            } else {
                this.f35169c = false;
                kVar = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
                kVar.setEnabled(true);
                kvVar.e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f35170f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f35170f = null;
            }
        }
        return this.f35168b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
