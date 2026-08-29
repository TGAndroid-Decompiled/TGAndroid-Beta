package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class km0 extends HorizontalScrollView {
    public boolean f30107a;
    public LinearLayout f30108b;
    public ValueAnimator f30109c;
    public boolean d;
    public int f30110e;
    public ValueAnimator f30111f;

    public km0(Context context) {
        super(context);
        this.f30110e = -1;
    }

    public final void a(int i10) {
        if (this.f30110e != i10) {
            this.f30110e = i10;
            ValueAnimator valueAnimator = this.f30111f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f30111f = ofFloat;
            ofFloat.addUpdateListener(new d70(this, 14));
            this.f30111f.setInterpolator(jr.h);
            this.f30111f.setDuration(250L);
            this.f30111f.addListener(new zz(this, 17));
            this.f30111f.start();
        }
    }

    public final void b(int i10, int i11) {
        int measuredWidth;
        if (getChildCount() > 0) {
            int dp = AndroidUtilities.dp(50.0f);
            if (i10 < getScrollX() + dp) {
                measuredWidth = i10 - dp;
            } else {
                if (i11 > (getMeasuredWidth() - dp) + getScrollX()) {
                    measuredWidth = (i11 - getMeasuredWidth()) + dp;
                } else {
                    return;
                }
            }
            a(i7.w.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        p5 p5Var;
        lh.x2 x2Var;
        xi0 xi0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f30108b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f30108b.getChildAt(i10);
            if (childAt instanceof pv) {
                pv pvVar = (pv) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f30109c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!pvVar.f31787y && z10 && (xi0Var = pvVar.f31780e) != null && !xi0Var.f34742h0 && !z11) {
                    pvVar.f31780e.Q(0.0f, true);
                    pvVar.f31780e.start();
                }
                if (pvVar.f31787y != z10) {
                    pvVar.f31787y = z10;
                    if (z10) {
                        pvVar.invalidate();
                        cg.t1 t1Var = pvVar.f31781f;
                        if (t1Var != null) {
                            t1Var.invalidate();
                        }
                        cg.t1 t1Var2 = pvVar.f31781f;
                        if (t1Var2 != null && (p5Var = pvVar.f31785w) != null && (x2Var = p5Var.f31593k) != null) {
                            t1Var2.setImageReceiver(x2Var);
                        }
                        t9 t9Var = pvVar.d;
                        if (t9Var != null) {
                            t9Var.invalidate();
                        }
                    } else {
                        pvVar.b();
                    }
                    pvVar.c();
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
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f30107a) {
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
