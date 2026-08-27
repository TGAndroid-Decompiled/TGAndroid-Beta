package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.PhotoViewer;

public final class qf0 extends z10 {

    public float f31901a;

    public float f31902b;

    public final int f31903c;
    public final sf0 d;

    public qf0(sf0 sf0Var, int i10) {
        this.d = sf0Var;
        this.f31903c = i10;
    }

    @Override
    public final boolean a() {
        sf0 sf0Var = this.d;
        PhotoViewer photoViewer = sf0Var.R;
        if (photoViewer == null) {
            return false;
        }
        if ((photoViewer.B2 == null && sf0Var.f32431r == null) || sf0Var.Y || sf0Var.U || sf0Var.f32433w || sf0Var.f32432s.isInProgress() || !sf0Var.f32419b0) {
            return false;
        }
        return sf0Var.l() != -9223372036854775807L && sf0Var.m() >= 15000;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        df0 df0Var;
        m61 m61Var;
        jh.a3 a3Var;
        rf0 rf0Var;
        sf0 sf0Var = this.d;
        PhotoViewer photoViewer = sf0Var.R;
        c61 c61Var = sf0Var.M;
        if (photoViewer != null && ((photoViewer.B2 != null || sf0Var.f32431r != null) && !sf0Var.Y && !sf0Var.U && !sf0Var.f32433w && !sf0Var.f32432s.isInProgress() && sf0Var.f32419b0)) {
            sf0Var.R.getClass();
            boolean z11 = motionEvent.getX() >= (((float) sf0Var.t()) * sf0Var.F) * 0.5f;
            long jL = sf0Var.l();
            long jM = sf0Var.m();
            if (jL != -9223372036854775807L && jM >= 15000) {
                long j10 = z11 ? jL + 10000 : jL - 10000;
                if (jL != j10) {
                    if (j10 <= jM) {
                        if (j10 < 0) {
                            z10 = j10 >= -9000;
                            j10 = 0;
                        }
                        if (z10) {
                            c61Var.e(true);
                            c61Var.d(!z11);
                            long j11 = c61Var.f27342o + 10000;
                            c61Var.f27342o = j11;
                            c61Var.f27343p = LocaleController.formatPluralString("Seconds", (int) (j11 / 1000), new Object[0]);
                            df0Var = sf0Var.f32431r;
                            if (df0Var != null) {
                                df0Var.i(j10);
                            } else {
                                m61Var = sf0Var.R.B2;
                                if (m61Var != null) {
                                    m61Var.L(j10);
                                }
                            }
                            c61Var.g(0L);
                            sf0Var.V = j10 / jM;
                            a3Var = sf0Var.X;
                            if (a3Var != null) {
                                a3Var.invalidate();
                            }
                            rf0Var = sf0Var.h;
                            if (rf0Var != null) {
                                rf0Var.invalidate();
                            }
                            if (!sf0Var.A) {
                                sf0Var.A = true;
                                sf0Var.y(true);
                                if (!sf0Var.f32424e0) {
                                    sf0Var.f32424e0 = true;
                                    AndroidUtilities.runOnUIThread(sf0Var.f32426f0, 2500L);
                                }
                            }
                        }
                        return true;
                    }
                    j10 = jM;
                    z10 = true;
                    if (z10) {
                        c61Var.e(true);
                        c61Var.d(!z11);
                        long j12 = c61Var.f27342o + 10000;
                        c61Var.f27342o = j12;
                        c61Var.f27343p = LocaleController.formatPluralString("Seconds", (int) (j12 / 1000), new Object[0]);
                        df0Var = sf0Var.f32431r;
                        if (df0Var != null) {
                            df0Var.i(j10);
                        } else {
                            m61Var = sf0Var.R.B2;
                            if (m61Var != null) {
                                m61Var.L(j10);
                            }
                        }
                        c61Var.g(0L);
                        sf0Var.V = j10 / jM;
                        a3Var = sf0Var.X;
                        if (a3Var != null) {
                            a3Var.invalidate();
                        }
                        rf0Var = sf0Var.h;
                        if (rf0Var != null) {
                            rf0Var.invalidate();
                        }
                        if (!sf0Var.A) {
                            sf0Var.A = true;
                            sf0Var.y(true);
                            if (!sf0Var.f32424e0) {
                                sf0Var.f32424e0 = true;
                                AndroidUtilities.runOnUIThread(sf0Var.f32426f0, 2500L);
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
        sf0 sf0Var = this.d;
        if (sf0Var.A) {
            for (int i10 = 1; i10 < sf0Var.f32423e.getChildCount(); i10++) {
                View childAt = sf0Var.f32423e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    sf0Var.f32435y = childAt;
                    return true;
                }
            }
        }
        this.f31901a = sf0Var.G;
        this.f31902b = sf0Var.H;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        sf0 sf0Var = this.d;
        if (!sf0Var.f32433w || sf0Var.f32434x) {
            return false;
        }
        o1.j jVar = sf0Var.I;
        jVar.f19137a = f10;
        float f12 = sf0Var.G;
        jVar.f19138b = f12;
        jVar.f19139c = true;
        o1.k kVar = jVar.f19147u;
        int i10 = sf0Var.D;
        float f13 = (f10 / 7.0f) + (i10 / 2.0f) + f12;
        int i11 = AndroidUtilities.displaySize.x;
        kVar.f19154i = f13 >= ((float) i11) / 2.0f ? (i11 - i10) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        sf0Var.I.f();
        o1.j jVar2 = sf0Var.J;
        jVar2.f19137a = f10;
        float f14 = sf0Var.H;
        jVar2.f19138b = f14;
        jVar2.f19139c = true;
        jVar2.f19147u.f19154i = h7.n.a((f11 / 10.0f) + f14, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - sf0Var.E) - AndroidUtilities.dp(16.0f));
        sf0Var.J.f();
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        sf0 sf0Var = this.d;
        if (!sf0Var.f32433w && sf0Var.B == null && !sf0Var.f32434x) {
            float fAbs = Math.abs(f10);
            float f12 = this.f31903c;
            if (fAbs >= f12 || Math.abs(f11) >= f12) {
                sf0Var.f32433w = true;
                sf0Var.I.c();
                sf0Var.J.c();
                sf0Var.f32419b0 = false;
                sf0Var.i();
                AndroidUtilities.cancelRunOnUIThread(sf0Var.f32422d0);
            }
        }
        if (sf0Var.f32433w) {
            float f13 = sf0Var.G;
            float rawX = (motionEvent2.getRawX() + this.f31901a) - motionEvent.getRawX();
            sf0Var.H = (motionEvent2.getRawY() + this.f31902b) - motionEvent.getRawY();
            int i10 = sf0Var.D;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = sf0Var.Z;
                if (z10) {
                    if (z10) {
                        sf0Var.I.a(new lh.da(this, rawX, 2));
                        o1.j jVar = sf0Var.I;
                        jVar.f19138b = f13;
                        jVar.f19139c = true;
                        jVar.f19147u.f19154i = rawX;
                        jVar.f();
                    }
                    sf0Var.Z = false;
                    return true;
                }
                o1.j jVar2 = sf0Var.I;
                if (jVar2.f19141f) {
                    jVar2.f19147u.f19154i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = sf0Var.f32420c;
                    sf0Var.G = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) sf0Var.n().f18088b).edit().putFloat("x", rawX).apply();
                }
                sf0Var.f32420c.y = (int) sf0Var.H;
                ((SharedPreferences) sf0Var.n().f18088b).edit().putFloat("y", sf0Var.H).apply();
                AndroidUtilities.updateViewLayout(sf0Var.f32418b, sf0Var.d, sf0Var.f32420c);
                return true;
            }
            if (!sf0Var.Z) {
                o1.j jVar3 = sf0Var.I;
                jVar3.f19138b = f13;
                jVar3.f19139c = true;
                o1.k kVar = jVar3.f19147u;
                float f14 = (i10 / 2.0f) + rawX;
                int i11 = AndroidUtilities.displaySize.x;
                kVar.f19154i = f14 >= ((float) i11) / 2.0f ? i11 - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f) - sf0Var.D;
                sf0Var.I.f();
            }
            sf0Var.Z = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        sf0 sf0Var = this.d;
        ValueAnimator valueAnimator = sf0Var.B;
        mf0 mf0Var = sf0Var.f32426f0;
        if (valueAnimator == null) {
            if (sf0Var.f32424e0) {
                AndroidUtilities.cancelRunOnUIThread(mf0Var);
                sf0Var.f32424e0 = false;
            }
            boolean z10 = !sf0Var.A;
            sf0Var.A = z10;
            sf0Var.y(z10);
            if (sf0Var.A && !sf0Var.f32424e0) {
                AndroidUtilities.runOnUIThread(mf0Var, 2500L);
                sf0Var.f32424e0 = true;
            }
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (a()) {
            return super.onSingleTapUp(motionEvent);
        }
        onSingleTapConfirmed(motionEvent);
        return true;
    }
}
