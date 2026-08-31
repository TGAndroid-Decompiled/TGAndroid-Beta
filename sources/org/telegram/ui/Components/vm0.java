package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class vm0 extends HorizontalScrollView {
    public boolean f31928a;
    public LinearLayout f31929b;
    public ValueAnimator f31930c;
    public boolean d;
    public int f31931e;
    public ValueAnimator f31932f;

    public vm0(Context context) {
        super(context);
        this.f31931e = -1;
    }

    public final void a(int i10) {
        if (this.f31931e != i10) {
            this.f31931e = i10;
            ValueAnimator valueAnimator = this.f31932f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f31932f = ofFloat;
            ofFloat.addUpdateListener(new k70(this, 14));
            this.f31932f.setInterpolator(pr.h);
            this.f31932f.setDuration(250L);
            this.f31932f.addListener(new pd0(this, 8));
            this.f31932f.start();
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
            a(k7.o.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z4;
        boolean z10;
        l5 l5Var;
        oh.z2 z2Var;
        ij0 ij0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f31929b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f31929b.getChildAt(i10);
            if (childAt instanceof vv) {
                vv vvVar = (vv) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.d && ((valueAnimator = this.f31930c) == null || !valueAnimator.isRunning())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!vvVar.f32554y && z4 && (ij0Var = vvVar.f32547e) != null && !ij0Var.f27823i0 && !z10) {
                    vvVar.f32547e.Q(0.0f, true);
                    vvVar.f32547e.start();
                }
                if (vvVar.f32554y != z4) {
                    vvVar.f32554y = z4;
                    if (z4) {
                        vvVar.invalidate();
                        fg.r1 r1Var = vvVar.f32548f;
                        if (r1Var != null) {
                            r1Var.invalidate();
                        }
                        fg.r1 r1Var2 = vvVar.f32548f;
                        if (r1Var2 != null && (l5Var = vvVar.f32552w) != null && (z2Var = l5Var.f28604k) != null) {
                            r1Var2.setImageReceiver(z2Var);
                        }
                        p9 p9Var = vvVar.d;
                        if (p9Var != null) {
                            p9Var.invalidate();
                        }
                    } else {
                        vvVar.b();
                    }
                    vvVar.c();
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        c();
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f31928a) {
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
