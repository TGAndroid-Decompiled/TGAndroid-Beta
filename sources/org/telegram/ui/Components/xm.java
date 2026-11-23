package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class xm implements qj0 {
    public final int f42121a = 1;
    public final org.telegram.ui.ActionBar.h6 f42122b;
    public final Object f42123c;
    public final Object d;
    public final Object f42124e;

    public xm(tn tnVar, org.telegram.ui.ActionBar.h6 h6Var, ui uiVar, Context context) {
        this.f42123c = tnVar;
        this.f42122b = h6Var;
        this.d = uiVar;
        this.f42124e = context;
    }

    @Override
    public final void c(int i7, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10 = this.f42121a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        Object obj = this.f42124e;
        Object obj2 = this.d;
        Object obj3 = this.f42123c;
        int i11 = 0;
        switch (i10) {
            case 0:
                tn tnVar = (tn) obj3;
                ui uiVar = (ui) obj2;
                Context context = (Context) obj;
                m30 m30Var = tnVar.E;
                boolean[] zArr = tnVar.M;
                bg.w0 w0Var = tnVar.O0;
                hn hnVar = tnVar.f39967w;
                org.telegram.ui.l4 l4Var = tnVar.f39959r;
                org.telegram.ui.f61 f61Var = tnVar.f39962s;
                int i12 = tnVar.M0;
                org.telegram.ui.ActionBar.h6 h6Var = this.f42122b;
                if (i7 == i12) {
                    vh.g gVar = new vh.g(tnVar.getContext(), h6Var);
                    gVar.f59577g2 = new jn(tnVar, 0);
                    ArrayList arrayList = tnVar.Q0;
                    gVar.Y1 = null;
                    gVar.f59581k2 = new HashSet(arrayList);
                    gVar.show();
                    return;
                } else if (i7 == tnVar.J0) {
                    a70 G = a70.G(uiVar.f30145c, h6Var, view);
                    int i13 = 0;
                    while (true) {
                        int[] iArr = tnVar.U0;
                        if (i13 < iArr.length) {
                            int i14 = iArr[i13];
                            l01 a10 = l01.a(i14);
                            int i15 = org.telegram.ui.ActionBar.m6.F8;
                            org.telegram.ui.ActionBar.t6.x(tnVar, a10, i15, h6Var, PorterDuff.Mode.SRC_IN);
                            G.b(0, a10, org.telegram.messenger.hd.G(i14 / 3600, "Hours", new Object[0]), i15, org.telegram.ui.ActionBar.m6.E8, new org.telegram.ui.f0(tnVar, i14, view, 8));
                            i13++;
                        } else {
                            G.c(2131232108, org.telegram.messenger.hd.N0(2131746937, null), new org.telegram.messenger.camera.i(tnVar, context, view, h6Var, 25), false);
                            G.f33365t = false;
                            G.f33363s = 0;
                            G.a0();
                            return;
                        }
                    }
                } else if (i7 == tnVar.f39966v0) {
                    tnVar.U();
                    return;
                } else {
                    boolean z15 = view instanceof org.telegram.ui.Cells.s8;
                    if (z15 || (view instanceof org.telegram.ui.Cells.z5)) {
                        boolean z16 = tnVar.f39933d0;
                        kn knVar = tnVar.f39971y;
                        if (knVar != null) {
                            knVar.f();
                        }
                        bg.w0[] w0VarArr = tnVar.P0;
                        int length = w0VarArr.length;
                        int i16 = 0;
                        while (true) {
                            if (i16 < length) {
                                bg.w0 w0Var2 = w0VarArr[i16];
                                if (i7 == w0Var2.f3325b) {
                                    boolean z17 = w0Var2.f3324a;
                                    z11 = !z17;
                                    w0Var2.f3324a = z11;
                                    int i17 = w0Var.f3325b;
                                    tn tnVar2 = (tn) w0Var.f3326c;
                                    org.telegram.ui.l4 l4Var2 = tnVar2.f39959r;
                                    if (i7 == i17) {
                                        f61Var.setItemAnimator(hnVar);
                                        int i18 = w0Var.f3325b;
                                        if (i18 >= 0) {
                                            v4.e1 K = tnVar2.f39962s.K(i18);
                                            if (K != null) {
                                                View view2 = K.f59111a;
                                                if (view2 instanceof org.telegram.ui.Cells.z5) {
                                                    ((org.telegram.ui.Cells.z5) view2).setDivider(z11);
                                                }
                                            }
                                            l4Var2.g(w0Var.f3325b);
                                        }
                                        if (!z17) {
                                            z14 = true;
                                            l4Var2.o(w0Var.f3325b + 1, 1);
                                        } else {
                                            z14 = true;
                                            l4Var2.p(w0Var.f3325b + 1, 1);
                                        }
                                        tnVar.n0();
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
                            if (i7 == tnVar.C0) {
                                z11 = tnVar.f39929b0;
                                tnVar.f39929b0 = !z11;
                                tnVar.W();
                            } else {
                                int i19 = tnVar.f39973z0;
                                if (i7 == i19) {
                                    z11 = tnVar.f39939g0 ^ z10;
                                    tnVar.f39939g0 = z11;
                                } else if (i7 == tnVar.D0) {
                                    if (!tnVar.f39933d0 && !tnVar.f39929b0) {
                                        tnVar.U ^= z10;
                                    }
                                    z11 = tnVar.U;
                                } else if (i7 == tnVar.F0) {
                                    z11 = tnVar.T ^ z10;
                                    tnVar.T = z11;
                                } else if (i7 == tnVar.I0) {
                                    if (tnVar.V == 0 && tnVar.W == 0) {
                                        tnVar.V = 86400;
                                        tnVar.W = 0;
                                        int i20 = tnVar.J0;
                                        tnVar.n0();
                                        if (i20 < 0) {
                                            v4.e1 K2 = f61Var.K(tnVar.I0);
                                            if (K2 != null) {
                                                View view3 = K2.f59111a;
                                                if (view3 instanceof org.telegram.ui.Cells.z5) {
                                                    ((org.telegram.ui.Cells.z5) view3).setDivider(z10);
                                                }
                                            }
                                            f61Var.setItemAnimator(hnVar);
                                            l4Var.o(tnVar.J0, 3);
                                        }
                                    } else {
                                        tnVar.V = 0;
                                        tnVar.W = 0;
                                        int i21 = tnVar.J0;
                                        tnVar.n0();
                                        f61Var.setItemAnimator(hnVar);
                                        l4Var.p(i21, 3);
                                        v4.e1 K3 = f61Var.K(tnVar.I0);
                                        if (K3 != null) {
                                            View view4 = K3.f59111a;
                                            if (view4 instanceof org.telegram.ui.Cells.z5) {
                                                ((org.telegram.ui.Cells.z5) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (tnVar.V == 0 && tnVar.W == 0) {
                                        z13 = false;
                                    } else {
                                        z13 = z10;
                                    }
                                    z11 = z13;
                                } else if (i7 == tnVar.E0) {
                                    z11 = tnVar.S ^ z10;
                                    tnVar.S = z11;
                                } else if (i7 == tnVar.A0) {
                                    z11 = tnVar.f39941h0 ^ z10;
                                    tnVar.f39941h0 = z11;
                                    tnVar.n0();
                                    int i22 = tnVar.f39973z0;
                                    if (i22 >= 0 && i19 < 0) {
                                        f61Var.setItemAnimator(hnVar);
                                        l4Var.i(tnVar.f39973z0);
                                    } else if (i19 >= 0 && i22 < 0) {
                                        f61Var.setItemAnimator(hnVar);
                                        l4Var.s(i19);
                                    }
                                } else if (i7 == tnVar.G0) {
                                    boolean z18 = tnVar.f39931c0;
                                    boolean z19 = !z18;
                                    tnVar.f39931c0 = z19;
                                    if (z18 && tnVar.f39933d0) {
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
                                        v4.e1 T = f61Var.T(f61Var.getChildAt(i24));
                                        if (T.f59115f == 5) {
                                            ((org.telegram.ui.Cells.b6) T.f59111a).f30439a.a(tnVar.f39931c0, z10);
                                        }
                                    }
                                    z11 = z19;
                                } else if (i7 == tnVar.K0) {
                                    z11 = tnVar.f39927a0 ^ z10;
                                    tnVar.f39927a0 = z11;
                                } else if (i7 == tnVar.H0) {
                                    if (!tnVar.f39937f0) {
                                        f61Var.setItemAnimator(hnVar);
                                        z11 = tnVar.f39933d0 ^ z10;
                                        tnVar.f39933d0 = z11;
                                        int i25 = tnVar.f39955p0;
                                        tnVar.n0();
                                        if (tnVar.f39933d0) {
                                            l4Var.o(tnVar.f39955p0, 3);
                                        } else {
                                            l4Var.p(i25, 3);
                                        }
                                        l4Var.g(tnVar.B0);
                                        if (tnVar.f39933d0) {
                                            tnVar.S = false;
                                            int i26 = tnVar.E0;
                                            if (i26 >= 0) {
                                                v4.e1 K4 = f61Var.K(i26);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.z5) K4.f59111a).setChecked(false);
                                                } else {
                                                    l4Var.g(tnVar.E0);
                                                }
                                            }
                                        } else {
                                            int i27 = tnVar.E0;
                                            if (i27 >= 0 && f61Var.K(i27) == null) {
                                                l4Var.g(tnVar.E0);
                                            }
                                        }
                                        tnVar.W();
                                        if (tnVar.f39933d0 && !tnVar.f39931c0) {
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
                        if (tnVar.f39935e0 && !tnVar.f39933d0) {
                            f61Var.getChildCount();
                            m30Var.a();
                        }
                        for (int i29 = tnVar.f39965u0; i29 < tnVar.f39965u0 + tnVar.N; i29++) {
                            v4.e1 K5 = f61Var.K(i29);
                            if (K5 != null) {
                                View view5 = K5.f59111a;
                                if (view5 instanceof org.telegram.ui.Cells.b6) {
                                    org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view5;
                                    b6Var.n(tnVar.f39933d0, z10);
                                    b6Var.f30445r.a(zArr[i29 - tnVar.f39965u0], z16);
                                    if (b6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == tnVar.H0 && !tnVar.f39935e0) {
                                        m30Var.setText(org.telegram.messenger.hd.N0(2131746961, null));
                                        m30Var.c(b6Var.getCheckBox());
                                        tnVar.f39935e0 = z10;
                                    }
                                }
                            }
                        }
                        if (z15) {
                            ((org.telegram.ui.Cells.s8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.z5) {
                            ((org.telegram.ui.Cells.z5) view).setChecked(z11);
                        }
                        tnVar.Y();
                        return;
                    }
                    return;
                }
                break;
            default:
                dv dvVar = (dv) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                pu puVar = dvVar.f34571p1;
                if (arrayList2 != null && arrayList2.size() > 1) {
                    if (SystemClock.elapsedRealtime() - dvVar.L1 >= 250) {
                        int i30 = 0;
                        while (true) {
                            ArrayList[] arrayListArr = puVar.f33892c;
                            if (i11 < arrayListArr.length) {
                                int size = arrayListArr[i11].size();
                                if (puVar.f33892c.length > 1) {
                                    size = Math.min(dvVar.f34580y1.J * 2, size);
                                }
                                i30 += size + 2;
                                if (i7 >= i30) {
                                    i11++;
                                }
                            }
                        }
                        ArrayList arrayList3 = puVar.f33891b;
                        if (arrayList3 != null && i11 < arrayList3.size()) {
                            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) puVar.f33891b.get(i11);
                        }
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            ArrayList arrayList4 = new ArrayList();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                            tL_inputStickerSetID.f28418id = stickerSet.f28425id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            arrayList4.add(tL_inputStickerSetID);
                            new qu(dvVar, g2Var, dvVar.getContext(), this.f42122b, arrayList4).show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.g1 g1Var = dvVar.B1;
                if (g1Var != null) {
                    g1Var.d(true);
                    dvVar.B1 = null;
                    return;
                } else if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).f45903a0.getVisibility() == 0 && (view instanceof wu)) {
                    y5 y5Var = ((wu) view).f41858c;
                    try {
                        TLRPC.Document document = y5Var.document;
                        if (document == null) {
                            document = p5.e(dvVar.f30139a, y5Var.getDocumentId());
                        }
                        SpannableString spannableString = new SpannableString(org.telegram.messenger.gj.U(document));
                        spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
                        ((org.telegram.ui.bn) g2Var).f45903a0.F0.getText().append((CharSequence) spannableString);
                        dvVar.M0();
                        dvVar.dismiss();
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

    public xm(dv dvVar, ArrayList arrayList, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f42123c = dvVar;
        this.d = arrayList;
        this.f42124e = g2Var;
        this.f42122b = h6Var;
    }
}
