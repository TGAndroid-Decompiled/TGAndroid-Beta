package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class wm0 extends HorizontalScrollView {
    public boolean f28801a;
    public LinearLayout f28802b;
    public ValueAnimator f28803c;
    public boolean d;
    public int e;
    public ValueAnimator f28804f;

    public wm0(Context context) {
        super(context);
        this.e = -1;
    }

    public final void a(int i10) {
        if (this.e != i10) {
            this.e = i10;
            ValueAnimator valueAnimator = this.f28804f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f28804f = ofFloat;
            ofFloat.addUpdateListener(new q70(this, 14));
            this.f28804f.setInterpolator(wr.h);
            this.f28804f.setDuration(250L);
            this.f28804f.addListener(new rm(this, 29));
            this.f28804f.start();
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
            a(w7.q.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        p5 p5Var;
        gg.h1 h1Var;
        hj0 hj0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f28802b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f28802b.getChildAt(i10);
            if (childAt instanceof cw) {
                cw cwVar = (cw) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f28803c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!cwVar.f22241y && z10 && (hj0Var = cwVar.e) != null && !hj0Var.f23660l0 && !z11) {
                    cwVar.e.S(0.0f, true);
                    cwVar.e.start();
                }
                if (cwVar.f22241y != z10) {
                    cwVar.f22241y = z10;
                    if (z10) {
                        cwVar.invalidate();
                        qg.e1 e1Var = cwVar.f22235f;
                        if (e1Var != null) {
                            e1Var.invalidate();
                        }
                        qg.e1 e1Var2 = cwVar.f22235f;
                        if (e1Var2 != null && (p5Var = cwVar.f22239w) != null && (h1Var = p5Var.f26033k) != null) {
                            e1Var2.setImageReceiver(h1Var);
                        }
                        w9 w9Var = cwVar.d;
                        if (w9Var != null) {
                            w9Var.invalidate();
                        }
                    } else {
                        cwVar.b();
                    }
                    cwVar.c();
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
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f28801a) {
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
