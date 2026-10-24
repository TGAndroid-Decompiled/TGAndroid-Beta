package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;
public final class ah0 extends s20 {
    public float f24734a;
    public float f24735b;
    public final int f24736c;
    public final ch0 d;

    public ah0(ch0 ch0Var, int i10) {
        this.d = ch0Var;
        this.f24736c = i10;
    }

    @Override
    public final boolean a() {
        ch0 ch0Var = this.d;
        PhotoViewer photoViewer = ch0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || ch0Var.f25331r != null) && !ch0Var.f25319c0 && !ch0Var.Y && !ch0Var.f25333w && !ch0Var.f25332s.isInProgress() && ch0Var.f25323f0) {
                long l4 = ch0Var.l();
                long m10 = ch0Var.m();
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
        ch0 ch0Var = this.d;
        PhotoViewer photoViewer = ch0Var.V;
        a81 a81Var = ch0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || ch0Var.f25331r != null) && !ch0Var.f25319c0 && !ch0Var.Y && !ch0Var.f25333w && !ch0Var.f25332s.isInProgress() && ch0Var.f25323f0)) {
            ch0Var.V.getClass();
            if (motionEvent.getX() >= ch0Var.t() * ch0Var.J * 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            long l4 = ch0Var.l();
            long m10 = ch0Var.m();
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
                        long j11 = a81Var.f24666o + 10000;
                        a81Var.f24666o = j11;
                        a81Var.f24667p = LocaleController.formatPluralString("Seconds", (int) (j11 / 1000), new Object[0]);
                        og0 og0Var = ch0Var.f25331r;
                        if (og0Var != null) {
                            og0Var.i(j10);
                        } else {
                            j81 j81Var = ch0Var.V.F2;
                            if (j81Var != null) {
                                j81Var.K(j10);
                            }
                        }
                        a81Var.g(0L);
                        ch0Var.Z = ((float) j10) / ((float) m10);
                        ci.h3 h3Var = ch0Var.f25317b0;
                        if (h3Var != null) {
                            h3Var.invalidate();
                        }
                        bh0 bh0Var = ch0Var.h;
                        if (bh0Var != null) {
                            bh0Var.invalidate();
                        }
                        if (!ch0Var.E) {
                            ch0Var.E = true;
                            ch0Var.y(true);
                            if (!ch0Var.f25326i0) {
                                ch0Var.f25326i0 = true;
                                AndroidUtilities.runOnUIThread(ch0Var.f25327j0, 2500L);
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
        ch0 ch0Var = this.d;
        if (ch0Var.E) {
            for (int i10 = 1; i10 < ch0Var.e.getChildCount(); i10++) {
                View childAt = ch0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    ch0Var.f25335y = childAt;
                    return true;
                }
            }
        }
        this.f24734a = ch0Var.K;
        this.f24735b = ch0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        ch0 ch0Var = this.d;
        if (ch0Var.f25333w && !ch0Var.f25334x) {
            o1.k kVar = ch0Var.M;
            kVar.f17612a = f7;
            float f12 = ch0Var.K;
            kVar.f17613b = f12;
            kVar.f17614c = true;
            o1.l lVar = kVar.f17622u;
            int i10 = ch0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f17628i = dp;
            ch0Var.M.h();
            o1.k kVar2 = ch0Var.N;
            kVar2.f17612a = f7;
            kVar2.f17613b = ch0Var.L;
            kVar2.f17614c = true;
            kVar2.f17622u.f17628i = w7.r.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ch0Var.I) - AndroidUtilities.dp(16.0f));
            ch0Var.N.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        ch0 ch0Var = this.d;
        if (!ch0Var.f25333w && ch0Var.F == null && !ch0Var.f25334x) {
            float abs = Math.abs(f7);
            float f11 = this.f24736c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                ch0Var.f25333w = true;
                ch0Var.M.c();
                ch0Var.N.c();
                ch0Var.f25323f0 = false;
                ch0Var.i();
                AndroidUtilities.cancelRunOnUIThread(ch0Var.f25325h0);
            }
        }
        if (ch0Var.f25333w) {
            float f12 = ch0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f24734a) - motionEvent.getRawX();
            ch0Var.L = (motionEvent2.getRawY() + this.f24735b) - motionEvent.getRawY();
            int i10 = ch0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = ch0Var.f25320d0;
                if (z10) {
                    if (z10) {
                        ch0Var.M.a(new ei.ea(this, rawX, 2));
                        o1.k kVar = ch0Var.M;
                        kVar.f17613b = f12;
                        kVar.f17614c = true;
                        kVar.f17622u.f17628i = rawX;
                        kVar.h();
                    }
                    ch0Var.f25320d0 = false;
                    return true;
                }
                o1.k kVar2 = ch0Var.M;
                if (kVar2.f17615f) {
                    kVar2.f17622u.f17628i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = ch0Var.f25318c;
                    ch0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) ch0Var.n().f14874b).edit().putFloat("x", rawX).apply();
                }
                ch0Var.f25318c.y = (int) ch0Var.L;
                ((SharedPreferences) ch0Var.n().f14874b).edit().putFloat("y", ch0Var.L).apply();
                AndroidUtilities.updateViewLayout(ch0Var.f25316b, ch0Var.d, ch0Var.f25318c);
                return true;
            }
            if (!ch0Var.f25320d0) {
                o1.k kVar3 = ch0Var.M;
                kVar3.f17613b = f12;
                kVar3.f17614c = true;
                o1.l lVar = kVar3.f17622u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - ch0Var.H;
                }
                lVar.f17628i = dp;
                ch0Var.M.h();
            }
            ch0Var.f25320d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ch0 ch0Var = this.d;
        ValueAnimator valueAnimator = ch0Var.F;
        xg0 xg0Var = ch0Var.f25327j0;
        if (valueAnimator == null) {
            if (ch0Var.f25326i0) {
                AndroidUtilities.cancelRunOnUIThread(xg0Var);
                ch0Var.f25326i0 = false;
            }
            boolean z10 = !ch0Var.E;
            ch0Var.E = z10;
            ch0Var.y(z10);
            if (ch0Var.E && !ch0Var.f25326i0) {
                AndroidUtilities.runOnUIThread(xg0Var, 2500L);
                ch0Var.f25326i0 = true;
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
