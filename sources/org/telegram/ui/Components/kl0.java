package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
public abstract class kl0 extends HorizontalScrollView {
    public boolean f36925a;
    public LinearLayout f36926b;
    public ValueAnimator f36927c;
    public boolean d;
    public int f36928e;
    public ValueAnimator f36929f;

    public kl0(Context context) {
        super(context);
        this.f36928e = -1;
    }

    public final void a(int i7) {
        if (this.f36928e != i7) {
            this.f36928e = i7;
            ValueAnimator valueAnimator = this.f36929f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i7) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i7);
            this.f36929f = ofFloat;
            ofFloat.addUpdateListener(new h60(this, 15));
            this.f36929f.setInterpolator(nr.h);
            this.f36929f.setDuration(250L);
            this.f36929f.addListener(new s60(this, 16));
            this.f36929f.start();
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
            a(c8.l9.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        p5 p5Var;
        fi.s2 s2Var;
        oh0 oh0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f36926b.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.f36926b.getChildAt(i7);
            if (childAt instanceof kv) {
                kv kvVar = (kv) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f36927c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!kvVar.E && z10 && (oh0Var = kvVar.f36992e) != null && !oh0Var.f38226l0 && !z11) {
                    kvVar.f36992e.T(true, 0.0f);
                    kvVar.f36992e.start();
                }
                if (kvVar.E != z10) {
                    kvVar.E = z10;
                    if (z10) {
                        kvVar.invalidate();
                        ug.b1 b1Var = kvVar.f36993f;
                        if (b1Var != null) {
                            b1Var.invalidate();
                        }
                        ug.b1 b1Var2 = kvVar.f36993f;
                        if (b1Var2 != null && (p5Var = kvVar.f36998x) != null && (s2Var = p5Var.f38501k) != null) {
                            b1Var2.setImageReceiver(s2Var);
                        }
                        q9 q9Var = kvVar.d;
                        if (q9Var != null) {
                            q9Var.invalidate();
                        }
                    } else {
                        kvVar.b();
                    }
                    kvVar.c();
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
        if ((Math.abs(i10 - i12) < 2 || i10 >= getMeasuredHeight() || i10 == 0) && !this.f36925a) {
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
