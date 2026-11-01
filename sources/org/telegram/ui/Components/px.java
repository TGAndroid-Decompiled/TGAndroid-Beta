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
import org.telegram.ui.nb1;
public final class px implements org.telegram.messenger.p20, org.telegram.ui.ActionBar.u1, zf.l1, fe.e, org.telegram.messenger.m9, i80, ce0, jk0, org.telegram.ui.tx, th.m5, org.telegram.messenger.gs, z71, org.telegram.messenger.rc, yu0, org.telegram.messenger.nc {
    public final int f29560a;
    public final Object f29561b;

    public px(Object obj, int i10) {
        this.f29560a = i10;
        this.f29561b = obj;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public a0.h M() {
        return null;
    }

    @Override
    public boolean O(org.telegram.ui.zx zxVar) {
        return false;
    }

    @Override
    public boolean Y(int i10) {
        return true;
    }

    @Override
    public void a(String str) {
        switch (this.f29560a) {
            case 20:
                au0 au0Var = ((zq0) this.f29561b).d;
                au0.t(au0Var).r(au0Var.l1, str, new tq0(au0Var, 1));
                return;
            default:
                y31 y31Var = (y31) this.f29561b;
                y31Var.W1 = str;
                y31Var.f32710b2.O(true);
                return;
        }
    }

    @Override
    public void c(boolean z10) {
        th.x4 x4Var = (th.x4) this.f29561b;
        if (z10) {
            x4Var.p(30, false);
        }
    }

    @Override
    public void d() {
        ((hd0) this.f29561b).K0(true);
    }

    @Override
    public void e(int i10, int i11) {
        vu0 vu0Var = (vu0) this.f29561b;
        vu0Var.f31921x = i10;
        vu0Var.f31922y = i11;
        bi.t0 t0Var = vu0Var.L;
        if (t0Var != null) {
            t0Var.invalidate();
        }
    }

    @Override
    public boolean f(int i10, View view) {
        vi0 vi0Var;
        switch (this.f29560a) {
            case 15:
                wi0 wi0Var = (wi0) this.f29561b;
                ArrayList arrayList = wi0Var.f32255n;
                if (wi0Var.f32254f.d(i10) == 0 && (vi0Var = wi0Var.F) != null) {
                    vi0Var.c(org.telegram.messenger.kj.C1(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                hm0 hm0Var = (hm0) this.f29561b;
                kg.f fVar = hm0Var.f26860c;
                org.telegram.messenger.kj E = fVar.E(i10);
                hm0 hm0Var2 = (hm0) fVar.d;
                if (E == null) {
                    return false;
                }
                if (!hm0Var.I.f()) {
                    hm0Var.I.a();
                    fVar.k(0, hm0Var2.f26863r);
                }
                if (hm0Var.I.f()) {
                    hm0Var.I.e(E, view, 0);
                    if (!hm0Var.I.f()) {
                        fVar.k(0, hm0Var2.f26863r);
                    }
                    org.telegram.ui.r00 r00Var = hm0Var.J;
                    int f12 = E.f1();
                    r00Var.f40933a = org.telegram.messenger.kj.B0(E.f16690k);
                    r00Var.f40934b = f12;
                }
                return true;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f29560a) {
            case 1:
                org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(((ny) this.f29561b).f28985w.f31943c1);
                b02.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new org.telegram.messenger.hh(b02, 1));
                return;
            case 3:
                ((ag.o0) this.f29561b).run();
                return;
            case 4:
                ((t10) this.f29561b).J0();
                return;
            case 6:
                m60 m60Var = (m60) this.f29561b;
                a0.h hVar = m60Var.W1;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < hVar.m(); i11++) {
                    arrayList.add(org.telegram.messenger.wp.r1(m60Var.f21584a).Z1(Long.valueOf(hVar.j(i11))));
                }
                org.telegram.ui.p50 p50Var = m60Var.f28381c2;
                if (p50Var != null) {
                    p50Var.g(0, arrayList);
                }
                m60Var.dismiss();
                return;
            case 22:
                fx0 fx0Var = (fx0) this.f29561b;
                fx0Var.e.presentFragment(new StickersActivity(fx0Var.d, null));
                x1Var.dismiss();
                return;
            default:
                org.telegram.messenger.i0.v1((gx0) this.f29561b);
                x1Var.dismiss();
                return;
        }
    }

    @Override
    public void i(int i10) {
        i60 i60Var = (i60) this.f29561b;
        m60 m60Var = i60Var.f27013n;
        m60Var.O0(i60Var.f27012f - 1);
        if (i60Var.h == null && !i60Var.e.e() && i60Var.b() <= 2) {
            m60Var.f26093q1.e(false, true);
        }
        i60Var.f();
    }

    @Override
    public void k(java.lang.Object r17, java.lang.Object r18, java.lang.Number r19, java.io.Serializable r20, java.io.Serializable r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.px.k(java.lang.Object, java.lang.Object, java.lang.Number, java.io.Serializable, java.io.Serializable):void");
    }

    @Override
    public Object l(Object obj) {
        jb0 jb0Var = (jb0) obj;
        return Float.valueOf(((o1.i) this.f29561b).f13941a / 100.0f);
    }

    @Override
    public void m(int i10) {
        org.telegram.messenger.r20 r20Var = ((b51) this.f29561b).C;
        if (r20Var != null) {
            r20Var.a(Integer.valueOf(i10));
        }
    }

    @Override
    public void o(int i10, int i11) {
        oe0 oe0Var = (oe0) ((fg.j) this.f29561b).e;
        if (i10 == oe0Var.f29099b) {
            oe0Var.G = i11;
        } else if (i10 == oe0Var.f29118r) {
            oe0Var.P = i11;
        } else if (i10 == oe0Var.d) {
            oe0Var.I = i11;
        } else if (i10 == oe0Var.f29101c) {
            oe0Var.H = i11;
        } else if (i10 == oe0Var.f29105f) {
            oe0Var.J = i11;
        } else if (i10 == oe0Var.e) {
            oe0Var.K = i11;
        } else if (i10 == oe0Var.f29125w) {
            oe0Var.R = i11;
        } else if (i10 == oe0Var.f29120s) {
            oe0Var.Q = i11;
        } else if (i10 == oe0Var.f29127x) {
            oe0Var.S = i11;
        } else if (i10 == oe0Var.f29129y) {
            oe0Var.U = i11;
        } else if (i10 == oe0Var.h) {
            oe0Var.L = i11;
        } else if (i10 == oe0Var.f29113n) {
            oe0Var.M = i11;
        }
        gz gzVar = oe0Var.f29112l0;
        if (gzVar != null) {
            gzVar.c(true, false, false);
        }
        oe0Var.f();
    }

    @Override
    public void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        b71 b71Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        c71 c71Var = (c71) this.f29561b;
        ImageReceiver imageReceiver2 = c71Var.Q;
        if (z10) {
            if (c71Var.N != null || c71Var.f25048d0 != null) {
                int L = org.telegram.messenger.i0.L(150.0f);
                org.telegram.ui.lr0 lr0Var = c71Var.N;
                if (lr0Var != null) {
                    ArrayList arrayList = lr0Var.f31276w;
                    int indexOf = arrayList.indexOf(lr0Var.c((int) c71Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = lr0Var.getVideoDuration() / 1000;
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
                            i11 = Math.min(25, (((int) ceil2) - ((arrayList.size() - 1) * 25)) + 1);
                        } else {
                            z13 = true;
                            i11 = 25;
                        }
                    } else {
                        z13 = true;
                        i11 = 0;
                    }
                    float q6 = imageReceiver2.q() / Math.min(i11, 5);
                    float o10 = imageReceiver2.o() / ((int) Math.ceil(i11 / 5.0f));
                    org.telegram.ui.lr0 lr0Var2 = c71Var.N;
                    int i12 = (int) c71Var.O;
                    int videoDuration2 = lr0Var2.getVideoDuration() / 1000;
                    if (videoDuration2 <= 100) {
                        ceil = ((int) Math.ceil(i12)) % 25;
                    } else if (videoDuration2 <= 250) {
                        ceil = ((int) Math.ceil(i12 / 2.0f)) % 25;
                    } else if (videoDuration2 <= 500) {
                        ceil = ((int) Math.ceil(i12 / 4.0f)) % 25;
                    } else if (videoDuration2 <= 1000) {
                        ceil = ((int) Math.ceil(i12 / 5.0f)) % 25;
                    } else {
                        ceil = ((int) Math.ceil(i12 / 10.0f)) % 25;
                    }
                    int min = Math.min(ceil, i11 - 1);
                    c71Var.R = (int) ((min % 5) * q6);
                    c71Var.S = (int) ((min / 5) * o10);
                    c71Var.T = (int) q6;
                    c71Var.U = (int) o10;
                } else {
                    z13 = true;
                    int i13 = 0;
                    while (true) {
                        if (i13 < c71Var.f25048d0.size()) {
                            b71Var = (b71) c71Var.f25048d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = b71Var.f24676a;
                            }
                            if (i13 == c71Var.f25048d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((b71) c71Var.f25048d0.get(i13 + 1)).f24676a;
                            }
                            double d11 = c71Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            b71Var = null;
                            break;
                        }
                    }
                    if (b71Var != null) {
                        c71Var.R = b71Var.f24677b;
                        c71Var.S = b71Var.f24678c;
                        c71Var.T = c71Var.f25045b0;
                        c71Var.U = c71Var.f25047c0;
                    } else {
                        return;
                    }
                }
                c71Var.P = z13;
                float f7 = c71Var.T / c71Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (L / f7);
                } else {
                    L = (int) (L * f7);
                    i10 = L;
                }
                ViewGroup.LayoutParams layoutParams = c71Var.getLayoutParams();
                if (c71Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i10) {
                    layoutParams.width = L;
                    layoutParams.height = i10;
                    c71Var.setVisibility(0);
                    c71Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        ((n90) this.f29561b).c0();
    }

    @Override
    public a0.h x() {
        return null;
    }

    @Override
    public boolean z(org.telegram.ui.zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        hn0 hn0Var = (hn0) this.f29561b;
        int i12 = hn0Var.J0;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = hn0Var.B0;
        for (org.telegram.ui.r00 r00Var : hashMap.keySet()) {
            arrayList2.add((org.telegram.messenger.kj) hashMap.get(r00Var));
        }
        hashMap.clear();
        hn0Var.R(false);
        boolean z12 = true;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.hs) arrayList.get(0)).f16109a != org.telegram.messenger.e20.i(org.telegram.messenger.c.a(i12).f15043a).e() && charSequence == null) {
            long j10 = ((org.telegram.messenger.hs) arrayList.get(0)).f16109a;
            Bundle g10 = a1.g.g("scrollToTopOnResume", true);
            if (org.telegram.messenger.o5.C(j10)) {
                g10.putInt("enc_id", (int) (4294967295L & j10));
            } else {
                if (org.telegram.messenger.o5.E(j10)) {
                    g10.putLong("user_id", j10);
                } else {
                    g10.putLong("chat_id", -j10);
                }
                if (!org.telegram.messenger.wp.r1(org.telegram.messenger.c.a(i12).f15043a).E(g10, zxVar, null, null)) {
                    return true;
                }
            }
            org.telegram.ui.un unVar = new org.telegram.ui.un(g10);
            zxVar.presentFragment(unVar, true);
            unVar.Yb(arrayList2);
            return true;
        }
        int i13 = 0;
        while (i13 < arrayList.size()) {
            long j11 = ((org.telegram.messenger.hs) arrayList.get(i13)).f16109a;
            if (charSequence != null) {
                org.telegram.messenger.rz.C(org.telegram.messenger.c.a(i12).f15043a).r0(org.telegram.messenger.pz.b(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            org.telegram.messenger.rz.C(org.telegram.messenger.c.a(i12).f15043a).q0(arrayList2, j11, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i13++;
            z12 = z12;
        }
        boolean z13 = z12;
        zxVar.finishFragment();
        return z13;
    }

    @Override
    public void c0(ArrayList arrayList) {
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
    }

    @Override
    public void b() {
    }

    @Override
    public void g() {
    }

    @Override
    public void n() {
    }

    @Override
    public void r() {
    }

    @Override
    public void E(float f7, int i10) {
    }

    @Override
    public void s(int i10, Drawable drawable) {
    }
}
