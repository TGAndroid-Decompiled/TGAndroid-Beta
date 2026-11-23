package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
public abstract class kl0 extends HorizontalScrollView {
    public boolean f36894a;
    public LinearLayout f36895b;
    public ValueAnimator f36896c;
    public boolean d;
    public int f36897e;
    public ValueAnimator f36898f;

    public kl0(Context context) {
        super(context);
        this.f36897e = -1;
    }

    public final void a(int i7) {
        if (this.f36897e != i7) {
            this.f36897e = i7;
            ValueAnimator valueAnimator = this.f36898f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i7) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i7);
            this.f36898f = ofFloat;
            ofFloat.addUpdateListener(new h60(this, 15));
            this.f36898f.setInterpolator(nr.h);
            this.f36898f.setDuration(250L);
            this.f36898f.addListener(new s60(this, 16));
            this.f36898f.start();
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
        p5 p5Var;
        fi.s2 s2Var;
        oh0 oh0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f36895b.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.f36895b.getChildAt(i7);
            if (childAt instanceof jv) {
                jv jvVar = (jv) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f36896c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!jvVar.E && z10 && (oh0Var = jvVar.f36657e) != null && !oh0Var.f38188l0 && !z11) {
                    jvVar.f36657e.T(true, 0.0f);
                    jvVar.f36657e.start();
                }
                if (jvVar.E != z10) {
                    jvVar.E = z10;
                    if (z10) {
                        jvVar.invalidate();
                        ug.b1 b1Var = jvVar.f36658f;
                        if (b1Var != null) {
                            b1Var.invalidate();
                        }
                        ug.b1 b1Var2 = jvVar.f36658f;
                        if (b1Var2 != null && (p5Var = jvVar.f36663x) != null && (s2Var = p5Var.f38457k) != null) {
                            b1Var2.setImageReceiver(s2Var);
                        }
                        q9 q9Var = jvVar.d;
                        if (q9Var != null) {
                            q9Var.invalidate();
                        }
                    } else {
                        jvVar.b();
                    }
                    jvVar.c();
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
        if ((Math.abs(i10 - i12) < 2 || i10 >= getMeasuredHeight() || i10 == 0) && !this.f36894a) {
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
