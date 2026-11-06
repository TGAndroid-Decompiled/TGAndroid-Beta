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
    public final int f34006a;
    public final Object f34007b;

    public gp(Object obj, int i7) {
        this.f34006a = i7;
        this.f34007b = obj;
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
        int i12 = this.f34006a;
        float f11 = 0.0f;
        int i13 = 8;
        Integer num = null;
        Object obj = this.f34007b;
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
                oq oqVar = ((nq) obj).f36468c;
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
                nrVar.f36469a.a(!aVar.f55371f, true);
                org.telegram.messenger.g0.i3(nrVar.f36473f, 3000L);
                return;
            case 6:
                ((am0) obj).W(false);
                return;
            case 7:
                ((ns) obj).a();
                return;
            case 8:
                ((lt) obj).getClass();
                return;
            case 9:
                vf.c.t(((vt) ((org.telegram.ui.n1) obj).f47910b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 10:
                vt vtVar = ((ut) obj).f38734a;
                vtVar.f39671o1.setVisibility(4);
                vtVar.n1.setVisibility(4);
                ImageView imageView = vtVar.f39676t1;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 11:
                ((mu) obj).a(true, true);
                return;
            case 12:
                ew ewVar = (ew) obj;
                if (ewVar.Z.getEmojiView() != null) {
                    gy emojiView = ewVar.Z.getEmojiView();
                    if (!emojiView.f34085f0) {
                        try {
                            SparseIntArray sparseIntArray = emojiView.R.f37187s;
                            char[] cArr = org.telegram.messenger.j6.f23475a;
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
                xw xwVar = (xw) obj;
                xwVar.f40431x.f38423f = true;
                xwVar.a(true);
                return;
            case 14:
                org.telegram.messenger.g0.V3(((tx) obj).h, true, true);
                return;
            case 15:
                zx zxVar = (zx) obj;
                ArrayList arrayList = zxVar.f41107r;
                ArrayList arrayList2 = zxVar.h;
                ay ayVar = zxVar.f41110x;
                int i15 = ayVar.M;
                gy gyVar = ayVar.Q;
                pv pvVar = gyVar.D0;
                if (i15 == zxVar.f41102b) {
                    arrayList2.remove(arrayList);
                    ayVar.E = zxVar.f41103c;
                    ayVar.F = zxVar.d;
                    ayVar.G = zxVar.f41104e;
                    ayVar.H = zxVar.f41105f;
                    ayVar.I = arrayList2;
                    ayVar.J = zxVar.f41106n;
                    ayVar.K = new ArrayList(arrayList);
                    gyVar.G0.e(false);
                    v4.g0 adapter = pvVar.getAdapter();
                    ay ayVar2 = gyVar.f34148z0;
                    if (adapter != ayVar2) {
                        pvVar.setAdapter(ayVar2);
                    }
                    ayVar.f();
                    return;
                }
                return;
            case 16:
                ez ezVar = (ez) ((dz) obj).f33059f;
                ArrayList arrayList3 = ezVar.h;
                if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).q()) {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        if (((bz) arrayList3.get(i16)).f32336e && i16 != 0) {
                            org.telegram.ui.l4 l4Var = ezVar.I;
                            ez ezVar2 = (ez) l4Var.f47379e;
                            ArrayList arrayList4 = ezVar2.h;
                            SparseIntArray sparseIntArray2 = ezVar2.f33390k0;
                            int size = arrayList4.size();
                            if (i16 >= 0 && i16 < size) {
                                ArrayList T0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).T0();
                                int i17 = sparseIntArray2.get(i16);
                                int i18 = ((bz) arrayList4.get(i16)).f32333a;
                                for (int i19 = i16 - 1; i19 >= 0; i19--) {
                                    sparseIntArray2.put(i19 + 1, sparseIntArray2.get(i19));
                                }
                                org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) T0.remove(i16);
                                voVar.f26060f = 0;
                                T0.add(0, voVar);
                                sparseIntArray2.put(0, i17);
                                arrayList4.add(0, (bz) arrayList4.remove(i16));
                                ((bz) arrayList4.get(0)).f32333a = i18;
                                for (int i20 = 0; i20 <= i16; i20++) {
                                    ((bz) arrayList4.get(i20)).f32333a = i20;
                                    ((org.telegram.messenger.vo) T0.get(i20)).f26060f = i20;
                                }
                                for (int i21 = 0; i21 <= i16; i21++) {
                                    if (ezVar2.K == i21) {
                                        if (i21 == i16) {
                                            i10 = 0;
                                        } else {
                                            i10 = i21 + 1;
                                        }
                                        ezVar2.L = i10;
                                        ezVar2.K = i10;
                                    }
                                    if (ezVar2.f33396q0 == i21) {
                                        if (i21 == i16) {
                                            i7 = 0;
                                        } else {
                                            i7 = i21 + 1;
                                        }
                                        ezVar2.f33398r0 = i7;
                                        ezVar2.f33396q0 = i7;
                                    }
                                }
                                l4Var.j(i16, 0);
                                az azVar = ezVar2.J;
                                int i22 = ((bz) arrayList4.get(i16)).f32333a;
                                org.telegram.ui.nw nwVar = (org.telegram.ui.nw) azVar;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.vw[] vwVarArr = nwVar.f48122b.f51534e0;
                                    if (i23 < vwVarArr.length) {
                                        org.telegram.ui.vw vwVar = vwVarArr[i23];
                                        int i24 = vwVar.h;
                                        if (i24 == i22) {
                                            vwVar.h = i18;
                                        } else if (i24 == i18) {
                                            vwVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        ezVar2.j();
                                        ezVar2.D = true;
                                        ezVar2.F.setItemAnimator(ezVar2.f33400s0);
                                    }
                                }
                            }
                            ezVar.F.v0(0);
                            org.telegram.ui.mw mwVar = (org.telegram.ui.mw) ezVar;
                            org.telegram.ui.ww wwVar = mwVar.B0;
                            if (!wwVar.getMessagesController().D3()) {
                                try {
                                    mwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                cc J = hc.a0(wwVar).J(2131624017, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131748943, org.telegram.messenger.hd.M0(2131750808, null))), org.telegram.messenger.hd.M0(2131747032, null), 5000, false, new org.telegram.ui.bh(mwVar, 24));
                                J.k(true);
                                wwVar.f51585o3 = J;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 17:
                jz jzVar = (jz) obj;
                if (!jzVar.f35122c) {
                    jzVar.setLayerType(0, null);
                    return;
                }
                return;
            case 18:
                ((p10) obj).h(true);
                return;
            case 19:
                org.telegram.ui.fw fwVar = ((wl0) ((u20) obj)).f40036e0;
                if (!fwVar.f33655w0.canScrollVertically(-1)) {
                    fwVar.f33654v0.h1(0, 0);
                    return;
                }
                return;
            case 20:
                ((w20) obj).f39816b.a();
                return;
            case 21:
                l30 l30Var = (l30) obj;
                ch0 ch0Var = l30Var.f35496m1;
                if (l30Var.f35497o1) {
                    ch0Var.getAnimatedDrawable().K(0);
                    ch0Var.setAnimation(l30Var.f35498p1);
                    ch0Var.d();
                    return;
                }
                return;
            case 22:
                o40 o40Var = (o40) ((fi.h2) obj).f12127b;
                try {
                    n51 n51Var = o40Var.S;
                    if (n51Var != null && (j20Var = o40Var.R) != null) {
                        long j10 = 0;
                        if (j20Var.f23445b > 0) {
                            long S = n51Var.S();
                            org.telegram.messenger.j20 j20Var2 = o40Var.R;
                            if (S >= j20Var2.f23445b) {
                                n51 n51Var2 = o40Var.S;
                                long j11 = j20Var2.f23443a;
                                if (j11 > 0) {
                                    j10 = j11;
                                }
                                n51Var2.q0(j10, false);
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
                g80 g80Var = (g80) obj;
                g80Var.f33904k = false;
                g80Var.c();
                return;
            case 24:
                o80 o80Var = (o80) obj;
                if (o80Var.d) {
                    o80Var.f36675e = true;
                    o80Var.f36678r = false;
                    o80Var.f36676f = 0.0f;
                    o80Var.h = SystemClock.uptimeMillis();
                    o80Var.invalidate();
                    return;
                }
                return;
            case 25:
                final g90 g90Var = (g90) obj;
                boolean z10 = g90Var.I;
                boolean z11 = !z10;
                jg.o1 o1Var = g90Var.f33914e;
                f90 f90Var = g90Var.f33912b;
                if (f90Var != null && o1Var != null) {
                    if (g90Var.L && (gVar = g90Var.K) != null && gVar.f54144f && !z10) {
                        g90Var.O = 0;
                        return;
                    }
                    boolean g10 = g90Var.g();
                    if (!z10) {
                        f10 = (-g90Var.f33918s) - org.telegram.messenger.g0.L(6.0f);
                    } else {
                        int computeVerticalScrollRange = f90Var.computeVerticalScrollRange();
                        float f12 = (computeVerticalScrollRange - o1Var.h) + g90Var.f33918s;
                        if (computeVerticalScrollRange <= 0 && g90Var.f33915f.K() > 0 && (i11 = g90Var.O) < 3) {
                            g90Var.O = i11 + 1;
                            g90Var.o(true);
                            return;
                        }
                        f10 = f12;
                    }
                    g90Var.O = 0;
                    float f13 = g90Var.f33919w;
                    if (g10) {
                        max = -Math.max(0.0f, f13 - f10);
                    } else {
                        max = Math.max(0.0f, f13 - f10) + (-f13);
                    }
                    if (!z10 && !g10) {
                        max += f90Var.computeVerticalScrollOffset();
                    }
                    final float f14 = max;
                    r1.g gVar2 = g90Var.K;
                    if (gVar2 != null) {
                        gVar2.d();
                    }
                    g90Var.L = z11;
                    final float translationY = f90Var.getTranslationY();
                    final float f15 = g90Var.M;
                    if (!z10) {
                        f11 = 1.0f;
                    }
                    if (translationY == f14) {
                        g90Var.K = null;
                        if (z10) {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (g90Var.N && !z10) {
                            g90Var.N = false;
                            f90Var.setLayoutManager(g90Var.getNeededLayoutManager());
                            g90Var.I = true;
                            g90Var.o(true);
                        }
                    } else {
                        r1.g gVar3 = new r1.g(new r1.f(translationY));
                        r1.h hVar = new r1.h(f14);
                        hVar.a(1.0f);
                        hVar.b(550.0f);
                        gVar3.f54150m = hVar;
                        g90Var.K = gVar3;
                        final float f16 = f11;
                        r1.d dVar = new r1.d() {
                            @Override
                            public final void a(r1.g gVar4, float f17, float f18) {
                                g90 g90Var2 = g90.this;
                                g90Var2.f33912b.setTranslationY(f17);
                                g90Var2.i();
                                float f19 = translationY;
                                g90Var2.M = org.telegram.messenger.g0.T1(f15, f16, (f17 - f19) / (f14 - f19));
                            }
                        };
                        g90Var = g90Var;
                        gVar3.b(dVar);
                        if (!z10) {
                            g90Var.K.a(new fi.g4(g90Var, z11, 2));
                        }
                        g90Var.K.a(new Object());
                        g90Var.K.h();
                    }
                    if (num != null && g90Var.getVisibility() != num.intValue()) {
                        g90Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                g90Var.O = 0;
                return;
            case 26:
                ((ca0) ((u90) obj).T).f32506n.f();
                return;
            case 27:
                ((na0) obj).a();
                return;
            case 28:
                ((fi.u) obj).invalidateSelf();
                return;
            default:
                ((wz) obj).invalidateSelf();
                return;
        }
    }

    public gp(lt ltVar, x70 x70Var, ClickableSpan clickableSpan) {
        this.f34006a = 8;
        this.f34007b = ltVar;
    }
}
