package org.telegram.ui.Components.voip;

import a8.ee;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public final class g1 extends GestureDetector.SimpleOnGestureListener {
    public float f33810a;
    public float f33811b;
    public final int f33812c;
    public final i1 d;

    public g1(i1 i1Var, int i10) {
        this.d = i1Var;
        this.f33812c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        i1 i1Var = this.d;
        if (i1Var.K) {
            for (int i10 = 1; i10 < i1Var.e.getChildCount(); i10++) {
                View childAt = i1Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    i1Var.J = childAt;
                    return true;
                }
            }
        }
        this.f33810a = i1Var.Q;
        this.f33811b = i1Var.R;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        i1 i1Var = this.d;
        if (i1Var.H && !i1Var.I) {
            o1.j jVar = i1Var.S;
            jVar.f18960a = f7;
            float f12 = i1Var.Q;
            jVar.f18961b = f12;
            jVar.f18962c = true;
            o1.k kVar = jVar.f18969u;
            int i10 = i1Var.M;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            kVar.f18975i = dp;
            i1Var.S.h();
            o1.j jVar2 = i1Var.T;
            jVar2.f18960a = f7;
            jVar2.f18961b = i1Var.R;
            jVar2.f18962c = true;
            jVar2.f18969u.f18975i = ee.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.N) - AndroidUtilities.dp(16.0f));
            i1Var.T.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i1 i1Var = this.d;
        if (!i1Var.H && i1Var.L == null && !i1Var.I) {
            float abs = Math.abs(f7);
            float f11 = this.f33812c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                i1Var.H = true;
                i1Var.S.c();
                i1Var.T.c();
            }
        }
        if (i1Var.H) {
            WindowManager.LayoutParams layoutParams = i1Var.f33848c;
            float rawX = (motionEvent2.getRawX() + this.f33810a) - motionEvent.getRawX();
            i1Var.Q = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = i1Var.f33848c;
            float rawY = (motionEvent2.getRawY() + this.f33811b) - motionEvent.getRawY();
            i1Var.R = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(i1Var.f33847b, i1Var.d, i1Var.f33848c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i1 i1Var = this.d;
        ValueAnimator valueAnimator = i1Var.L;
        k2.c cVar = i1Var.X;
        if (valueAnimator == null) {
            if (i1Var.W) {
                AndroidUtilities.cancelRunOnUIThread(cVar);
                i1Var.W = false;
            }
            boolean z10 = !i1Var.K;
            i1Var.K = z10;
            i1Var.o(z10);
            if (i1Var.K && !i1Var.W) {
                AndroidUtilities.runOnUIThread(cVar, 2500L);
                i1Var.W = true;
            }
        }
        return true;
    }
}
