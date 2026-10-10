package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;
public final class fh0 extends d30 {
    public float f26418a;
    public float f26419b;
    public final int f26420c;
    public final hh0 d;

    public fh0(hh0 hh0Var, int i10) {
        this.d = hh0Var;
        this.f26420c = i10;
    }

    @Override
    public final boolean a() {
        hh0 hh0Var = this.d;
        PhotoViewer photoViewer = hh0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || hh0Var.f27030r != null) && !hh0Var.f27017c0 && !hh0Var.Y && !hh0Var.f27032w && !hh0Var.f27031s.isInProgress() && hh0Var.f27022f0) {
                long l4 = hh0Var.l();
                long m10 = hh0Var.m();
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
        hh0 hh0Var = this.d;
        PhotoViewer photoViewer = hh0Var.V;
        c81 c81Var = hh0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || hh0Var.f27030r != null) && !hh0Var.f27017c0 && !hh0Var.Y && !hh0Var.f27032w && !hh0Var.f27031s.isInProgress() && hh0Var.f27022f0)) {
            hh0Var.V.getClass();
            if (motionEvent.getX() >= hh0Var.t() * hh0Var.J * 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            long l4 = hh0Var.l();
            long m10 = hh0Var.m();
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
                        c81Var.e(true);
                        c81Var.d(!z10);
                        long j10 = c81Var.f25236o + 10000;
                        c81Var.f25236o = j10;
                        c81Var.f25237p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
                        tg0 tg0Var = hh0Var.f27030r;
                        if (tg0Var != null) {
                            tg0Var.i(j3);
                        } else {
                            l81 l81Var = hh0Var.V.F2;
                            if (l81Var != null) {
                                l81Var.K(j3);
                            }
                        }
                        c81Var.g(0L);
                        hh0Var.Z = ((float) j3) / ((float) m10);
                        ai.o4 o4Var = hh0Var.f27015b0;
                        if (o4Var != null) {
                            o4Var.invalidate();
                        }
                        gh0 gh0Var = hh0Var.h;
                        if (gh0Var != null) {
                            gh0Var.invalidate();
                        }
                        if (!hh0Var.E) {
                            hh0Var.E = true;
                            hh0Var.y(true);
                            if (!hh0Var.f27025i0) {
                                hh0Var.f27025i0 = true;
                                AndroidUtilities.runOnUIThread(hh0Var.f27026j0, 2500L);
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
        hh0 hh0Var = this.d;
        if (hh0Var.E) {
            for (int i10 = 1; i10 < hh0Var.f27019e.getChildCount(); i10++) {
                View childAt = hh0Var.f27019e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    hh0Var.f27034y = childAt;
                    return true;
                }
            }
        }
        this.f26418a = hh0Var.K;
        this.f26419b = hh0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        hh0 hh0Var = this.d;
        if (hh0Var.f27032w && !hh0Var.f27033x) {
            o1.k kVar = hh0Var.M;
            kVar.f16931a = f7;
            float f12 = hh0Var.K;
            kVar.f16932b = f12;
            kVar.f16933c = true;
            o1.l lVar = kVar.f16942u;
            int i10 = hh0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f16949i = dp;
            hh0Var.M.h();
            o1.k kVar2 = hh0Var.N;
            kVar2.f16931a = f7;
            kVar2.f16932b = hh0Var.L;
            kVar2.f16933c = true;
            kVar2.f16942u.f16949i = w7.o.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - hh0Var.I) - AndroidUtilities.dp(16.0f));
            hh0Var.N.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        hh0 hh0Var = this.d;
        if (!hh0Var.f27032w && hh0Var.F == null && !hh0Var.f27033x) {
            float abs = Math.abs(f7);
            float f11 = this.f26420c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                hh0Var.f27032w = true;
                hh0Var.M.c();
                hh0Var.N.c();
                hh0Var.f27022f0 = false;
                hh0Var.i();
                AndroidUtilities.cancelRunOnUIThread(hh0Var.f27024h0);
            }
        }
        if (hh0Var.f27032w) {
            float f12 = hh0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f26418a) - motionEvent.getRawX();
            hh0Var.L = (motionEvent2.getRawY() + this.f26419b) - motionEvent.getRawY();
            int i10 = hh0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = hh0Var.f27018d0;
                if (z10) {
                    if (z10) {
                        hh0Var.M.a(new ci.sa(this, rawX, 2));
                        o1.k kVar = hh0Var.M;
                        kVar.f16932b = f12;
                        kVar.f16933c = true;
                        kVar.f16942u.f16949i = rawX;
                        kVar.h();
                    }
                    hh0Var.f27018d0 = false;
                    return true;
                }
                o1.k kVar2 = hh0Var.M;
                if (kVar2.f16935f) {
                    kVar2.f16942u.f16949i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = hh0Var.f27016c;
                    hh0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    hh0Var.n().f7977a.edit().putFloat("x", rawX).apply();
                }
                hh0Var.f27016c.y = (int) hh0Var.L;
                hh0Var.n().f7977a.edit().putFloat("y", hh0Var.L).apply();
                AndroidUtilities.updateViewLayout(hh0Var.f27014b, hh0Var.d, hh0Var.f27016c);
                return true;
            }
            if (!hh0Var.f27018d0) {
                o1.k kVar3 = hh0Var.M;
                kVar3.f16932b = f12;
                kVar3.f16933c = true;
                o1.l lVar = kVar3.f16942u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - hh0Var.H;
                }
                lVar.f16949i = dp;
                hh0Var.M.h();
            }
            hh0Var.f27018d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        hh0 hh0Var = this.d;
        ValueAnimator valueAnimator = hh0Var.F;
        ch0 ch0Var = hh0Var.f27026j0;
        if (valueAnimator == null) {
            if (hh0Var.f27025i0) {
                AndroidUtilities.cancelRunOnUIThread(ch0Var);
                hh0Var.f27025i0 = false;
            }
            boolean z10 = !hh0Var.E;
            hh0Var.E = z10;
            hh0Var.y(z10);
            if (hh0Var.E && !hh0Var.f27025i0) {
                AndroidUtilities.runOnUIThread(ch0Var, 2500L);
                hh0Var.f27025i0 = true;
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
