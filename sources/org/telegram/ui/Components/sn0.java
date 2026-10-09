package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class sn0 extends HorizontalScrollView {
    public boolean f30855a;
    public LinearLayout f30856b;
    public ValueAnimator f30857c;
    public boolean d;
    public int f30858e;
    public ValueAnimator f30859f;

    public sn0(Context context) {
        super(context);
        this.f30858e = -1;
    }

    public final void a(int i10) {
        if (this.f30858e != i10) {
            this.f30858e = i10;
            ValueAnimator valueAnimator = this.f30859f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f30859f = ofFloat;
            ofFloat.addUpdateListener(new j80(this, 15));
            this.f30859f.setInterpolator(hs.h);
            this.f30859f.setDuration(250L);
            this.f30859f.addListener(new vd0(this, 10));
            this.f30859f.start();
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
        ck0 ck0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f30856b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f30856b.getChildAt(i10);
            if (childAt instanceof ow) {
                ow owVar = (ow) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f30857c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!owVar.f29593y && z10 && (ck0Var = owVar.f29586e) != null && !ck0Var.f25409k0 && !z11) {
                    owVar.f29586e.T(0.0f, true);
                    owVar.f29586e.start();
                }
                if (owVar.f29593y != z10) {
                    owVar.f29593y = z10;
                    if (z10) {
                        owVar.invalidate();
                        rg.c1 c1Var = owVar.f29587f;
                        if (c1Var != null) {
                            c1Var.invalidate();
                        }
                        rg.c1 c1Var2 = owVar.f29587f;
                        if (c1Var2 != null && (s5Var = owVar.f29591w) != null && (m4Var = s5Var.f30654k) != null) {
                            c1Var2.setImageReceiver(m4Var);
                        }
                        y9 y9Var = owVar.d;
                        if (y9Var != null) {
                            y9Var.invalidate();
                        }
                    } else {
                        owVar.b();
                    }
                    owVar.c();
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
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f30855a) {
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
