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
public final class oq0 extends org.telegram.ui.Components.qv0 {
    public final rq0 A0;
    public int f36864t0;
    public boolean f36865u0;
    public boolean f36866v0;
    public int f36867w0;
    public int f36868x0;
    public VelocityTracker f36869y0;
    public boolean f36870z0;

    public oq0(rq0 rq0Var, Context context) {
        super(context, null);
        this.A0 = rq0Var;
    }

    public final boolean Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oq0.Z():boolean");
    }

    public final boolean a0(MotionEvent motionEvent, boolean z4) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        rq0 rq0Var = this.A0;
        pq0[] pq0VarArr = rq0Var.f37950n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = rq0Var.h;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.L;
        int i11 = scrollSlidingTextTabStrip.f23141n;
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
        this.f36866v0 = false;
        this.f36865u0 = true;
        this.f36867w0 = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.p2) rq0Var).actionBar;
        kVar.setEnabled(false);
        rq0Var.h.setEnabled(false);
        pq0 pq0Var = pq0VarArr[1];
        pq0Var.e = i12;
        pq0Var.setVisibility(0);
        rq0Var.v = z4;
        rq0Var.j0(true);
        if (z4) {
            pq0VarArr[1].setTranslationX(pq0VarArr[0].getMeasuredWidth());
            return true;
        }
        pq0VarArr[1].setTranslationX(-pq0VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        rq0 rq0Var = this.A0;
        kVar = ((org.telegram.ui.ActionBar.p2) rq0Var).actionBar;
        int measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.p2) rq0Var).actionBar;
        float translationY = measuredHeight + ((int) kVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.j6.f20000k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        rq0 rq0Var = this.A0;
        Paint paint = rq0Var.f37949f;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        kVar = ((org.telegram.ui.ActionBar.p2) rq0Var).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.p2) rq0Var).actionBar;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oq0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.e5 e5Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        boolean z4;
        float measuredWidth;
        pq0 pq0Var;
        pq0 pq0Var2;
        int measuredWidth2;
        pq0 pq0Var3;
        pq0 pq0Var4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        rq0 rq0Var = this.A0;
        pq0[] pq0VarArr = rq0Var.f37950n;
        e5Var = ((org.telegram.ui.ActionBar.p2) rq0Var).parentLayout;
        boolean z13 = false;
        if (((ActionBarLayout) e5Var).j() || Z()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f36869y0 == null) {
                this.f36869y0 = VelocityTracker.obtain();
            }
            this.f36869y0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f36865u0 && !this.f36866v0) {
            this.f36864t0 = motionEvent.getPointerId(0);
            this.f36866v0 = true;
            this.f36867w0 = (int) motionEvent.getX();
            this.f36868x0 = (int) motionEvent.getY();
            this.f36869y0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f36864t0) {
            int x10 = (int) (motionEvent.getX() - this.f36867w0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f36868x0);
            if (this.f36865u0 && (((z11 = rq0Var.v) && x10 > 0) || (!z11 && x10 < 0))) {
                if (x10 < 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!a0(motionEvent, z12)) {
                    this.f36866v0 = true;
                    this.f36865u0 = false;
                    pq0VarArr[0].setTranslationX(0.0f);
                    pq0 pq0Var5 = pq0VarArr[1];
                    if (rq0Var.v) {
                        i10 = pq0VarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -pq0VarArr[0].getMeasuredWidth();
                    }
                    pq0Var5.setTranslationX(i10);
                    rq0Var.h.j(0.0f, pq0VarArr[1].e);
                }
            }
            if (this.f36866v0 && !this.f36865u0) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z13 = true;
                    }
                    a0(motionEvent, z13);
                }
            } else if (this.f36865u0) {
                pq0VarArr[0].setTranslationX(x10);
                if (rq0Var.v) {
                    pq0VarArr[1].setTranslationX(pq0VarArr[0].getMeasuredWidth() + x10);
                } else {
                    pq0VarArr[1].setTranslationX(x10 - pq0VarArr[0].getMeasuredWidth());
                }
                rq0Var.h.j(Math.abs(x10) / pq0VarArr[0].getMeasuredWidth(), pq0VarArr[1].e);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f36864t0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f36869y0.computeCurrentVelocity(1000, rq0Var.f37954x);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f36869y0.getXVelocity();
                f11 = this.f36869y0.getYVelocity();
                if (!this.f36865u0 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
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
            if (this.f36865u0) {
                float x11 = pq0VarArr[0].getX();
                rq0Var.f37951r = new AnimatorSet();
                if (Math.abs(x11) < pq0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                rq0Var.f37953w = z4;
                Property property = View.TRANSLATION_X;
                if (z4) {
                    measuredWidth = Math.abs(x11);
                    if (rq0Var.v) {
                        rq0Var.f37951r.playTogether(ObjectAnimator.ofFloat(pq0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(pq0VarArr[1], property, pq0Var4.getMeasuredWidth()));
                    } else {
                        rq0Var.f37951r.playTogether(ObjectAnimator.ofFloat(pq0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(pq0VarArr[1], property, -pq0Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = pq0VarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (rq0Var.v) {
                        rq0Var.f37951r.playTogether(ObjectAnimator.ofFloat(pq0VarArr[0], property, -pq0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(pq0VarArr[1], property, 0.0f));
                    } else {
                        rq0Var.f37951r.playTogether(ObjectAnimator.ofFloat(pq0VarArr[0], property, pq0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(pq0VarArr[1], property, 0.0f));
                    }
                }
                rq0Var.f37951r.setInterpolator(rq0.f37945y);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs2 = Math.abs(f10);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                rq0Var.f37951r.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                rq0Var.f37951r.addListener(new org.telegram.ui.Components.f91(this, 29));
                rq0Var.f37951r.start();
                rq0Var.f37952s = true;
                this.f36865u0 = false;
            } else {
                this.f36866v0 = false;
                kVar = ((org.telegram.ui.ActionBar.p2) rq0Var).actionBar;
                kVar.setEnabled(true);
                rq0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f36869y0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f36869y0 = null;
            }
        }
        return this.f36865u0;
    }

    @Override
    public final void requestLayout() {
        if (this.f36870z0) {
            return;
        }
        super.requestLayout();
    }
}
