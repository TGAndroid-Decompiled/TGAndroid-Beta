package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class um0 extends HorizontalScrollView {
    public boolean f29252a;
    public LinearLayout f29253b;
    public ValueAnimator f29254c;
    public boolean d;
    public int e;
    public ValueAnimator f29255f;

    public um0(Context context) {
        super(context);
        this.e = -1;
    }

    public final void a(int i10) {
        if (this.e != i10) {
            this.e = i10;
            ValueAnimator valueAnimator = this.f29255f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f29255f = ofFloat;
            ofFloat.addUpdateListener(new i70(this, 14));
            this.f29255f.setInterpolator(nr.h);
            this.f29255f.setDuration(250L);
            this.f29255f.addListener(new nd0(this, 8));
            this.f29255f.start();
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
            a(k7.n.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z4;
        boolean z10;
        l5 l5Var;
        nh.y2 y2Var;
        gj0 gj0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f29253b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f29253b.getChildAt(i10);
            if (childAt instanceof tv) {
                tv tvVar = (tv) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.d && ((valueAnimator = this.f29254c) == null || !valueAnimator.isRunning())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!tvVar.f29057y && z4 && (gj0Var = tvVar.e) != null && !gj0Var.f25158i0 && !z10) {
                    tvVar.e.Q(0.0f, true);
                    tvVar.e.start();
                }
                if (tvVar.f29057y != z4) {
                    tvVar.f29057y = z4;
                    if (z4) {
                        tvVar.invalidate();
                        eg.s1 s1Var = tvVar.f29051f;
                        if (s1Var != null) {
                            s1Var.invalidate();
                        }
                        eg.s1 s1Var2 = tvVar.f29051f;
                        if (s1Var2 != null && (l5Var = tvVar.f29055w) != null && (y2Var = l5Var.f26569k) != null) {
                            s1Var2.setImageReceiver(y2Var);
                        }
                        p9 p9Var = tvVar.d;
                        if (p9Var != null) {
                            p9Var.invalidate();
                        }
                    } else {
                        tvVar.b();
                    }
                    tvVar.c();
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
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f29252a) {
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
