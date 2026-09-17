package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class mm0 extends HorizontalScrollView {
    public boolean f28470a;
    public LinearLayout f28471b;
    public ValueAnimator f28472c;
    public boolean d;
    public int f28473e;
    public ValueAnimator f28474f;

    public mm0(Context context) {
        super(context);
        this.f28473e = -1;
    }

    public final void a(int i10) {
        if (this.f28473e != i10) {
            this.f28473e = i10;
            ValueAnimator valueAnimator = this.f28474f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f28474f = ofFloat;
            ofFloat.addUpdateListener(new h70(this, 14));
            this.f28474f.setInterpolator(pr.h);
            this.f28474f.setDuration(250L);
            this.f28474f.addListener(new r80(this, 12));
            this.f28474f.start();
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
        bi.y3 y3Var;
        xi0 xi0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f28471b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f28471b.getChildAt(i10);
            if (childAt instanceof xv) {
                xv xvVar = (xv) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f28472c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!xvVar.f32749y && z10 && (xi0Var = xvVar.f32742e) != null && !xi0Var.f32567l0 && !z11) {
                    xvVar.f32742e.Q(0.0f, true);
                    xvVar.f32742e.start();
                }
                if (xvVar.f32749y != z10) {
                    xvVar.f32749y = z10;
                    if (z10) {
                        xvVar.invalidate();
                        sg.e1 e1Var = xvVar.f32743f;
                        if (e1Var != null) {
                            e1Var.invalidate();
                        }
                        sg.e1 e1Var2 = xvVar.f32743f;
                        if (e1Var2 != null && (q5Var = xvVar.f32747w) != null && (y3Var = q5Var.f29585k) != null) {
                            e1Var2.setImageReceiver(y3Var);
                        }
                        x9 x9Var = xvVar.d;
                        if (x9Var != null) {
                            x9Var.invalidate();
                        }
                    } else {
                        xvVar.b();
                    }
                    xvVar.c();
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
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f28470a) {
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
