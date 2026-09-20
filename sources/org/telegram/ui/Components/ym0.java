package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class ym0 extends HorizontalScrollView {
    public boolean f30583a;
    public LinearLayout f30584b;
    public ValueAnimator f30585c;
    public boolean d;
    public int e;
    public ValueAnimator f30586f;

    public ym0(Context context) {
        super(context);
        this.e = -1;
    }

    public final void a(int i10) {
        if (this.e != i10) {
            this.e = i10;
            ValueAnimator valueAnimator = this.f30586f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f30586f = ofFloat;
            ofFloat.addUpdateListener(new p70(this, 14));
            this.f30586f.setInterpolator(qr.h);
            this.f30586f.setDuration(250L);
            this.f30586f.addListener(new dd0(this, 10));
            this.f30586f.start();
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
        ai.l4 l4Var;
        hj0 hj0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f30584b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f30584b.getChildAt(i10);
            if (childAt instanceof zv) {
                zv zvVar = (zv) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f30585c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!zvVar.f30949y && z10 && (hj0Var = zvVar.e) != null && !hj0Var.f24691k0 && !z11) {
                    zvVar.e.T(0.0f, true);
                    zvVar.e.start();
                }
                if (zvVar.f30949y != z10) {
                    zvVar.f30949y = z10;
                    if (z10) {
                        zvVar.invalidate();
                        rg.b1 b1Var = zvVar.f30943f;
                        if (b1Var != null) {
                            b1Var.invalidate();
                        }
                        rg.b1 b1Var2 = zvVar.f30943f;
                        if (b1Var2 != null && (p5Var = zvVar.f30947w) != null && (l4Var = p5Var.f27162k) != null) {
                            b1Var2.setImageReceiver(l4Var);
                        }
                        v9 v9Var = zvVar.d;
                        if (v9Var != null) {
                            v9Var.invalidate();
                        }
                    } else {
                        zvVar.b();
                    }
                    zvVar.c();
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
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f30583a) {
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
