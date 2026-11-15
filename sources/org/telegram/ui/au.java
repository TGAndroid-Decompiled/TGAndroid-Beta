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
public final class au extends FrameLayout {
    public int f45502a;
    public boolean f45503b;
    public boolean f45504c;
    public int d;
    public int f45505e;
    public VelocityTracker f45506f;
    public boolean h;
    public final cu f45507n;

    public au(cu cuVar, Context context) {
        super(context);
        this.f45507n = cuVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.au.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i7;
        org.telegram.ui.ActionBar.k kVar;
        cu cuVar = this.f45507n;
        bu[] buVarArr = cuVar.f46221f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = cuVar.f46220e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
        int i10 = scrollSlidingTextTabStrip.f32717n;
        if (z10) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i11 = sparseIntArray.get(i10 + i7, -1);
        if (i11 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f45504c = false;
        this.f45503b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.e2) cuVar).actionBar;
        kVar.setEnabled(false);
        cuVar.f46220e.setEnabled(false);
        bu buVar = buVarArr[1];
        buVar.f45826f = i11;
        buVar.setVisibility(0);
        cuVar.f46223r = z10;
        cuVar.r0(true);
        if (z10) {
            buVarArr[1].setTranslationX(buVarArr[0].getMeasuredWidth());
            return true;
        }
        buVarArr[1].setTranslationX(-buVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        cu cuVar = this.f45507n;
        o4Var = ((org.telegram.ui.ActionBar.e2) cuVar).parentLayout;
        if (o4Var != null) {
            o4Var2 = ((org.telegram.ui.ActionBar.e2) cuVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.e2) cuVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.e2) cuVar).actionBar;
            ((ActionBarLayout) o4Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cu cuVar = this.f45507n;
        Paint paint = cuVar.d;
        paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
        kVar = ((org.telegram.ui.ActionBar.e2) cuVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.e2) cuVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f45507n.f46220e.I && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        cu cuVar = this.f45507n;
        bu[] buVarArr = cuVar.f46221f;
        kVar = ((org.telegram.ui.ActionBar.e2) cuVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.e2) cuVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i11 = 0; i11 < buVarArr.length; i11++) {
            bu buVar = buVarArr[i11];
            if (buVar != null) {
                org.telegram.ui.Components.uj0 uj0Var = buVar.d;
                if (uj0Var != null) {
                    uj0Var.setPadding(0, measuredHeight, 0, 0);
                }
                di.c1 c1Var = buVarArr[i11].f45825e;
                if (c1Var != null) {
                    c1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.e2) cuVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i7, 0, i10, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o4 o4Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        float measuredWidth;
        bu buVar;
        bu buVar2;
        int measuredWidth2;
        bu buVar3;
        bu buVar4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        cu cuVar = this.f45507n;
        bu[] buVarArr = cuVar.f46221f;
        o4Var = ((org.telegram.ui.ActionBar.e2) cuVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) o4Var).i() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f45506f == null) {
                this.f45506f = VelocityTracker.obtain();
            }
            this.f45506f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f45503b && !this.f45504c) {
            this.f45502a = motionEvent.getPointerId(0);
            this.f45504c = true;
            this.d = (int) motionEvent.getX();
            this.f45505e = (int) motionEvent.getY();
            this.f45506f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f45502a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f45505e);
            if (this.f45503b && (((z12 = cuVar.f46223r) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f45504c = true;
                    this.f45503b = false;
                    buVarArr[0].setTranslationX(0.0f);
                    bu buVar5 = buVarArr[1];
                    if (cuVar.f46223r) {
                        i7 = buVarArr[0].getMeasuredWidth();
                    } else {
                        i7 = -buVarArr[0].getMeasuredWidth();
                    }
                    buVar5.setTranslationX(i7);
                    cuVar.f46220e.i(0.0f, buVarArr[1].f45826f);
                }
            }
            if (this.f45504c && !this.f45503b) {
                if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f45503b) {
                buVarArr[0].setTranslationX(x10);
                if (cuVar.f46223r) {
                    buVarArr[1].setTranslationX(buVarArr[0].getMeasuredWidth() + x10);
                } else {
                    buVarArr[1].setTranslationX(x10 - buVarArr[0].getMeasuredWidth());
                }
                cuVar.f46220e.i(Math.abs(x10) / buVarArr[0].getMeasuredWidth(), buVarArr[1].f45826f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f45502a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f45506f.computeCurrentVelocity(1000, cuVar.f46225w);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f45506f.getXVelocity();
                f11 = this.f45506f.getYVelocity();
                if (!this.f45503b && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    if (f10 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b(motionEvent, z11);
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (this.f45503b) {
                float x11 = buVarArr[0].getX();
                cuVar.h = new AnimatorSet();
                if (Math.abs(x11) < buVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cuVar.f46224s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (cuVar.f46223r) {
                        cuVar.h.playTogether(ObjectAnimator.ofFloat(buVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(buVarArr[1], property, buVar4.getMeasuredWidth()));
                    } else {
                        cuVar.h.playTogether(ObjectAnimator.ofFloat(buVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(buVarArr[1], property, -buVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = buVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (cuVar.f46223r) {
                        cuVar.h.playTogether(ObjectAnimator.ofFloat(buVarArr[0], property, -buVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(buVarArr[1], property, 0.0f));
                    } else {
                        cuVar.h.playTogether(ObjectAnimator.ofFloat(buVarArr[0], property, buVar.getMeasuredWidth()), ObjectAnimator.ofFloat(buVarArr[1], property, 0.0f));
                    }
                }
                cuVar.h.setInterpolator(cu.f46216y);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs2 = Math.abs(f10);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                cuVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                cuVar.h.addListener(new org.telegram.ui.Cells.w9(this, 24));
                cuVar.h.start();
                cuVar.f46222n = true;
                this.f45503b = false;
            } else {
                this.f45504c = false;
                kVar = ((org.telegram.ui.ActionBar.e2) cuVar).actionBar;
                kVar.setEnabled(true);
                cuVar.f46220e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f45506f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f45506f = null;
            }
        }
        return this.f45503b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
