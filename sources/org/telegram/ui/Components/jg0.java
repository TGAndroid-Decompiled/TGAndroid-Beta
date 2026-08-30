package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class jg0 extends m20 {
    public float f25975a;
    public float f25976b;
    public final int f25977c;
    public final lg0 d;

    public jg0(lg0 lg0Var, int i10) {
        this.d = lg0Var;
        this.f25977c = i10;
    }

    @Override
    public final boolean a() {
        lg0 lg0Var = this.d;
        PhotoViewer photoViewer = lg0Var.S;
        if (photoViewer != null) {
            if ((photoViewer.C2 != null || lg0Var.f26673r != null) && !lg0Var.Z && !lg0Var.V && !lg0Var.f26675w && !lg0Var.f26674s.isInProgress() && lg0Var.f26663c0) {
                long l10 = lg0Var.l();
                long m9 = lg0Var.m();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jg0.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        lg0 lg0Var = this.d;
        if (lg0Var.B) {
            for (int i10 = 1; i10 < lg0Var.e.getChildCount(); i10++) {
                View childAt = lg0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    lg0Var.f26677y = childAt;
                    return true;
                }
            }
        }
        this.f25975a = lg0Var.H;
        this.f25976b = lg0Var.I;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float dp;
        float f12;
        lg0 lg0Var = this.d;
        if (lg0Var.f26675w && !lg0Var.f26676x) {
            o1.j jVar = lg0Var.J;
            jVar.f16189a = f10;
            float f13 = lg0Var.H;
            jVar.f16190b = f13;
            jVar.f16191c = true;
            o1.k kVar = jVar.f16198u;
            int i10 = lg0Var.E;
            float f14 = (f10 / 7.0f) + (i10 / 2.0f) + f13;
            int i11 = AndroidUtilities.displaySize.x;
            if (f14 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            kVar.f16204i = dp;
            lg0Var.J.f();
            o1.j jVar2 = lg0Var.K;
            jVar2.f16189a = f10;
            jVar2.f16190b = lg0Var.I;
            jVar2.f16191c = true;
            jVar2.f16198u.f16204i = k7.n.a((f11 / 10.0f) + f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - lg0Var.F) - AndroidUtilities.dp(16.0f));
            lg0Var.K.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float dp;
        lg0 lg0Var = this.d;
        if (!lg0Var.f26675w && lg0Var.C == null && !lg0Var.f26676x) {
            float abs = Math.abs(f10);
            float f12 = this.f25977c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                lg0Var.f26675w = true;
                lg0Var.J.c();
                lg0Var.K.c();
                lg0Var.f26663c0 = false;
                lg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(lg0Var.f26665e0);
            }
        }
        if (lg0Var.f26675w) {
            float f13 = lg0Var.H;
            float rawX = (motionEvent2.getRawX() + this.f25975a) - motionEvent.getRawX();
            lg0Var.I = (motionEvent2.getRawY() + this.f25976b) - motionEvent.getRawY();
            int i10 = lg0Var.E;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z4 = lg0Var.f26659a0;
                if (z4) {
                    if (z4) {
                        lg0Var.J.a(new ig0(this, rawX, 0));
                        o1.j jVar = lg0Var.J;
                        jVar.f16190b = f13;
                        jVar.f16191c = true;
                        jVar.f16198u.f16204i = rawX;
                        jVar.f();
                    }
                    lg0Var.f26659a0 = false;
                    return true;
                }
                o1.j jVar2 = lg0Var.J;
                if (jVar2.f16192f) {
                    jVar2.f16198u.f16204i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = lg0Var.f26662c;
                    lg0Var.H = rawX;
                    layoutParams.x = (int) rawX;
                    lg0Var.n().f4033a.edit().putFloat("x", rawX).apply();
                }
                lg0Var.f26662c.y = (int) lg0Var.I;
                lg0Var.n().f4033a.edit().putFloat("y", lg0Var.I).apply();
                AndroidUtilities.updateViewLayout(lg0Var.f26660b, lg0Var.d, lg0Var.f26662c);
                return true;
            }
            if (!lg0Var.f26659a0) {
                o1.j jVar3 = lg0Var.J;
                jVar3.f16190b = f13;
                jVar3.f16191c = true;
                o1.k kVar = jVar3.f16198u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - lg0Var.E;
                }
                kVar.f16204i = dp;
                lg0Var.J.f();
            }
            lg0Var.f26659a0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        lg0 lg0Var = this.d;
        ValueAnimator valueAnimator = lg0Var.C;
        eg0 eg0Var = lg0Var.f26668g0;
        if (valueAnimator == null) {
            if (lg0Var.f26667f0) {
                AndroidUtilities.cancelRunOnUIThread(eg0Var);
                lg0Var.f26667f0 = false;
            }
            boolean z4 = !lg0Var.B;
            lg0Var.B = z4;
            lg0Var.y(z4);
            if (lg0Var.B && !lg0Var.f26667f0) {
                AndroidUtilities.runOnUIThread(eg0Var, 2500L);
                lg0Var.f26667f0 = true;
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
