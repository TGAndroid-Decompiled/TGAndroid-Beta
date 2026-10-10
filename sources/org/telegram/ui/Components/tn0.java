package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class tn0 extends HorizontalScrollView {
    public boolean f31186a;
    public LinearLayout f31187b;
    public ValueAnimator f31188c;
    public boolean d;
    public int f31189e;
    public ValueAnimator f31190f;

    public tn0(Context context) {
        super(context);
        this.f31189e = -1;
    }

    public final void a(int i10) {
        if (this.f31189e != i10) {
            this.f31189e = i10;
            ValueAnimator valueAnimator = this.f31190f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f31190f = ofFloat;
            ofFloat.addUpdateListener(new k80(this, 15));
            this.f31190f.setInterpolator(is.h);
            this.f31190f.setDuration(250L);
            this.f31190f.addListener(new wd0(this, 10));
            this.f31190f.start();
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
            a(w7.o.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        s5 s5Var;
        ai.m4 m4Var;
        dk0 dk0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f31187b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f31187b.getChildAt(i10);
            if (childAt instanceof pw) {
                pw pwVar = (pw) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f31188c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!pwVar.f29880y && z10 && (dk0Var = pwVar.f29873e) != null && !dk0Var.f25740k0 && !z11) {
                    pwVar.f29873e.T(0.0f, true);
                    pwVar.f29873e.start();
                }
                if (pwVar.f29880y != z10) {
                    pwVar.f29880y = z10;
                    if (z10) {
                        pwVar.invalidate();
                        rg.c1 c1Var = pwVar.f29874f;
                        if (c1Var != null) {
                            c1Var.invalidate();
                        }
                        rg.c1 c1Var2 = pwVar.f29874f;
                        if (c1Var2 != null && (s5Var = pwVar.f29878w) != null && (m4Var = s5Var.f30680k) != null) {
                            c1Var2.setImageReceiver(m4Var);
                        }
                        y9 y9Var = pwVar.d;
                        if (y9Var != null) {
                            y9Var.invalidate();
                        }
                    } else {
                        pwVar.b();
                    }
                    pwVar.c();
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
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f31186a) {
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
