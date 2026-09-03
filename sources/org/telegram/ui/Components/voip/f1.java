package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import oh.t3;
import org.telegram.messenger.AndroidUtilities;
public final class f1 extends GestureDetector.SimpleOnGestureListener {
    public float f32033a;
    public float f32034b;
    public final int f32035c;
    public final h1 d;

    public f1(h1 h1Var, int i10) {
        this.d = h1Var;
        this.f32035c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        h1 h1Var = this.d;
        if (h1Var.H) {
            for (int i10 = 1; i10 < h1Var.f32075e.getChildCount(); i10++) {
                View childAt = h1Var.f32075e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    h1Var.G = childAt;
                    return true;
                }
            }
        }
        this.f32033a = h1Var.N;
        this.f32034b = h1Var.O;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float dp;
        float f12;
        h1 h1Var = this.d;
        if (h1Var.E && !h1Var.F) {
            o1.j jVar = h1Var.P;
            jVar.f16328a = f10;
            float f13 = h1Var.N;
            jVar.f16329b = f13;
            jVar.f16330c = true;
            o1.k kVar = jVar.f16338u;
            int i10 = h1Var.J;
            float f14 = (f10 / 7.0f) + (i10 / 2.0f) + f13;
            int i11 = AndroidUtilities.displaySize.x;
            if (f14 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            kVar.f16345i = dp;
            h1Var.P.f();
            o1.j jVar2 = h1Var.Q;
            jVar2.f16328a = f10;
            jVar2.f16329b = h1Var.O;
            jVar2.f16330c = true;
            jVar2.f16338u.f16345i = k7.o.a((f11 / 10.0f) + f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.K) - AndroidUtilities.dp(16.0f));
            h1Var.Q.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        h1 h1Var = this.d;
        if (!h1Var.E && h1Var.I == null && !h1Var.F) {
            float abs = Math.abs(f10);
            float f12 = this.f32035c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                h1Var.E = true;
                h1Var.P.c();
                h1Var.Q.c();
            }
        }
        if (h1Var.E) {
            WindowManager.LayoutParams layoutParams = h1Var.f32074c;
            float rawX = (motionEvent2.getRawX() + this.f32033a) - motionEvent.getRawX();
            h1Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = h1Var.f32074c;
            float rawY = (motionEvent2.getRawY() + this.f32034b) - motionEvent.getRawY();
            h1Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(h1Var.f32073b, h1Var.d, h1Var.f32074c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        h1 h1Var = this.d;
        ValueAnimator valueAnimator = h1Var.I;
        t3 t3Var = h1Var.U;
        if (valueAnimator == null) {
            if (h1Var.T) {
                AndroidUtilities.cancelRunOnUIThread(t3Var);
                h1Var.T = false;
            }
            boolean z4 = !h1Var.H;
            h1Var.H = z4;
            h1Var.o(z4);
            if (h1Var.H && !h1Var.T) {
                AndroidUtilities.runOnUIThread(t3Var, 2500L);
                h1Var.T = true;
            }
        }
        return true;
    }
}
