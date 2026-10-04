package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class en0 extends HorizontalScrollView {
    public boolean f26089a;
    public LinearLayout f26090b;
    public ValueAnimator f26091c;
    public boolean d;
    public int f26092e;
    public ValueAnimator f26093f;

    public en0(Context context) {
        super(context);
        this.f26092e = -1;
    }

    public final void a(int i10) {
        if (this.f26092e != i10) {
            this.f26092e = i10;
            ValueAnimator valueAnimator = this.f26093f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f26093f = ofFloat;
            ofFloat.addUpdateListener(new v70(this, 14));
            this.f26093f.setInterpolator(tr.h);
            this.f26093f.setDuration(250L);
            this.f26093f.addListener(new hd0(this, 10));
            this.f26093f.start();
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
        kj0 kj0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f26090b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f26090b.getChildAt(i10);
            if (childAt instanceof cw) {
                cw cwVar = (cw) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f26091c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!cwVar.f25467y && z10 && (kj0Var = cwVar.f25460e) != null && !kj0Var.f28133k0 && !z11) {
                    cwVar.f25460e.T(0.0f, true);
                    cwVar.f25460e.start();
                }
                if (cwVar.f25467y != z10) {
                    cwVar.f25467y = z10;
                    if (z10) {
                        cwVar.invalidate();
                        rg.c1 c1Var = cwVar.f25461f;
                        if (c1Var != null) {
                            c1Var.invalidate();
                        }
                        rg.c1 c1Var2 = cwVar.f25461f;
                        if (c1Var2 != null && (q5Var = cwVar.f25465w) != null && (l4Var = q5Var.f29909k) != null) {
                            c1Var2.setImageReceiver(l4Var);
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
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f26089a) {
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
