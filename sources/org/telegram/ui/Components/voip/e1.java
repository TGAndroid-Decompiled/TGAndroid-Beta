package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import nh.n5;
import org.telegram.messenger.AndroidUtilities;
public final class e1 extends GestureDetector.SimpleOnGestureListener {
    public float f29584a;
    public float f29585b;
    public final int f29586c;
    public final g1 d;

    public e1(g1 g1Var, int i10) {
        this.d = g1Var;
        this.f29586c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        g1 g1Var = this.d;
        if (g1Var.H) {
            for (int i10 = 1; i10 < g1Var.e.getChildCount(); i10++) {
                View childAt = g1Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    g1Var.G = childAt;
                    return true;
                }
            }
        }
        this.f29584a = g1Var.N;
        this.f29585b = g1Var.O;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float dp;
        float f12;
        g1 g1Var = this.d;
        if (g1Var.E && !g1Var.F) {
            o1.j jVar = g1Var.P;
            jVar.f16169a = f10;
            float f13 = g1Var.N;
            jVar.f16170b = f13;
            jVar.f16171c = true;
            o1.k kVar = jVar.f16178u;
            int i10 = g1Var.J;
            float f14 = (f10 / 7.0f) + (i10 / 2.0f) + f13;
            int i11 = AndroidUtilities.displaySize.x;
            if (f14 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            kVar.f16184i = dp;
            g1Var.P.f();
            o1.j jVar2 = g1Var.Q;
            jVar2.f16169a = f10;
            jVar2.f16170b = g1Var.O;
            jVar2.f16171c = true;
            jVar2.f16178u.f16184i = k7.n.a((f11 / 10.0f) + f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.K) - AndroidUtilities.dp(16.0f));
            g1Var.Q.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        g1 g1Var = this.d;
        if (!g1Var.E && g1Var.I == null && !g1Var.F) {
            float abs = Math.abs(f10);
            float f12 = this.f29586c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                g1Var.E = true;
                g1Var.P.c();
                g1Var.Q.c();
            }
        }
        if (g1Var.E) {
            WindowManager.LayoutParams layoutParams = g1Var.f29611c;
            float rawX = (motionEvent2.getRawX() + this.f29584a) - motionEvent.getRawX();
            g1Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = g1Var.f29611c;
            float rawY = (motionEvent2.getRawY() + this.f29585b) - motionEvent.getRawY();
            g1Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(g1Var.f29610b, g1Var.d, g1Var.f29611c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        g1 g1Var = this.d;
        ValueAnimator valueAnimator = g1Var.I;
        n5 n5Var = g1Var.U;
        if (valueAnimator == null) {
            if (g1Var.T) {
                AndroidUtilities.cancelRunOnUIThread(n5Var);
                g1Var.T = false;
            }
            boolean z4 = !g1Var.H;
            g1Var.H = z4;
            g1Var.o(z4);
            if (g1Var.H && !g1Var.T) {
                AndroidUtilities.runOnUIThread(n5Var, 2500L);
                g1Var.T = true;
            }
        }
        return true;
    }
}
