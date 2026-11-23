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
public final class bu extends FrameLayout {
    public int f46503a;
    public boolean f46504b;
    public boolean f46505c;
    public int d;
    public int f46506e;
    public VelocityTracker f46507f;
    public boolean h;
    public final du f46508n;

    public bu(du duVar, Context context) {
        super(context);
        this.f46508n = duVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bu.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i7;
        org.telegram.ui.ActionBar.k kVar;
        du duVar = this.f46508n;
        cu[] cuVarArr = duVar.f47231f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = duVar.f47230e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
        int i10 = scrollSlidingTextTabStrip.f33214n;
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
        this.f46505c = false;
        this.f46504b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
        kVar.setEnabled(false);
        duVar.f47230e.setEnabled(false);
        cu cuVar = cuVarArr[1];
        cuVar.f46877f = i11;
        cuVar.setVisibility(0);
        duVar.f47233r = z10;
        duVar.r0(true);
        if (z10) {
            cuVarArr[1].setTranslationX(cuVarArr[0].getMeasuredWidth());
            return true;
        }
        cuVarArr[1].setTranslationX(-cuVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        du duVar = this.f46508n;
        r4Var = ((org.telegram.ui.ActionBar.g2) duVar).parentLayout;
        if (r4Var != null) {
            r4Var2 = ((org.telegram.ui.ActionBar.g2) duVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
            ((ActionBarLayout) r4Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        du duVar = this.f46508n;
        Paint paint = duVar.d;
        paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false));
        kVar = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f46508n.f47230e.I && !onTouchEvent(motionEvent)) {
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
        du duVar = this.f46508n;
        cu[] cuVarArr = duVar.f47231f;
        kVar = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i11 = 0; i11 < cuVarArr.length; i11++) {
            cu cuVar = cuVarArr[i11];
            if (cuVar != null) {
                org.telegram.ui.Components.ek0 ek0Var = cuVar.d;
                if (ek0Var != null) {
                    ek0Var.setPadding(0, measuredHeight, 0, 0);
                }
                di.b1 b1Var = cuVarArr[i11].f46876e;
                if (b1Var != null) {
                    b1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i7, 0, i10, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.r4 r4Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        float measuredWidth;
        cu cuVar;
        cu cuVar2;
        int measuredWidth2;
        cu cuVar3;
        cu cuVar4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        du duVar = this.f46508n;
        cu[] cuVarArr = duVar.f47231f;
        r4Var = ((org.telegram.ui.ActionBar.g2) duVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) r4Var).i() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f46507f == null) {
                this.f46507f = VelocityTracker.obtain();
            }
            this.f46507f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f46504b && !this.f46505c) {
            this.f46503a = motionEvent.getPointerId(0);
            this.f46505c = true;
            this.d = (int) motionEvent.getX();
            this.f46506e = (int) motionEvent.getY();
            this.f46507f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f46503a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f46506e);
            if (this.f46504b && (((z12 = duVar.f47233r) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f46505c = true;
                    this.f46504b = false;
                    cuVarArr[0].setTranslationX(0.0f);
                    cu cuVar5 = cuVarArr[1];
                    if (duVar.f47233r) {
                        i7 = cuVarArr[0].getMeasuredWidth();
                    } else {
                        i7 = -cuVarArr[0].getMeasuredWidth();
                    }
                    cuVar5.setTranslationX(i7);
                    duVar.f47230e.i(0.0f, cuVarArr[1].f46877f);
                }
            }
            if (this.f46505c && !this.f46504b) {
                if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f46504b) {
                cuVarArr[0].setTranslationX(x10);
                if (duVar.f47233r) {
                    cuVarArr[1].setTranslationX(cuVarArr[0].getMeasuredWidth() + x10);
                } else {
                    cuVarArr[1].setTranslationX(x10 - cuVarArr[0].getMeasuredWidth());
                }
                duVar.f47230e.i(Math.abs(x10) / cuVarArr[0].getMeasuredWidth(), cuVarArr[1].f46877f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f46503a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f46507f.computeCurrentVelocity(1000, duVar.f47235w);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f46507f.getXVelocity();
                f11 = this.f46507f.getYVelocity();
                if (!this.f46504b && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
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
            if (this.f46504b) {
                float x11 = cuVarArr[0].getX();
                duVar.h = new AnimatorSet();
                if (Math.abs(x11) < cuVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                duVar.f47234s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (duVar.f47233r) {
                        duVar.h.playTogether(ObjectAnimator.ofFloat(cuVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(cuVarArr[1], property, cuVar4.getMeasuredWidth()));
                    } else {
                        duVar.h.playTogether(ObjectAnimator.ofFloat(cuVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(cuVarArr[1], property, -cuVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = cuVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (duVar.f47233r) {
                        duVar.h.playTogether(ObjectAnimator.ofFloat(cuVarArr[0], property, -cuVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(cuVarArr[1], property, 0.0f));
                    } else {
                        duVar.h.playTogether(ObjectAnimator.ofFloat(cuVarArr[0], property, cuVar.getMeasuredWidth()), ObjectAnimator.ofFloat(cuVarArr[1], property, 0.0f));
                    }
                }
                duVar.h.setInterpolator(du.f47226y);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs2 = Math.abs(f10);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                duVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                duVar.h.addListener(new org.telegram.ui.Cells.x9(this, 24));
                duVar.h.start();
                duVar.f47232n = true;
                this.f46504b = false;
            } else {
                this.f46505c = false;
                kVar = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
                kVar.setEnabled(true);
                duVar.f47230e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f46507f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f46507f = null;
            }
        }
        return this.f46504b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
