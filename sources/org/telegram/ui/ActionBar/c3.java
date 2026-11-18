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
public final class c3 implements x10 {
    public final int f28822a;
    public final Object f28823b;
    public final Object f28824c;

    public c3(int i7, Object obj, Object obj2) {
        this.f28822a = i7;
        this.f28824c = obj;
        this.f28823b = obj2;
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
        int i12 = this.f28822a;
        Object obj2 = this.f28823b;
        Object obj3 = this.f28824c;
        switch (i12) {
            case 0:
                g3 g3Var = (g3) obj3;
                f3 f3Var = (f3) obj2;
                h2 h2Var = (h2) obj;
                if (h2Var != null) {
                    boolean z11 = true;
                    if ((h2Var instanceof bn) && (rjVar = (bnVar = (bn) h2Var).f45923a0) != null) {
                        rjVar.U();
                        bnVar.f45923a0.H0(true, false, true);
                    }
                    if (h2Var.getContext() != null && h2Var.getParentActivity() != null) {
                        ki.t2 t2Var = new ki.t2(h2Var.getContext(), h2Var.getResourceProvider());
                        t2Var.m0 = h2Var.getParentActivity();
                        if (f3Var != null && f3Var.f28925a != null) {
                            t2Var.G0 = true;
                            boolean z12 = f3Var.f28937o;
                            t2Var.X = z12;
                            if (z12) {
                                t2Var.A(f3Var.f28940r, false);
                            }
                            if (!f3Var.f28936n) {
                                int i13 = f3Var.f28938p;
                                if (i13 < 0) {
                                    i13 = n6.f29394d6;
                                }
                                i7 = n6.w0(i13, t2Var.G);
                            } else {
                                i7 = f3Var.f28939q;
                            }
                            t2Var.y(i7, f3Var.f28936n, false);
                            t2Var.D(f3Var.f28941s, false);
                            t2Var.H0 = f3Var.f28932j;
                            t2Var.I0 = f3Var.f28933k;
                            boolean z13 = f3Var.f28943u;
                            t2Var.f18952y0 = z13;
                            ki.l2 l2Var = t2Var.E;
                            l2Var.setIsBackButtonVisible(z13);
                            t2Var.f18949x.setAllowSwipes(f3Var.f28934l);
                            ImageView backButton = t2Var.Y.getBackButton();
                            if (t2Var.f18952y0) {
                                i10 = 2131231240;
                            } else {
                                i10 = 2131231269;
                            }
                            org.telegram.messenger.g0.P3(backButton, i10);
                            org.telegram.messenger.h2 h2Var2 = t2Var.f18937o0;
                            if (h2Var2 != null) {
                                boolean z14 = t2Var.f18952y0;
                                h2Var2.L = z14;
                                h2Var2.M.d(z14);
                                h2Var2.invalidate();
                            }
                            t2Var.f18944t0 = f3Var.f28946y;
                            t2Var.B0 = Boolean.valueOf(f3Var.B);
                            t2Var.C0 = f3Var.C;
                            ki.w0 w0Var = f3Var.K;
                            t2Var.D0 = w0Var;
                            if (w0Var != null) {
                                ki.u0 u0Var = w0Var.f19018r;
                                SensorManager sensorManager = w0Var.f19003a;
                                if (w0Var.f19012l) {
                                    w0Var.f19012l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = w0Var.f19004b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(w0Var.f19014n, sensor, ki.w0.a(w0Var.f19005c));
                                        }
                                        Sensor sensor2 = w0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(w0Var.f19016p, sensor2, ki.w0.a(w0Var.f19006e));
                                        }
                                        Sensor sensor3 = w0Var.f19008g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(u0Var, sensor3, ki.w0.a(w0Var.h));
                                        }
                                        Sensor sensor4 = w0Var.f19007f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(u0Var, sensor4, ki.w0.a(w0Var.h));
                                        }
                                        Sensor sensor5 = w0Var.f19009i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(w0Var.f19020t, sensor5, ki.w0.a(w0Var.f19010j));
                                        }
                                    }
                                }
                            }
                            xa xaVar = f3Var.f28944w;
                            if (xaVar != null) {
                                ki.p2 p2Var = t2Var.f18936n0;
                                int totalHeight = p2Var.getTotalHeight();
                                p2Var.f18964e = xaVar;
                                ki.s[] sVarArr = p2Var.f18965f;
                                ki.u.b(sVarArr[0].f18870l, (ki.t) xaVar.f714c, false);
                                ki.u.b(sVarArr[1].f18870l, (ki.t) xaVar.d, false);
                                p2Var.invalidate();
                                if (totalHeight != p2Var.getTotalHeight() && p2Var.f18967r != null) {
                                    if (totalHeight < p2Var.getTotalHeight()) {
                                        org.telegram.messenger.g0.h3(p2Var.f18967r, 200L);
                                    } else {
                                        p2Var.f18967r.run();
                                    }
                                }
                                int i14 = xaVar.f713b;
                                Paint paint = p2Var.f18961a;
                                p2Var.f18964e.f713b = i14;
                                paint.setColor(i14);
                                p2Var.d.a(i14, true);
                            }
                            t2Var.C(f3Var.f28947z, false, f3Var.A);
                            ki.f4 f4Var = f3Var.f28925a;
                            if (f4Var != null) {
                                i11 = f4Var.f18663a;
                            } else {
                                i11 = j10.f24770t0;
                            }
                            t2Var.I = i11;
                            org.telegram.ui.web.s0 s0Var = f3Var.f28926b;
                            if (s0Var != null) {
                                s0Var.onResume();
                                l2Var.O(t2Var.I, f3Var.f28926b, f3Var.d, f3Var.f28929f, f3Var.f28928e);
                                if (!f3Var.f28942t && !f3Var.f28926b.f53250b) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                String str = f3Var.f28945x;
                                l2Var.g("setState(" + z10 + ", " + str + ")");
                                l2Var.O = z10;
                                l2Var.f53296b = str;
                                if (n6.I.q() != f3Var.D) {
                                    l2Var.z();
                                }
                            } else {
                                f4Var.f18677q = null;
                                f4Var.f18678r = 0L;
                            }
                            t2Var.x(h2Var, f3Var.f28925a);
                            t2Var.f18924d0 = f3Var.v;
                            if (f3Var.G) {
                                t2Var.X0 = true;
                                t2Var.m();
                                org.telegram.ui.b3 b3Var = t2Var.Z0;
                                if (t2Var.q()) {
                                    q10 = t2Var.f18950x0.f18666e;
                                } else {
                                    q10 = o10.q(mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J)));
                                }
                                String str2 = f3Var.H;
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
                            t2Var.t(f3Var.L);
                            g3Var.h(g3Var.f28970x, f3Var, false);
                            t2Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                k3 k3Var = (k3) obj3;
                ((f3) obj2).f28935m = (Bitmap) obj;
                k3Var.mo25d().setDrawingFromOverlay(false);
                k3Var.release();
                return;
            default:
                m3 m3Var = (m3) obj2;
                n3 n3Var = (n3) ((hi.d6) obj3).f14384q;
                if (((Boolean) obj).booleanValue()) {
                    m3Var.a(1.0f);
                    if (n3Var.f29270a.getTabs().isEmpty()) {
                        n3Var.a(false);
                        return;
                    }
                    return;
                }
                m3Var.a(0.0f);
                return;
        }
    }

    public c3(f3 f3Var, k3 k3Var) {
        this.f28822a = 1;
        this.f28823b = f3Var;
        this.f28824c = k3Var;
    }
}
