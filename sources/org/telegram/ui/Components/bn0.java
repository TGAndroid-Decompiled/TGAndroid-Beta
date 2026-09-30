package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class bn0 extends HorizontalScrollView {
    public boolean f22983a;
    public LinearLayout f22984b;
    public ValueAnimator f22985c;
    public boolean d;
    public int e;
    public ValueAnimator f22986f;

    public bn0(Context context) {
        super(context);
        this.e = -1;
    }

    public final void a(int i10) {
        if (this.e != i10) {
            this.e = i10;
            ValueAnimator valueAnimator = this.f22986f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f22986f = ofFloat;
            ofFloat.addUpdateListener(new v70(this, 14));
            this.f22986f.setInterpolator(tr.h);
            this.f22986f.setDuration(250L);
            this.f22986f.addListener(new id0(this, 10));
            this.f22986f.start();
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
        lj0 lj0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f22984b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f22984b.getChildAt(i10);
            if (childAt instanceof bw) {
                bw bwVar = (bw) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f22985c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!bwVar.f23044y && z10 && (lj0Var = bwVar.e) != null && !lj0Var.f26021k0 && !z11) {
                    bwVar.e.T(0.0f, true);
                    bwVar.e.start();
                }
                if (bwVar.f23044y != z10) {
                    bwVar.f23044y = z10;
                    if (z10) {
                        bwVar.invalidate();
                        rg.b1 b1Var = bwVar.f23038f;
                        if (b1Var != null) {
                            b1Var.invalidate();
                        }
                        rg.b1 b1Var2 = bwVar.f23038f;
                        if (b1Var2 != null && (q5Var = bwVar.f23042w) != null && (l4Var = q5Var.f27555k) != null) {
                            b1Var2.setImageReceiver(l4Var);
                        }
                        w9 w9Var = bwVar.d;
                        if (w9Var != null) {
                            w9Var.invalidate();
                        }
                    } else {
                        bwVar.b();
                    }
                    bwVar.c();
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
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f22983a) {
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
