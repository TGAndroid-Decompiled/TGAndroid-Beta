package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;
public final class xg0 extends u20 {
    public float f32397a;
    public float f32398b;
    public final int f32399c;
    public final zg0 d;

    public xg0(zg0 zg0Var, int i10) {
        this.d = zg0Var;
        this.f32399c = i10;
    }

    @Override
    public final boolean a() {
        zg0 zg0Var = this.d;
        PhotoViewer photoViewer = zg0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || zg0Var.f32947r != null) && !zg0Var.f32935c0 && !zg0Var.Y && !zg0Var.f32949w && !zg0Var.f32948s.isInProgress() && zg0Var.f32939f0) {
                long l4 = zg0Var.l();
                long m10 = zg0Var.m();
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
        zg0 zg0Var = this.d;
        PhotoViewer photoViewer = zg0Var.V;
        s71 s71Var = zg0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || zg0Var.f32947r != null) && !zg0Var.f32935c0 && !zg0Var.Y && !zg0Var.f32949w && !zg0Var.f32948s.isInProgress() && zg0Var.f32939f0)) {
            zg0Var.V.getClass();
            if (motionEvent.getX() >= zg0Var.t() * zg0Var.J * 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            long l4 = zg0Var.l();
            long m10 = zg0Var.m();
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
                        s71Var.e(true);
                        s71Var.d(!z10);
                        long j11 = s71Var.f30207o + 10000;
                        s71Var.f30207o = j11;
                        s71Var.f30208p = LocaleController.formatPluralString("Seconds", (int) (j11 / 1000), new Object[0]);
                        kg0 kg0Var = zg0Var.f32947r;
                        if (kg0Var != null) {
                            kg0Var.i(j10);
                        } else {
                            b81 b81Var = zg0Var.V.F2;
                            if (b81Var != null) {
                                b81Var.K(j10);
                            }
                        }
                        s71Var.g(0L);
                        zg0Var.Z = ((float) j10) / ((float) m10);
                        ci.i3 i3Var = zg0Var.f32933b0;
                        if (i3Var != null) {
                            i3Var.invalidate();
                        }
                        yg0 yg0Var = zg0Var.h;
                        if (yg0Var != null) {
                            yg0Var.invalidate();
                        }
                        if (!zg0Var.E) {
                            zg0Var.E = true;
                            zg0Var.y(true);
                            if (!zg0Var.f32942i0) {
                                zg0Var.f32942i0 = true;
                                AndroidUtilities.runOnUIThread(zg0Var.f32943j0, 2500L);
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
        zg0 zg0Var = this.d;
        if (zg0Var.E) {
            for (int i10 = 1; i10 < zg0Var.e.getChildCount(); i10++) {
                View childAt = zg0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    zg0Var.f32951y = childAt;
                    return true;
                }
            }
        }
        this.f32397a = zg0Var.K;
        this.f32398b = zg0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        zg0 zg0Var = this.d;
        if (zg0Var.f32949w && !zg0Var.f32950x) {
            o1.k kVar = zg0Var.M;
            kVar.f17551a = f7;
            float f12 = zg0Var.K;
            kVar.f17552b = f12;
            kVar.f17553c = true;
            o1.l lVar = kVar.f17561u;
            int i10 = zg0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f17567i = dp;
            zg0Var.M.h();
            o1.k kVar2 = zg0Var.N;
            kVar2.f17551a = f7;
            kVar2.f17552b = zg0Var.L;
            kVar2.f17553c = true;
            kVar2.f17561u.f17567i = w7.r.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - zg0Var.I) - AndroidUtilities.dp(16.0f));
            zg0Var.N.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        zg0 zg0Var = this.d;
        if (!zg0Var.f32949w && zg0Var.F == null && !zg0Var.f32950x) {
            float abs = Math.abs(f7);
            float f11 = this.f32399c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                zg0Var.f32949w = true;
                zg0Var.M.c();
                zg0Var.N.c();
                zg0Var.f32939f0 = false;
                zg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(zg0Var.f32941h0);
            }
        }
        if (zg0Var.f32949w) {
            float f12 = zg0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f32397a) - motionEvent.getRawX();
            zg0Var.L = (motionEvent2.getRawY() + this.f32398b) - motionEvent.getRawY();
            int i10 = zg0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = zg0Var.f32936d0;
                if (z10) {
                    if (z10) {
                        zg0Var.M.a(new ei.ea(this, rawX, 2));
                        o1.k kVar = zg0Var.M;
                        kVar.f17552b = f12;
                        kVar.f17553c = true;
                        kVar.f17561u.f17567i = rawX;
                        kVar.h();
                    }
                    zg0Var.f32936d0 = false;
                    return true;
                }
                o1.k kVar2 = zg0Var.M;
                if (kVar2.f17554f) {
                    kVar2.f17561u.f17567i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = zg0Var.f32934c;
                    zg0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) zg0Var.n().f14832b).edit().putFloat("x", rawX).apply();
                }
                zg0Var.f32934c.y = (int) zg0Var.L;
                ((SharedPreferences) zg0Var.n().f14832b).edit().putFloat("y", zg0Var.L).apply();
                AndroidUtilities.updateViewLayout(zg0Var.f32932b, zg0Var.d, zg0Var.f32934c);
                return true;
            }
            if (!zg0Var.f32936d0) {
                o1.k kVar3 = zg0Var.M;
                kVar3.f17552b = f12;
                kVar3.f17553c = true;
                o1.l lVar = kVar3.f17561u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - zg0Var.H;
                }
                lVar.f17567i = dp;
                zg0Var.M.h();
            }
            zg0Var.f32936d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        zg0 zg0Var = this.d;
        ValueAnimator valueAnimator = zg0Var.F;
        ug0 ug0Var = zg0Var.f32943j0;
        if (valueAnimator == null) {
            if (zg0Var.f32942i0) {
                AndroidUtilities.cancelRunOnUIThread(ug0Var);
                zg0Var.f32942i0 = false;
            }
            boolean z10 = !zg0Var.E;
            zg0Var.E = z10;
            zg0Var.y(z10);
            if (zg0Var.E && !zg0Var.f32942i0) {
                AndroidUtilities.runOnUIThread(ug0Var, 2500L);
                zg0Var.f32942i0 = true;
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
