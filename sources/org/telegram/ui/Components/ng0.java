package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class ng0 extends l20 {
    public float f26681a;
    public float f26682b;
    public final int f26683c;
    public final pg0 d;

    public ng0(pg0 pg0Var, int i10) {
        this.d = pg0Var;
        this.f26683c = i10;
    }

    @Override
    public final boolean a() {
        pg0 pg0Var = this.d;
        PhotoViewer photoViewer = pg0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || pg0Var.f27227r != null) && !pg0Var.f27215c0 && !pg0Var.Y && !pg0Var.f27229w && !pg0Var.f27228s.isInProgress() && pg0Var.f27219f0) {
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
                    pg0Var.f27231y = childAt;
                    return true;
                }
            }
        }
        this.f26681a = pg0Var.K;
        this.f26682b = pg0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        pg0 pg0Var = this.d;
        if (pg0Var.f27229w && !pg0Var.f27230x) {
            o1.k kVar = pg0Var.M;
            kVar.f15480a = f7;
            float f12 = pg0Var.K;
            kVar.f15481b = f12;
            kVar.f15482c = true;
            o1.l lVar = kVar.f15490u;
            int i10 = pg0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f15496i = dp;
            pg0Var.M.f();
            o1.k kVar2 = pg0Var.N;
            kVar2.f15480a = f7;
            kVar2.f15481b = pg0Var.L;
            kVar2.f15482c = true;
            kVar2.f15490u.f15496i = w7.q.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - pg0Var.I) - AndroidUtilities.dp(16.0f));
            pg0Var.N.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        pg0 pg0Var = this.d;
        if (!pg0Var.f27229w && pg0Var.F == null && !pg0Var.f27230x) {
            float abs = Math.abs(f7);
            float f11 = this.f26683c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                pg0Var.f27229w = true;
                pg0Var.M.c();
                pg0Var.N.c();
                pg0Var.f27219f0 = false;
                pg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(pg0Var.f27221h0);
            }
        }
        if (pg0Var.f27229w) {
            float f12 = pg0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f26681a) - motionEvent.getRawX();
            pg0Var.L = (motionEvent2.getRawY() + this.f26682b) - motionEvent.getRawY();
            int i10 = pg0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = pg0Var.f27216d0;
                if (z10) {
                    if (z10) {
                        pg0Var.M.a(new ci.va(this, rawX, 2));
                        o1.k kVar = pg0Var.M;
                        kVar.f15481b = f12;
                        kVar.f15482c = true;
                        kVar.f15490u.f15496i = rawX;
                        kVar.f();
                    }
                    pg0Var.f27216d0 = false;
                    return true;
                }
                o1.k kVar2 = pg0Var.M;
                if (kVar2.f15483f) {
                    kVar2.f15490u.f15496i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = pg0Var.f27214c;
                    pg0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) pg0Var.n().f13383b).edit().putFloat("x", rawX).apply();
                }
                pg0Var.f27214c.y = (int) pg0Var.L;
                ((SharedPreferences) pg0Var.n().f13383b).edit().putFloat("y", pg0Var.L).apply();
                AndroidUtilities.updateViewLayout(pg0Var.f27212b, pg0Var.d, pg0Var.f27214c);
                return true;
            }
            if (!pg0Var.f27216d0) {
                o1.k kVar3 = pg0Var.M;
                kVar3.f15481b = f12;
                kVar3.f15482c = true;
                o1.l lVar = kVar3.f15490u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - pg0Var.H;
                }
                lVar.f15496i = dp;
                pg0Var.M.f();
            }
            pg0Var.f27216d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        pg0 pg0Var = this.d;
        ValueAnimator valueAnimator = pg0Var.F;
        kg0 kg0Var = pg0Var.f27223j0;
        if (valueAnimator == null) {
            if (pg0Var.f27222i0) {
                AndroidUtilities.cancelRunOnUIThread(kg0Var);
                pg0Var.f27222i0 = false;
            }
            boolean z10 = !pg0Var.E;
            pg0Var.E = z10;
            pg0Var.y(z10);
            if (pg0Var.E && !pg0Var.f27222i0) {
                AndroidUtilities.runOnUIThread(kg0Var, 2500L);
                pg0Var.f27222i0 = true;
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
