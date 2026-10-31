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
public final class bv extends FrameLayout {
    public int f36304a;
    public boolean f36305b;
    public boolean f36306c;
    public int d;
    public int e;
    public VelocityTracker f36307f;
    public boolean h;
    public final dv f36308n;

    public bv(dv dvVar, Context context) {
        super(context);
        this.f36308n = dvVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bv.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.l lVar;
        dv dvVar = this.f36308n;
        cv[] cvVarArr = dvVar.f36841f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = dvVar.e;
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
        this.f36306c = false;
        this.f36305b = true;
        this.d = (int) motionEvent.getX();
        lVar = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
        lVar.setEnabled(false);
        dvVar.e.setEnabled(false);
        cv cvVar = cvVarArr[1];
        cvVar.f36556f = i12;
        cvVar.setVisibility(0);
        dvVar.f36843r = z10;
        dvVar.q0(true);
        if (z10) {
            cvVarArr[1].setTranslationX(cvVarArr[0].getMeasuredWidth());
            return true;
        }
        cvVarArr[1].setTranslationX(-cvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        super.dispatchDraw(canvas);
        dv dvVar = this.f36308n;
        z4Var = ((org.telegram.ui.ActionBar.k2) dvVar).parentLayout;
        if (z4Var != null) {
            z4Var2 = ((org.telegram.ui.ActionBar.k2) dvVar).parentLayout;
            lVar = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
            int measuredHeight = lVar.getMeasuredHeight();
            lVar2 = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
            ((ActionBarLayout) z4Var2).q(canvas, measuredHeight + ((int) lVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        dv dvVar = this.f36308n;
        Paint paint = dvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false));
        lVar = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
        lVar2 = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
        canvas.drawRect(0.0f, lVar2.getTranslationY() + lVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f36308n.e.H && !onTouchEvent(motionEvent)) {
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
        dv dvVar = this.f36308n;
        cv[] cvVarArr = dvVar.f36841f;
        lVar = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        lVar2 = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
        int measuredHeight = lVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < cvVarArr.length; i12++) {
            cv cvVar = cvVarArr[i12];
            if (cvVar != null) {
                org.telegram.ui.Components.tk0 tk0Var = cvVar.d;
                if (tk0Var != null) {
                    tk0Var.setPadding(0, measuredHeight, 0, 0);
                }
                ag.b1 b1Var = cvVarArr[i12].e;
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
                lVar3 = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
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
        cv cvVar;
        cv cvVar2;
        int measuredWidth2;
        cv cvVar3;
        cv cvVar4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        dv dvVar = this.f36308n;
        cv[] cvVarArr = dvVar.f36841f;
        z4Var = ((org.telegram.ui.ActionBar.k2) dvVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) z4Var).i() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f36307f == null) {
                this.f36307f = VelocityTracker.obtain();
            }
            this.f36307f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f36305b && !this.f36306c) {
            this.f36304a = motionEvent.getPointerId(0);
            this.f36306c = true;
            this.d = (int) motionEvent.getX();
            this.e = (int) motionEvent.getY();
            this.f36307f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f36304a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.f36305b && (((z12 = dvVar.f36843r) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f36306c = true;
                    this.f36305b = false;
                    cvVarArr[0].setTranslationX(0.0f);
                    cv cvVar5 = cvVarArr[1];
                    if (dvVar.f36843r) {
                        i10 = cvVarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -cvVarArr[0].getMeasuredWidth();
                    }
                    cvVar5.setTranslationX(i10);
                    dvVar.e.i(0.0f, cvVarArr[1].f36556f);
                }
            }
            if (this.f36306c && !this.f36305b) {
                if (Math.abs(x10) >= org.telegram.messenger.i0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f36305b) {
                cvVarArr[0].setTranslationX(x10);
                if (dvVar.f36843r) {
                    cvVarArr[1].setTranslationX(cvVarArr[0].getMeasuredWidth() + x10);
                } else {
                    cvVarArr[1].setTranslationX(x10 - cvVarArr[0].getMeasuredWidth());
                }
                dvVar.e.i(Math.abs(x10) / cvVarArr[0].getMeasuredWidth(), cvVarArr[1].f36556f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f36304a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f36307f.computeCurrentVelocity(1000, dvVar.f36845w);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.f36307f.getXVelocity();
                f10 = this.f36307f.getYVelocity();
                if (!this.f36305b && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
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
            if (this.f36305b) {
                float x11 = cvVarArr[0].getX();
                dvVar.h = new AnimatorSet();
                if (Math.abs(x11) < cvVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dvVar.f36844s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (dvVar.f36843r) {
                        dvVar.h.playTogether(ObjectAnimator.ofFloat(cvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(cvVarArr[1], property, cvVar4.getMeasuredWidth()));
                    } else {
                        dvVar.h.playTogether(ObjectAnimator.ofFloat(cvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(cvVarArr[1], property, -cvVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = cvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (dvVar.f36843r) {
                        dvVar.h.playTogether(ObjectAnimator.ofFloat(cvVarArr[0], property, -cvVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(cvVarArr[1], property, 0.0f));
                    } else {
                        dvVar.h.playTogether(ObjectAnimator.ofFloat(cvVarArr[0], property, cvVar.getMeasuredWidth()), ObjectAnimator.ofFloat(cvVarArr[1], property, 0.0f));
                    }
                }
                dvVar.h.setInterpolator(dv.f36837y);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.i0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f7);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                dvVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                dvVar.h.addListener(new org.telegram.ui.Components.voip.h2(this, 4));
                dvVar.h.start();
                dvVar.f36842n = true;
                this.f36305b = false;
            } else {
                this.f36306c = false;
                lVar = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
                lVar.setEnabled(true);
                dvVar.e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f36307f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f36307f = null;
            }
        }
        return this.f36305b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
