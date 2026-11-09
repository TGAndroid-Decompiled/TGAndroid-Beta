package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
public abstract class wk0 extends HorizontalScrollView {
    public boolean f40096a;
    public LinearLayout f40097b;
    public ValueAnimator f40098c;
    public boolean d;
    public int f40099e;
    public ValueAnimator f40100f;

    public wk0(Context context) {
        super(context);
        this.f40099e = -1;
    }

    public final void a(int i7) {
        if (this.f40099e != i7) {
            this.f40099e = i7;
            ValueAnimator valueAnimator = this.f40100f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i7) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i7);
            this.f40100f = ofFloat;
            ofFloat.addUpdateListener(new d60(this, 13));
            this.f40100f.setInterpolator(xq.h);
            this.f40100f.setDuration(250L);
            this.f40100f.addListener(new f60(this, 16));
            this.f40100f.start();
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
        ah0 ah0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f40097b.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.f40097b.getChildAt(i7);
            if (childAt instanceof xu) {
                xu xuVar = (xu) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (this.d && ((valueAnimator = this.f40098c) == null || !valueAnimator.isRunning())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!xuVar.D && z9 && (ah0Var = xuVar.f40502e) != null && !ah0Var.f31834k0 && !z10) {
                    xuVar.f40502e.T(true, 0.0f);
                    xuVar.f40502e.start();
                }
                if (xuVar.D != z9) {
                    xuVar.D = z9;
                    if (z9) {
                        xuVar.invalidate();
                        ug.z0 z0Var = xuVar.f40503f;
                        if (z0Var != null) {
                            z0Var.invalidate();
                        }
                        ug.z0 z0Var2 = xuVar.f40503f;
                        if (z0Var2 != null && (i5Var = xuVar.f40508x) != null && (z2Var = i5Var.f34568k) != null) {
                            z0Var2.setImageReceiver(z2Var);
                        }
                        l9 l9Var = xuVar.d;
                        if (l9Var != null) {
                            l9Var.invalidate();
                        }
                    } else {
                        xuVar.b();
                    }
                    xuVar.c();
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
        if ((Math.abs(i10 - i12) < 2 || i10 >= getMeasuredHeight() || i10 == 0) && !this.f40096a) {
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
