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
public final class jq0 extends org.telegram.ui.Components.qv0 {
    public final mq0 A0;
    public int f38200t0;
    public boolean f38201u0;
    public boolean f38202v0;
    public int f38203w0;
    public int f38204x0;
    public VelocityTracker f38205y0;
    public boolean f38206z0;

    public jq0(mq0 mq0Var, Context context) {
        super(context, null);
        this.A0 = mq0Var;
    }

    public final boolean Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jq0.Z():boolean");
    }

    public final boolean a0(MotionEvent motionEvent, boolean z4) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        mq0 mq0Var = this.A0;
        kq0[] kq0VarArr = mq0Var.f39204n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = mq0Var.h;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.L;
        int i11 = scrollSlidingTextTabStrip.f25026n;
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
        this.f38202v0 = false;
        this.f38201u0 = true;
        this.f38203w0 = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.p2) mq0Var).actionBar;
        kVar.setEnabled(false);
        mq0Var.h.setEnabled(false);
        kq0 kq0Var = kq0VarArr[1];
        kq0Var.f38494e = i12;
        kq0Var.setVisibility(0);
        mq0Var.v = z4;
        mq0Var.j0(true);
        if (z4) {
            kq0VarArr[1].setTranslationX(kq0VarArr[0].getMeasuredWidth());
            return true;
        }
        kq0VarArr[1].setTranslationX(-kq0VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        mq0 mq0Var = this.A0;
        kVar = ((org.telegram.ui.ActionBar.p2) mq0Var).actionBar;
        int measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.p2) mq0Var).actionBar;
        float translationY = measuredHeight + ((int) kVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.k6.f21779k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        mq0 mq0Var = this.A0;
        Paint paint = mq0Var.f39203f;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        kVar = ((org.telegram.ui.ActionBar.p2) mq0Var).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.p2) mq0Var).actionBar;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jq0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f5 f5Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        boolean z4;
        float measuredWidth;
        kq0 kq0Var;
        kq0 kq0Var2;
        int measuredWidth2;
        kq0 kq0Var3;
        kq0 kq0Var4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        mq0 mq0Var = this.A0;
        kq0[] kq0VarArr = mq0Var.f39204n;
        f5Var = ((org.telegram.ui.ActionBar.p2) mq0Var).parentLayout;
        boolean z13 = false;
        if (((ActionBarLayout) f5Var).j() || Z()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f38205y0 == null) {
                this.f38205y0 = VelocityTracker.obtain();
            }
            this.f38205y0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f38201u0 && !this.f38202v0) {
            this.f38200t0 = motionEvent.getPointerId(0);
            this.f38202v0 = true;
            this.f38203w0 = (int) motionEvent.getX();
            this.f38204x0 = (int) motionEvent.getY();
            this.f38205y0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f38200t0) {
            int x10 = (int) (motionEvent.getX() - this.f38203w0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f38204x0);
            if (this.f38201u0 && (((z11 = mq0Var.v) && x10 > 0) || (!z11 && x10 < 0))) {
                if (x10 < 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!a0(motionEvent, z12)) {
                    this.f38202v0 = true;
                    this.f38201u0 = false;
                    kq0VarArr[0].setTranslationX(0.0f);
                    kq0 kq0Var5 = kq0VarArr[1];
                    if (mq0Var.v) {
                        i10 = kq0VarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -kq0VarArr[0].getMeasuredWidth();
                    }
                    kq0Var5.setTranslationX(i10);
                    mq0Var.h.j(0.0f, kq0VarArr[1].f38494e);
                }
            }
            if (this.f38202v0 && !this.f38201u0) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z13 = true;
                    }
                    a0(motionEvent, z13);
                }
            } else if (this.f38201u0) {
                kq0VarArr[0].setTranslationX(x10);
                if (mq0Var.v) {
                    kq0VarArr[1].setTranslationX(kq0VarArr[0].getMeasuredWidth() + x10);
                } else {
                    kq0VarArr[1].setTranslationX(x10 - kq0VarArr[0].getMeasuredWidth());
                }
                mq0Var.h.j(Math.abs(x10) / kq0VarArr[0].getMeasuredWidth(), kq0VarArr[1].f38494e);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f38200t0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f38205y0.computeCurrentVelocity(1000, mq0Var.f39208x);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f38205y0.getXVelocity();
                f11 = this.f38205y0.getYVelocity();
                if (!this.f38201u0 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
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
            if (this.f38201u0) {
                float x11 = kq0VarArr[0].getX();
                mq0Var.f39205r = new AnimatorSet();
                if (Math.abs(x11) < kq0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                mq0Var.f39207w = z4;
                Property property = View.TRANSLATION_X;
                if (z4) {
                    measuredWidth = Math.abs(x11);
                    if (mq0Var.v) {
                        mq0Var.f39205r.playTogether(ObjectAnimator.ofFloat(kq0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(kq0VarArr[1], property, kq0Var4.getMeasuredWidth()));
                    } else {
                        mq0Var.f39205r.playTogether(ObjectAnimator.ofFloat(kq0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(kq0VarArr[1], property, -kq0Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = kq0VarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (mq0Var.v) {
                        mq0Var.f39205r.playTogether(ObjectAnimator.ofFloat(kq0VarArr[0], property, -kq0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(kq0VarArr[1], property, 0.0f));
                    } else {
                        mq0Var.f39205r.playTogether(ObjectAnimator.ofFloat(kq0VarArr[0], property, kq0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(kq0VarArr[1], property, 0.0f));
                    }
                }
                mq0Var.f39205r.setInterpolator(mq0.f39198y);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs2 = Math.abs(f10);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                mq0Var.f39205r.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                mq0Var.f39205r.addListener(new org.telegram.ui.Components.g91(this, 29));
                mq0Var.f39205r.start();
                mq0Var.f39206s = true;
                this.f38201u0 = false;
            } else {
                this.f38202v0 = false;
                kVar = ((org.telegram.ui.ActionBar.p2) mq0Var).actionBar;
                kVar.setEnabled(true);
                mq0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f38205y0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f38205y0 = null;
            }
        }
        return this.f38201u0;
    }

    @Override
    public final void requestLayout() {
        if (this.f38206z0) {
            return;
        }
        super.requestLayout();
    }
}
