package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
public abstract class vk0 extends HorizontalScrollView {
    public boolean f38970a;
    public LinearLayout f38971b;
    public ValueAnimator f38972c;
    public boolean d;
    public int f38973e;
    public ValueAnimator f38974f;

    public vk0(Context context) {
        super(context);
        this.f38973e = -1;
    }

    public final void a(int i7) {
        if (this.f38973e != i7) {
            this.f38973e = i7;
            ValueAnimator valueAnimator = this.f38974f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i7) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i7);
            this.f38974f = ofFloat;
            ofFloat.addUpdateListener(new c60(this, 13));
            this.f38974f.setInterpolator(xq.h);
            this.f38974f.setDuration(250L);
            this.f38974f.addListener(new e60(this, 16));
            this.f38974f.start();
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
            a(c8.j9.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z9;
        boolean z10;
        i5 i5Var;
        di.z2 z2Var;
        zg0 zg0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f38971b.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.f38971b.getChildAt(i7);
            if (childAt instanceof wu) {
                wu wuVar = (wu) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (this.d && ((valueAnimator = this.f38972c) == null || !valueAnimator.isRunning())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!wuVar.D && z9 && (zg0Var = wuVar.f40095e) != null && !zg0Var.f40964k0 && !z10) {
                    wuVar.f40095e.T(true, 0.0f);
                    wuVar.f40095e.start();
                }
                if (wuVar.D != z9) {
                    wuVar.D = z9;
                    if (z9) {
                        wuVar.invalidate();
                        ug.z0 z0Var = wuVar.f40096f;
                        if (z0Var != null) {
                            z0Var.invalidate();
                        }
                        ug.z0 z0Var2 = wuVar.f40096f;
                        if (z0Var2 != null && (i5Var = wuVar.f40101x) != null && (z2Var = i5Var.f34450k) != null) {
                            z0Var2.setImageReceiver(z2Var);
                        }
                        l9 l9Var = wuVar.d;
                        if (l9Var != null) {
                            l9Var.invalidate();
                        }
                    } else {
                        wuVar.b();
                    }
                    wuVar.c();
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        c();
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        if ((Math.abs(i10 - i12) < 2 || i10 >= getMeasuredHeight() || i10 == 0) && !this.f38970a) {
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
