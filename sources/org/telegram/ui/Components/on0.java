package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class on0 extends HorizontalScrollView {
    public boolean f27999a;
    public LinearLayout f28000b;
    public ValueAnimator f28001c;
    public boolean d;
    public int e;
    public ValueAnimator f28002f;

    public on0(Context context) {
        super(context);
        this.e = -1;
    }

    public final void a(int i10) {
        if (this.e != i10) {
            this.e = i10;
            ValueAnimator valueAnimator = this.f28002f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f28002f = ofFloat;
            ofFloat.addUpdateListener(new g80(this, 15));
            this.f28002f.setInterpolator(es.h);
            this.f28002f.setDuration(250L);
            this.f28002f.addListener(new k90(this, 13));
            this.f28002f.start();
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
            a(w7.s.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        s5 s5Var;
        bi.b4 b4Var;
        yj0 yj0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f28000b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f28000b.getChildAt(i10);
            if (childAt instanceof kw) {
                kw kwVar = (kw) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f28001c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!kwVar.f26820y && z10 && (yj0Var = kwVar.e) != null && !yj0Var.f31615k0 && !z11) {
                    kwVar.e.T(0.0f, true);
                    kwVar.e.start();
                }
                if (kwVar.f26820y != z10) {
                    kwVar.f26820y = z10;
                    if (z10) {
                        kwVar.invalidate();
                        sg.c1 c1Var = kwVar.f26814f;
                        if (c1Var != null) {
                            c1Var.invalidate();
                        }
                        sg.c1 c1Var2 = kwVar.f26814f;
                        if (c1Var2 != null && (s5Var = kwVar.f26818w) != null && (b4Var = s5Var.f29031k) != null) {
                            c1Var2.setImageReceiver(b4Var);
                        }
                        z9 z9Var = kwVar.d;
                        if (z9Var != null) {
                            z9Var.invalidate();
                        }
                    } else {
                        kwVar.b();
                    }
                    kwVar.c();
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
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f27999a) {
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
