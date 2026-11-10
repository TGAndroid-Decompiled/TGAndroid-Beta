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
public final class cn0 extends org.telegram.ui.Components.st0 {
    public int f44753f0;
    public boolean f44754g0;
    public boolean f44755h0;
    public int f44756i0;
    public int f44757j0;
    public VelocityTracker f44758k0;
    public boolean f44759l0;
    public final dn0 m0;

    public cn0(dn0 dn0Var, Context context) {
        super(context, null);
        this.m0 = dn0Var;
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn0.X():boolean");
    }

    public final boolean Y(MotionEvent motionEvent, boolean z9) {
        int i7;
        org.telegram.ui.ActionBar.l lVar;
        dn0 dn0Var = this.m0;
        org.telegram.ui.ActionBar.y4[] y4VarArr = dn0Var.f45019n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = dn0Var.h;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i10 = scrollSlidingTextTabStrip.f31554n;
        if (z9) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i11 = sparseIntArray.get(i10 + i7, -1);
        if (i11 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f44755h0 = false;
        this.f44754g0 = true;
        this.f44756i0 = (int) motionEvent.getX();
        lVar = ((org.telegram.ui.ActionBar.f2) dn0Var).actionBar;
        lVar.setEnabled(false);
        dn0Var.h.setEnabled(false);
        org.telegram.ui.ActionBar.y4 y4Var = y4VarArr[1];
        y4Var.f28791b = i11;
        y4Var.setVisibility(0);
        dn0Var.f45022w = z9;
        dn0Var.o0(true);
        if (z9) {
            y4VarArr[1].setTranslationX(y4VarArr[0].getMeasuredWidth());
            return true;
        }
        y4VarArr[1].setTranslationX(-y4VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        super.dispatchDraw(canvas);
        dn0 dn0Var = this.m0;
        lVar = ((org.telegram.ui.ActionBar.f2) dn0Var).actionBar;
        int measuredHeight = lVar.getMeasuredHeight();
        lVar2 = ((org.telegram.ui.ActionBar.f2) dn0Var).actionBar;
        float translationY = measuredHeight + ((int) lVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.m6.f28013k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        dn0 dn0Var = this.m0;
        Paint paint = dn0Var.f45018f;
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27834a7, false));
        lVar = ((org.telegram.ui.ActionBar.f2) dn0Var).actionBar;
        lVar2 = ((org.telegram.ui.ActionBar.f2) dn0Var).actionBar;
        canvas.drawRect(0.0f, lVar2.getTranslationY() + lVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!X() && !this.m0.h.H && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.r4 r4Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.l lVar;
        boolean z9;
        float measuredWidth;
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        int measuredWidth2;
        org.telegram.ui.ActionBar.y4 y4Var3;
        org.telegram.ui.ActionBar.y4 y4Var4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        dn0 dn0Var = this.m0;
        org.telegram.ui.ActionBar.y4[] y4VarArr = dn0Var.f45019n;
        r4Var = ((org.telegram.ui.ActionBar.f2) dn0Var).parentLayout;
        boolean z13 = false;
        if (((ActionBarLayout) r4Var).i() || X()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f44758k0 == null) {
                this.f44758k0 = VelocityTracker.obtain();
            }
            this.f44758k0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f44754g0 && !this.f44755h0) {
            this.f44753f0 = motionEvent.getPointerId(0);
            this.f44755h0 = true;
            this.f44756i0 = (int) motionEvent.getX();
            this.f44757j0 = (int) motionEvent.getY();
            this.f44758k0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f44753f0) {
            int x10 = (int) (motionEvent.getX() - this.f44756i0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f44757j0);
            if (this.f44754g0 && (((z11 = dn0Var.f45022w) && x10 > 0) || (!z11 && x10 < 0))) {
                if (x10 < 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!Y(motionEvent, z12)) {
                    this.f44755h0 = true;
                    this.f44754g0 = false;
                    y4VarArr[0].setTranslationX(0.0f);
                    org.telegram.ui.ActionBar.y4 y4Var5 = y4VarArr[1];
                    if (dn0Var.f45022w) {
                        i7 = y4VarArr[0].getMeasuredWidth();
                    } else {
                        i7 = -y4VarArr[0].getMeasuredWidth();
                    }
                    y4Var5.setTranslationX(i7);
                    dn0Var.h.i(0.0f, y4VarArr[1].f28791b);
                }
            }
            if (this.f44755h0 && !this.f44754g0) {
                if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z13 = true;
                    }
                    Y(motionEvent, z13);
                }
            } else if (this.f44754g0) {
                y4VarArr[0].setTranslationX(x10);
                if (dn0Var.f45022w) {
                    y4VarArr[1].setTranslationX(y4VarArr[0].getMeasuredWidth() + x10);
                } else {
                    y4VarArr[1].setTranslationX(x10 - y4VarArr[0].getMeasuredWidth());
                }
                dn0Var.h.i(Math.abs(x10) / y4VarArr[0].getMeasuredWidth(), y4VarArr[1].f28791b);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f44753f0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f44758k0.computeCurrentVelocity(1000, dn0Var.f45024y);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f44758k0.getXVelocity();
                f11 = this.f44758k0.getYVelocity();
                if (!this.f44754g0 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    if (f10 < 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Y(motionEvent, z10);
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (this.f44754g0) {
                float x11 = y4VarArr[0].getX();
                dn0Var.f45020r = new AnimatorSet();
                if (Math.abs(x11) < y4VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                dn0Var.f45023x = z9;
                Property property = View.TRANSLATION_X;
                if (z9) {
                    measuredWidth = Math.abs(x11);
                    if (dn0Var.f45022w) {
                        dn0Var.f45020r.playTogether(ObjectAnimator.ofFloat(y4VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(y4VarArr[1], property, y4Var4.getMeasuredWidth()));
                    } else {
                        dn0Var.f45020r.playTogether(ObjectAnimator.ofFloat(y4VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(y4VarArr[1], property, -y4Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = y4VarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (dn0Var.f45022w) {
                        dn0Var.f45020r.playTogether(ObjectAnimator.ofFloat(y4VarArr[0], property, -y4Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(y4VarArr[1], property, 0.0f));
                    } else {
                        dn0Var.f45020r.playTogether(ObjectAnimator.ofFloat(y4VarArr[0], property, y4Var.getMeasuredWidth()), ObjectAnimator.ofFloat(y4VarArr[1], property, 0.0f));
                    }
                }
                dn0Var.f45020r.setInterpolator(dn0.D);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs2 = Math.abs(f10);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                dn0Var.f45020r.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                dn0Var.f45020r.addListener(new g30(this, 9));
                dn0Var.f45020r.start();
                dn0Var.f45021s = true;
                this.f44754g0 = false;
            } else {
                this.f44755h0 = false;
                lVar = ((org.telegram.ui.ActionBar.f2) dn0Var).actionBar;
                lVar.setEnabled(true);
                dn0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f44758k0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f44758k0 = null;
            }
        }
        return this.f44754g0;
    }

    @Override
    public final void requestLayout() {
        if (this.f44759l0) {
            return;
        }
        super.requestLayout();
    }
}
