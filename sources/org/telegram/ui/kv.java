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
public final class kv extends FrameLayout {
    public int f39355a;
    public boolean f39356b;
    public boolean f39357c;
    public int d;
    public int f39358e;
    public VelocityTracker f39359f;
    public boolean h;
    public final mv f39360n;

    public kv(mv mvVar, Context context) {
        super(context);
        this.f39360n = mvVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kv.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        mv mvVar = this.f39360n;
        lv[] lvVarArr = mvVar.f39995f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = mvVar.f39994e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i11 = scrollSlidingTextTabStrip.f24321n;
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
        this.f39357c = false;
        this.f39356b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
        kVar.setEnabled(false);
        mvVar.f39994e.setEnabled(false);
        lv lvVar = lvVarArr[1];
        lvVar.f39685f = i12;
        lvVar.setVisibility(0);
        mvVar.f39997r = z10;
        mvVar.m0(true);
        if (z10) {
            lvVarArr[1].setTranslationX(lvVarArr[0].getMeasuredWidth());
            return true;
        }
        lvVarArr[1].setTranslationX(-lvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        mv mvVar = this.f39360n;
        d5Var = ((org.telegram.ui.ActionBar.n2) mvVar).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) mvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
            ((ActionBarLayout) d5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        mv mvVar = this.f39360n;
        Paint paint = mvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
        kVar = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f39360n.f39994e.H && !onTouchEvent(motionEvent)) {
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
        mv mvVar = this.f39360n;
        lv[] lvVarArr = mvVar.f39995f;
        kVar = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < lvVarArr.length; i12++) {
            lv lvVar = lvVarArr[i12];
            if (lvVar != null) {
                org.telegram.ui.Components.qm0 qm0Var = lvVar.d;
                if (qm0Var != null) {
                    qm0Var.setPadding(0, measuredHeight, 0, 0);
                }
                ai.w0 w0Var = lvVarArr[i12].f39684e;
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
                kVar3 = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
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
        lv lvVar;
        lv lvVar2;
        int measuredWidth2;
        lv lvVar3;
        lv lvVar4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        mv mvVar = this.f39360n;
        lv[] lvVarArr = mvVar.f39995f;
        d5Var = ((org.telegram.ui.ActionBar.n2) mvVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) d5Var).j() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f39359f == null) {
                this.f39359f = VelocityTracker.obtain();
            }
            this.f39359f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f39356b && !this.f39357c) {
            this.f39355a = motionEvent.getPointerId(0);
            this.f39357c = true;
            this.d = (int) motionEvent.getX();
            this.f39358e = (int) motionEvent.getY();
            this.f39359f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f39355a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f39358e);
            if (this.f39356b && (((z12 = mvVar.f39997r) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f39357c = true;
                    this.f39356b = false;
                    lvVarArr[0].setTranslationX(0.0f);
                    lv lvVar5 = lvVarArr[1];
                    if (mvVar.f39997r) {
                        i10 = lvVarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -lvVarArr[0].getMeasuredWidth();
                    }
                    lvVar5.setTranslationX(i10);
                    mvVar.f39994e.j(0.0f, lvVarArr[1].f39685f);
                }
            }
            if (this.f39357c && !this.f39356b) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f39356b) {
                lvVarArr[0].setTranslationX(x10);
                if (mvVar.f39997r) {
                    lvVarArr[1].setTranslationX(lvVarArr[0].getMeasuredWidth() + x10);
                } else {
                    lvVarArr[1].setTranslationX(x10 - lvVarArr[0].getMeasuredWidth());
                }
                mvVar.f39994e.j(Math.abs(x10) / lvVarArr[0].getMeasuredWidth(), lvVarArr[1].f39685f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f39355a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f39359f.computeCurrentVelocity(1000, mvVar.v);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.f39359f.getXVelocity();
                f10 = this.f39359f.getYVelocity();
                if (!this.f39356b && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
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
            if (this.f39356b) {
                float x11 = lvVarArr[0].getX();
                mvVar.h = new AnimatorSet();
                if (Math.abs(x11) < lvVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mvVar.f39998s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (mvVar.f39997r) {
                        mvVar.h.playTogether(ObjectAnimator.ofFloat(lvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(lvVarArr[1], property, lvVar4.getMeasuredWidth()));
                    } else {
                        mvVar.h.playTogether(ObjectAnimator.ofFloat(lvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(lvVarArr[1], property, -lvVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = lvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (mvVar.f39997r) {
                        mvVar.h.playTogether(ObjectAnimator.ofFloat(lvVarArr[0], property, -lvVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(lvVarArr[1], property, 0.0f));
                    } else {
                        mvVar.h.playTogether(ObjectAnimator.ofFloat(lvVarArr[0], property, lvVar.getMeasuredWidth()), ObjectAnimator.ofFloat(lvVarArr[1], property, 0.0f));
                    }
                }
                mvVar.h.setInterpolator(mv.f39990x);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f7);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                mvVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                mvVar.h.addListener(new org.telegram.ui.Components.i91(this, 16));
                mvVar.h.start();
                mvVar.f39996n = true;
                this.f39356b = false;
            } else {
                this.f39357c = false;
                kVar = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
                kVar.setEnabled(true);
                mvVar.f39994e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f39359f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f39359f = null;
            }
        }
        return this.f39356b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
