package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class mg0 extends l20 {
    public float f26400a;
    public float f26401b;
    public final int f26402c;
    public final og0 d;

    public mg0(og0 og0Var, int i10) {
        this.d = og0Var;
        this.f26402c = i10;
    }

    @Override
    public final boolean a() {
        og0 og0Var = this.d;
        PhotoViewer photoViewer = og0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || og0Var.f26930r != null) && !og0Var.f26918c0 && !og0Var.Y && !og0Var.f26932w && !og0Var.f26931s.isInProgress() && og0Var.f26922f0) {
                long l4 = og0Var.l();
                long m10 = og0Var.m();
                if (l4 != -9223372036854775807L && m10 >= 15000) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mg0.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        og0 og0Var = this.d;
        if (og0Var.E) {
            for (int i10 = 1; i10 < og0Var.e.getChildCount(); i10++) {
                View childAt = og0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    og0Var.f26934y = childAt;
                    return true;
                }
            }
        }
        this.f26400a = og0Var.K;
        this.f26401b = og0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        og0 og0Var = this.d;
        if (og0Var.f26932w && !og0Var.f26933x) {
            o1.k kVar = og0Var.M;
            kVar.f15512a = f7;
            float f12 = og0Var.K;
            kVar.f15513b = f12;
            kVar.f15514c = true;
            o1.l lVar = kVar.f15522u;
            int i10 = og0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f15528i = dp;
            og0Var.M.f();
            o1.k kVar2 = og0Var.N;
            kVar2.f15512a = f7;
            kVar2.f15513b = og0Var.L;
            kVar2.f15514c = true;
            kVar2.f15522u.f15528i = w7.q.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - og0Var.I) - AndroidUtilities.dp(16.0f));
            og0Var.N.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        og0 og0Var = this.d;
        if (!og0Var.f26932w && og0Var.F == null && !og0Var.f26933x) {
            float abs = Math.abs(f7);
            float f11 = this.f26402c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                og0Var.f26932w = true;
                og0Var.M.c();
                og0Var.N.c();
                og0Var.f26922f0 = false;
                og0Var.i();
                AndroidUtilities.cancelRunOnUIThread(og0Var.f26924h0);
            }
        }
        if (og0Var.f26932w) {
            float f12 = og0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f26400a) - motionEvent.getRawX();
            og0Var.L = (motionEvent2.getRawY() + this.f26401b) - motionEvent.getRawY();
            int i10 = og0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = og0Var.f26919d0;
                if (z10) {
                    if (z10) {
                        og0Var.M.a(new ci.va(this, rawX, 2));
                        o1.k kVar = og0Var.M;
                        kVar.f15513b = f12;
                        kVar.f15514c = true;
                        kVar.f15522u.f15528i = rawX;
                        kVar.f();
                    }
                    og0Var.f26919d0 = false;
                    return true;
                }
                o1.k kVar2 = og0Var.M;
                if (kVar2.f15515f) {
                    kVar2.f15522u.f15528i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = og0Var.f26917c;
                    og0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) og0Var.n().f13384b).edit().putFloat("x", rawX).apply();
                }
                og0Var.f26917c.y = (int) og0Var.L;
                ((SharedPreferences) og0Var.n().f13384b).edit().putFloat("y", og0Var.L).apply();
                AndroidUtilities.updateViewLayout(og0Var.f26915b, og0Var.d, og0Var.f26917c);
                return true;
            }
            if (!og0Var.f26919d0) {
                o1.k kVar3 = og0Var.M;
                kVar3.f15513b = f12;
                kVar3.f15514c = true;
                o1.l lVar = kVar3.f15522u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - og0Var.H;
                }
                lVar.f15528i = dp;
                og0Var.M.f();
            }
            og0Var.f26919d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        og0 og0Var = this.d;
        ValueAnimator valueAnimator = og0Var.F;
        jg0 jg0Var = og0Var.f26926j0;
        if (valueAnimator == null) {
            if (og0Var.f26925i0) {
                AndroidUtilities.cancelRunOnUIThread(jg0Var);
                og0Var.f26925i0 = false;
            }
            boolean z10 = !og0Var.E;
            og0Var.E = z10;
            og0Var.y(z10);
            if (og0Var.E && !og0Var.f26925i0) {
                AndroidUtilities.runOnUIThread(jg0Var, 2500L);
                og0Var.f26925i0 = true;
            }
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (!a()) {
            onSingleTapConfirmed(motionEvent);
            return true;
        }
        return super.onSingleTapUp(motionEvent);
    }
}
