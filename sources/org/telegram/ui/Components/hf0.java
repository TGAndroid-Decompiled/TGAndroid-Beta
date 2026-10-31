package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.ui.PhotoViewer;
public final class hf0 extends r10 {
    public float f26723a;
    public float f26724b;
    public final int f26725c;
    public final jf0 d;

    public hf0(jf0 jf0Var, int i10) {
        this.d = jf0Var;
        this.f26725c = i10;
    }

    @Override
    public final boolean a() {
        jf0 jf0Var = this.d;
        PhotoViewer photoViewer = jf0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || jf0Var.f27363r != null) && !jf0Var.f27351c0 && !jf0Var.Y && !jf0Var.f27366x && !jf0Var.f27364s.isInProgress() && jf0Var.f27355f0) {
                long e = jf0Var.e();
                long f7 = jf0Var.f();
                if (e != -9223372036854775807L && f7 >= 15000) {
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
        jf0 jf0Var = this.d;
        PhotoViewer photoViewer = jf0Var.V;
        m61 m61Var = jf0Var.Q;
        if (photoViewer != null && ((photoViewer.F2 != null || jf0Var.f27363r != null) && !jf0Var.f27351c0 && !jf0Var.Y && !jf0Var.f27366x && !jf0Var.f27364s.isInProgress() && jf0Var.f27355f0)) {
            jf0Var.V.getClass();
            if (motionEvent.getX() >= jf0Var.t() * jf0Var.J * 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            long e = jf0Var.e();
            long f7 = jf0Var.f();
            if (e != -9223372036854775807L && f7 >= 15000) {
                if (z10) {
                    j10 = e + 10000;
                } else {
                    j10 = e - 10000;
                }
                if (e != j10) {
                    if (j10 > f7) {
                        z11 = true;
                        j10 = f7;
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
                        m61Var.e(true);
                        m61Var.d(!z10);
                        long j11 = m61Var.f28325o + 10000;
                        m61Var.f28325o = j11;
                        m61Var.f28326p = org.telegram.messenger.cd.G((int) (j11 / 1000), "Seconds", new Object[0]);
                        ve0 ve0Var = jf0Var.f27363r;
                        if (ve0Var != null) {
                            ve0Var.i(j10);
                        } else {
                            u61 u61Var = jf0Var.V.F2;
                            if (u61Var != null) {
                                u61Var.p0(j10);
                            }
                        }
                        m61Var.g(0L);
                        jf0Var.Z = ((float) j10) / ((float) f7);
                        ih.c cVar = jf0Var.f27349b0;
                        if (cVar != null) {
                            cVar.invalidate();
                        }
                        if0 if0Var = jf0Var.h;
                        if (if0Var != null) {
                            if0Var.invalidate();
                        }
                        if (!jf0Var.E) {
                            jf0Var.E = true;
                            jf0Var.y(true);
                            if (!jf0Var.f27358i0) {
                                jf0Var.f27358i0 = true;
                                org.telegram.messenger.i0.h3(jf0Var.f27359j0, 2500L);
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
        jf0 jf0Var = this.d;
        if (jf0Var.E) {
            for (int i10 = 1; i10 < jf0Var.e.getChildCount(); i10++) {
                View childAt = jf0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    jf0Var.D = childAt;
                    return true;
                }
            }
        }
        this.f26723a = jf0Var.K;
        this.f26724b = jf0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        Point point;
        float L;
        float f11;
        jf0 jf0Var = this.d;
        if (jf0Var.f27366x && !jf0Var.f27367y) {
            o1.j jVar = jf0Var.M;
            jVar.f13948a = f7;
            float f12 = jf0Var.K;
            jVar.f13949b = f12;
            jVar.f13950c = true;
            o1.k kVar = jVar.f13957m;
            int i10 = jf0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = org.telegram.messenger.i0.f16026q.x;
            if (f13 >= i11 / 2.0f) {
                L = (i11 - i10) - org.telegram.messenger.i0.L(16.0f);
            } else {
                L = org.telegram.messenger.i0.L(16.0f);
            }
            kVar.f13964i = L;
            jf0Var.M.h();
            o1.j jVar2 = jf0Var.N;
            jVar2.f13948a = f7;
            jVar2.f13949b = jf0Var.L;
            jVar2.f13950c = true;
            jVar2.f13957m.f13964i = w7.u.a((f10 / 10.0f) + f11, org.telegram.messenger.i0.L(16.0f), (point.y - jf0Var.I) - org.telegram.messenger.i0.L(16.0f));
            jf0Var.N.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float L;
        jf0 jf0Var = this.d;
        if (!jf0Var.f27366x && jf0Var.F == null && !jf0Var.f27367y) {
            float abs = Math.abs(f7);
            float f11 = this.f26725c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                jf0Var.f27366x = true;
                jf0Var.M.d();
                jf0Var.N.d();
                jf0Var.f27355f0 = false;
                jf0Var.a();
                org.telegram.messenger.i0.r(jf0Var.f27357h0);
            }
        }
        if (jf0Var.f27366x) {
            float f12 = jf0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f26723a) - motionEvent.getRawX();
            jf0Var.L = (motionEvent2.getRawY() + this.f26724b) - motionEvent.getRawY();
            int i10 = jf0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < org.telegram.messenger.i0.f16026q.x - (i10 * 0.75f)) {
                boolean z10 = jf0Var.f27352d0;
                if (z10) {
                    if (z10) {
                        jf0Var.M.a(new gf0(this, rawX, 0));
                        o1.j jVar = jf0Var.M;
                        jVar.f13949b = f12;
                        jVar.f13950c = true;
                        jVar.f13957m.f13964i = rawX;
                        jVar.h();
                    }
                    jf0Var.f27352d0 = false;
                    return true;
                }
                o1.j jVar2 = jf0Var.M;
                if (jVar2.f13951f) {
                    jVar2.f13957m.f13964i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = jf0Var.f27350c;
                    jf0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    ((SharedPreferences) jf0Var.h().f10700a).edit().putFloat("x", rawX).apply();
                }
                jf0Var.f27350c.y = (int) jf0Var.L;
                ((SharedPreferences) jf0Var.h().f10700a).edit().putFloat("y", jf0Var.L).apply();
                org.telegram.messenger.i0.S3(jf0Var.f27348b, jf0Var.d, jf0Var.f27350c);
                return true;
            }
            if (!jf0Var.f27352d0) {
                o1.j jVar3 = jf0Var.M;
                jVar3.f13949b = f12;
                jVar3.f13950c = true;
                o1.k kVar = jVar3.f13957m;
                int i11 = org.telegram.messenger.i0.f16026q.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    L = i11 - org.telegram.messenger.i0.L(16.0f);
                } else {
                    L = org.telegram.messenger.i0.L(16.0f) - jf0Var.H;
                }
                kVar.f13964i = L;
                jf0Var.M.h();
            }
            jf0Var.f27352d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        jf0 jf0Var = this.d;
        ValueAnimator valueAnimator = jf0Var.F;
        cf0 cf0Var = jf0Var.f27359j0;
        if (valueAnimator == null) {
            if (jf0Var.f27358i0) {
                org.telegram.messenger.i0.r(cf0Var);
                jf0Var.f27358i0 = false;
            }
            boolean z10 = !jf0Var.E;
            jf0Var.E = z10;
            jf0Var.y(z10);
            if (jf0Var.E && !jf0Var.f27358i0) {
                org.telegram.messenger.i0.h3(cf0Var, 2500L);
                jf0Var.f27358i0 = true;
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
