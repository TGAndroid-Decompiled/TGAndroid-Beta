package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class mm0 extends HorizontalScrollView {
    public boolean f26178a;
    public LinearLayout f26179b;
    public ValueAnimator f26180c;
    public boolean d;
    public int e;
    public ValueAnimator f26181f;

    public mm0(Context context) {
        super(context);
        this.e = -1;
    }

    public final void a(int i10) {
        if (this.e != i10) {
            this.e = i10;
            ValueAnimator valueAnimator = this.f26181f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f26181f = ofFloat;
            ofFloat.addUpdateListener(new h70(this, 14));
            this.f26181f.setInterpolator(qr.h);
            this.f26181f.setDuration(250L);
            this.f26181f.addListener(new jd0(this, 9));
            this.f26181f.start();
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
        o5 o5Var;
        ai.l4 l4Var;
        xi0 xi0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f26179b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f26179b.getChildAt(i10);
            if (childAt instanceof yv) {
                yv yvVar = (yv) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f26180c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!yvVar.f30410y && z10 && (xi0Var = yvVar.e) != null && !xi0Var.f29956k0 && !z11) {
                    yvVar.e.T(0.0f, true);
                    yvVar.e.start();
                }
                if (yvVar.f30410y != z10) {
                    yvVar.f30410y = z10;
                    if (z10) {
                        yvVar.invalidate();
                        rg.b1 b1Var = yvVar.f30404f;
                        if (b1Var != null) {
                            b1Var.invalidate();
                        }
                        rg.b1 b1Var2 = yvVar.f30404f;
                        if (b1Var2 != null && (o5Var = yvVar.f30408w) != null && (l4Var = o5Var.f26689k) != null) {
                            b1Var2.setImageReceiver(l4Var);
                        }
                        u9 u9Var = yvVar.d;
                        if (u9Var != null) {
                            u9Var.invalidate();
                        }
                    } else {
                        yvVar.b();
                    }
                    yvVar.c();
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
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f26178a) {
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
