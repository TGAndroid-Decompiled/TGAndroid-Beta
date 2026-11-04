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
import org.telegram.ui.m91;
public final class zw implements org.telegram.messenger.s10, org.telegram.ui.ActionBar.p1, kg.u1, qe.b, org.telegram.messenger.e9, l70, bd0, hj0, org.telegram.ui.nw, ei.h7, org.telegram.messenger.or, p61, org.telegram.messenger.jc, tt0, org.telegram.messenger.ec {
    public final int f41139a;
    public final Object f41140b;

    public zw(Object obj, int i3) {
        this.f41139a = i3;
        this.f41140b = obj;
    }

    @Override
    public a0.h C0() {
        return null;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean J1(int i3) {
        return true;
    }

    @Override
    public boolean N(org.telegram.ui.uw uwVar) {
        return false;
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        ((r80) this.f41140b).c0();
    }

    @Override
    public void a(String str) {
        switch (this.f41139a) {
            case 20:
                ws0 ws0Var = ((xp0) this.f41140b).d;
                ws0.v(ws0Var).r(ws0Var.m1, str, new to0(ws0Var, 1));
                return;
            default:
                q21 q21Var = (q21) this.f41140b;
                q21Var.X1 = str;
                q21Var.c2.O(true);
                return;
        }
    }

    @Override
    public void c(boolean z10) {
        ei.r6 r6Var = (ei.r6) this.f41140b;
        if (z10) {
            r6Var.p(30, false);
        }
    }

    @Override
    public void d() {
        ((hc0) this.f41140b).K0(true);
    }

    @Override
    public void e(int i3, int i10) {
        qt0 qt0Var = (qt0) this.f41140b;
        qt0Var.f37540x = i3;
        qt0Var.f37541y = i10;
        ai.x2 x2Var = qt0Var.M;
        if (x2Var != null) {
            x2Var.invalidate();
        }
    }

    @Override
    public boolean f(int i3, View view) {
        th0 th0Var;
        switch (this.f41139a) {
            case 15:
                uh0 uh0Var = (uh0) this.f41140b;
                ArrayList arrayList = uh0Var.f38753n;
                if (uh0Var.f38752f.d(i3) == 0 && (th0Var = uh0Var.G) != null) {
                    th0Var.f(org.telegram.messenger.zi.C1(((TLRPC.MessagePeerReaction) arrayList.get(i3)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i3));
                    return true;
                }
                return true;
            default:
                hl0 hl0Var = (hl0) this.f41140b;
                ci.r4 r4Var = hl0Var.f34444c;
                org.telegram.messenger.zi E = r4Var.E(i3);
                hl0 hl0Var2 = (hl0) r4Var.d;
                if (E == null) {
                    return false;
                }
                if (!hl0Var.J.I()) {
                    hl0Var.J.h();
                    r4Var.k(0, hl0Var2.f34448r);
                }
                if (hl0Var.J.I()) {
                    hl0Var.J.w(E, view, 0);
                    if (!hl0Var.J.I()) {
                        r4Var.k(0, hl0Var2.f34448r);
                    }
                    org.telegram.ui.pz pzVar = hl0Var.K;
                    int f12 = E.f1();
                    pzVar.f48707a = org.telegram.messenger.zi.B0(E.f26868k);
                    pzVar.f48708b = f12;
                }
                return true;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f41139a) {
            case 1:
                org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(((vx) this.f41140b).f39817w.f33529d1);
                b02.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new org.telegram.messenger.zg(b02, 1));
                return;
            case 3:
                ((org.telegram.ui.f4) this.f41140b).run();
                return;
            case 4:
                ((a10) this.f41140b).J0();
                return;
            case 6:
                t50 t50Var = (t50) this.f41140b;
                a0.h hVar = t50Var.X1;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    arrayList.add(org.telegram.messenger.hp.s1(t50Var.f28583a).a2(Long.valueOf(hVar.j(i10))));
                }
                org.telegram.ui.m40 m40Var = t50Var.f38290d2;
                if (m40Var != null) {
                    m40Var.h(0, arrayList);
                }
                t50Var.dismiss();
                return;
            case 22:
                zv0 zv0Var = (zv0) this.f41140b;
                zv0Var.f41138e.presentFragment(new StickersActivity(zv0Var.d, null));
                s1Var.dismiss();
                return;
            default:
                org.telegram.messenger.g0.v1((aw0) this.f41140b);
                s1Var.dismiss();
                return;
        }
    }

    @Override
    public void j(java.lang.Object r17, java.lang.Object r18, java.lang.Number r19, java.io.Serializable r20, java.io.Serializable r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zw.j(java.lang.Object, java.lang.Object, java.lang.Number, java.io.Serializable, java.io.Serializable):void");
    }

    @Override
    public Object k(Object obj) {
        la0 la0Var = (la0) obj;
        return Float.valueOf(((q1.f) this.f41140b).f53635a / 100.0f);
    }

    @Override
    public a0.h k1() {
        return null;
    }

    @Override
    public void l(int i3) {
        org.telegram.messenger.u10 u10Var = ((r31) this.f41140b).C;
        if (u10Var != null) {
            u10Var.a(Integer.valueOf(i3));
        }
    }

    @Override
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        r51 r51Var;
        double d;
        double d10;
        int i3;
        int i10;
        int ceil;
        double ceil2;
        s51 s51Var = (s51) this.f41140b;
        ImageReceiver imageReceiver2 = s51Var.R;
        if (z10) {
            if (s51Var.O != null || s51Var.f37921e0 != null) {
                int L = org.telegram.messenger.g0.L(150.0f);
                org.telegram.ui.tp0 tp0Var = s51Var.O;
                if (tp0Var != null) {
                    ArrayList arrayList = tp0Var.f38727w;
                    int indexOf = arrayList.indexOf(tp0Var.c((int) s51Var.P));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = tp0Var.getVideoDuration() / 1000;
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
                    float o10 = imageReceiver2.o() / ((int) Math.ceil(i10 / 5.0f));
                    org.telegram.ui.tp0 tp0Var2 = s51Var.O;
                    int i11 = (int) s51Var.P;
                    int videoDuration2 = tp0Var2.getVideoDuration() / 1000;
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
                    s51Var.S = (int) ((min % 5) * q10);
                    s51Var.T = (int) ((min / 5) * o10);
                    s51Var.U = (int) q10;
                    s51Var.V = (int) o10;
                } else {
                    z13 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < s51Var.f37921e0.size()) {
                            r51Var = (r51) s51Var.f37921e0.get(i12);
                            if (i12 == 0) {
                                d = 0.0d;
                            } else {
                                d = r51Var.f37656a;
                            }
                            if (i12 == s51Var.f37921e0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((r51) s51Var.f37921e0.get(i12 + 1)).f37656a;
                            }
                            double d11 = s51Var.P;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i12++;
                        } else {
                            r51Var = null;
                            break;
                        }
                    }
                    if (r51Var != null) {
                        s51Var.S = r51Var.f37657b;
                        s51Var.T = r51Var.f37658c;
                        s51Var.U = s51Var.f37918c0;
                        s51Var.V = s51Var.f37919d0;
                    } else {
                        return;
                    }
                }
                s51Var.Q = z13;
                float f10 = s51Var.U / s51Var.V;
                if (f10 > 1.0f) {
                    i3 = (int) (L / f10);
                } else {
                    L = (int) (L * f10);
                    i3 = L;
                }
                ViewGroup.LayoutParams layoutParams = s51Var.getLayoutParams();
                if (s51Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i3) {
                    layoutParams.width = L;
                    layoutParams.height = i3;
                    s51Var.setVisibility(0);
                    s51Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void m(int i3, int i10) {
        nd0 nd0Var = (nd0) ((org.telegram.ui.n4) this.f41140b).f47865e;
        if (i3 == nd0Var.f36459b) {
            nd0Var.H = i10;
        } else if (i3 == nd0Var.f36479r) {
            nd0Var.Q = i10;
        } else if (i3 == nd0Var.d) {
            nd0Var.J = i10;
        } else if (i3 == nd0Var.f36461c) {
            nd0Var.I = i10;
        } else if (i3 == nd0Var.f36466f) {
            nd0Var.K = i10;
        } else if (i3 == nd0Var.f36464e) {
            nd0Var.L = i10;
        } else if (i3 == nd0Var.f36486w) {
            nd0Var.S = i10;
        } else if (i3 == nd0Var.f36481s) {
            nd0Var.R = i10;
        } else if (i3 == nd0Var.f36488x) {
            nd0Var.T = i10;
        } else if (i3 == nd0Var.f36490y) {
            nd0Var.V = i10;
        } else if (i3 == nd0Var.h) {
            nd0Var.M = i10;
        } else if (i3 == nd0Var.f36474n) {
            nd0Var.N = i10;
        }
        py pyVar = nd0Var.m0;
        if (pyVar != null) {
            pyVar.c(true, false, false);
        }
        nd0Var.d();
    }

    @Override
    public void r(int i3) {
        p50 p50Var = (p50) this.f41140b;
        t50 t50Var = p50Var.f37068n;
        t50Var.O0(p50Var.f37067f - 1);
        if (p50Var.h == null && !p50Var.f37066e.e() && p50Var.b() <= 2) {
            t50Var.f38999r1.e(false, true);
        }
        p50Var.f();
    }

    @Override
    public boolean y(org.telegram.ui.uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        im0 im0Var = (im0) this.f41140b;
        int i11 = im0Var.K0;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = im0Var.C0;
        for (org.telegram.ui.pz pzVar : hashMap.keySet()) {
            arrayList2.add((org.telegram.messenger.zi) hashMap.get(pzVar));
        }
        hashMap.clear();
        im0Var.R(false);
        boolean z12 = true;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.pr) arrayList.get(0)).f24797a != org.telegram.messenger.h10.i(org.telegram.messenger.c.a(i11).f21919a).e() && charSequence == null) {
            long j10 = ((org.telegram.messenger.pr) arrayList.get(0)).f24797a;
            Bundle k10 = a1.g.k("scrollToTopOnResume", true);
            if (org.telegram.messenger.m5.C(j10)) {
                k10.putInt("enc_id", (int) (4294967295L & j10));
            } else {
                if (org.telegram.messenger.m5.E(j10)) {
                    k10.putLong("user_id", j10);
                } else {
                    k10.putLong("chat_id", -j10);
                }
                if (!org.telegram.messenger.hp.s1(org.telegram.messenger.c.a(i11).f21919a).E(k10, uwVar, null, null)) {
                    return true;
                }
            }
            org.telegram.ui.wm wmVar = new org.telegram.ui.wm(k10);
            uwVar.presentFragment(wmVar, true);
            wmVar.dc(arrayList2);
            return true;
        }
        int i12 = 0;
        while (i12 < arrayList.size()) {
            long j11 = ((org.telegram.messenger.pr) arrayList.get(i12)).f24797a;
            if (charSequence != null) {
                org.telegram.messenger.yy.C(org.telegram.messenger.c.a(i11).f21919a).r0(org.telegram.messenger.wy.b(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            org.telegram.messenger.yy.C(org.telegram.messenger.c.a(i11).f21919a).q0(arrayList2, j11, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i12++;
            z12 = z12;
        }
        boolean z13 = z12;
        uwVar.finishFragment();
        return z13;
    }

    @Override
    public void D(ImageReceiver imageReceiver) {
    }

    @Override
    public void b2(ArrayList arrayList) {
    }

    @Override
    public void b() {
    }

    @Override
    public void h() {
    }

    @Override
    public void i() {
    }

    @Override
    public void p() {
    }

    @Override
    public void F(float f10, int i3) {
    }

    @Override
    public void F0(int i3, Drawable drawable) {
    }
}
