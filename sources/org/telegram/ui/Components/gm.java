package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class gm implements bj0 {
    public final int f33951a = 0;
    public final org.telegram.ui.ActionBar.f6 f33952b;
    public final Object f33953c;
    public final Object d;
    public final Object f33954e;

    public gm(bn bnVar, org.telegram.ui.ActionBar.f6 f6Var, di diVar, Context context) {
        this.f33953c = bnVar;
        this.f33952b = f6Var;
        this.d = diVar;
        this.f33954e = context;
    }

    @Override
    public final void c(int i7, View view) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = this.f33951a;
        int i11 = 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        Object obj = this.f33954e;
        Object obj2 = this.d;
        Object obj3 = this.f33953c;
        switch (i10) {
            case 0:
                bn bnVar = (bn) obj3;
                di diVar = (di) obj2;
                Context context = (Context) obj;
                y20 y20Var = bnVar.D;
                boolean[] zArr = bnVar.L;
                bg.w0 w0Var = bnVar.N0;
                qm qmVar = bnVar.f32244w;
                org.telegram.ui.l4 l4Var = bnVar.f32237r;
                org.telegram.ui.e61 e61Var = bnVar.f32239s;
                int i12 = bnVar.L0;
                org.telegram.ui.ActionBar.f6 f6Var = this.f33952b;
                if (i7 == i12) {
                    vh.g gVar = new vh.g(bnVar.getContext(), f6Var);
                    gVar.f57422c2 = new gf.g(bnVar, 29);
                    ArrayList arrayList = bnVar.P0;
                    gVar.U1 = null;
                    gVar.f57425g2 = new HashSet(arrayList);
                    gVar.show();
                    return;
                } else if (i7 == bnVar.I0) {
                    k60 F = k60.F(diVar.f28619c, f6Var, view);
                    int i13 = 0;
                    while (true) {
                        int[] iArr = bnVar.T0;
                        if (i13 < iArr.length) {
                            int i14 = iArr[i13];
                            a01 a10 = a01.a(i14);
                            int i15 = org.telegram.ui.ActionBar.k6.F8;
                            org.telegram.ui.ActionBar.r6.y(bnVar, a10, i15, f6Var, PorterDuff.Mode.SRC_IN);
                            F.b(0, a10, org.telegram.messenger.hd.G(i14 / 3600, "Hours", new Object[0]), i15, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.q8(bnVar, i14, view, 5));
                            i13++;
                        } else {
                            F.c(2131232106, org.telegram.messenger.hd.M0(2131747130, null), new org.telegram.ui.m6(bnVar, context, view, f6Var, 18), false);
                            F.f35206t = false;
                            F.f35205s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i7 == bnVar.f32242u0) {
                    bnVar.T();
                    return;
                } else {
                    boolean z13 = view instanceof org.telegram.ui.Cells.r8;
                    if (z13 || (view instanceof org.telegram.ui.Cells.x5)) {
                        boolean z14 = bnVar.f32209c0;
                        sm smVar = bnVar.f32248y;
                        if (smVar != null) {
                            smVar.f();
                        }
                        bg.w0[] w0VarArr = bnVar.O0;
                        int length = w0VarArr.length;
                        int i16 = 0;
                        while (true) {
                            if (i16 < length) {
                                bg.w0 w0Var2 = w0VarArr[i16];
                                if (i7 == w0Var2.f3393b) {
                                    boolean z15 = w0Var2.f3392a;
                                    z10 = !z15;
                                    w0Var2.f3392a = z10;
                                    int i17 = w0Var.f3393b;
                                    bn bnVar2 = (bn) w0Var.f3394c;
                                    org.telegram.ui.l4 l4Var2 = bnVar2.f32237r;
                                    if (i7 == i17) {
                                        e61Var.setItemAnimator(qmVar);
                                        int i18 = w0Var.f3393b;
                                        if (i18 >= 0) {
                                            v4.d1 K = bnVar2.f32239s.K(i18);
                                            if (K != null) {
                                                View view2 = K.f56951a;
                                                if (view2 instanceof org.telegram.ui.Cells.x5) {
                                                    ((org.telegram.ui.Cells.x5) view2).setDivider(z10);
                                                }
                                            }
                                            l4Var2.g(w0Var.f3393b);
                                        }
                                        if (!z15) {
                                            z9 = true;
                                            l4Var2.o(w0Var.f3393b + 1, 1);
                                        } else {
                                            z9 = true;
                                            l4Var2.p(w0Var.f3393b + 1, 1);
                                        }
                                        bnVar.n0();
                                    } else {
                                        z9 = true;
                                    }
                                    z11 = z9;
                                } else {
                                    i16++;
                                }
                            } else {
                                z9 = true;
                                z10 = false;
                                z11 = false;
                            }
                        }
                        if (!z11) {
                            if (i7 == bnVar.B0) {
                                z10 = bnVar.f32205a0;
                                bnVar.f32205a0 = !z10;
                                bnVar.V();
                            } else {
                                int i19 = bnVar.f32249y0;
                                if (i7 == i19) {
                                    z10 = !bnVar.f32215f0;
                                    bnVar.f32215f0 = z10;
                                } else if (i7 == bnVar.C0) {
                                    if (!bnVar.f32209c0 && !bnVar.f32205a0) {
                                        bnVar.T ^= z9;
                                    }
                                    z10 = bnVar.T;
                                } else if (i7 == bnVar.E0) {
                                    z10 = !bnVar.S;
                                    bnVar.S = z10;
                                } else if (i7 == bnVar.H0) {
                                    if (bnVar.U == 0 && bnVar.V == 0) {
                                        bnVar.U = 86400;
                                        bnVar.V = 0;
                                        int i20 = bnVar.I0;
                                        bnVar.n0();
                                        if (i20 < 0) {
                                            v4.d1 K2 = e61Var.K(bnVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.f56951a;
                                                if (view3 instanceof org.telegram.ui.Cells.x5) {
                                                    ((org.telegram.ui.Cells.x5) view3).setDivider(z9);
                                                }
                                            }
                                            e61Var.setItemAnimator(qmVar);
                                            l4Var.o(bnVar.I0, 3);
                                        }
                                    } else {
                                        bnVar.U = 0;
                                        bnVar.V = 0;
                                        int i21 = bnVar.I0;
                                        bnVar.n0();
                                        e61Var.setItemAnimator(qmVar);
                                        l4Var.p(i21, 3);
                                        v4.d1 K3 = e61Var.K(bnVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.f56951a;
                                            if (view4 instanceof org.telegram.ui.Cells.x5) {
                                                ((org.telegram.ui.Cells.x5) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (bnVar.U == 0 && bnVar.V == 0) {
                                        z12 = false;
                                    } else {
                                        z12 = z9;
                                    }
                                    z10 = z12;
                                } else if (i7 == bnVar.D0) {
                                    z10 = !bnVar.R;
                                    bnVar.R = z10;
                                } else if (i7 == bnVar.f32250z0) {
                                    z10 = bnVar.f32217g0 ^ z9;
                                    bnVar.f32217g0 = z10;
                                    bnVar.n0();
                                    int i22 = bnVar.f32249y0;
                                    if (i22 >= 0 && i19 < 0) {
                                        e61Var.setItemAnimator(qmVar);
                                        l4Var.i(bnVar.f32249y0);
                                    } else if (i19 >= 0 && i22 < 0) {
                                        e61Var.setItemAnimator(qmVar);
                                        l4Var.s(i19);
                                    }
                                } else if (i7 == bnVar.F0) {
                                    boolean z16 = bnVar.f32207b0;
                                    z10 = !z16;
                                    bnVar.f32207b0 = z10;
                                    if (z16 && bnVar.f32209c0) {
                                        boolean z17 = false;
                                        for (int i23 = 0; i23 < zArr.length; i23++) {
                                            if (z17) {
                                                zArr[i23] = false;
                                            } else if (zArr[i23]) {
                                                z17 = z9;
                                            }
                                        }
                                    }
                                    int childCount = e61Var.getChildCount();
                                    for (int i24 = 0; i24 < childCount; i24++) {
                                        v4.d1 T = e61Var.T(e61Var.getChildAt(i24));
                                        if (T.f56955f == 5) {
                                            ((org.telegram.ui.Cells.a6) T.f56951a).f28885a.a(bnVar.f32207b0, z9);
                                        }
                                    }
                                } else if (i7 == bnVar.J0) {
                                    z10 = !bnVar.W;
                                    bnVar.W = z10;
                                } else if (i7 == bnVar.G0) {
                                    if (!bnVar.f32213e0) {
                                        e61Var.setItemAnimator(qmVar);
                                        z10 = !bnVar.f32209c0;
                                        bnVar.f32209c0 = z10;
                                        int i25 = bnVar.f32231o0;
                                        bnVar.n0();
                                        if (bnVar.f32209c0) {
                                            l4Var.o(bnVar.f32231o0, 3);
                                        } else {
                                            l4Var.p(i25, 3);
                                        }
                                        l4Var.g(bnVar.A0);
                                        if (bnVar.f32209c0) {
                                            bnVar.R = false;
                                            int i26 = bnVar.D0;
                                            if (i26 >= 0) {
                                                v4.d1 K4 = e61Var.K(i26);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.x5) K4.f56951a).setChecked(false);
                                                } else {
                                                    l4Var.g(bnVar.D0);
                                                }
                                            }
                                        } else {
                                            int i27 = bnVar.D0;
                                            if (i27 >= 0 && e61Var.K(i27) == null) {
                                                l4Var.g(bnVar.D0);
                                            }
                                        }
                                        bnVar.V();
                                        if (bnVar.f32209c0 && !bnVar.f32207b0) {
                                            boolean z18 = false;
                                            for (int i28 = 0; i28 < zArr.length; i28++) {
                                                if (z18) {
                                                    zArr[i28] = false;
                                                } else if (zArr[i28]) {
                                                    z18 = z9;
                                                }
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                        if (bnVar.f32211d0 && !bnVar.f32209c0) {
                            e61Var.getChildCount();
                            y20Var.a();
                        }
                        for (int i29 = bnVar.f32241t0; i29 < bnVar.f32241t0 + bnVar.M; i29++) {
                            v4.d1 K5 = e61Var.K(i29);
                            if (K5 != null) {
                                View view5 = K5.f56951a;
                                if (view5 instanceof org.telegram.ui.Cells.a6) {
                                    org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view5;
                                    a6Var.m(bnVar.f32209c0, z9);
                                    a6Var.f28891r.a(zArr[i29 - bnVar.f32241t0], z14);
                                    if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == bnVar.G0 && !bnVar.f32211d0) {
                                        y20Var.setText(org.telegram.messenger.hd.M0(2131747154, null));
                                        y20Var.c(a6Var.getCheckBox());
                                        bnVar.f32211d0 = z9;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                        } else if (view instanceof org.telegram.ui.Cells.x5) {
                            ((org.telegram.ui.Cells.x5) view).setChecked(z10);
                        }
                        bnVar.X();
                        return;
                    }
                    return;
                }
                break;
            default:
                qu quVar = (qu) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                cu cuVar = quVar.l1;
                if (arrayList2 != null && arrayList2.size() > 1) {
                    if (SystemClock.elapsedRealtime() - quVar.H1 >= 250) {
                        int i30 = 0;
                        while (true) {
                            ArrayList[] arrayListArr = cuVar.f36677c;
                            if (i11 < arrayListArr.length) {
                                int size = arrayListArr[i11].size();
                                if (cuVar.f36677c.length > 1) {
                                    size = Math.min(quVar.f37400u1.J * 2, size);
                                }
                                i30 += size + 2;
                                if (i7 >= i30) {
                                    i11++;
                                }
                            }
                        }
                        ArrayList arrayList3 = cuVar.f36676b;
                        if (arrayList3 != null && i11 < arrayList3.size()) {
                            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) cuVar.f36676b.get(i11);
                        }
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            ArrayList arrayList4 = new ArrayList();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                            tL_inputStickerSetID.f26973id = stickerSet.f26980id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            arrayList4.add(tL_inputStickerSetID);
                            new du(quVar, f2Var, quVar.getContext(), this.f33952b, arrayList4).show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.g1 g1Var = quVar.f37403x1;
                if (g1Var != null) {
                    g1Var.d(true);
                    quVar.f37403x1 = null;
                    return;
                } else if ((f2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) f2Var).Z.getVisibility() == 0 && (view instanceof ju)) {
                    r5 r5Var = ((ju) view).f35072c;
                    try {
                        TLRPC.Document document = r5Var.document;
                        if (document == null) {
                            document = i5.e(quVar.f28613a, r5Var.getDocumentId());
                        }
                        SpannableString spannableString = new SpannableString(org.telegram.messenger.ij.U(document));
                        spannableString.setSpan(r5Var, 0, spannableString.length(), 33);
                        ((org.telegram.ui.an) f2Var).Z.E0.getText().append((CharSequence) spannableString);
                        quVar.L0();
                        quVar.dismiss();
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

    public gm(qu quVar, ArrayList arrayList, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f33953c = quVar;
        this.d = arrayList;
        this.f33954e = f2Var;
        this.f33952b = f6Var;
    }
}
