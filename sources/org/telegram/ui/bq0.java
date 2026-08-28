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
public final class bq0 extends org.telegram.ui.Components.xu0 {
    public int f36955s0;
    public boolean f36956t0;
    public boolean f36957u0;
    public int f36958v0;
    public int f36959w0;
    public VelocityTracker f36960x0;
    public boolean f36961y0;
    public final eq0 f36962z0;

    public bq0(eq0 eq0Var, Context context) {
        super(context, null);
        this.f36962z0 = eq0Var;
    }

    public final boolean Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bq0.Z():boolean");
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        int i9;
        org.telegram.ui.ActionBar.k kVar;
        eq0 eq0Var = this.f36962z0;
        cq0[] cq0VarArr = eq0Var.f38013n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = eq0Var.h;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.K;
        int i10 = scrollSlidingTextTabStrip.f26527n;
        if (z10) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        int i11 = sparseIntArray.get(i10 + i9, -1);
        if (i11 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f36957u0 = false;
        this.f36956t0 = true;
        this.f36958v0 = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
        kVar.setEnabled(false);
        eq0Var.h.setEnabled(false);
        cq0 cq0Var = cq0VarArr[1];
        cq0Var.f37291e = i11;
        cq0Var.setVisibility(0);
        eq0Var.v = z10;
        eq0Var.i0(true);
        if (z10) {
            cq0VarArr[1].setTranslationX(cq0VarArr[0].getMeasuredWidth());
            return true;
        }
        cq0VarArr[1].setTranslationX(-cq0VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        eq0 eq0Var = this.f36962z0;
        kVar = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
        int measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
        float translationY = measuredHeight + ((int) kVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.f6.f23121k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        eq0 eq0Var = this.f36962z0;
        Paint paint = eq0Var.f38012f;
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        kVar = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!Z() && !this.f36962z0.h.D && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bq0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b5 b5Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        float measuredWidth;
        cq0 cq0Var;
        cq0 cq0Var2;
        int measuredWidth2;
        cq0 cq0Var3;
        cq0 cq0Var4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i9;
        eq0 eq0Var = this.f36962z0;
        cq0[] cq0VarArr = eq0Var.f38013n;
        b5Var = ((org.telegram.ui.ActionBar.o2) eq0Var).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) b5Var).j() || Z()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f36960x0 == null) {
                this.f36960x0 = VelocityTracker.obtain();
            }
            this.f36960x0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f36956t0 && !this.f36957u0) {
            this.f36955s0 = motionEvent.getPointerId(0);
            this.f36957u0 = true;
            this.f36958v0 = (int) motionEvent.getX();
            this.f36959w0 = (int) motionEvent.getY();
            this.f36960x0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f36955s0) {
            int x10 = (int) (motionEvent.getX() - this.f36958v0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f36959w0);
            if (this.f36956t0 && (((z12 = eq0Var.v) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!a0(motionEvent, z13)) {
                    this.f36957u0 = true;
                    this.f36956t0 = false;
                    cq0VarArr[0].setTranslationX(0.0f);
                    cq0 cq0Var5 = cq0VarArr[1];
                    if (eq0Var.v) {
                        i9 = cq0VarArr[0].getMeasuredWidth();
                    } else {
                        i9 = -cq0VarArr[0].getMeasuredWidth();
                    }
                    cq0Var5.setTranslationX(i9);
                    eq0Var.h.j(0.0f, cq0VarArr[1].f37291e);
                }
            }
            if (this.f36957u0 && !this.f36956t0) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    a0(motionEvent, z14);
                }
            } else if (this.f36956t0) {
                cq0VarArr[0].setTranslationX(x10);
                if (eq0Var.v) {
                    cq0VarArr[1].setTranslationX(cq0VarArr[0].getMeasuredWidth() + x10);
                } else {
                    cq0VarArr[1].setTranslationX(x10 - cq0VarArr[0].getMeasuredWidth());
                }
                eq0Var.h.j(Math.abs(x10) / cq0VarArr[0].getMeasuredWidth(), cq0VarArr[1].f37291e);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f36955s0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f36960x0.computeCurrentVelocity(1000, eq0Var.f38017x);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f36960x0.getXVelocity();
                f11 = this.f36960x0.getYVelocity();
                if (!this.f36956t0 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    if (f10 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a0(motionEvent, z11);
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (this.f36956t0) {
                float x11 = cq0VarArr[0].getX();
                eq0Var.f38014r = new AnimatorSet();
                if (Math.abs(x11) < cq0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eq0Var.f38016w = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (eq0Var.v) {
                        eq0Var.f38014r.playTogether(ObjectAnimator.ofFloat(cq0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(cq0VarArr[1], property, cq0Var4.getMeasuredWidth()));
                    } else {
                        eq0Var.f38014r.playTogether(ObjectAnimator.ofFloat(cq0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(cq0VarArr[1], property, -cq0Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = cq0VarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (eq0Var.v) {
                        eq0Var.f38014r.playTogether(ObjectAnimator.ofFloat(cq0VarArr[0], property, -cq0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(cq0VarArr[1], property, 0.0f));
                    } else {
                        eq0Var.f38014r.playTogether(ObjectAnimator.ofFloat(cq0VarArr[0], property, cq0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(cq0VarArr[1], property, 0.0f));
                    }
                }
                eq0Var.f38014r.setInterpolator(eq0.f38007y);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs2 = Math.abs(f10);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                eq0Var.f38014r.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                eq0Var.f38014r.addListener(new bc0(this, 6));
                eq0Var.f38014r.start();
                eq0Var.f38015s = true;
                this.f36956t0 = false;
            } else {
                this.f36957u0 = false;
                kVar = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
                kVar.setEnabled(true);
                eq0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f36960x0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f36960x0 = null;
            }
        }
        return this.f36956t0;
    }

    @Override
    public final void requestLayout() {
        if (this.f36961y0) {
            return;
        }
        super.requestLayout();
    }
}
