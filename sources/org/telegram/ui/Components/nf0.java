package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class nf0 extends w10 {
    public float f31088a;
    public float f31089b;
    public final int f31090c;
    public final pf0 d;

    public nf0(pf0 pf0Var, int i9) {
        this.d = pf0Var;
        this.f31090c = i9;
    }

    @Override
    public final boolean a() {
        pf0 pf0Var = this.d;
        PhotoViewer photoViewer = pf0Var.R;
        if (photoViewer != null) {
            if ((photoViewer.B2 != null || pf0Var.f31638r != null) && !pf0Var.Y && !pf0Var.U && !pf0Var.f31640w && !pf0Var.f31639s.isInProgress() && pf0Var.f31626b0) {
                long l10 = pf0Var.l();
                long m10 = pf0Var.m();
                if (l10 != -9223372036854775807L && m10 >= 15000) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nf0.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        pf0 pf0Var = this.d;
        if (pf0Var.A) {
            for (int i9 = 1; i9 < pf0Var.f31630e.getChildCount(); i9++) {
                View childAt = pf0Var.f31630e.getChildAt(i9);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    pf0Var.f31642y = childAt;
                    return true;
                }
            }
        }
        this.f31088a = pf0Var.G;
        this.f31089b = pf0Var.H;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float dp;
        float f12;
        pf0 pf0Var = this.d;
        if (pf0Var.f31640w && !pf0Var.f31641x) {
            o1.j jVar = pf0Var.I;
            jVar.f18790a = f10;
            float f13 = pf0Var.G;
            jVar.f18791b = f13;
            jVar.f18792c = true;
            o1.k kVar = jVar.f18800u;
            int i9 = pf0Var.D;
            float f14 = (f10 / 7.0f) + (i9 / 2.0f) + f13;
            int i10 = AndroidUtilities.displaySize.x;
            if (f14 >= i10 / 2.0f) {
                dp = (i10 - i9) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            kVar.f18807i = dp;
            pf0Var.I.f();
            o1.j jVar2 = pf0Var.J;
            jVar2.f18790a = f10;
            jVar2.f18791b = pf0Var.H;
            jVar2.f18792c = true;
            jVar2.f18800u.f18807i = g7.n.a((f11 / 10.0f) + f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - pf0Var.E) - AndroidUtilities.dp(16.0f));
            pf0Var.J.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float dp;
        pf0 pf0Var = this.d;
        if (!pf0Var.f31640w && pf0Var.B == null && !pf0Var.f31641x) {
            float abs = Math.abs(f10);
            float f12 = this.f31090c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                pf0Var.f31640w = true;
                pf0Var.I.c();
                pf0Var.J.c();
                pf0Var.f31626b0 = false;
                pf0Var.i();
                AndroidUtilities.cancelRunOnUIThread(pf0Var.f31629d0);
            }
        }
        if (pf0Var.f31640w) {
            float f13 = pf0Var.G;
            float rawX = (motionEvent2.getRawX() + this.f31088a) - motionEvent.getRawX();
            pf0Var.H = (motionEvent2.getRawY() + this.f31089b) - motionEvent.getRawY();
            int i9 = pf0Var.D;
            if (rawX > (-i9) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i9 * 0.75f)) {
                boolean z10 = pf0Var.Z;
                if (z10) {
                    if (z10) {
                        pf0Var.I.a(new kh.ga(this, rawX, 2));
                        o1.j jVar = pf0Var.I;
                        jVar.f18791b = f13;
                        jVar.f18792c = true;
                        jVar.f18800u.f18807i = rawX;
                        jVar.f();
                    }
                    pf0Var.Z = false;
                    return true;
                }
                o1.j jVar2 = pf0Var.I;
                if (jVar2.f18794f) {
                    jVar2.f18800u.f18807i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = pf0Var.f31627c;
                    pf0Var.G = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) pf0Var.n().f18488b).edit().putFloat("x", rawX).apply();
                }
                pf0Var.f31627c.y = (int) pf0Var.H;
                ((SharedPreferences) pf0Var.n().f18488b).edit().putFloat("y", pf0Var.H).apply();
                AndroidUtilities.updateViewLayout(pf0Var.f31625b, pf0Var.d, pf0Var.f31627c);
                return true;
            }
            if (!pf0Var.Z) {
                o1.j jVar3 = pf0Var.I;
                jVar3.f18791b = f13;
                jVar3.f18792c = true;
                o1.k kVar = jVar3.f18800u;
                int i10 = AndroidUtilities.displaySize.x;
                if ((i9 / 2.0f) + rawX >= i10 / 2.0f) {
                    dp = i10 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - pf0Var.D;
                }
                kVar.f18807i = dp;
                pf0Var.I.f();
            }
            pf0Var.Z = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        pf0 pf0Var = this.d;
        ValueAnimator valueAnimator = pf0Var.B;
        jf0 jf0Var = pf0Var.f31633f0;
        if (valueAnimator == null) {
            if (pf0Var.f31631e0) {
                AndroidUtilities.cancelRunOnUIThread(jf0Var);
                pf0Var.f31631e0 = false;
            }
            boolean z10 = !pf0Var.A;
            pf0Var.A = z10;
            pf0Var.y(z10);
            if (pf0Var.A && !pf0Var.f31631e0) {
                AndroidUtilities.runOnUIThread(jf0Var, 2500L);
                pf0Var.f31631e0 = true;
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
