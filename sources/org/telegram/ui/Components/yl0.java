package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
public abstract class yl0 extends HorizontalScrollView {
    public boolean f32757a;
    public LinearLayout f32758b;
    public ValueAnimator f32759c;
    public boolean d;
    public int e;
    public ValueAnimator f32760f;

    public yl0(Context context) {
        super(context);
        this.e = -1;
    }

    public final void a(int i10) {
        if (this.e != i10) {
            this.e = i10;
            ValueAnimator valueAnimator = this.f32760f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f32760f = ofFloat;
            ofFloat.addUpdateListener(new r60(this, 14));
            this.f32760f.setInterpolator(gr.h);
            this.f32760f.setDuration(250L);
            this.f32760f.addListener(new t60(this, 16));
            this.f32760f.start();
        }
    }

    public final void b(int i10, int i11) {
        int measuredWidth;
        if (getChildCount() > 0) {
            int L = org.telegram.messenger.i0.L(50.0f);
            if (i10 < getScrollX() + L) {
                measuredWidth = i10 - L;
            } else {
                if (i11 > (getMeasuredWidth() - L) + getScrollX()) {
                    measuredWidth = (i11 - getMeasuredWidth()) + L;
                } else {
                    return;
                }
            }
            a(w7.u.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        f5 f5Var;
        ag.c2 c2Var;
        bi0 bi0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f32758b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f32758b.getChildAt(i10);
            if (childAt instanceof iv) {
                iv ivVar = (iv) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f32759c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!ivVar.D && z10 && (bi0Var = ivVar.e) != null && !bi0Var.f24765k0 && !z11) {
                    ivVar.e.T(true, 0.0f);
                    ivVar.e.start();
                }
                if (ivVar.D != z10) {
                    ivVar.D = z10;
                    if (z10) {
                        ivVar.invalidate();
                        kg.l1 l1Var = ivVar.f27098f;
                        if (l1Var != null) {
                            l1Var.invalidate();
                        }
                        kg.l1 l1Var2 = ivVar.f27098f;
                        if (l1Var2 != null && (f5Var = ivVar.f27103x) != null && (c2Var = f5Var.f25975k) != null) {
                            l1Var2.setImageReceiver(c2Var);
                        }
                        g9 g9Var = ivVar.d;
                        if (g9Var != null) {
                            g9Var.invalidate();
                        }
                    } else {
                        ivVar.b();
                    }
                    ivVar.c();
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c();
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f32757a) {
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
