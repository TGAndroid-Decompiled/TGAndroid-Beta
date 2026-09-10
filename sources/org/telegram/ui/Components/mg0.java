package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class mg0 extends u20 {
    public float f25232a;
    public float f25233b;
    public final int f25234c;
    public final og0 d;

    public mg0(og0 og0Var, int i10) {
        this.d = og0Var;
        this.f25234c = i10;
    }

    @Override
    public final boolean a() {
        og0 og0Var = this.d;
        PhotoViewer photoViewer = og0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || og0Var.f25799r != null) && !og0Var.f25787c0 && !og0Var.Y && !og0Var.f25801w && !og0Var.f25800s.isInProgress() && og0Var.f25791f0) {
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
                    og0Var.f25803y = childAt;
                    return true;
                }
            }
        }
        this.f25232a = og0Var.K;
        this.f25233b = og0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        og0 og0Var = this.d;
        if (og0Var.f25801w && !og0Var.f25802x) {
            o1.k kVar = og0Var.M;
            kVar.f14124a = f7;
            float f12 = og0Var.K;
            kVar.f14125b = f12;
            kVar.f14126c = true;
            o1.l lVar = kVar.f14134u;
            int i10 = og0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f14140i = dp;
            og0Var.M.f();
            o1.k kVar2 = og0Var.N;
            kVar2.f14124a = f7;
            kVar2.f14125b = og0Var.L;
            kVar2.f14126c = true;
            kVar2.f14134u.f14140i = w7.q.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - og0Var.I) - AndroidUtilities.dp(16.0f));
            og0Var.N.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        og0 og0Var = this.d;
        if (!og0Var.f25801w && og0Var.F == null && !og0Var.f25802x) {
            float abs = Math.abs(f7);
            float f11 = this.f25234c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                og0Var.f25801w = true;
                og0Var.M.c();
                og0Var.N.c();
                og0Var.f25791f0 = false;
                og0Var.i();
                AndroidUtilities.cancelRunOnUIThread(og0Var.f25793h0);
            }
        }
        if (og0Var.f25801w) {
            float f12 = og0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f25232a) - motionEvent.getRawX();
            og0Var.L = (motionEvent2.getRawY() + this.f25233b) - motionEvent.getRawY();
            int i10 = og0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = og0Var.f25788d0;
                if (z10) {
                    if (z10) {
                        og0Var.M.a(new bi.ec(this, rawX, 2));
                        o1.k kVar = og0Var.M;
                        kVar.f14125b = f12;
                        kVar.f14126c = true;
                        kVar.f14134u.f14140i = rawX;
                        kVar.f();
                    }
                    og0Var.f25788d0 = false;
                    return true;
                }
                o1.k kVar2 = og0Var.M;
                if (kVar2.f14127f) {
                    kVar2.f14134u.f14140i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = og0Var.f25786c;
                    og0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    og0Var.n().f6123a.edit().putFloat("x", rawX).apply();
                }
                og0Var.f25786c.y = (int) og0Var.L;
                og0Var.n().f6123a.edit().putFloat("y", og0Var.L).apply();
                AndroidUtilities.updateViewLayout(og0Var.f25784b, og0Var.d, og0Var.f25786c);
                return true;
            }
            if (!og0Var.f25788d0) {
                o1.k kVar3 = og0Var.M;
                kVar3.f14125b = f12;
                kVar3.f14126c = true;
                o1.l lVar = kVar3.f14134u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - og0Var.H;
                }
                lVar.f14140i = dp;
                og0Var.M.f();
            }
            og0Var.f25788d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        og0 og0Var = this.d;
        ValueAnimator valueAnimator = og0Var.F;
        ig0 ig0Var = og0Var.f25795j0;
        if (valueAnimator == null) {
            if (og0Var.f25794i0) {
                AndroidUtilities.cancelRunOnUIThread(ig0Var);
                og0Var.f25794i0 = false;
            }
            boolean z10 = !og0Var.E;
            og0Var.E = z10;
            og0Var.y(z10);
            if (og0Var.E && !og0Var.f25794i0) {
                AndroidUtilities.runOnUIThread(ig0Var, 2500L);
                og0Var.f25794i0 = true;
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
