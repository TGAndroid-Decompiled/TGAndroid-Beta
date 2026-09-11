package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public final class f1 extends GestureDetector.SimpleOnGestureListener {
    public float f31479a;
    public float f31480b;
    public final int f31481c;
    public final h1 d;

    public f1(h1 h1Var, int i10) {
        this.d = h1Var;
        this.f31481c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        h1 h1Var = this.d;
        if (h1Var.K) {
            for (int i10 = 1; i10 < h1Var.f31521e.getChildCount(); i10++) {
                View childAt = h1Var.f31521e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    h1Var.J = childAt;
                    return true;
                }
            }
        }
        this.f31479a = h1Var.Q;
        this.f31480b = h1Var.R;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        h1 h1Var = this.d;
        if (h1Var.H && !h1Var.I) {
            o1.k kVar = h1Var.S;
            kVar.f16814a = f7;
            float f12 = h1Var.Q;
            kVar.f16815b = f12;
            kVar.f16816c = true;
            o1.l lVar = kVar.f16825u;
            int i10 = h1Var.M;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f16832i = dp;
            h1Var.S.f();
            o1.k kVar2 = h1Var.T;
            kVar2.f16814a = f7;
            kVar2.f16815b = h1Var.R;
            kVar2.f16816c = true;
            kVar2.f16825u.f16832i = w7.p.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.N) - AndroidUtilities.dp(16.0f));
            h1Var.T.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        h1 h1Var = this.d;
        if (!h1Var.H && h1Var.L == null && !h1Var.I) {
            float abs = Math.abs(f7);
            float f11 = this.f31481c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                h1Var.H = true;
                h1Var.S.c();
                h1Var.T.c();
            }
        }
        if (h1Var.H) {
            WindowManager.LayoutParams layoutParams = h1Var.f31520c;
            float rawX = (motionEvent2.getRawX() + this.f31479a) - motionEvent.getRawX();
            h1Var.Q = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = h1Var.f31520c;
            float rawY = (motionEvent2.getRawY() + this.f31480b) - motionEvent.getRawY();
            h1Var.R = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(h1Var.f31519b, h1Var.d, h1Var.f31520c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        h1 h1Var = this.d;
        ValueAnimator valueAnimator = h1Var.L;
        ig.t0 t0Var = h1Var.X;
        if (valueAnimator == null) {
            if (h1Var.W) {
                AndroidUtilities.cancelRunOnUIThread(t0Var);
                h1Var.W = false;
            }
            boolean z10 = !h1Var.K;
            h1Var.K = z10;
            h1Var.o(z10);
            if (h1Var.K && !h1Var.W) {
                AndroidUtilities.runOnUIThread(t0Var, 2500L);
                h1Var.W = true;
            }
        }
        return true;
    }
}
