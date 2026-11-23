package org.telegram.ui.Components;

import android.os.SystemClock;
import android.text.style.ClickableSpan;
import android.util.SparseIntArray;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class lo implements Runnable {
    public final int f37186a;
    public final Object f37187b;

    public lo(Object obj, int i7) {
        this.f37186a = i7;
        this.f37187b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        te.a aVar;
        int i7;
        int i10;
        org.telegram.messenger.d20 d20Var;
        float f10;
        int i11;
        float max;
        r1.g gVar;
        int i12 = this.f37186a;
        float f11 = 0.0f;
        int i13 = 8;
        Integer num = null;
        Object obj = this.f37187b;
        switch (i12) {
            case 0:
                ((no) obj).v();
                return;
            case 1:
                ((po) obj).setVisibility(8);
                return;
            case 2:
                ((zp) obj).dismiss();
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
                br brVar = ((ar) obj).f33540c;
                TLRPC.Peer peer = brVar.Z1;
                org.telegram.ui.ActionBar.g2 g2Var = brVar.f33800b2;
                long j3 = brVar.f33801c2;
                if (brVar.U1.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                gr grVar = new gr(g2Var, peer, j3, z10, brVar.T1);
                if (g2Var.getParentActivity() != null) {
                    g2Var.showDialog(grVar);
                    return;
                } else {
                    grVar.show();
                    return;
                }
            case 6:
                ((hi.e) obj).setLoading(true);
                return;
            case 7:
                zr zrVar = (zr) obj;
                zrVar.f43026a.a(!aVar.f57780f, true);
                org.telegram.messenger.g0.h3(zrVar.f43030f, 3000L);
                return;
            case 8:
                ((om0) obj).W(false);
                return;
            case 9:
                ((zs) obj).a();
                return;
            case 10:
                ((xt) obj).getClass();
                return;
            case 11:
                vf.c.t(((gu) ((org.telegram.ui.n1) obj).f50171b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 12:
                gu guVar = ((fu) obj).f35203a;
                guVar.f35541s1.setVisibility(4);
                guVar.f35540r1.setVisibility(4);
                ImageView imageView = guVar.f35546x1;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 13:
                ((xu) obj).a(true, true);
                return;
            case 14:
                pw pwVar = (pw) obj;
                if (pwVar.f46118a0.getEmojiView() != null) {
                    qy emojiView = pwVar.f46118a0.getEmojiView();
                    if (!emojiView.f39056g0) {
                        try {
                            SparseIntArray sparseIntArray = emojiView.S.f33571s;
                            char[] cArr = org.telegram.messenger.k6.f25086a;
                            int i14 = sparseIntArray.get(8);
                            if (i14 > 0) {
                                emojiView.Q.C0();
                                emojiView.V(i14);
                                emojiView.F(i14, org.telegram.messenger.g0.L(-9.0f));
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
                ix ixVar = (ix) obj;
                ixVar.f36189x.f34859f = true;
                ixVar.a(true);
                return;
            case 16:
                org.telegram.messenger.g0.T3(((dy) obj).h, true, true);
                return;
            case 17:
                ky kyVar = (ky) obj;
                ArrayList arrayList = kyVar.f36926r;
                ArrayList arrayList2 = kyVar.h;
                ly lyVar = kyVar.f36929x;
                int i15 = lyVar.N;
                qy qyVar = lyVar.R;
                aw awVar = qyVar.E0;
                if (i15 == kyVar.f36921b) {
                    arrayList2.remove(arrayList);
                    lyVar.F = kyVar.f36922c;
                    lyVar.G = kyVar.d;
                    lyVar.H = kyVar.f36923e;
                    lyVar.I = kyVar.f36924f;
                    lyVar.J = arrayList2;
                    lyVar.K = kyVar.f36925n;
                    lyVar.L = new ArrayList(arrayList);
                    qyVar.H0.e(false);
                    v4.i0 adapter = awVar.getAdapter();
                    ly lyVar2 = qyVar.A0;
                    if (adapter != lyVar2) {
                        awVar.setAdapter(lyVar2);
                    }
                    lyVar.f();
                    return;
                }
                return;
            case 18:
                oz ozVar = (oz) ((nz) obj).f37959f;
                ArrayList arrayList3 = ozVar.h;
                if (!org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).q()) {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        if (((lz) arrayList3.get(i16)).f37264e && i16 != 0) {
                            org.telegram.ui.l4 l4Var = ozVar.J;
                            oz ozVar2 = (oz) l4Var.f49583e;
                            ArrayList arrayList4 = ozVar2.h;
                            SparseIntArray sparseIntArray2 = ozVar2.f38305l0;
                            int size = arrayList4.size();
                            if (i16 >= 0 && i16 < size) {
                                ArrayList V0 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).V0();
                                int i17 = sparseIntArray2.get(i16);
                                int i18 = ((lz) arrayList4.get(i16)).f37261a;
                                for (int i19 = i16 - 1; i19 >= 0; i19--) {
                                    sparseIntArray2.put(i19 + 1, sparseIntArray2.get(i19));
                                }
                                org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) V0.remove(i16);
                                roVar.f26777f = 0;
                                V0.add(0, roVar);
                                sparseIntArray2.put(0, i17);
                                arrayList4.add(0, (lz) arrayList4.remove(i16));
                                ((lz) arrayList4.get(0)).f37261a = i18;
                                for (int i20 = 0; i20 <= i16; i20++) {
                                    ((lz) arrayList4.get(i20)).f37261a = i20;
                                    ((org.telegram.messenger.ro) V0.get(i20)).f26777f = i20;
                                }
                                for (int i21 = 0; i21 <= i16; i21++) {
                                    if (ozVar2.L == i21) {
                                        if (i21 == i16) {
                                            i10 = 0;
                                        } else {
                                            i10 = i21 + 1;
                                        }
                                        ozVar2.M = i10;
                                        ozVar2.L = i10;
                                    }
                                    if (ozVar2.f38312r0 == i21) {
                                        if (i21 == i16) {
                                            i7 = 0;
                                        } else {
                                            i7 = i21 + 1;
                                        }
                                        ozVar2.f38314s0 = i7;
                                        ozVar2.f38312r0 = i7;
                                    }
                                }
                                l4Var.j(i16, 0);
                                kz kzVar = ozVar2.K;
                                int i22 = ((lz) arrayList4.get(i16)).f37261a;
                                org.telegram.ui.sw swVar = (org.telegram.ui.sw) kzVar;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.ax[] axVarArr = swVar.f52164b.f46549f0;
                                    if (i23 < axVarArr.length) {
                                        org.telegram.ui.ax axVar = axVarArr[i23];
                                        int i24 = axVar.h;
                                        if (i24 == i22) {
                                            axVar.h = i18;
                                        } else if (i24 == i18) {
                                            axVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        ozVar2.m();
                                        ozVar2.E = true;
                                        ozVar2.G.setItemAnimator(ozVar2.f38315t0);
                                    }
                                }
                            }
                            ozVar.G.v0(0);
                            org.telegram.ui.qw qwVar = (org.telegram.ui.qw) ozVar;
                            org.telegram.ui.bx bxVar = qwVar.I0;
                            if (!bxVar.getMessagesController().K3()) {
                                try {
                                    qwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                fc J = kc.b0(bxVar).J(2131624018, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131748751, org.telegram.messenger.gd.N0(2131750795, null))), org.telegram.messenger.gd.N0(2131746839, null), 5000, false, new org.telegram.ui.ch(qwVar, 24));
                                J.k(true);
                                bxVar.f46603q3 = J;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 19:
                tz tzVar = (tz) obj;
                if (!tzVar.f40196c) {
                    tzVar.setLayerType(0, null);
                    return;
                }
                return;
            case 20:
                ((a20) obj).h(true);
                return;
            case 21:
                org.telegram.ui.jw jwVar = ((km0) ((f30) obj)).f36810f0;
                if (!jwVar.f40103x0.canScrollVertically(-1)) {
                    jwVar.f40102w0.h1(0, 0);
                    return;
                }
                return;
            case 22:
                ((h30) obj).f35628b.a();
                return;
            case 23:
                w30 w30Var = (w30) obj;
                qh0 qh0Var = w30Var.f41501q1;
                if (w30Var.f41503s1) {
                    qh0Var.getAnimatedDrawable().K(0);
                    qh0Var.setAnimation(w30Var.f41504t1);
                    qh0Var.d();
                    return;
                }
                return;
            case 24:
                z40 z40Var = (z40) ((h6.s) obj).f13943b;
                try {
                    h61 h61Var = z40Var.T;
                    if (h61Var != null && (d20Var = z40Var.S) != null) {
                        long j10 = 0;
                        if (d20Var.f23589b > 0) {
                            long S = h61Var.S();
                            org.telegram.messenger.d20 d20Var2 = z40Var.S;
                            if (S >= d20Var2.f23589b) {
                                h61 h61Var2 = z40Var.T;
                                long j11 = d20Var2.f23587a;
                                if (j11 > 0) {
                                    j10 = j11;
                                }
                                h61Var2.q0(j10, false);
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
                t80 t80Var = (t80) obj;
                t80Var.f39867k = false;
                t80Var.c();
                return;
            case 26:
                b90 b90Var = (b90) obj;
                if (b90Var.d) {
                    b90Var.f33702e = true;
                    b90Var.f33705r = false;
                    b90Var.f33703f = 0.0f;
                    b90Var.h = SystemClock.uptimeMillis();
                    b90Var.invalidate();
                    return;
                }
                return;
            case 27:
                final s90 s90Var = (s90) obj;
                boolean z11 = s90Var.J;
                boolean z12 = !z11;
                jg.n1 n1Var = s90Var.f39537e;
                r90 r90Var = s90Var.f39535b;
                if (r90Var != null && n1Var != null) {
                    if (s90Var.M && (gVar = s90Var.L) != null && gVar.f56440f && !z11) {
                        s90Var.P = 0;
                        return;
                    }
                    boolean g10 = s90Var.g();
                    if (!z11) {
                        f10 = (-s90Var.f39541s) - org.telegram.messenger.g0.L(6.0f);
                    } else {
                        int computeVerticalScrollRange = r90Var.computeVerticalScrollRange();
                        float f12 = (computeVerticalScrollRange - n1Var.h) + s90Var.f39541s;
                        if (computeVerticalScrollRange <= 0 && s90Var.f39538f.K() > 0 && (i11 = s90Var.P) < 3) {
                            s90Var.P = i11 + 1;
                            s90Var.o(true);
                            return;
                        }
                        f10 = f12;
                    }
                    s90Var.P = 0;
                    float f13 = s90Var.f39542w;
                    if (g10) {
                        max = -Math.max(0.0f, f13 - f10);
                    } else {
                        max = Math.max(0.0f, f13 - f10) + (-f13);
                    }
                    if (!z11 && !g10) {
                        max += r90Var.computeVerticalScrollOffset();
                    }
                    final float f14 = max;
                    r1.g gVar2 = s90Var.L;
                    if (gVar2 != null) {
                        gVar2.d();
                    }
                    s90Var.M = z12;
                    final float translationY = r90Var.getTranslationY();
                    final float f15 = s90Var.N;
                    if (!z11) {
                        f11 = 1.0f;
                    }
                    if (translationY == f14) {
                        s90Var.L = null;
                        if (z11) {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (s90Var.O && !z11) {
                            s90Var.O = false;
                            r90Var.setLayoutManager(s90Var.getNeededLayoutManager());
                            s90Var.J = true;
                            s90Var.o(true);
                        }
                    } else {
                        r1.g gVar3 = new r1.g(new r1.f(translationY));
                        r1.h hVar = new r1.h(f14);
                        hVar.a(1.0f);
                        hVar.b(550.0f);
                        gVar3.f56446m = hVar;
                        s90Var.L = gVar3;
                        final float f16 = f11;
                        r1.d dVar = new r1.d() {
                            @Override
                            public final void a(r1.g gVar4, float f17, float f18) {
                                s90 s90Var2 = s90.this;
                                s90Var2.f39535b.setTranslationY(f17);
                                s90Var2.i();
                                float f19 = translationY;
                                s90Var2.N = org.telegram.messenger.g0.T1(f15, f16, (f17 - f19) / (f14 - f19));
                            }
                        };
                        s90Var = s90Var;
                        gVar3.b(dVar);
                        if (!z11) {
                            s90Var.L.a(new hi.l4(s90Var, z12, 2));
                        }
                        s90Var.L.a(new Object());
                        s90Var.L.h();
                    }
                    if (num != null && s90Var.getVisibility() != num.intValue()) {
                        s90Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                s90Var.P = 0;
                return;
            case 28:
                ((na0) ((fa0) obj).T).f37745n.f();
                return;
            default:
                ((wa0) obj).a();
                return;
        }
    }

    public lo(xt xtVar, k80 k80Var, ClickableSpan clickableSpan) {
        this.f37186a = 10;
        this.f37187b = xtVar;
    }
}
