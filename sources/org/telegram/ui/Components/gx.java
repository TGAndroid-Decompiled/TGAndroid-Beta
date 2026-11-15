package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.u91;
public final class gx implements org.telegram.messenger.x10, org.telegram.ui.ActionBar.q1, jg.y1, te.b, org.telegram.messenger.j9, s70, hd0, ij0, org.telegram.ui.sw, fi.a7, org.telegram.messenger.tr, y61, org.telegram.messenger.oc, vt0, org.telegram.messenger.kc {
    public final int f35078a;
    public final Object f35079b;

    public gx(Object obj, int i7) {
        this.f35078a = i7;
        this.f35079b = obj;
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        ((y80) this.f35079b).c0();
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        z51 z51Var;
        double d;
        double d2;
        int i7;
        int i10;
        int ceil;
        double ceil2;
        a61 a61Var = (a61) this.f35079b;
        ImageReceiver imageReceiver2 = a61Var.R;
        if (z10) {
            if (a61Var.O != null || a61Var.f32895e0 != null) {
                int L = org.telegram.messenger.g0.L(150.0f);
                org.telegram.ui.bq0 bq0Var = a61Var.O;
                if (bq0Var != null) {
                    ArrayList arrayList = bq0Var.f32979w;
                    int indexOf = arrayList.indexOf(bq0Var.c((int) a61Var.P));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = bq0Var.getVideoDuration() / 1000;
                            if (videoDuration <= 100) {
                                z13 = true;
                                ceil2 = Math.ceil(videoDuration);
                            } else {
                                z13 = true;
                                if (videoDuration <= 250) {
                                    ceil2 = Math.ceil(videoDuration / 2.0f);
                                } else if (videoDuration <= 500) {
                                    ceil2 = Math.ceil(videoDuration / 4.0f);
                                } else if (videoDuration <= 1000) {
                                    ceil2 = Math.ceil(videoDuration / 5.0f);
                                } else {
                                    ceil2 = Math.ceil(videoDuration / 10.0f);
                                }
                            }
                            i10 = Math.min(25, (((int) ceil2) - ((arrayList.size() - 1) * 25)) + 1);
                        } else {
                            z13 = true;
                            i10 = 25;
                        }
                    } else {
                        z13 = true;
                        i10 = 0;
                    }
                    float q10 = imageReceiver2.q() / Math.min(i10, 5);
                    float o4 = imageReceiver2.o() / ((int) Math.ceil(i10 / 5.0f));
                    org.telegram.ui.bq0 bq0Var2 = a61Var.O;
                    int i11 = (int) a61Var.P;
                    int videoDuration2 = bq0Var2.getVideoDuration() / 1000;
                    if (videoDuration2 <= 100) {
                        ceil = ((int) Math.ceil(i11)) % 25;
                    } else if (videoDuration2 <= 250) {
                        ceil = ((int) Math.ceil(i11 / 2.0f)) % 25;
                    } else if (videoDuration2 <= 500) {
                        ceil = ((int) Math.ceil(i11 / 4.0f)) % 25;
                    } else if (videoDuration2 <= 1000) {
                        ceil = ((int) Math.ceil(i11 / 5.0f)) % 25;
                    } else {
                        ceil = ((int) Math.ceil(i11 / 10.0f)) % 25;
                    }
                    int min = Math.min(ceil, i10 - 1);
                    a61Var.S = (int) ((min % 5) * q10);
                    a61Var.T = (int) ((min / 5) * o4);
                    a61Var.U = (int) q10;
                    a61Var.V = (int) o4;
                } else {
                    z13 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < a61Var.f32895e0.size()) {
                            z51Var = (z51) a61Var.f32895e0.get(i12);
                            if (i12 == 0) {
                                d = 0.0d;
                            } else {
                                d = z51Var.f42255a;
                            }
                            if (i12 == a61Var.f32895e0.size() - 1) {
                                d2 = 9.9999999E7d;
                            } else {
                                d2 = ((z51) a61Var.f32895e0.get(i12 + 1)).f42255a;
                            }
                            double d10 = a61Var.P;
                            if (d10 >= d && d10 <= d2) {
                                break;
                            }
                            i12++;
                        } else {
                            z51Var = null;
                            break;
                        }
                    }
                    if (z51Var != null) {
                        a61Var.S = z51Var.f42256b;
                        a61Var.T = z51Var.f42257c;
                        a61Var.U = a61Var.f32892c0;
                        a61Var.V = a61Var.f32893d0;
                    } else {
                        return;
                    }
                }
                a61Var.Q = z13;
                float f10 = a61Var.U / a61Var.V;
                if (f10 > 1.0f) {
                    i7 = (int) (L / f10);
                } else {
                    L = (int) (L * f10);
                    i7 = L;
                }
                ViewGroup.LayoutParams layoutParams = a61Var.getLayoutParams();
                if (a61Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i7) {
                    layoutParams.width = L;
                    layoutParams.height = i7;
                    a61Var.setVisibility(0);
                    a61Var.requestLayout();
                }
            }
        }
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public boolean P(org.telegram.ui.yw ywVar) {
        return false;
    }

    @Override
    public a0.h U() {
        return null;
    }

    @Override
    public void a(String str) {
        switch (this.f35078a) {
            case 20:
                ys0 ys0Var = ((yp0) this.f35079b).d;
                ys0.v(ys0Var).r(ys0Var.f42116m1, str, new vo0(ys0Var, 1));
                return;
            default:
                a31 a31Var = (a31) this.f35079b;
                a31Var.f32835a2 = str;
                a31Var.f32839f2.O(true);
                return;
        }
    }

    @Override
    public boolean b(int i7, View view) {
        uh0 uh0Var;
        switch (this.f35078a) {
            case 15:
                vh0 vh0Var = (vh0) this.f35079b;
                ArrayList arrayList = vh0Var.f40421n;
                if (vh0Var.f40420f.d(i7) == 0 && (uh0Var = vh0Var.G) != null) {
                    uh0Var.a(org.telegram.messenger.gj.B1(((TLRPC.MessagePeerReaction) arrayList.get(i7)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i7));
                    return true;
                }
                return true;
            default:
                il0 il0Var = (il0) this.f35079b;
                di.i4 i4Var = il0Var.f35640c;
                org.telegram.messenger.gj E = i4Var.E(i7);
                il0 il0Var2 = (il0) i4Var.d;
                if (E == null) {
                    return false;
                }
                if (!il0Var.J.g0()) {
                    il0Var.J.j();
                    i4Var.k(0, il0Var2.f35644r);
                }
                if (il0Var.J.g0()) {
                    il0Var.J.M(E, view, 0);
                    if (!il0Var.J.g0()) {
                        i4Var.k(0, il0Var2.f35644r);
                    }
                    org.telegram.ui.sz szVar = il0Var.K;
                    int e12 = E.e1();
                    szVar.f51306a = org.telegram.messenger.gj.B0(E.f23819k);
                    szVar.f51307b = e12;
                }
                return true;
        }
    }

    @Override
    public void c(boolean z10) {
        fi.k6 k6Var = (fi.k6) this.f35079b;
        if (z10) {
            k6Var.p(30, false);
        }
    }

    @Override
    public void e() {
        ((nc0) this.f35079b).K0(true);
    }

    @Override
    public boolean e0(int i7) {
        return true;
    }

    @Override
    public void g(int i7, int i10) {
        st0 st0Var = (st0) this.f35079b;
        st0Var.f39422x = i7;
        st0Var.f39423y = i10;
        bi.o2 o2Var = st0Var.M;
        if (o2Var != null) {
            o2Var.invalidate();
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f35078a) {
            case 1:
                org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(((dy) this.f35079b).f34092w.f36941d1);
                b02.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new org.telegram.messenger.gh(b02, 1));
                return;
            case 3:
                ((org.telegram.ui.f0) this.f35079b).run();
                return;
            case 4:
                ((h10) this.f35079b).J0();
                return;
            case 6:
                a60 a60Var = (a60) this.f35079b;
                a0.h hVar = a60Var.f32867a2;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    arrayList.add(org.telegram.messenger.np.s1(a60Var.f29679a).a2(Long.valueOf(hVar.j(i10))));
                }
                org.telegram.ui.r40 r40Var = a60Var.f32872g2;
                if (r40Var != null) {
                    r40Var.i(0, arrayList);
                }
                a60Var.dismiss();
                return;
            case 22:
                dw0 dw0Var = (dw0) this.f35079b;
                dw0Var.f34071e.presentFragment(new StickersActivity(dw0Var.d, null));
                t1Var.dismiss();
                return;
            default:
                org.telegram.messenger.g0.v1((ew0) this.f35079b);
                t1Var.dismiss();
                return;
        }
    }

    @Override
    public void i(int i7) {
        v50 v50Var = (v50) this.f35079b;
        a60 a60Var = v50Var.f40273n;
        a60Var.O0(v50Var.f40272f - 1);
        if (v50Var.h == null && !v50Var.f40271e.e() && v50Var.b() <= 2) {
            a60Var.f34197u1.e(false, true);
        }
        v50Var.f();
    }

    @Override
    public void k(int i7, int i10) {
        td0 td0Var = (td0) ((org.telegram.ui.l4) this.f35079b).f48823e;
        if (i7 == td0Var.f39642b) {
            td0Var.H = i10;
        } else if (i7 == td0Var.f39662r) {
            td0Var.Q = i10;
        } else if (i7 == td0Var.d) {
            td0Var.J = i10;
        } else if (i7 == td0Var.f39644c) {
            td0Var.I = i10;
        } else if (i7 == td0Var.f39649f) {
            td0Var.K = i10;
        } else if (i7 == td0Var.f39647e) {
            td0Var.L = i10;
        } else if (i7 == td0Var.f39669w) {
            td0Var.S = i10;
        } else if (i7 == td0Var.f39664s) {
            td0Var.R = i10;
        } else if (i7 == td0Var.f39671x) {
            td0Var.T = i10;
        } else if (i7 == td0Var.f39673y) {
            td0Var.V = i10;
        } else if (i7 == td0Var.h) {
            td0Var.M = i10;
        } else if (i7 == td0Var.f39657n) {
            td0Var.N = i10;
        }
        wy wyVar = td0Var.m0;
        if (wyVar != null) {
            wyVar.c(true, false, false);
        }
        td0Var.e();
    }

    @Override
    public void l(int i7) {
        org.telegram.messenger.z10 z10Var = ((b41) this.f35079b).C;
        if (z10Var != null) {
            z10Var.a(Integer.valueOf(i7));
        }
    }

    @Override
    public void m(java.lang.Object r17, java.lang.Object r18, java.lang.Number r19, java.io.Serializable r20, java.io.Serializable r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gx.m(java.lang.Object, java.lang.Object, java.lang.Number, java.io.Serializable, java.io.Serializable):void");
    }

    @Override
    public Object o(Object obj) {
        ra0 ra0Var = (ra0) obj;
        return Float.valueOf(((r1.f) this.f35079b).f55730a / 100.0f);
    }

    @Override
    public boolean y(org.telegram.ui.yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        jm0 jm0Var = (jm0) this.f35079b;
        int i11 = jm0Var.K0;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = jm0Var.C0;
        for (org.telegram.ui.sz szVar : hashMap.keySet()) {
            arrayList2.add((org.telegram.messenger.gj) hashMap.get(szVar));
        }
        hashMap.clear();
        jm0Var.Q(false);
        boolean z12 = true;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.ur) arrayList.get(0)).f26861a != org.telegram.messenger.m10.i(org.telegram.messenger.c.a(i11).f22782a).e() && charSequence == null) {
            long j3 = ((org.telegram.messenger.ur) arrayList.get(0)).f26861a;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (org.telegram.messenger.m5.C(j3)) {
                k10.putInt("enc_id", (int) (4294967295L & j3));
            } else {
                if (org.telegram.messenger.m5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (!org.telegram.messenger.np.s1(org.telegram.messenger.c.a(i11).f22782a).E(k10, ywVar, null, null)) {
                    return true;
                }
            }
            org.telegram.ui.an anVar = new org.telegram.ui.an(k10);
            ywVar.presentFragment(anVar, true);
            anVar.hc(arrayList2);
            return true;
        }
        int i12 = 0;
        while (i12 < arrayList.size()) {
            long j10 = ((org.telegram.messenger.ur) arrayList.get(i12)).f26861a;
            if (charSequence != null) {
                org.telegram.messenger.ez.C(org.telegram.messenger.c.a(i11).f22782a).r0(org.telegram.messenger.cz.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            org.telegram.messenger.ez.C(org.telegram.messenger.c.a(i11).f22782a).q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i12++;
            z12 = z12;
        }
        boolean z13 = z12;
        ywVar.finishFragment();
        return z13;
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
    }

    @Override
    public void l0(ArrayList arrayList) {
    }

    @Override
    public void d() {
    }

    @Override
    public void f() {
    }

    @Override
    public void j() {
    }

    @Override
    public void p() {
    }

    @Override
    public void E(float f10, int i7) {
    }

    @Override
    public void O(int i7, Drawable drawable) {
    }
}
