package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;
public final class bh0 extends u20 {
    public float f25075a;
    public float f25076b;
    public final int f25077c;
    public final dh0 d;

    public bh0(dh0 dh0Var, int i10) {
        this.d = dh0Var;
        this.f25077c = i10;
    }

    @Override
    public final boolean a() {
        dh0 dh0Var = this.d;
        PhotoViewer photoViewer = dh0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || dh0Var.f25649r != null) && !dh0Var.f25637c0 && !dh0Var.Y && !dh0Var.f25651w && !dh0Var.f25650s.isInProgress() && dh0Var.f25641f0) {
                long l4 = dh0Var.l();
                long m10 = dh0Var.m();
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
        dh0 dh0Var = this.d;
        PhotoViewer photoViewer = dh0Var.V;
        b81 b81Var = dh0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || dh0Var.f25649r != null) && !dh0Var.f25637c0 && !dh0Var.Y && !dh0Var.f25651w && !dh0Var.f25650s.isInProgress() && dh0Var.f25641f0)) {
            dh0Var.V.getClass();
            if (motionEvent.getX() >= dh0Var.t() * dh0Var.J * 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            long l4 = dh0Var.l();
            long m10 = dh0Var.m();
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
                        b81Var.e(true);
                        b81Var.d(!z10);
                        long j11 = b81Var.f24993o + 10000;
                        b81Var.f24993o = j11;
                        b81Var.f24994p = LocaleController.formatPluralString("Seconds", (int) (j11 / 1000), new Object[0]);
                        pg0 pg0Var = dh0Var.f25649r;
                        if (pg0Var != null) {
                            pg0Var.i(j10);
                        } else {
                            j81 j81Var = dh0Var.V.F2;
                            if (j81Var != null) {
                                j81Var.K(j10);
                            }
                        }
                        b81Var.g(0L);
                        dh0Var.Z = ((float) j10) / ((float) m10);
                        ci.h3 h3Var = dh0Var.f25635b0;
                        if (h3Var != null) {
                            h3Var.invalidate();
                        }
                        ch0 ch0Var = dh0Var.h;
                        if (ch0Var != null) {
                            ch0Var.invalidate();
                        }
                        if (!dh0Var.E) {
                            dh0Var.E = true;
                            dh0Var.y(true);
                            if (!dh0Var.f25644i0) {
                                dh0Var.f25644i0 = true;
                                AndroidUtilities.runOnUIThread(dh0Var.f25645j0, 2500L);
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
        dh0 dh0Var = this.d;
        if (dh0Var.E) {
            for (int i10 = 1; i10 < dh0Var.e.getChildCount(); i10++) {
                View childAt = dh0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    dh0Var.f25653y = childAt;
                    return true;
                }
            }
        }
        this.f25075a = dh0Var.K;
        this.f25076b = dh0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        dh0 dh0Var = this.d;
        if (dh0Var.f25651w && !dh0Var.f25652x) {
            o1.k kVar = dh0Var.M;
            kVar.f17612a = f7;
            float f12 = dh0Var.K;
            kVar.f17613b = f12;
            kVar.f17614c = true;
            o1.l lVar = kVar.f17622u;
            int i10 = dh0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f17628i = dp;
            dh0Var.M.h();
            o1.k kVar2 = dh0Var.N;
            kVar2.f17612a = f7;
            kVar2.f17613b = dh0Var.L;
            kVar2.f17614c = true;
            kVar2.f17622u.f17628i = w7.r.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - dh0Var.I) - AndroidUtilities.dp(16.0f));
            dh0Var.N.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        dh0 dh0Var = this.d;
        if (!dh0Var.f25651w && dh0Var.F == null && !dh0Var.f25652x) {
            float abs = Math.abs(f7);
            float f11 = this.f25077c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                dh0Var.f25651w = true;
                dh0Var.M.c();
                dh0Var.N.c();
                dh0Var.f25641f0 = false;
                dh0Var.i();
                AndroidUtilities.cancelRunOnUIThread(dh0Var.f25643h0);
            }
        }
        if (dh0Var.f25651w) {
            float f12 = dh0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f25075a) - motionEvent.getRawX();
            dh0Var.L = (motionEvent2.getRawY() + this.f25076b) - motionEvent.getRawY();
            int i10 = dh0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = dh0Var.f25638d0;
                if (z10) {
                    if (z10) {
                        dh0Var.M.a(new ei.ea(this, rawX, 2));
                        o1.k kVar = dh0Var.M;
                        kVar.f17613b = f12;
                        kVar.f17614c = true;
                        kVar.f17622u.f17628i = rawX;
                        kVar.h();
                    }
                    dh0Var.f25638d0 = false;
                    return true;
                }
                o1.k kVar2 = dh0Var.M;
                if (kVar2.f17615f) {
                    kVar2.f17622u.f17628i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = dh0Var.f25636c;
                    dh0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) dh0Var.n().f14874b).edit().putFloat("x", rawX).apply();
                }
                dh0Var.f25636c.y = (int) dh0Var.L;
                ((SharedPreferences) dh0Var.n().f14874b).edit().putFloat("y", dh0Var.L).apply();
                AndroidUtilities.updateViewLayout(dh0Var.f25634b, dh0Var.d, dh0Var.f25636c);
                return true;
            }
            if (!dh0Var.f25638d0) {
                o1.k kVar3 = dh0Var.M;
                kVar3.f17613b = f12;
                kVar3.f17614c = true;
                o1.l lVar = kVar3.f17622u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - dh0Var.H;
                }
                lVar.f17628i = dp;
                dh0Var.M.h();
            }
            dh0Var.f25638d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        dh0 dh0Var = this.d;
        ValueAnimator valueAnimator = dh0Var.F;
        yg0 yg0Var = dh0Var.f25645j0;
        if (valueAnimator == null) {
            if (dh0Var.f25644i0) {
                AndroidUtilities.cancelRunOnUIThread(yg0Var);
                dh0Var.f25644i0 = false;
            }
            boolean z10 = !dh0Var.E;
            dh0Var.E = z10;
            dh0Var.y(z10);
            if (dh0Var.E && !dh0Var.f25644i0) {
                AndroidUtilities.runOnUIThread(yg0Var, 2500L);
                dh0Var.f25644i0 = true;
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
