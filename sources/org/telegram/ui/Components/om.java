package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class om implements gj0 {
    public final int f38020a = 0;
    public final org.telegram.ui.ActionBar.e6 f38021b;
    public final Object f38022c;
    public final Object d;
    public final Object f38023e;

    public om(jn jnVar, org.telegram.ui.ActionBar.e6 e6Var, ki kiVar, Context context) {
        this.f38022c = jnVar;
        this.f38021b = e6Var;
        this.d = kiVar;
        this.f38023e = context;
    }

    @Override
    public final void b(int i7, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10 = this.f38020a;
        int i11 = 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        Object obj = this.f38023e;
        Object obj2 = this.d;
        Object obj3 = this.f38022c;
        switch (i10) {
            case 0:
                jn jnVar = (jn) obj3;
                ki kiVar = (ki) obj2;
                Context context = (Context) obj;
                b30 b30Var = jnVar.E;
                boolean[] zArr = jnVar.M;
                bg.v0 v0Var = jnVar.O0;
                ym ymVar = jnVar.f36102w;
                org.telegram.ui.l4 l4Var = jnVar.f36094r;
                org.telegram.ui.b61 b61Var = jnVar.f36097s;
                int i12 = jnVar.M0;
                org.telegram.ui.ActionBar.e6 e6Var = this.f38021b;
                if (i7 == i12) {
                    vh.h hVar = new vh.h(jnVar.getContext(), e6Var);
                    hVar.f59004g2 = new org.telegram.messenger.ou(jnVar, 6);
                    ArrayList arrayList = jnVar.Q0;
                    hVar.Y1 = null;
                    hVar.f59008k2 = new HashSet(arrayList);
                    hVar.show();
                    return;
                } else if (i7 == jnVar.J0) {
                    m60 F = m60.F(kiVar.f29685c, e6Var, view);
                    int i13 = 0;
                    while (true) {
                        int[] iArr = jnVar.U0;
                        if (i13 < iArr.length) {
                            int i14 = iArr[i13];
                            c01 a10 = c01.a(i14);
                            int i15 = org.telegram.ui.ActionBar.j6.F8;
                            org.telegram.ui.ActionBar.q6.x(jnVar, a10, i15, e6Var, PorterDuff.Mode.SRC_IN);
                            F.b(0, a10, org.telegram.messenger.hd.G(i14 / 3600, "Hours", new Object[0]), i15, org.telegram.ui.ActionBar.j6.E8, new org.telegram.ui.f0(jnVar, i14, view, 8));
                            i13++;
                        } else {
                            F.c(2131232107, org.telegram.messenger.hd.M0(2131747131, null), new org.telegram.ui.ActionBar.l5(jnVar, context, view, e6Var, 22), false);
                            F.f37112t = false;
                            F.f37111s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i7 == jnVar.f36101v0) {
                    jnVar.U();
                    return;
                } else {
                    boolean z14 = view instanceof org.telegram.ui.Cells.q8;
                    if (z14 || (view instanceof org.telegram.ui.Cells.x5)) {
                        boolean z15 = jnVar.f36068d0;
                        an anVar = jnVar.f36106y;
                        if (anVar != null) {
                            anVar.f();
                        }
                        bg.v0[] v0VarArr = jnVar.P0;
                        int length = v0VarArr.length;
                        int i16 = 0;
                        while (true) {
                            if (i16 < length) {
                                bg.v0 v0Var2 = v0VarArr[i16];
                                if (i7 == v0Var2.f3347b) {
                                    boolean z16 = v0Var2.f3346a;
                                    z11 = !z16;
                                    v0Var2.f3346a = z11;
                                    int i17 = v0Var.f3347b;
                                    jn jnVar2 = (jn) v0Var.f3348c;
                                    org.telegram.ui.l4 l4Var2 = jnVar2.f36094r;
                                    if (i7 == i17) {
                                        b61Var.setItemAnimator(ymVar);
                                        int i18 = v0Var.f3347b;
                                        if (i18 >= 0) {
                                            v4.e1 K = jnVar2.f36097s.K(i18);
                                            if (K != null) {
                                                View view2 = K.f58535a;
                                                if (view2 instanceof org.telegram.ui.Cells.x5) {
                                                    ((org.telegram.ui.Cells.x5) view2).setDivider(z11);
                                                }
                                            }
                                            l4Var2.g(v0Var.f3347b);
                                        }
                                        if (!z16) {
                                            z10 = true;
                                            l4Var2.o(v0Var.f3347b + 1, 1);
                                        } else {
                                            z10 = true;
                                            l4Var2.p(v0Var.f3347b + 1, 1);
                                        }
                                        jnVar.n0();
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
                            if (i7 == jnVar.C0) {
                                z11 = jnVar.f36064b0;
                                jnVar.f36064b0 = !z11;
                                jnVar.W();
                            } else {
                                int i19 = jnVar.f36108z0;
                                if (i7 == i19) {
                                    z11 = !jnVar.f36074g0;
                                    jnVar.f36074g0 = z11;
                                } else if (i7 == jnVar.D0) {
                                    if (!jnVar.f36068d0 && !jnVar.f36064b0) {
                                        jnVar.U ^= z10;
                                    }
                                    z11 = jnVar.U;
                                } else if (i7 == jnVar.F0) {
                                    z11 = !jnVar.T;
                                    jnVar.T = z11;
                                } else if (i7 == jnVar.I0) {
                                    if (jnVar.V == 0 && jnVar.W == 0) {
                                        jnVar.V = 86400;
                                        jnVar.W = 0;
                                        int i20 = jnVar.J0;
                                        jnVar.n0();
                                        if (i20 < 0) {
                                            v4.e1 K2 = b61Var.K(jnVar.I0);
                                            if (K2 != null) {
                                                View view3 = K2.f58535a;
                                                if (view3 instanceof org.telegram.ui.Cells.x5) {
                                                    ((org.telegram.ui.Cells.x5) view3).setDivider(z10);
                                                }
                                            }
                                            b61Var.setItemAnimator(ymVar);
                                            l4Var.o(jnVar.J0, 3);
                                        }
                                    } else {
                                        jnVar.V = 0;
                                        jnVar.W = 0;
                                        int i21 = jnVar.J0;
                                        jnVar.n0();
                                        b61Var.setItemAnimator(ymVar);
                                        l4Var.p(i21, 3);
                                        v4.e1 K3 = b61Var.K(jnVar.I0);
                                        if (K3 != null) {
                                            View view4 = K3.f58535a;
                                            if (view4 instanceof org.telegram.ui.Cells.x5) {
                                                ((org.telegram.ui.Cells.x5) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (jnVar.V == 0 && jnVar.W == 0) {
                                        z13 = false;
                                    } else {
                                        z13 = z10;
                                    }
                                    z11 = z13;
                                } else if (i7 == jnVar.E0) {
                                    z11 = !jnVar.S;
                                    jnVar.S = z11;
                                } else if (i7 == jnVar.A0) {
                                    z11 = jnVar.f36076h0 ^ z10;
                                    jnVar.f36076h0 = z11;
                                    jnVar.n0();
                                    int i22 = jnVar.f36108z0;
                                    if (i22 >= 0 && i19 < 0) {
                                        b61Var.setItemAnimator(ymVar);
                                        l4Var.i(jnVar.f36108z0);
                                    } else if (i19 >= 0 && i22 < 0) {
                                        b61Var.setItemAnimator(ymVar);
                                        l4Var.s(i19);
                                    }
                                } else if (i7 == jnVar.G0) {
                                    boolean z17 = jnVar.f36066c0;
                                    z11 = !z17;
                                    jnVar.f36066c0 = z11;
                                    if (z17 && jnVar.f36068d0) {
                                        boolean z18 = false;
                                        for (int i23 = 0; i23 < zArr.length; i23++) {
                                            if (z18) {
                                                zArr[i23] = false;
                                            } else if (zArr[i23]) {
                                                z18 = z10;
                                            }
                                        }
                                    }
                                    int childCount = b61Var.getChildCount();
                                    for (int i24 = 0; i24 < childCount; i24++) {
                                        v4.e1 T = b61Var.T(b61Var.getChildAt(i24));
                                        if (T.f58539f == 5) {
                                            ((org.telegram.ui.Cells.z5) T.f58535a).f32115a.a(jnVar.f36066c0, z10);
                                        }
                                    }
                                } else if (i7 == jnVar.K0) {
                                    z11 = !jnVar.f36062a0;
                                    jnVar.f36062a0 = z11;
                                } else if (i7 == jnVar.H0) {
                                    if (!jnVar.f36072f0) {
                                        b61Var.setItemAnimator(ymVar);
                                        z11 = !jnVar.f36068d0;
                                        jnVar.f36068d0 = z11;
                                        int i25 = jnVar.f36090p0;
                                        jnVar.n0();
                                        if (jnVar.f36068d0) {
                                            l4Var.o(jnVar.f36090p0, 3);
                                        } else {
                                            l4Var.p(i25, 3);
                                        }
                                        l4Var.g(jnVar.B0);
                                        if (jnVar.f36068d0) {
                                            jnVar.S = false;
                                            int i26 = jnVar.E0;
                                            if (i26 >= 0) {
                                                v4.e1 K4 = b61Var.K(i26);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.x5) K4.f58535a).setChecked(false);
                                                } else {
                                                    l4Var.g(jnVar.E0);
                                                }
                                            }
                                        } else {
                                            int i27 = jnVar.E0;
                                            if (i27 >= 0 && b61Var.K(i27) == null) {
                                                l4Var.g(jnVar.E0);
                                            }
                                        }
                                        jnVar.W();
                                        if (jnVar.f36068d0 && !jnVar.f36066c0) {
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
                        if (jnVar.f36070e0 && !jnVar.f36068d0) {
                            b61Var.getChildCount();
                            b30Var.a();
                        }
                        for (int i29 = jnVar.f36100u0; i29 < jnVar.f36100u0 + jnVar.N; i29++) {
                            v4.e1 K5 = b61Var.K(i29);
                            if (K5 != null) {
                                View view5 = K5.f58535a;
                                if (view5 instanceof org.telegram.ui.Cells.z5) {
                                    org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view5;
                                    z5Var.n(jnVar.f36068d0, z10);
                                    z5Var.f32121r.a(zArr[i29 - jnVar.f36100u0], z15);
                                    if (z5Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == jnVar.H0 && !jnVar.f36070e0) {
                                        b30Var.setText(org.telegram.messenger.hd.M0(2131747155, null));
                                        b30Var.c(z5Var.getCheckBox());
                                        jnVar.f36070e0 = z10;
                                    }
                                }
                            }
                        }
                        if (z14) {
                            ((org.telegram.ui.Cells.q8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.x5) {
                            ((org.telegram.ui.Cells.x5) view).setChecked(z11);
                        }
                        jnVar.Y();
                        return;
                    }
                    return;
                }
                break;
            default:
                wu wuVar = (wu) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                iu iuVar = wuVar.f41451p1;
                if (arrayList2 != null && arrayList2.size() > 1) {
                    if (SystemClock.elapsedRealtime() - wuVar.L1 >= 250) {
                        int i30 = 0;
                        while (true) {
                            ArrayList[] arrayListArr = iuVar.f40162c;
                            if (i11 < arrayListArr.length) {
                                int size = arrayListArr[i11].size();
                                if (iuVar.f40162c.length > 1) {
                                    size = Math.min(wuVar.f41460y1.J * 2, size);
                                }
                                i30 += size + 2;
                                if (i7 >= i30) {
                                    i11++;
                                }
                            }
                        }
                        ArrayList arrayList3 = iuVar.f40161b;
                        if (arrayList3 != null && i11 < arrayList3.size()) {
                            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) iuVar.f40161b.get(i11);
                        }
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            ArrayList arrayList4 = new ArrayList();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                            tL_inputStickerSetID.f28071id = stickerSet.f28078id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            arrayList4.add(tL_inputStickerSetID);
                            new ju(wuVar, e2Var, wuVar.getContext(), this.f38021b, arrayList4).show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.g1 g1Var = wuVar.B1;
                if (g1Var != null) {
                    g1Var.d(true);
                    wuVar.B1 = null;
                    return;
                } else if ((e2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var).f45117a0.getVisibility() == 0 && (view instanceof pu)) {
                    p5 p5Var = ((pu) view).f38411c;
                    try {
                        TLRPC.Document document = p5Var.document;
                        if (document == null) {
                            document = g5.e(wuVar.f29679a, p5Var.getDocumentId());
                        }
                        SpannableString spannableString = new SpannableString(org.telegram.messenger.gj.U(document));
                        spannableString.setSpan(p5Var, 0, spannableString.length(), 33);
                        ((org.telegram.ui.an) e2Var).f45117a0.F0.getText().append((CharSequence) spannableString);
                        wuVar.L0();
                        wuVar.dismiss();
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

    public om(wu wuVar, ArrayList arrayList, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f38022c = wuVar;
        this.d = arrayList;
        this.f38023e = e2Var;
        this.f38021b = e6Var;
    }
}
