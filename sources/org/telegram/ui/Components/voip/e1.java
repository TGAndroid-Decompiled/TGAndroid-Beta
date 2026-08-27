package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;

public final class e1 extends GestureDetector.SimpleOnGestureListener {

    public float f33545a;

    public float f33546b;

    public final int f33547c;
    public final g1 d;

    public e1(g1 g1Var, int i10) {
        this.d = g1Var;
        this.f33547c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        g1 g1Var = this.d;
        if (g1Var.G) {
            for (int i10 = 1; i10 < g1Var.f33570e.getChildCount(); i10++) {
                View childAt = g1Var.f33570e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    g1Var.F = childAt;
                    return true;
                }
            }
        }
        this.f33545a = g1Var.M;
        this.f33546b = g1Var.N;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        g1 g1Var = this.d;
        if (!g1Var.D || g1Var.E) {
            return false;
        }
        o1.j jVar = g1Var.O;
        jVar.f19137a = f10;
        float f12 = g1Var.M;
        jVar.f19138b = f12;
        jVar.f19139c = true;
        o1.k kVar = jVar.f19147u;
        int i10 = g1Var.I;
        float f13 = (f10 / 7.0f) + (i10 / 2.0f) + f12;
        int i11 = AndroidUtilities.displaySize.x;
        kVar.f19154i = f13 >= ((float) i11) / 2.0f ? (i11 - i10) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        g1Var.O.f();
        o1.j jVar2 = g1Var.P;
        jVar2.f19137a = f10;
        float f14 = g1Var.N;
        jVar2.f19138b = f14;
        jVar2.f19139c = true;
        jVar2.f19147u.f19154i = h7.n.a((f11 / 10.0f) + f14, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.J) - AndroidUtilities.dp(16.0f));
        g1Var.P.f();
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        g1 g1Var = this.d;
        if (!g1Var.D && g1Var.H == null && !g1Var.E) {
            float fAbs = Math.abs(f10);
            float f12 = this.f33547c;
            if (fAbs >= f12 || Math.abs(f11) >= f12) {
                g1Var.D = true;
                g1Var.O.c();
                g1Var.P.c();
            }
        }
        if (g1Var.D) {
            WindowManager.LayoutParams layoutParams = g1Var.f33569c;
            float rawX = (motionEvent2.getRawX() + this.f33545a) - motionEvent.getRawX();
            g1Var.M = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = g1Var.f33569c;
            float rawY = (motionEvent2.getRawY() + this.f33546b) - motionEvent.getRawY();
            g1Var.N = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(g1Var.f33568b, g1Var.d, g1Var.f33569c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        g1 g1Var = this.d;
        ValueAnimator valueAnimator = g1Var.H;
        nh.f0 f0Var = g1Var.T;
        if (valueAnimator == null) {
            if (g1Var.S) {
                AndroidUtilities.cancelRunOnUIThread(f0Var);
                g1Var.S = false;
            }
            boolean z10 = !g1Var.G;
            g1Var.G = z10;
            g1Var.o(z10);
            if (g1Var.G && !g1Var.S) {
                AndroidUtilities.runOnUIThread(f0Var, 2500L);
                g1Var.S = true;
            }
        }
        return true;
    }
}
