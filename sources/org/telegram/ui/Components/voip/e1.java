package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
public final class e1 extends GestureDetector.SimpleOnGestureListener {
    public float f33495a;
    public float f33496b;
    public final int f33497c;
    public final g1 d;

    public e1(g1 g1Var, int i9) {
        this.d = g1Var;
        this.f33497c = i9;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        g1 g1Var = this.d;
        if (g1Var.G) {
            for (int i9 = 1; i9 < g1Var.f33520e.getChildCount(); i9++) {
                View childAt = g1Var.f33520e.getChildAt(i9);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    g1Var.F = childAt;
                    return true;
                }
            }
        }
        this.f33495a = g1Var.M;
        this.f33496b = g1Var.N;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float dp;
        float f12;
        g1 g1Var = this.d;
        if (g1Var.D && !g1Var.E) {
            o1.j jVar = g1Var.O;
            jVar.f18790a = f10;
            float f13 = g1Var.M;
            jVar.f18791b = f13;
            jVar.f18792c = true;
            o1.k kVar = jVar.f18800u;
            int i9 = g1Var.I;
            float f14 = (f10 / 7.0f) + (i9 / 2.0f) + f13;
            int i10 = AndroidUtilities.displaySize.x;
            if (f14 >= i10 / 2.0f) {
                dp = (i10 - i9) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            kVar.f18807i = dp;
            g1Var.O.f();
            o1.j jVar2 = g1Var.P;
            jVar2.f18790a = f10;
            jVar2.f18791b = g1Var.N;
            jVar2.f18792c = true;
            jVar2.f18800u.f18807i = g7.n.a((f11 / 10.0f) + f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.J) - AndroidUtilities.dp(16.0f));
            g1Var.P.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        g1 g1Var = this.d;
        if (!g1Var.D && g1Var.H == null && !g1Var.E) {
            float abs = Math.abs(f10);
            float f12 = this.f33497c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                g1Var.D = true;
                g1Var.O.c();
                g1Var.P.c();
            }
        }
        if (g1Var.D) {
            WindowManager.LayoutParams layoutParams = g1Var.f33519c;
            float rawX = (motionEvent2.getRawX() + this.f33495a) - motionEvent.getRawX();
            g1Var.M = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = g1Var.f33519c;
            float rawY = (motionEvent2.getRawY() + this.f33496b) - motionEvent.getRawY();
            g1Var.N = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(g1Var.f33518b, g1Var.d, g1Var.f33519c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        g1 g1Var = this.d;
        ValueAnimator valueAnimator = g1Var.H;
        mh.m2 m2Var = g1Var.T;
        if (valueAnimator == null) {
            if (g1Var.S) {
                AndroidUtilities.cancelRunOnUIThread(m2Var);
                g1Var.S = false;
            }
            boolean z10 = !g1Var.G;
            g1Var.G = z10;
            g1Var.o(z10);
            if (g1Var.G && !g1Var.S) {
                AndroidUtilities.runOnUIThread(m2Var, 2500L);
                g1Var.S = true;
            }
        }
        return true;
    }
}
