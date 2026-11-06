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
import org.telegram.ui.v91;
public final class ax implements org.telegram.messenger.a20, org.telegram.ui.ActionBar.r1, jg.y1, te.b, org.telegram.messenger.k9, p70, gd0, dj0, org.telegram.ui.qw, di.g7, org.telegram.messenger.wr, r61, org.telegram.messenger.pc, ut0, org.telegram.messenger.lc {
    public final int f31928a;
    public final Object f31929b;

    public ax(Object obj, int i7) {
        this.f31928a = i7;
        this.f31929b = obj;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(org.telegram.ui.ww wwVar) {
        return false;
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        ((u80) this.f31929b).c0();
    }

    @Override
    public void a(String str) {
        switch (this.f31928a) {
            case 20:
                xs0 xs0Var = ((xp0) this.f31929b).d;
                xs0.v(xs0Var).r(xs0Var.l1, str, new ro0(xs0Var, 1));
                return;
            default:
                p21 p21Var = (p21) this.f31929b;
                p21Var.W1 = str;
                p21Var.f36870b2.O(true);
                return;
        }
    }

    @Override
    public void b(boolean z9) {
        di.q6 q6Var = (di.q6) this.f31929b;
        if (z9) {
            q6Var.p(30, false);
        }
    }

    @Override
    public boolean c(int i7, View view) {
        qh0 qh0Var;
        switch (this.f31928a) {
            case 15:
                rh0 rh0Var = (rh0) this.f31929b;
                ArrayList arrayList = rh0Var.f37741n;
                if (rh0Var.f37740f.d(i7) == 0 && (qh0Var = rh0Var.F) != null) {
                    qh0Var.b(org.telegram.messenger.ij.C1(((TLRPC.MessagePeerReaction) arrayList.get(i7)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i7));
                    return true;
                }
                return true;
            default:
                dl0 dl0Var = (dl0) this.f31929b;
                bi.k5 k5Var = dl0Var.f32987c;
                org.telegram.messenger.ij E = k5Var.E(i7);
                dl0 dl0Var2 = (dl0) k5Var.d;
                if (E == null) {
                    return false;
                }
                if (!dl0Var.I.i()) {
                    dl0Var.I.e();
                    k5Var.k(0, dl0Var2.f32991r);
                }
                if (dl0Var.I.i()) {
                    dl0Var.I.h(E, view, 0);
                    if (!dl0Var.I.i()) {
                        k5Var.k(0, dl0Var2.f32991r);
                    }
                    org.telegram.ui.rz rzVar = dl0Var.J;
                    int f12 = E.f1();
                    rzVar.f49569a = org.telegram.messenger.ij.B0(E.f23237k);
                    rzVar.f49570b = f12;
                }
                return true;
        }
    }

    @Override
    public void e() {
        ((mc0) this.f31929b).K0(true);
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        boolean z12;
        t51 t51Var;
        double d;
        double d2;
        int i7;
        int i10;
        int ceil;
        double ceil2;
        u51 u51Var = (u51) this.f31929b;
        ImageReceiver imageReceiver2 = u51Var.Q;
        if (z9) {
            if (u51Var.N != null || u51Var.f38535d0 != null) {
                int L = org.telegram.messenger.g0.L(150.0f);
                org.telegram.ui.bq0 bq0Var = u51Var.N;
                if (bq0Var != null) {
                    ArrayList arrayList = bq0Var.f31783w;
                    int indexOf = arrayList.indexOf(bq0Var.c((int) u51Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = bq0Var.getVideoDuration() / 1000;
                            if (videoDuration <= 100) {
                                z12 = true;
                                ceil2 = Math.ceil(videoDuration);
                            } else {
                                z12 = true;
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
                            z12 = true;
                            i10 = 25;
                        }
                    } else {
                        z12 = true;
                        i10 = 0;
                    }
                    float q10 = imageReceiver2.q() / Math.min(i10, 5);
                    float o4 = imageReceiver2.o() / ((int) Math.ceil(i10 / 5.0f));
                    org.telegram.ui.bq0 bq0Var2 = u51Var.N;
                    int i11 = (int) u51Var.O;
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
                    u51Var.R = (int) ((min % 5) * q10);
                    u51Var.S = (int) ((min / 5) * o4);
                    u51Var.T = (int) q10;
                    u51Var.U = (int) o4;
                } else {
                    z12 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < u51Var.f38535d0.size()) {
                            t51Var = (t51) u51Var.f38535d0.get(i12);
                            if (i12 == 0) {
                                d = 0.0d;
                            } else {
                                d = t51Var.f38257a;
                            }
                            if (i12 == u51Var.f38535d0.size() - 1) {
                                d2 = 9.9999999E7d;
                            } else {
                                d2 = ((t51) u51Var.f38535d0.get(i12 + 1)).f38257a;
                            }
                            double d10 = u51Var.O;
                            if (d10 >= d && d10 <= d2) {
                                break;
                            }
                            i12++;
                        } else {
                            t51Var = null;
                            break;
                        }
                    }
                    if (t51Var != null) {
                        u51Var.R = t51Var.f38258b;
                        u51Var.S = t51Var.f38259c;
                        u51Var.T = u51Var.f38532b0;
                        u51Var.U = u51Var.f38534c0;
                    } else {
                        return;
                    }
                }
                u51Var.P = z12;
                float f10 = u51Var.T / u51Var.U;
                if (f10 > 1.0f) {
                    i7 = (int) (L / f10);
                } else {
                    L = (int) (L * f10);
                    i7 = L;
                }
                ViewGroup.LayoutParams layoutParams = u51Var.getLayoutParams();
                if (u51Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i7) {
                    layoutParams.width = L;
                    layoutParams.height = i7;
                    u51Var.setVisibility(0);
                    u51Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f31928a) {
            case 1:
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(((xx) this.f31929b).f40440w.f34076c1);
                b02.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new org.telegram.messenger.ih(b02, 1));
                return;
            case 3:
                ((org.telegram.ui.q8) this.f31929b).run();
                return;
            case 4:
                ((d10) this.f31929b).J0();
                return;
            case 6:
                x50 x50Var = (x50) this.f31929b;
                a0.h hVar = x50Var.W1;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    arrayList.add(org.telegram.messenger.qp.s1(x50Var.f28612a).a2(Long.valueOf(hVar.j(i10))));
                }
                org.telegram.ui.r40 r40Var = x50Var.f40159c2;
                if (r40Var != null) {
                    r40Var.f(0, arrayList);
                }
                x50Var.dismiss();
                return;
            case 22:
                aw0 aw0Var = (aw0) this.f31929b;
                aw0Var.f31927e.presentFragment(new StickersActivity(aw0Var.d, null));
                u1Var.dismiss();
                return;
            default:
                org.telegram.messenger.g0.v1((bw0) this.f31929b);
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public void h(int i7, int i10) {
        rt0 rt0Var = (rt0) this.f31929b;
        rt0Var.f37850x = i7;
        rt0Var.f37851y = i10;
        bi.ec ecVar = rt0Var.L;
        if (ecVar != null) {
            ecVar.invalidate();
        }
    }

    @Override
    public void i(java.lang.Object r17, java.lang.Object r18, java.lang.Number r19, java.io.Serializable r20, java.io.Serializable r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ax.i(java.lang.Object, java.lang.Object, java.lang.Number, java.io.Serializable, java.io.Serializable):void");
    }

    @Override
    public Object j(Object obj) {
        qa0 qa0Var = (qa0) obj;
        return Float.valueOf(((r1.f) this.f31929b).f54132a / 100.0f);
    }

    @Override
    public boolean k1(int i7) {
        return true;
    }

    @Override
    public void l(int i7, int i10) {
        sd0 sd0Var = (sd0) ((org.telegram.ui.l4) this.f31929b).f47379e;
        if (i7 == sd0Var.f38027b) {
            sd0Var.G = i10;
        } else if (i7 == sd0Var.f38047r) {
            sd0Var.P = i10;
        } else if (i7 == sd0Var.d) {
            sd0Var.I = i10;
        } else if (i7 == sd0Var.f38029c) {
            sd0Var.H = i10;
        } else if (i7 == sd0Var.f38034f) {
            sd0Var.J = i10;
        } else if (i7 == sd0Var.f38032e) {
            sd0Var.K = i10;
        } else if (i7 == sd0Var.f38054w) {
            sd0Var.R = i10;
        } else if (i7 == sd0Var.f38049s) {
            sd0Var.Q = i10;
        } else if (i7 == sd0Var.f38056x) {
            sd0Var.S = i10;
        } else if (i7 == sd0Var.f38058y) {
            sd0Var.U = i10;
        } else if (i7 == sd0Var.h) {
            sd0Var.L = i10;
        } else if (i7 == sd0Var.f38042n) {
            sd0Var.M = i10;
        }
        ry ryVar = sd0Var.f38041l0;
        if (ryVar != null) {
            ryVar.c(true, false, false);
        }
        sd0Var.d();
    }

    @Override
    public void m(int i7) {
        org.telegram.messenger.c20 c20Var = ((r31) this.f31929b).C;
        if (c20Var != null) {
            c20Var.a(Integer.valueOf(i7));
        }
    }

    @Override
    public void q(int i7) {
        s50 s50Var = (s50) this.f31929b;
        x50 x50Var = s50Var.f37949n;
        x50Var.O0(s50Var.f37948f - 1);
        if (s50Var.h == null && !s50Var.f37947e.e() && s50Var.b() <= 2) {
            x50Var.f39837q1.e(false, true);
        }
        s50Var.f();
    }

    @Override
    public a0.h v0() {
        return null;
    }

    @Override
    public boolean y(org.telegram.ui.ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, v91 v91Var) {
        fm0 fm0Var = (fm0) this.f31929b;
        int i11 = fm0Var.J0;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = fm0Var.B0;
        for (org.telegram.ui.rz rzVar : hashMap.keySet()) {
            arrayList2.add((org.telegram.messenger.ij) hashMap.get(rzVar));
        }
        hashMap.clear();
        fm0Var.R(false);
        boolean z11 = true;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.xr) arrayList.get(0)).f26505a != org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i11).f21723a).e() && charSequence == null) {
            long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).f26505a;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (org.telegram.messenger.m5.C(j3)) {
                k10.putInt("enc_id", (int) (4294967295L & j3));
            } else {
                if (org.telegram.messenger.m5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (!org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i11).f21723a).E(k10, wwVar, null, null)) {
                    return true;
                }
            }
            org.telegram.ui.an anVar = new org.telegram.ui.an(k10);
            wwVar.presentFragment(anVar, true);
            anVar.dc(arrayList2);
            return true;
        }
        int i12 = 0;
        while (i12 < arrayList.size()) {
            long j10 = ((org.telegram.messenger.xr) arrayList.get(i12)).f26505a;
            if (charSequence != null) {
                org.telegram.messenger.gz.C(org.telegram.messenger.c.a(i11).f21723a).r0(org.telegram.messenger.ez.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            org.telegram.messenger.gz.C(org.telegram.messenger.c.a(i11).f21723a).q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i12++;
            z11 = z11;
        }
        boolean z12 = z11;
        wwVar.finishFragment();
        return z12;
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
    }

    @Override
    public void m1(ArrayList arrayList) {
    }

    @Override
    public void d() {
    }

    @Override
    public void f() {
    }

    @Override
    public void k() {
    }

    @Override
    public void n() {
    }

    @Override
    public void F(float f10, int i7) {
    }

    @Override
    public void t0(int i7, Drawable drawable) {
    }
}
