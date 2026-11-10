package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class fm implements bj0 {
    public final int f33582a = 0;
    public final org.telegram.ui.ActionBar.h6 f33583b;
    public final Object f33584c;
    public final Object d;
    public final Object f33585e;

    public fm(an anVar, org.telegram.ui.ActionBar.h6 h6Var, ci ciVar, Context context) {
        this.f33584c = anVar;
        this.f33583b = h6Var;
        this.d = ciVar;
        this.f33585e = context;
    }

    @Override
    public final void c(int i7, View view) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = this.f33582a;
        int i11 = 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        Object obj = this.f33585e;
        Object obj2 = this.d;
        Object obj3 = this.f33584c;
        switch (i10) {
            case 0:
                an anVar = (an) obj3;
                ci ciVar = (ci) obj2;
                Context context = (Context) obj;
                y20 y20Var = anVar.D;
                boolean[] zArr = anVar.L;
                bg.w0 w0Var = anVar.N0;
                pm pmVar = anVar.f31927w;
                org.telegram.ui.l4 l4Var = anVar.f31920r;
                org.telegram.ui.g61 g61Var = anVar.f31922s;
                int i12 = anVar.L0;
                org.telegram.ui.ActionBar.h6 h6Var = this.f33583b;
                if (i7 == i12) {
                    vh.g gVar = new vh.g(anVar.getContext(), h6Var);
                    gVar.f57525f2 = new gf.g(anVar, 29);
                    ArrayList arrayList = anVar.P0;
                    gVar.X1 = null;
                    gVar.f57529j2 = new HashSet(arrayList);
                    gVar.show();
                    return;
                } else if (i7 == anVar.I0) {
                    k60 F = k60.F(ciVar.f28675c, h6Var, view);
                    int i13 = 0;
                    while (true) {
                        int[] iArr = anVar.T0;
                        if (i13 < iArr.length) {
                            int i14 = iArr[i13];
                            a01 a10 = a01.a(i14);
                            int i15 = org.telegram.ui.ActionBar.m6.F8;
                            org.telegram.ui.ActionBar.t6.x(anVar, a10, i15, h6Var, PorterDuff.Mode.SRC_IN);
                            F.b(0, a10, org.telegram.messenger.id.G(i14 / 3600, "Hours", new Object[0]), i15, org.telegram.ui.ActionBar.m6.E8, new org.telegram.ui.q8(anVar, i14, view, 5));
                            i13++;
                        } else {
                            F.c(2131232106, org.telegram.messenger.id.M0(2131747131, null), new org.telegram.ui.m6(anVar, context, view, h6Var, 18), false);
                            F.f35220t = false;
                            F.f35219s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i7 == anVar.f31925u0) {
                    anVar.T();
                    return;
                } else {
                    boolean z13 = view instanceof org.telegram.ui.Cells.r8;
                    if (z13 || (view instanceof org.telegram.ui.Cells.x5)) {
                        boolean z14 = anVar.f31892c0;
                        rm rmVar = anVar.f31931y;
                        if (rmVar != null) {
                            rmVar.f();
                        }
                        bg.w0[] w0VarArr = anVar.O0;
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
                                    an anVar2 = (an) w0Var.f3394c;
                                    org.telegram.ui.l4 l4Var2 = anVar2.f31920r;
                                    if (i7 == i17) {
                                        g61Var.setItemAnimator(pmVar);
                                        int i18 = w0Var.f3393b;
                                        if (i18 >= 0) {
                                            v4.d1 K = anVar2.f31922s.K(i18);
                                            if (K != null) {
                                                View view2 = K.f57052a;
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
                                        anVar.n0();
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
                            if (i7 == anVar.B0) {
                                z10 = anVar.f31888a0;
                                anVar.f31888a0 = !z10;
                                anVar.V();
                            } else {
                                int i19 = anVar.f31932y0;
                                if (i7 == i19) {
                                    z10 = !anVar.f31898f0;
                                    anVar.f31898f0 = z10;
                                } else if (i7 == anVar.C0) {
                                    if (!anVar.f31892c0 && !anVar.f31888a0) {
                                        anVar.T ^= z9;
                                    }
                                    z10 = anVar.T;
                                } else if (i7 == anVar.E0) {
                                    z10 = !anVar.S;
                                    anVar.S = z10;
                                } else if (i7 == anVar.H0) {
                                    if (anVar.U == 0 && anVar.V == 0) {
                                        anVar.U = 86400;
                                        anVar.V = 0;
                                        int i20 = anVar.I0;
                                        anVar.n0();
                                        if (i20 < 0) {
                                            v4.d1 K2 = g61Var.K(anVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.f57052a;
                                                if (view3 instanceof org.telegram.ui.Cells.x5) {
                                                    ((org.telegram.ui.Cells.x5) view3).setDivider(z9);
                                                }
                                            }
                                            g61Var.setItemAnimator(pmVar);
                                            l4Var.o(anVar.I0, 3);
                                        }
                                    } else {
                                        anVar.U = 0;
                                        anVar.V = 0;
                                        int i21 = anVar.I0;
                                        anVar.n0();
                                        g61Var.setItemAnimator(pmVar);
                                        l4Var.p(i21, 3);
                                        v4.d1 K3 = g61Var.K(anVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.f57052a;
                                            if (view4 instanceof org.telegram.ui.Cells.x5) {
                                                ((org.telegram.ui.Cells.x5) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (anVar.U == 0 && anVar.V == 0) {
                                        z12 = false;
                                    } else {
                                        z12 = z9;
                                    }
                                    z10 = z12;
                                } else if (i7 == anVar.D0) {
                                    z10 = !anVar.R;
                                    anVar.R = z10;
                                } else if (i7 == anVar.f31933z0) {
                                    z10 = anVar.f31900g0 ^ z9;
                                    anVar.f31900g0 = z10;
                                    anVar.n0();
                                    int i22 = anVar.f31932y0;
                                    if (i22 >= 0 && i19 < 0) {
                                        g61Var.setItemAnimator(pmVar);
                                        l4Var.i(anVar.f31932y0);
                                    } else if (i19 >= 0 && i22 < 0) {
                                        g61Var.setItemAnimator(pmVar);
                                        l4Var.s(i19);
                                    }
                                } else if (i7 == anVar.F0) {
                                    boolean z16 = anVar.f31890b0;
                                    z10 = !z16;
                                    anVar.f31890b0 = z10;
                                    if (z16 && anVar.f31892c0) {
                                        boolean z17 = false;
                                        for (int i23 = 0; i23 < zArr.length; i23++) {
                                            if (z17) {
                                                zArr[i23] = false;
                                            } else if (zArr[i23]) {
                                                z17 = z9;
                                            }
                                        }
                                    }
                                    int childCount = g61Var.getChildCount();
                                    for (int i24 = 0; i24 < childCount; i24++) {
                                        v4.d1 T = g61Var.T(g61Var.getChildAt(i24));
                                        if (T.f57056f == 5) {
                                            ((org.telegram.ui.Cells.a6) T.f57052a).f28903a.a(anVar.f31890b0, z9);
                                        }
                                    }
                                } else if (i7 == anVar.J0) {
                                    z10 = !anVar.W;
                                    anVar.W = z10;
                                } else if (i7 == anVar.G0) {
                                    if (!anVar.f31896e0) {
                                        g61Var.setItemAnimator(pmVar);
                                        z10 = !anVar.f31892c0;
                                        anVar.f31892c0 = z10;
                                        int i25 = anVar.f31914o0;
                                        anVar.n0();
                                        if (anVar.f31892c0) {
                                            l4Var.o(anVar.f31914o0, 3);
                                        } else {
                                            l4Var.p(i25, 3);
                                        }
                                        l4Var.g(anVar.A0);
                                        if (anVar.f31892c0) {
                                            anVar.R = false;
                                            int i26 = anVar.D0;
                                            if (i26 >= 0) {
                                                v4.d1 K4 = g61Var.K(i26);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.x5) K4.f57052a).setChecked(false);
                                                } else {
                                                    l4Var.g(anVar.D0);
                                                }
                                            }
                                        } else {
                                            int i27 = anVar.D0;
                                            if (i27 >= 0 && g61Var.K(i27) == null) {
                                                l4Var.g(anVar.D0);
                                            }
                                        }
                                        anVar.V();
                                        if (anVar.f31892c0 && !anVar.f31890b0) {
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
                        if (anVar.f31894d0 && !anVar.f31892c0) {
                            g61Var.getChildCount();
                            y20Var.a();
                        }
                        for (int i29 = anVar.f31924t0; i29 < anVar.f31924t0 + anVar.M; i29++) {
                            v4.d1 K5 = g61Var.K(i29);
                            if (K5 != null) {
                                View view5 = K5.f57052a;
                                if (view5 instanceof org.telegram.ui.Cells.a6) {
                                    org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view5;
                                    a6Var.m(anVar.f31892c0, z9);
                                    a6Var.f28909r.a(zArr[i29 - anVar.f31924t0], z14);
                                    if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == anVar.G0 && !anVar.f31894d0) {
                                        y20Var.setText(org.telegram.messenger.id.M0(2131747155, null));
                                        y20Var.c(a6Var.getCheckBox());
                                        anVar.f31894d0 = z9;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                        } else if (view instanceof org.telegram.ui.Cells.x5) {
                            ((org.telegram.ui.Cells.x5) view).setChecked(z10);
                        }
                        anVar.X();
                        return;
                    }
                    return;
                }
                break;
            default:
                qu quVar = (qu) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                cu cuVar = quVar.f37397o1;
                if (arrayList2 != null && arrayList2.size() > 1) {
                    if (SystemClock.elapsedRealtime() - quVar.K1 >= 250) {
                        int i30 = 0;
                        while (true) {
                            ArrayList[] arrayListArr = cuVar.f36691c;
                            if (i11 < arrayListArr.length) {
                                int size = arrayListArr[i11].size();
                                if (cuVar.f36691c.length > 1) {
                                    size = Math.min(quVar.f37406x1.J * 2, size);
                                }
                                i30 += size + 2;
                                if (i7 >= i30) {
                                    i11++;
                                }
                            }
                        }
                        ArrayList arrayList3 = cuVar.f36690b;
                        if (arrayList3 != null && i11 < arrayList3.size()) {
                            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) cuVar.f36690b.get(i11);
                        }
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            ArrayList arrayList4 = new ArrayList();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                            tL_inputStickerSetID.f26980id = stickerSet.f26987id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            arrayList4.add(tL_inputStickerSetID);
                            new du(quVar, f2Var, quVar.getContext(), this.f33583b, arrayList4).show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.g1 g1Var = quVar.A1;
                if (g1Var != null) {
                    g1Var.d(true);
                    quVar.A1 = null;
                    return;
                } else if ((f2Var instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var).Z.getVisibility() == 0 && (view instanceof ju)) {
                    q5 q5Var = ((ju) view).f35077c;
                    try {
                        TLRPC.Document document = q5Var.document;
                        if (document == null) {
                            document = h5.e(quVar.f28669a, q5Var.getDocumentId());
                        }
                        SpannableString spannableString = new SpannableString(org.telegram.messenger.ij.U(document));
                        spannableString.setSpan(q5Var, 0, spannableString.length(), 33);
                        ((org.telegram.ui.cn) f2Var).Z.E0.getText().append((CharSequence) spannableString);
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

    public fm(qu quVar, ArrayList arrayList, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f33584c = quVar;
        this.d = arrayList;
        this.f33585e = f2Var;
        this.f33583b = h6Var;
    }
}
