package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class yn0 extends HorizontalScrollView {
    public boolean f33138a;
    public LinearLayout f33139b;
    public ValueAnimator f33140c;
    public boolean d;
    public int f33141e;
    public ValueAnimator f33142f;

    public yn0(Context context) {
        super(context);
        this.f33141e = -1;
    }

    public final void a(int i10) {
        if (this.f33141e != i10) {
            this.f33141e = i10;
            ValueAnimator valueAnimator = this.f33142f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (getScrollX() == i10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i10);
            this.f33142f = ofFloat;
            ofFloat.addUpdateListener(new m80(this, 15));
            this.f33142f.setInterpolator(js.h);
            this.f33142f.setDuration(250L);
            this.f33142f.addListener(new zd0(this, 10));
            this.f33142f.start();
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
            a(w7.n.b(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        s5 s5Var;
        ai.m4 m4Var;
        fk0 fk0Var;
        ValueAnimator valueAnimator;
        int childCount = this.f33139b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f33139b.getChildAt(i10);
            if (childAt instanceof rw) {
                rw rwVar = (rw) childAt;
                if (childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.d && ((valueAnimator = this.f33140c) == null || !valueAnimator.isRunning())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!rwVar.f30269y && z10 && (fk0Var = rwVar.f30262e) != null && !fk0Var.f26115k0 && !z11) {
                    rwVar.f30262e.T(0.0f, true);
                    rwVar.f30262e.start();
                }
                if (rwVar.f30269y != z10) {
                    rwVar.f30269y = z10;
                    if (z10) {
                        rwVar.invalidate();
                        rg.c1 c1Var = rwVar.f30263f;
                        if (c1Var != null) {
                            c1Var.invalidate();
                        }
                        rg.c1 c1Var2 = rwVar.f30263f;
                        if (c1Var2 != null && (s5Var = rwVar.f30267w) != null && (m4Var = s5Var.f30406k) != null) {
                            c1Var2.setImageReceiver(m4Var);
                        }
                        y9 y9Var = rwVar.d;
                        if (y9Var != null) {
                            y9Var.invalidate();
                        }
                    } else {
                        rwVar.b();
                    }
                    rwVar.c();
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
        if ((Math.abs(i11 - i13) < 2 || i11 >= getMeasuredHeight() || i11 == 0) && !this.f33138a) {
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
