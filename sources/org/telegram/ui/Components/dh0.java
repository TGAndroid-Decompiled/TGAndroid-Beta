package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;
public final class dh0 extends y20 {
    public float f24124a;
    public float f24125b;
    public final int f24126c;
    public final fh0 d;

    public dh0(fh0 fh0Var, int i10) {
        this.d = fh0Var;
        this.f24126c = i10;
    }

    @Override
    public final boolean a() {
        fh0 fh0Var = this.d;
        PhotoViewer photoViewer = fh0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || fh0Var.f24751r != null) && !fh0Var.f24739c0 && !fh0Var.Y && !fh0Var.f24753w && !fh0Var.f24752s.isInProgress() && fh0Var.f24743f0) {
                long l4 = fh0Var.l();
                long m10 = fh0Var.m();
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
        fh0 fh0Var = this.d;
        PhotoViewer photoViewer = fh0Var.V;
        a81 a81Var = fh0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || fh0Var.f24751r != null) && !fh0Var.f24739c0 && !fh0Var.Y && !fh0Var.f24753w && !fh0Var.f24752s.isInProgress() && fh0Var.f24743f0)) {
            fh0Var.V.getClass();
            if (motionEvent.getX() >= fh0Var.t() * fh0Var.J * 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            long l4 = fh0Var.l();
            long m10 = fh0Var.m();
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
                        a81Var.e(true);
                        a81Var.d(!z10);
                        long j11 = a81Var.f23167o + 10000;
                        a81Var.f23167o = j11;
                        a81Var.f23168p = LocaleController.formatPluralString("Seconds", (int) (j11 / 1000), new Object[0]);
                        rg0 rg0Var = fh0Var.f24751r;
                        if (rg0Var != null) {
                            rg0Var.i(j10);
                        } else {
                            i81 i81Var = fh0Var.V.F2;
                            if (i81Var != null) {
                                i81Var.K(j10);
                            }
                        }
                        a81Var.g(0L);
                        fh0Var.Z = ((float) j10) / ((float) m10);
                        bi.d4 d4Var = fh0Var.f24737b0;
                        if (d4Var != null) {
                            d4Var.invalidate();
                        }
                        eh0 eh0Var = fh0Var.h;
                        if (eh0Var != null) {
                            eh0Var.invalidate();
                        }
                        if (!fh0Var.E) {
                            fh0Var.E = true;
                            fh0Var.y(true);
                            if (!fh0Var.f24746i0) {
                                fh0Var.f24746i0 = true;
                                AndroidUtilities.runOnUIThread(fh0Var.f24747j0, 2500L);
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
        fh0 fh0Var = this.d;
        if (fh0Var.E) {
            for (int i10 = 1; i10 < fh0Var.e.getChildCount(); i10++) {
                View childAt = fh0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    fh0Var.f24755y = childAt;
                    return true;
                }
            }
        }
        this.f24124a = fh0Var.K;
        this.f24125b = fh0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        fh0 fh0Var = this.d;
        if (fh0Var.f24753w && !fh0Var.f24754x) {
            o1.k kVar = fh0Var.M;
            kVar.f16151a = f7;
            float f12 = fh0Var.K;
            kVar.f16152b = f12;
            kVar.f16153c = true;
            o1.l lVar = kVar.f16161u;
            int i10 = fh0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f16167i = dp;
            fh0Var.M.h();
            o1.k kVar2 = fh0Var.N;
            kVar2.f16151a = f7;
            kVar2.f16152b = fh0Var.L;
            kVar2.f16153c = true;
            kVar2.f16161u.f16167i = w7.r.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - fh0Var.I) - AndroidUtilities.dp(16.0f));
            fh0Var.N.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        fh0 fh0Var = this.d;
        if (!fh0Var.f24753w && fh0Var.F == null && !fh0Var.f24754x) {
            float abs = Math.abs(f7);
            float f11 = this.f24126c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                fh0Var.f24753w = true;
                fh0Var.M.c();
                fh0Var.N.c();
                fh0Var.f24743f0 = false;
                fh0Var.i();
                AndroidUtilities.cancelRunOnUIThread(fh0Var.f24745h0);
            }
        }
        if (fh0Var.f24753w) {
            float f12 = fh0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f24124a) - motionEvent.getRawX();
            fh0Var.L = (motionEvent2.getRawY() + this.f24125b) - motionEvent.getRawY();
            int i10 = fh0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = fh0Var.f24740d0;
                if (z10) {
                    if (z10) {
                        fh0Var.M.a(new di.ra(this, rawX, 2));
                        o1.k kVar = fh0Var.M;
                        kVar.f16152b = f12;
                        kVar.f16153c = true;
                        kVar.f16161u.f16167i = rawX;
                        kVar.h();
                    }
                    fh0Var.f24740d0 = false;
                    return true;
                }
                o1.k kVar2 = fh0Var.M;
                if (kVar2.f16154f) {
                    kVar2.f16161u.f16167i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = fh0Var.f24738c;
                    fh0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) fh0Var.n().f14848b).edit().putFloat("x", rawX).apply();
                }
                fh0Var.f24738c.y = (int) fh0Var.L;
                ((SharedPreferences) fh0Var.n().f14848b).edit().putFloat("y", fh0Var.L).apply();
                AndroidUtilities.updateViewLayout(fh0Var.f24736b, fh0Var.d, fh0Var.f24738c);
                return true;
            }
            if (!fh0Var.f24740d0) {
                o1.k kVar3 = fh0Var.M;
                kVar3.f16152b = f12;
                kVar3.f16153c = true;
                o1.l lVar = kVar3.f16161u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - fh0Var.H;
                }
                lVar.f16167i = dp;
                fh0Var.M.h();
            }
            fh0Var.f24740d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        fh0 fh0Var = this.d;
        ValueAnimator valueAnimator = fh0Var.F;
        ah0 ah0Var = fh0Var.f24747j0;
        if (valueAnimator == null) {
            if (fh0Var.f24746i0) {
                AndroidUtilities.cancelRunOnUIThread(ah0Var);
                fh0Var.f24746i0 = false;
            }
            boolean z10 = !fh0Var.E;
            fh0Var.E = z10;
            fh0Var.y(z10);
            if (fh0Var.E && !fh0Var.f24746i0) {
                AndroidUtilities.runOnUIThread(ah0Var, 2500L);
                fh0Var.f24746i0 = true;
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
