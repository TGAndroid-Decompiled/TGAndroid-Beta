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
import org.telegram.ui.y91;
public final class iy implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.v10, jg.y1, te.b, org.telegram.messenger.i9, d80, rd0, qj0, org.telegram.ui.ww, fi.x6, org.telegram.messenger.rr, i71, org.telegram.messenger.nc, du0, org.telegram.messenger.jc {
    public final int f36265a;
    public final Object f36266b;

    public iy(Object obj, int i7) {
        this.f36265a = i7;
        this.f36266b = obj;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        ((i90) this.f36266b).c0();
    }

    @Override
    public a0.h K0() {
        return null;
    }

    @Override
    public boolean P(org.telegram.ui.cx cxVar) {
        return false;
    }

    @Override
    public void a(String str) {
        switch (this.f36265a) {
            case 19:
                gt0 gt0Var = ((gq0) this.f36266b).d;
                gt0.v(gt0Var).r(gt0Var.f35606m1, str, new ep0(gt0Var, 1));
                return;
            default:
                k31 k31Var = (k31) this.f36266b;
                k31Var.f36665a2 = str;
                k31Var.f36669f2.O(true);
                return;
        }
    }

    @Override
    public void b(boolean z10) {
        fi.h6 h6Var = (fi.h6) this.f36266b;
        if (z10) {
            h6Var.p(30, false);
        }
    }

    @Override
    public boolean c(int i7, View view) {
        di0 di0Var;
        switch (this.f36265a) {
            case 14:
                ei0 ei0Var = (ei0) this.f36266b;
                ArrayList arrayList = ei0Var.f34715n;
                if (ei0Var.f34714f.d(i7) == 0 && (di0Var = ei0Var.G) != null) {
                    di0Var.a(org.telegram.messenger.fj.B1(((TLRPC.MessagePeerReaction) arrayList.get(i7)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i7));
                    return true;
                }
                return true;
            default:
                ql0 ql0Var = (ql0) this.f36266b;
                di.l4 l4Var = ql0Var.f38829c;
                org.telegram.messenger.fj E = l4Var.E(i7);
                ql0 ql0Var2 = (ql0) l4Var.d;
                if (E == null) {
                    return false;
                }
                if (!ql0Var.J.V1()) {
                    ql0Var.J.n();
                    l4Var.k(0, ql0Var2.f38833r);
                }
                if (ql0Var.J.V1()) {
                    ql0Var.J.Z0(E, view, 0);
                    if (!ql0Var.J.V1()) {
                        l4Var.k(0, ql0Var2.f38833r);
                    }
                    org.telegram.ui.vz vzVar = ql0Var.K;
                    int e12 = E.e1();
                    vzVar.f52876a = org.telegram.messenger.fj.B0(E.f23965k);
                    vzVar.f52877b = e12;
                }
                return true;
        }
    }

    @Override
    public a0.h d1() {
        return null;
    }

    @Override
    public void e() {
        ((xc0) this.f36266b).L0(true);
    }

    @Override
    public void g(int i7, int i10) {
        au0 au0Var = (au0) this.f36266b;
        au0Var.f33468x = i7;
        au0Var.f33469y = i10;
        bi.i3 i3Var = au0Var.M;
        if (i3Var != null) {
            i3Var.invalidate();
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f36265a) {
            case 0:
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(((jy) this.f36266b).f36560w.f39345d1);
                d02.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new org.telegram.messenger.ih(d02, 1));
                return;
            case 2:
                ((org.telegram.ui.b0) this.f36266b).run();
                return;
            case 3:
                ((o10) this.f36266b).K0();
                return;
            case 5:
                j60 j60Var = (j60) this.f36266b;
                a0.h hVar = j60Var.f36352a2;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    arrayList.add(org.telegram.messenger.mp.u1(j60Var.f30187a).c2(Long.valueOf(hVar.j(i10))));
                }
                org.telegram.ui.u40 u40Var = j60Var.f36357g2;
                if (u40Var != null) {
                    u40Var.i(0, arrayList);
                }
                j60Var.dismiss();
                return;
            case 21:
                kw0 kw0Var = (kw0) this.f36266b;
                kw0Var.f36907e.presentFragment(new StickersActivity(kw0Var.d, null));
                u1Var.dismiss();
                return;
            default:
                org.telegram.messenger.g0.v1((lw0) this.f36266b);
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public void j(int i7, int i10) {
        de0 de0Var = (de0) ((org.telegram.ui.l4) this.f36266b).f49432e;
        if (i7 == de0Var.f34386b) {
            de0Var.H = i10;
        } else if (i7 == de0Var.f34406r) {
            de0Var.Q = i10;
        } else if (i7 == de0Var.d) {
            de0Var.J = i10;
        } else if (i7 == de0Var.f34388c) {
            de0Var.I = i10;
        } else if (i7 == de0Var.f34393f) {
            de0Var.K = i10;
        } else if (i7 == de0Var.f34391e) {
            de0Var.L = i10;
        } else if (i7 == de0Var.f34413w) {
            de0Var.S = i10;
        } else if (i7 == de0Var.f34408s) {
            de0Var.R = i10;
        } else if (i7 == de0Var.f34415x) {
            de0Var.T = i10;
        } else if (i7 == de0Var.f34417y) {
            de0Var.V = i10;
        } else if (i7 == de0Var.h) {
            de0Var.M = i10;
        } else if (i7 == de0Var.f34401n) {
            de0Var.N = i10;
        }
        cz czVar = de0Var.m0;
        if (czVar != null) {
            czVar.c(true, false, false);
        }
        de0Var.d();
    }

    @Override
    public void k(int i7) {
        org.telegram.messenger.x10 x10Var = ((l41) this.f36266b).D;
        if (x10Var != null) {
            x10Var.a(Integer.valueOf(i7));
        }
    }

    @Override
    public void l(java.lang.Object r17, java.lang.Object r18, java.lang.Number r19, java.io.Serializable r20, java.io.Serializable r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iy.l(java.lang.Object, java.lang.Object, java.lang.Number, java.io.Serializable, java.io.Serializable):void");
    }

    @Override
    public Object m(Object obj) {
        bb0 bb0Var = (bb0) obj;
        return Float.valueOf(((r1.f) this.f36266b).f56305a / 100.0f);
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        k61 k61Var;
        double d;
        double d2;
        int i7;
        int i10;
        int ceil;
        double ceil2;
        l61 l61Var = (l61) this.f36266b;
        ImageReceiver imageReceiver2 = l61Var.R;
        if (z10) {
            if (l61Var.O != null || l61Var.f37048e0 != null) {
                int L = org.telegram.messenger.g0.L(150.0f);
                org.telegram.ui.dq0 dq0Var = l61Var.O;
                if (dq0Var != null) {
                    ArrayList arrayList = dq0Var.f36751w;
                    int indexOf = arrayList.indexOf(dq0Var.c((int) l61Var.P));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = dq0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.dq0 dq0Var2 = l61Var.O;
                    int i11 = (int) l61Var.P;
                    int videoDuration2 = dq0Var2.getVideoDuration() / 1000;
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
                    l61Var.S = (int) ((min % 5) * q10);
                    l61Var.T = (int) ((min / 5) * o4);
                    l61Var.U = (int) q10;
                    l61Var.V = (int) o4;
                } else {
                    z13 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < l61Var.f37048e0.size()) {
                            k61Var = (k61) l61Var.f37048e0.get(i12);
                            if (i12 == 0) {
                                d = 0.0d;
                            } else {
                                d = k61Var.f36692a;
                            }
                            if (i12 == l61Var.f37048e0.size() - 1) {
                                d2 = 9.9999999E7d;
                            } else {
                                d2 = ((k61) l61Var.f37048e0.get(i12 + 1)).f36692a;
                            }
                            double d10 = l61Var.P;
                            if (d10 >= d && d10 <= d2) {
                                break;
                            }
                            i12++;
                        } else {
                            k61Var = null;
                            break;
                        }
                    }
                    if (k61Var != null) {
                        l61Var.S = k61Var.f36693b;
                        l61Var.T = k61Var.f36694c;
                        l61Var.U = l61Var.f37045c0;
                        l61Var.V = l61Var.f37046d0;
                    } else {
                        return;
                    }
                }
                l61Var.Q = z13;
                float f10 = l61Var.U / l61Var.V;
                if (f10 > 1.0f) {
                    i7 = (int) (L / f10);
                } else {
                    L = (int) (L * f10);
                    i7 = L;
                }
                ViewGroup.LayoutParams layoutParams = l61Var.getLayoutParams();
                if (l61Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i7) {
                    layoutParams.width = L;
                    layoutParams.height = i7;
                    l61Var.setVisibility(0);
                    l61Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void r(int i7) {
        d60 d60Var = (d60) this.f36266b;
        j60 j60Var = d60Var.f34288n;
        j60Var.P0(d60Var.f34287f - 1);
        if (d60Var.h == null && !d60Var.f34286e.e() && d60Var.b() <= 2) {
            j60Var.f37990u1.e(false, true);
        }
        d60Var.f();
    }

    @Override
    public boolean v1(int i7) {
        return true;
    }

    @Override
    public boolean y(org.telegram.ui.cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        rm0 rm0Var = (rm0) this.f36266b;
        int i11 = rm0Var.K0;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = rm0Var.C0;
        for (org.telegram.ui.vz vzVar : hashMap.keySet()) {
            arrayList2.add((org.telegram.messenger.fj) hashMap.get(vzVar));
        }
        hashMap.clear();
        rm0Var.N(false);
        boolean z12 = true;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.sr) arrayList.get(0)).f26845a != org.telegram.messenger.j10.i(org.telegram.messenger.c.a(i11).f23218a).e() && charSequence == null) {
            long j3 = ((org.telegram.messenger.sr) arrayList.get(0)).f26845a;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (org.telegram.messenger.n5.C(j3)) {
                k10.putInt("enc_id", (int) (4294967295L & j3));
            } else {
                if (org.telegram.messenger.n5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (!org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(i11).f23218a).E(k10, cxVar, null, null)) {
                    return true;
                }
            }
            org.telegram.ui.bn bnVar = new org.telegram.ui.bn(k10);
            cxVar.presentFragment(bnVar, true);
            bnVar.hc(arrayList2);
            return true;
        }
        int i12 = 0;
        while (i12 < arrayList.size()) {
            long j10 = ((org.telegram.messenger.sr) arrayList.get(i12)).f26845a;
            if (charSequence != null) {
                org.telegram.messenger.zy.C(org.telegram.messenger.c.a(i11).f23218a).r0(org.telegram.messenger.xy.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            org.telegram.messenger.zy.C(org.telegram.messenger.c.a(i11).f23218a).q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i12++;
            z12 = z12;
        }
        boolean z13 = z12;
        cxVar.finishFragment();
        return z13;
    }

    @Override
    public void P1(ArrayList arrayList) {
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    @Override
    public void d() {
    }

    @Override
    public void f() {
    }

    @Override
    public void i() {
    }

    @Override
    public void o() {
    }

    @Override
    public void D(float f10, int i7) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }
}
