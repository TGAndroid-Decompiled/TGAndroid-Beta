package org.telegram.ui.Components;

import android.os.SystemClock;
import android.text.style.ClickableSpan;
import android.util.SparseIntArray;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class gp implements Runnable {
    public final int f34025a;
    public final Object f34026b;

    public gp(Object obj, int i7) {
        this.f34025a = i7;
        this.f34026b = obj;
    }

    @Override
    public final void run() {
        boolean z9;
        te.a aVar;
        int i7;
        int i10;
        org.telegram.messenger.j20 j20Var;
        float f10;
        int i11;
        float max;
        r1.g gVar;
        int i12 = this.f34025a;
        float f11 = 0.0f;
        int i13 = 8;
        Integer num = null;
        Object obj = this.f34026b;
        switch (i12) {
            case 0:
                ((lp) obj).dismiss();
                return;
            case 1:
                ((a5.h) obj).a();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.v2) obj).dismiss();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    return;
                }
                return;
            case 3:
                oq oqVar = ((nq) obj).f36479c;
                TLRPC.Peer peer = oqVar.V1;
                org.telegram.ui.ActionBar.f2 f2Var = oqVar.X1;
                long j3 = oqVar.Y1;
                if (oqVar.Q1.size() > 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                tq tqVar = new tq(f2Var, peer, j3, z9, oqVar.P1);
                if (f2Var.getParentActivity() != null) {
                    f2Var.showDialog(tqVar);
                    return;
                } else {
                    tqVar.show();
                    return;
                }
            case 4:
                ((fi.d) obj).setLoading(true);
                return;
            case 5:
                nr nrVar = (nr) obj;
                nrVar.f36480a.a(!aVar.f55500f, true);
                org.telegram.messenger.g0.i3(nrVar.f36484f, 3000L);
                return;
            case 6:
                ((bm0) obj).W(false);
                return;
            case 7:
                ((ns) obj).a();
                return;
            case 8:
                ((mt) obj).getClass();
                return;
            case 9:
                vf.c.t(((wt) ((org.telegram.ui.n1) obj).f48053b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 10:
                wt wtVar = ((vt) obj).f39803a;
                wtVar.f40153o1.setVisibility(4);
                wtVar.n1.setVisibility(4);
                ImageView imageView = wtVar.f40158t1;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 11:
                ((nu) obj).a(true, true);
                return;
            case 12:
                fw fwVar = (fw) obj;
                if (fwVar.Z.getEmojiView() != null) {
                    hy emojiView = fwVar.Z.getEmojiView();
                    if (!emojiView.f34424f0) {
                        try {
                            SparseIntArray sparseIntArray = emojiView.R.f37483s;
                            char[] cArr = org.telegram.messenger.j6.f23501a;
                            int i14 = sparseIntArray.get(8);
                            if (i14 > 0) {
                                emojiView.P.C0();
                                emojiView.U(i14);
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
            case 13:
                yw ywVar = (yw) obj;
                ywVar.f40822x.f38813f = true;
                ywVar.a(true);
                return;
            case 14:
                org.telegram.messenger.g0.V3(((ux) obj).h, true, true);
                return;
            case 15:
                ay ayVar = (ay) obj;
                ArrayList arrayList = ayVar.f32014r;
                ArrayList arrayList2 = ayVar.h;
                cy cyVar = ayVar.f32017x;
                int i15 = cyVar.M;
                hy hyVar = cyVar.Q;
                qv qvVar = hyVar.D0;
                if (i15 == ayVar.f32009b) {
                    arrayList2.remove(arrayList);
                    cyVar.E = ayVar.f32010c;
                    cyVar.F = ayVar.d;
                    cyVar.G = ayVar.f32011e;
                    cyVar.H = ayVar.f32012f;
                    cyVar.I = arrayList2;
                    cyVar.J = ayVar.f32013n;
                    cyVar.K = new ArrayList(arrayList);
                    hyVar.G0.e(false);
                    v4.g0 adapter = qvVar.getAdapter();
                    cy cyVar2 = hyVar.f34487z0;
                    if (adapter != cyVar2) {
                        qvVar.setAdapter(cyVar2);
                    }
                    cyVar.f();
                    return;
                }
                return;
            case 16:
                fz fzVar = (fz) ((ez) obj).f33523f;
                ArrayList arrayList3 = fzVar.h;
                if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).q()) {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        if (((cz) arrayList3.get(i16)).f32793e && i16 != 0) {
                            org.telegram.ui.l4 l4Var = fzVar.I;
                            fz fzVar2 = (fz) l4Var.f47458e;
                            ArrayList arrayList4 = fzVar2.h;
                            SparseIntArray sparseIntArray2 = fzVar2.f33780k0;
                            int size = arrayList4.size();
                            if (i16 >= 0 && i16 < size) {
                                ArrayList T0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).T0();
                                int i17 = sparseIntArray2.get(i16);
                                int i18 = ((cz) arrayList4.get(i16)).f32790a;
                                for (int i19 = i16 - 1; i19 >= 0; i19--) {
                                    sparseIntArray2.put(i19 + 1, sparseIntArray2.get(i19));
                                }
                                org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) T0.remove(i16);
                                voVar.f26074f = 0;
                                T0.add(0, voVar);
                                sparseIntArray2.put(0, i17);
                                arrayList4.add(0, (cz) arrayList4.remove(i16));
                                ((cz) arrayList4.get(0)).f32790a = i18;
                                for (int i20 = 0; i20 <= i16; i20++) {
                                    ((cz) arrayList4.get(i20)).f32790a = i20;
                                    ((org.telegram.messenger.vo) T0.get(i20)).f26074f = i20;
                                }
                                for (int i21 = 0; i21 <= i16; i21++) {
                                    if (fzVar2.K == i21) {
                                        if (i21 == i16) {
                                            i10 = 0;
                                        } else {
                                            i10 = i21 + 1;
                                        }
                                        fzVar2.L = i10;
                                        fzVar2.K = i10;
                                    }
                                    if (fzVar2.f33786q0 == i21) {
                                        if (i21 == i16) {
                                            i7 = 0;
                                        } else {
                                            i7 = i21 + 1;
                                        }
                                        fzVar2.f33788r0 = i7;
                                        fzVar2.f33786q0 = i7;
                                    }
                                }
                                l4Var.j(i16, 0);
                                bz bzVar = fzVar2.J;
                                int i22 = ((cz) arrayList4.get(i16)).f32790a;
                                org.telegram.ui.pw pwVar = (org.telegram.ui.pw) bzVar;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.xw[] xwVarArr = pwVar.f48821b.f52231e0;
                                    if (i23 < xwVarArr.length) {
                                        org.telegram.ui.xw xwVar = xwVarArr[i23];
                                        int i24 = xwVar.h;
                                        if (i24 == i22) {
                                            xwVar.h = i18;
                                        } else if (i24 == i18) {
                                            xwVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        fzVar2.j();
                                        fzVar2.D = true;
                                        fzVar2.F.setItemAnimator(fzVar2.f33790s0);
                                    }
                                }
                            }
                            fzVar.F.v0(0);
                            org.telegram.ui.ow owVar = (org.telegram.ui.ow) fzVar;
                            org.telegram.ui.yw ywVar2 = owVar.B0;
                            if (!ywVar2.getMessagesController().D3()) {
                                try {
                                    owVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                cc J = hc.a0(ywVar2).J(2131624017, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131748944, org.telegram.messenger.id.M0(2131750807, null))), org.telegram.messenger.id.M0(2131747033, null), 5000, false, new org.telegram.ui.dh(owVar, 24));
                                J.k(true);
                                ywVar2.f52286p3 = J;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 17:
                kz kzVar = (kz) obj;
                if (!kzVar.f35522c) {
                    kzVar.setLayerType(0, null);
                    return;
                }
                return;
            case 18:
                ((q10) obj).h(true);
                return;
            case 19:
                org.telegram.ui.hw hwVar = ((xl0) ((v20) obj)).f40431e0;
                if (!hwVar.f34013w0.canScrollVertically(-1)) {
                    hwVar.f34012v0.h1(0, 0);
                    return;
                }
                return;
            case 20:
                ((x20) obj).f40279b.a();
                return;
            case 21:
                m30 m30Var = (m30) obj;
                dh0 dh0Var = m30Var.f35932m1;
                if (m30Var.f35933o1) {
                    dh0Var.getAnimatedDrawable().K(0);
                    dh0Var.setAnimation(m30Var.f35934p1);
                    dh0Var.d();
                    return;
                }
                return;
            case 22:
                p40 p40Var = (p40) ((fi.h2) obj).f12127b;
                try {
                    u51 u51Var = p40Var.S;
                    if (u51Var != null && (j20Var = p40Var.R) != null) {
                        long j10 = 0;
                        if (j20Var.f23473b > 0) {
                            long S = u51Var.S();
                            org.telegram.messenger.j20 j20Var2 = p40Var.R;
                            if (S >= j20Var2.f23473b) {
                                u51 u51Var2 = p40Var.S;
                                long j11 = j20Var2.f23471a;
                                if (j11 > 0) {
                                    j10 = j11;
                                }
                                u51Var2.q0(j10, false);
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
            case 23:
                h80 h80Var = (h80) obj;
                h80Var.f34240k = false;
                h80Var.c();
                return;
            case 24:
                p80 p80Var = (p80) obj;
                if (p80Var.d) {
                    p80Var.f36947e = true;
                    p80Var.f36950r = false;
                    p80Var.f36948f = 0.0f;
                    p80Var.h = SystemClock.uptimeMillis();
                    p80Var.invalidate();
                    return;
                }
                return;
            case 25:
                final h90 h90Var = (h90) obj;
                boolean z10 = h90Var.I;
                boolean z11 = !z10;
                jg.o1 o1Var = h90Var.f34249e;
                g90 g90Var = h90Var.f34247b;
                if (g90Var != null && o1Var != null) {
                    if (h90Var.L && (gVar = h90Var.K) != null && gVar.f54274f && !z10) {
                        h90Var.O = 0;
                        return;
                    }
                    boolean g10 = h90Var.g();
                    if (!z10) {
                        f10 = (-h90Var.f34253s) - org.telegram.messenger.g0.L(6.0f);
                    } else {
                        int computeVerticalScrollRange = g90Var.computeVerticalScrollRange();
                        float f12 = (computeVerticalScrollRange - o1Var.h) + h90Var.f34253s;
                        if (computeVerticalScrollRange <= 0 && h90Var.f34250f.K() > 0 && (i11 = h90Var.O) < 3) {
                            h90Var.O = i11 + 1;
                            h90Var.o(true);
                            return;
                        }
                        f10 = f12;
                    }
                    h90Var.O = 0;
                    float f13 = h90Var.f34254w;
                    if (g10) {
                        max = -Math.max(0.0f, f13 - f10);
                    } else {
                        max = Math.max(0.0f, f13 - f10) + (-f13);
                    }
                    if (!z10 && !g10) {
                        max += g90Var.computeVerticalScrollOffset();
                    }
                    final float f14 = max;
                    r1.g gVar2 = h90Var.K;
                    if (gVar2 != null) {
                        gVar2.d();
                    }
                    h90Var.L = z11;
                    final float translationY = g90Var.getTranslationY();
                    final float f15 = h90Var.M;
                    if (!z10) {
                        f11 = 1.0f;
                    }
                    if (translationY == f14) {
                        h90Var.K = null;
                        if (z10) {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (h90Var.N && !z10) {
                            h90Var.N = false;
                            g90Var.setLayoutManager(h90Var.getNeededLayoutManager());
                            h90Var.I = true;
                            h90Var.o(true);
                        }
                    } else {
                        r1.g gVar3 = new r1.g(new r1.f(translationY));
                        r1.h hVar = new r1.h(f14);
                        hVar.a(1.0f);
                        hVar.b(550.0f);
                        gVar3.f54280m = hVar;
                        h90Var.K = gVar3;
                        final float f16 = f11;
                        r1.d dVar = new r1.d() {
                            @Override
                            public final void a(r1.g gVar4, float f17, float f18) {
                                h90 h90Var2 = h90.this;
                                h90Var2.f34247b.setTranslationY(f17);
                                h90Var2.i();
                                float f19 = translationY;
                                h90Var2.M = org.telegram.messenger.g0.T1(f15, f16, (f17 - f19) / (f14 - f19));
                            }
                        };
                        h90Var = h90Var;
                        gVar3.b(dVar);
                        if (!z10) {
                            h90Var.K.a(new fi.g4(h90Var, z11, 2));
                        }
                        h90Var.K.a(new Object());
                        h90Var.K.h();
                    }
                    if (num != null && h90Var.getVisibility() != num.intValue()) {
                        h90Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                h90Var.O = 0;
                return;
            case 26:
                ((da0) ((v90) obj).T).f32923n.f();
                return;
            case 27:
                ((oa0) obj).a();
                return;
            case 28:
                ((fi.u) obj).invalidateSelf();
                return;
            default:
                ((xz) obj).invalidateSelf();
                return;
        }
    }

    public gp(mt mtVar, y70 y70Var, ClickableSpan clickableSpan) {
        this.f34025a = 8;
        this.f34026b = mtVar;
    }
}
