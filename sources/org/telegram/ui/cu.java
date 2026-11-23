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
public final class cu extends FrameLayout {
    public int f46639a;
    public boolean f46640b;
    public boolean f46641c;
    public int d;
    public int f46642e;
    public VelocityTracker f46643f;
    public boolean h;
    public final eu f46644n;

    public cu(eu euVar, Context context) {
        super(context);
        this.f46644n = euVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cu.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i7;
        org.telegram.ui.ActionBar.k kVar;
        eu euVar = this.f46644n;
        du[] duVarArr = euVar.f47345f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = euVar.f47344e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
        int i10 = scrollSlidingTextTabStrip.f33116n;
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
        this.f46641c = false;
        this.f46640b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.g2) euVar).actionBar;
        kVar.setEnabled(false);
        euVar.f47344e.setEnabled(false);
        du duVar = duVarArr[1];
        duVar.f47017f = i11;
        duVar.setVisibility(0);
        euVar.f47347r = z10;
        euVar.r0(true);
        if (z10) {
            duVarArr[1].setTranslationX(duVarArr[0].getMeasuredWidth());
            return true;
        }
        duVarArr[1].setTranslationX(-duVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        eu euVar = this.f46644n;
        r4Var = ((org.telegram.ui.ActionBar.g2) euVar).parentLayout;
        if (r4Var != null) {
            r4Var2 = ((org.telegram.ui.ActionBar.g2) euVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.g2) euVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.g2) euVar).actionBar;
            ((ActionBarLayout) r4Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        eu euVar = this.f46644n;
        Paint paint = euVar.d;
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29347d6, false));
        kVar = ((org.telegram.ui.ActionBar.g2) euVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.g2) euVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f46644n.f47344e.I && !onTouchEvent(motionEvent)) {
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
        eu euVar = this.f46644n;
        du[] duVarArr = euVar.f47345f;
        kVar = ((org.telegram.ui.ActionBar.g2) euVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.g2) euVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i11 = 0; i11 < duVarArr.length; i11++) {
            du duVar = duVarArr[i11];
            if (duVar != null) {
                org.telegram.ui.Components.ek0 ek0Var = duVar.d;
                if (ek0Var != null) {
                    ek0Var.setPadding(0, measuredHeight, 0, 0);
                }
                di.b1 b1Var = duVarArr[i11].f47016e;
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
                kVar3 = ((org.telegram.ui.ActionBar.g2) euVar).actionBar;
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
        du duVar;
        du duVar2;
        int measuredWidth2;
        du duVar3;
        du duVar4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        eu euVar = this.f46644n;
        du[] duVarArr = euVar.f47345f;
        r4Var = ((org.telegram.ui.ActionBar.g2) euVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) r4Var).i() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f46643f == null) {
                this.f46643f = VelocityTracker.obtain();
            }
            this.f46643f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f46640b && !this.f46641c) {
            this.f46639a = motionEvent.getPointerId(0);
            this.f46641c = true;
            this.d = (int) motionEvent.getX();
            this.f46642e = (int) motionEvent.getY();
            this.f46643f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f46639a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f46642e);
            if (this.f46640b && (((z12 = euVar.f47347r) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f46641c = true;
                    this.f46640b = false;
                    duVarArr[0].setTranslationX(0.0f);
                    du duVar5 = duVarArr[1];
                    if (euVar.f47347r) {
                        i7 = duVarArr[0].getMeasuredWidth();
                    } else {
                        i7 = -duVarArr[0].getMeasuredWidth();
                    }
                    duVar5.setTranslationX(i7);
                    euVar.f47344e.i(0.0f, duVarArr[1].f47017f);
                }
            }
            if (this.f46641c && !this.f46640b) {
                if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f46640b) {
                duVarArr[0].setTranslationX(x10);
                if (euVar.f47347r) {
                    duVarArr[1].setTranslationX(duVarArr[0].getMeasuredWidth() + x10);
                } else {
                    duVarArr[1].setTranslationX(x10 - duVarArr[0].getMeasuredWidth());
                }
                euVar.f47344e.i(Math.abs(x10) / duVarArr[0].getMeasuredWidth(), duVarArr[1].f47017f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f46639a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f46643f.computeCurrentVelocity(1000, euVar.f47349w);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f46643f.getXVelocity();
                f11 = this.f46643f.getYVelocity();
                if (!this.f46640b && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
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
            if (this.f46640b) {
                float x11 = duVarArr[0].getX();
                euVar.h = new AnimatorSet();
                if (Math.abs(x11) < duVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                euVar.f47348s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (euVar.f47347r) {
                        euVar.h.playTogether(ObjectAnimator.ofFloat(duVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(duVarArr[1], property, duVar4.getMeasuredWidth()));
                    } else {
                        euVar.h.playTogether(ObjectAnimator.ofFloat(duVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(duVarArr[1], property, -duVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = duVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (euVar.f47347r) {
                        euVar.h.playTogether(ObjectAnimator.ofFloat(duVarArr[0], property, -duVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(duVarArr[1], property, 0.0f));
                    } else {
                        euVar.h.playTogether(ObjectAnimator.ofFloat(duVarArr[0], property, duVar.getMeasuredWidth()), ObjectAnimator.ofFloat(duVarArr[1], property, 0.0f));
                    }
                }
                euVar.h.setInterpolator(eu.f47340y);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs2 = Math.abs(f10);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                euVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                euVar.h.addListener(new org.telegram.ui.Cells.y9(this, 24));
                euVar.h.start();
                euVar.f47346n = true;
                this.f46640b = false;
            } else {
                this.f46641c = false;
                kVar = ((org.telegram.ui.ActionBar.g2) euVar).actionBar;
                kVar.setEnabled(true);
                euVar.f47344e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f46643f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f46643f = null;
            }
        }
        return this.f46640b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
