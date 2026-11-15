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
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class an0 extends org.telegram.ui.Components.st0 {
    public int f45455g0;
    public boolean f45456h0;
    public boolean f45457i0;
    public int f45458j0;
    public int f45459k0;
    public VelocityTracker f45460l0;
    public boolean m0;
    public final bn0 f45461n0;

    public an0(bn0 bn0Var, Context context) {
        super(context, null);
        this.f45461n0 = bn0Var;
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an0.X():boolean");
    }

    public final boolean Y(MotionEvent motionEvent, boolean z10) {
        int i7;
        org.telegram.ui.ActionBar.k kVar;
        bn0 bn0Var = this.f45461n0;
        org.telegram.ui.ActionBar.v4[] v4VarArr = bn0Var.f45795n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = bn0Var.h;
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
        this.f45457i0 = false;
        this.f45456h0 = true;
        this.f45458j0 = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.e2) bn0Var).actionBar;
        kVar.setEnabled(false);
        bn0Var.h.setEnabled(false);
        org.telegram.ui.ActionBar.v4 v4Var = v4VarArr[1];
        v4Var.f29755b = i11;
        v4Var.setVisibility(0);
        bn0Var.f45798w = z10;
        bn0Var.o0(true);
        if (z10) {
            v4VarArr[1].setTranslationX(v4VarArr[0].getMeasuredWidth());
            return true;
        }
        v4VarArr[1].setTranslationX(-v4VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        bn0 bn0Var = this.f45461n0;
        kVar = ((org.telegram.ui.ActionBar.e2) bn0Var).actionBar;
        int measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.e2) bn0Var).actionBar;
        float translationY = measuredHeight + ((int) kVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.j6.f28972k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        bn0 bn0Var = this.f45461n0;
        Paint paint = bn0Var.f45794f;
        paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28792a7, false));
        kVar = ((org.telegram.ui.ActionBar.e2) bn0Var).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.e2) bn0Var).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!X() && !this.f45461n0.h.I && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o4 o4Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        float measuredWidth;
        org.telegram.ui.ActionBar.v4 v4Var;
        org.telegram.ui.ActionBar.v4 v4Var2;
        int measuredWidth2;
        org.telegram.ui.ActionBar.v4 v4Var3;
        org.telegram.ui.ActionBar.v4 v4Var4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        bn0 bn0Var = this.f45461n0;
        org.telegram.ui.ActionBar.v4[] v4VarArr = bn0Var.f45795n;
        o4Var = ((org.telegram.ui.ActionBar.e2) bn0Var).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) o4Var).i() || X()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f45460l0 == null) {
                this.f45460l0 = VelocityTracker.obtain();
            }
            this.f45460l0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f45456h0 && !this.f45457i0) {
            this.f45455g0 = motionEvent.getPointerId(0);
            this.f45457i0 = true;
            this.f45458j0 = (int) motionEvent.getX();
            this.f45459k0 = (int) motionEvent.getY();
            this.f45460l0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f45455g0) {
            int x10 = (int) (motionEvent.getX() - this.f45458j0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f45459k0);
            if (this.f45456h0 && (((z12 = bn0Var.f45798w) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!Y(motionEvent, z13)) {
                    this.f45457i0 = true;
                    this.f45456h0 = false;
                    v4VarArr[0].setTranslationX(0.0f);
                    org.telegram.ui.ActionBar.v4 v4Var5 = v4VarArr[1];
                    if (bn0Var.f45798w) {
                        i7 = v4VarArr[0].getMeasuredWidth();
                    } else {
                        i7 = -v4VarArr[0].getMeasuredWidth();
                    }
                    v4Var5.setTranslationX(i7);
                    bn0Var.h.i(0.0f, v4VarArr[1].f29755b);
                }
            }
            if (this.f45457i0 && !this.f45456h0) {
                if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    Y(motionEvent, z14);
                }
            } else if (this.f45456h0) {
                v4VarArr[0].setTranslationX(x10);
                if (bn0Var.f45798w) {
                    v4VarArr[1].setTranslationX(v4VarArr[0].getMeasuredWidth() + x10);
                } else {
                    v4VarArr[1].setTranslationX(x10 - v4VarArr[0].getMeasuredWidth());
                }
                bn0Var.h.i(Math.abs(x10) / v4VarArr[0].getMeasuredWidth(), v4VarArr[1].f29755b);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f45455g0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f45460l0.computeCurrentVelocity(1000, bn0Var.f45800y);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f45460l0.getXVelocity();
                f11 = this.f45460l0.getYVelocity();
                if (!this.f45456h0 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    if (f10 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Y(motionEvent, z11);
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (this.f45456h0) {
                float x11 = v4VarArr[0].getX();
                bn0Var.f45796r = new AnimatorSet();
                if (Math.abs(x11) < v4VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bn0Var.f45799x = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (bn0Var.f45798w) {
                        bn0Var.f45796r.playTogether(ObjectAnimator.ofFloat(v4VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(v4VarArr[1], property, v4Var4.getMeasuredWidth()));
                    } else {
                        bn0Var.f45796r.playTogether(ObjectAnimator.ofFloat(v4VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(v4VarArr[1], property, -v4Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = v4VarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (bn0Var.f45798w) {
                        bn0Var.f45796r.playTogether(ObjectAnimator.ofFloat(v4VarArr[0], property, -v4Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(v4VarArr[1], property, 0.0f));
                    } else {
                        bn0Var.f45796r.playTogether(ObjectAnimator.ofFloat(v4VarArr[0], property, v4Var.getMeasuredWidth()), ObjectAnimator.ofFloat(v4VarArr[1], property, 0.0f));
                    }
                }
                bn0Var.f45796r.setInterpolator(bn0.E);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs2 = Math.abs(f10);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                bn0Var.f45796r.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                bn0Var.f45796r.addListener(new xx(this, 10));
                bn0Var.f45796r.start();
                bn0Var.f45797s = true;
                this.f45456h0 = false;
            } else {
                this.f45457i0 = false;
                kVar = ((org.telegram.ui.ActionBar.e2) bn0Var).actionBar;
                kVar.setEnabled(true);
                bn0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f45460l0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f45460l0 = null;
            }
        }
        return this.f45456h0;
    }

    @Override
    public final void requestLayout() {
        if (this.m0) {
            return;
        }
        super.requestLayout();
    }
}
