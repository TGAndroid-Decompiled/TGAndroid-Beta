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
public final class jv extends FrameLayout {
    public int f39127a;
    public boolean f39128b;
    public boolean f39129c;
    public int d;
    public int f39130e;
    public VelocityTracker f39131f;
    public boolean h;
    public final lv f39132n;

    public jv(lv lvVar, Context context) {
        super(context);
        this.f39132n = lvVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jv.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        lv lvVar = this.f39132n;
        kv[] kvVarArr = lvVar.f39737f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = lvVar.f39736e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i11 = scrollSlidingTextTabStrip.f24313n;
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
        this.f39129c = false;
        this.f39128b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.m2) lvVar).actionBar;
        kVar.setEnabled(false);
        lvVar.f39736e.setEnabled(false);
        kv kvVar = kvVarArr[1];
        kvVar.f39426f = i12;
        kvVar.setVisibility(0);
        lvVar.f39739r = z10;
        lvVar.m0(true);
        if (z10) {
            kvVarArr[1].setTranslationX(kvVarArr[0].getMeasuredWidth());
            return true;
        }
        kvVarArr[1].setTranslationX(-kvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        lv lvVar = this.f39132n;
        b5Var = ((org.telegram.ui.ActionBar.m2) lvVar).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) lvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.m2) lvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.m2) lvVar).actionBar;
            ((ActionBarLayout) b5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        lv lvVar = this.f39132n;
        Paint paint = lvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false));
        kVar = ((org.telegram.ui.ActionBar.m2) lvVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.m2) lvVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f39132n.f39736e.H && !onTouchEvent(motionEvent)) {
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
        lv lvVar = this.f39132n;
        kv[] kvVarArr = lvVar.f39737f;
        kVar = ((org.telegram.ui.ActionBar.m2) lvVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.m2) lvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < kvVarArr.length; i12++) {
            kv kvVar = kvVarArr[i12];
            if (kvVar != null) {
                org.telegram.ui.Components.sm0 sm0Var = kvVar.d;
                if (sm0Var != null) {
                    sm0Var.setPadding(0, measuredHeight, 0, 0);
                }
                ai.w0 w0Var = kvVarArr[i12].f39425e;
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
                kVar3 = ((org.telegram.ui.ActionBar.m2) lvVar).actionBar;
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
        kv kvVar;
        kv kvVar2;
        int measuredWidth2;
        kv kvVar3;
        kv kvVar4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        lv lvVar = this.f39132n;
        kv[] kvVarArr = lvVar.f39737f;
        b5Var = ((org.telegram.ui.ActionBar.m2) lvVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) b5Var).j() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f39131f == null) {
                this.f39131f = VelocityTracker.obtain();
            }
            this.f39131f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f39128b && !this.f39129c) {
            this.f39127a = motionEvent.getPointerId(0);
            this.f39129c = true;
            this.d = (int) motionEvent.getX();
            this.f39130e = (int) motionEvent.getY();
            this.f39131f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f39127a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f39130e);
            if (this.f39128b && (((z12 = lvVar.f39739r) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f39129c = true;
                    this.f39128b = false;
                    kvVarArr[0].setTranslationX(0.0f);
                    kv kvVar5 = kvVarArr[1];
                    if (lvVar.f39739r) {
                        i10 = kvVarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -kvVarArr[0].getMeasuredWidth();
                    }
                    kvVar5.setTranslationX(i10);
                    lvVar.f39736e.j(0.0f, kvVarArr[1].f39426f);
                }
            }
            if (this.f39129c && !this.f39128b) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f39128b) {
                kvVarArr[0].setTranslationX(x10);
                if (lvVar.f39739r) {
                    kvVarArr[1].setTranslationX(kvVarArr[0].getMeasuredWidth() + x10);
                } else {
                    kvVarArr[1].setTranslationX(x10 - kvVarArr[0].getMeasuredWidth());
                }
                lvVar.f39736e.j(Math.abs(x10) / kvVarArr[0].getMeasuredWidth(), kvVarArr[1].f39426f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f39127a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f39131f.computeCurrentVelocity(1000, lvVar.v);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.f39131f.getXVelocity();
                f10 = this.f39131f.getYVelocity();
                if (!this.f39128b && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
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
            if (this.f39128b) {
                float x11 = kvVarArr[0].getX();
                lvVar.h = new AnimatorSet();
                if (Math.abs(x11) < kvVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lvVar.f39740s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (lvVar.f39739r) {
                        lvVar.h.playTogether(ObjectAnimator.ofFloat(kvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(kvVarArr[1], property, kvVar4.getMeasuredWidth()));
                    } else {
                        lvVar.h.playTogether(ObjectAnimator.ofFloat(kvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(kvVarArr[1], property, -kvVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = kvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (lvVar.f39739r) {
                        lvVar.h.playTogether(ObjectAnimator.ofFloat(kvVarArr[0], property, -kvVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(kvVarArr[1], property, 0.0f));
                    } else {
                        lvVar.h.playTogether(ObjectAnimator.ofFloat(kvVarArr[0], property, kvVar.getMeasuredWidth()), ObjectAnimator.ofFloat(kvVarArr[1], property, 0.0f));
                    }
                }
                lvVar.h.setInterpolator(lv.f39732x);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f7);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                lvVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                lvVar.h.addListener(new org.telegram.ui.Components.k91(this, 16));
                lvVar.h.start();
                lvVar.f39738n = true;
                this.f39128b = false;
            } else {
                this.f39129c = false;
                kVar = ((org.telegram.ui.ActionBar.m2) lvVar).actionBar;
                kVar.setEnabled(true);
                lvVar.f39736e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f39131f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f39131f = null;
            }
        }
        return this.f39128b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
