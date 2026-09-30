package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class og0 extends o20 {
    public float f27058a;
    public float f27059b;
    public final int f27060c;
    public final qg0 d;

    public og0(qg0 qg0Var, int i10) {
        this.d = qg0Var;
        this.f27060c = i10;
    }

    @Override
    public final boolean a() {
        qg0 qg0Var = this.d;
        PhotoViewer photoViewer = qg0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || qg0Var.f27700r != null) && !qg0Var.f27688c0 && !qg0Var.Y && !qg0Var.f27702w && !qg0Var.f27701s.isInProgress() && qg0Var.f27692f0) {
                long l4 = qg0Var.l();
                long m10 = qg0Var.m();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.og0.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        qg0 qg0Var = this.d;
        if (qg0Var.E) {
            for (int i10 = 1; i10 < qg0Var.e.getChildCount(); i10++) {
                View childAt = qg0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    qg0Var.f27704y = childAt;
                    return true;
                }
            }
        }
        this.f27058a = qg0Var.K;
        this.f27059b = qg0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        qg0 qg0Var = this.d;
        if (qg0Var.f27702w && !qg0Var.f27703x) {
            o1.k kVar = qg0Var.M;
            kVar.f15524a = f7;
            float f12 = qg0Var.K;
            kVar.f15525b = f12;
            kVar.f15526c = true;
            o1.l lVar = kVar.f15534u;
            int i10 = qg0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f15540i = dp;
            qg0Var.M.f();
            o1.k kVar2 = qg0Var.N;
            kVar2.f15524a = f7;
            kVar2.f15525b = qg0Var.L;
            kVar2.f15526c = true;
            kVar2.f15534u.f15540i = w7.q.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - qg0Var.I) - AndroidUtilities.dp(16.0f));
            qg0Var.N.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        qg0 qg0Var = this.d;
        if (!qg0Var.f27702w && qg0Var.F == null && !qg0Var.f27703x) {
            float abs = Math.abs(f7);
            float f11 = this.f27060c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                qg0Var.f27702w = true;
                qg0Var.M.c();
                qg0Var.N.c();
                qg0Var.f27692f0 = false;
                qg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(qg0Var.f27694h0);
            }
        }
        if (qg0Var.f27702w) {
            float f12 = qg0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f27058a) - motionEvent.getRawX();
            qg0Var.L = (motionEvent2.getRawY() + this.f27059b) - motionEvent.getRawY();
            int i10 = qg0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = qg0Var.f27689d0;
                if (z10) {
                    if (z10) {
                        qg0Var.M.a(new ci.sa(this, rawX, 2));
                        o1.k kVar = qg0Var.M;
                        kVar.f15525b = f12;
                        kVar.f15526c = true;
                        kVar.f15534u.f15540i = rawX;
                        kVar.f();
                    }
                    qg0Var.f27689d0 = false;
                    return true;
                }
                o1.k kVar2 = qg0Var.M;
                if (kVar2.f15527f) {
                    kVar2.f15534u.f15540i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = qg0Var.f27687c;
                    qg0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) qg0Var.n().f13369b).edit().putFloat("x", rawX).apply();
                }
                qg0Var.f27687c.y = (int) qg0Var.L;
                ((SharedPreferences) qg0Var.n().f13369b).edit().putFloat("y", qg0Var.L).apply();
                AndroidUtilities.updateViewLayout(qg0Var.f27685b, qg0Var.d, qg0Var.f27687c);
                return true;
            }
            if (!qg0Var.f27689d0) {
                o1.k kVar3 = qg0Var.M;
                kVar3.f15525b = f12;
                kVar3.f15526c = true;
                o1.l lVar = kVar3.f15534u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - qg0Var.H;
                }
                lVar.f15540i = dp;
                qg0Var.M.f();
            }
            qg0Var.f27689d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        qg0 qg0Var = this.d;
        ValueAnimator valueAnimator = qg0Var.F;
        lg0 lg0Var = qg0Var.f27696j0;
        if (valueAnimator == null) {
            if (qg0Var.f27695i0) {
                AndroidUtilities.cancelRunOnUIThread(lg0Var);
                qg0Var.f27695i0 = false;
            }
            boolean z10 = !qg0Var.E;
            qg0Var.E = z10;
            qg0Var.y(z10);
            if (qg0Var.E && !qg0Var.f27695i0) {
                AndroidUtilities.runOnUIThread(lg0Var, 2500L);
                qg0Var.f27695i0 = true;
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
