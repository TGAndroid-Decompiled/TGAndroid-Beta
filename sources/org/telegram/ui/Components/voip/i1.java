package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public final class i1 extends GestureDetector.SimpleOnGestureListener {
    public float f29390a;
    public float f29391b;
    public final int f29392c;
    public final k1 d;

    public i1(k1 k1Var, int i10) {
        this.d = k1Var;
        this.f29392c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        k1 k1Var = this.d;
        if (k1Var.K) {
            for (int i10 = 1; i10 < k1Var.e.getChildCount(); i10++) {
                View childAt = k1Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    k1Var.J = childAt;
                    return true;
                }
            }
        }
        this.f29390a = k1Var.Q;
        this.f29391b = k1Var.R;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        k1 k1Var = this.d;
        if (k1Var.H && !k1Var.I) {
            o1.k kVar = k1Var.S;
            kVar.f15523a = f7;
            float f12 = k1Var.Q;
            kVar.f15524b = f12;
            kVar.f15525c = true;
            o1.l lVar = kVar.f15533u;
            int i10 = k1Var.M;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f15539i = dp;
            k1Var.S.f();
            o1.k kVar2 = k1Var.T;
            kVar2.f15523a = f7;
            kVar2.f15524b = k1Var.R;
            kVar2.f15525c = true;
            kVar2.f15533u.f15539i = w7.q.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.N) - AndroidUtilities.dp(16.0f));
            k1Var.T.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        k1 k1Var = this.d;
        if (!k1Var.H && k1Var.L == null && !k1Var.I) {
            float abs = Math.abs(f7);
            float f11 = this.f29392c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                k1Var.H = true;
                k1Var.S.c();
                k1Var.T.c();
            }
        }
        if (k1Var.H) {
            WindowManager.LayoutParams layoutParams = k1Var.f29425c;
            float rawX = (motionEvent2.getRawX() + this.f29390a) - motionEvent.getRawX();
            k1Var.Q = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = k1Var.f29425c;
            float rawY = (motionEvent2.getRawY() + this.f29391b) - motionEvent.getRawY();
            k1Var.R = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(k1Var.f29424b, k1Var.d, k1Var.f29425c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        k1 k1Var = this.d;
        ValueAnimator valueAnimator = k1Var.L;
        i2.h0 h0Var = k1Var.X;
        if (valueAnimator == null) {
            if (k1Var.W) {
                AndroidUtilities.cancelRunOnUIThread(h0Var);
                k1Var.W = false;
            }
            boolean z10 = !k1Var.K;
            k1Var.K = z10;
            k1Var.o(z10);
            if (k1Var.K && !k1Var.W) {
                AndroidUtilities.runOnUIThread(h0Var, 2500L);
                k1Var.W = true;
            }
        }
        return true;
    }
}
