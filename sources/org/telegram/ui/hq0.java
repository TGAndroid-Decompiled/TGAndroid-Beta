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
public final class hq0 extends org.telegram.ui.Components.qv0 {
    public final kq0 A0;
    public int f34933t0;
    public boolean f34934u0;
    public boolean f34935v0;
    public int f34936w0;
    public int f34937x0;
    public VelocityTracker f34938y0;
    public boolean f34939z0;

    public hq0(kq0 kq0Var, Context context) {
        super(context, null);
        this.A0 = kq0Var;
    }

    public final boolean Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hq0.Z():boolean");
    }

    public final boolean a0(MotionEvent motionEvent, boolean z4) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        kq0 kq0Var = this.A0;
        iq0[] iq0VarArr = kq0Var.f35792n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = kq0Var.h;
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
        this.f34935v0 = false;
        this.f34934u0 = true;
        this.f34936w0 = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.p2) kq0Var).actionBar;
        kVar.setEnabled(false);
        kq0Var.h.setEnabled(false);
        iq0 iq0Var = iq0VarArr[1];
        iq0Var.e = i12;
        iq0Var.setVisibility(0);
        kq0Var.v = z4;
        kq0Var.j0(true);
        if (z4) {
            iq0VarArr[1].setTranslationX(iq0VarArr[0].getMeasuredWidth());
            return true;
        }
        iq0VarArr[1].setTranslationX(-iq0VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        kq0 kq0Var = this.A0;
        kVar = ((org.telegram.ui.ActionBar.p2) kq0Var).actionBar;
        int measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.p2) kq0Var).actionBar;
        float translationY = measuredHeight + ((int) kVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.j6.f20025k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        kq0 kq0Var = this.A0;
        Paint paint = kq0Var.f35791f;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        kVar = ((org.telegram.ui.ActionBar.p2) kq0Var).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.p2) kq0Var).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!Z() && !this.A0.h.E && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hq0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.e5 e5Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        boolean z4;
        float measuredWidth;
        iq0 iq0Var;
        iq0 iq0Var2;
        int measuredWidth2;
        iq0 iq0Var3;
        iq0 iq0Var4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        kq0 kq0Var = this.A0;
        iq0[] iq0VarArr = kq0Var.f35792n;
        e5Var = ((org.telegram.ui.ActionBar.p2) kq0Var).parentLayout;
        boolean z13 = false;
        if (((ActionBarLayout) e5Var).j() || Z()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f34938y0 == null) {
                this.f34938y0 = VelocityTracker.obtain();
            }
            this.f34938y0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f34934u0 && !this.f34935v0) {
            this.f34933t0 = motionEvent.getPointerId(0);
            this.f34935v0 = true;
            this.f34936w0 = (int) motionEvent.getX();
            this.f34937x0 = (int) motionEvent.getY();
            this.f34938y0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f34933t0) {
            int x10 = (int) (motionEvent.getX() - this.f34936w0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f34937x0);
            if (this.f34934u0 && (((z11 = kq0Var.v) && x10 > 0) || (!z11 && x10 < 0))) {
                if (x10 < 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!a0(motionEvent, z12)) {
                    this.f34935v0 = true;
                    this.f34934u0 = false;
                    iq0VarArr[0].setTranslationX(0.0f);
                    iq0 iq0Var5 = iq0VarArr[1];
                    if (kq0Var.v) {
                        i10 = iq0VarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -iq0VarArr[0].getMeasuredWidth();
                    }
                    iq0Var5.setTranslationX(i10);
                    kq0Var.h.j(0.0f, iq0VarArr[1].e);
                }
            }
            if (this.f34935v0 && !this.f34934u0) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z13 = true;
                    }
                    a0(motionEvent, z13);
                }
            } else if (this.f34934u0) {
                iq0VarArr[0].setTranslationX(x10);
                if (kq0Var.v) {
                    iq0VarArr[1].setTranslationX(iq0VarArr[0].getMeasuredWidth() + x10);
                } else {
                    iq0VarArr[1].setTranslationX(x10 - iq0VarArr[0].getMeasuredWidth());
                }
                kq0Var.h.j(Math.abs(x10) / iq0VarArr[0].getMeasuredWidth(), iq0VarArr[1].e);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f34933t0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f34938y0.computeCurrentVelocity(1000, kq0Var.f35796x);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f34938y0.getXVelocity();
                f11 = this.f34938y0.getYVelocity();
                if (!this.f34934u0 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    if (f10 < 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a0(motionEvent, z10);
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (this.f34934u0) {
                float x11 = iq0VarArr[0].getX();
                kq0Var.f35793r = new AnimatorSet();
                if (Math.abs(x11) < iq0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                kq0Var.f35795w = z4;
                Property property = View.TRANSLATION_X;
                if (z4) {
                    measuredWidth = Math.abs(x11);
                    if (kq0Var.v) {
                        kq0Var.f35793r.playTogether(ObjectAnimator.ofFloat(iq0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(iq0VarArr[1], property, iq0Var4.getMeasuredWidth()));
                    } else {
                        kq0Var.f35793r.playTogether(ObjectAnimator.ofFloat(iq0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(iq0VarArr[1], property, -iq0Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = iq0VarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (kq0Var.v) {
                        kq0Var.f35793r.playTogether(ObjectAnimator.ofFloat(iq0VarArr[0], property, -iq0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(iq0VarArr[1], property, 0.0f));
                    } else {
                        kq0Var.f35793r.playTogether(ObjectAnimator.ofFloat(iq0VarArr[0], property, iq0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(iq0VarArr[1], property, 0.0f));
                    }
                }
                kq0Var.f35793r.setInterpolator(kq0.f35787y);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs2 = Math.abs(f10);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                kq0Var.f35793r.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                kq0Var.f35793r.addListener(new org.telegram.ui.Components.f91(this, 29));
                kq0Var.f35793r.start();
                kq0Var.f35794s = true;
                this.f34934u0 = false;
            } else {
                this.f34935v0 = false;
                kVar = ((org.telegram.ui.ActionBar.p2) kq0Var).actionBar;
                kVar.setEnabled(true);
                kq0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f34938y0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f34938y0 = null;
            }
        }
        return this.f34934u0;
    }

    @Override
    public final void requestLayout() {
        if (this.f34939z0) {
            return;
        }
        super.requestLayout();
    }
}
