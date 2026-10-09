package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;
public final class eh0 extends c30 {
    public float f26087a;
    public float f26088b;
    public final int f26089c;
    public final gh0 d;

    public eh0(gh0 gh0Var, int i10) {
        this.d = gh0Var;
        this.f26089c = i10;
    }

    @Override
    public final boolean a() {
        gh0 gh0Var = this.d;
        PhotoViewer photoViewer = gh0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || gh0Var.f26719r != null) && !gh0Var.f26706c0 && !gh0Var.Y && !gh0Var.f26721w && !gh0Var.f26720s.isInProgress() && gh0Var.f26711f0) {
                long l4 = gh0Var.l();
                long m10 = gh0Var.m();
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
        gh0 gh0Var = this.d;
        PhotoViewer photoViewer = gh0Var.V;
        b81 b81Var = gh0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || gh0Var.f26719r != null) && !gh0Var.f26706c0 && !gh0Var.Y && !gh0Var.f26721w && !gh0Var.f26720s.isInProgress() && gh0Var.f26711f0)) {
            gh0Var.V.getClass();
            if (motionEvent.getX() >= gh0Var.t() * gh0Var.J * 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            long l4 = gh0Var.l();
            long m10 = gh0Var.m();
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
                        b81Var.e(true);
                        b81Var.d(!z10);
                        long j10 = b81Var.f24944o + 10000;
                        b81Var.f24944o = j10;
                        b81Var.f24945p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
                        sg0 sg0Var = gh0Var.f26719r;
                        if (sg0Var != null) {
                            sg0Var.i(j3);
                        } else {
                            k81 k81Var = gh0Var.V.F2;
                            if (k81Var != null) {
                                k81Var.K(j3);
                            }
                        }
                        b81Var.g(0L);
                        gh0Var.Z = ((float) j3) / ((float) m10);
                        ai.o4 o4Var = gh0Var.f26704b0;
                        if (o4Var != null) {
                            o4Var.invalidate();
                        }
                        fh0 fh0Var = gh0Var.h;
                        if (fh0Var != null) {
                            fh0Var.invalidate();
                        }
                        if (!gh0Var.E) {
                            gh0Var.E = true;
                            gh0Var.y(true);
                            if (!gh0Var.f26714i0) {
                                gh0Var.f26714i0 = true;
                                AndroidUtilities.runOnUIThread(gh0Var.f26715j0, 2500L);
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
        gh0 gh0Var = this.d;
        if (gh0Var.E) {
            for (int i10 = 1; i10 < gh0Var.f26708e.getChildCount(); i10++) {
                View childAt = gh0Var.f26708e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    gh0Var.f26723y = childAt;
                    return true;
                }
            }
        }
        this.f26087a = gh0Var.K;
        this.f26088b = gh0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        gh0 gh0Var = this.d;
        if (gh0Var.f26721w && !gh0Var.f26722x) {
            o1.k kVar = gh0Var.M;
            kVar.f16927a = f7;
            float f12 = gh0Var.K;
            kVar.f16928b = f12;
            kVar.f16929c = true;
            o1.l lVar = kVar.f16938u;
            int i10 = gh0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f16945i = dp;
            gh0Var.M.h();
            o1.k kVar2 = gh0Var.N;
            kVar2.f16927a = f7;
            kVar2.f16928b = gh0Var.L;
            kVar2.f16929c = true;
            kVar2.f16938u.f16945i = w7.o.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - gh0Var.I) - AndroidUtilities.dp(16.0f));
            gh0Var.N.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        gh0 gh0Var = this.d;
        if (!gh0Var.f26721w && gh0Var.F == null && !gh0Var.f26722x) {
            float abs = Math.abs(f7);
            float f11 = this.f26089c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                gh0Var.f26721w = true;
                gh0Var.M.c();
                gh0Var.N.c();
                gh0Var.f26711f0 = false;
                gh0Var.i();
                AndroidUtilities.cancelRunOnUIThread(gh0Var.f26713h0);
            }
        }
        if (gh0Var.f26721w) {
            float f12 = gh0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f26087a) - motionEvent.getRawX();
            gh0Var.L = (motionEvent2.getRawY() + this.f26088b) - motionEvent.getRawY();
            int i10 = gh0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = gh0Var.f26707d0;
                if (z10) {
                    if (z10) {
                        gh0Var.M.a(new ci.sa(this, rawX, 2));
                        o1.k kVar = gh0Var.M;
                        kVar.f16928b = f12;
                        kVar.f16929c = true;
                        kVar.f16938u.f16945i = rawX;
                        kVar.h();
                    }
                    gh0Var.f26707d0 = false;
                    return true;
                }
                o1.k kVar2 = gh0Var.M;
                if (kVar2.f16931f) {
                    kVar2.f16938u.f16945i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = gh0Var.f26705c;
                    gh0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    gh0Var.n().f7977a.edit().putFloat("x", rawX).apply();
                }
                gh0Var.f26705c.y = (int) gh0Var.L;
                gh0Var.n().f7977a.edit().putFloat("y", gh0Var.L).apply();
                AndroidUtilities.updateViewLayout(gh0Var.f26703b, gh0Var.d, gh0Var.f26705c);
                return true;
            }
            if (!gh0Var.f26707d0) {
                o1.k kVar3 = gh0Var.M;
                kVar3.f16928b = f12;
                kVar3.f16929c = true;
                o1.l lVar = kVar3.f16938u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - gh0Var.H;
                }
                lVar.f16945i = dp;
                gh0Var.M.h();
            }
            gh0Var.f26707d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        gh0 gh0Var = this.d;
        ValueAnimator valueAnimator = gh0Var.F;
        bh0 bh0Var = gh0Var.f26715j0;
        if (valueAnimator == null) {
            if (gh0Var.f26714i0) {
                AndroidUtilities.cancelRunOnUIThread(bh0Var);
                gh0Var.f26714i0 = false;
            }
            boolean z10 = !gh0Var.E;
            gh0Var.E = z10;
            gh0Var.y(z10);
            if (gh0Var.E && !gh0Var.f26714i0) {
                AndroidUtilities.runOnUIThread(bh0Var, 2500L);
                gh0Var.f26714i0 = true;
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
