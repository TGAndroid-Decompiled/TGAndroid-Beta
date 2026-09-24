package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class ym0 extends HorizontalScrollView {
    public boolean f30639a;
    public LinearLayout f30640b;
    public ValueAnimator f30641c;
    public boolean d;
    public int e;
    public ValueAnimator f30642f;

    public ym0(Context context) {
        super(context);
        this.e = -1;
    }

    public final void a(int i10) {
        if (this.e != i10) {
            this.e = i10;
            ValueAnimator valueAnimator = this.f30642f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f30642f = ofFloat;
            ofFloat.addUpdateListener(new s70(this, 14));
            this.f30642f.setInterpolator(rr.h);
            this.f30642f.setDuration(250L);
            this.f30642f.addListener(new fd0(this, 10));
            this.f30642f.start();
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
        q5 q5Var;
        ai.l4 l4Var;
        ij0 ij0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f30640b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f30640b.getChildAt(i10);
            if (childAt instanceof aw) {
                aw awVar = (aw) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f30641c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!awVar.f22775y && z10 && (ij0Var = awVar.e) != null && !ij0Var.f25055k0 && !z11) {
                    awVar.e.T(0.0f, true);
                    awVar.e.start();
                }
                if (awVar.f22775y != z10) {
                    awVar.f22775y = z10;
                    if (z10) {
                        awVar.invalidate();
                        rg.b1 b1Var = awVar.f22769f;
                        if (b1Var != null) {
                            b1Var.invalidate();
                        }
                        rg.b1 b1Var2 = awVar.f22769f;
                        if (b1Var2 != null && (q5Var = awVar.f22773w) != null && (l4Var = q5Var.f27498k) != null) {
                            b1Var2.setImageReceiver(l4Var);
                        }
                        w9 w9Var = awVar.d;
                        if (w9Var != null) {
                            w9Var.invalidate();
                        }
                    } else {
                        awVar.b();
                    }
                    awVar.c();
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
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f30639a) {
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
