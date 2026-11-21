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
public final class ky implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.v10, jg.y1, te.b, org.telegram.messenger.i9, f80, sd0, sj0, org.telegram.ui.ww, fi.x6, org.telegram.messenger.rr, l71, org.telegram.messenger.nc, gu0, org.telegram.messenger.jc {
    public final int f37034a;
    public final Object f37035b;

    public ky(Object obj, int i7) {
        this.f37034a = i7;
        this.f37035b = obj;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        ((k90) this.f37035b).c0();
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
        switch (this.f37034a) {
            case 19:
                jt0 jt0Var = ((iq0) this.f37035b).d;
                jt0.v(jt0Var).r(jt0Var.f36653m1, str, new gp0(jt0Var, 1));
                return;
            default:
                m31 m31Var = (m31) this.f37035b;
                m31Var.f37404a2 = str;
                m31Var.f37408f2.O(true);
                return;
        }
    }

    @Override
    public void b(boolean z10) {
        fi.h6 h6Var = (fi.h6) this.f37035b;
        if (z10) {
            h6Var.p(30, false);
        }
    }

    @Override
    public boolean c(int i7, View view) {
        fi0 fi0Var;
        switch (this.f37034a) {
            case 14:
                gi0 gi0Var = (gi0) this.f37035b;
                ArrayList arrayList = gi0Var.f35566n;
                if (gi0Var.f35565f.d(i7) == 0 && (fi0Var = gi0Var.G) != null) {
                    fi0Var.a(org.telegram.messenger.fj.B1(((TLRPC.MessagePeerReaction) arrayList.get(i7)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i7));
                    return true;
                }
                return true;
            default:
                sl0 sl0Var = (sl0) this.f37035b;
                di.l4 l4Var = sl0Var.f39625c;
                org.telegram.messenger.fj E = l4Var.E(i7);
                sl0 sl0Var2 = (sl0) l4Var.d;
                if (E == null) {
                    return false;
                }
                if (!sl0Var.J.V1()) {
                    sl0Var.J.n();
                    l4Var.k(0, sl0Var2.f39629r);
                }
                if (sl0Var.J.V1()) {
                    sl0Var.J.Z0(E, view, 0);
                    if (!sl0Var.J.V1()) {
                        l4Var.k(0, sl0Var2.f39629r);
                    }
                    org.telegram.ui.vz vzVar = sl0Var.K;
                    int e12 = E.e1();
                    vzVar.f52917a = org.telegram.messenger.fj.B0(E.f23993k);
                    vzVar.f52918b = e12;
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
        ((yc0) this.f37035b).L0(true);
    }

    @Override
    public void g(int i7, int i10) {
        du0 du0Var = (du0) this.f37035b;
        du0Var.f34593x = i7;
        du0Var.f34594y = i10;
        bi.m3 m3Var = du0Var.M;
        if (m3Var != null) {
            m3Var.invalidate();
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f37034a) {
            case 0:
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(((ly) this.f37035b).f37323w.f40099d1);
                d02.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new org.telegram.messenger.ih(d02, 1));
                return;
            case 2:
                ((org.telegram.ui.b0) this.f37035b).run();
                return;
            case 3:
                ((r10) this.f37035b).K0();
                return;
            case 5:
                l60 l60Var = (l60) this.f37035b;
                a0.h hVar = l60Var.f37114a2;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    arrayList.add(org.telegram.messenger.mp.u1(l60Var.f30170a).c2(Long.valueOf(hVar.j(i10))));
                }
                org.telegram.ui.u40 u40Var = l60Var.f37119g2;
                if (u40Var != null) {
                    u40Var.i(0, arrayList);
                }
                l60Var.dismiss();
                return;
            case 21:
                mw0 mw0Var = (mw0) this.f37035b;
                mw0Var.f37656e.presentFragment(new StickersActivity(mw0Var.d, null));
                t1Var.dismiss();
                return;
            default:
                org.telegram.messenger.g0.v1((nw0) this.f37035b);
                t1Var.dismiss();
                return;
        }
    }

    @Override
    public void j(int i7, int i10) {
        ee0 ee0Var = (ee0) ((org.telegram.ui.l4) this.f37035b).f49470e;
        if (i7 == ee0Var.f34747b) {
            ee0Var.H = i10;
        } else if (i7 == ee0Var.f34767r) {
            ee0Var.Q = i10;
        } else if (i7 == ee0Var.d) {
            ee0Var.J = i10;
        } else if (i7 == ee0Var.f34749c) {
            ee0Var.I = i10;
        } else if (i7 == ee0Var.f34754f) {
            ee0Var.K = i10;
        } else if (i7 == ee0Var.f34752e) {
            ee0Var.L = i10;
        } else if (i7 == ee0Var.f34774w) {
            ee0Var.S = i10;
        } else if (i7 == ee0Var.f34769s) {
            ee0Var.R = i10;
        } else if (i7 == ee0Var.f34776x) {
            ee0Var.T = i10;
        } else if (i7 == ee0Var.f34778y) {
            ee0Var.V = i10;
        } else if (i7 == ee0Var.h) {
            ee0Var.M = i10;
        } else if (i7 == ee0Var.f34762n) {
            ee0Var.N = i10;
        }
        ez ezVar = ee0Var.m0;
        if (ezVar != null) {
            ezVar.c(true, false, false);
        }
        ee0Var.d();
    }

    @Override
    public void k(int i7) {
        org.telegram.messenger.x10 x10Var = ((o41) this.f37035b).D;
        if (x10Var != null) {
            x10Var.a(Integer.valueOf(i7));
        }
    }

    @Override
    public void l(java.lang.Object r17, java.lang.Object r18, java.lang.Number r19, java.io.Serializable r20, java.io.Serializable r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ky.l(java.lang.Object, java.lang.Object, java.lang.Number, java.io.Serializable, java.io.Serializable):void");
    }

    @Override
    public Object m(Object obj) {
        cb0 cb0Var = (cb0) obj;
        return Float.valueOf(((r1.f) this.f37035b).f56346a / 100.0f);
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        n61 n61Var;
        double d;
        double d2;
        int i7;
        int i10;
        int ceil;
        double ceil2;
        o61 o61Var = (o61) this.f37035b;
        ImageReceiver imageReceiver2 = o61Var.R;
        if (z10) {
            if (o61Var.O != null || o61Var.f38137e0 != null) {
                int L = org.telegram.messenger.g0.L(150.0f);
                org.telegram.ui.dq0 dq0Var = o61Var.O;
                if (dq0Var != null) {
                    ArrayList arrayList = dq0Var.f37170w;
                    int indexOf = arrayList.indexOf(dq0Var.c((int) o61Var.P));
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
                    org.telegram.ui.dq0 dq0Var2 = o61Var.O;
                    int i11 = (int) o61Var.P;
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
                    o61Var.S = (int) ((min % 5) * q10);
                    o61Var.T = (int) ((min / 5) * o4);
                    o61Var.U = (int) q10;
                    o61Var.V = (int) o4;
                } else {
                    z13 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < o61Var.f38137e0.size()) {
                            n61Var = (n61) o61Var.f38137e0.get(i12);
                            if (i12 == 0) {
                                d = 0.0d;
                            } else {
                                d = n61Var.f37816a;
                            }
                            if (i12 == o61Var.f38137e0.size() - 1) {
                                d2 = 9.9999999E7d;
                            } else {
                                d2 = ((n61) o61Var.f38137e0.get(i12 + 1)).f37816a;
                            }
                            double d10 = o61Var.P;
                            if (d10 >= d && d10 <= d2) {
                                break;
                            }
                            i12++;
                        } else {
                            n61Var = null;
                            break;
                        }
                    }
                    if (n61Var != null) {
                        o61Var.S = n61Var.f37817b;
                        o61Var.T = n61Var.f37818c;
                        o61Var.U = o61Var.f38134c0;
                        o61Var.V = o61Var.f38135d0;
                    } else {
                        return;
                    }
                }
                o61Var.Q = z13;
                float f10 = o61Var.U / o61Var.V;
                if (f10 > 1.0f) {
                    i7 = (int) (L / f10);
                } else {
                    L = (int) (L * f10);
                    i7 = L;
                }
                ViewGroup.LayoutParams layoutParams = o61Var.getLayoutParams();
                if (o61Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i7) {
                    layoutParams.width = L;
                    layoutParams.height = i7;
                    o61Var.setVisibility(0);
                    o61Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void r(int i7) {
        g60 g60Var = (g60) this.f37035b;
        l60 l60Var = g60Var.f35418n;
        l60Var.P0(g60Var.f35417f - 1);
        if (g60Var.h == null && !g60Var.f35416e.e() && g60Var.b() <= 2) {
            l60Var.f39078u1.e(false, true);
        }
        g60Var.f();
    }

    @Override
    public boolean v1(int i7) {
        return true;
    }

    @Override
    public boolean y(org.telegram.ui.cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        um0 um0Var = (um0) this.f37035b;
        int i11 = um0Var.K0;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = um0Var.C0;
        for (org.telegram.ui.vz vzVar : hashMap.keySet()) {
            arrayList2.add((org.telegram.messenger.fj) hashMap.get(vzVar));
        }
        hashMap.clear();
        um0Var.N(false);
        boolean z12 = true;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.sr) arrayList.get(0)).f26873a != org.telegram.messenger.j10.i(org.telegram.messenger.c.a(i11).f23246a).e() && charSequence == null) {
            long j3 = ((org.telegram.messenger.sr) arrayList.get(0)).f26873a;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (org.telegram.messenger.n5.C(j3)) {
                k10.putInt("enc_id", (int) (4294967295L & j3));
            } else {
                if (org.telegram.messenger.n5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (!org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(i11).f23246a).E(k10, cxVar, null, null)) {
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
            long j10 = ((org.telegram.messenger.sr) arrayList.get(i12)).f26873a;
            if (charSequence != null) {
                org.telegram.messenger.zy.C(org.telegram.messenger.c.a(i11).f23246a).r0(org.telegram.messenger.xy.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            org.telegram.messenger.zy.C(org.telegram.messenger.c.a(i11).f23246a).q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
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
