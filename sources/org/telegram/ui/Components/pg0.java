package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class pg0 extends p20 {
    public float f27345a;
    public float f27346b;
    public final int f27347c;
    public final rg0 d;

    public pg0(rg0 rg0Var, int i10) {
        this.d = rg0Var;
        this.f27347c = i10;
    }

    @Override
    public final boolean a() {
        rg0 rg0Var = this.d;
        PhotoViewer photoViewer = rg0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || rg0Var.f28005r != null) && !rg0Var.f27993c0 && !rg0Var.Y && !rg0Var.f28007w && !rg0Var.f28006s.isInProgress() && rg0Var.f27997f0) {
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
                    rg0Var.f28009y = childAt;
                    return true;
                }
            }
        }
        this.f27345a = rg0Var.K;
        this.f27346b = rg0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        rg0 rg0Var = this.d;
        if (rg0Var.f28007w && !rg0Var.f28008x) {
            o1.k kVar = rg0Var.M;
            kVar.f15539a = f7;
            float f12 = rg0Var.K;
            kVar.f15540b = f12;
            kVar.f15541c = true;
            o1.l lVar = kVar.f15549u;
            int i10 = rg0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f15555i = dp;
            rg0Var.M.f();
            o1.k kVar2 = rg0Var.N;
            kVar2.f15539a = f7;
            kVar2.f15540b = rg0Var.L;
            kVar2.f15541c = true;
            kVar2.f15549u.f15555i = w7.q.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - rg0Var.I) - AndroidUtilities.dp(16.0f));
            rg0Var.N.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        rg0 rg0Var = this.d;
        if (!rg0Var.f28007w && rg0Var.F == null && !rg0Var.f28008x) {
            float abs = Math.abs(f7);
            float f11 = this.f27347c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                rg0Var.f28007w = true;
                rg0Var.M.c();
                rg0Var.N.c();
                rg0Var.f27997f0 = false;
                rg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(rg0Var.f27999h0);
            }
        }
        if (rg0Var.f28007w) {
            float f12 = rg0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f27345a) - motionEvent.getRawX();
            rg0Var.L = (motionEvent2.getRawY() + this.f27346b) - motionEvent.getRawY();
            int i10 = rg0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = rg0Var.f27994d0;
                if (z10) {
                    if (z10) {
                        rg0Var.M.a(new ci.sa(this, rawX, 2));
                        o1.k kVar = rg0Var.M;
                        kVar.f15540b = f12;
                        kVar.f15541c = true;
                        kVar.f15549u.f15555i = rawX;
                        kVar.f();
                    }
                    rg0Var.f27994d0 = false;
                    return true;
                }
                o1.k kVar2 = rg0Var.M;
                if (kVar2.f15542f) {
                    kVar2.f15549u.f15555i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = rg0Var.f27992c;
                    rg0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) rg0Var.n().f13384b).edit().putFloat("x", rawX).apply();
                }
                rg0Var.f27992c.y = (int) rg0Var.L;
                ((SharedPreferences) rg0Var.n().f13384b).edit().putFloat("y", rg0Var.L).apply();
                AndroidUtilities.updateViewLayout(rg0Var.f27990b, rg0Var.d, rg0Var.f27992c);
                return true;
            }
            if (!rg0Var.f27994d0) {
                o1.k kVar3 = rg0Var.M;
                kVar3.f15540b = f12;
                kVar3.f15541c = true;
                o1.l lVar = kVar3.f15549u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - rg0Var.H;
                }
                lVar.f15555i = dp;
                rg0Var.M.f();
            }
            rg0Var.f27994d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        rg0 rg0Var = this.d;
        ValueAnimator valueAnimator = rg0Var.F;
        mg0 mg0Var = rg0Var.f28001j0;
        if (valueAnimator == null) {
            if (rg0Var.f28000i0) {
                AndroidUtilities.cancelRunOnUIThread(mg0Var);
                rg0Var.f28000i0 = false;
            }
            boolean z10 = !rg0Var.E;
            rg0Var.E = z10;
            rg0Var.y(z10);
            if (rg0Var.E && !rg0Var.f28000i0) {
                AndroidUtilities.runOnUIThread(mg0Var, 2500L);
                rg0Var.f28000i0 = true;
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
