package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class nm0 extends HorizontalScrollView {
    public boolean f26442a;
    public LinearLayout f26443b;
    public ValueAnimator f26444c;
    public boolean d;
    public int e;
    public ValueAnimator f26445f;

    public nm0(Context context) {
        super(context);
        this.e = -1;
    }

    public final void a(int i10) {
        if (this.e != i10) {
            this.e = i10;
            ValueAnimator valueAnimator = this.f26445f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f26445f = ofFloat;
            ofFloat.addUpdateListener(new i70(this, 14));
            this.f26445f.setInterpolator(rr.h);
            this.f26445f.setDuration(250L);
            this.f26445f.addListener(new jd0(this, 9));
            this.f26445f.start();
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
            a(w7.p.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        q5 q5Var;
        ai.l4 l4Var;
        yi0 yi0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f26443b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f26443b.getChildAt(i10);
            if (childAt instanceof zv) {
                zv zvVar = (zv) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f26444c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!zvVar.f30669y && z10 && (yi0Var = zvVar.e) != null && !yi0Var.f30271k0 && !z11) {
                    zvVar.e.T(0.0f, true);
                    zvVar.e.start();
                }
                if (zvVar.f30669y != z10) {
                    zvVar.f30669y = z10;
                    if (z10) {
                        zvVar.invalidate();
                        rg.b1 b1Var = zvVar.f30663f;
                        if (b1Var != null) {
                            b1Var.invalidate();
                        }
                        rg.b1 b1Var2 = zvVar.f30663f;
                        if (b1Var2 != null && (q5Var = zvVar.f30667w) != null && (l4Var = q5Var.f27230k) != null) {
                            b1Var2.setImageReceiver(l4Var);
                        }
                        w9 w9Var = zvVar.d;
                        if (w9Var != null) {
                            w9Var.invalidate();
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
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f26442a) {
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
