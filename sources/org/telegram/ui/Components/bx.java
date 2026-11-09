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
public final class bx implements org.telegram.messenger.a20, org.telegram.ui.ActionBar.r1, jg.y1, te.b, org.telegram.messenger.k9, q70, hd0, ej0, org.telegram.ui.sw, di.h7, org.telegram.messenger.wr, y61, org.telegram.messenger.pc, wt0, org.telegram.messenger.lc {
    public final int f32441a;
    public final Object f32442b;

    public bx(Object obj, int i7) {
        this.f32441a = i7;
        this.f32442b = obj;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(org.telegram.ui.yw ywVar) {
        return false;
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        ((v80) this.f32442b).c0();
    }

    @Override
    public void a(String str) {
        switch (this.f32441a) {
            case 20:
                zs0 zs0Var = ((yp0) this.f32442b).d;
                zs0.v(zs0Var).r(zs0Var.l1, str, new so0(zs0Var, 1));
                return;
            default:
                w21 w21Var = (w21) this.f32442b;
                w21Var.W1 = str;
                w21Var.f39881b2.O(true);
                return;
        }
    }

    @Override
    public void b(boolean z9) {
        di.r6 r6Var = (di.r6) this.f32442b;
        if (z9) {
            r6Var.p(30, false);
        }
    }

    @Override
    public boolean c(int i7, View view) {
        rh0 rh0Var;
        switch (this.f32441a) {
            case 15:
                sh0 sh0Var = (sh0) this.f32442b;
                ArrayList arrayList = sh0Var.f38068n;
                if (sh0Var.f38067f.d(i7) == 0 && (rh0Var = sh0Var.F) != null) {
                    rh0Var.d(org.telegram.messenger.ij.B1(((TLRPC.MessagePeerReaction) arrayList.get(i7)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i7));
                    return true;
                }
                return true;
            default:
                el0 el0Var = (el0) this.f32442b;
                bi.k5 k5Var = el0Var.f33439c;
                org.telegram.messenger.ij E = k5Var.E(i7);
                el0 el0Var2 = (el0) k5Var.d;
                if (E == null) {
                    return false;
                }
                if (!el0Var.I.i()) {
                    el0Var.I.e();
                    k5Var.k(0, el0Var2.f33443r);
                }
                if (el0Var.I.i()) {
                    el0Var.I.h(E, view, 0);
                    if (!el0Var.I.i()) {
                        k5Var.k(0, el0Var2.f33443r);
                    }
                    org.telegram.ui.tz tzVar = el0Var.J;
                    int e12 = E.e1();
                    tzVar.f50267a = org.telegram.messenger.ij.B0(E.f23262k);
                    tzVar.f50268b = e12;
                }
                return true;
        }
    }

    @Override
    public void e() {
        ((nc0) this.f32442b).K0(true);
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        boolean z12;
        z51 z51Var;
        double d;
        double d2;
        int i7;
        int i10;
        int ceil;
        double ceil2;
        a61 a61Var = (a61) this.f32442b;
        ImageReceiver imageReceiver2 = a61Var.Q;
        if (z9) {
            if (a61Var.N != null || a61Var.f31729d0 != null) {
                int L = org.telegram.messenger.g0.L(150.0f);
                org.telegram.ui.eq0 eq0Var = a61Var.N;
                if (eq0Var != null) {
                    ArrayList arrayList = eq0Var.f32246w;
                    int indexOf = arrayList.indexOf(eq0Var.c((int) a61Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = eq0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.eq0 eq0Var2 = a61Var.N;
                    int i11 = (int) a61Var.O;
                    int videoDuration2 = eq0Var2.getVideoDuration() / 1000;
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
                    a61Var.R = (int) ((min % 5) * q10);
                    a61Var.S = (int) ((min / 5) * o4);
                    a61Var.T = (int) q10;
                    a61Var.U = (int) o4;
                } else {
                    z12 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < a61Var.f31729d0.size()) {
                            z51Var = (z51) a61Var.f31729d0.get(i12);
                            if (i12 == 0) {
                                d = 0.0d;
                            } else {
                                d = z51Var.f40912a;
                            }
                            if (i12 == a61Var.f31729d0.size() - 1) {
                                d2 = 9.9999999E7d;
                            } else {
                                d2 = ((z51) a61Var.f31729d0.get(i12 + 1)).f40912a;
                            }
                            double d10 = a61Var.O;
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
                        a61Var.R = z51Var.f40913b;
                        a61Var.S = z51Var.f40914c;
                        a61Var.T = a61Var.f31726b0;
                        a61Var.U = a61Var.f31728c0;
                    } else {
                        return;
                    }
                }
                a61Var.P = z12;
                float f10 = a61Var.T / a61Var.U;
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
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f32441a) {
            case 1:
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(((yx) this.f32442b).f40836w.f34415c1);
                b02.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new org.telegram.messenger.ih(b02, 1));
                return;
            case 3:
                ((org.telegram.ui.q8) this.f32442b).run();
                return;
            case 4:
                ((e10) this.f32442b).J0();
                return;
            case 6:
                y50 y50Var = (y50) this.f32442b;
                a0.h hVar = y50Var.W1;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    arrayList.add(org.telegram.messenger.qp.s1(y50Var.f28621a).a2(Long.valueOf(hVar.j(i10))));
                }
                org.telegram.ui.t40 t40Var = y50Var.f40602c2;
                if (t40Var != null) {
                    t40Var.f(0, arrayList);
                }
                y50Var.dismiss();
                return;
            case 22:
                bw0 bw0Var = (bw0) this.f32442b;
                bw0Var.f32440e.presentFragment(new StickersActivity(bw0Var.d, null));
                u1Var.dismiss();
                return;
            default:
                org.telegram.messenger.g0.v1((cw0) this.f32442b);
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public void h(int i7, int i10) {
        tt0 tt0Var = (tt0) this.f32442b;
        tt0Var.f38502x = i7;
        tt0Var.f38503y = i10;
        bi.ec ecVar = tt0Var.L;
        if (ecVar != null) {
            ecVar.invalidate();
        }
    }

    @Override
    public void i(java.lang.Object r17, java.lang.Object r18, java.lang.Number r19, java.io.Serializable r20, java.io.Serializable r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bx.i(java.lang.Object, java.lang.Object, java.lang.Number, java.io.Serializable, java.io.Serializable):void");
    }

    @Override
    public Object j(Object obj) {
        ra0 ra0Var = (ra0) obj;
        return Float.valueOf(((r1.f) this.f32442b).f54262a / 100.0f);
    }

    @Override
    public boolean k1(int i7) {
        return true;
    }

    @Override
    public void l(int i7, int i10) {
        td0 td0Var = (td0) ((org.telegram.ui.l4) this.f32442b).f47458e;
        if (i7 == td0Var.f38356b) {
            td0Var.G = i10;
        } else if (i7 == td0Var.f38376r) {
            td0Var.P = i10;
        } else if (i7 == td0Var.d) {
            td0Var.I = i10;
        } else if (i7 == td0Var.f38358c) {
            td0Var.H = i10;
        } else if (i7 == td0Var.f38363f) {
            td0Var.J = i10;
        } else if (i7 == td0Var.f38361e) {
            td0Var.K = i10;
        } else if (i7 == td0Var.f38383w) {
            td0Var.R = i10;
        } else if (i7 == td0Var.f38378s) {
            td0Var.Q = i10;
        } else if (i7 == td0Var.f38385x) {
            td0Var.S = i10;
        } else if (i7 == td0Var.f38387y) {
            td0Var.U = i10;
        } else if (i7 == td0Var.h) {
            td0Var.L = i10;
        } else if (i7 == td0Var.f38371n) {
            td0Var.M = i10;
        }
        sy syVar = td0Var.f38370l0;
        if (syVar != null) {
            syVar.c(true, false, false);
        }
        td0Var.d();
    }

    @Override
    public void m(int i7) {
        org.telegram.messenger.c20 c20Var = ((y31) this.f32442b).C;
        if (c20Var != null) {
            c20Var.a(Integer.valueOf(i7));
        }
    }

    @Override
    public void q(int i7) {
        t50 t50Var = (t50) this.f32442b;
        y50 y50Var = t50Var.f38299n;
        y50Var.O0(t50Var.f38298f - 1);
        if (t50Var.h == null && !t50Var.f38297e.e() && t50Var.b() <= 2) {
            y50Var.f32534q1.e(false, true);
        }
        t50Var.f();
    }

    @Override
    public a0.h v0() {
        return null;
    }

    @Override
    public boolean y(org.telegram.ui.yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, y91 y91Var) {
        gm0 gm0Var = (gm0) this.f32442b;
        int i11 = gm0Var.J0;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = gm0Var.B0;
        for (org.telegram.ui.tz tzVar : hashMap.keySet()) {
            arrayList2.add((org.telegram.messenger.ij) hashMap.get(tzVar));
        }
        hashMap.clear();
        gm0Var.R(false);
        boolean z11 = true;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.xr) arrayList.get(0)).f26520a != org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i11).f21765a).e() && charSequence == null) {
            long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).f26520a;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (org.telegram.messenger.m5.C(j3)) {
                k10.putInt("enc_id", (int) (4294967295L & j3));
            } else {
                if (org.telegram.messenger.m5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (!org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i11).f21765a).E(k10, ywVar, null, null)) {
                    return true;
                }
            }
            org.telegram.ui.cn cnVar = new org.telegram.ui.cn(k10);
            ywVar.presentFragment(cnVar, true);
            cnVar.gc(arrayList2);
            return true;
        }
        int i12 = 0;
        while (i12 < arrayList.size()) {
            long j10 = ((org.telegram.messenger.xr) arrayList.get(i12)).f26520a;
            if (charSequence != null) {
                org.telegram.messenger.gz.C(org.telegram.messenger.c.a(i11).f21765a).r0(org.telegram.messenger.ez.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            org.telegram.messenger.gz.C(org.telegram.messenger.c.a(i11).f21765a).q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i12++;
            z11 = z11;
        }
        boolean z12 = z11;
        ywVar.finishFragment();
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
