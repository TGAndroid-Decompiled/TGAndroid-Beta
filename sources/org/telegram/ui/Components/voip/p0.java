package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import b8.be;
import org.telegram.ui.ActionBar.d4;
public final class p0 extends GestureDetector.SimpleOnGestureListener {
    public float f39506a;
    public float f39507b;
    public final int f39508c;
    public final s0 d;

    public p0(s0 s0Var, int i3) {
        this.d = s0Var;
        this.f39508c = i3;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        s0 s0Var = this.d;
        if (s0Var.L) {
            for (int i3 = 1; i3 < s0Var.f39595e.getChildCount(); i3++) {
                View childAt = s0Var.f39595e.getChildAt(i3);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    s0Var.K = childAt;
                    return true;
                }
            }
        }
        this.f39506a = s0Var.R;
        this.f39507b = s0Var.S;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        Point point;
        float L;
        float f12;
        s0 s0Var = this.d;
        if (s0Var.I && !s0Var.J) {
            q1.g gVar = s0Var.T;
            gVar.f53643a = f10;
            float f13 = s0Var.R;
            gVar.f53644b = f13;
            gVar.f53645c = true;
            q1.h hVar = gVar.f53653m;
            int i3 = s0Var.N;
            float f14 = (f10 / 7.0f) + (i3 / 2.0f) + f13;
            int i10 = org.telegram.messenger.g0.f22608q.x;
            if (f14 >= i10 / 2.0f) {
                L = (i10 - i3) - org.telegram.messenger.g0.L(16.0f);
            } else {
                L = org.telegram.messenger.g0.L(16.0f);
            }
            hVar.f53661i = L;
            s0Var.T.h();
            q1.g gVar2 = s0Var.U;
            gVar2.f53643a = f10;
            gVar2.f53644b = s0Var.S;
            gVar2.f53645c = true;
            gVar2.f53653m.f53661i = be.a((f11 / 10.0f) + f12, org.telegram.messenger.g0.L(16.0f), (point.y - s0Var.O) - org.telegram.messenger.g0.L(16.0f));
            s0Var.U.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        s0 s0Var = this.d;
        if (!s0Var.I && s0Var.M == null && !s0Var.J) {
            float abs = Math.abs(f10);
            float f12 = this.f39508c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                s0Var.I = true;
                s0Var.T.d();
                s0Var.U.d();
            }
        }
        if (s0Var.I) {
            WindowManager.LayoutParams layoutParams = s0Var.f39594c;
            float rawX = (motionEvent2.getRawX() + this.f39506a) - motionEvent.getRawX();
            s0Var.R = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = s0Var.f39594c;
            float rawY = (motionEvent2.getRawY() + this.f39507b) - motionEvent.getRawY();
            s0Var.S = rawY;
            layoutParams2.y = (int) rawY;
            org.telegram.messenger.g0.T3(s0Var.f39592b, s0Var.d, s0Var.f39594c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        s0 s0Var = this.d;
        ValueAnimator valueAnimator = s0Var.M;
        d4 d4Var = s0Var.Y;
        if (valueAnimator == null) {
            if (s0Var.X) {
                org.telegram.messenger.g0.r(d4Var);
                s0Var.X = false;
            }
            boolean z10 = !s0Var.L;
            s0Var.L = z10;
            s0Var.j(z10);
            if (s0Var.L && !s0Var.X) {
                org.telegram.messenger.g0.i3(d4Var, 2500L);
                s0Var.X = true;
            }
        }
        return true;
    }
}
