package org.telegram.ui.Components;

import android.os.SystemClock;
import android.text.style.ClickableSpan;
import android.util.SparseIntArray;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class fo implements Runnable {
    public final int f34661a;
    public final Object f34662b;

    public fo(Object obj, int i7) {
        this.f34661a = i7;
        this.f34662b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        te.a aVar;
        int i7;
        int i10;
        org.telegram.messenger.g20 g20Var;
        float f10;
        int i11;
        float max;
        r1.g gVar;
        int i12 = this.f34661a;
        float f11 = 0.0f;
        int i13 = 8;
        Integer num = null;
        Object obj = this.f34662b;
        switch (i12) {
            case 0:
                ((ho) obj).u();
                return;
            case 1:
                ((jo) obj).setVisibility(8);
                return;
            case 2:
                ((tp) obj).dismiss();
                return;
            case 3:
                ((a5.h) obj).a();
                return;
            case 4:
                ((org.telegram.ui.ActionBar.u2) obj).dismiss();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    return;
                }
                return;
            case 5:
                vq vqVar = ((uq) obj).f40145c;
                TLRPC.Peer peer = vqVar.Z1;
                org.telegram.ui.ActionBar.e2 e2Var = vqVar.f41127b2;
                long j3 = vqVar.f41128c2;
                if (vqVar.U1.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ar arVar = new ar(e2Var, peer, j3, z10, vqVar.T1);
                if (e2Var.getParentActivity() != null) {
                    e2Var.showDialog(arVar);
                    return;
                } else {
                    arVar.show();
                    return;
                }
            case 6:
                ((hi.d) obj).setLoading(true);
                return;
            case 7:
                tr trVar = (tr) obj;
                trVar.f39785a.a(!aVar.f57082f, true);
                org.telegram.messenger.g0.i3(trVar.f39789f, 3000L);
                return;
            case 8:
                ((em0) obj).W(false);
                return;
            case 9:
                ((ts) obj).a();
                return;
            case 10:
                ((st) obj).getClass();
                return;
            case 11:
                vf.c.t(((bu) ((org.telegram.ui.n1) obj).f49358b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 12:
                bu buVar = ((au) obj).f33061a;
                buVar.f33381s1.setVisibility(4);
                buVar.f33380r1.setVisibility(4);
                ImageView imageView = buVar.f33386x1;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 13:
                ((su) obj).a(true, true);
                return;
            case 14:
                kw kwVar = (kw) obj;
                if (kwVar.f45118a0.getEmojiView() != null) {
                    ly emojiView = kwVar.f45118a0.getEmojiView();
                    if (!emojiView.f36950g0) {
                        try {
                            SparseIntArray sparseIntArray = emojiView.S.f41167s;
                            char[] cArr = org.telegram.messenger.k6.f24639a;
                            int i14 = sparseIntArray.get(8);
                            if (i14 > 0) {
                                emojiView.Q.C0();
                                emojiView.V(i14);
                                emojiView.H(i14, org.telegram.messenger.g0.L(-9.0f));
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
                dx dxVar = (dx) obj;
                dxVar.f34094x.f42434f = true;
                dxVar.a(true);
                return;
            case 16:
                org.telegram.messenger.g0.U3(((yx) obj).h, true, true);
                return;
            case 17:
                fy fyVar = (fy) obj;
                ArrayList arrayList = fyVar.f34741r;
                ArrayList arrayList2 = fyVar.h;
                gy gyVar = fyVar.f34744x;
                int i15 = gyVar.N;
                ly lyVar = gyVar.R;
                vv vvVar = lyVar.E0;
                if (i15 == fyVar.f34736b) {
                    arrayList2.remove(arrayList);
                    gyVar.F = fyVar.f34737c;
                    gyVar.G = fyVar.d;
                    gyVar.H = fyVar.f34738e;
                    gyVar.I = fyVar.f34739f;
                    gyVar.J = arrayList2;
                    gyVar.K = fyVar.f34740n;
                    gyVar.L = new ArrayList(arrayList);
                    lyVar.H0.e(false);
                    v4.h0 adapter = vvVar.getAdapter();
                    gy gyVar2 = lyVar.A0;
                    if (adapter != gyVar2) {
                        vvVar.setAdapter(gyVar2);
                    }
                    gyVar.f();
                    return;
                }
                return;
            case 18:
                iz izVar = (iz) ((hz) obj).f35378f;
                ArrayList arrayList3 = izVar.h;
                if (!org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24934t0).q()) {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        if (((fz) arrayList3.get(i16)).f34751e && i16 != 0) {
                            org.telegram.ui.l4 l4Var = izVar.J;
                            iz izVar2 = (iz) l4Var.f48827e;
                            ArrayList arrayList4 = izVar2.h;
                            SparseIntArray sparseIntArray2 = izVar2.f35797l0;
                            int size = arrayList4.size();
                            if (i16 >= 0 && i16 < size) {
                                ArrayList T0 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).T0();
                                int i17 = sparseIntArray2.get(i16);
                                int i18 = ((fz) arrayList4.get(i16)).f34748a;
                                for (int i19 = i16 - 1; i19 >= 0; i19--) {
                                    sparseIntArray2.put(i19 + 1, sparseIntArray2.get(i19));
                                }
                                org.telegram.messenger.so soVar = (org.telegram.messenger.so) T0.remove(i16);
                                soVar.f26546f = 0;
                                T0.add(0, soVar);
                                sparseIntArray2.put(0, i17);
                                arrayList4.add(0, (fz) arrayList4.remove(i16));
                                ((fz) arrayList4.get(0)).f34748a = i18;
                                for (int i20 = 0; i20 <= i16; i20++) {
                                    ((fz) arrayList4.get(i20)).f34748a = i20;
                                    ((org.telegram.messenger.so) T0.get(i20)).f26546f = i20;
                                }
                                for (int i21 = 0; i21 <= i16; i21++) {
                                    if (izVar2.L == i21) {
                                        if (i21 == i16) {
                                            i10 = 0;
                                        } else {
                                            i10 = i21 + 1;
                                        }
                                        izVar2.M = i10;
                                        izVar2.L = i10;
                                    }
                                    if (izVar2.f35804r0 == i21) {
                                        if (i21 == i16) {
                                            i7 = 0;
                                        } else {
                                            i7 = i21 + 1;
                                        }
                                        izVar2.f35806s0 = i7;
                                        izVar2.f35804r0 = i7;
                                    }
                                }
                                l4Var.j(i16, 0);
                                ez ezVar = izVar2.K;
                                int i22 = ((fz) arrayList4.get(i16)).f34748a;
                                org.telegram.ui.pw pwVar = (org.telegram.ui.pw) ezVar;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.xw[] xwVarArr = pwVar.f50385b.f53673f0;
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
                                        izVar2.j();
                                        izVar2.E = true;
                                        izVar2.G.setItemAnimator(izVar2.f35807t0);
                                    }
                                }
                            }
                            izVar.G.v0(0);
                            org.telegram.ui.ow owVar = (org.telegram.ui.ow) izVar;
                            org.telegram.ui.yw ywVar = owVar.C0;
                            if (!ywVar.getMessagesController().D3()) {
                                try {
                                    owVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                xb J = cc.a0(ywVar).J(2131624018, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131748944, org.telegram.messenger.hd.M0(2131750807, null))), org.telegram.messenger.hd.M0(2131747033, null), 5000, false, new org.telegram.ui.bh(owVar, 24));
                                J.k(true);
                                ywVar.f53727q3 = J;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 19:
                nz nzVar = (nz) obj;
                if (!nzVar.f37763c) {
                    nzVar.setLayerType(0, null);
                    return;
                }
                return;
            case 20:
                ((s10) obj).h(true);
                return;
            case 21:
                org.telegram.ui.hw hwVar = ((am0) ((x20) obj)).f33021f0;
                if (!hwVar.f36068x0.canScrollVertically(-1)) {
                    hwVar.f36067w0.h1(0, 0);
                    return;
                }
                return;
            case 22:
                ((z20) obj).f42218b.a();
                return;
            case 23:
                o30 o30Var = (o30) obj;
                fh0 fh0Var = o30Var.f37837q1;
                if (o30Var.f37839s1) {
                    fh0Var.getAnimatedDrawable().K(0);
                    fh0Var.setAnimation(o30Var.f37840t1);
                    fh0Var.d();
                    return;
                }
                return;
            case 24:
                r40 r40Var = (r40) ((h6.r) obj).f13634b;
                try {
                    u51 u51Var = r40Var.T;
                    if (u51Var != null && (g20Var = r40Var.S) != null) {
                        long j10 = 0;
                        if (g20Var.f23634b > 0) {
                            long S = u51Var.S();
                            org.telegram.messenger.g20 g20Var2 = r40Var.S;
                            if (S >= g20Var2.f23634b) {
                                u51 u51Var2 = r40Var.T;
                                long j11 = g20Var2.f23632a;
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
            case 25:
                j80 j80Var = (j80) obj;
                j80Var.f35920k = false;
                j80Var.c();
                return;
            case 26:
                r80 r80Var = (r80) obj;
                if (r80Var.d) {
                    r80Var.f38899e = true;
                    r80Var.f38902r = false;
                    r80Var.f38900f = 0.0f;
                    r80Var.h = SystemClock.uptimeMillis();
                    r80Var.invalidate();
                    return;
                }
                return;
            case 27:
                final i90 i90Var = (i90) obj;
                boolean z11 = i90Var.J;
                boolean z12 = !z11;
                jg.n1 n1Var = i90Var.f35522e;
                h90 h90Var = i90Var.f35520b;
                if (h90Var != null && n1Var != null) {
                    if (i90Var.M && (gVar = i90Var.L) != null && gVar.f55742f && !z11) {
                        i90Var.P = 0;
                        return;
                    }
                    boolean g10 = i90Var.g();
                    if (!z11) {
                        f10 = (-i90Var.f35526s) - org.telegram.messenger.g0.L(6.0f);
                    } else {
                        int computeVerticalScrollRange = h90Var.computeVerticalScrollRange();
                        float f12 = (computeVerticalScrollRange - n1Var.h) + i90Var.f35526s;
                        if (computeVerticalScrollRange <= 0 && i90Var.f35523f.K() > 0 && (i11 = i90Var.P) < 3) {
                            i90Var.P = i11 + 1;
                            i90Var.o(true);
                            return;
                        }
                        f10 = f12;
                    }
                    i90Var.P = 0;
                    float f13 = i90Var.f35527w;
                    if (g10) {
                        max = -Math.max(0.0f, f13 - f10);
                    } else {
                        max = Math.max(0.0f, f13 - f10) + (-f13);
                    }
                    if (!z11 && !g10) {
                        max += h90Var.computeVerticalScrollOffset();
                    }
                    final float f14 = max;
                    r1.g gVar2 = i90Var.L;
                    if (gVar2 != null) {
                        gVar2.d();
                    }
                    i90Var.M = z12;
                    final float translationY = h90Var.getTranslationY();
                    final float f15 = i90Var.N;
                    if (!z11) {
                        f11 = 1.0f;
                    }
                    if (translationY == f14) {
                        i90Var.L = null;
                        if (z11) {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (i90Var.O && !z11) {
                            i90Var.O = false;
                            h90Var.setLayoutManager(i90Var.getNeededLayoutManager());
                            i90Var.J = true;
                            i90Var.o(true);
                        }
                    } else {
                        r1.g gVar3 = new r1.g(new r1.f(translationY));
                        r1.h hVar = new r1.h(f14);
                        hVar.a(1.0f);
                        hVar.b(550.0f);
                        gVar3.f55748m = hVar;
                        i90Var.L = gVar3;
                        final float f16 = f11;
                        r1.d dVar = new r1.d() {
                            @Override
                            public final void a(r1.g gVar4, float f17, float f18) {
                                i90 i90Var2 = i90.this;
                                i90Var2.f35520b.setTranslationY(f17);
                                i90Var2.i();
                                float f19 = translationY;
                                i90Var2.N = org.telegram.messenger.g0.T1(f15, f16, (f17 - f19) / (f14 - f19));
                            }
                        };
                        i90Var = i90Var;
                        gVar3.b(dVar);
                        if (!z11) {
                            i90Var.L.a(new hi.c4(i90Var, z12, 2));
                        }
                        i90Var.L.a(new Object());
                        i90Var.L.h();
                    }
                    if (num != null && i90Var.getVisibility() != num.intValue()) {
                        i90Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                i90Var.P = 0;
                return;
            case 28:
                ((da0) ((v90) obj).T).f33903n.f();
                return;
            default:
                ((oa0) obj).a();
                return;
        }
    }

    public fo(st stVar, a80 a80Var, ClickableSpan clickableSpan) {
        this.f34661a = 10;
        this.f34662b = stVar;
    }
}
