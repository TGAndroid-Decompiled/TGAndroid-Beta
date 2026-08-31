package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.kb1;
public final class vm implements jl0 {
    public final int f31924a = 1;
    public final org.telegram.ui.ActionBar.g6 f31925b;
    public final Object f31926c;
    public final Object d;
    public final Object f31927e;

    public vm(sn snVar, org.telegram.ui.ActionBar.g6 g6Var, mi miVar, Context context) {
        this.f31926c = snVar;
        this.f31925b = g6Var;
        this.d = miVar;
        this.f31927e = context;
    }

    @Override
    public final void f(int i10, View view) {
        boolean z4;
        boolean z10;
        boolean z11;
        switch (this.f31924a) {
            case 0:
                sn snVar = (sn) this.f31926c;
                mi miVar = (mi) this.d;
                Context context = (Context) this.f31927e;
                m40 m40Var = snVar.f31131y;
                boolean[] zArr = snVar.I;
                b7.l0 l0Var = snVar.K0;
                gn gnVar = snVar.v;
                qn qnVar = snVar.f31120r;
                kb1 kb1Var = snVar.f31122s;
                int i11 = snVar.I0;
                org.telegram.ui.ActionBar.g6 g6Var = this.f31925b;
                if (i10 == i11) {
                    hh.f fVar = new hh.f(snVar.getContext(), g6Var);
                    fVar.f7706h0 = new androidx.biometric.f0(snVar, 26);
                    ArrayList arrayList = snVar.M0;
                    fVar.Z = null;
                    fVar.f7710l0 = new HashSet(arrayList);
                    fVar.show();
                    return;
                } else if (i10 == snVar.F0) {
                    q70 F = q70.F(miVar.container, g6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = snVar.Q0;
                        if (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            y11 a2 = y11.a(i13);
                            int i14 = org.telegram.ui.ActionBar.k6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i14, snVar.f26545a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.k6.E8, new bh.a(snVar, i13, view, 28));
                            i12++;
                        } else {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.ih(snVar, context, view, g6Var, 10), false);
                            F.f30330t = false;
                            F.f30329s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i10 == snVar.f31121r0) {
                    snVar.P();
                    return;
                } else {
                    boolean z12 = view instanceof org.telegram.ui.Cells.s8;
                    if (z12 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z13 = snVar.W;
                        in inVar = snVar.f31129x;
                        if (inVar != null) {
                            inVar.f();
                        }
                        b7.l0[] l0VarArr = snVar.L0;
                        int length = l0VarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                b7.l0 l0Var2 = l0VarArr[i15];
                                if (i10 == l0Var2.f1839b) {
                                    boolean z14 = l0Var2.f1838a;
                                    z10 = !z14;
                                    l0Var2.f1838a = z10;
                                    int i16 = l0Var.f1839b;
                                    sn snVar2 = (sn) l0Var.f1840c;
                                    qn qnVar2 = snVar2.f31120r;
                                    if (i10 == i16) {
                                        kb1Var.setItemAnimator(gnVar);
                                        int i17 = l0Var.f1839b;
                                        if (i17 >= 0) {
                                            f2.m1 K = snVar2.f31122s.K(i17);
                                            if (K != null) {
                                                View view2 = K.f5875a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z10);
                                                }
                                            }
                                            qnVar2.m(l0Var.f1839b);
                                        }
                                        if (!z14) {
                                            qnVar2.s(l0Var.f1839b + 1, 1);
                                        } else {
                                            qnVar2.t(l0Var.f1839b + 1, 1);
                                        }
                                        snVar.h0();
                                    }
                                    z4 = true;
                                } else {
                                    i15++;
                                }
                            } else {
                                z4 = false;
                                z10 = false;
                            }
                        }
                        if (!z4) {
                            if (i10 == snVar.f31132y0) {
                                z10 = snVar.U;
                                snVar.U = !z10;
                                snVar.R();
                            } else {
                                int i18 = snVar.f31126v0;
                                if (i10 == i18) {
                                    z10 = !snVar.f31098c0;
                                    snVar.f31098c0 = z10;
                                } else if (i10 == snVar.f31133z0) {
                                    if (!snVar.W && !snVar.U) {
                                        snVar.Q = !snVar.Q;
                                    }
                                    z10 = snVar.Q;
                                } else if (i10 == snVar.B0) {
                                    z10 = !snVar.P;
                                    snVar.P = z10;
                                } else if (i10 == snVar.E0) {
                                    if (snVar.R == 0 && snVar.S == 0) {
                                        snVar.R = 86400;
                                        snVar.S = 0;
                                        int i19 = snVar.F0;
                                        snVar.h0();
                                        if (i19 < 0) {
                                            f2.m1 K2 = kb1Var.K(snVar.E0);
                                            if (K2 != null) {
                                                View view3 = K2.f5875a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            kb1Var.setItemAnimator(gnVar);
                                            qnVar.s(snVar.F0, 3);
                                        }
                                    } else {
                                        snVar.R = 0;
                                        snVar.S = 0;
                                        int i20 = snVar.F0;
                                        snVar.h0();
                                        kb1Var.setItemAnimator(gnVar);
                                        qnVar.t(i20, 3);
                                        f2.m1 K3 = kb1Var.K(snVar.E0);
                                        if (K3 != null) {
                                            View view4 = K3.f5875a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (snVar.R == 0 && snVar.S == 0) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    z10 = z11;
                                } else if (i10 == snVar.A0) {
                                    z10 = !snVar.O;
                                    snVar.O = z10;
                                } else if (i10 == snVar.f31128w0) {
                                    z10 = !snVar.f31100d0;
                                    snVar.f31100d0 = z10;
                                    snVar.h0();
                                    int i21 = snVar.f31126v0;
                                    if (i21 >= 0 && i18 < 0) {
                                        kb1Var.setItemAnimator(gnVar);
                                        qnVar.o(snVar.f31126v0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        kb1Var.setItemAnimator(gnVar);
                                        qnVar.u(i18);
                                    }
                                } else if (i10 == snVar.C0) {
                                    boolean z15 = snVar.V;
                                    z10 = !z15;
                                    snVar.V = z10;
                                    if (z15 && snVar.W) {
                                        boolean z16 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z16) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z16 = true;
                                            }
                                        }
                                    }
                                    int childCount = kb1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        f2.m1 T = kb1Var.T(kb1Var.getChildAt(i23));
                                        if (T.f5879f == 5) {
                                            ((org.telegram.ui.Cells.c6) T.f5875a).f22647a.a(snVar.V, true);
                                        }
                                    }
                                } else if (i10 == snVar.G0) {
                                    z10 = !snVar.T;
                                    snVar.T = z10;
                                } else if (i10 == snVar.D0) {
                                    if (!snVar.f31096b0) {
                                        kb1Var.setItemAnimator(gnVar);
                                        z10 = !snVar.W;
                                        snVar.W = z10;
                                        int i24 = snVar.f31114l0;
                                        snVar.h0();
                                        if (snVar.W) {
                                            qnVar.s(snVar.f31114l0, 3);
                                        } else {
                                            qnVar.t(i24, 3);
                                        }
                                        qnVar.m(snVar.f31130x0);
                                        if (snVar.W) {
                                            snVar.O = false;
                                            int i25 = snVar.A0;
                                            if (i25 >= 0) {
                                                f2.m1 K4 = kb1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.f5875a).setChecked(false);
                                                } else {
                                                    qnVar.m(snVar.A0);
                                                }
                                            }
                                        } else {
                                            int i26 = snVar.A0;
                                            if (i26 >= 0 && kb1Var.K(i26) == null) {
                                                qnVar.m(snVar.A0);
                                            }
                                        }
                                        snVar.R();
                                        if (snVar.W && !snVar.V) {
                                            boolean z17 = false;
                                            for (int i27 = 0; i27 < zArr.length; i27++) {
                                                if (z17) {
                                                    zArr[i27] = false;
                                                } else if (zArr[i27]) {
                                                    z17 = true;
                                                }
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                        if (snVar.f31094a0 && !snVar.W) {
                            m40Var.b(true);
                        }
                        kb1Var.getChildCount();
                        for (int i28 = snVar.f31119q0; i28 < snVar.f31119q0 + snVar.J; i28++) {
                            f2.m1 K5 = kb1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.f5875a;
                                if (view5 instanceof org.telegram.ui.Cells.c6) {
                                    org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view5;
                                    c6Var.m(snVar.W, true);
                                    c6Var.f22653r.a(zArr[i28 - snVar.f31119q0], z13);
                                    if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == snVar.D0 && !snVar.f31094a0) {
                                        m40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        m40Var.f(c6Var.getCheckBox(), true);
                                        snVar.f31094a0 = true;
                                    }
                                }
                            }
                        }
                        if (z12) {
                            ((org.telegram.ui.Cells.s8) view).setChecked(z10);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z10);
                        }
                        snVar.T();
                        return;
                    }
                    return;
                }
                break;
            default:
                ov.n((ov) this.f31926c, (ArrayList) this.d, (org.telegram.ui.ActionBar.p2) this.f31927e, this.f31925b, view, i10);
                return;
        }
    }

    public vm(ov ovVar, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f31926c = ovVar;
        this.d = arrayList;
        this.f31927e = p2Var;
        this.f31925b = g6Var;
    }
}
