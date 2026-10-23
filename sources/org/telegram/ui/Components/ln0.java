package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class ln0 extends HorizontalScrollView {
    public boolean f28234a;
    public LinearLayout f28235b;
    public ValueAnimator f28236c;
    public boolean d;
    public int e;
    public ValueAnimator f28237f;

    public ln0(Context context) {
        super(context);
        this.e = -1;
    }

    public final void a(int i10) {
        if (this.e != i10) {
            this.e = i10;
            ValueAnimator valueAnimator = this.f28237f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f28237f = ofFloat;
            ofFloat.addUpdateListener(new b80(this, 15));
            this.f28237f.setInterpolator(bs.h);
            this.f28237f.setDuration(250L);
            this.f28237f.addListener(new c80(this, 15));
            this.f28237f.start();
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
            a(w7.r.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        r5 r5Var;
        ci.g3 g3Var;
        vj0 vj0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f28235b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f28235b.getChildAt(i10);
            if (childAt instanceof gw) {
                gw gwVar = (gw) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f28236c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!gwVar.f26686y && z10 && (vj0Var = gwVar.e) != null && !vj0Var.f31282k0 && !z11) {
                    gwVar.e.T(0.0f, true);
                    gwVar.e.start();
                }
                if (gwVar.f26686y != z10) {
                    gwVar.f26686y = z10;
                    if (z10) {
                        gwVar.invalidate();
                        sg.c1 c1Var = gwVar.f26680f;
                        if (c1Var != null) {
                            c1Var.invalidate();
                        }
                        sg.c1 c1Var2 = gwVar.f26680f;
                        if (c1Var2 != null && (r5Var = gwVar.f26684w) != null && (g3Var = r5Var.f29842k) != null) {
                            c1Var2.setImageReceiver(g3Var);
                        }
                        w9 w9Var = gwVar.d;
                        if (w9Var != null) {
                            w9Var.invalidate();
                        }
                    } else {
                        gwVar.b();
                    }
                    gwVar.c();
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
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f28234a) {
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
