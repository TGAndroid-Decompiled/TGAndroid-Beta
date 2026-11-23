package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.w91;
public final class hy implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.u10, jg.y1, te.b, org.telegram.messenger.i9, c80, rd0, sj0, org.telegram.ui.vw, fi.x6, org.telegram.messenger.rr, m71, org.telegram.messenger.nc, fu0, hi.n7, hi.m7, org.telegram.messenger.jc {
    public final int f35847a;
    public final Object f35848b;

    public hy(Object obj, int i7) {
        this.f35847a = i7;
        this.f35848b = obj;
    }

    @Override
    public boolean F() {
        return false;
    }

    @Override
    public void K(int i7, float f10, float f11, te.c cVar) {
        ((h90) this.f35848b).c0();
    }

    @Override
    public boolean O(org.telegram.ui.bx bxVar) {
        return false;
    }

    @Override
    public boolean W1(int i7) {
        return true;
    }

    @Override
    public a0.h Y0() {
        return null;
    }

    @Override
    public void a(String str) {
        switch (this.f35847a) {
            case 19:
                it0 it0Var = ((hq0) this.f35848b).d;
                it0.v(it0Var).r(it0Var.f36130m1, str, new fp0(it0Var, 1));
                return;
            default:
                l31 l31Var = (l31) this.f35848b;
                l31Var.f37010a2 = str;
                l31Var.f37014f2.O(true);
                return;
        }
    }

    @Override
    public boolean b(int i7, View view) {
        fi0 fi0Var;
        switch (this.f35847a) {
            case 14:
                gi0 gi0Var = (gi0) this.f35848b;
                ArrayList arrayList = gi0Var.f35445n;
                if (gi0Var.f35444f.d(i7) == 0 && (fi0Var = gi0Var.G) != null) {
                    fi0Var.a(org.telegram.messenger.fj.B1(((TLRPC.MessagePeerReaction) arrayList.get(i7)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i7));
                    return true;
                }
                return true;
            default:
                sl0 sl0Var = (sl0) this.f35848b;
                di.l4 l4Var = sl0Var.f39640c;
                org.telegram.messenger.fj E = l4Var.E(i7);
                sl0 sl0Var2 = (sl0) l4Var.d;
                if (E == null) {
                    return false;
                }
                if (!sl0Var.J.i0()) {
                    sl0Var.J.h();
                    l4Var.k(0, sl0Var2.f39644r);
                }
                if (sl0Var.J.i0()) {
                    sl0Var.J.S(E, view, 0);
                    if (!sl0Var.J.i0()) {
                        l4Var.k(0, sl0Var2.f39644r);
                    }
                    org.telegram.ui.uz uzVar = sl0Var.K;
                    int e12 = E.e1();
                    uzVar.f52761a = org.telegram.messenger.fj.B0(E.f24073k);
                    uzVar.f52762b = e12;
                }
                return true;
        }
    }

    @Override
    public void c(boolean z10) {
        fi.h6 h6Var = (fi.h6) this.f35848b;
        if (z10) {
            h6Var.p(30, false);
        }
    }

    @Override
    public void e() {
        ((wc0) this.f35848b).L0(true);
    }

    @Override
    public void f(int i7, int i10) {
        cu0 cu0Var = (cu0) this.f35848b;
        cu0Var.f34147x = i7;
        cu0Var.f34148y = i10;
        bi.o3 o3Var = cu0Var.M;
        if (o3Var != null) {
            o3Var.invalidate();
        }
    }

    @Override
    public long get() {
        h61 h61Var = ((org.telegram.ui.fo0) this.f35848b).f47939a.G2;
        if (h61Var != null) {
            return h61Var.S();
        }
        return 0L;
    }

    @Override
    public Object h(Object obj) {
        za0 za0Var = (za0) obj;
        return Float.valueOf(((r1.f) this.f35848b).f56428a / 100.0f);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f35847a) {
            case 0:
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(((iy) this.f35848b).f36203w.f39047d1);
                d02.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new org.telegram.messenger.ih(d02, 1));
                return;
            case 2:
                ((org.telegram.ui.f0) this.f35848b).run();
                return;
            case 3:
                ((p10) this.f35848b).K0();
                return;
            case 5:
                i60 i60Var = (i60) this.f35848b;
                a0.h hVar = i60Var.f35937a2;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    arrayList.add(org.telegram.messenger.mp.u1(i60Var.f30223a).c2(Long.valueOf(hVar.j(i10))));
                }
                org.telegram.ui.t40 t40Var = i60Var.f35942g2;
                if (t40Var != null) {
                    t40Var.g(0, arrayList);
                }
                i60Var.dismiss();
                return;
            case 21:
                lw0 lw0Var = (lw0) this.f35848b;
                lw0Var.f37246e.presentFragment(new StickersActivity(lw0Var.d, null));
                t1Var.dismiss();
                return;
            default:
                org.telegram.messenger.g0.v1((mw0) this.f35848b);
                t1Var.dismiss();
                return;
        }
    }

    @Override
    public void k(java.lang.Object r17, java.lang.Object r18, java.lang.Number r19, java.io.Serializable r20, java.io.Serializable r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hy.k(java.lang.Object, java.lang.Object, java.lang.Number, java.io.Serializable, java.io.Serializable):void");
    }

    @Override
    public void l(int i7, int i10) {
        de0 de0Var = (de0) ((org.telegram.ui.l4) this.f35848b).f49583e;
        if (i7 == de0Var.f34282b) {
            de0Var.H = i10;
        } else if (i7 == de0Var.f34302r) {
            de0Var.Q = i10;
        } else if (i7 == de0Var.d) {
            de0Var.J = i10;
        } else if (i7 == de0Var.f34284c) {
            de0Var.I = i10;
        } else if (i7 == de0Var.f34289f) {
            de0Var.K = i10;
        } else if (i7 == de0Var.f34287e) {
            de0Var.L = i10;
        } else if (i7 == de0Var.f34309w) {
            de0Var.S = i10;
        } else if (i7 == de0Var.f34304s) {
            de0Var.R = i10;
        } else if (i7 == de0Var.f34311x) {
            de0Var.T = i10;
        } else if (i7 == de0Var.f34313y) {
            de0Var.V = i10;
        } else if (i7 == de0Var.h) {
            de0Var.M = i10;
        } else if (i7 == de0Var.f34297n) {
            de0Var.N = i10;
        }
        bz bzVar = de0Var.m0;
        if (bzVar != null) {
            bzVar.c(true, false, false);
        }
        de0Var.d();
    }

    @Override
    public float m(CharSequence charSequence) {
        return ((TextPaint) this.f35848b).measureText(charSequence, 0, charSequence.length());
    }

    @Override
    public void n(int i7) {
        org.telegram.messenger.w10 w10Var = ((n41) this.f35848b).D;
        if (w10Var != null) {
            w10Var.a(Integer.valueOf(i7));
        }
    }

    @Override
    public a0.h u1() {
        return null;
    }

    @Override
    public void v(int i7) {
        d60 d60Var = (d60) this.f35848b;
        i60 i60Var = d60Var.f34223n;
        i60Var.P0(d60Var.f34222f - 1);
        if (d60Var.h == null && !d60Var.f34221e.e() && d60Var.b() <= 2) {
            i60Var.f38704u1.e(false, true);
        }
        d60Var.f();
    }

    @Override
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        o61 o61Var;
        double d;
        double d2;
        int i7;
        int i10;
        int ceil;
        double ceil2;
        p61 p61Var = (p61) this.f35848b;
        ImageReceiver imageReceiver2 = p61Var.R;
        if (z10) {
            if (p61Var.O != null || p61Var.f38400e0 != null) {
                int L = org.telegram.messenger.g0.L(150.0f);
                org.telegram.ui.dq0 dq0Var = p61Var.O;
                if (dq0Var != null) {
                    ArrayList arrayList = dq0Var.f36728w;
                    int indexOf = arrayList.indexOf(dq0Var.c((int) p61Var.P));
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
                    org.telegram.ui.dq0 dq0Var2 = p61Var.O;
                    int i11 = (int) p61Var.P;
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
                    p61Var.S = (int) ((min % 5) * q10);
                    p61Var.T = (int) ((min / 5) * o4);
                    p61Var.U = (int) q10;
                    p61Var.V = (int) o4;
                } else {
                    z13 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < p61Var.f38400e0.size()) {
                            o61Var = (o61) p61Var.f38400e0.get(i12);
                            if (i12 == 0) {
                                d = 0.0d;
                            } else {
                                d = o61Var.f38043a;
                            }
                            if (i12 == p61Var.f38400e0.size() - 1) {
                                d2 = 9.9999999E7d;
                            } else {
                                d2 = ((o61) p61Var.f38400e0.get(i12 + 1)).f38043a;
                            }
                            double d10 = p61Var.P;
                            if (d10 >= d && d10 <= d2) {
                                break;
                            }
                            i12++;
                        } else {
                            o61Var = null;
                            break;
                        }
                    }
                    if (o61Var != null) {
                        p61Var.S = o61Var.f38044b;
                        p61Var.T = o61Var.f38045c;
                        p61Var.U = p61Var.f38397c0;
                        p61Var.V = p61Var.f38398d0;
                    } else {
                        return;
                    }
                }
                p61Var.Q = z13;
                float f10 = p61Var.U / p61Var.V;
                if (f10 > 1.0f) {
                    i7 = (int) (L / f10);
                } else {
                    L = (int) (L * f10);
                    i7 = L;
                }
                ViewGroup.LayoutParams layoutParams = p61Var.getLayoutParams();
                if (p61Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i7) {
                    layoutParams.width = L;
                    layoutParams.height = i7;
                    p61Var.setVisibility(0);
                    p61Var.requestLayout();
                }
            }
        }
    }

    @Override
    public boolean z(org.telegram.ui.bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        tm0 tm0Var = (tm0) this.f35848b;
        int i11 = tm0Var.K0;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = tm0Var.C0;
        for (org.telegram.ui.uz uzVar : hashMap.keySet()) {
            arrayList2.add((org.telegram.messenger.fj) hashMap.get(uzVar));
        }
        hashMap.clear();
        tm0Var.P(false);
        boolean z12 = true;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.sr) arrayList.get(0)).f26946a != org.telegram.messenger.i10.i(org.telegram.messenger.c.a(i11).f23343a).e() && charSequence == null) {
            long j3 = ((org.telegram.messenger.sr) arrayList.get(0)).f26946a;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (org.telegram.messenger.n5.C(j3)) {
                k10.putInt("enc_id", (int) (4294967295L & j3));
            } else {
                if (org.telegram.messenger.n5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (!org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(i11).f23343a).E(k10, bxVar, null, null)) {
                    return true;
                }
            }
            org.telegram.ui.bn bnVar = new org.telegram.ui.bn(k10);
            bxVar.presentFragment(bnVar, true);
            bnVar.hc(arrayList2);
            return true;
        }
        int i12 = 0;
        while (i12 < arrayList.size()) {
            long j10 = ((org.telegram.messenger.sr) arrayList.get(i12)).f26946a;
            if (charSequence != null) {
                org.telegram.messenger.zy.C(org.telegram.messenger.c.a(i11).f23343a).r0(org.telegram.messenger.xy.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            org.telegram.messenger.zy.C(org.telegram.messenger.c.a(i11).f23343a).q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i12++;
            z12 = z12;
        }
        boolean z13 = z12;
        bxVar.finishFragment();
        return z13;
    }

    @Override
    public void m2(ArrayList arrayList) {
    }

    @Override
    public void r(ImageReceiver imageReceiver) {
    }

    @Override
    public void d() {
    }

    @Override
    public void g() {
    }

    @Override
    public void j() {
    }

    @Override
    public void o() {
    }

    @Override
    public void G(float f10, int i7) {
    }

    @Override
    public void J(int i7, Drawable drawable) {
    }
}
