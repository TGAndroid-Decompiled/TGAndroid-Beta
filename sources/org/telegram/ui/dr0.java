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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class dr0 extends org.telegram.ui.Components.ov0 {
    public int A0;
    public VelocityTracker B0;
    public boolean C0;
    public final gr0 D0;
    public int f35847w0;
    public boolean f35848x0;
    public boolean f35849y0;
    public int f35850z0;

    public dr0(gr0 gr0Var, Context context) {
        super(context, null);
        this.D0 = gr0Var;
    }

    public final boolean Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dr0.Z():boolean");
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        gr0 gr0Var = this.D0;
        er0[] er0VarArr = gr0Var.f36757n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = gr0Var.h;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i11 = scrollSlidingTextTabStrip.f24131n;
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
        this.f35849y0 = false;
        this.f35848x0 = true;
        this.f35850z0 = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.n2) gr0Var).actionBar;
        kVar.setEnabled(false);
        gr0Var.h.setEnabled(false);
        er0 er0Var = er0VarArr[1];
        er0Var.f36157e = i12;
        er0Var.setVisibility(0);
        gr0Var.v = z10;
        gr0Var.j0(true);
        if (z10) {
            er0VarArr[1].setTranslationX(er0VarArr[0].getMeasuredWidth());
            return true;
        }
        er0VarArr[1].setTranslationX(-er0VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        gr0 gr0Var = this.D0;
        kVar = ((org.telegram.ui.ActionBar.n2) gr0Var).actionBar;
        int measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.n2) gr0Var).actionBar;
        float translationY = measuredHeight + ((int) kVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.j6.f20785k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        gr0 gr0Var = this.D0;
        Paint paint = gr0Var.f36756f;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        kVar = ((org.telegram.ui.ActionBar.n2) gr0Var).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.n2) gr0Var).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!Z() && !this.D0.h.H && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dr0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dr0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.d5 d5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        float measuredWidth;
        er0 er0Var;
        er0 er0Var2;
        int measuredWidth2;
        er0 er0Var3;
        er0 er0Var4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        gr0 gr0Var = this.D0;
        er0[] er0VarArr = gr0Var.f36757n;
        d5Var = ((org.telegram.ui.ActionBar.n2) gr0Var).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) d5Var).j() || Z()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.B0 == null) {
                this.B0 = VelocityTracker.obtain();
            }
            this.B0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f35848x0 && !this.f35849y0) {
            this.f35847w0 = motionEvent.getPointerId(0);
            this.f35849y0 = true;
            this.f35850z0 = (int) motionEvent.getX();
            this.A0 = (int) motionEvent.getY();
            this.B0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f35847w0) {
            int x10 = (int) (motionEvent.getX() - this.f35850z0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.A0);
            if (this.f35848x0 && (((z12 = gr0Var.v) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!a0(motionEvent, z13)) {
                    this.f35849y0 = true;
                    this.f35848x0 = false;
                    er0VarArr[0].setTranslationX(0.0f);
                    er0 er0Var5 = er0VarArr[1];
                    if (gr0Var.v) {
                        i10 = er0VarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -er0VarArr[0].getMeasuredWidth();
                    }
                    er0Var5.setTranslationX(i10);
                    gr0Var.h.j(0.0f, er0VarArr[1].f36157e);
                }
            }
            if (this.f35849y0 && !this.f35848x0) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    a0(motionEvent, z14);
                }
            } else if (this.f35848x0) {
                er0VarArr[0].setTranslationX(x10);
                if (gr0Var.v) {
                    er0VarArr[1].setTranslationX(er0VarArr[0].getMeasuredWidth() + x10);
                } else {
                    er0VarArr[1].setTranslationX(x10 - er0VarArr[0].getMeasuredWidth());
                }
                gr0Var.h.j(Math.abs(x10) / er0VarArr[0].getMeasuredWidth(), er0VarArr[1].f36157e);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f35847w0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.B0.computeCurrentVelocity(1000, gr0Var.f36761x);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.B0.getXVelocity();
                f10 = this.B0.getYVelocity();
                if (!this.f35848x0 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    if (f7 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a0(motionEvent, z11);
                }
            } else {
                f7 = 0.0f;
                f10 = 0.0f;
            }
            if (this.f35848x0) {
                float x11 = er0VarArr[0].getX();
                gr0Var.f36758r = new AnimatorSet();
                if (Math.abs(x11) < er0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                gr0Var.f36760w = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (gr0Var.v) {
                        gr0Var.f36758r.playTogether(ObjectAnimator.ofFloat(er0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(er0VarArr[1], property, er0Var4.getMeasuredWidth()));
                    } else {
                        gr0Var.f36758r.playTogether(ObjectAnimator.ofFloat(er0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(er0VarArr[1], property, -er0Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = er0VarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (gr0Var.v) {
                        gr0Var.f36758r.playTogether(ObjectAnimator.ofFloat(er0VarArr[0], property, -er0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(er0VarArr[1], property, 0.0f));
                    } else {
                        gr0Var.f36758r.playTogether(ObjectAnimator.ofFloat(er0VarArr[0], property, er0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(er0VarArr[1], property, 0.0f));
                    }
                }
                gr0Var.f36758r.setInterpolator(gr0.f36751y);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f7);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                gr0Var.f36758r.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                gr0Var.f36758r.addListener(new gk0(this, 3));
                gr0Var.f36758r.start();
                gr0Var.f36759s = true;
                this.f35848x0 = false;
            } else {
                this.f35849y0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) gr0Var).actionBar;
                kVar.setEnabled(true);
                gr0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.B0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.B0 = null;
            }
        }
        return this.f35848x0;
    }

    @Override
    public final void requestLayout() {
        if (this.C0) {
            return;
        }
        super.requestLayout();
    }
}
