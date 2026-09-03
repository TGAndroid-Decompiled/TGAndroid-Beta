package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class kg0 extends n20 {
    public float f26278a;
    public float f26279b;
    public final int f26280c;
    public final mg0 d;

    public kg0(mg0 mg0Var, int i10) {
        this.d = mg0Var;
        this.f26280c = i10;
    }

    @Override
    public final boolean a() {
        mg0 mg0Var = this.d;
        PhotoViewer photoViewer = mg0Var.S;
        if (photoViewer != null) {
            if ((photoViewer.C2 != null || mg0Var.f27052r != null) && !mg0Var.Z && !mg0Var.V && !mg0Var.f27054w && !mg0Var.f27053s.isInProgress() && mg0Var.f27042c0) {
                long l10 = mg0Var.l();
                long m9 = mg0Var.m();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kg0.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        mg0 mg0Var = this.d;
        if (mg0Var.B) {
            for (int i10 = 1; i10 < mg0Var.e.getChildCount(); i10++) {
                View childAt = mg0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    mg0Var.f27056y = childAt;
                    return true;
                }
            }
        }
        this.f26278a = mg0Var.H;
        this.f26279b = mg0Var.I;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float dp;
        float f12;
        mg0 mg0Var = this.d;
        if (mg0Var.f27054w && !mg0Var.f27055x) {
            o1.j jVar = mg0Var.J;
            jVar.f16169a = f10;
            float f13 = mg0Var.H;
            jVar.f16170b = f13;
            jVar.f16171c = true;
            o1.k kVar = jVar.f16178u;
            int i10 = mg0Var.E;
            float f14 = (f10 / 7.0f) + (i10 / 2.0f) + f13;
            int i11 = AndroidUtilities.displaySize.x;
            if (f14 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            kVar.f16184i = dp;
            mg0Var.J.f();
            o1.j jVar2 = mg0Var.K;
            jVar2.f16169a = f10;
            jVar2.f16170b = mg0Var.I;
            jVar2.f16171c = true;
            jVar2.f16178u.f16184i = k7.n.a((f11 / 10.0f) + f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - mg0Var.F) - AndroidUtilities.dp(16.0f));
            mg0Var.K.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float dp;
        mg0 mg0Var = this.d;
        if (!mg0Var.f27054w && mg0Var.C == null && !mg0Var.f27055x) {
            float abs = Math.abs(f10);
            float f12 = this.f26280c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                mg0Var.f27054w = true;
                mg0Var.J.c();
                mg0Var.K.c();
                mg0Var.f27042c0 = false;
                mg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(mg0Var.f27044e0);
            }
        }
        if (mg0Var.f27054w) {
            float f13 = mg0Var.H;
            float rawX = (motionEvent2.getRawX() + this.f26278a) - motionEvent.getRawX();
            mg0Var.I = (motionEvent2.getRawY() + this.f26279b) - motionEvent.getRawY();
            int i10 = mg0Var.E;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z4 = mg0Var.f27038a0;
                if (z4) {
                    if (z4) {
                        mg0Var.J.a(new jg0(this, rawX, 0));
                        o1.j jVar = mg0Var.J;
                        jVar.f16170b = f13;
                        jVar.f16171c = true;
                        jVar.f16178u.f16184i = rawX;
                        jVar.f();
                    }
                    mg0Var.f27038a0 = false;
                    return true;
                }
                o1.j jVar2 = mg0Var.J;
                if (jVar2.f16172f) {
                    jVar2.f16178u.f16184i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = mg0Var.f27041c;
                    mg0Var.H = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) mg0Var.n().f16195b).edit().putFloat("x", rawX).apply();
                }
                mg0Var.f27041c.y = (int) mg0Var.I;
                ((SharedPreferences) mg0Var.n().f16195b).edit().putFloat("y", mg0Var.I).apply();
                AndroidUtilities.updateViewLayout(mg0Var.f27039b, mg0Var.d, mg0Var.f27041c);
                return true;
            }
            if (!mg0Var.f27038a0) {
                o1.j jVar3 = mg0Var.J;
                jVar3.f16170b = f13;
                jVar3.f16171c = true;
                o1.k kVar = jVar3.f16178u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - mg0Var.E;
                }
                kVar.f16184i = dp;
                mg0Var.J.f();
            }
            mg0Var.f27038a0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        mg0 mg0Var = this.d;
        ValueAnimator valueAnimator = mg0Var.C;
        fg0 fg0Var = mg0Var.f27047g0;
        if (valueAnimator == null) {
            if (mg0Var.f27046f0) {
                AndroidUtilities.cancelRunOnUIThread(fg0Var);
                mg0Var.f27046f0 = false;
            }
            boolean z4 = !mg0Var.B;
            mg0Var.B = z4;
            mg0Var.y(z4);
            if (mg0Var.B && !mg0Var.f27046f0) {
                AndroidUtilities.runOnUIThread(fg0Var, 2500L);
                mg0Var.f27046f0 = true;
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
