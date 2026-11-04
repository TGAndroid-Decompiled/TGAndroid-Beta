package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class fm implements fj0 {
    public final int f33816a = 0;
    public final org.telegram.ui.ActionBar.e6 f33817b;
    public final Object f33818c;
    public final Object d;
    public final Object f33819e;

    public fm(an anVar, org.telegram.ui.ActionBar.e6 e6Var, bi biVar, Context context) {
        this.f33818c = anVar;
        this.f33817b = e6Var;
        this.d = biVar;
        this.f33819e = context;
    }

    @Override
    public final void f(int i3, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10 = this.f33816a;
        int i11 = 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        Object obj = this.f33819e;
        Object obj2 = this.d;
        Object obj3 = this.f33818c;
        switch (i10) {
            case 0:
                an anVar = (an) obj3;
                bi biVar = (bi) obj2;
                Context context = (Context) obj;
                u20 u20Var = anVar.E;
                boolean[] zArr = anVar.M;
                cg.v0 v0Var = anVar.O0;
                pm pmVar = anVar.f31944w;
                org.telegram.ui.n4 n4Var = anVar.f31936r;
                org.telegram.ui.u51 u51Var = anVar.f31939s;
                int i12 = anVar.M0;
                org.telegram.ui.ActionBar.e6 e6Var = this.f33817b;
                if (i3 == i12) {
                    wh.h hVar = new wh.h(anVar.getContext(), e6Var);
                    hVar.f57772d2 = new gi.v5(anVar, 29);
                    ArrayList arrayList = anVar.Q0;
                    hVar.V1 = null;
                    hVar.f57776h2 = new HashSet(arrayList);
                    hVar.show();
                    return;
                } else if (i3 == anVar.J0) {
                    f60 F = f60.F(biVar.f28589c, e6Var, view);
                    int i13 = 0;
                    while (true) {
                        int[] iArr = anVar.U0;
                        if (i13 < iArr.length) {
                            int i14 = iArr[i13];
                            zz0 a10 = zz0.a(i14);
                            int i15 = org.telegram.ui.ActionBar.k6.F8;
                            org.telegram.ui.ActionBar.r6.y(anVar, a10, i15, e6Var, PorterDuff.Mode.SRC_IN);
                            F.b(0, a10, org.telegram.messenger.bd.G(i14 / 3600, "Hours", new Object[0]), i15, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.f4(anVar, i14, view, 6));
                            i13++;
                        } else {
                            F.c(2131232106, org.telegram.messenger.bd.M0(2131747139, null), new o4.b1(anVar, context, view, e6Var, 24), false);
                            F.f33748t = false;
                            F.f33747s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i3 == anVar.f31943v0) {
                    anVar.T();
                    return;
                } else {
                    boolean z14 = view instanceof org.telegram.ui.Cells.q8;
                    if (z14 || (view instanceof org.telegram.ui.Cells.x5)) {
                        boolean z15 = anVar.f31910d0;
                        rm rmVar = anVar.f31948y;
                        if (rmVar != null) {
                            rmVar.f();
                        }
                        cg.v0[] v0VarArr = anVar.P0;
                        int length = v0VarArr.length;
                        int i16 = 0;
                        while (true) {
                            if (i16 < length) {
                                cg.v0 v0Var2 = v0VarArr[i16];
                                if (i3 == v0Var2.f4758b) {
                                    boolean z16 = v0Var2.f4757a;
                                    z11 = !z16;
                                    v0Var2.f4757a = z11;
                                    int i17 = v0Var.f4758b;
                                    an anVar2 = (an) v0Var.f4759c;
                                    org.telegram.ui.n4 n4Var2 = anVar2.f31936r;
                                    if (i3 == i17) {
                                        u51Var.setItemAnimator(pmVar);
                                        int i18 = v0Var.f4758b;
                                        if (i18 >= 0) {
                                            u4.d1 K = anVar2.f31939s.K(i18);
                                            if (K != null) {
                                                View view2 = K.f55540a;
                                                if (view2 instanceof org.telegram.ui.Cells.x5) {
                                                    ((org.telegram.ui.Cells.x5) view2).setDivider(z11);
                                                }
                                            }
                                            n4Var2.g(v0Var.f4758b);
                                        }
                                        if (!z16) {
                                            z10 = true;
                                            n4Var2.o(v0Var.f4758b + 1, 1);
                                        } else {
                                            z10 = true;
                                            n4Var2.p(v0Var.f4758b + 1, 1);
                                        }
                                        anVar.n0();
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
                            if (i3 == anVar.C0) {
                                z11 = anVar.f31906b0;
                                anVar.f31906b0 = !z11;
                                anVar.V();
                            } else {
                                int i19 = anVar.f31950z0;
                                if (i3 == i19) {
                                    z11 = !anVar.f31916g0;
                                    anVar.f31916g0 = z11;
                                } else if (i3 == anVar.D0) {
                                    if (!anVar.f31910d0 && !anVar.f31906b0) {
                                        anVar.U ^= z10;
                                    }
                                    z11 = anVar.U;
                                } else if (i3 == anVar.F0) {
                                    z11 = !anVar.T;
                                    anVar.T = z11;
                                } else if (i3 == anVar.I0) {
                                    if (anVar.V == 0 && anVar.W == 0) {
                                        anVar.V = 86400;
                                        anVar.W = 0;
                                        int i20 = anVar.J0;
                                        anVar.n0();
                                        if (i20 < 0) {
                                            u4.d1 K2 = u51Var.K(anVar.I0);
                                            if (K2 != null) {
                                                View view3 = K2.f55540a;
                                                if (view3 instanceof org.telegram.ui.Cells.x5) {
                                                    ((org.telegram.ui.Cells.x5) view3).setDivider(z10);
                                                }
                                            }
                                            u51Var.setItemAnimator(pmVar);
                                            n4Var.o(anVar.J0, 3);
                                        }
                                    } else {
                                        anVar.V = 0;
                                        anVar.W = 0;
                                        int i21 = anVar.J0;
                                        anVar.n0();
                                        u51Var.setItemAnimator(pmVar);
                                        n4Var.p(i21, 3);
                                        u4.d1 K3 = u51Var.K(anVar.I0);
                                        if (K3 != null) {
                                            View view4 = K3.f55540a;
                                            if (view4 instanceof org.telegram.ui.Cells.x5) {
                                                ((org.telegram.ui.Cells.x5) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (anVar.V == 0 && anVar.W == 0) {
                                        z13 = false;
                                    } else {
                                        z13 = z10;
                                    }
                                    z11 = z13;
                                } else if (i3 == anVar.E0) {
                                    z11 = !anVar.S;
                                    anVar.S = z11;
                                } else if (i3 == anVar.A0) {
                                    z11 = anVar.f31918h0 ^ z10;
                                    anVar.f31918h0 = z11;
                                    anVar.n0();
                                    int i22 = anVar.f31950z0;
                                    if (i22 >= 0 && i19 < 0) {
                                        u51Var.setItemAnimator(pmVar);
                                        n4Var.i(anVar.f31950z0);
                                    } else if (i19 >= 0 && i22 < 0) {
                                        u51Var.setItemAnimator(pmVar);
                                        n4Var.s(i19);
                                    }
                                } else if (i3 == anVar.G0) {
                                    boolean z17 = anVar.f31908c0;
                                    z11 = !z17;
                                    anVar.f31908c0 = z11;
                                    if (z17 && anVar.f31910d0) {
                                        boolean z18 = false;
                                        for (int i23 = 0; i23 < zArr.length; i23++) {
                                            if (z18) {
                                                zArr[i23] = false;
                                            } else if (zArr[i23]) {
                                                z18 = z10;
                                            }
                                        }
                                    }
                                    int childCount = u51Var.getChildCount();
                                    for (int i24 = 0; i24 < childCount; i24++) {
                                        u4.d1 T = u51Var.T(u51Var.getChildAt(i24));
                                        if (T.f55544f == 5) {
                                            ((org.telegram.ui.Cells.z5) T.f55540a).f31045a.a(anVar.f31908c0, z10);
                                        }
                                    }
                                } else if (i3 == anVar.K0) {
                                    z11 = !anVar.f31904a0;
                                    anVar.f31904a0 = z11;
                                } else if (i3 == anVar.H0) {
                                    if (!anVar.f31914f0) {
                                        u51Var.setItemAnimator(pmVar);
                                        z11 = !anVar.f31910d0;
                                        anVar.f31910d0 = z11;
                                        int i25 = anVar.f31932p0;
                                        anVar.n0();
                                        if (anVar.f31910d0) {
                                            n4Var.o(anVar.f31932p0, 3);
                                        } else {
                                            n4Var.p(i25, 3);
                                        }
                                        n4Var.g(anVar.B0);
                                        if (anVar.f31910d0) {
                                            anVar.S = false;
                                            int i26 = anVar.E0;
                                            if (i26 >= 0) {
                                                u4.d1 K4 = u51Var.K(i26);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.x5) K4.f55540a).setChecked(false);
                                                } else {
                                                    n4Var.g(anVar.E0);
                                                }
                                            }
                                        } else {
                                            int i27 = anVar.E0;
                                            if (i27 >= 0 && u51Var.K(i27) == null) {
                                                n4Var.g(anVar.E0);
                                            }
                                        }
                                        anVar.V();
                                        if (anVar.f31910d0 && !anVar.f31908c0) {
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
                        if (anVar.f31912e0 && !anVar.f31910d0) {
                            u51Var.getChildCount();
                            u20Var.a();
                        }
                        for (int i29 = anVar.f31942u0; i29 < anVar.f31942u0 + anVar.N; i29++) {
                            u4.d1 K5 = u51Var.K(i29);
                            if (K5 != null) {
                                View view5 = K5.f55540a;
                                if (view5 instanceof org.telegram.ui.Cells.z5) {
                                    org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view5;
                                    z5Var.m(anVar.f31910d0, z10);
                                    z5Var.f31051r.a(zArr[i29 - anVar.f31942u0], z15);
                                    if (z5Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i3 == anVar.H0 && !anVar.f31912e0) {
                                        u20Var.setText(org.telegram.messenger.bd.M0(2131747163, null));
                                        u20Var.c(z5Var.getCheckBox());
                                        anVar.f31912e0 = z10;
                                    }
                                }
                            }
                        }
                        if (z14) {
                            ((org.telegram.ui.Cells.q8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.x5) {
                            ((org.telegram.ui.Cells.x5) view).setChecked(z11);
                        }
                        anVar.X();
                        return;
                    }
                    return;
                }
                break;
            default:
                pu puVar = (pu) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                bu buVar = puVar.m1;
                if (arrayList2 != null && arrayList2.size() > 1) {
                    if (SystemClock.elapsedRealtime() - puVar.I1 >= 250) {
                        int i30 = 0;
                        while (true) {
                            ArrayList[] arrayListArr = buVar.f36623c;
                            if (i11 < arrayListArr.length) {
                                int size = arrayListArr[i11].size();
                                if (buVar.f36623c.length > 1) {
                                    size = Math.min(puVar.f37250v1.J * 2, size);
                                }
                                i30 += size + 2;
                                if (i3 >= i30) {
                                    i11++;
                                }
                            }
                        }
                        ArrayList arrayList3 = buVar.f36622b;
                        if (arrayList3 != null && i11 < arrayList3.size()) {
                            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) buVar.f36622b.get(i11);
                        }
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            ArrayList arrayList4 = new ArrayList();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                            tL_inputStickerSetID.f27021id = stickerSet.f27028id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            arrayList4.add(tL_inputStickerSetID);
                            new cu(puVar, d2Var, puVar.getContext(), this.f33817b, arrayList4).show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.f1 f1Var = puVar.f37253y1;
                if (f1Var != null) {
                    f1Var.d(true);
                    puVar.f37253y1 = null;
                    return;
                } else if ((d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).f51237a0.getVisibility() == 0 && (view instanceof iu)) {
                    p5 p5Var = ((iu) view).f34827c;
                    try {
                        TLRPC.Document document = p5Var.document;
                        if (document == null) {
                            document = g5.e(puVar.f28583a, p5Var.getDocumentId());
                        }
                        SpannableString spannableString = new SpannableString(org.telegram.messenger.zi.U(document));
                        spannableString.setSpan(p5Var, 0, spannableString.length(), 33);
                        ((org.telegram.ui.wm) d2Var).f51237a0.F0.getText().append((CharSequence) spannableString);
                        puVar.L0();
                        puVar.dismiss();
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

    public fm(pu puVar, ArrayList arrayList, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f33818c = puVar;
        this.d = arrayList;
        this.f33819e = d2Var;
        this.f33817b = e6Var;
    }
}
