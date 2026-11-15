package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
public abstract class al0 extends HorizontalScrollView {
    public boolean f33012a;
    public LinearLayout f33013b;
    public ValueAnimator f33014c;
    public boolean d;
    public int f33015e;
    public ValueAnimator f33016f;

    public al0(Context context) {
        super(context);
        this.f33015e = -1;
    }

    public final void a(int i7) {
        if (this.f33015e != i7) {
            this.f33015e = i7;
            ValueAnimator valueAnimator = this.f33016f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i7) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i7);
            this.f33016f = ofFloat;
            ofFloat.addUpdateListener(new f60(this, 13));
            this.f33016f.setInterpolator(er.h);
            this.f33016f.setDuration(250L);
            this.f33016f.addListener(new h60(this, 16));
            this.f33016f.start();
        }
    }

    public final void b(int i7, int i10) {
        int measuredWidth;
        if (getChildCount() > 0) {
            int L = org.telegram.messenger.g0.L(50.0f);
            if (i7 < getScrollX() + L) {
                measuredWidth = i7 - L;
            } else {
                if (i10 > (getMeasuredWidth() - L) + getScrollX()) {
                    measuredWidth = (i10 - getMeasuredWidth()) + L;
                } else {
                    return;
                }
            }
            a(c8.i9.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        g5 g5Var;
        fi.u2 u2Var;
        ch0 ch0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f33013b.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.f33013b.getChildAt(i7);
            if (childAt instanceof cv) {
                cv cvVar = (cv) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f33014c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!cvVar.E && z10 && (ch0Var = cvVar.f33698e) != null && !ch0Var.f33588l0 && !z11) {
                    cvVar.f33698e.T(true, 0.0f);
                    cvVar.f33698e.start();
                }
                if (cvVar.E != z10) {
                    cvVar.E = z10;
                    if (z10) {
                        cvVar.invalidate();
                        ug.a1 a1Var = cvVar.f33699f;
                        if (a1Var != null) {
                            a1Var.invalidate();
                        }
                        ug.a1 a1Var2 = cvVar.f33699f;
                        if (a1Var2 != null && (g5Var = cvVar.f33704x) != null && (u2Var = g5Var.f34813k) != null) {
                            a1Var2.setImageReceiver(u2Var);
                        }
                        i9 i9Var = cvVar.d;
                        if (i9Var != null) {
                            i9Var.invalidate();
                        }
                    } else {
                        cvVar.b();
                    }
                    cvVar.c();
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        c();
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        if ((Math.abs(i10 - i12) < 2 || i10 >= getMeasuredHeight() || i10 == 0) && !this.f33012a) {
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
