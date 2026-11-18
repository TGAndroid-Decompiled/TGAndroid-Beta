package org.telegram.ui.Components;

import android.os.SystemClock;
import android.text.style.ClickableSpan;
import android.util.SparseIntArray;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class mo implements Runnable {
    public final int f37588a;
    public final Object f37589b;

    public mo(Object obj, int i7) {
        this.f37588a = i7;
        this.f37589b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        te.a aVar;
        int i7;
        int i10;
        org.telegram.messenger.e20 e20Var;
        float f10;
        int i11;
        float max;
        r1.g gVar;
        int i12 = this.f37588a;
        float f11 = 0.0f;
        int i13 = 8;
        Integer num = null;
        Object obj = this.f37589b;
        switch (i12) {
            case 0:
                ((oo) obj).s();
                return;
            case 1:
                ((qo) obj).setVisibility(8);
                return;
            case 2:
                ((aq) obj).dismiss();
                return;
            case 3:
                ((a5.h) obj).a();
                return;
            case 4:
                ((org.telegram.ui.ActionBar.x2) obj).dismiss();
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    return;
                }
                return;
            case 5:
                cr crVar = ((br) obj).f33758c;
                TLRPC.Peer peer = crVar.Z1;
                org.telegram.ui.ActionBar.h2 h2Var = crVar.f34165b2;
                long j3 = crVar.f34166c2;
                if (crVar.U1.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hr hrVar = new hr(h2Var, peer, j3, z10, crVar.T1);
                if (h2Var.getParentActivity() != null) {
                    h2Var.showDialog(hrVar);
                    return;
                } else {
                    hrVar.show();
                    return;
                }
            case 6:
                ((hi.d) obj).setLoading(true);
                return;
            case 7:
                as asVar = (as) obj;
                asVar.f33435a.a(!aVar.f57658f, true);
                org.telegram.messenger.g0.h3(asVar.f33439f, 3000L);
                return;
            case 8:
                ((mm0) obj).W(false);
                return;
            case 9:
                ((at) obj).a();
                return;
            case 10:
                ((xt) obj).getClass();
                return;
            case 11:
                vf.c.t(((gu) ((org.telegram.ui.n1) obj).f50026b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 12:
                gu guVar = ((fu) obj).f35168a;
                guVar.f35650s1.setVisibility(4);
                guVar.f35649r1.setVisibility(4);
                ImageView imageView = guVar.f35655x1;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 13:
                ((xu) obj).a(true, true);
                return;
            case 14:
                qw qwVar = (qw) obj;
                if (qwVar.f45923a0.getEmojiView() != null) {
                    ry emojiView = qwVar.f45923a0.getEmojiView();
                    if (!emojiView.f39354g0) {
                        try {
                            SparseIntArray sparseIntArray = emojiView.S.f33806s;
                            char[] cArr = org.telegram.messenger.k6.f24987a;
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
                jx jxVar = (jx) obj;
                jxVar.f36552x.f35175f = true;
                jxVar.a(true);
                return;
            case 16:
                org.telegram.messenger.g0.T3(((ey) obj).h, true, true);
                return;
            case 17:
                ly lyVar = (ly) obj;
                ArrayList arrayList = lyVar.f37265r;
                ArrayList arrayList2 = lyVar.h;
                my myVar = lyVar.f37268x;
                int i15 = myVar.N;
                ry ryVar = myVar.R;
                aw awVar = ryVar.E0;
                if (i15 == lyVar.f37260b) {
                    arrayList2.remove(arrayList);
                    myVar.F = lyVar.f37261c;
                    myVar.G = lyVar.d;
                    myVar.H = lyVar.f37262e;
                    myVar.I = lyVar.f37263f;
                    myVar.J = arrayList2;
                    myVar.K = lyVar.f37264n;
                    myVar.L = new ArrayList(arrayList);
                    ryVar.H0.e(false);
                    v4.i0 adapter = awVar.getAdapter();
                    my myVar2 = ryVar.A0;
                    if (adapter != myVar2) {
                        awVar.setAdapter(myVar2);
                    }
                    myVar.f();
                    return;
                }
                return;
            case 18:
                pz pzVar = (pz) ((oz) obj).f38197f;
                ArrayList arrayList3 = pzVar.h;
                if (!org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24770t0).q()) {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        if (((mz) arrayList3.get(i16)).f37671e && i16 != 0) {
                            org.telegram.ui.l4 l4Var = pzVar.J;
                            pz pzVar2 = (pz) l4Var.f49432e;
                            ArrayList arrayList4 = pzVar2.h;
                            SparseIntArray sparseIntArray2 = pzVar2.f38630l0;
                            int size = arrayList4.size();
                            if (i16 >= 0 && i16 < size) {
                                ArrayList V0 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).V0();
                                int i17 = sparseIntArray2.get(i16);
                                int i18 = ((mz) arrayList4.get(i16)).f37668a;
                                for (int i19 = i16 - 1; i19 >= 0; i19--) {
                                    sparseIntArray2.put(i19 + 1, sparseIntArray2.get(i19));
                                }
                                org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) V0.remove(i16);
                                roVar.f26676f = 0;
                                V0.add(0, roVar);
                                sparseIntArray2.put(0, i17);
                                arrayList4.add(0, (mz) arrayList4.remove(i16));
                                ((mz) arrayList4.get(0)).f37668a = i18;
                                for (int i20 = 0; i20 <= i16; i20++) {
                                    ((mz) arrayList4.get(i20)).f37668a = i20;
                                    ((org.telegram.messenger.ro) V0.get(i20)).f26676f = i20;
                                }
                                for (int i21 = 0; i21 <= i16; i21++) {
                                    if (pzVar2.L == i21) {
                                        if (i21 == i16) {
                                            i10 = 0;
                                        } else {
                                            i10 = i21 + 1;
                                        }
                                        pzVar2.M = i10;
                                        pzVar2.L = i10;
                                    }
                                    if (pzVar2.f38637r0 == i21) {
                                        if (i21 == i16) {
                                            i7 = 0;
                                        } else {
                                            i7 = i21 + 1;
                                        }
                                        pzVar2.f38639s0 = i7;
                                        pzVar2.f38637r0 = i7;
                                    }
                                }
                                l4Var.j(i16, 0);
                                lz lzVar = pzVar2.K;
                                int i22 = ((mz) arrayList4.get(i16)).f37668a;
                                org.telegram.ui.tw twVar = (org.telegram.ui.tw) lzVar;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.bx[] bxVarArr = twVar.f52363b.f46663f0;
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
                                        pzVar2.m();
                                        pzVar2.E = true;
                                        pzVar2.G.setItemAnimator(pzVar2.f38640t0);
                                    }
                                }
                            }
                            pzVar.G.v0(0);
                            org.telegram.ui.rw rwVar = (org.telegram.ui.rw) pzVar;
                            org.telegram.ui.cx cxVar = rwVar.I0;
                            if (!cxVar.getMessagesController().K3()) {
                                try {
                                    rwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                gc J = lc.b0(cxVar).J(2131624018, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131748752, org.telegram.messenger.gd.M0(2131750796, null))), org.telegram.messenger.gd.M0(2131746840, null), 5000, false, new org.telegram.ui.bh(rwVar, 24));
                                J.k(true);
                                cxVar.f46717q3 = J;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 19:
                uz uzVar = (uz) obj;
                if (!uzVar.f40447c) {
                    uzVar.setLayerType(0, null);
                    return;
                }
                return;
            case 20:
                ((z10) obj).h(true);
                return;
            case 21:
                org.telegram.ui.kw kwVar = ((im0) ((f30) obj)).f36150f0;
                if (!kwVar.f39203x0.canScrollVertically(-1)) {
                    kwVar.f39202w0.h1(0, 0);
                    return;
                }
                return;
            case 22:
                ((h30) obj).f35711b.a();
                return;
            case 23:
                w30 w30Var = (w30) obj;
                ph0 ph0Var = w30Var.f41552q1;
                if (w30Var.f41554s1) {
                    ph0Var.getAnimatedDrawable().K(0);
                    ph0Var.setAnimation(w30Var.f41555t1);
                    ph0Var.d();
                    return;
                }
                return;
            case 24:
                z40 z40Var = (z40) ((h6.r) obj).f13946b;
                try {
                    f61 f61Var = z40Var.T;
                    if (f61Var != null && (e20Var = z40Var.S) != null) {
                        long j10 = 0;
                        if (e20Var.f23636b > 0) {
                            long S = f61Var.S();
                            org.telegram.messenger.e20 e20Var2 = z40Var.S;
                            if (S >= e20Var2.f23636b) {
                                f61 f61Var2 = z40Var.T;
                                long j11 = e20Var2.f23634a;
                                if (j11 > 0) {
                                    j10 = j11;
                                }
                                f61Var2.q0(j10, false);
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
                u80 u80Var = (u80) obj;
                u80Var.f40263k = false;
                u80Var.c();
                return;
            case 26:
                c90 c90Var = (c90) obj;
                if (c90Var.d) {
                    c90Var.f33936e = true;
                    c90Var.f33939r = false;
                    c90Var.f33937f = 0.0f;
                    c90Var.h = SystemClock.uptimeMillis();
                    c90Var.invalidate();
                    return;
                }
                return;
            case 27:
                final t90 t90Var = (t90) obj;
                boolean z11 = t90Var.J;
                boolean z12 = !z11;
                jg.n1 n1Var = t90Var.f39948e;
                s90 s90Var = t90Var.f39946b;
                if (s90Var != null && n1Var != null) {
                    if (t90Var.M && (gVar = t90Var.L) != null && gVar.f56317f && !z11) {
                        t90Var.P = 0;
                        return;
                    }
                    boolean g10 = t90Var.g();
                    if (!z11) {
                        f10 = (-t90Var.f39952s) - org.telegram.messenger.g0.L(6.0f);
                    } else {
                        int computeVerticalScrollRange = s90Var.computeVerticalScrollRange();
                        float f12 = (computeVerticalScrollRange - n1Var.h) + t90Var.f39952s;
                        if (computeVerticalScrollRange <= 0 && t90Var.f39949f.K() > 0 && (i11 = t90Var.P) < 3) {
                            t90Var.P = i11 + 1;
                            t90Var.o(true);
                            return;
                        }
                        f10 = f12;
                    }
                    t90Var.P = 0;
                    float f13 = t90Var.f39953w;
                    if (g10) {
                        max = -Math.max(0.0f, f13 - f10);
                    } else {
                        max = Math.max(0.0f, f13 - f10) + (-f13);
                    }
                    if (!z11 && !g10) {
                        max += s90Var.computeVerticalScrollOffset();
                    }
                    final float f14 = max;
                    r1.g gVar2 = t90Var.L;
                    if (gVar2 != null) {
                        gVar2.d();
                    }
                    t90Var.M = z12;
                    final float translationY = s90Var.getTranslationY();
                    final float f15 = t90Var.N;
                    if (!z11) {
                        f11 = 1.0f;
                    }
                    if (translationY == f14) {
                        t90Var.L = null;
                        if (z11) {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (t90Var.O && !z11) {
                            t90Var.O = false;
                            s90Var.setLayoutManager(t90Var.getNeededLayoutManager());
                            t90Var.J = true;
                            t90Var.o(true);
                        }
                    } else {
                        r1.g gVar3 = new r1.g(new r1.f(translationY));
                        r1.h hVar = new r1.h(f14);
                        hVar.a(1.0f);
                        hVar.b(550.0f);
                        gVar3.f56323m = hVar;
                        t90Var.L = gVar3;
                        final float f16 = f11;
                        r1.d dVar = new r1.d() {
                            @Override
                            public final void a(r1.g gVar4, float f17, float f18) {
                                t90 t90Var2 = t90.this;
                                t90Var2.f39946b.setTranslationY(f17);
                                t90Var2.i();
                                float f19 = translationY;
                                t90Var2.N = org.telegram.messenger.g0.T1(f15, f16, (f17 - f19) / (f14 - f19));
                            }
                        };
                        t90Var = t90Var;
                        gVar3.b(dVar);
                        if (!z11) {
                            t90Var.L.a(new hi.c4(t90Var, z12, 2));
                        }
                        t90Var.L.a(new Object());
                        t90Var.L.h();
                    }
                    if (num != null && t90Var.getVisibility() != num.intValue()) {
                        t90Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                t90Var.P = 0;
                return;
            case 28:
                ((oa0) ((ga0) obj).T).f38048n.f();
                return;
            default:
                ((ya0) obj).a();
                return;
        }
    }

    public mo(xt xtVar, l80 l80Var, ClickableSpan clickableSpan) {
        this.f37588a = 10;
        this.f37589b = xtVar;
    }
}
