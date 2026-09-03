package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class lg0 extends n20 {
    public float f28753a;
    public float f28754b;
    public final int f28755c;
    public final ng0 d;

    public lg0(ng0 ng0Var, int i10) {
        this.d = ng0Var;
        this.f28755c = i10;
    }

    @Override
    public final boolean a() {
        ng0 ng0Var = this.d;
        PhotoViewer photoViewer = ng0Var.S;
        if (photoViewer != null) {
            if ((photoViewer.C2 != null || ng0Var.f29479r != null) && !ng0Var.Z && !ng0Var.V && !ng0Var.f29481w && !ng0Var.f29480s.isInProgress() && ng0Var.f29468c0) {
                long l10 = ng0Var.l();
                long m9 = ng0Var.m();
                if (l10 != -9223372036854775807L && m9 >= 15000) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lg0.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        ng0 ng0Var = this.d;
        if (ng0Var.B) {
            for (int i10 = 1; i10 < ng0Var.f29470e.getChildCount(); i10++) {
                View childAt = ng0Var.f29470e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    ng0Var.f29483y = childAt;
                    return true;
                }
            }
        }
        this.f28753a = ng0Var.H;
        this.f28754b = ng0Var.I;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float dp;
        float f12;
        ng0 ng0Var = this.d;
        if (ng0Var.f29481w && !ng0Var.f29482x) {
            o1.j jVar = ng0Var.J;
            jVar.f16328a = f10;
            float f13 = ng0Var.H;
            jVar.f16329b = f13;
            jVar.f16330c = true;
            o1.k kVar = jVar.f16338u;
            int i10 = ng0Var.E;
            float f14 = (f10 / 7.0f) + (i10 / 2.0f) + f13;
            int i11 = AndroidUtilities.displaySize.x;
            if (f14 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            kVar.f16345i = dp;
            ng0Var.J.f();
            o1.j jVar2 = ng0Var.K;
            jVar2.f16328a = f10;
            jVar2.f16329b = ng0Var.I;
            jVar2.f16330c = true;
            jVar2.f16338u.f16345i = k7.o.a((f11 / 10.0f) + f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ng0Var.F) - AndroidUtilities.dp(16.0f));
            ng0Var.K.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float dp;
        ng0 ng0Var = this.d;
        if (!ng0Var.f29481w && ng0Var.C == null && !ng0Var.f29482x) {
            float abs = Math.abs(f10);
            float f12 = this.f28755c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                ng0Var.f29481w = true;
                ng0Var.J.c();
                ng0Var.K.c();
                ng0Var.f29468c0 = false;
                ng0Var.i();
                AndroidUtilities.cancelRunOnUIThread(ng0Var.f29471e0);
            }
        }
        if (ng0Var.f29481w) {
            float f13 = ng0Var.H;
            float rawX = (motionEvent2.getRawX() + this.f28753a) - motionEvent.getRawX();
            ng0Var.I = (motionEvent2.getRawY() + this.f28754b) - motionEvent.getRawY();
            int i10 = ng0Var.E;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z4 = ng0Var.f29464a0;
                if (z4) {
                    if (z4) {
                        ng0Var.J.a(new kg0(this, rawX, 0));
                        o1.j jVar = ng0Var.J;
                        jVar.f16329b = f13;
                        jVar.f16330c = true;
                        jVar.f16338u.f16345i = rawX;
                        jVar.f();
                    }
                    ng0Var.f29464a0 = false;
                    return true;
                }
                o1.j jVar2 = ng0Var.J;
                if (jVar2.f16332f) {
                    jVar2.f16338u.f16345i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = ng0Var.f29467c;
                    ng0Var.H = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) ng0Var.n().f25257b).edit().putFloat("x", rawX).apply();
                }
                ng0Var.f29467c.y = (int) ng0Var.I;
                ((SharedPreferences) ng0Var.n().f25257b).edit().putFloat("y", ng0Var.I).apply();
                AndroidUtilities.updateViewLayout(ng0Var.f29465b, ng0Var.d, ng0Var.f29467c);
                return true;
            }
            if (!ng0Var.f29464a0) {
                o1.j jVar3 = ng0Var.J;
                jVar3.f16329b = f13;
                jVar3.f16330c = true;
                o1.k kVar = jVar3.f16338u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - ng0Var.E;
                }
                kVar.f16345i = dp;
                ng0Var.J.f();
            }
            ng0Var.f29464a0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ng0 ng0Var = this.d;
        ValueAnimator valueAnimator = ng0Var.C;
        gg0 gg0Var = ng0Var.f29474g0;
        if (valueAnimator == null) {
            if (ng0Var.f29473f0) {
                AndroidUtilities.cancelRunOnUIThread(gg0Var);
                ng0Var.f29473f0 = false;
            }
            boolean z4 = !ng0Var.B;
            ng0Var.B = z4;
            ng0Var.y(z4);
            if (ng0Var.B && !ng0Var.f29473f0) {
                AndroidUtilities.runOnUIThread(gg0Var, 2500L);
                ng0Var.f29473f0 = true;
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
