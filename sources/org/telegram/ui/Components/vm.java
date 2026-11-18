package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class vm implements oj0 {
    public final int f40703a = 1;
    public final org.telegram.ui.ActionBar.i6 f40704b;
    public final Object f40705c;
    public final Object d;
    public final Object f40706e;

    public vm(rn rnVar, org.telegram.ui.ActionBar.i6 i6Var, si siVar, Context context) {
        this.f40705c = rnVar;
        this.f40704b = i6Var;
        this.d = siVar;
        this.f40706e = context;
    }

    @Override
    public final void c(int i7, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10 = this.f40703a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        Object obj = this.f40706e;
        Object obj2 = this.d;
        Object obj3 = this.f40705c;
        int i11 = 0;
        switch (i10) {
            case 0:
                rn rnVar = (rn) obj3;
                si siVar = (si) obj2;
                Context context = (Context) obj;
                j30 j30Var = rnVar.E;
                boolean[] zArr = rnVar.M;
                bg.w0 w0Var = rnVar.O0;
                fn fnVar = rnVar.f39247w;
                org.telegram.ui.l4 l4Var = rnVar.f39239r;
                org.telegram.ui.f61 f61Var = rnVar.f39242s;
                int i12 = rnVar.M0;
                org.telegram.ui.ActionBar.i6 i6Var = this.f40704b;
                if (i7 == i12) {
                    vh.g gVar = new vh.g(rnVar.getContext(), i6Var);
                    gVar.f59569g2 = new hn(rnVar, 0);
                    ArrayList arrayList = rnVar.Q0;
                    gVar.Y1 = null;
                    gVar.f59573k2 = new HashSet(arrayList);
                    gVar.show();
                    return;
                } else if (i7 == rnVar.J0) {
                    y60 G = y60.G(siVar.f30195c, i6Var, view);
                    int i13 = 0;
                    while (true) {
                        int[] iArr = rnVar.U0;
                        if (i13 < iArr.length) {
                            int i14 = iArr[i13];
                            k01 a10 = k01.a(i14);
                            int i15 = org.telegram.ui.ActionBar.n6.F8;
                            org.telegram.ui.ActionBar.u6.x(rnVar, a10, i15, i6Var, PorterDuff.Mode.SRC_IN);
                            G.b(0, a10, org.telegram.messenger.gd.G(i14 / 3600, "Hours", new Object[0]), i15, org.telegram.ui.ActionBar.n6.E8, new org.telegram.ui.b0(rnVar, i14, view, 9));
                            i13++;
                        } else {
                            G.c(2131232108, org.telegram.messenger.gd.M0(2131746938, null), new org.telegram.messenger.camera.i(rnVar, context, view, i6Var, 25), false);
                            G.f42377t = false;
                            G.f42375s = 0;
                            G.a0();
                            return;
                        }
                    }
                } else if (i7 == rnVar.f39246v0) {
                    rnVar.U();
                    return;
                } else {
                    boolean z15 = view instanceof org.telegram.ui.Cells.r8;
                    if (z15 || (view instanceof org.telegram.ui.Cells.y5)) {
                        boolean z16 = rnVar.f39213d0;
                        in inVar = rnVar.f39251y;
                        if (inVar != null) {
                            inVar.f();
                        }
                        bg.w0[] w0VarArr = rnVar.P0;
                        int length = w0VarArr.length;
                        int i16 = 0;
                        while (true) {
                            if (i16 < length) {
                                bg.w0 w0Var2 = w0VarArr[i16];
                                if (i7 == w0Var2.f3354b) {
                                    boolean z17 = w0Var2.f3353a;
                                    z11 = !z17;
                                    w0Var2.f3353a = z11;
                                    int i17 = w0Var.f3354b;
                                    rn rnVar2 = (rn) w0Var.f3355c;
                                    org.telegram.ui.l4 l4Var2 = rnVar2.f39239r;
                                    if (i7 == i17) {
                                        f61Var.setItemAnimator(fnVar);
                                        int i18 = w0Var.f3354b;
                                        if (i18 >= 0) {
                                            v4.f1 K = rnVar2.f39242s.K(i18);
                                            if (K != null) {
                                                View view2 = K.f59122a;
                                                if (view2 instanceof org.telegram.ui.Cells.y5) {
                                                    ((org.telegram.ui.Cells.y5) view2).setDivider(z11);
                                                }
                                            }
                                            l4Var2.g(w0Var.f3354b);
                                        }
                                        if (!z17) {
                                            z14 = true;
                                            l4Var2.o(w0Var.f3354b + 1, 1);
                                        } else {
                                            z14 = true;
                                            l4Var2.p(w0Var.f3354b + 1, 1);
                                        }
                                        rnVar.n0();
                                    } else {
                                        z14 = true;
                                    }
                                    z10 = z14;
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
                            if (i7 == rnVar.C0) {
                                z11 = rnVar.f39209b0;
                                rnVar.f39209b0 = !z11;
                                rnVar.W();
                            } else {
                                int i19 = rnVar.f39253z0;
                                if (i7 == i19) {
                                    z11 = rnVar.f39219g0 ^ z10;
                                    rnVar.f39219g0 = z11;
                                } else if (i7 == rnVar.D0) {
                                    if (!rnVar.f39213d0 && !rnVar.f39209b0) {
                                        rnVar.U ^= z10;
                                    }
                                    z11 = rnVar.U;
                                } else if (i7 == rnVar.F0) {
                                    z11 = rnVar.T ^ z10;
                                    rnVar.T = z11;
                                } else if (i7 == rnVar.I0) {
                                    if (rnVar.V == 0 && rnVar.W == 0) {
                                        rnVar.V = 86400;
                                        rnVar.W = 0;
                                        int i20 = rnVar.J0;
                                        rnVar.n0();
                                        if (i20 < 0) {
                                            v4.f1 K2 = f61Var.K(rnVar.I0);
                                            if (K2 != null) {
                                                View view3 = K2.f59122a;
                                                if (view3 instanceof org.telegram.ui.Cells.y5) {
                                                    ((org.telegram.ui.Cells.y5) view3).setDivider(z10);
                                                }
                                            }
                                            f61Var.setItemAnimator(fnVar);
                                            l4Var.o(rnVar.J0, 3);
                                        }
                                    } else {
                                        rnVar.V = 0;
                                        rnVar.W = 0;
                                        int i21 = rnVar.J0;
                                        rnVar.n0();
                                        f61Var.setItemAnimator(fnVar);
                                        l4Var.p(i21, 3);
                                        v4.f1 K3 = f61Var.K(rnVar.I0);
                                        if (K3 != null) {
                                            View view4 = K3.f59122a;
                                            if (view4 instanceof org.telegram.ui.Cells.y5) {
                                                ((org.telegram.ui.Cells.y5) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (rnVar.V == 0 && rnVar.W == 0) {
                                        z13 = false;
                                    } else {
                                        z13 = z10;
                                    }
                                    z11 = z13;
                                } else if (i7 == rnVar.E0) {
                                    z11 = rnVar.S ^ z10;
                                    rnVar.S = z11;
                                } else if (i7 == rnVar.A0) {
                                    z11 = rnVar.f39221h0 ^ z10;
                                    rnVar.f39221h0 = z11;
                                    rnVar.n0();
                                    int i22 = rnVar.f39253z0;
                                    if (i22 >= 0 && i19 < 0) {
                                        f61Var.setItemAnimator(fnVar);
                                        l4Var.i(rnVar.f39253z0);
                                    } else if (i19 >= 0 && i22 < 0) {
                                        f61Var.setItemAnimator(fnVar);
                                        l4Var.s(i19);
                                    }
                                } else if (i7 == rnVar.G0) {
                                    boolean z18 = rnVar.f39211c0;
                                    boolean z19 = !z18;
                                    rnVar.f39211c0 = z19;
                                    if (z18 && rnVar.f39213d0) {
                                        boolean z20 = false;
                                        for (int i23 = 0; i23 < zArr.length; i23++) {
                                            if (z20) {
                                                zArr[i23] = false;
                                            } else if (zArr[i23]) {
                                                z20 = z10;
                                            }
                                        }
                                    }
                                    int childCount = f61Var.getChildCount();
                                    for (int i24 = 0; i24 < childCount; i24++) {
                                        v4.f1 T = f61Var.T(f61Var.getChildAt(i24));
                                        if (T.f59126f == 5) {
                                            ((org.telegram.ui.Cells.a6) T.f59122a).f30383a.a(rnVar.f39211c0, z10);
                                        }
                                    }
                                    z11 = z19;
                                } else if (i7 == rnVar.K0) {
                                    z11 = rnVar.f39207a0 ^ z10;
                                    rnVar.f39207a0 = z11;
                                } else if (i7 == rnVar.H0) {
                                    if (!rnVar.f39217f0) {
                                        f61Var.setItemAnimator(fnVar);
                                        z11 = rnVar.f39213d0 ^ z10;
                                        rnVar.f39213d0 = z11;
                                        int i25 = rnVar.f39235p0;
                                        rnVar.n0();
                                        if (rnVar.f39213d0) {
                                            l4Var.o(rnVar.f39235p0, 3);
                                        } else {
                                            l4Var.p(i25, 3);
                                        }
                                        l4Var.g(rnVar.B0);
                                        if (rnVar.f39213d0) {
                                            rnVar.S = false;
                                            int i26 = rnVar.E0;
                                            if (i26 >= 0) {
                                                v4.f1 K4 = f61Var.K(i26);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.y5) K4.f59122a).setChecked(false);
                                                } else {
                                                    l4Var.g(rnVar.E0);
                                                }
                                            }
                                        } else {
                                            int i27 = rnVar.E0;
                                            if (i27 >= 0 && f61Var.K(i27) == null) {
                                                l4Var.g(rnVar.E0);
                                            }
                                        }
                                        rnVar.W();
                                        if (rnVar.f39213d0 && !rnVar.f39211c0) {
                                            boolean z21 = false;
                                            for (int i28 = 0; i28 < zArr.length; i28++) {
                                                if (z21) {
                                                    zArr[i28] = false;
                                                } else if (zArr[i28]) {
                                                    z21 = z10;
                                                }
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                        if (rnVar.f39215e0 && !rnVar.f39213d0) {
                            f61Var.getChildCount();
                            j30Var.a();
                        }
                        for (int i29 = rnVar.f39245u0; i29 < rnVar.f39245u0 + rnVar.N; i29++) {
                            v4.f1 K5 = f61Var.K(i29);
                            if (K5 != null) {
                                View view5 = K5.f59122a;
                                if (view5 instanceof org.telegram.ui.Cells.a6) {
                                    org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view5;
                                    a6Var.n(rnVar.f39213d0, z10);
                                    a6Var.f30389r.a(zArr[i29 - rnVar.f39245u0], z16);
                                    if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == rnVar.H0 && !rnVar.f39215e0) {
                                        j30Var.setText(org.telegram.messenger.gd.M0(2131746962, null));
                                        j30Var.c(a6Var.getCheckBox());
                                        rnVar.f39215e0 = z10;
                                    }
                                }
                            }
                        }
                        if (z15) {
                            ((org.telegram.ui.Cells.r8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.y5) {
                            ((org.telegram.ui.Cells.y5) view).setChecked(z11);
                        }
                        rnVar.Y();
                        return;
                    }
                    return;
                }
                break;
            default:
                bv bvVar = (bv) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj;
                nu nuVar = bvVar.f33786p1;
                if (arrayList2 != null && arrayList2.size() > 1) {
                    if (SystemClock.elapsedRealtime() - bvVar.L1 >= 250) {
                        int i30 = 0;
                        while (true) {
                            ArrayList[] arrayListArr = nuVar.f42947c;
                            if (i11 < arrayListArr.length) {
                                int size = arrayListArr[i11].size();
                                if (nuVar.f42947c.length > 1) {
                                    size = Math.min(bvVar.f33795y1.J * 2, size);
                                }
                                i30 += size + 2;
                                if (i7 >= i30) {
                                    i11++;
                                }
                            }
                        }
                        ArrayList arrayList3 = nuVar.f42946b;
                        if (arrayList3 != null && i11 < arrayList3.size()) {
                            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) nuVar.f42946b.get(i11);
                        }
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            ArrayList arrayList4 = new ArrayList();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                            tL_inputStickerSetID.f28425id = stickerSet.f28432id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            arrayList4.add(tL_inputStickerSetID);
                            new ou(bvVar, h2Var, bvVar.getContext(), this.f40704b, arrayList4).show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.h1 h1Var = bvVar.B1;
                if (h1Var != null) {
                    h1Var.d(true);
                    bvVar.B1 = null;
                    return;
                } else if ((h2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) h2Var).f45932a0.getVisibility() == 0 && (view instanceof uu)) {
                    x5 x5Var = ((uu) view).f40419c;
                    try {
                        TLRPC.Document document = x5Var.document;
                        if (document == null) {
                            document = o5.e(bvVar.f30189a, x5Var.getDocumentId());
                        }
                        SpannableString spannableString = new SpannableString(org.telegram.messenger.fj.U(document));
                        spannableString.setSpan(x5Var, 0, spannableString.length(), 33);
                        ((org.telegram.ui.bn) h2Var).f45932a0.F0.getText().append((CharSequence) spannableString);
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

    public vm(bv bvVar, ArrayList arrayList, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f40705c = bvVar;
        this.d = arrayList;
        this.f40706e = h2Var;
        this.f40704b = i6Var;
    }
}
