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
    public final int f34161a;
    public final Object f34162b;

    public gp(Object obj, int i3) {
        this.f34161a = i3;
        this.f34162b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        qe.a aVar;
        int i3;
        int i10;
        org.telegram.messenger.b20 b20Var;
        float f10;
        int i11;
        float max;
        q1.g gVar;
        int i12 = this.f34161a;
        float f11 = 0.0f;
        int i13 = 8;
        Integer num = null;
        Object obj = this.f34162b;
        switch (i12) {
            case 0:
                ((lp) obj).dismiss();
                return;
            case 1:
                ((yp) obj).a();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.t2) obj).dismiss();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    return;
                }
                return;
            case 3:
                oq oqVar = ((nq) obj).f36606c;
                TLRPC.Peer peer = oqVar.W1;
                org.telegram.ui.ActionBar.d2 d2Var = oqVar.Y1;
                long j10 = oqVar.Z1;
                if (oqVar.R1.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tq tqVar = new tq(d2Var, peer, j10, z10, oqVar.Q1);
                if (d2Var.getParentActivity() != null) {
                    d2Var.showDialog(tqVar);
                    return;
                } else {
                    tqVar.show();
                    return;
                }
            case 4:
                ((gi.d) obj).setLoading(true);
                return;
            case 5:
                nr nrVar = (nr) obj;
                nrVar.f36607a.a(!aVar.f53841f, true);
                org.telegram.messenger.g0.i3(nrVar.f36611f, 3000L);
                return;
            case 6:
                ((dm0) obj).W(false);
                return;
            case 7:
                ((ns) obj).a();
                return;
            case 8:
                ((kt) obj).getClass();
                return;
            case 9:
                sf.c.t(((ut) ((org.telegram.ui.o1) obj).f48167b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 10:
                ut utVar = ((tt) obj).f38554a;
                utVar.f38866p1.setVisibility(4);
                utVar.f38865o1.setVisibility(4);
                ImageView imageView = utVar.f38871u1;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 11:
                ((lu) obj).a(true, true);
                return;
            case 12:
                dw dwVar = (dw) obj;
                if (dwVar.f51237a0.getEmojiView() != null) {
                    ey emojiView = dwVar.f51237a0.getEmojiView();
                    if (!emojiView.f33539g0) {
                        try {
                            SparseIntArray sparseIntArray = emojiView.S.f36954s;
                            char[] cArr = org.telegram.messenger.j6.f23640a;
                            int i14 = sparseIntArray.get(8);
                            if (i14 > 0) {
                                emojiView.Q.C0();
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
                ww wwVar = (ww) obj;
                wwVar.f40165x.f38128f = true;
                wwVar.a(true);
                return;
            case 14:
                org.telegram.messenger.g0.V3(((rx) obj).h, true, true);
                return;
            case 15:
                xx xxVar = (xx) obj;
                ArrayList arrayList = xxVar.f40545r;
                ArrayList arrayList2 = xxVar.h;
                yx yxVar = xxVar.f40548x;
                int i15 = yxVar.N;
                ey eyVar = yxVar.R;
                ov ovVar = eyVar.E0;
                if (i15 == xxVar.f40540b) {
                    arrayList2.remove(arrayList);
                    yxVar.F = xxVar.f40541c;
                    yxVar.G = xxVar.d;
                    yxVar.H = xxVar.f40542e;
                    yxVar.I = xxVar.f40543f;
                    yxVar.J = arrayList2;
                    yxVar.K = xxVar.f40544n;
                    yxVar.L = new ArrayList(arrayList);
                    eyVar.H0.e(false);
                    u4.h0 adapter = ovVar.getAdapter();
                    yx yxVar2 = eyVar.A0;
                    if (adapter != yxVar2) {
                        ovVar.setAdapter(yxVar2);
                    }
                    yxVar.f();
                    return;
                }
                return;
            case 16:
                bz bzVar = (bz) ((az) obj).f32006f;
                ArrayList arrayList3 = bzVar.h;
                if (!org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q()) {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        if (((yy) arrayList3.get(i16)).f40856e && i16 != 0) {
                            org.telegram.ui.n4 n4Var = bzVar.J;
                            bz bzVar2 = (bz) n4Var.f47865e;
                            ArrayList arrayList4 = bzVar2.h;
                            SparseIntArray sparseIntArray2 = bzVar2.f32458l0;
                            int size = arrayList4.size();
                            if (i16 >= 0 && i16 < size) {
                                ArrayList T0 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).T0();
                                int i17 = sparseIntArray2.get(i16);
                                int i18 = ((yy) arrayList4.get(i16)).f40853a;
                                for (int i19 = i16 - 1; i19 >= 0; i19--) {
                                    sparseIntArray2.put(i19 + 1, sparseIntArray2.get(i19));
                                }
                                org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) T0.remove(i16);
                                moVar.f24241f = 0;
                                T0.add(0, moVar);
                                sparseIntArray2.put(0, i17);
                                arrayList4.add(0, (yy) arrayList4.remove(i16));
                                ((yy) arrayList4.get(0)).f40853a = i18;
                                for (int i20 = 0; i20 <= i16; i20++) {
                                    ((yy) arrayList4.get(i20)).f40853a = i20;
                                    ((org.telegram.messenger.mo) T0.get(i20)).f24241f = i20;
                                }
                                for (int i21 = 0; i21 <= i16; i21++) {
                                    if (bzVar2.L == i21) {
                                        if (i21 == i16) {
                                            i10 = 0;
                                        } else {
                                            i10 = i21 + 1;
                                        }
                                        bzVar2.M = i10;
                                        bzVar2.L = i10;
                                    }
                                    if (bzVar2.f32465r0 == i21) {
                                        if (i21 == i16) {
                                            i3 = 0;
                                        } else {
                                            i3 = i21 + 1;
                                        }
                                        bzVar2.f32467s0 = i3;
                                        bzVar2.f32465r0 = i3;
                                    }
                                }
                                n4Var.j(i16, 0);
                                xy xyVar = bzVar2.K;
                                int i22 = ((yy) arrayList4.get(i16)).f40853a;
                                org.telegram.ui.kw kwVar = (org.telegram.ui.kw) xyVar;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.tw[] twVarArr = kwVar.f47036b.f50230f0;
                                    if (i23 < twVarArr.length) {
                                        org.telegram.ui.tw twVar = twVarArr[i23];
                                        int i24 = twVar.h;
                                        if (i24 == i22) {
                                            twVar.h = i18;
                                        } else if (i24 == i18) {
                                            twVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        bzVar2.j();
                                        bzVar2.E = true;
                                        bzVar2.G.setItemAnimator(bzVar2.f32468t0);
                                    }
                                }
                            }
                            bzVar.G.v0(0);
                            org.telegram.ui.jw jwVar = (org.telegram.ui.jw) bzVar;
                            org.telegram.ui.uw uwVar = jwVar.C0;
                            if (!uwVar.getMessagesController().D3()) {
                                try {
                                    jwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                ac J = fc.a0(uwVar).J(2131624017, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131748952, org.telegram.messenger.bd.M0(2131750808, null))), org.telegram.messenger.bd.M0(2131747041, null), 5000, false, new org.telegram.ui.xg(jwVar, 24));
                                J.k(true);
                                uwVar.f50279p3 = J;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 17:
                gz gzVar = (gz) obj;
                if (!gzVar.f34239c) {
                    gzVar.setLayerType(0, null);
                    return;
                }
                return;
            case 18:
                ((l10) obj).g(true);
                return;
            case 19:
                org.telegram.ui.cw cwVar = ((zl0) ((q20) obj)).f41073f0;
                if (!cwVar.f34769x0.canScrollVertically(-1)) {
                    cwVar.f34768w0.h1(0, 0);
                    return;
                }
                return;
            case 20:
                ((s20) obj).f37890b.a();
                return;
            case 21:
                h30 h30Var = (h30) obj;
                fh0 fh0Var = h30Var.f34287n1;
                if (h30Var.f34289p1) {
                    fh0Var.getAnimatedDrawable().K(0);
                    fh0Var.setAnimation(h30Var.f34290q1);
                    fh0Var.d();
                    return;
                }
                return;
            case 22:
                k40 k40Var = (k40) ((g6.q) obj).f12031b;
                try {
                    m51 m51Var = k40Var.T;
                    if (m51Var != null && (b20Var = k40Var.S) != null) {
                        long j11 = 0;
                        if (b20Var.f21710b > 0) {
                            long S = m51Var.S();
                            org.telegram.messenger.b20 b20Var2 = k40Var.S;
                            if (S >= b20Var2.f21710b) {
                                m51 m51Var2 = k40Var.T;
                                long j12 = b20Var2.f21708a;
                                if (j12 > 0) {
                                    j11 = j12;
                                }
                                m51Var2.q0(j11, false);
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
                c80 c80Var = (c80) obj;
                c80Var.f32601k = false;
                c80Var.c();
                return;
            case 24:
                l80 l80Var = (l80) obj;
                if (l80Var.d) {
                    l80Var.f35622e = true;
                    l80Var.f35625r = false;
                    l80Var.f35623f = 0.0f;
                    l80Var.h = SystemClock.uptimeMillis();
                    l80Var.invalidate();
                    return;
                }
                return;
            case 25:
                final c90 c90Var = (c90) obj;
                boolean z11 = c90Var.J;
                boolean z12 = !z11;
                kg.k1 k1Var = c90Var.f32613e;
                b90 b90Var = c90Var.f32611b;
                if (b90Var != null && k1Var != null) {
                    if (c90Var.M && (gVar = c90Var.L) != null && gVar.f53647f && !z11) {
                        c90Var.P = 0;
                        return;
                    }
                    boolean g7 = c90Var.g();
                    if (!z11) {
                        f10 = (-c90Var.f32617s) - org.telegram.messenger.g0.L(6.0f);
                    } else {
                        int computeVerticalScrollRange = b90Var.computeVerticalScrollRange();
                        float f12 = (computeVerticalScrollRange - k1Var.h) + c90Var.f32617s;
                        if (computeVerticalScrollRange <= 0 && c90Var.f32614f.K() > 0 && (i11 = c90Var.P) < 3) {
                            c90Var.P = i11 + 1;
                            c90Var.o(true);
                            return;
                        }
                        f10 = f12;
                    }
                    c90Var.P = 0;
                    float f13 = c90Var.f32618w;
                    if (g7) {
                        max = -Math.max(0.0f, f13 - f10);
                    } else {
                        max = Math.max(0.0f, f13 - f10) + (-f13);
                    }
                    if (!z11 && !g7) {
                        max += b90Var.computeVerticalScrollOffset();
                    }
                    final float f14 = max;
                    q1.g gVar2 = c90Var.L;
                    if (gVar2 != null) {
                        gVar2.d();
                    }
                    c90Var.M = z12;
                    final float translationY = b90Var.getTranslationY();
                    final float f15 = c90Var.N;
                    if (!z11) {
                        f11 = 1.0f;
                    }
                    if (translationY == f14) {
                        c90Var.L = null;
                        if (z11) {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (c90Var.O && !z11) {
                            c90Var.O = false;
                            b90Var.setLayoutManager(c90Var.getNeededLayoutManager());
                            c90Var.J = true;
                            c90Var.o(true);
                        }
                    } else {
                        q1.g gVar3 = new q1.g(new q1.f(translationY));
                        q1.h hVar = new q1.h(f14);
                        hVar.a(1.0f);
                        hVar.b(550.0f);
                        gVar3.f53653m = hVar;
                        c90Var.L = gVar3;
                        final float f16 = f11;
                        q1.d dVar = new q1.d() {
                            @Override
                            public final void a(q1.g gVar4, float f17, float f18) {
                                c90 c90Var2 = c90.this;
                                c90Var2.f32611b.setTranslationY(f17);
                                c90Var2.i();
                                float f19 = translationY;
                                c90Var2.N = org.telegram.messenger.g0.T1(f15, f16, (f17 - f19) / (f14 - f19));
                            }
                        };
                        c90Var = c90Var;
                        gVar3.b(dVar);
                        if (!z11) {
                            c90Var.L.a(new gi.d4(c90Var, z12, 2));
                        }
                        c90Var.L.a(new Object());
                        c90Var.L.h();
                    }
                    if (num != null && c90Var.getVisibility() != num.intValue()) {
                        c90Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                c90Var.P = 0;
                return;
            case 26:
                ((x90) ((p90) obj).T).f40294n.f();
                return;
            case 27:
                ((ia0) obj).a();
                return;
            case 28:
                ((gi.u) obj).invalidateSelf();
                return;
            default:
                ((sz) obj).invalidateSelf();
                return;
        }
    }

    public gp(kt ktVar, t70 t70Var, ClickableSpan clickableSpan) {
        this.f34161a = 8;
        this.f34162b = ktVar;
    }
}
