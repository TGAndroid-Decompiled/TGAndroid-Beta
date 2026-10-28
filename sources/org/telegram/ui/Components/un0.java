package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class un0 extends HorizontalScrollView {
    public boolean f33434a;
    public LinearLayout f33435b;
    public ValueAnimator f33436c;
    public boolean d;
    public int e;
    public ValueAnimator f33437f;

    public un0(Context context) {
        super(context);
        this.e = -1;
    }

    public final void a(int i10) {
        if (this.e != i10) {
            this.e = i10;
            ValueAnimator valueAnimator = this.f33437f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f33437f = ofFloat;
            ofFloat.addUpdateListener(new f80(this, 15));
            this.f33437f.setInterpolator(ds.h);
            this.f33437f.setDuration(250L);
            this.f33437f.addListener(new i10(this, 17));
            this.f33437f.start();
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
            a(a8.ee.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        t5 t5Var;
        di.f3 f3Var;
        yj0 yj0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f33435b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f33435b.getChildAt(i10);
            if (childAt instanceof gw) {
                gw gwVar = (gw) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f33436c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!gwVar.f28772y && z10 && (yj0Var = gwVar.e) != null && !yj0Var.f35080k0 && !z11) {
                    gwVar.e.T(0.0f, true);
                    gwVar.e.start();
                }
                if (gwVar.f28772y != z10) {
                    gwVar.f28772y = z10;
                    if (z10) {
                        gwVar.invalidate();
                        tg.c1 c1Var = gwVar.f28766f;
                        if (c1Var != null) {
                            c1Var.invalidate();
                        }
                        tg.c1 c1Var2 = gwVar.f28766f;
                        if (c1Var2 != null && (t5Var = gwVar.f28770w) != null && (f3Var = t5Var.f32860k) != null) {
                            c1Var2.setImageReceiver(f3Var);
                        }
                        y9 y9Var = gwVar.d;
                        if (y9Var != null) {
                            y9Var.invalidate();
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
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f33434a) {
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
