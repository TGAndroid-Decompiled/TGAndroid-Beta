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
public final class nv extends FrameLayout {
    public int f35344a;
    public boolean f35345b;
    public boolean f35346c;
    public int d;
    public int e;
    public VelocityTracker f35347f;
    public boolean h;
    public final pv f35348n;

    public nv(pv pvVar, Context context) {
        super(context);
        this.f35348n = pvVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nv.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.l lVar;
        pv pvVar = this.f35348n;
        ov[] ovVarArr = pvVar.f35910f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = pvVar.e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i11 = scrollSlidingTextTabStrip.f21267n;
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
        this.f35346c = false;
        this.f35345b = true;
        this.d = (int) motionEvent.getX();
        lVar = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
        lVar.setEnabled(false);
        pvVar.e.setEnabled(false);
        ov ovVar = ovVarArr[1];
        ovVar.f35619f = i12;
        ovVar.setVisibility(0);
        pvVar.f35912r = z10;
        pvVar.m0(true);
        if (z10) {
            ovVarArr[1].setTranslationX(ovVarArr[0].getMeasuredWidth());
            return true;
        }
        ovVarArr[1].setTranslationX(-ovVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        super.dispatchDraw(canvas);
        pv pvVar = this.f35348n;
        f5Var = ((org.telegram.ui.ActionBar.p2) pvVar).parentLayout;
        if (f5Var != null) {
            f5Var2 = ((org.telegram.ui.ActionBar.p2) pvVar).parentLayout;
            lVar = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
            int measuredHeight = lVar.getMeasuredHeight();
            lVar2 = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
            ((ActionBarLayout) f5Var2).q(canvas, measuredHeight + ((int) lVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        pv pvVar = this.f35348n;
        Paint paint = pvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
        lVar = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
        lVar2 = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
        canvas.drawRect(0.0f, lVar2.getTranslationY() + lVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f35348n.e.H && !onTouchEvent(motionEvent)) {
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
        pv pvVar = this.f35348n;
        ov[] ovVarArr = pvVar.f35910f;
        lVar = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        lVar2 = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
        int measuredHeight = lVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < ovVarArr.length; i12++) {
            ov ovVar = ovVarArr[i12];
            if (ovVar != null) {
                org.telegram.ui.Components.vl0 vl0Var = ovVar.d;
                if (vl0Var != null) {
                    vl0Var.setPadding(0, measuredHeight, 0, 0);
                }
                bi.y1 y1Var = ovVarArr[i12].e;
                if (y1Var != null) {
                    y1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar3 = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
                if (childAt != lVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f5 f5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.l lVar;
        boolean z10;
        float measuredWidth;
        ov ovVar;
        ov ovVar2;
        int measuredWidth2;
        ov ovVar3;
        ov ovVar4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        pv pvVar = this.f35348n;
        ov[] ovVarArr = pvVar.f35910f;
        f5Var = ((org.telegram.ui.ActionBar.p2) pvVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) f5Var).j() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f35347f == null) {
                this.f35347f = VelocityTracker.obtain();
            }
            this.f35347f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f35345b && !this.f35346c) {
            this.f35344a = motionEvent.getPointerId(0);
            this.f35346c = true;
            this.d = (int) motionEvent.getX();
            this.e = (int) motionEvent.getY();
            this.f35347f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f35344a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.f35345b && (((z12 = pvVar.f35912r) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f35346c = true;
                    this.f35345b = false;
                    ovVarArr[0].setTranslationX(0.0f);
                    ov ovVar5 = ovVarArr[1];
                    if (pvVar.f35912r) {
                        i10 = ovVarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -ovVarArr[0].getMeasuredWidth();
                    }
                    ovVar5.setTranslationX(i10);
                    pvVar.e.j(0.0f, ovVarArr[1].f35619f);
                }
            }
            if (this.f35346c && !this.f35345b) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f35345b) {
                ovVarArr[0].setTranslationX(x10);
                if (pvVar.f35912r) {
                    ovVarArr[1].setTranslationX(ovVarArr[0].getMeasuredWidth() + x10);
                } else {
                    ovVarArr[1].setTranslationX(x10 - ovVarArr[0].getMeasuredWidth());
                }
                pvVar.e.j(Math.abs(x10) / ovVarArr[0].getMeasuredWidth(), ovVarArr[1].f35619f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f35344a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f35347f.computeCurrentVelocity(1000, pvVar.v);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.f35347f.getXVelocity();
                f10 = this.f35347f.getYVelocity();
                if (!this.f35345b && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
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
            if (this.f35345b) {
                float x11 = ovVarArr[0].getX();
                pvVar.h = new AnimatorSet();
                if (Math.abs(x11) < ovVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pvVar.f35913s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (pvVar.f35912r) {
                        pvVar.h.playTogether(ObjectAnimator.ofFloat(ovVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(ovVarArr[1], property, ovVar4.getMeasuredWidth()));
                    } else {
                        pvVar.h.playTogether(ObjectAnimator.ofFloat(ovVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(ovVarArr[1], property, -ovVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = ovVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (pvVar.f35912r) {
                        pvVar.h.playTogether(ObjectAnimator.ofFloat(ovVarArr[0], property, -ovVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(ovVarArr[1], property, 0.0f));
                    } else {
                        pvVar.h.playTogether(ObjectAnimator.ofFloat(ovVarArr[0], property, ovVar.getMeasuredWidth()), ObjectAnimator.ofFloat(ovVarArr[1], property, 0.0f));
                    }
                }
                pvVar.h.setInterpolator(pv.f35906x);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f7);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                pvVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                pvVar.h.addListener(new org.telegram.ui.Components.voip.v2(this, 5));
                pvVar.h.start();
                pvVar.f35911n = true;
                this.f35345b = false;
            } else {
                this.f35346c = false;
                lVar = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
                lVar.setEnabled(true);
                pvVar.e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f35347f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f35347f = null;
            }
        }
        return this.f35345b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
