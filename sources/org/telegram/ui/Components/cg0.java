package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class cg0 extends l20 {
    public float f25006a;
    public float f25007b;
    public final int f25008c;
    public final eg0 d;

    public cg0(eg0 eg0Var, int i10) {
        this.d = eg0Var;
        this.f25008c = i10;
    }

    @Override
    public final boolean a() {
        eg0 eg0Var = this.d;
        PhotoViewer photoViewer = eg0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || eg0Var.f25694r != null) && !eg0Var.f25681c0 && !eg0Var.Y && !eg0Var.f25696w && !eg0Var.f25695s.isInProgress() && eg0Var.f25686f0) {
                long l4 = eg0Var.l();
                long m10 = eg0Var.m();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cg0.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        eg0 eg0Var = this.d;
        if (eg0Var.E) {
            for (int i10 = 1; i10 < eg0Var.f25683e.getChildCount(); i10++) {
                View childAt = eg0Var.f25683e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    eg0Var.f25698y = childAt;
                    return true;
                }
            }
        }
        this.f25006a = eg0Var.K;
        this.f25007b = eg0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        eg0 eg0Var = this.d;
        if (eg0Var.f25696w && !eg0Var.f25697x) {
            o1.k kVar = eg0Var.M;
            kVar.f16814a = f7;
            float f12 = eg0Var.K;
            kVar.f16815b = f12;
            kVar.f16816c = true;
            o1.l lVar = kVar.f16825u;
            int i10 = eg0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f16832i = dp;
            eg0Var.M.f();
            o1.k kVar2 = eg0Var.N;
            kVar2.f16814a = f7;
            kVar2.f16815b = eg0Var.L;
            kVar2.f16816c = true;
            kVar2.f16825u.f16832i = w7.p.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - eg0Var.I) - AndroidUtilities.dp(16.0f));
            eg0Var.N.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        eg0 eg0Var = this.d;
        if (!eg0Var.f25696w && eg0Var.F == null && !eg0Var.f25697x) {
            float abs = Math.abs(f7);
            float f11 = this.f25008c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                eg0Var.f25696w = true;
                eg0Var.M.c();
                eg0Var.N.c();
                eg0Var.f25686f0 = false;
                eg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(eg0Var.f25688h0);
            }
        }
        if (eg0Var.f25696w) {
            float f12 = eg0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f25006a) - motionEvent.getRawX();
            eg0Var.L = (motionEvent2.getRawY() + this.f25007b) - motionEvent.getRawY();
            int i10 = eg0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = eg0Var.f25682d0;
                if (z10) {
                    if (z10) {
                        eg0Var.M.a(new di.va(this, rawX, 2));
                        o1.k kVar = eg0Var.M;
                        kVar.f16815b = f12;
                        kVar.f16816c = true;
                        kVar.f16825u.f16832i = rawX;
                        kVar.f();
                    }
                    eg0Var.f25682d0 = false;
                    return true;
                }
                o1.k kVar2 = eg0Var.M;
                if (kVar2.f16818f) {
                    kVar2.f16825u.f16832i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = eg0Var.f25680c;
                    eg0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) eg0Var.n().f16292b).edit().putFloat("x", rawX).apply();
                }
                eg0Var.f25680c.y = (int) eg0Var.L;
                ((SharedPreferences) eg0Var.n().f16292b).edit().putFloat("y", eg0Var.L).apply();
                AndroidUtilities.updateViewLayout(eg0Var.f25678b, eg0Var.d, eg0Var.f25680c);
                return true;
            }
            if (!eg0Var.f25682d0) {
                o1.k kVar3 = eg0Var.M;
                kVar3.f16815b = f12;
                kVar3.f16816c = true;
                o1.l lVar = kVar3.f16825u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - eg0Var.H;
                }
                lVar.f16832i = dp;
                eg0Var.M.f();
            }
            eg0Var.f25682d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        eg0 eg0Var = this.d;
        ValueAnimator valueAnimator = eg0Var.F;
        zf0 zf0Var = eg0Var.f25690j0;
        if (valueAnimator == null) {
            if (eg0Var.f25689i0) {
                AndroidUtilities.cancelRunOnUIThread(zf0Var);
                eg0Var.f25689i0 = false;
            }
            boolean z10 = !eg0Var.E;
            eg0Var.E = z10;
            eg0Var.y(z10);
            if (eg0Var.E && !eg0Var.f25689i0) {
                AndroidUtilities.runOnUIThread(zf0Var, 2500L);
                eg0Var.f25689i0 = true;
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
