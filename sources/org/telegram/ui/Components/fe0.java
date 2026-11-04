package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.ui.PhotoViewer;
public final class fe0 extends x00 {
    public float f33782a;
    public float f33783b;
    public final int f33784c;
    public final ie0 d;

    public fe0(ie0 ie0Var, int i3) {
        this.d = ie0Var;
        this.f33784c = i3;
    }

    @Override
    public final boolean a() {
        ie0 ie0Var = this.d;
        PhotoViewer photoViewer = ie0Var.W;
        if (photoViewer != null) {
            if ((photoViewer.G2 != null || ie0Var.f34703r != null) && !ie0Var.f34690d0 && !ie0Var.Z && !ie0Var.f34706x && !ie0Var.f34704s.isInProgress() && ie0Var.f34695g0) {
                long e10 = ie0Var.e();
                long f10 = ie0Var.f();
                if (e10 != -9223372036854775807L && f10 >= 15000) {
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
        ie0 ie0Var = this.d;
        PhotoViewer photoViewer = ie0Var.W;
        d51 d51Var = ie0Var.R;
        if (photoViewer != null && ((photoViewer.G2 != null || ie0Var.f34703r != null) && !ie0Var.f34690d0 && !ie0Var.Z && !ie0Var.f34706x && !ie0Var.f34704s.isInProgress() && ie0Var.f34695g0)) {
            ie0Var.W.getClass();
            if (motionEvent.getX() >= ie0Var.t() * ie0Var.K * 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            long e10 = ie0Var.e();
            long f10 = ie0Var.f();
            if (e10 != -9223372036854775807L && f10 >= 15000) {
                if (z10) {
                    j10 = e10 + 10000;
                } else {
                    j10 = e10 - 10000;
                }
                if (e10 != j10) {
                    if (j10 > f10) {
                        z11 = true;
                        j10 = f10;
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
                        d51Var.e(true);
                        d51Var.d(!z10);
                        long j11 = d51Var.f32949o + 10000;
                        d51Var.f32949o = j11;
                        d51Var.f32950p = org.telegram.messenger.bd.G((int) (j11 / 1000), "Seconds", new Object[0]);
                        ud0 ud0Var = ie0Var.f34703r;
                        if (ud0Var != null) {
                            ud0Var.i(j10);
                        } else {
                            m51 m51Var = ie0Var.W.G2;
                            if (m51Var != null) {
                                m51Var.p0(j10);
                            }
                        }
                        d51Var.g(0L);
                        ie0Var.f34685a0 = ((float) j10) / ((float) f10);
                        ei.e3 e3Var = ie0Var.f34689c0;
                        if (e3Var != null) {
                            e3Var.invalidate();
                        }
                        ge0 ge0Var = ie0Var.h;
                        if (ge0Var != null) {
                            ge0Var.invalidate();
                        }
                        if (!ie0Var.F) {
                            ie0Var.F = true;
                            ie0Var.y(true);
                            if (!ie0Var.f34698j0) {
                                ie0Var.f34698j0 = true;
                                org.telegram.messenger.g0.i3(ie0Var.f34699k0, 2500L);
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
        ie0 ie0Var = this.d;
        if (ie0Var.F) {
            for (int i3 = 1; i3 < ie0Var.f34691e.getChildCount(); i3++) {
                View childAt = ie0Var.f34691e.getChildAt(i3);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    ie0Var.E = childAt;
                    return true;
                }
            }
        }
        this.f33782a = ie0Var.L;
        this.f33783b = ie0Var.M;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        Point point;
        float L;
        float f12;
        ie0 ie0Var = this.d;
        if (ie0Var.f34706x && !ie0Var.f34707y) {
            q1.g gVar = ie0Var.N;
            gVar.f53643a = f10;
            float f13 = ie0Var.L;
            gVar.f53644b = f13;
            gVar.f53645c = true;
            q1.h hVar = gVar.f53653m;
            int i3 = ie0Var.I;
            float f14 = (f10 / 7.0f) + (i3 / 2.0f) + f13;
            int i10 = org.telegram.messenger.g0.f22608q.x;
            if (f14 >= i10 / 2.0f) {
                L = (i10 - i3) - org.telegram.messenger.g0.L(16.0f);
            } else {
                L = org.telegram.messenger.g0.L(16.0f);
            }
            hVar.f53661i = L;
            ie0Var.N.h();
            q1.g gVar2 = ie0Var.O;
            gVar2.f53643a = f10;
            gVar2.f53644b = ie0Var.M;
            gVar2.f53645c = true;
            gVar2.f53653m.f53661i = b8.be.a((f11 / 10.0f) + f12, org.telegram.messenger.g0.L(16.0f), (point.y - ie0Var.J) - org.telegram.messenger.g0.L(16.0f));
            ie0Var.O.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float L;
        ie0 ie0Var = this.d;
        if (!ie0Var.f34706x && ie0Var.G == null && !ie0Var.f34707y) {
            float abs = Math.abs(f10);
            float f12 = this.f33784c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                ie0Var.f34706x = true;
                ie0Var.N.d();
                ie0Var.O.d();
                ie0Var.f34695g0 = false;
                ie0Var.a();
                org.telegram.messenger.g0.r(ie0Var.f34697i0);
            }
        }
        if (ie0Var.f34706x) {
            float f13 = ie0Var.L;
            float rawX = (motionEvent2.getRawX() + this.f33782a) - motionEvent.getRawX();
            ie0Var.M = (motionEvent2.getRawY() + this.f33783b) - motionEvent.getRawY();
            int i3 = ie0Var.I;
            if (rawX > (-i3) * 0.25f && rawX < org.telegram.messenger.g0.f22608q.x - (i3 * 0.75f)) {
                boolean z10 = ie0Var.f34692e0;
                if (z10) {
                    if (z10) {
                        ie0Var.N.a(new gi.g9(this, rawX, 2));
                        q1.g gVar = ie0Var.N;
                        gVar.f53644b = f13;
                        gVar.f53645c = true;
                        gVar.f53653m.f53661i = rawX;
                        gVar.h();
                    }
                    ie0Var.f34692e0 = false;
                    return true;
                }
                q1.g gVar2 = ie0Var.N;
                if (gVar2.f53647f) {
                    gVar2.f53653m.f53661i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = ie0Var.f34688c;
                    ie0Var.L = rawX;
                    layoutParams.x = (int) rawX;
                    ie0Var.h().f34373a.edit().putFloat("x", rawX).apply();
                }
                ie0Var.f34688c.y = (int) ie0Var.M;
                ie0Var.h().f34373a.edit().putFloat("y", ie0Var.M).apply();
                org.telegram.messenger.g0.T3(ie0Var.f34686b, ie0Var.d, ie0Var.f34688c);
                return true;
            }
            if (!ie0Var.f34692e0) {
                q1.g gVar3 = ie0Var.N;
                gVar3.f53644b = f13;
                gVar3.f53645c = true;
                q1.h hVar = gVar3.f53653m;
                int i10 = org.telegram.messenger.g0.f22608q.x;
                if ((i3 / 2.0f) + rawX >= i10 / 2.0f) {
                    L = i10 - org.telegram.messenger.g0.L(16.0f);
                } else {
                    L = org.telegram.messenger.g0.L(16.0f) - ie0Var.I;
                }
                hVar.f53661i = L;
                ie0Var.N.h();
            }
            ie0Var.f34692e0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ie0 ie0Var = this.d;
        ValueAnimator valueAnimator = ie0Var.G;
        be0 be0Var = ie0Var.f34699k0;
        if (valueAnimator == null) {
            if (ie0Var.f34698j0) {
                org.telegram.messenger.g0.r(be0Var);
                ie0Var.f34698j0 = false;
            }
            boolean z10 = !ie0Var.F;
            ie0Var.F = z10;
            ie0Var.y(z10);
            if (ie0Var.F && !ie0Var.f34698j0) {
                org.telegram.messenger.g0.i3(be0Var, 2500L);
                ie0Var.f34698j0 = true;
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
