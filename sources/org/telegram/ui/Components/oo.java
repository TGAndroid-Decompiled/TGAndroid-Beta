package org.telegram.ui.Components;

import android.os.SystemClock;
import android.text.style.ClickableSpan;
import android.util.SparseIntArray;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class oo implements Runnable {
    public final int f38311a;
    public final Object f38312b;

    public oo(Object obj, int i7) {
        this.f38311a = i7;
        this.f38312b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        te.a aVar;
        int i7;
        int i10;
        org.telegram.messenger.f20 f20Var;
        float f10;
        int i11;
        float max;
        r1.g gVar;
        int i12 = this.f38311a;
        float f11 = 0.0f;
        int i13 = 8;
        Integer num = null;
        Object obj = this.f38312b;
        switch (i12) {
            case 0:
                ((qo) obj).s();
                return;
            case 1:
                ((so) obj).setVisibility(8);
                return;
            case 2:
                ((cq) obj).dismiss();
                return;
            case 3:
                ((a5.h) obj).a();
                return;
            case 4:
                ((org.telegram.ui.ActionBar.w2) obj).dismiss();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    return;
                }
                return;
            case 5:
                er erVar = ((dr) obj).f34548c;
                TLRPC.Peer peer = erVar.Z1;
                org.telegram.ui.ActionBar.g2 g2Var = erVar.f34966b2;
                long j3 = erVar.f34967c2;
                if (erVar.U1.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jr jrVar = new jr(g2Var, peer, j3, z10, erVar.T1);
                if (g2Var.getParentActivity() != null) {
                    g2Var.showDialog(jrVar);
                    return;
                } else {
                    jrVar.show();
                    return;
                }
            case 6:
                ((hi.e) obj).setLoading(true);
                return;
            case 7:
                cs csVar = (cs) obj;
                csVar.f34288a.a(!aVar.f57701f, true);
                org.telegram.messenger.g0.h3(csVar.f34292f, 3000L);
                return;
            case 8:
                ((pm0) obj).W(false);
                return;
            case 9:
                ((ct) obj).a();
                return;
            case 10:
                ((zt) obj).getClass();
                return;
            case 11:
                vf.c.t(((iu) ((org.telegram.ui.n1) obj).f50065b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 12:
                iu iuVar = ((hu) obj).f35966a;
                iuVar.f36317s1.setVisibility(4);
                iuVar.f36316r1.setVisibility(4);
                ImageView imageView = iuVar.f36322x1;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 13:
                ((av) obj).a(true, true);
                return;
            case 14:
                sw swVar = (sw) obj;
                if (swVar.f45950a0.getEmojiView() != null) {
                    ty emojiView = swVar.f45950a0.getEmojiView();
                    if (!emojiView.f40101g0) {
                        try {
                            SparseIntArray sparseIntArray = emojiView.S.f34601s;
                            char[] cArr = org.telegram.messenger.k6.f25017a;
                            int i14 = sparseIntArray.get(8);
                            if (i14 > 0) {
                                emojiView.Q.C0();
                                emojiView.V(i14);
                                emojiView.G(i14, org.telegram.messenger.g0.L(-9.0f));
                                emojiView.n(0, null);
                            } else {
                                return;
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                lx lxVar = (lx) obj;
                lxVar.f37322x.f35985f = true;
                lxVar.a(true);
                return;
            case 16:
                org.telegram.messenger.g0.T3(((gy) obj).h, true, true);
                return;
            case 17:
                ny nyVar = (ny) obj;
                ArrayList arrayList = nyVar.f38013r;
                ArrayList arrayList2 = nyVar.h;
                oy oyVar = nyVar.f38016x;
                int i15 = oyVar.N;
                ty tyVar = oyVar.R;
                dw dwVar = tyVar.E0;
                if (i15 == nyVar.f38008b) {
                    arrayList2.remove(arrayList);
                    oyVar.F = nyVar.f38009c;
                    oyVar.G = nyVar.d;
                    oyVar.H = nyVar.f38010e;
                    oyVar.I = nyVar.f38011f;
                    oyVar.J = arrayList2;
                    oyVar.K = nyVar.f38012n;
                    oyVar.L = new ArrayList(arrayList);
                    tyVar.H0.e(false);
                    v4.i0 adapter = dwVar.getAdapter();
                    oy oyVar2 = tyVar.A0;
                    if (adapter != oyVar2) {
                        dwVar.setAdapter(oyVar2);
                    }
                    oyVar.f();
                    return;
                }
                return;
            case 18:
                rz rzVar = (rz) ((qz) obj).f39021f;
                ArrayList arrayList3 = rzVar.h;
                if (!org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24968t0).q()) {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        if (((oz) arrayList3.get(i16)).f38419e && i16 != 0) {
                            org.telegram.ui.l4 l4Var = rzVar.J;
                            rz rzVar2 = (rz) l4Var.f49474e;
                            ArrayList arrayList4 = rzVar2.h;
                            SparseIntArray sparseIntArray2 = rzVar2.f39407l0;
                            int size = arrayList4.size();
                            if (i16 >= 0 && i16 < size) {
                                ArrayList V0 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).V0();
                                int i17 = sparseIntArray2.get(i16);
                                int i18 = ((oz) arrayList4.get(i16)).f38416a;
                                for (int i19 = i16 - 1; i19 >= 0; i19--) {
                                    sparseIntArray2.put(i19 + 1, sparseIntArray2.get(i19));
                                }
                                org.telegram.messenger.so soVar = (org.telegram.messenger.so) V0.remove(i16);
                                soVar.f26890f = 0;
                                V0.add(0, soVar);
                                sparseIntArray2.put(0, i17);
                                arrayList4.add(0, (oz) arrayList4.remove(i16));
                                ((oz) arrayList4.get(0)).f38416a = i18;
                                for (int i20 = 0; i20 <= i16; i20++) {
                                    ((oz) arrayList4.get(i20)).f38416a = i20;
                                    ((org.telegram.messenger.so) V0.get(i20)).f26890f = i20;
                                }
                                for (int i21 = 0; i21 <= i16; i21++) {
                                    if (rzVar2.L == i21) {
                                        if (i21 == i16) {
                                            i10 = 0;
                                        } else {
                                            i10 = i21 + 1;
                                        }
                                        rzVar2.M = i10;
                                        rzVar2.L = i10;
                                    }
                                    if (rzVar2.f39414r0 == i21) {
                                        if (i21 == i16) {
                                            i7 = 0;
                                        } else {
                                            i7 = i21 + 1;
                                        }
                                        rzVar2.f39416s0 = i7;
                                        rzVar2.f39414r0 = i7;
                                    }
                                }
                                l4Var.j(i16, 0);
                                nz nzVar = rzVar2.K;
                                int i22 = ((oz) arrayList4.get(i16)).f38416a;
                                org.telegram.ui.tw twVar = (org.telegram.ui.tw) nzVar;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.bx[] bxVarArr = twVar.f52405b.f46722f0;
                                    if (i23 < bxVarArr.length) {
                                        org.telegram.ui.bx bxVar = bxVarArr[i23];
                                        int i24 = bxVar.h;
                                        if (i24 == i22) {
                                            bxVar.h = i18;
                                        } else if (i24 == i18) {
                                            bxVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        rzVar2.m();
                                        rzVar2.E = true;
                                        rzVar2.G.setItemAnimator(rzVar2.f39417t0);
                                    }
                                }
                            }
                            rzVar.G.v0(0);
                            org.telegram.ui.rw rwVar = (org.telegram.ui.rw) rzVar;
                            org.telegram.ui.cx cxVar = rwVar.I0;
                            if (!cxVar.getMessagesController().K3()) {
                                try {
                                    rwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                gc J = lc.b0(cxVar).J(2131624018, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131748751, org.telegram.messenger.hd.N0(2131750795, null))), org.telegram.messenger.hd.N0(2131746839, null), 5000, false, new org.telegram.ui.bh(rwVar, 24));
                                J.k(true);
                                cxVar.f46776q3 = J;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 19:
                wz wzVar = (wz) obj;
                if (!wzVar.f41925c) {
                    wzVar.setLayerType(0, null);
                    return;
                }
                return;
            case 20:
                ((c20) obj).h(true);
                return;
            case 21:
                org.telegram.ui.kw kwVar = ((lm0) ((i30) obj)).f37244f0;
                if (!kwVar.f40521x0.canScrollVertically(-1)) {
                    kwVar.f40520w0.h1(0, 0);
                    return;
                }
                return;
            case 22:
                ((k30) obj).f36765b.a();
                return;
            case 23:
                z30 z30Var = (z30) obj;
                rh0 rh0Var = z30Var.f42664q1;
                if (z30Var.f42666s1) {
                    rh0Var.getAnimatedDrawable().K(0);
                    rh0Var.setAnimation(z30Var.f42667t1);
                    rh0Var.d();
                    return;
                }
                return;
            case 24:
                c50 c50Var = (c50) ((h6.r) obj).f13978b;
                try {
                    i61 i61Var = c50Var.T;
                    if (i61Var != null && (f20Var = c50Var.S) != null) {
                        long j10 = 0;
                        if (f20Var.f23828b > 0) {
                            long S = i61Var.S();
                            org.telegram.messenger.f20 f20Var2 = c50Var.S;
                            if (S >= f20Var2.f23828b) {
                                i61 i61Var2 = c50Var.T;
                                long j11 = f20Var2.f23826a;
                                if (j11 > 0) {
                                    j10 = j11;
                                }
                                i61Var2.q0(j10, false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 25:
                w80 w80Var = (w80) obj;
                w80Var.f41709k = false;
                w80Var.c();
                return;
            case 26:
                e90 e90Var = (e90) obj;
                if (e90Var.d) {
                    e90Var.f34706e = true;
                    e90Var.f34709r = false;
                    e90Var.f34707f = 0.0f;
                    e90Var.h = SystemClock.uptimeMillis();
                    e90Var.invalidate();
                    return;
                }
                return;
            case 27:
                final v90 v90Var = (v90) obj;
                boolean z11 = v90Var.J;
                boolean z12 = !z11;
                jg.n1 n1Var = v90Var.f40746e;
                u90 u90Var = v90Var.f40744b;
                if (u90Var != null && n1Var != null) {
                    if (v90Var.M && (gVar = v90Var.L) != null && gVar.f56362f && !z11) {
                        v90Var.P = 0;
                        return;
                    }
                    boolean g10 = v90Var.g();
                    if (!z11) {
                        f10 = (-v90Var.f40750s) - org.telegram.messenger.g0.L(6.0f);
                    } else {
                        int computeVerticalScrollRange = u90Var.computeVerticalScrollRange();
                        float f12 = (computeVerticalScrollRange - n1Var.h) + v90Var.f40750s;
                        if (computeVerticalScrollRange <= 0 && v90Var.f40747f.K() > 0 && (i11 = v90Var.P) < 3) {
                            v90Var.P = i11 + 1;
                            v90Var.o(true);
                            return;
                        }
                        f10 = f12;
                    }
                    v90Var.P = 0;
                    float f13 = v90Var.f40751w;
                    if (g10) {
                        max = -Math.max(0.0f, f13 - f10);
                    } else {
                        max = Math.max(0.0f, f13 - f10) + (-f13);
                    }
                    if (!z11 && !g10) {
                        max += u90Var.computeVerticalScrollOffset();
                    }
                    final float f14 = max;
                    r1.g gVar2 = v90Var.L;
                    if (gVar2 != null) {
                        gVar2.d();
                    }
                    v90Var.M = z12;
                    final float translationY = u90Var.getTranslationY();
                    final float f15 = v90Var.N;
                    if (!z11) {
                        f11 = 1.0f;
                    }
                    if (translationY == f14) {
                        v90Var.L = null;
                        if (z11) {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (v90Var.O && !z11) {
                            v90Var.O = false;
                            u90Var.setLayoutManager(v90Var.getNeededLayoutManager());
                            v90Var.J = true;
                            v90Var.o(true);
                        }
                    } else {
                        r1.g gVar3 = new r1.g(new r1.f(translationY));
                        r1.h hVar = new r1.h(f14);
                        hVar.a(1.0f);
                        hVar.b(550.0f);
                        gVar3.f56368m = hVar;
                        v90Var.L = gVar3;
                        final float f16 = f11;
                        r1.d dVar = new r1.d() {
                            @Override
                            public final void a(r1.g gVar4, float f17, float f18) {
                                v90 v90Var2 = v90.this;
                                v90Var2.f40744b.setTranslationY(f17);
                                v90Var2.i();
                                float f19 = translationY;
                                v90Var2.N = org.telegram.messenger.g0.T1(f15, f16, (f17 - f19) / (f14 - f19));
                            }
                        };
                        v90Var = v90Var;
                        gVar3.b(dVar);
                        if (!z11) {
                            v90Var.L.a(new hi.b4(v90Var, z12, 2));
                        }
                        v90Var.L.a(new Object());
                        v90Var.L.h();
                    }
                    if (num != null && v90Var.getVisibility() != num.intValue()) {
                        v90Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                v90Var.P = 0;
                return;
            case 28:
                ((qa0) ((ia0) obj).T).f38861n.f();
                return;
            default:
                ((za0) obj).a();
                return;
        }
    }

    public oo(zt ztVar, n80 n80Var, ClickableSpan clickableSpan) {
        this.f38311a = 10;
        this.f38312b = ztVar;
    }
}
