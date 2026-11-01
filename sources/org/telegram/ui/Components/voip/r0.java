package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.ui.ActionBar.w5;
public final class r0 extends GestureDetector.SimpleOnGestureListener {
    public float f31698a;
    public float f31699b;
    public final int f31700c;
    public final t0 d;

    public r0(t0 t0Var, int i10) {
        this.d = t0Var;
        this.f31700c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        t0 t0Var = this.d;
        if (t0Var.K) {
            for (int i10 = 1; i10 < t0Var.e.getChildCount(); i10++) {
                View childAt = t0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    t0Var.J = childAt;
                    return true;
                }
            }
        }
        this.f31698a = t0Var.Q;
        this.f31699b = t0Var.R;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        Point point;
        float L;
        float f11;
        t0 t0Var = this.d;
        if (t0Var.H && !t0Var.I) {
            o1.j jVar = t0Var.S;
            jVar.f13949a = f7;
            float f12 = t0Var.Q;
            jVar.f13950b = f12;
            jVar.f13951c = true;
            o1.k kVar = jVar.f13958m;
            int i10 = t0Var.M;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = org.telegram.messenger.i0.f16172q.x;
            if (f13 >= i11 / 2.0f) {
                L = (i11 - i10) - org.telegram.messenger.i0.L(16.0f);
            } else {
                L = org.telegram.messenger.i0.L(16.0f);
            }
            kVar.f13965i = L;
            t0Var.S.h();
            o1.j jVar2 = t0Var.T;
            jVar2.f13949a = f7;
            jVar2.f13950b = t0Var.R;
            jVar2.f13951c = true;
            jVar2.f13958m.f13965i = w7.u.a((f10 / 10.0f) + f11, org.telegram.messenger.i0.L(16.0f), (point.y - t0Var.N) - org.telegram.messenger.i0.L(16.0f));
            t0Var.T.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        t0 t0Var = this.d;
        if (!t0Var.H && t0Var.L == null && !t0Var.I) {
            float abs = Math.abs(f7);
            float f11 = this.f31700c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                t0Var.H = true;
                t0Var.S.d();
                t0Var.T.d();
            }
        }
        if (t0Var.H) {
            WindowManager.LayoutParams layoutParams = t0Var.f31728c;
            float rawX = (motionEvent2.getRawX() + this.f31698a) - motionEvent.getRawX();
            t0Var.Q = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = t0Var.f31728c;
            float rawY = (motionEvent2.getRawY() + this.f31699b) - motionEvent.getRawY();
            t0Var.R = rawY;
            layoutParams2.y = (int) rawY;
            org.telegram.messenger.i0.S3(t0Var.f31727b, t0Var.d, t0Var.f31728c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        t0 t0Var = this.d;
        ValueAnimator valueAnimator = t0Var.L;
        w5 w5Var = t0Var.X;
        if (valueAnimator == null) {
            if (t0Var.W) {
                org.telegram.messenger.i0.r(w5Var);
                t0Var.W = false;
            }
            boolean z10 = !t0Var.K;
            t0Var.K = z10;
            t0Var.j(z10);
            if (t0Var.K && !t0Var.W) {
                org.telegram.messenger.i0.h3(w5Var, 2500L);
                t0Var.W = true;
            }
        }
        return true;
    }
}
