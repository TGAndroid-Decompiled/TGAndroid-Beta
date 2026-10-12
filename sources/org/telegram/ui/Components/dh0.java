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
    public float f24401a;
    public float f24402b;
    public final int f24403c;
    public final fh0 d;

    public dh0(fh0 fh0Var, int i10) {
        this.d = fh0Var;
        this.f24403c = i10;
    }

    @Override
    public final boolean a() {
        fh0 fh0Var = this.d;
        PhotoViewer photoViewer = fh0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || fh0Var.f25053r != null) && !fh0Var.f25041c0 && !fh0Var.Y && !fh0Var.f25055w && !fh0Var.f25054s.isInProgress() && fh0Var.f25045f0) {
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
        z71 z71Var = fh0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || fh0Var.f25053r != null) && !fh0Var.f25041c0 && !fh0Var.Y && !fh0Var.f25055w && !fh0Var.f25054s.isInProgress() && fh0Var.f25045f0)) {
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
                        z71Var.e(true);
                        z71Var.d(!z10);
                        long j11 = z71Var.f31802o + 10000;
                        z71Var.f31802o = j11;
                        z71Var.f31803p = LocaleController.formatPluralString("Seconds", (int) (j11 / 1000), new Object[0]);
                        qg0 qg0Var = fh0Var.f25053r;
                        if (qg0Var != null) {
                            qg0Var.i(j10);
                        } else {
                            h81 h81Var = fh0Var.V.F2;
                            if (h81Var != null) {
                                h81Var.K(j10);
                            }
                        }
                        z71Var.g(0L);
                        fh0Var.Z = ((float) j10) / ((float) m10);
                        bi.d4 d4Var = fh0Var.f25039b0;
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
                            if (!fh0Var.f25048i0) {
                                fh0Var.f25048i0 = true;
                                AndroidUtilities.runOnUIThread(fh0Var.f25049j0, 2500L);
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
                    fh0Var.f25057y = childAt;
                    return true;
                }
            }
        }
        this.f24401a = fh0Var.K;
        this.f24402b = fh0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        fh0 fh0Var = this.d;
        if (fh0Var.f25055w && !fh0Var.f25056x) {
            o1.k kVar = fh0Var.M;
            kVar.f16458a = f7;
            float f12 = fh0Var.K;
            kVar.f16459b = f12;
            kVar.f16460c = true;
            o1.l lVar = kVar.f16468u;
            int i10 = fh0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f16474i = dp;
            fh0Var.M.h();
            o1.k kVar2 = fh0Var.N;
            kVar2.f16458a = f7;
            kVar2.f16459b = fh0Var.L;
            kVar2.f16460c = true;
            kVar2.f16468u.f16474i = w7.s.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - fh0Var.I) - AndroidUtilities.dp(16.0f));
            fh0Var.N.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        fh0 fh0Var = this.d;
        if (!fh0Var.f25055w && fh0Var.F == null && !fh0Var.f25056x) {
            float abs = Math.abs(f7);
            float f11 = this.f24403c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                fh0Var.f25055w = true;
                fh0Var.M.c();
                fh0Var.N.c();
                fh0Var.f25045f0 = false;
                fh0Var.i();
                AndroidUtilities.cancelRunOnUIThread(fh0Var.f25047h0);
            }
        }
        if (fh0Var.f25055w) {
            float f12 = fh0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f24401a) - motionEvent.getRawX();
            fh0Var.L = (motionEvent2.getRawY() + this.f24402b) - motionEvent.getRawY();
            int i10 = fh0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = fh0Var.f25042d0;
                if (z10) {
                    if (z10) {
                        fh0Var.M.a(new di.ra(this, rawX, 2));
                        o1.k kVar = fh0Var.M;
                        kVar.f16459b = f12;
                        kVar.f16460c = true;
                        kVar.f16468u.f16474i = rawX;
                        kVar.h();
                    }
                    fh0Var.f25042d0 = false;
                    return true;
                }
                o1.k kVar2 = fh0Var.M;
                if (kVar2.f16461f) {
                    kVar2.f16468u.f16474i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = fh0Var.f25040c;
                    fh0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) fh0Var.n().f14503b).edit().putFloat("x", rawX).apply();
                }
                fh0Var.f25040c.y = (int) fh0Var.L;
                ((SharedPreferences) fh0Var.n().f14503b).edit().putFloat("y", fh0Var.L).apply();
                AndroidUtilities.updateViewLayout(fh0Var.f25038b, fh0Var.d, fh0Var.f25040c);
                return true;
            }
            if (!fh0Var.f25042d0) {
                o1.k kVar3 = fh0Var.M;
                kVar3.f16459b = f12;
                kVar3.f16460c = true;
                o1.l lVar = kVar3.f16468u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - fh0Var.H;
                }
                lVar.f16474i = dp;
                fh0Var.M.h();
            }
            fh0Var.f25042d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        fh0 fh0Var = this.d;
        ValueAnimator valueAnimator = fh0Var.F;
        ah0 ah0Var = fh0Var.f25049j0;
        if (valueAnimator == null) {
            if (fh0Var.f25048i0) {
                AndroidUtilities.cancelRunOnUIThread(ah0Var);
                fh0Var.f25048i0 = false;
            }
            boolean z10 = !fh0Var.E;
            fh0Var.E = z10;
            fh0Var.y(z10);
            if (fh0Var.E && !fh0Var.f25048i0) {
                AndroidUtilities.runOnUIThread(ah0Var, 2500L);
                fh0Var.f25048i0 = true;
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
