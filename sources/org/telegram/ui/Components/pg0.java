package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class pg0 extends l20 {
    public float f27350a;
    public float f27351b;
    public final int f27352c;
    public final rg0 d;

    public pg0(rg0 rg0Var, int i10) {
        this.d = rg0Var;
        this.f27352c = i10;
    }

    @Override
    public final boolean a() {
        rg0 rg0Var = this.d;
        PhotoViewer photoViewer = rg0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || rg0Var.f27978r != null) && !rg0Var.f27966c0 && !rg0Var.Y && !rg0Var.f27980w && !rg0Var.f27979s.isInProgress() && rg0Var.f27970f0) {
                long l4 = rg0Var.l();
                long m10 = rg0Var.m();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pg0.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        rg0 rg0Var = this.d;
        if (rg0Var.E) {
            for (int i10 = 1; i10 < rg0Var.e.getChildCount(); i10++) {
                View childAt = rg0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    rg0Var.f27982y = childAt;
                    return true;
                }
            }
        }
        this.f27350a = rg0Var.K;
        this.f27351b = rg0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        rg0 rg0Var = this.d;
        if (rg0Var.f27980w && !rg0Var.f27981x) {
            o1.k kVar = rg0Var.M;
            kVar.f15527a = f7;
            float f12 = rg0Var.K;
            kVar.f15528b = f12;
            kVar.f15529c = true;
            o1.l lVar = kVar.f15537u;
            int i10 = rg0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f15543i = dp;
            rg0Var.M.f();
            o1.k kVar2 = rg0Var.N;
            kVar2.f15527a = f7;
            kVar2.f15528b = rg0Var.L;
            kVar2.f15529c = true;
            kVar2.f15537u.f15543i = w7.q.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - rg0Var.I) - AndroidUtilities.dp(16.0f));
            rg0Var.N.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        rg0 rg0Var = this.d;
        if (!rg0Var.f27980w && rg0Var.F == null && !rg0Var.f27981x) {
            float abs = Math.abs(f7);
            float f11 = this.f27352c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                rg0Var.f27980w = true;
                rg0Var.M.c();
                rg0Var.N.c();
                rg0Var.f27970f0 = false;
                rg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(rg0Var.f27972h0);
            }
        }
        if (rg0Var.f27980w) {
            float f12 = rg0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f27350a) - motionEvent.getRawX();
            rg0Var.L = (motionEvent2.getRawY() + this.f27351b) - motionEvent.getRawY();
            int i10 = rg0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = rg0Var.f27967d0;
                if (z10) {
                    if (z10) {
                        rg0Var.M.a(new ci.va(this, rawX, 2));
                        o1.k kVar = rg0Var.M;
                        kVar.f15528b = f12;
                        kVar.f15529c = true;
                        kVar.f15537u.f15543i = rawX;
                        kVar.f();
                    }
                    rg0Var.f27967d0 = false;
                    return true;
                }
                o1.k kVar2 = rg0Var.M;
                if (kVar2.f15530f) {
                    kVar2.f15537u.f15543i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = rg0Var.f27965c;
                    rg0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) rg0Var.n().f13244b).edit().putFloat("x", rawX).apply();
                }
                rg0Var.f27965c.y = (int) rg0Var.L;
                ((SharedPreferences) rg0Var.n().f13244b).edit().putFloat("y", rg0Var.L).apply();
                AndroidUtilities.updateViewLayout(rg0Var.f27963b, rg0Var.d, rg0Var.f27965c);
                return true;
            }
            if (!rg0Var.f27967d0) {
                o1.k kVar3 = rg0Var.M;
                kVar3.f15528b = f12;
                kVar3.f15529c = true;
                o1.l lVar = kVar3.f15537u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - rg0Var.H;
                }
                lVar.f15543i = dp;
                rg0Var.M.f();
            }
            rg0Var.f27967d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        rg0 rg0Var = this.d;
        ValueAnimator valueAnimator = rg0Var.F;
        mg0 mg0Var = rg0Var.f27974j0;
        if (valueAnimator == null) {
            if (rg0Var.f27973i0) {
                AndroidUtilities.cancelRunOnUIThread(mg0Var);
                rg0Var.f27973i0 = false;
            }
            boolean z10 = !rg0Var.E;
            rg0Var.E = z10;
            rg0Var.y(z10);
            if (rg0Var.E && !rg0Var.f27973i0) {
                AndroidUtilities.runOnUIThread(mg0Var, 2500L);
                rg0Var.f27973i0 = true;
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
