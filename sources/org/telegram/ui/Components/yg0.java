package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;
public final class yg0 extends u20 {
    public float f32654a;
    public float f32655b;
    public final int f32656c;
    public final ah0 d;

    public yg0(ah0 ah0Var, int i10) {
        this.d = ah0Var;
        this.f32656c = i10;
    }

    @Override
    public final boolean a() {
        ah0 ah0Var = this.d;
        PhotoViewer photoViewer = ah0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || ah0Var.f24620r != null) && !ah0Var.f24608c0 && !ah0Var.Y && !ah0Var.f24622w && !ah0Var.f24621s.isInProgress() && ah0Var.f24612f0) {
                long l4 = ah0Var.l();
                long m10 = ah0Var.m();
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
        long j10;
        boolean z11;
        ah0 ah0Var = this.d;
        PhotoViewer photoViewer = ah0Var.V;
        t71 t71Var = ah0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || ah0Var.f24620r != null) && !ah0Var.f24608c0 && !ah0Var.Y && !ah0Var.f24622w && !ah0Var.f24621s.isInProgress() && ah0Var.f24612f0)) {
            ah0Var.V.getClass();
            if (motionEvent.getX() >= ah0Var.t() * ah0Var.J * 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            long l4 = ah0Var.l();
            long m10 = ah0Var.m();
            if (l4 != -9223372036854775807L && m10 >= 15000) {
                if (z10) {
                    j10 = l4 + 10000;
                } else {
                    j10 = l4 - 10000;
                }
                if (l4 != j10) {
                    if (j10 > m10) {
                        z11 = true;
                        j10 = m10;
                    } else if (j10 < 0) {
                        if (j10 < -9000) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        j10 = 0;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        t71Var.e(true);
                        t71Var.d(!z10);
                        long j11 = t71Var.f30475o + 10000;
                        t71Var.f30475o = j11;
                        t71Var.f30476p = LocaleController.formatPluralString("Seconds", (int) (j11 / 1000), new Object[0]);
                        lg0 lg0Var = ah0Var.f24620r;
                        if (lg0Var != null) {
                            lg0Var.i(j10);
                        } else {
                            c81 c81Var = ah0Var.V.F2;
                            if (c81Var != null) {
                                c81Var.K(j10);
                            }
                        }
                        t71Var.g(0L);
                        ah0Var.Z = ((float) j10) / ((float) m10);
                        ci.i3 i3Var = ah0Var.f24606b0;
                        if (i3Var != null) {
                            i3Var.invalidate();
                        }
                        zg0 zg0Var = ah0Var.h;
                        if (zg0Var != null) {
                            zg0Var.invalidate();
                        }
                        if (!ah0Var.E) {
                            ah0Var.E = true;
                            ah0Var.y(true);
                            if (!ah0Var.f24615i0) {
                                ah0Var.f24615i0 = true;
                                AndroidUtilities.runOnUIThread(ah0Var.f24616j0, 2500L);
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
        ah0 ah0Var = this.d;
        if (ah0Var.E) {
            for (int i10 = 1; i10 < ah0Var.e.getChildCount(); i10++) {
                View childAt = ah0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    ah0Var.f24624y = childAt;
                    return true;
                }
            }
        }
        this.f32654a = ah0Var.K;
        this.f32655b = ah0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        ah0 ah0Var = this.d;
        if (ah0Var.f24622w && !ah0Var.f24623x) {
            o1.k kVar = ah0Var.M;
            kVar.f17549a = f7;
            float f12 = ah0Var.K;
            kVar.f17550b = f12;
            kVar.f17551c = true;
            o1.l lVar = kVar.f17559u;
            int i10 = ah0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f17565i = dp;
            ah0Var.M.h();
            o1.k kVar2 = ah0Var.N;
            kVar2.f17549a = f7;
            kVar2.f17550b = ah0Var.L;
            kVar2.f17551c = true;
            kVar2.f17559u.f17565i = w7.r.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ah0Var.I) - AndroidUtilities.dp(16.0f));
            ah0Var.N.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        ah0 ah0Var = this.d;
        if (!ah0Var.f24622w && ah0Var.F == null && !ah0Var.f24623x) {
            float abs = Math.abs(f7);
            float f11 = this.f32656c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                ah0Var.f24622w = true;
                ah0Var.M.c();
                ah0Var.N.c();
                ah0Var.f24612f0 = false;
                ah0Var.i();
                AndroidUtilities.cancelRunOnUIThread(ah0Var.f24614h0);
            }
        }
        if (ah0Var.f24622w) {
            float f12 = ah0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f32654a) - motionEvent.getRawX();
            ah0Var.L = (motionEvent2.getRawY() + this.f32655b) - motionEvent.getRawY();
            int i10 = ah0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = ah0Var.f24609d0;
                if (z10) {
                    if (z10) {
                        ah0Var.M.a(new ei.ea(this, rawX, 2));
                        o1.k kVar = ah0Var.M;
                        kVar.f17550b = f12;
                        kVar.f17551c = true;
                        kVar.f17559u.f17565i = rawX;
                        kVar.h();
                    }
                    ah0Var.f24609d0 = false;
                    return true;
                }
                o1.k kVar2 = ah0Var.M;
                if (kVar2.f17552f) {
                    kVar2.f17559u.f17565i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = ah0Var.f24607c;
                    ah0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) ah0Var.n().f14830b).edit().putFloat("x", rawX).apply();
                }
                ah0Var.f24607c.y = (int) ah0Var.L;
                ((SharedPreferences) ah0Var.n().f14830b).edit().putFloat("y", ah0Var.L).apply();
                AndroidUtilities.updateViewLayout(ah0Var.f24605b, ah0Var.d, ah0Var.f24607c);
                return true;
            }
            if (!ah0Var.f24609d0) {
                o1.k kVar3 = ah0Var.M;
                kVar3.f17550b = f12;
                kVar3.f17551c = true;
                o1.l lVar = kVar3.f17559u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - ah0Var.H;
                }
                lVar.f17565i = dp;
                ah0Var.M.h();
            }
            ah0Var.f24609d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ah0 ah0Var = this.d;
        ValueAnimator valueAnimator = ah0Var.F;
        vg0 vg0Var = ah0Var.f24616j0;
        if (valueAnimator == null) {
            if (ah0Var.f24615i0) {
                AndroidUtilities.cancelRunOnUIThread(vg0Var);
                ah0Var.f24615i0 = false;
            }
            boolean z10 = !ah0Var.E;
            ah0Var.E = z10;
            ah0Var.y(z10);
            if (ah0Var.E && !ah0Var.f24615i0) {
                AndroidUtilities.runOnUIThread(vg0Var, 2500L);
                ah0Var.f24615i0 = true;
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
