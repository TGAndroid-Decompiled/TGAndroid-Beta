package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class vm implements qj0 {
    public final int f40738a = 1;
    public final org.telegram.ui.ActionBar.i6 f40739b;
    public final Object f40740c;
    public final Object d;
    public final Object f40741e;

    public vm(qn qnVar, org.telegram.ui.ActionBar.i6 i6Var, ti tiVar, Context context) {
        this.f40740c = qnVar;
        this.f40739b = i6Var;
        this.d = tiVar;
        this.f40741e = context;
    }

    @Override
    public final void b(int i7, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10 = this.f40738a;
        int i11 = 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        Object obj = this.f40741e;
        Object obj2 = this.d;
        Object obj3 = this.f40740c;
        switch (i10) {
            case 0:
                qn qnVar = (qn) obj3;
                ti tiVar = (ti) obj2;
                Context context = (Context) obj;
                j30 j30Var = qnVar.E;
                boolean[] zArr = qnVar.M;
                bg.w0 w0Var = qnVar.O0;
                fn fnVar = qnVar.f38949w;
                org.telegram.ui.l4 l4Var = qnVar.f38941r;
                org.telegram.ui.d61 d61Var = qnVar.f38944s;
                int i12 = qnVar.M0;
                org.telegram.ui.ActionBar.i6 i6Var = this.f40739b;
                if (i7 == i12) {
                    vh.g gVar = new vh.g(qnVar.getContext(), i6Var);
                    gVar.f59697g2 = new j6.r(qnVar, 27);
                    ArrayList arrayList = qnVar.Q0;
                    gVar.Y1 = null;
                    gVar.f59701k2 = new HashSet(arrayList);
                    gVar.show();
                    return;
                } else if (i7 == qnVar.J0) {
                    x60 G = x60.G(tiVar.f30229c, i6Var, view);
                    int i13 = 0;
                    while (true) {
                        int[] iArr = qnVar.U0;
                        if (i13 < iArr.length) {
                            int i14 = iArr[i13];
                            k01 a10 = k01.a(i14);
                            int i15 = org.telegram.ui.ActionBar.n6.F8;
                            org.telegram.ui.ActionBar.u6.x(qnVar, a10, i15, i6Var, PorterDuff.Mode.SRC_IN);
                            G.b(0, a10, org.telegram.messenger.gd.G(i14 / 3600, "Hours", new Object[0]), i15, org.telegram.ui.ActionBar.n6.E8, new org.telegram.ui.f0(qnVar, i14, view, 8));
                            i13++;
                        } else {
                            G.c(2131232111, org.telegram.messenger.gd.N0(2131746937, null), new oi.h(qnVar, context, view, i6Var, 26), false);
                            G.f41894t = false;
                            G.f41892s = 0;
                            G.a0();
                            return;
                        }
                    }
                } else if (i7 == qnVar.f38948v0) {
                    qnVar.U();
                    return;
                } else {
                    boolean z14 = view instanceof org.telegram.ui.Cells.r8;
                    if (z14 || (view instanceof org.telegram.ui.Cells.y5)) {
                        boolean z15 = qnVar.f38915d0;
                        hn hnVar = qnVar.f38953y;
                        if (hnVar != null) {
                            hnVar.f();
                        }
                        bg.w0[] w0VarArr = qnVar.P0;
                        int length = w0VarArr.length;
                        int i16 = 0;
                        while (true) {
                            if (i16 < length) {
                                bg.w0 w0Var2 = w0VarArr[i16];
                                if (i7 == w0Var2.f3325b) {
                                    boolean z16 = w0Var2.f3324a;
                                    z11 = !z16;
                                    w0Var2.f3324a = z11;
                                    int i17 = w0Var.f3325b;
                                    qn qnVar2 = (qn) w0Var.f3326c;
                                    org.telegram.ui.l4 l4Var2 = qnVar2.f38941r;
                                    if (i7 == i17) {
                                        d61Var.setItemAnimator(fnVar);
                                        int i18 = w0Var.f3325b;
                                        if (i18 >= 0) {
                                            v4.f1 K = qnVar2.f38944s.K(i18);
                                            if (K != null) {
                                                View view2 = K.f59245a;
                                                if (view2 instanceof org.telegram.ui.Cells.y5) {
                                                    ((org.telegram.ui.Cells.y5) view2).setDivider(z11);
                                                }
                                            }
                                            l4Var2.g(w0Var.f3325b);
                                        }
                                        if (!z16) {
                                            z10 = true;
                                            l4Var2.o(w0Var.f3325b + 1, 1);
                                        } else {
                                            z10 = true;
                                            l4Var2.p(w0Var.f3325b + 1, 1);
                                        }
                                        qnVar.n0();
                                    } else {
                                        z10 = true;
                                    }
                                    z12 = z10;
                                } else {
                                    i16++;
                                }
                            } else {
                                z10 = true;
                                z11 = false;
                                z12 = false;
                            }
                        }
                        if (!z12) {
                            if (i7 == qnVar.C0) {
                                z11 = qnVar.f38911b0;
                                qnVar.f38911b0 = !z11;
                                qnVar.W();
                            } else {
                                int i19 = qnVar.f38955z0;
                                if (i7 == i19) {
                                    z11 = !qnVar.f38921g0;
                                    qnVar.f38921g0 = z11;
                                } else if (i7 == qnVar.D0) {
                                    if (!qnVar.f38915d0 && !qnVar.f38911b0) {
                                        qnVar.U ^= z10;
                                    }
                                    z11 = qnVar.U;
                                } else if (i7 == qnVar.F0) {
                                    z11 = !qnVar.T;
                                    qnVar.T = z11;
                                } else if (i7 == qnVar.I0) {
                                    if (qnVar.V == 0 && qnVar.W == 0) {
                                        qnVar.V = 86400;
                                        qnVar.W = 0;
                                        int i20 = qnVar.J0;
                                        qnVar.n0();
                                        if (i20 < 0) {
                                            v4.f1 K2 = d61Var.K(qnVar.I0);
                                            if (K2 != null) {
                                                View view3 = K2.f59245a;
                                                if (view3 instanceof org.telegram.ui.Cells.y5) {
                                                    ((org.telegram.ui.Cells.y5) view3).setDivider(z10);
                                                }
                                            }
                                            d61Var.setItemAnimator(fnVar);
                                            l4Var.o(qnVar.J0, 3);
                                        }
                                    } else {
                                        qnVar.V = 0;
                                        qnVar.W = 0;
                                        int i21 = qnVar.J0;
                                        qnVar.n0();
                                        d61Var.setItemAnimator(fnVar);
                                        l4Var.p(i21, 3);
                                        v4.f1 K3 = d61Var.K(qnVar.I0);
                                        if (K3 != null) {
                                            View view4 = K3.f59245a;
                                            if (view4 instanceof org.telegram.ui.Cells.y5) {
                                                ((org.telegram.ui.Cells.y5) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (qnVar.V == 0 && qnVar.W == 0) {
                                        z13 = false;
                                    } else {
                                        z13 = z10;
                                    }
                                    z11 = z13;
                                } else if (i7 == qnVar.E0) {
                                    z11 = !qnVar.S;
                                    qnVar.S = z11;
                                } else if (i7 == qnVar.A0) {
                                    z11 = qnVar.f38923h0 ^ z10;
                                    qnVar.f38923h0 = z11;
                                    qnVar.n0();
                                    int i22 = qnVar.f38955z0;
                                    if (i22 >= 0 && i19 < 0) {
                                        d61Var.setItemAnimator(fnVar);
                                        l4Var.i(qnVar.f38955z0);
                                    } else if (i19 >= 0 && i22 < 0) {
                                        d61Var.setItemAnimator(fnVar);
                                        l4Var.s(i19);
                                    }
                                } else if (i7 == qnVar.G0) {
                                    boolean z17 = qnVar.f38913c0;
                                    z11 = !z17;
                                    qnVar.f38913c0 = z11;
                                    if (z17 && qnVar.f38915d0) {
                                        boolean z18 = false;
                                        for (int i23 = 0; i23 < zArr.length; i23++) {
                                            if (z18) {
                                                zArr[i23] = false;
                                            } else if (zArr[i23]) {
                                                z18 = z10;
                                            }
                                        }
                                    }
                                    int childCount = d61Var.getChildCount();
                                    for (int i24 = 0; i24 < childCount; i24++) {
                                        v4.f1 T = d61Var.T(d61Var.getChildAt(i24));
                                        if (T.f59249f == 5) {
                                            ((org.telegram.ui.Cells.a6) T.f59245a).f30473a.a(qnVar.f38913c0, z10);
                                        }
                                    }
                                } else if (i7 == qnVar.K0) {
                                    z11 = !qnVar.f38909a0;
                                    qnVar.f38909a0 = z11;
                                } else if (i7 == qnVar.H0) {
                                    if (!qnVar.f38919f0) {
                                        d61Var.setItemAnimator(fnVar);
                                        z11 = !qnVar.f38915d0;
                                        qnVar.f38915d0 = z11;
                                        int i25 = qnVar.f38937p0;
                                        qnVar.n0();
                                        if (qnVar.f38915d0) {
                                            l4Var.o(qnVar.f38937p0, 3);
                                        } else {
                                            l4Var.p(i25, 3);
                                        }
                                        l4Var.g(qnVar.B0);
                                        if (qnVar.f38915d0) {
                                            qnVar.S = false;
                                            int i26 = qnVar.E0;
                                            if (i26 >= 0) {
                                                v4.f1 K4 = d61Var.K(i26);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.y5) K4.f59245a).setChecked(false);
                                                } else {
                                                    l4Var.g(qnVar.E0);
                                                }
                                            }
                                        } else {
                                            int i27 = qnVar.E0;
                                            if (i27 >= 0 && d61Var.K(i27) == null) {
                                                l4Var.g(qnVar.E0);
                                            }
                                        }
                                        qnVar.W();
                                        if (qnVar.f38915d0 && !qnVar.f38913c0) {
                                            boolean z19 = false;
                                            for (int i28 = 0; i28 < zArr.length; i28++) {
                                                if (z19) {
                                                    zArr[i28] = false;
                                                } else if (zArr[i28]) {
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
                        if (qnVar.f38917e0 && !qnVar.f38915d0) {
                            d61Var.getChildCount();
                            j30Var.a();
                        }
                        for (int i29 = qnVar.f38947u0; i29 < qnVar.f38947u0 + qnVar.N; i29++) {
                            v4.f1 K5 = d61Var.K(i29);
                            if (K5 != null) {
                                View view5 = K5.f59245a;
                                if (view5 instanceof org.telegram.ui.Cells.a6) {
                                    org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view5;
                                    a6Var.n(qnVar.f38915d0, z10);
                                    a6Var.f30479r.a(zArr[i29 - qnVar.f38947u0], z15);
                                    if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == qnVar.H0 && !qnVar.f38917e0) {
                                        j30Var.setText(org.telegram.messenger.gd.N0(2131746961, null));
                                        j30Var.c(a6Var.getCheckBox());
                                        qnVar.f38917e0 = z10;
                                    }
                                }
                            }
                        }
                        if (z14) {
                            ((org.telegram.ui.Cells.r8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.y5) {
                            ((org.telegram.ui.Cells.y5) view).setChecked(z11);
                        }
                        qnVar.Y();
                        return;
                    }
                    return;
                }
                break;
            default:
                bv bvVar = (bv) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                nu nuVar = bvVar.f33818p1;
                if (arrayList2 != null && arrayList2.size() > 1) {
                    if (SystemClock.elapsedRealtime() - bvVar.L1 >= 250) {
                        int i30 = 0;
                        while (true) {
                            ArrayList[] arrayListArr = nuVar.f43044c;
                            if (i11 < arrayListArr.length) {
                                int size = arrayListArr[i11].size();
                                if (nuVar.f43044c.length > 1) {
                                    size = Math.min(bvVar.f33827y1.J * 2, size);
                                }
                                i30 += size + 2;
                                if (i7 >= i30) {
                                    i11++;
                                }
                            }
                        }
                        ArrayList arrayList3 = nuVar.f43043b;
                        if (arrayList3 != null && i11 < arrayList3.size()) {
                            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) nuVar.f43043b.get(i11);
                        }
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            ArrayList arrayList4 = new ArrayList();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                            tL_inputStickerSetID.f28512id = stickerSet.f28519id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            arrayList4.add(tL_inputStickerSetID);
                            new ou(bvVar, g2Var, bvVar.getContext(), this.f40739b, arrayList4).show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.g1 g1Var = bvVar.B1;
                if (g1Var != null) {
                    g1Var.d(true);
                    bvVar.B1 = null;
                    return;
                } else if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).f46118a0.getVisibility() == 0 && (view instanceof uu)) {
                    x5 x5Var = ((uu) view).f40471c;
                    try {
                        TLRPC.Document document = x5Var.document;
                        if (document == null) {
                            document = o5.e(bvVar.f30223a, x5Var.getDocumentId());
                        }
                        SpannableString spannableString = new SpannableString(org.telegram.messenger.fj.U(document));
                        spannableString.setSpan(x5Var, 0, spannableString.length(), 33);
                        ((org.telegram.ui.bn) g2Var).f46118a0.F0.getText().append((CharSequence) spannableString);
                        bvVar.M0();
                        bvVar.dismiss();
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

    public vm(bv bvVar, ArrayList arrayList, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f40740c = bvVar;
        this.d = arrayList;
        this.f40741e = g2Var;
        this.f40739b = i6Var;
    }
}
