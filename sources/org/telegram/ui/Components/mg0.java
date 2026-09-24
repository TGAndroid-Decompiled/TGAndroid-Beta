package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class mg0 extends m20 {
    public float f26480a;
    public float f26481b;
    public final int f26482c;
    public final og0 d;

    public mg0(og0 og0Var, int i10) {
        this.d = og0Var;
        this.f26482c = i10;
    }

    @Override
    public final boolean a() {
        og0 og0Var = this.d;
        PhotoViewer photoViewer = og0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || og0Var.f27060r != null) && !og0Var.f27048c0 && !og0Var.Y && !og0Var.f27062w && !og0Var.f27061s.isInProgress() && og0Var.f27052f0) {
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
                    og0Var.f27064y = childAt;
                    return true;
                }
            }
        }
        this.f26480a = og0Var.K;
        this.f26481b = og0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        og0 og0Var = this.d;
        if (og0Var.f27062w && !og0Var.f27063x) {
            o1.k kVar = og0Var.M;
            kVar.f15508a = f7;
            float f12 = og0Var.K;
            kVar.f15509b = f12;
            kVar.f15510c = true;
            o1.l lVar = kVar.f15518u;
            int i10 = og0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f15524i = dp;
            og0Var.M.f();
            o1.k kVar2 = og0Var.N;
            kVar2.f15508a = f7;
            kVar2.f15509b = og0Var.L;
            kVar2.f15510c = true;
            kVar2.f15518u.f15524i = w7.q.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - og0Var.I) - AndroidUtilities.dp(16.0f));
            og0Var.N.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        og0 og0Var = this.d;
        if (!og0Var.f27062w && og0Var.F == null && !og0Var.f27063x) {
            float abs = Math.abs(f7);
            float f11 = this.f26482c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                og0Var.f27062w = true;
                og0Var.M.c();
                og0Var.N.c();
                og0Var.f27052f0 = false;
                og0Var.i();
                AndroidUtilities.cancelRunOnUIThread(og0Var.f27054h0);
            }
        }
        if (og0Var.f27062w) {
            float f12 = og0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f26480a) - motionEvent.getRawX();
            og0Var.L = (motionEvent2.getRawY() + this.f26481b) - motionEvent.getRawY();
            int i10 = og0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = og0Var.f27049d0;
                if (z10) {
                    if (z10) {
                        og0Var.M.a(new ci.sa(this, rawX, 2));
                        o1.k kVar = og0Var.M;
                        kVar.f15509b = f12;
                        kVar.f15510c = true;
                        kVar.f15518u.f15524i = rawX;
                        kVar.f();
                    }
                    og0Var.f27049d0 = false;
                    return true;
                }
                o1.k kVar2 = og0Var.M;
                if (kVar2.f15511f) {
                    kVar2.f15518u.f15524i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = og0Var.f27047c;
                    og0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) og0Var.n().f13369b).edit().putFloat("x", rawX).apply();
                }
                og0Var.f27047c.y = (int) og0Var.L;
                ((SharedPreferences) og0Var.n().f13369b).edit().putFloat("y", og0Var.L).apply();
                AndroidUtilities.updateViewLayout(og0Var.f27045b, og0Var.d, og0Var.f27047c);
                return true;
            }
            if (!og0Var.f27049d0) {
                o1.k kVar3 = og0Var.M;
                kVar3.f15509b = f12;
                kVar3.f15510c = true;
                o1.l lVar = kVar3.f15518u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - og0Var.H;
                }
                lVar.f15524i = dp;
                og0Var.M.f();
            }
            og0Var.f27049d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        og0 og0Var = this.d;
        ValueAnimator valueAnimator = og0Var.F;
        jg0 jg0Var = og0Var.f27056j0;
        if (valueAnimator == null) {
            if (og0Var.f27055i0) {
                AndroidUtilities.cancelRunOnUIThread(jg0Var);
                og0Var.f27055i0 = false;
            }
            boolean z10 = !og0Var.E;
            og0Var.E = z10;
            og0Var.y(z10);
            if (og0Var.E && !og0Var.f27055i0) {
                AndroidUtilities.runOnUIThread(jg0Var, 2500L);
                og0Var.f27055i0 = true;
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
