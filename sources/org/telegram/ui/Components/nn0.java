package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class nn0 extends HorizontalScrollView {
    public boolean f28978a;
    public LinearLayout f28979b;
    public ValueAnimator f28980c;
    public boolean d;
    public int e;
    public ValueAnimator f28981f;

    public nn0(Context context) {
        super(context);
        this.e = -1;
    }

    public final void a(int i10) {
        if (this.e != i10) {
            this.e = i10;
            ValueAnimator valueAnimator = this.f28981f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f28981f = ofFloat;
            ofFloat.addUpdateListener(new b80(this, 15));
            this.f28981f.setInterpolator(zr.h);
            this.f28981f.setDuration(250L);
            this.f28981f.addListener(new g60(this, 16));
            this.f28981f.start();
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
        p5 p5Var;
        ci.f3 f3Var;
        xj0 xj0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f28979b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f28979b.getChildAt(i10);
            if (childAt instanceof ew) {
                ew ewVar = (ew) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f28980c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!ewVar.f26131y && z10 && (xj0Var = ewVar.e) != null && !xj0Var.f32607k0 && !z11) {
                    ewVar.e.T(0.0f, true);
                    ewVar.e.start();
                }
                if (ewVar.f26131y != z10) {
                    ewVar.f26131y = z10;
                    if (z10) {
                        ewVar.invalidate();
                        sg.c1 c1Var = ewVar.f26125f;
                        if (c1Var != null) {
                            c1Var.invalidate();
                        }
                        sg.c1 c1Var2 = ewVar.f26125f;
                        if (c1Var2 != null && (p5Var = ewVar.f26129w) != null && (f3Var = p5Var.f29484k) != null) {
                            c1Var2.setImageReceiver(f3Var);
                        }
                        u9 u9Var = ewVar.d;
                        if (u9Var != null) {
                            u9Var.invalidate();
                        }
                    } else {
                        ewVar.b();
                    }
                    ewVar.c();
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
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f28978a) {
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
