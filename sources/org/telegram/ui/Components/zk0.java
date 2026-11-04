package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
public abstract class zk0 extends HorizontalScrollView {
    public boolean f41057a;
    public LinearLayout f41058b;
    public ValueAnimator f41059c;
    public boolean d;
    public int f41060e;
    public ValueAnimator f41061f;

    public zk0(Context context) {
        super(context);
        this.f41060e = -1;
    }

    public final void a(int i3) {
        if (this.f41060e != i3) {
            this.f41060e = i3;
            ValueAnimator valueAnimator = this.f41061f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i3) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i3);
            this.f41061f = ofFloat;
            ofFloat.addUpdateListener(new y50(this, 14));
            this.f41061f.setInterpolator(xq.h);
            this.f41061f.setDuration(250L);
            this.f41061f.addListener(new a60(this, 16));
            this.f41061f.start();
        }
    }

    public final void b(int i3, int i10) {
        int measuredWidth;
        if (getChildCount() > 0) {
            int L = org.telegram.messenger.g0.L(50.0f);
            if (i3 < getScrollX() + L) {
                measuredWidth = i3 - L;
            } else {
                if (i10 > (getMeasuredWidth() - L) + getScrollX()) {
                    measuredWidth = (i10 - getMeasuredWidth()) + L;
                } else {
                    return;
                }
            }
            a(b8.be.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        g5 g5Var;
        ei.c3 c3Var;
        ch0 ch0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f41058b.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f41058b.getChildAt(i3);
            if (childAt instanceof vu) {
                vu vuVar = (vu) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f41059c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!vuVar.E && z10 && (ch0Var = vuVar.f39798e) != null && !ch0Var.f32734l0 && !z11) {
                    vuVar.f39798e.T(true, 0.0f);
                    vuVar.f39798e.start();
                }
                if (vuVar.E != z10) {
                    vuVar.E = z10;
                    if (z10) {
                        vuVar.invalidate();
                        vg.y0 y0Var = vuVar.f39799f;
                        if (y0Var != null) {
                            y0Var.invalidate();
                        }
                        vg.y0 y0Var2 = vuVar.f39799f;
                        if (y0Var2 != null && (g5Var = vuVar.f39804x) != null && (c3Var = g5Var.f33971k) != null) {
                            y0Var2.setImageReceiver(c3Var);
                        }
                        k9 k9Var = vuVar.d;
                        if (k9Var != null) {
                            k9Var.invalidate();
                        }
                    } else {
                        vuVar.b();
                    }
                    vuVar.c();
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        c();
    }

    @Override
    public final void onScrollChanged(int i3, int i10, int i11, int i12) {
        super.onScrollChanged(i3, i10, i11, i12);
        if ((Math.abs(i10 - i12) < 2 || i10 >= getMeasuredHeight() || i10 == 0) && !this.f41057a) {
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
