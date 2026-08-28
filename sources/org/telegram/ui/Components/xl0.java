package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class xl0 extends HorizontalScrollView {
    public boolean f34719a;
    public LinearLayout f34720b;
    public ValueAnimator f34721c;
    public boolean d;
    public int f34722e;
    public ValueAnimator f34723f;

    public xl0(Context context) {
        super(context);
        this.f34722e = -1;
    }

    public final void a(int i9) {
        if (this.f34722e != i9) {
            this.f34722e = i9;
            ValueAnimator valueAnimator = this.f34723f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i9) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i9);
            this.f34723f = ofFloat;
            ofFloat.addUpdateListener(new q60(this, 14));
            this.f34723f.setInterpolator(gr.h);
            this.f34723f.setDuration(250L);
            this.f34723f.addListener(new r60(this, 15));
            this.f34723f.start();
        }
    }

    public final void b(int i9, int i10) {
        int measuredWidth;
        if (getChildCount() > 0) {
            int dp = AndroidUtilities.dp(50.0f);
            if (i9 < getScrollX() + dp) {
                measuredWidth = i9 - dp;
            } else {
                if (i10 > (getMeasuredWidth() - dp) + getScrollX()) {
                    measuredWidth = (i10 - getMeasuredWidth()) + dp;
                } else {
                    return;
                }
            }
            a(g7.n.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        k5 k5Var;
        ih.z2 z2Var;
        mi0 mi0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f34720b.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = this.f34720b.getChildAt(i9);
            if (childAt instanceof jv) {
                jv jvVar = (jv) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f34721c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!jvVar.f29855y && z10 && (mi0Var = jvVar.f29848e) != null && !mi0Var.f30852h0 && !z11) {
                    jvVar.f29848e.Q(0.0f, true);
                    jvVar.f29848e.start();
                }
                if (jvVar.f29855y != z10) {
                    jvVar.f29855y = z10;
                    if (z10) {
                        jvVar.invalidate();
                        zf.b1 b1Var = jvVar.f29849f;
                        if (b1Var != null) {
                            b1Var.invalidate();
                        }
                        zf.b1 b1Var2 = jvVar.f29849f;
                        if (b1Var2 != null && (k5Var = jvVar.f29853w) != null && (z2Var = k5Var.f29951k) != null) {
                            b1Var2.setImageReceiver(z2Var);
                        }
                        o9 o9Var = jvVar.d;
                        if (o9Var != null) {
                            o9Var.invalidate();
                        }
                    } else {
                        jvVar.b();
                    }
                    jvVar.c();
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        c();
    }

    @Override
    public final void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        if ((Math.abs(i10 - i12) < 2 || i10 >= getMeasuredHeight() || i10 == 0) && !this.f34719a) {
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
