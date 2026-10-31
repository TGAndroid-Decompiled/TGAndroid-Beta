package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.ui.ActionBar.w5;
public final class q0 extends GestureDetector.SimpleOnGestureListener {
    public float f31586a;
    public float f31587b;
    public final int f31588c;
    public final s0 d;

    public q0(s0 s0Var, int i10) {
        this.d = s0Var;
        this.f31588c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        s0 s0Var = this.d;
        if (s0Var.K) {
            for (int i10 = 1; i10 < s0Var.e.getChildCount(); i10++) {
                View childAt = s0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    s0Var.J = childAt;
                    return true;
                }
            }
        }
        this.f31586a = s0Var.Q;
        this.f31587b = s0Var.R;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        Point point;
        float L;
        float f11;
        s0 s0Var = this.d;
        if (s0Var.H && !s0Var.I) {
            o1.j jVar = s0Var.S;
            jVar.f13948a = f7;
            float f12 = s0Var.Q;
            jVar.f13949b = f12;
            jVar.f13950c = true;
            o1.k kVar = jVar.f13957m;
            int i10 = s0Var.M;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = org.telegram.messenger.i0.f16026q.x;
            if (f13 >= i11 / 2.0f) {
                L = (i11 - i10) - org.telegram.messenger.i0.L(16.0f);
            } else {
                L = org.telegram.messenger.i0.L(16.0f);
            }
            kVar.f13964i = L;
            s0Var.S.h();
            o1.j jVar2 = s0Var.T;
            jVar2.f13948a = f7;
            jVar2.f13949b = s0Var.R;
            jVar2.f13950c = true;
            jVar2.f13957m.f13964i = w7.u.a((f10 / 10.0f) + f11, org.telegram.messenger.i0.L(16.0f), (point.y - s0Var.N) - org.telegram.messenger.i0.L(16.0f));
            s0Var.T.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        s0 s0Var = this.d;
        if (!s0Var.H && s0Var.L == null && !s0Var.I) {
            float abs = Math.abs(f7);
            float f11 = this.f31588c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                s0Var.H = true;
                s0Var.S.d();
                s0Var.T.d();
            }
        }
        if (s0Var.H) {
            WindowManager.LayoutParams layoutParams = s0Var.f31649c;
            float rawX = (motionEvent2.getRawX() + this.f31586a) - motionEvent.getRawX();
            s0Var.Q = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = s0Var.f31649c;
            float rawY = (motionEvent2.getRawY() + this.f31587b) - motionEvent.getRawY();
            s0Var.R = rawY;
            layoutParams2.y = (int) rawY;
            org.telegram.messenger.i0.S3(s0Var.f31648b, s0Var.d, s0Var.f31649c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        s0 s0Var = this.d;
        ValueAnimator valueAnimator = s0Var.L;
        w5 w5Var = s0Var.X;
        if (valueAnimator == null) {
            if (s0Var.W) {
                org.telegram.messenger.i0.r(w5Var);
                s0Var.W = false;
            }
            boolean z10 = !s0Var.K;
            s0Var.K = z10;
            s0Var.j(z10);
            if (s0Var.K && !s0Var.W) {
                org.telegram.messenger.i0.h3(w5Var, 2500L);
                s0Var.W = true;
            }
        }
        return true;
    }
}
