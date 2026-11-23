package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
public abstract class kl0 extends HorizontalScrollView {
    public boolean f36803a;
    public LinearLayout f36804b;
    public ValueAnimator f36805c;
    public boolean d;
    public int f36806e;
    public ValueAnimator f36807f;

    public kl0(Context context) {
        super(context);
        this.f36806e = -1;
    }

    public final void a(int i7) {
        if (this.f36806e != i7) {
            this.f36806e = i7;
            ValueAnimator valueAnimator = this.f36807f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i7) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i7);
            this.f36807f = ofFloat;
            ofFloat.addUpdateListener(new e60(this, 15));
            this.f36807f.setInterpolator(kr.h);
            this.f36807f.setDuration(250L);
            this.f36807f.addListener(new p60(this, 16));
            this.f36807f.start();
        }
    }

    public final void b(int i7, int i10) {
        int measuredWidth;
        if (getChildCount() > 0) {
            int L = org.telegram.messenger.g0.L(50.0f);
            if (i7 < getScrollX() + L) {
                measuredWidth = i7 - L;
            } else {
                if (i10 > (getMeasuredWidth() - L) + getScrollX()) {
                    measuredWidth = (i10 - getMeasuredWidth()) + L;
                } else {
                    return;
                }
            }
            a(c8.m9.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        o5 o5Var;
        fi.s2 s2Var;
        nh0 nh0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f36804b.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.f36804b.getChildAt(i7);
            if (childAt instanceof hv) {
                hv hvVar = (hv) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f36805c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!hvVar.E && z10 && (nh0Var = hvVar.f35834e) != null && !nh0Var.f37814l0 && !z11) {
                    hvVar.f35834e.T(true, 0.0f);
                    hvVar.f35834e.start();
                }
                if (hvVar.E != z10) {
                    hvVar.E = z10;
                    if (z10) {
                        hvVar.invalidate();
                        ug.b1 b1Var = hvVar.f35835f;
                        if (b1Var != null) {
                            b1Var.invalidate();
                        }
                        ug.b1 b1Var2 = hvVar.f35835f;
                        if (b1Var2 != null && (o5Var = hvVar.f35840x) != null && (s2Var = o5Var.f38028k) != null) {
                            b1Var2.setImageReceiver(s2Var);
                        }
                        p9 p9Var = hvVar.d;
                        if (p9Var != null) {
                            p9Var.invalidate();
                        }
                    } else {
                        hvVar.b();
                    }
                    hvVar.c();
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        c();
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        if ((Math.abs(i10 - i12) < 2 || i10 >= getMeasuredHeight() || i10 == 0) && !this.f36803a) {
            requestDisallowInterceptTouchEvent(false);
        }
        c();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 1) {
            motionEvent.getAction();
        }
        return super.onTouchEvent(motionEvent);
    }
}
