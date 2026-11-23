package org.telegram.ui.ActionBar;

import a8.xa;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.widget.ImageView;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.w10;
import org.telegram.ui.bn;
import org.telegram.ui.rj;
public final class b3 implements w10 {
    public final int f28866a;
    public final Object f28867b;
    public final Object f28868c;

    public b3(int i7, Object obj, Object obj2) {
        this.f28866a = i7;
        this.f28868c = obj;
        this.f28867b = obj2;
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
        int i12 = this.f28866a;
        Object obj2 = this.f28867b;
        Object obj3 = this.f28868c;
        switch (i12) {
            case 0:
                f3 f3Var = (f3) obj3;
                e3 e3Var = (e3) obj2;
                g2 g2Var = (g2) obj;
                if (g2Var != null) {
                    boolean z11 = true;
                    if ((g2Var instanceof bn) && (rjVar = (bnVar = (bn) g2Var).f46118a0) != null) {
                        rjVar.U();
                        bnVar.f46118a0.M0(true, false, true);
                    }
                    if (g2Var.getContext() != null && g2Var.getParentActivity() != null) {
                        ki.t2 t2Var = new ki.t2(g2Var.getContext(), g2Var.getResourceProvider());
                        t2Var.m0 = g2Var.getParentActivity();
                        if (e3Var != null && e3Var.f28952a != null) {
                            t2Var.G0 = true;
                            boolean z12 = e3Var.f28964o;
                            t2Var.X = z12;
                            if (z12) {
                                t2Var.A(e3Var.f28967r, false);
                            }
                            if (!e3Var.f28963n) {
                                int i13 = e3Var.f28965p;
                                if (i13 < 0) {
                                    i13 = n6.f29451d6;
                                }
                                i7 = n6.w0(i13, t2Var.G);
                            } else {
                                i7 = e3Var.f28966q;
                            }
                            t2Var.y(i7, e3Var.f28963n, false);
                            t2Var.D(e3Var.f28968s, false);
                            t2Var.H0 = e3Var.f28959j;
                            t2Var.I0 = e3Var.f28960k;
                            boolean z13 = e3Var.f28970u;
                            t2Var.f19050y0 = z13;
                            ki.k2 k2Var = t2Var.E;
                            k2Var.setIsBackButtonVisible(z13);
                            t2Var.f19047x.setAllowSwipes(e3Var.f28961l);
                            ImageView backButton = t2Var.Y.getBackButton();
                            if (t2Var.f19050y0) {
                                i10 = 2131231243;
                            } else {
                                i10 = 2131231272;
                            }
                            org.telegram.messenger.g0.P3(backButton, i10);
                            org.telegram.messenger.h2 h2Var = t2Var.f19035o0;
                            if (h2Var != null) {
                                boolean z14 = t2Var.f19050y0;
                                h2Var.L = z14;
                                h2Var.M.d(z14);
                                h2Var.invalidate();
                            }
                            t2Var.f19042t0 = e3Var.f28973y;
                            t2Var.B0 = Boolean.valueOf(e3Var.B);
                            t2Var.C0 = e3Var.C;
                            ki.v0 v0Var = e3Var.K;
                            t2Var.D0 = v0Var;
                            if (v0Var != null) {
                                ki.t0 t0Var = v0Var.f19094r;
                                SensorManager sensorManager = v0Var.f19079a;
                                if (v0Var.f19088l) {
                                    v0Var.f19088l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = v0Var.f19080b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(v0Var.f19090n, sensor, ki.v0.a(v0Var.f19081c));
                                        }
                                        Sensor sensor2 = v0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(v0Var.f19092p, sensor2, ki.v0.a(v0Var.f19082e));
                                        }
                                        Sensor sensor3 = v0Var.f19084g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(t0Var, sensor3, ki.v0.a(v0Var.h));
                                        }
                                        Sensor sensor4 = v0Var.f19083f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(t0Var, sensor4, ki.v0.a(v0Var.h));
                                        }
                                        Sensor sensor5 = v0Var.f19085i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(v0Var.f19096t, sensor5, ki.v0.a(v0Var.f19086j));
                                        }
                                    }
                                }
                            }
                            xa xaVar = e3Var.f28971w;
                            if (xaVar != null) {
                                ki.p2 p2Var = t2Var.f19034n0;
                                int totalHeight = p2Var.getTotalHeight();
                                p2Var.f19004e = xaVar;
                                ki.r[] rVarArr = p2Var.f19005f;
                                ki.t.b(rVarArr[0].f18957l, (ki.s) xaVar.f714c, false);
                                ki.t.b(rVarArr[1].f18957l, (ki.s) xaVar.d, false);
                                p2Var.invalidate();
                                if (totalHeight != p2Var.getTotalHeight() && p2Var.f19007r != null) {
                                    if (totalHeight < p2Var.getTotalHeight()) {
                                        org.telegram.messenger.g0.h3(p2Var.f19007r, 200L);
                                    } else {
                                        p2Var.f19007r.run();
                                    }
                                }
                                int i14 = xaVar.f713b;
                                Paint paint = p2Var.f19001a;
                                p2Var.f19004e.f713b = i14;
                                paint.setColor(i14);
                                p2Var.d.a(i14, true);
                            }
                            t2Var.C(e3Var.f28974z, false, e3Var.A);
                            ki.f4 f4Var = e3Var.f28952a;
                            if (f4Var != null) {
                                i11 = f4Var.f18767a;
                            } else {
                                i11 = i10.f24637t0;
                            }
                            t2Var.I = i11;
                            org.telegram.ui.web.s0 s0Var = e3Var.f28953b;
                            if (s0Var != null) {
                                s0Var.onResume();
                                k2Var.O(t2Var.I, e3Var.f28953b, e3Var.d, e3Var.f28956f, e3Var.f28955e);
                                if (!e3Var.f28969t && !e3Var.f28953b.f53532b) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                String str = e3Var.f28972x;
                                k2Var.g("setState(" + z10 + ", " + str + ")");
                                k2Var.O = z10;
                                k2Var.f53577b = str;
                                if (n6.I.q() != e3Var.D) {
                                    k2Var.z();
                                }
                            } else {
                                f4Var.f18781q = null;
                                f4Var.f18782r = 0L;
                            }
                            t2Var.x(g2Var, e3Var.f28952a);
                            t2Var.f19022d0 = e3Var.v;
                            if (e3Var.G) {
                                t2Var.X0 = true;
                                t2Var.m();
                                org.telegram.ui.b3 b3Var = t2Var.Z0;
                                if (t2Var.q()) {
                                    q10 = t2Var.f19048x0.f18770e;
                                } else {
                                    q10 = n10.q(mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J)));
                                }
                                String str2 = e3Var.H;
                                t2Var.Y0 = str2;
                                b3Var.a(q10, str2);
                                org.telegram.ui.b3 b3Var2 = t2Var.Z0;
                                Paint paint2 = t2Var.R;
                                if (org.telegram.messenger.g0.B(paint2.getColor()) > 0.721f) {
                                    z11 = false;
                                }
                                b3Var2.b(z11, false);
                                t2Var.Z0.setBackgroundColor(paint2.getColor());
                                t2Var.Z0.setVisibility(0);
                                t2Var.Z0.setAlpha(1.0f);
                            }
                            t2Var.t(e3Var.L);
                            f3Var.h(f3Var.f29013x, e3Var, false);
                            t2Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                j3 j3Var = (j3) obj3;
                ((e3) obj2).f28962m = (Bitmap) obj;
                j3Var.mo25d().setDrawingFromOverlay(false);
                j3Var.release();
                return;
            default:
                l3 l3Var = (l3) obj2;
                m3 m3Var = (m3) ((hi.m6) obj3).f14912q;
                if (((Boolean) obj).booleanValue()) {
                    l3Var.a(1.0f);
                    if (m3Var.f29297a.getTabs().isEmpty()) {
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
        this.f28866a = 1;
        this.f28867b = e3Var;
        this.f28868c = j3Var;
    }
}
