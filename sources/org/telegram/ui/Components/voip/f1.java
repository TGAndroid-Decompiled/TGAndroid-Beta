package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import nh.m6;
import org.telegram.messenger.AndroidUtilities;
public final class f1 extends GestureDetector.SimpleOnGestureListener {
    public float f33691a;
    public float f33692b;
    public final int f33693c;
    public final h1 d;

    public f1(h1 h1Var, int i10) {
        this.d = h1Var;
        this.f33693c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        h1 h1Var = this.d;
        if (h1Var.G) {
            for (int i10 = 1; i10 < h1Var.f33734e.getChildCount(); i10++) {
                View childAt = h1Var.f33734e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    h1Var.F = childAt;
                    return true;
                }
            }
        }
        this.f33691a = h1Var.M;
        this.f33692b = h1Var.N;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        float dp;
        float f11;
        h1 h1Var = this.d;
        if (h1Var.D && !h1Var.E) {
            o1.k kVar = h1Var.O;
            kVar.f19035a = f9;
            float f12 = h1Var.M;
            kVar.f19036b = f12;
            kVar.f19037c = true;
            o1.l lVar = kVar.f19045u;
            int i10 = h1Var.I;
            float f13 = (f9 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f19052i = dp;
            h1Var.O.f();
            o1.k kVar2 = h1Var.P;
            kVar2.f19035a = f9;
            kVar2.f19036b = h1Var.N;
            kVar2.f19037c = true;
            kVar2.f19045u.f19052i = i7.w.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.J) - AndroidUtilities.dp(16.0f));
            h1Var.P.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        h1 h1Var = this.d;
        if (!h1Var.D && h1Var.H == null && !h1Var.E) {
            float abs = Math.abs(f9);
            float f11 = this.f33693c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                h1Var.D = true;
                h1Var.O.c();
                h1Var.P.c();
            }
        }
        if (h1Var.D) {
            WindowManager.LayoutParams layoutParams = h1Var.f33733c;
            float rawX = (motionEvent2.getRawX() + this.f33691a) - motionEvent.getRawX();
            h1Var.M = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = h1Var.f33733c;
            float rawY = (motionEvent2.getRawY() + this.f33692b) - motionEvent.getRawY();
            h1Var.N = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(h1Var.f33732b, h1Var.d, h1Var.f33733c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        h1 h1Var = this.d;
        ValueAnimator valueAnimator = h1Var.H;
        m6 m6Var = h1Var.T;
        if (valueAnimator == null) {
            if (h1Var.S) {
                AndroidUtilities.cancelRunOnUIThread(m6Var);
                h1Var.S = false;
            }
            boolean z10 = !h1Var.G;
            h1Var.G = z10;
            h1Var.o(z10);
            if (h1Var.G && !h1Var.S) {
                AndroidUtilities.runOnUIThread(m6Var, 2500L);
                h1Var.S = true;
            }
        }
        return true;
    }
}
