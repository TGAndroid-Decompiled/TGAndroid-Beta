package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
public abstract class il0 extends HorizontalScrollView {
    public boolean f36143a;
    public LinearLayout f36144b;
    public ValueAnimator f36145c;
    public boolean d;
    public int f36146e;
    public ValueAnimator f36147f;

    public il0(Context context) {
        super(context);
        this.f36146e = -1;
    }

    public final void a(int i7) {
        if (this.f36146e != i7) {
            this.f36146e = i7;
            ValueAnimator valueAnimator = this.f36147f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i7) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i7);
            this.f36147f = ofFloat;
            ofFloat.addUpdateListener(new e60(this, 15));
            this.f36147f.setInterpolator(lr.h);
            this.f36147f.setDuration(250L);
            this.f36147f.addListener(new q60(this, 16));
            this.f36147f.start();
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
        o5 o5Var;
        fi.s2 s2Var;
        mh0 mh0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f36144b.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.f36144b.getChildAt(i7);
            if (childAt instanceof hv) {
                hv hvVar = (hv) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f36145c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!hvVar.E && z10 && (mh0Var = hvVar.f35988e) != null && !mh0Var.f37495l0 && !z11) {
                    hvVar.f35988e.T(true, 0.0f);
                    hvVar.f35988e.start();
                }
                if (hvVar.E != z10) {
                    hvVar.E = z10;
                    if (z10) {
                        hvVar.invalidate();
                        ug.c1 c1Var = hvVar.f35989f;
                        if (c1Var != null) {
                            c1Var.invalidate();
                        }
                        ug.c1 c1Var2 = hvVar.f35989f;
                        if (c1Var2 != null && (o5Var = hvVar.f35994x) != null && (s2Var = o5Var.f37976k) != null) {
                            c1Var2.setImageReceiver(s2Var);
                        }
                        q9 q9Var = hvVar.d;
                        if (q9Var != null) {
                            q9Var.invalidate();
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
        if ((Math.abs(i10 - i12) < 2 || i10 >= getMeasuredHeight() || i10 == 0) && !this.f36143a) {
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
