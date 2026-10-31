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
import org.telegram.ui.pb1;
public final class px implements org.telegram.messenger.o20, org.telegram.ui.ActionBar.u1, zf.l1, fe.e, org.telegram.messenger.l9, i80, ce0, ik0, org.telegram.ui.ux, th.m5, org.telegram.messenger.fs, y71, org.telegram.messenger.qc, xu0, org.telegram.messenger.mc {
    public final int f29447a;
    public final Object f29448b;

    public px(Object obj, int i10) {
        this.f29447a = i10;
        this.f29448b = obj;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public a0.h M() {
        return null;
    }

    @Override
    public boolean N(org.telegram.ui.ay ayVar) {
        return false;
    }

    @Override
    public boolean Y(int i10) {
        return true;
    }

    @Override
    public void a(String str) {
        switch (this.f29447a) {
            case 20:
                zt0 zt0Var = ((yq0) this.f29448b).d;
                zt0.t(zt0Var).r(zt0Var.l1, str, new sq0(zt0Var, 1));
                return;
            default:
                x31 x31Var = (x31) this.f29448b;
                x31Var.W1 = str;
                x31Var.f32306b2.O(true);
                return;
        }
    }

    @Override
    public void c(boolean z10) {
        th.x4 x4Var = (th.x4) this.f29448b;
        if (z10) {
            x4Var.p(30, false);
        }
    }

    @Override
    public void d() {
        ((hd0) this.f29448b).K0(true);
    }

    @Override
    public void e(int i10, int i11) {
        uu0 uu0Var = (uu0) this.f29448b;
        uu0Var.f31061x = i10;
        uu0Var.f31062y = i11;
        bi.t0 t0Var = uu0Var.L;
        if (t0Var != null) {
            t0Var.invalidate();
        }
    }

    @Override
    public boolean f(int i10, View view) {
        ui0 ui0Var;
        switch (this.f29447a) {
            case 15:
                vi0 vi0Var = (vi0) this.f29448b;
                ArrayList arrayList = vi0Var.f31263n;
                if (vi0Var.f31262f.d(i10) == 0 && (ui0Var = vi0Var.F) != null) {
                    ui0Var.c(org.telegram.messenger.jj.C1(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                gm0 gm0Var = (gm0) this.f29448b;
                kg.f fVar = gm0Var.f26439c;
                org.telegram.messenger.jj E = fVar.E(i10);
                gm0 gm0Var2 = (gm0) fVar.d;
                if (E == null) {
                    return false;
                }
                if (!gm0Var.I.f()) {
                    gm0Var.I.a();
                    fVar.k(0, gm0Var2.f26442r);
                }
                if (gm0Var.I.f()) {
                    gm0Var.I.e(E, view, 0);
                    if (!gm0Var.I.f()) {
                        fVar.k(0, gm0Var2.f26442r);
                    }
                    org.telegram.ui.s00 s00Var = gm0Var.J;
                    int f12 = E.f1();
                    s00Var.f41322a = org.telegram.messenger.jj.B0(E.f16337k);
                    s00Var.f41323b = f12;
                }
                return true;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f29447a) {
            case 1:
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(((ny) this.f29448b).f28919w.f31865c1);
                b02.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new org.telegram.messenger.gh(b02, 1));
                return;
            case 3:
                ((ag.o0) this.f29448b).run();
                return;
            case 4:
                ((t10) this.f29448b).J0();
                return;
            case 6:
                m60 m60Var = (m60) this.f29448b;
                a0.h hVar = m60Var.W1;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < hVar.m(); i11++) {
                    arrayList.add(org.telegram.messenger.vp.r1(m60Var.f21583a).Z1(Long.valueOf(hVar.j(i11))));
                }
                org.telegram.ui.q50 q50Var = m60Var.f28298c2;
                if (q50Var != null) {
                    q50Var.g(0, arrayList);
                }
                m60Var.dismiss();
                return;
            case 22:
                ex0 ex0Var = (ex0) this.f29448b;
                ex0Var.e.presentFragment(new StickersActivity(ex0Var.d, null));
                x1Var.dismiss();
                return;
            default:
                org.telegram.messenger.i0.v1((fx0) this.f29448b);
                x1Var.dismiss();
                return;
        }
    }

    @Override
    public void i(int i10) {
        i60 i60Var = (i60) this.f29448b;
        m60 m60Var = i60Var.f26894n;
        m60Var.O0(i60Var.f26893f - 1);
        if (i60Var.h == null && !i60Var.e.e() && i60Var.b() <= 2) {
            m60Var.f25724q1.e(false, true);
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
        return Float.valueOf(((o1.i) this.f29448b).f13940a / 100.0f);
    }

    @Override
    public void m(int i10) {
        org.telegram.messenger.q20 q20Var = ((a51) this.f29448b).C;
        if (q20Var != null) {
            q20Var.a(Integer.valueOf(i10));
        }
    }

    @Override
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        a71 a71Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        b71 b71Var = (b71) this.f29448b;
        ImageReceiver imageReceiver2 = b71Var.Q;
        if (z10) {
            if (b71Var.N != null || b71Var.f24569d0 != null) {
                int L = org.telegram.messenger.i0.L(150.0f);
                org.telegram.ui.mr0 mr0Var = b71Var.N;
                if (mr0Var != null) {
                    ArrayList arrayList = mr0Var.f31241w;
                    int indexOf = arrayList.indexOf(mr0Var.c((int) b71Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = mr0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.mr0 mr0Var2 = b71Var.N;
                    int i12 = (int) b71Var.O;
                    int videoDuration2 = mr0Var2.getVideoDuration() / 1000;
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
                    b71Var.R = (int) ((min % 5) * q6);
                    b71Var.S = (int) ((min / 5) * o10);
                    b71Var.T = (int) q6;
                    b71Var.U = (int) o10;
                } else {
                    z13 = true;
                    int i13 = 0;
                    while (true) {
                        if (i13 < b71Var.f24569d0.size()) {
                            a71Var = (a71) b71Var.f24569d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = a71Var.f24324a;
                            }
                            if (i13 == b71Var.f24569d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((a71) b71Var.f24569d0.get(i13 + 1)).f24324a;
                            }
                            double d11 = b71Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            a71Var = null;
                            break;
                        }
                    }
                    if (a71Var != null) {
                        b71Var.R = a71Var.f24325b;
                        b71Var.S = a71Var.f24326c;
                        b71Var.T = b71Var.f24566b0;
                        b71Var.U = b71Var.f24568c0;
                    } else {
                        return;
                    }
                }
                b71Var.P = z13;
                float f7 = b71Var.T / b71Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (L / f7);
                } else {
                    L = (int) (L * f7);
                    i10 = L;
                }
                ViewGroup.LayoutParams layoutParams = b71Var.getLayoutParams();
                if (b71Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i10) {
                    layoutParams.width = L;
                    layoutParams.height = i10;
                    b71Var.setVisibility(0);
                    b71Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void p(int i10, int i11) {
        oe0 oe0Var = (oe0) ((fg.j) this.f29448b).e;
        if (i10 == oe0Var.f29038b) {
            oe0Var.G = i11;
        } else if (i10 == oe0Var.f29057r) {
            oe0Var.P = i11;
        } else if (i10 == oe0Var.d) {
            oe0Var.I = i11;
        } else if (i10 == oe0Var.f29040c) {
            oe0Var.H = i11;
        } else if (i10 == oe0Var.f29044f) {
            oe0Var.J = i11;
        } else if (i10 == oe0Var.e) {
            oe0Var.K = i11;
        } else if (i10 == oe0Var.f29064w) {
            oe0Var.R = i11;
        } else if (i10 == oe0Var.f29059s) {
            oe0Var.Q = i11;
        } else if (i10 == oe0Var.f29066x) {
            oe0Var.S = i11;
        } else if (i10 == oe0Var.f29068y) {
            oe0Var.U = i11;
        } else if (i10 == oe0Var.h) {
            oe0Var.L = i11;
        } else if (i10 == oe0Var.f29052n) {
            oe0Var.M = i11;
        }
        gz gzVar = oe0Var.f29051l0;
        if (gzVar != null) {
            gzVar.c(true, false, false);
        }
        oe0Var.f();
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        ((n90) this.f29448b).b0();
    }

    @Override
    public a0.h x() {
        return null;
    }

    @Override
    public boolean y(org.telegram.ui.ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        gn0 gn0Var = (gn0) this.f29448b;
        int i12 = gn0Var.J0;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = gn0Var.B0;
        for (org.telegram.ui.s00 s00Var : hashMap.keySet()) {
            arrayList2.add((org.telegram.messenger.jj) hashMap.get(s00Var));
        }
        hashMap.clear();
        gn0Var.R(false);
        boolean z12 = true;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.gs) arrayList.get(0)).f15760a != org.telegram.messenger.d20.i(org.telegram.messenger.c.a(i12).f14863a).e() && charSequence == null) {
            long j10 = ((org.telegram.messenger.gs) arrayList.get(0)).f15760a;
            Bundle g10 = a1.g.g("scrollToTopOnResume", true);
            if (org.telegram.messenger.o5.C(j10)) {
                g10.putInt("enc_id", (int) (4294967295L & j10));
            } else {
                if (org.telegram.messenger.o5.E(j10)) {
                    g10.putLong("user_id", j10);
                } else {
                    g10.putLong("chat_id", -j10);
                }
                if (!org.telegram.messenger.vp.r1(org.telegram.messenger.c.a(i12).f14863a).E(g10, ayVar, null, null)) {
                    return true;
                }
            }
            org.telegram.ui.un unVar = new org.telegram.ui.un(g10);
            ayVar.presentFragment(unVar, true);
            unVar.Tb(arrayList2);
            return true;
        }
        int i13 = 0;
        while (i13 < arrayList.size()) {
            long j11 = ((org.telegram.messenger.gs) arrayList.get(i13)).f15760a;
            if (charSequence != null) {
                org.telegram.messenger.qz.C(org.telegram.messenger.c.a(i12).f14863a).r0(org.telegram.messenger.oz.b(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            org.telegram.messenger.qz.C(org.telegram.messenger.c.a(i12).f14863a).q0(arrayList2, j11, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i13++;
            z12 = z12;
        }
        boolean z13 = z12;
        ayVar.finishFragment();
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
    public void s() {
    }

    @Override
    public void E(float f7, int i10) {
    }

    @Override
    public void q(int i10, Drawable drawable) {
    }
}
