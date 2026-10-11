package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;
public final class gh0 extends d30 {
    public float f26716a;
    public float f26717b;
    public final int f26718c;
    public final ih0 d;

    public gh0(ih0 ih0Var, int i10) {
        this.d = ih0Var;
        this.f26718c = i10;
    }

    @Override
    public final boolean a() {
        ih0 ih0Var = this.d;
        PhotoViewer photoViewer = ih0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || ih0Var.f27344r != null) && !ih0Var.f27331c0 && !ih0Var.Y && !ih0Var.f27346w && !ih0Var.f27345s.isInProgress() && ih0Var.f27336f0) {
                long l4 = ih0Var.l();
                long m10 = ih0Var.m();
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
        ih0 ih0Var = this.d;
        PhotoViewer photoViewer = ih0Var.V;
        d81 d81Var = ih0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || ih0Var.f27344r != null) && !ih0Var.f27331c0 && !ih0Var.Y && !ih0Var.f27346w && !ih0Var.f27345s.isInProgress() && ih0Var.f27336f0)) {
            ih0Var.V.getClass();
            if (motionEvent.getX() >= ih0Var.t() * ih0Var.J * 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            long l4 = ih0Var.l();
            long m10 = ih0Var.m();
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
                        d81Var.e(true);
                        d81Var.d(!z10);
                        long j10 = d81Var.f25489o + 10000;
                        d81Var.f25489o = j10;
                        d81Var.f25490p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
                        ug0 ug0Var = ih0Var.f27344r;
                        if (ug0Var != null) {
                            ug0Var.i(j3);
                        } else {
                            m81 m81Var = ih0Var.V.F2;
                            if (m81Var != null) {
                                m81Var.K(j3);
                            }
                        }
                        d81Var.g(0L);
                        ih0Var.Z = ((float) j3) / ((float) m10);
                        ai.o4 o4Var = ih0Var.f27329b0;
                        if (o4Var != null) {
                            o4Var.invalidate();
                        }
                        hh0 hh0Var = ih0Var.h;
                        if (hh0Var != null) {
                            hh0Var.invalidate();
                        }
                        if (!ih0Var.E) {
                            ih0Var.E = true;
                            ih0Var.y(true);
                            if (!ih0Var.f27339i0) {
                                ih0Var.f27339i0 = true;
                                AndroidUtilities.runOnUIThread(ih0Var.f27340j0, 2500L);
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
        ih0 ih0Var = this.d;
        if (ih0Var.E) {
            for (int i10 = 1; i10 < ih0Var.f27333e.getChildCount(); i10++) {
                View childAt = ih0Var.f27333e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    ih0Var.f27348y = childAt;
                    return true;
                }
            }
        }
        this.f26716a = ih0Var.K;
        this.f26717b = ih0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        ih0 ih0Var = this.d;
        if (ih0Var.f27346w && !ih0Var.f27347x) {
            o1.k kVar = ih0Var.M;
            kVar.f16977a = f7;
            float f12 = ih0Var.K;
            kVar.f16978b = f12;
            kVar.f16979c = true;
            o1.l lVar = kVar.f16988u;
            int i10 = ih0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f16995i = dp;
            ih0Var.M.h();
            o1.k kVar2 = ih0Var.N;
            kVar2.f16977a = f7;
            kVar2.f16978b = ih0Var.L;
            kVar2.f16979c = true;
            kVar2.f16988u.f16995i = w7.o.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ih0Var.I) - AndroidUtilities.dp(16.0f));
            ih0Var.N.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        ih0 ih0Var = this.d;
        if (!ih0Var.f27346w && ih0Var.F == null && !ih0Var.f27347x) {
            float abs = Math.abs(f7);
            float f11 = this.f26718c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                ih0Var.f27346w = true;
                ih0Var.M.c();
                ih0Var.N.c();
                ih0Var.f27336f0 = false;
                ih0Var.i();
                AndroidUtilities.cancelRunOnUIThread(ih0Var.f27338h0);
            }
        }
        if (ih0Var.f27346w) {
            float f12 = ih0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f26716a) - motionEvent.getRawX();
            ih0Var.L = (motionEvent2.getRawY() + this.f26717b) - motionEvent.getRawY();
            int i10 = ih0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = ih0Var.f27332d0;
                if (z10) {
                    if (z10) {
                        ih0Var.M.a(new ci.sa(this, rawX, 2));
                        o1.k kVar = ih0Var.M;
                        kVar.f16978b = f12;
                        kVar.f16979c = true;
                        kVar.f16988u.f16995i = rawX;
                        kVar.h();
                    }
                    ih0Var.f27332d0 = false;
                    return true;
                }
                o1.k kVar2 = ih0Var.M;
                if (kVar2.f16981f) {
                    kVar2.f16988u.f16995i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = ih0Var.f27330c;
                    ih0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ih0Var.n().f7976a.edit().putFloat("x", rawX).apply();
                }
                ih0Var.f27330c.y = (int) ih0Var.L;
                ih0Var.n().f7976a.edit().putFloat("y", ih0Var.L).apply();
                AndroidUtilities.updateViewLayout(ih0Var.f27328b, ih0Var.d, ih0Var.f27330c);
                return true;
            }
            if (!ih0Var.f27332d0) {
                o1.k kVar3 = ih0Var.M;
                kVar3.f16978b = f12;
                kVar3.f16979c = true;
                o1.l lVar = kVar3.f16988u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - ih0Var.H;
                }
                lVar.f16995i = dp;
                ih0Var.M.h();
            }
            ih0Var.f27332d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ih0 ih0Var = this.d;
        ValueAnimator valueAnimator = ih0Var.F;
        dh0 dh0Var = ih0Var.f27340j0;
        if (valueAnimator == null) {
            if (ih0Var.f27339i0) {
                AndroidUtilities.cancelRunOnUIThread(dh0Var);
                ih0Var.f27339i0 = false;
            }
            boolean z10 = !ih0Var.E;
            ih0Var.E = z10;
            ih0Var.y(z10);
            if (ih0Var.E && !ih0Var.f27339i0) {
                AndroidUtilities.runOnUIThread(dh0Var, 2500L);
                ih0Var.f27339i0 = true;
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
