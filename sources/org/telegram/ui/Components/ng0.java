package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class ng0 extends n20 {
    public float f26786a;
    public float f26787b;
    public final int f26788c;
    public final pg0 d;

    public ng0(pg0 pg0Var, int i10) {
        this.d = pg0Var;
        this.f26788c = i10;
    }

    @Override
    public final boolean a() {
        pg0 pg0Var = this.d;
        PhotoViewer photoViewer = pg0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || pg0Var.f27371r != null) && !pg0Var.f27359c0 && !pg0Var.Y && !pg0Var.f27373w && !pg0Var.f27372s.isInProgress() && pg0Var.f27363f0) {
                long l4 = pg0Var.l();
                long m10 = pg0Var.m();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ng0.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        pg0 pg0Var = this.d;
        if (pg0Var.E) {
            for (int i10 = 1; i10 < pg0Var.e.getChildCount(); i10++) {
                View childAt = pg0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    pg0Var.f27375y = childAt;
                    return true;
                }
            }
        }
        this.f26786a = pg0Var.K;
        this.f26787b = pg0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        pg0 pg0Var = this.d;
        if (pg0Var.f27373w && !pg0Var.f27374x) {
            o1.k kVar = pg0Var.M;
            kVar.f15523a = f7;
            float f12 = pg0Var.K;
            kVar.f15524b = f12;
            kVar.f15525c = true;
            o1.l lVar = kVar.f15533u;
            int i10 = pg0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f15539i = dp;
            pg0Var.M.f();
            o1.k kVar2 = pg0Var.N;
            kVar2.f15523a = f7;
            kVar2.f15524b = pg0Var.L;
            kVar2.f15525c = true;
            kVar2.f15533u.f15539i = w7.q.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - pg0Var.I) - AndroidUtilities.dp(16.0f));
            pg0Var.N.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        pg0 pg0Var = this.d;
        if (!pg0Var.f27373w && pg0Var.F == null && !pg0Var.f27374x) {
            float abs = Math.abs(f7);
            float f11 = this.f26788c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                pg0Var.f27373w = true;
                pg0Var.M.c();
                pg0Var.N.c();
                pg0Var.f27363f0 = false;
                pg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(pg0Var.f27365h0);
            }
        }
        if (pg0Var.f27373w) {
            float f12 = pg0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f26786a) - motionEvent.getRawX();
            pg0Var.L = (motionEvent2.getRawY() + this.f26787b) - motionEvent.getRawY();
            int i10 = pg0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = pg0Var.f27360d0;
                if (z10) {
                    if (z10) {
                        pg0Var.M.a(new ci.sa(this, rawX, 2));
                        o1.k kVar = pg0Var.M;
                        kVar.f15524b = f12;
                        kVar.f15525c = true;
                        kVar.f15533u.f15539i = rawX;
                        kVar.f();
                    }
                    pg0Var.f27360d0 = false;
                    return true;
                }
                o1.k kVar2 = pg0Var.M;
                if (kVar2.f15526f) {
                    kVar2.f15533u.f15539i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = pg0Var.f27358c;
                    pg0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) pg0Var.n().f13369b).edit().putFloat("x", rawX).apply();
                }
                pg0Var.f27358c.y = (int) pg0Var.L;
                ((SharedPreferences) pg0Var.n().f13369b).edit().putFloat("y", pg0Var.L).apply();
                AndroidUtilities.updateViewLayout(pg0Var.f27356b, pg0Var.d, pg0Var.f27358c);
                return true;
            }
            if (!pg0Var.f27360d0) {
                o1.k kVar3 = pg0Var.M;
                kVar3.f15524b = f12;
                kVar3.f15525c = true;
                o1.l lVar = kVar3.f15533u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - pg0Var.H;
                }
                lVar.f15539i = dp;
                pg0Var.M.f();
            }
            pg0Var.f27360d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        pg0 pg0Var = this.d;
        ValueAnimator valueAnimator = pg0Var.F;
        kg0 kg0Var = pg0Var.f27367j0;
        if (valueAnimator == null) {
            if (pg0Var.f27366i0) {
                AndroidUtilities.cancelRunOnUIThread(kg0Var);
                pg0Var.f27366i0 = false;
            }
            boolean z10 = !pg0Var.E;
            pg0Var.E = z10;
            pg0Var.y(z10);
            if (pg0Var.E && !pg0Var.f27366i0) {
                AndroidUtilities.runOnUIThread(kg0Var, 2500L);
                pg0Var.f27366i0 = true;
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
