package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public final class h1 extends GestureDetector.SimpleOnGestureListener {
    public float f31967a;
    public float f31968b;
    public final int f31969c;
    public final j1 d;

    public h1(j1 j1Var, int i10) {
        this.d = j1Var;
        this.f31969c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        j1 j1Var = this.d;
        if (j1Var.K) {
            for (int i10 = 1; i10 < j1Var.f32002e.getChildCount(); i10++) {
                View childAt = j1Var.f32002e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    j1Var.J = childAt;
                    return true;
                }
            }
        }
        this.f31967a = j1Var.Q;
        this.f31968b = j1Var.R;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        j1 j1Var = this.d;
        if (j1Var.H && !j1Var.I) {
            o1.k kVar = j1Var.S;
            kVar.f16927a = f7;
            float f12 = j1Var.Q;
            kVar.f16928b = f12;
            kVar.f16929c = true;
            o1.l lVar = kVar.f16938u;
            int i10 = j1Var.M;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f16945i = dp;
            j1Var.S.h();
            o1.k kVar2 = j1Var.T;
            kVar2.f16927a = f7;
            kVar2.f16928b = j1Var.R;
            kVar2.f16929c = true;
            kVar2.f16938u.f16945i = w7.o.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.N) - AndroidUtilities.dp(16.0f));
            j1Var.T.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        j1 j1Var = this.d;
        if (!j1Var.H && j1Var.L == null && !j1Var.I) {
            float abs = Math.abs(f7);
            float f11 = this.f31969c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                j1Var.H = true;
                j1Var.S.c();
                j1Var.T.c();
            }
        }
        if (j1Var.H) {
            WindowManager.LayoutParams layoutParams = j1Var.f32001c;
            float rawX = (motionEvent2.getRawX() + this.f31967a) - motionEvent.getRawX();
            j1Var.Q = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = j1Var.f32001c;
            float rawY = (motionEvent2.getRawY() + this.f31968b) - motionEvent.getRawY();
            j1Var.R = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(j1Var.f32000b, j1Var.d, j1Var.f32001c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j1 j1Var = this.d;
        ValueAnimator valueAnimator = j1Var.L;
        i2.h0 h0Var = j1Var.X;
        if (valueAnimator == null) {
            if (j1Var.W) {
                AndroidUtilities.cancelRunOnUIThread(h0Var);
                j1Var.W = false;
            }
            boolean z10 = !j1Var.K;
            j1Var.K = z10;
            j1Var.o(z10);
            if (j1Var.K && !j1Var.W) {
                AndroidUtilities.runOnUIThread(h0Var, 2500L);
                j1Var.W = true;
            }
        }
        return true;
    }
}
