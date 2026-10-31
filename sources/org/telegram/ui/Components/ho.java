package org.telegram.ui.Components;

import android.os.SystemClock;
import android.text.style.ClickableSpan;
import android.util.SparseIntArray;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class ho implements Runnable {
    public final int f26783a;
    public final Object f26784b;

    public ho(Object obj, int i10) {
        this.f26783a = i10;
        this.f26784b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        fe.b bVar;
        int i10;
        int i11;
        org.telegram.messenger.x20 x20Var;
        float f7;
        int i12;
        float max;
        final y90 y90Var;
        o1.j jVar;
        int i13 = this.f26783a;
        float f10 = 0.0f;
        int i14 = 8;
        Integer num = null;
        Object obj = this.f26784b;
        switch (i13) {
            case 0:
                ((io) obj).setVisibility(8);
                return;
            case 1:
                ((gp) obj).f26489b.a();
                return;
            case 2:
                ((sp) obj).dismiss();
                return;
            case 3:
                ((gq) obj).a();
                return;
            case 4:
                ((org.telegram.ui.ActionBar.z2) obj).dismiss();
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    return;
                }
                return;
            case 5:
                yq yqVar = ((xq) obj).f32532c;
                TLRPC.Peer peer = yqVar.V1;
                org.telegram.ui.ActionBar.k2 k2Var = yqVar.X1;
                long j10 = yqVar.Y1;
                if (yqVar.Q1.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cr crVar = new cr(k2Var, peer, j10, z10, yqVar.P1);
                if (k2Var.getParentActivity() != null) {
                    k2Var.showDialog(crVar);
                    return;
                } else {
                    crVar.show();
                    return;
                }
            case 6:
                ((vh.d) obj).setLoading(true);
                return;
            case 7:
                xr xrVar = (xr) obj;
                xrVar.f32536a.a(!bVar.f7021f, true);
                org.telegram.messenger.i0.h3(xrVar.f32539f, 3000L);
                return;
            case 8:
                ((bn0) obj).W(false);
                return;
            case 9:
                ((ys) obj).a();
                return;
            case 10:
                ((xt) obj).getClass();
                return;
            case 11:
                gf.f.r(((hu) ((ji.i) obj).f10446b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 12:
                hu huVar = ((gu) obj).f26523a;
                huVar.f26816o1.setVisibility(4);
                huVar.f26815n1.setVisibility(4);
                ImageView imageView = huVar.f26821t1;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 13:
                ((yu) obj).a(true, true);
                return;
            case 14:
                tw twVar = (tw) obj;
                if (twVar.Z.getEmojiView() != null) {
                    vy emojiView = twVar.Z.getEmojiView();
                    if (!emojiView.f31874f0) {
                        try {
                            SparseIntArray sparseIntArray = emojiView.R.f25883s;
                            char[] cArr = org.telegram.messenger.l6.f16694a;
                            int i15 = sparseIntArray.get(8);
                            if (i15 > 0) {
                                emojiView.P.C0();
                                emojiView.V(i15);
                                emojiView.H(i15, org.telegram.messenger.i0.L(-9.0f));
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
                mx mxVar = (mx) obj;
                mxVar.f28625x.f27115f = true;
                mxVar.a(true);
                return;
            case 16:
                org.telegram.messenger.i0.U3(((iy) obj).h, true, true);
                return;
            case 17:
                py pyVar = (py) obj;
                ArrayList arrayList = pyVar.f29457r;
                ArrayList arrayList2 = pyVar.h;
                qy qyVar = pyVar.f29460x;
                int i16 = qyVar.M;
                vy vyVar = qyVar.Q;
                bw bwVar = vyVar.D0;
                if (i16 == pyVar.f29453b) {
                    arrayList2.remove(arrayList);
                    qyVar.E = pyVar.f29454c;
                    qyVar.F = pyVar.d;
                    qyVar.G = pyVar.e;
                    qyVar.H = pyVar.f29455f;
                    qyVar.I = arrayList2;
                    qyVar.J = pyVar.f29456n;
                    qyVar.K = new ArrayList(arrayList);
                    vyVar.G0.e(false);
                    s4.g0 adapter = bwVar.getAdapter();
                    qy qyVar2 = vyVar.f31938z0;
                    if (adapter != qyVar2) {
                        bwVar.setAdapter(qyVar2);
                    }
                    qyVar.f();
                    return;
                }
                return;
            case 18:
                tz tzVar = (tz) ((sz) obj).f30386f;
                ArrayList arrayList3 = tzVar.h;
                if (!org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).q()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((pz) arrayList3.get(i17)).e && i17 != 0) {
                            fg.j jVar2 = tzVar.I;
                            tz tzVar2 = (tz) jVar2.e;
                            ArrayList arrayList4 = tzVar2.h;
                            SparseIntArray sparseIntArray2 = tzVar2.f30715k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList S0 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).S0();
                                int i18 = sparseIntArray2.get(i17);
                                int i19 = ((pz) arrayList4.get(i17)).f29471a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray2.put(i20 + 1, sparseIntArray2.get(i20));
                                }
                                org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) S0.remove(i17);
                                apVar.f14648f = 0;
                                S0.add(0, apVar);
                                sparseIntArray2.put(0, i18);
                                arrayList4.add(0, (pz) arrayList4.remove(i17));
                                ((pz) arrayList4.get(0)).f29471a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((pz) arrayList4.get(i21)).f29471a = i21;
                                    ((org.telegram.messenger.ap) S0.get(i21)).f14648f = i21;
                                }
                                for (int i22 = 0; i22 <= i17; i22++) {
                                    if (tzVar2.K == i22) {
                                        if (i22 == i17) {
                                            i11 = 0;
                                        } else {
                                            i11 = i22 + 1;
                                        }
                                        tzVar2.L = i11;
                                        tzVar2.K = i11;
                                    }
                                    if (tzVar2.f30721q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        tzVar2.f30723r0 = i10;
                                        tzVar2.f30721q0 = i10;
                                    }
                                }
                                jVar2.j(i17, 0);
                                oz ozVar = tzVar2.J;
                                int i23 = ((pz) arrayList4.get(i17)).f29471a;
                                org.telegram.ui.rx rxVar = (org.telegram.ui.rx) ozVar;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.zx[] zxVarArr = rxVar.f41307b.f35794e0;
                                    if (i24 < zxVarArr.length) {
                                        org.telegram.ui.zx zxVar = zxVarArr[i24];
                                        int i25 = zxVar.h;
                                        if (i25 == i23) {
                                            zxVar.h = i19;
                                        } else if (i25 == i19) {
                                            zxVar.h = i23;
                                        }
                                        i24++;
                                    } else {
                                        tzVar2.j();
                                        tzVar2.D = true;
                                        tzVar2.F.setItemAnimator(tzVar2.f30725s0);
                                    }
                                }
                            }
                            tzVar.F.v0(0);
                            org.telegram.ui.qx qxVar = (org.telegram.ui.qx) tzVar;
                            org.telegram.ui.ay ayVar = qxVar.B0;
                            if (!ayVar.getMessagesController().A3()) {
                                try {
                                    qxVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                wb J = cc.a0(ayVar).J(2131624017, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131748954, org.telegram.messenger.cd.L0(2131750808, null))), org.telegram.messenger.cd.L0(2131747048, null), 5000, false, new org.telegram.ui.rh(qxVar, 25));
                                J.k(true);
                                ayVar.f35846o3 = J;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 19:
                xz xzVar = (xz) obj;
                if (!xzVar.f32571c) {
                    xzVar.setLayerType(0, null);
                    return;
                }
                return;
            case 20:
                ((g20) obj).g(true);
                return;
            case 21:
                org.telegram.ui.kx kxVar = ((xm0) ((m30) obj)).f32510e0;
                if (!kxVar.f26469w0.canScrollVertically(-1)) {
                    kxVar.f26468v0.h1(0, 0);
                    return;
                }
                return;
            case 22:
                ((o30) obj).f28965b.b(true);
                return;
            case 23:
                ((o30) obj).f28965b.b(true);
                return;
            case 24:
                d40 d40Var = (d40) obj;
                ei0 ei0Var = d40Var.f25282m1;
                if (d40Var.f25284o1) {
                    ei0Var.getAnimatedDrawable().K(0);
                    ei0Var.setAnimation(d40Var.f25285p1);
                    ei0Var.d();
                    return;
                }
                return;
            case 25:
                e50 e50Var = (e50) ((e6.r) obj).f6309b;
                try {
                    u61 u61Var = e50Var.S;
                    if (u61Var != null && (x20Var = e50Var.R) != null) {
                        long j11 = 0;
                        if (x20Var.f19185b > 0) {
                            long S = u61Var.S();
                            org.telegram.messenger.x20 x20Var2 = e50Var.R;
                            if (S >= x20Var2.f19185b) {
                                u61 u61Var2 = e50Var.S;
                                long j12 = x20Var2.f19183a;
                                if (j12 > 0) {
                                    j11 = j12;
                                }
                                u61Var2.q0(j11, false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 26:
                z80 z80Var = (z80) obj;
                z80Var.f32981k = false;
                z80Var.c();
                return;
            case 27:
                h90 h90Var = (h90) obj;
                if (h90Var.d) {
                    h90Var.e = true;
                    h90Var.f26662r = false;
                    h90Var.f26660f = 0.0f;
                    h90Var.h = SystemClock.uptimeMillis();
                    h90Var.invalidate();
                    return;
                }
                return;
            case 28:
                y90 y90Var2 = (y90) obj;
                boolean z11 = y90Var2.I;
                boolean z12 = !z11;
                zf.c1 c1Var = y90Var2.e;
                x90 x90Var = y90Var2.f32665b;
                if (x90Var != null && c1Var != null) {
                    if (y90Var2.L && (jVar = y90Var2.K) != null && jVar.f13951f && !z11) {
                        y90Var2.O = 0;
                        return;
                    }
                    boolean g10 = y90Var2.g();
                    if (!z11) {
                        f7 = (-y90Var2.f32670s) - org.telegram.messenger.i0.L(6.0f);
                    } else {
                        int computeVerticalScrollRange = x90Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - c1Var.h) + y90Var2.f32670s;
                        if (computeVerticalScrollRange <= 0 && y90Var2.f32667f.K() > 0 && (i12 = y90Var2.O) < 3) {
                            y90Var2.O = i12 + 1;
                            y90Var2.o(true);
                            return;
                        }
                        f7 = f11;
                    }
                    y90Var2.O = 0;
                    float f12 = y90Var2.f32671w;
                    if (g10) {
                        max = -Math.max(0.0f, f12 - f7);
                    } else {
                        max = Math.max(0.0f, f12 - f7) + (-f12);
                    }
                    if (!z11 && !g10) {
                        max += x90Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    o1.j jVar3 = y90Var2.K;
                    if (jVar3 != null) {
                        jVar3.d();
                    }
                    y90Var2.L = z12;
                    final float translationY = x90Var.getTranslationY();
                    final float f14 = y90Var2.M;
                    if (!z11) {
                        f10 = 1.0f;
                    }
                    if (translationY == f13) {
                        y90Var2.K = null;
                        if (z11) {
                            i14 = 0;
                        }
                        num = Integer.valueOf(i14);
                        if (y90Var2.N && !z11) {
                            y90Var2.N = false;
                            x90Var.setLayoutManager(y90Var2.getNeededLayoutManager());
                            y90Var2.I = true;
                            y90Var2.o(true);
                        }
                        y90Var = y90Var2;
                    } else {
                        o1.j jVar4 = new o1.j(new o1.i(translationY));
                        o1.k kVar = new o1.k(f13);
                        kVar.a(1.0f);
                        kVar.b(550.0f);
                        jVar4.f13957m = kVar;
                        y90Var2.K = jVar4;
                        y90Var = y90Var2;
                        final float f15 = f10;
                        jVar4.b(new o1.g() {
                            @Override
                            public final void a(o1.j jVar5, float f16, float f17) {
                                y90 y90Var3 = y90.this;
                                y90Var3.f32665b.setTranslationY(f16);
                                y90Var3.i();
                                float f18 = translationY;
                                y90Var3.M = org.telegram.messenger.i0.T1(f14, f15, (f16 - f18) / (f13 - f18));
                            }
                        });
                        if (!z11) {
                            y90Var.K.a(new jg.u(y90Var, z12, 2));
                        }
                        y90Var.K.a(new Object());
                        y90Var.K.h();
                    }
                    if (num != null && y90Var.getVisibility() != num.intValue()) {
                        y90Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                y90Var2.O = 0;
                return;
            default:
                ((ua0) ((jg.g1) obj).T).f30883n.f();
                return;
        }
    }

    public ho(xt xtVar, q80 q80Var, ClickableSpan clickableSpan) {
        this.f26783a = 10;
        this.f26784b = xtVar;
    }
}
