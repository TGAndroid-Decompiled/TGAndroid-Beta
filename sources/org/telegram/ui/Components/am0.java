package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

public abstract class am0 extends HorizontalScrollView {

    public boolean f26766a;

    public LinearLayout f26767b;

    public ValueAnimator f26768c;
    public boolean d;

    public int f26769e;

    public ValueAnimator f26770f;

    public am0(Context context) {
        super(context);
        this.f26769e = -1;
    }

    public final void a(int i10) {
        if (this.f26769e == i10) {
            return;
        }
        this.f26769e = i10;
        ValueAnimator valueAnimator = this.f26770f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (getScrollX() == i10) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getScrollX(), i10);
        this.f26770f = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new v60(this, 14));
        this.f26770f.setInterpolator(er.h);
        this.f26770f.setDuration(250L);
        this.f26770f.addListener(new sz(this, 17));
        this.f26770f.start();
    }

    public final void b(int i10, int i11) {
        int measuredWidth;
        if (getChildCount() <= 0) {
            return;
        }
        int iDp = AndroidUtilities.dp(50.0f);
        if (i10 < getScrollX() + iDp) {
            measuredWidth = i10 - iDp;
        } else {
            if (i11 <= (getMeasuredWidth() - iDp) + getScrollX()) {
                return;
            } else {
                measuredWidth = (i11 - getMeasuredWidth()) + iDp;
            }
        }
        a(h7.n.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
    }

    public final void c() {
        k5 k5Var;
        jh.y2 y2Var;
        oi0 oi0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f26767b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f26767b.getChildAt(i10);
            if (childAt instanceof iv) {
                iv ivVar = (iv) childAt;
                boolean z10 = childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth();
                boolean z11 = this.d && ((valueAnimator = this.f26768c) == null || !valueAnimator.isRunning());
                if (!ivVar.f29499y && z10 && (oi0Var = ivVar.f29492e) != null && !oi0Var.f31317h0 && !z11) {
                    ivVar.f29492e.Q(0.0f, true);
                    ivVar.f29492e.start();
                }
                if (ivVar.f29499y != z10) {
                    ivVar.f29499y = z10;
                    if (z10) {
                        ivVar.invalidate();
                        ag.k2 k2Var = ivVar.f29493f;
                        if (k2Var != null) {
                            k2Var.invalidate();
                        }
                        ag.k2 k2Var2 = ivVar.f29493f;
                        if (k2Var2 != null && (k5Var = ivVar.f29497w) != null && (y2Var = k5Var.f29961k) != null) {
                            k2Var2.setImageReceiver(y2Var);
                        }
                        n9 n9Var = ivVar.d;
                        if (n9Var != null) {
                            n9Var.invalidate();
                        }
                    } else {
                        ivVar.b();
                    }
                    ivVar.c();
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
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f26766a) {
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
