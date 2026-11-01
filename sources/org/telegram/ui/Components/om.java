package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class om implements hk0 {
    public final int f29173a = 1;
    public final org.telegram.ui.ActionBar.p6 f29174b;
    public final Object f29175c;
    public final Object d;
    public final Object e;

    public om(jn jnVar, org.telegram.ui.ActionBar.p6 p6Var, bi biVar, Context context) {
        this.f29175c = jnVar;
        this.f29174b = p6Var;
        this.d = biVar;
        this.e = context;
    }

    @Override
    public final void f(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11 = this.f29173a;
        int i12 = 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f29175c;
        switch (i11) {
            case 0:
                jn jnVar = (jn) obj3;
                bi biVar = (bi) obj2;
                Context context = (Context) obj;
                q30 q30Var = jnVar.D;
                boolean[] zArr = jnVar.L;
                c5.e eVar = jnVar.N0;
                ym ymVar = jnVar.f27516w;
                fg.j jVar = jnVar.f27509r;
                org.telegram.ui.u71 u71Var = jnVar.f27511s;
                int i13 = jnVar.L0;
                org.telegram.ui.ActionBar.p6 p6Var = this.f29174b;
                if (i10 == i13) {
                    lh.g gVar = new lh.g(jnVar.getContext(), p6Var);
                    gVar.f12019c2 = new l2.f(jnVar, 15);
                    ArrayList arrayList = jnVar.P0;
                    gVar.U1 = null;
                    gVar.f12023g2 = new HashSet(arrayList);
                    gVar.show();
                    return;
                } else if (i10 == jnVar.I0) {
                    z60 F = z60.F(biVar.f21590c, p6Var, view);
                    int i14 = 0;
                    while (true) {
                        int[] iArr = jnVar.T0;
                        if (i14 < iArr.length) {
                            int i15 = iArr[i14];
                            g11 a2 = g11.a(i15);
                            int i16 = org.telegram.ui.ActionBar.t6.F8;
                            org.telegram.ui.ActionBar.a7.y(jnVar, a2, i16, p6Var, PorterDuff.Mode.SRC_IN);
                            F.b(0, a2, org.telegram.messenger.dd.G(i15 / 3600, "Hours", new Object[0]), i16, org.telegram.ui.ActionBar.t6.E8, new ag.o0(jnVar, i15, view, 22));
                            i14++;
                        } else {
                            F.c(2131232105, org.telegram.messenger.dd.L0(2131747146, null), new org.telegram.ui.fp((Object) jnVar, (Object) context, (Object) view, (Object) p6Var, 8), false);
                            F.f33045t = false;
                            F.f33044s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i10 == jnVar.f27514u0) {
                    jnVar.S();
                    return;
                } else {
                    boolean z14 = view instanceof org.telegram.ui.Cells.t8;
                    if (z14 || (view instanceof org.telegram.ui.Cells.c6)) {
                        boolean z15 = jnVar.f27480c0;
                        an anVar = jnVar.f27520y;
                        if (anVar != null) {
                            anVar.f();
                        }
                        c5.e[] eVarArr = jnVar.O0;
                        int length = eVarArr.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 < length) {
                                c5.e eVar2 = eVarArr[i17];
                                if (i10 == eVar2.f3775a) {
                                    boolean z16 = eVar2.f3776b;
                                    z11 = !z16;
                                    eVar2.f3776b = z11;
                                    int i18 = eVar.f3775a;
                                    jn jnVar2 = (jn) eVar.f3777c;
                                    fg.j jVar2 = jnVar2.f27509r;
                                    if (i10 == i18) {
                                        u71Var.setItemAnimator(ymVar);
                                        int i19 = eVar.f3775a;
                                        if (i19 >= 0) {
                                            s4.c1 K = jnVar2.f27511s.K(i19);
                                            if (K != null) {
                                                View view2 = K.f47909a;
                                                if (view2 instanceof org.telegram.ui.Cells.c6) {
                                                    ((org.telegram.ui.Cells.c6) view2).setDivider(z11);
                                                }
                                            }
                                            jVar2.g(eVar.f3775a);
                                        }
                                        if (!z16) {
                                            z10 = true;
                                            jVar2.o(eVar.f3775a + 1, 1);
                                        } else {
                                            z10 = true;
                                            jVar2.p(eVar.f3775a + 1, 1);
                                        }
                                        jnVar.l0();
                                    } else {
                                        z10 = true;
                                    }
                                    z12 = z10;
                                } else {
                                    i17++;
                                }
                            } else {
                                z10 = true;
                                z11 = false;
                                z12 = false;
                            }
                        }
                        if (!z12) {
                            if (i10 == jnVar.B0) {
                                z11 = jnVar.f27476a0;
                                jnVar.f27476a0 = !z11;
                                jnVar.U();
                            } else {
                                int i20 = jnVar.f27521y0;
                                if (i10 == i20) {
                                    z11 = !jnVar.f27486f0;
                                    jnVar.f27486f0 = z11;
                                } else if (i10 == jnVar.C0) {
                                    if (!jnVar.f27480c0 && !jnVar.f27476a0) {
                                        jnVar.T ^= z10;
                                    }
                                    z11 = jnVar.T;
                                } else if (i10 == jnVar.E0) {
                                    z11 = !jnVar.S;
                                    jnVar.S = z11;
                                } else if (i10 == jnVar.H0) {
                                    if (jnVar.U == 0 && jnVar.V == 0) {
                                        jnVar.U = 86400;
                                        jnVar.V = 0;
                                        int i21 = jnVar.I0;
                                        jnVar.l0();
                                        if (i21 < 0) {
                                            s4.c1 K2 = u71Var.K(jnVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.f47909a;
                                                if (view3 instanceof org.telegram.ui.Cells.c6) {
                                                    ((org.telegram.ui.Cells.c6) view3).setDivider(z10);
                                                }
                                            }
                                            u71Var.setItemAnimator(ymVar);
                                            jVar.o(jnVar.I0, 3);
                                        }
                                    } else {
                                        jnVar.U = 0;
                                        jnVar.V = 0;
                                        int i22 = jnVar.I0;
                                        jnVar.l0();
                                        u71Var.setItemAnimator(ymVar);
                                        jVar.p(i22, 3);
                                        s4.c1 K3 = u71Var.K(jnVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.f47909a;
                                            if (view4 instanceof org.telegram.ui.Cells.c6) {
                                                ((org.telegram.ui.Cells.c6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (jnVar.U == 0 && jnVar.V == 0) {
                                        z13 = false;
                                    } else {
                                        z13 = z10;
                                    }
                                    z11 = z13;
                                } else if (i10 == jnVar.D0) {
                                    z11 = !jnVar.R;
                                    jnVar.R = z11;
                                } else if (i10 == jnVar.f27522z0) {
                                    z11 = jnVar.f27488g0 ^ z10;
                                    jnVar.f27488g0 = z11;
                                    jnVar.l0();
                                    int i23 = jnVar.f27521y0;
                                    if (i23 >= 0 && i20 < 0) {
                                        u71Var.setItemAnimator(ymVar);
                                        jVar.i(jnVar.f27521y0);
                                    } else if (i20 >= 0 && i23 < 0) {
                                        u71Var.setItemAnimator(ymVar);
                                        jVar.s(i20);
                                    }
                                } else if (i10 == jnVar.F0) {
                                    boolean z17 = jnVar.f27478b0;
                                    z11 = !z17;
                                    jnVar.f27478b0 = z11;
                                    if (z17 && jnVar.f27480c0) {
                                        boolean z18 = false;
                                        for (int i24 = 0; i24 < zArr.length; i24++) {
                                            if (z18) {
                                                zArr[i24] = false;
                                            } else if (zArr[i24]) {
                                                z18 = z10;
                                            }
                                        }
                                    }
                                    int childCount = u71Var.getChildCount();
                                    for (int i25 = 0; i25 < childCount; i25++) {
                                        s4.c1 T = u71Var.T(u71Var.getChildAt(i25));
                                        if (T.f47912f == 5) {
                                            ((org.telegram.ui.Cells.e6) T.f47909a).f21859a.a(jnVar.f27478b0, z10);
                                        }
                                    }
                                } else if (i10 == jnVar.J0) {
                                    z11 = !jnVar.W;
                                    jnVar.W = z11;
                                } else if (i10 == jnVar.G0) {
                                    if (!jnVar.f27484e0) {
                                        u71Var.setItemAnimator(ymVar);
                                        z11 = !jnVar.f27480c0;
                                        jnVar.f27480c0 = z11;
                                        int i26 = jnVar.f27503o0;
                                        jnVar.l0();
                                        if (jnVar.f27480c0) {
                                            jVar.o(jnVar.f27503o0, 3);
                                        } else {
                                            jVar.p(i26, 3);
                                        }
                                        jVar.g(jnVar.A0);
                                        if (jnVar.f27480c0) {
                                            jnVar.R = false;
                                            int i27 = jnVar.D0;
                                            if (i27 >= 0) {
                                                s4.c1 K4 = u71Var.K(i27);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.c6) K4.f47909a).setChecked(false);
                                                } else {
                                                    jVar.g(jnVar.D0);
                                                }
                                            }
                                        } else {
                                            int i28 = jnVar.D0;
                                            if (i28 >= 0 && u71Var.K(i28) == null) {
                                                jVar.g(jnVar.D0);
                                            }
                                        }
                                        jnVar.U();
                                        if (jnVar.f27480c0 && !jnVar.f27478b0) {
                                            boolean z19 = false;
                                            for (int i29 = 0; i29 < zArr.length; i29++) {
                                                if (z19) {
                                                    zArr[i29] = false;
                                                } else if (zArr[i29]) {
                                                    z19 = z10;
                                                }
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                        if (jnVar.f27482d0 && !jnVar.f27480c0) {
                            u71Var.getChildCount();
                            q30Var.b(z10);
                        }
                        for (int i30 = jnVar.f27513t0; i30 < jnVar.f27513t0 + jnVar.M; i30++) {
                            s4.c1 K5 = u71Var.K(i30);
                            if (K5 != null) {
                                View view5 = K5.f47909a;
                                if (view5 instanceof org.telegram.ui.Cells.e6) {
                                    org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view5;
                                    e6Var.m(jnVar.f27480c0, z10);
                                    e6Var.f21864r.a(zArr[i30 - jnVar.f27513t0], z15);
                                    if (e6Var.getTop() > org.telegram.messenger.i0.L(40.0f) && i10 == jnVar.G0 && !jnVar.f27482d0) {
                                        q30Var.setText(org.telegram.messenger.dd.L0(2131747170, null));
                                        q30Var.f(e6Var.getCheckBox(), z10);
                                        jnVar.f27482d0 = z10;
                                    }
                                }
                            }
                        }
                        if (z14) {
                            ((org.telegram.ui.Cells.t8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.c6) {
                            ((org.telegram.ui.Cells.c6) view).setChecked(z11);
                        }
                        jnVar.W();
                        return;
                    }
                    return;
                }
                break;
            default:
                cv cvVar = (cv) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                ou ouVar = cvVar.l1;
                if (arrayList2 != null && arrayList2.size() > 1) {
                    if (SystemClock.elapsedRealtime() - cvVar.H1 >= 250) {
                        int i31 = 0;
                        while (true) {
                            ArrayList[] arrayListArr = ouVar.f24576c;
                            if (i12 < arrayListArr.length) {
                                int size = arrayListArr[i12].size();
                                if (ouVar.f24576c.length > 1) {
                                    size = Math.min(cvVar.f25253u1.J * 2, size);
                                }
                                i31 += size + 2;
                                if (i10 >= i31) {
                                    i12++;
                                }
                            }
                        }
                        ArrayList arrayList3 = ouVar.f24575b;
                        if (arrayList3 != null && i12 < arrayList3.size()) {
                            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) ouVar.f24575b.get(i12);
                        }
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            ArrayList arrayList4 = new ArrayList();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                            tL_inputStickerSetID.f19814id = stickerSet.f19821id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            arrayList4.add(tL_inputStickerSetID);
                            new pu(cvVar, k2Var, cvVar.getContext(), this.f29174b, arrayList4).show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.k1 k1Var = cvVar.f25256x1;
                if (k1Var != null) {
                    k1Var.d(true);
                    cvVar.f25256x1 = null;
                    return;
                } else if ((k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).Z.getVisibility() == 0 && (view instanceof vu)) {
                    o5 o5Var = ((vu) view).f31907c;
                    try {
                        TLRPC.Document document = o5Var.document;
                        if (document == null) {
                            document = f5.e(cvVar.f21584a, o5Var.getDocumentId());
                        }
                        SpannableString spannableString = new SpannableString(org.telegram.messenger.kj.U(document));
                        spannableString.setSpan(o5Var, 0, spannableString.length(), 33);
                        ((org.telegram.ui.un) k2Var).Z.E0.getText().append((CharSequence) spannableString);
                        cvVar.L0();
                        cvVar.dismiss();
                    } catch (Exception unused) {
                    }
                    try {
                        view.performHapticFeedback(3, 1);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public om(cv cvVar, ArrayList arrayList, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f29175c = cvVar;
        this.d = arrayList;
        this.e = k2Var;
        this.f29174b = p6Var;
    }
}
