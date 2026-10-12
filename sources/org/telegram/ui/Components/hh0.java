package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;
public final class hh0 extends f30 {
    public float f26778a;
    public float f26779b;
    public final int f26780c;
    public final jh0 d;

    public hh0(jh0 jh0Var, int i10) {
        this.d = jh0Var;
        this.f26780c = i10;
    }

    @Override
    public final boolean a() {
        jh0 jh0Var = this.d;
        PhotoViewer photoViewer = jh0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || jh0Var.f27516r != null) && !jh0Var.f27503c0 && !jh0Var.Y && !jh0Var.f27518w && !jh0Var.f27517s.isInProgress() && jh0Var.f27508f0) {
                long l4 = jh0Var.l();
                long m10 = jh0Var.m();
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
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        long j3;
        boolean z11;
        jh0 jh0Var = this.d;
        PhotoViewer photoViewer = jh0Var.V;
        h81 h81Var = jh0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || jh0Var.f27516r != null) && !jh0Var.f27503c0 && !jh0Var.Y && !jh0Var.f27518w && !jh0Var.f27517s.isInProgress() && jh0Var.f27508f0)) {
            jh0Var.V.getClass();
            if (motionEvent.getX() >= jh0Var.t() * jh0Var.J * 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            long l4 = jh0Var.l();
            long m10 = jh0Var.m();
            if (l4 != -9223372036854775807L && m10 >= 15000) {
                if (z10) {
                    j3 = l4 + 10000;
                } else {
                    j3 = l4 - 10000;
                }
                if (l4 != j3) {
                    if (j3 > m10) {
                        z11 = true;
                        j3 = m10;
                    } else if (j3 < 0) {
                        if (j3 < -9000) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        j3 = 0;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        h81Var.e(true);
                        h81Var.d(!z10);
                        long j10 = h81Var.f26701o + 10000;
                        h81Var.f26701o = j10;
                        h81Var.f26702p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
                        vg0 vg0Var = jh0Var.f27516r;
                        if (vg0Var != null) {
                            vg0Var.i(j3);
                        } else {
                            q81 q81Var = jh0Var.V.F2;
                            if (q81Var != null) {
                                q81Var.K(j3);
                            }
                        }
                        h81Var.g(0L);
                        jh0Var.Z = ((float) j3) / ((float) m10);
                        ai.o4 o4Var = jh0Var.f27501b0;
                        if (o4Var != null) {
                            o4Var.invalidate();
                        }
                        ih0 ih0Var = jh0Var.h;
                        if (ih0Var != null) {
                            ih0Var.invalidate();
                        }
                        if (!jh0Var.E) {
                            jh0Var.E = true;
                            jh0Var.y(true);
                            if (!jh0Var.f27511i0) {
                                jh0Var.f27511i0 = true;
                                AndroidUtilities.runOnUIThread(jh0Var.f27512j0, 2500L);
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        jh0 jh0Var = this.d;
        if (jh0Var.E) {
            for (int i10 = 1; i10 < jh0Var.f27505e.getChildCount(); i10++) {
                View childAt = jh0Var.f27505e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    jh0Var.f27520y = childAt;
                    return true;
                }
            }
        }
        this.f26778a = jh0Var.K;
        this.f26779b = jh0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        jh0 jh0Var = this.d;
        if (jh0Var.f27518w && !jh0Var.f27519x) {
            o1.k kVar = jh0Var.M;
            kVar.f16680a = f7;
            float f12 = jh0Var.K;
            kVar.f16681b = f12;
            kVar.f16682c = true;
            o1.l lVar = kVar.f16691u;
            int i10 = jh0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f16698i = dp;
            jh0Var.M.h();
            o1.k kVar2 = jh0Var.N;
            kVar2.f16680a = f7;
            kVar2.f16681b = jh0Var.L;
            kVar2.f16682c = true;
            kVar2.f16691u.f16698i = w7.n.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - jh0Var.I) - AndroidUtilities.dp(16.0f));
            jh0Var.N.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        jh0 jh0Var = this.d;
        if (!jh0Var.f27518w && jh0Var.F == null && !jh0Var.f27519x) {
            float abs = Math.abs(f7);
            float f11 = this.f26780c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                jh0Var.f27518w = true;
                jh0Var.M.c();
                jh0Var.N.c();
                jh0Var.f27508f0 = false;
                jh0Var.i();
                AndroidUtilities.cancelRunOnUIThread(jh0Var.f27510h0);
            }
        }
        if (jh0Var.f27518w) {
            float f12 = jh0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f26778a) - motionEvent.getRawX();
            jh0Var.L = (motionEvent2.getRawY() + this.f26779b) - motionEvent.getRawY();
            int i10 = jh0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = jh0Var.f27504d0;
                if (z10) {
                    if (z10) {
                        jh0Var.M.a(new ci.sa(this, rawX, 2));
                        o1.k kVar = jh0Var.M;
                        kVar.f16681b = f12;
                        kVar.f16682c = true;
                        kVar.f16691u.f16698i = rawX;
                        kVar.h();
                    }
                    jh0Var.f27504d0 = false;
                    return true;
                }
                o1.k kVar2 = jh0Var.M;
                if (kVar2.f16684f) {
                    kVar2.f16691u.f16698i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = jh0Var.f27502c;
                    jh0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) jh0Var.n().f16326a).edit().putFloat("x", rawX).apply();
                }
                jh0Var.f27502c.y = (int) jh0Var.L;
                ((SharedPreferences) jh0Var.n().f16326a).edit().putFloat("y", jh0Var.L).apply();
                AndroidUtilities.updateViewLayout(jh0Var.f27500b, jh0Var.d, jh0Var.f27502c);
                return true;
            }
            if (!jh0Var.f27504d0) {
                o1.k kVar3 = jh0Var.M;
                kVar3.f16681b = f12;
                kVar3.f16682c = true;
                o1.l lVar = kVar3.f16691u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - jh0Var.H;
                }
                lVar.f16698i = dp;
                jh0Var.M.h();
            }
            jh0Var.f27504d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        jh0 jh0Var = this.d;
        ValueAnimator valueAnimator = jh0Var.F;
        eh0 eh0Var = jh0Var.f27512j0;
        if (valueAnimator == null) {
            if (jh0Var.f27511i0) {
                AndroidUtilities.cancelRunOnUIThread(eh0Var);
                jh0Var.f27511i0 = false;
            }
            boolean z10 = !jh0Var.E;
            jh0Var.E = z10;
            jh0Var.y(z10);
            if (jh0Var.E && !jh0Var.f27511i0) {
                AndroidUtilities.runOnUIThread(eh0Var, 2500L);
                jh0Var.f27511i0 = true;
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
