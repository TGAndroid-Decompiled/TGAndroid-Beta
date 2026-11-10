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
    public int f44132a;
    public boolean f44133b;
    public boolean f44134c;
    public int d;
    public int f44135e;
    public VelocityTracker f44136f;
    public boolean h;
    public final du f44137n;

    public bu(du duVar, Context context) {
        super(context);
        this.f44137n = duVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bu.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z9) {
        int i7;
        org.telegram.ui.ActionBar.l lVar;
        du duVar = this.f44137n;
        cu[] cuVarArr = duVar.f45054f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = duVar.f45053e;
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
        this.f44134c = false;
        this.f44133b = true;
        this.d = (int) motionEvent.getX();
        lVar = ((org.telegram.ui.ActionBar.f2) duVar).actionBar;
        lVar.setEnabled(false);
        duVar.f45053e.setEnabled(false);
        cu cuVar = cuVarArr[1];
        cuVar.f44811f = i11;
        cuVar.setVisibility(0);
        duVar.f45056r = z9;
        duVar.r0(true);
        if (z9) {
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        super.dispatchDraw(canvas);
        du duVar = this.f44137n;
        r4Var = ((org.telegram.ui.ActionBar.f2) duVar).parentLayout;
        if (r4Var != null) {
            r4Var2 = ((org.telegram.ui.ActionBar.f2) duVar).parentLayout;
            lVar = ((org.telegram.ui.ActionBar.f2) duVar).actionBar;
            int measuredHeight = lVar.getMeasuredHeight();
            lVar2 = ((org.telegram.ui.ActionBar.f2) duVar).actionBar;
            ((ActionBarLayout) r4Var2).q(canvas, measuredHeight + ((int) lVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        du duVar = this.f44137n;
        Paint paint = duVar.d;
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false));
        lVar = ((org.telegram.ui.ActionBar.f2) duVar).actionBar;
        lVar2 = ((org.telegram.ui.ActionBar.f2) duVar).actionBar;
        canvas.drawRect(0.0f, lVar2.getTranslationY() + lVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f44137n.f45053e.H && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        du duVar = this.f44137n;
        cu[] cuVarArr = duVar.f45054f;
        lVar = ((org.telegram.ui.ActionBar.f2) duVar).actionBar;
        measureChildWithMargins(lVar, i7, 0, i10, 0);
        lVar2 = ((org.telegram.ui.ActionBar.f2) duVar).actionBar;
        int measuredHeight = lVar2.getMeasuredHeight();
        this.h = true;
        for (int i11 = 0; i11 < cuVarArr.length; i11++) {
            cu cuVar = cuVarArr[i11];
            if (cuVar != null) {
                org.telegram.ui.Components.pj0 pj0Var = cuVar.d;
                if (pj0Var != null) {
                    pj0Var.setPadding(0, measuredHeight, 0, 0);
                }
                bi.q1 q1Var = cuVarArr[i11].f44810e;
                if (q1Var != null) {
                    q1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar3 = ((org.telegram.ui.ActionBar.f2) duVar).actionBar;
                if (childAt != lVar3) {
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
        org.telegram.ui.ActionBar.l lVar;
        boolean z9;
        float measuredWidth;
        cu cuVar;
        cu cuVar2;
        int measuredWidth2;
        cu cuVar3;
        cu cuVar4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        du duVar = this.f44137n;
        cu[] cuVarArr = duVar.f45054f;
        r4Var = ((org.telegram.ui.ActionBar.f2) duVar).parentLayout;
        boolean z13 = false;
        if (((ActionBarLayout) r4Var).i() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f44136f == null) {
                this.f44136f = VelocityTracker.obtain();
            }
            this.f44136f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f44133b && !this.f44134c) {
            this.f44132a = motionEvent.getPointerId(0);
            this.f44134c = true;
            this.d = (int) motionEvent.getX();
            this.f44135e = (int) motionEvent.getY();
            this.f44136f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f44132a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f44135e);
            if (this.f44133b && (((z11 = duVar.f45056r) && x10 > 0) || (!z11 && x10 < 0))) {
                if (x10 < 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!b(motionEvent, z12)) {
                    this.f44134c = true;
                    this.f44133b = false;
                    cuVarArr[0].setTranslationX(0.0f);
                    cu cuVar5 = cuVarArr[1];
                    if (duVar.f45056r) {
                        i7 = cuVarArr[0].getMeasuredWidth();
                    } else {
                        i7 = -cuVarArr[0].getMeasuredWidth();
                    }
                    cuVar5.setTranslationX(i7);
                    duVar.f45053e.i(0.0f, cuVarArr[1].f44811f);
                }
            }
            if (this.f44134c && !this.f44133b) {
                if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z13 = true;
                    }
                    b(motionEvent, z13);
                }
            } else if (this.f44133b) {
                cuVarArr[0].setTranslationX(x10);
                if (duVar.f45056r) {
                    cuVarArr[1].setTranslationX(cuVarArr[0].getMeasuredWidth() + x10);
                } else {
                    cuVarArr[1].setTranslationX(x10 - cuVarArr[0].getMeasuredWidth());
                }
                duVar.f45053e.i(Math.abs(x10) / cuVarArr[0].getMeasuredWidth(), cuVarArr[1].f44811f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f44132a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f44136f.computeCurrentVelocity(1000, duVar.f45058w);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f44136f.getXVelocity();
                f11 = this.f44136f.getYVelocity();
                if (!this.f44133b && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    if (f10 < 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b(motionEvent, z10);
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (this.f44133b) {
                float x11 = cuVarArr[0].getX();
                duVar.h = new AnimatorSet();
                if (Math.abs(x11) < cuVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                duVar.f45057s = z9;
                Property property = View.TRANSLATION_X;
                if (z9) {
                    measuredWidth = Math.abs(x11);
                    if (duVar.f45056r) {
                        duVar.h.playTogether(ObjectAnimator.ofFloat(cuVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(cuVarArr[1], property, cuVar4.getMeasuredWidth()));
                    } else {
                        duVar.h.playTogether(ObjectAnimator.ofFloat(cuVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(cuVarArr[1], property, -cuVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = cuVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (duVar.f45056r) {
                        duVar.h.playTogether(ObjectAnimator.ofFloat(cuVarArr[0], property, -cuVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(cuVarArr[1], property, 0.0f));
                    } else {
                        duVar.h.playTogether(ObjectAnimator.ofFloat(cuVarArr[0], property, cuVar.getMeasuredWidth()), ObjectAnimator.ofFloat(cuVarArr[1], property, 0.0f));
                    }
                }
                duVar.h.setInterpolator(du.f45049y);
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
                duVar.h.addListener(new va(this, 23));
                duVar.h.start();
                duVar.f45055n = true;
                this.f44133b = false;
            } else {
                this.f44134c = false;
                lVar = ((org.telegram.ui.ActionBar.f2) duVar).actionBar;
                lVar.setEnabled(true);
                duVar.f45053e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f44136f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f44136f = null;
            }
        }
        return this.f44133b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
