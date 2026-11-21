package org.telegram.ui.ActionBar;

import a8.xa;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.widget.ImageView;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.ui.bn;
import org.telegram.ui.rj;
public final class b3 implements x10 {
    public final int f28804a;
    public final Object f28805b;
    public final Object f28806c;

    public b3(int i7, Object obj, Object obj2) {
        this.f28804a = i7;
        this.f28806c = obj;
        this.f28805b = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        int i10;
        int i11;
        String q10;
        boolean z10;
        bn bnVar;
        rj rjVar;
        int i12 = this.f28804a;
        Object obj2 = this.f28805b;
        Object obj3 = this.f28806c;
        switch (i12) {
            case 0:
                f3 f3Var = (f3) obj3;
                e3 e3Var = (e3) obj2;
                g2 g2Var = (g2) obj;
                if (g2Var != null) {
                    boolean z11 = true;
                    if ((g2Var instanceof bn) && (rjVar = (bnVar = (bn) g2Var).f45946a0) != null) {
                        rjVar.U();
                        bnVar.f45946a0.L0(true, false, true);
                    }
                    if (g2Var.getContext() != null && g2Var.getParentActivity() != null) {
                        ki.s2 s2Var = new ki.s2(g2Var.getContext(), g2Var.getResourceProvider());
                        s2Var.m0 = g2Var.getParentActivity();
                        if (e3Var != null && e3Var.f28906a != null) {
                            s2Var.G0 = true;
                            boolean z12 = e3Var.f28918o;
                            s2Var.X = z12;
                            if (z12) {
                                s2Var.A(e3Var.f28921r, false);
                            }
                            if (!e3Var.f28917n) {
                                int i13 = e3Var.f28919p;
                                if (i13 < 0) {
                                    i13 = m6.f29378d6;
                                }
                                i7 = m6.w0(i13, s2Var.G);
                            } else {
                                i7 = e3Var.f28920q;
                            }
                            s2Var.y(i7, e3Var.f28917n, false);
                            s2Var.D(e3Var.f28922s, false);
                            s2Var.H0 = e3Var.f28913j;
                            s2Var.I0 = e3Var.f28914k;
                            boolean z13 = e3Var.f28924u;
                            s2Var.f18962y0 = z13;
                            ki.k2 k2Var = s2Var.E;
                            k2Var.setIsBackButtonVisible(z13);
                            s2Var.f18959x.setAllowSwipes(e3Var.f28915l);
                            ImageView backButton = s2Var.Y.getBackButton();
                            if (s2Var.f18962y0) {
                                i10 = 2131231240;
                            } else {
                                i10 = 2131231269;
                            }
                            org.telegram.messenger.g0.P3(backButton, i10);
                            org.telegram.messenger.h2 h2Var = s2Var.f18947o0;
                            if (h2Var != null) {
                                boolean z14 = s2Var.f18962y0;
                                h2Var.L = z14;
                                h2Var.M.d(z14);
                                h2Var.invalidate();
                            }
                            s2Var.f18954t0 = e3Var.f28927y;
                            s2Var.B0 = Boolean.valueOf(e3Var.B);
                            s2Var.C0 = e3Var.C;
                            ki.v0 v0Var = e3Var.K;
                            s2Var.D0 = v0Var;
                            if (v0Var != null) {
                                ki.t0 t0Var = v0Var.f19028r;
                                SensorManager sensorManager = v0Var.f19013a;
                                if (v0Var.f19022l) {
                                    v0Var.f19022l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = v0Var.f19014b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(v0Var.f19024n, sensor, ki.v0.a(v0Var.f19015c));
                                        }
                                        Sensor sensor2 = v0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(v0Var.f19026p, sensor2, ki.v0.a(v0Var.f19016e));
                                        }
                                        Sensor sensor3 = v0Var.f19018g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(t0Var, sensor3, ki.v0.a(v0Var.h));
                                        }
                                        Sensor sensor4 = v0Var.f19017f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(t0Var, sensor4, ki.v0.a(v0Var.h));
                                        }
                                        Sensor sensor5 = v0Var.f19019i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(v0Var.f19030t, sensor5, ki.v0.a(v0Var.f19020j));
                                        }
                                    }
                                }
                            }
                            xa xaVar = e3Var.f28925w;
                            if (xaVar != null) {
                                ki.o2 o2Var = s2Var.f18946n0;
                                int totalHeight = o2Var.getTotalHeight();
                                o2Var.f18974e = xaVar;
                                ki.r[] rVarArr = o2Var.f18975f;
                                ki.t.b(rVarArr[0].f18880l, (ki.s) xaVar.f714c, false);
                                ki.t.b(rVarArr[1].f18880l, (ki.s) xaVar.d, false);
                                o2Var.invalidate();
                                if (totalHeight != o2Var.getTotalHeight() && o2Var.f18977r != null) {
                                    if (totalHeight < o2Var.getTotalHeight()) {
                                        org.telegram.messenger.g0.h3(o2Var.f18977r, 200L);
                                    } else {
                                        o2Var.f18977r.run();
                                    }
                                }
                                int i14 = xaVar.f713b;
                                Paint paint = o2Var.f18971a;
                                o2Var.f18974e.f713b = i14;
                                paint.setColor(i14);
                                o2Var.d.a(i14, true);
                            }
                            s2Var.C(e3Var.f28928z, false, e3Var.A);
                            ki.e4 e4Var = e3Var.f28906a;
                            if (e4Var != null) {
                                i11 = e4Var.f18673a;
                            } else {
                                i11 = j10.f24798t0;
                            }
                            s2Var.I = i11;
                            org.telegram.ui.web.s0 s0Var = e3Var.f28907b;
                            if (s0Var != null) {
                                s0Var.onResume();
                                k2Var.O(s2Var.I, e3Var.f28907b, e3Var.d, e3Var.f28910f, e3Var.f28909e);
                                if (!e3Var.f28923t && !e3Var.f28907b.f53293b) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                String str = e3Var.f28926x;
                                k2Var.g("setState(" + z10 + ", " + str + ")");
                                k2Var.O = z10;
                                k2Var.f53339b = str;
                                if (m6.I.q() != e3Var.D) {
                                    k2Var.z();
                                }
                            } else {
                                e4Var.f18687q = null;
                                e4Var.f18688r = 0L;
                            }
                            s2Var.x(g2Var, e3Var.f28906a);
                            s2Var.f18934d0 = e3Var.v;
                            if (e3Var.G) {
                                s2Var.X0 = true;
                                s2Var.m();
                                org.telegram.ui.b3 b3Var = s2Var.Z0;
                                if (s2Var.q()) {
                                    q10 = s2Var.f18960x0.f18676e;
                                } else {
                                    q10 = o10.q(mp.u1(s2Var.I).c2(Long.valueOf(s2Var.J)));
                                }
                                String str2 = e3Var.H;
                                s2Var.Y0 = str2;
                                b3Var.a(q10, str2);
                                org.telegram.ui.b3 b3Var2 = s2Var.Z0;
                                Paint paint2 = s2Var.R;
                                if (org.telegram.messenger.g0.B(paint2.getColor()) > 0.721f) {
                                    z11 = false;
                                }
                                b3Var2.b(z11, false);
                                s2Var.Z0.setBackgroundColor(paint2.getColor());
                                s2Var.Z0.setVisibility(0);
                                s2Var.Z0.setAlpha(1.0f);
                            }
                            s2Var.t(e3Var.L);
                            f3Var.h(f3Var.f28952x, e3Var, false);
                            s2Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                j3 j3Var = (j3) obj3;
                ((e3) obj2).f28916m = (Bitmap) obj;
                j3Var.mo25d().setDrawingFromOverlay(false);
                j3Var.release();
                return;
            default:
                l3 l3Var = (l3) obj2;
                m3 m3Var = (m3) ((hi.c6) obj3).f14334q;
                if (((Boolean) obj).booleanValue()) {
                    l3Var.a(1.0f);
                    if (m3Var.f29254a.getTabs().isEmpty()) {
                        m3Var.a(false);
                        return;
                    }
                    return;
                }
                l3Var.a(0.0f);
                return;
        }
    }

    public b3(e3 e3Var, j3 j3Var) {
        this.f28804a = 1;
        this.f28805b = e3Var;
        this.f28806c = j3Var;
    }
}
