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
import org.telegram.ui.qb1;
public final class um implements il0 {
    public final int f31644a = 1;
    public final org.telegram.ui.ActionBar.g6 f31645b;
    public final Object f31646c;
    public final Object d;
    public final Object f31647e;

    public um(rn rnVar, org.telegram.ui.ActionBar.g6 g6Var, mi miVar, Context context) {
        this.f31646c = rnVar;
        this.f31645b = g6Var;
        this.d = miVar;
        this.f31647e = context;
    }

    @Override
    public final void f(int i10, View view) {
        boolean z4;
        boolean z10;
        boolean z11;
        switch (this.f31644a) {
            case 0:
                rn rnVar = (rn) this.f31646c;
                mi miVar = (mi) this.d;
                Context context = (Context) this.f31647e;
                m40 m40Var = rnVar.f30851y;
                boolean[] zArr = rnVar.I;
                b7.l0 l0Var = rnVar.K0;
                fn fnVar = rnVar.v;
                pn pnVar = rnVar.f30840r;
                qb1 qb1Var = rnVar.f30842s;
                int i11 = rnVar.I0;
                org.telegram.ui.ActionBar.g6 g6Var = this.f31645b;
                if (i10 == i11) {
                    hh.f fVar = new hh.f(rnVar.getContext(), g6Var);
                    fVar.f7706h0 = new androidx.biometric.f0(rnVar, 26);
                    ArrayList arrayList = rnVar.M0;
                    fVar.Z = null;
                    fVar.f7710l0 = new HashSet(arrayList);
                    fVar.show();
                    return;
                } else if (i10 == rnVar.F0) {
                    q70 F = q70.F(miVar.container, g6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = rnVar.Q0;
                        if (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            x11 a2 = x11.a(i13);
                            int i14 = org.telegram.ui.ActionBar.k6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i14, rnVar.f26589a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.k6.E8, new bh.a(rnVar, i13, view, 28));
                            i12++;
                        } else {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.ih(rnVar, context, view, g6Var, 10), false);
                            F.f30334t = false;
                            F.f30333s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i10 == rnVar.f30841r0) {
                    rnVar.P();
                    return;
                } else {
                    boolean z12 = view instanceof org.telegram.ui.Cells.s8;
                    if (z12 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z13 = rnVar.W;
                        hn hnVar = rnVar.f30849x;
                        if (hnVar != null) {
                            hnVar.f();
                        }
                        b7.l0[] l0VarArr = rnVar.L0;
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
                                    rn rnVar2 = (rn) l0Var.f1840c;
                                    pn pnVar2 = rnVar2.f30840r;
                                    if (i10 == i16) {
                                        qb1Var.setItemAnimator(fnVar);
                                        int i17 = l0Var.f1839b;
                                        if (i17 >= 0) {
                                            f2.m1 K = rnVar2.f30842s.K(i17);
                                            if (K != null) {
                                                View view2 = K.f5875a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z10);
                                                }
                                            }
                                            pnVar2.m(l0Var.f1839b);
                                        }
                                        if (!z14) {
                                            pnVar2.s(l0Var.f1839b + 1, 1);
                                        } else {
                                            pnVar2.t(l0Var.f1839b + 1, 1);
                                        }
                                        rnVar.h0();
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
                            if (i10 == rnVar.f30852y0) {
                                z10 = rnVar.U;
                                rnVar.U = !z10;
                                rnVar.R();
                            } else {
                                int i18 = rnVar.f30846v0;
                                if (i10 == i18) {
                                    z10 = !rnVar.f30818c0;
                                    rnVar.f30818c0 = z10;
                                } else if (i10 == rnVar.f30853z0) {
                                    if (!rnVar.W && !rnVar.U) {
                                        rnVar.Q = !rnVar.Q;
                                    }
                                    z10 = rnVar.Q;
                                } else if (i10 == rnVar.B0) {
                                    z10 = !rnVar.P;
                                    rnVar.P = z10;
                                } else if (i10 == rnVar.E0) {
                                    if (rnVar.R == 0 && rnVar.S == 0) {
                                        rnVar.R = 86400;
                                        rnVar.S = 0;
                                        int i19 = rnVar.F0;
                                        rnVar.h0();
                                        if (i19 < 0) {
                                            f2.m1 K2 = qb1Var.K(rnVar.E0);
                                            if (K2 != null) {
                                                View view3 = K2.f5875a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            qb1Var.setItemAnimator(fnVar);
                                            pnVar.s(rnVar.F0, 3);
                                        }
                                    } else {
                                        rnVar.R = 0;
                                        rnVar.S = 0;
                                        int i20 = rnVar.F0;
                                        rnVar.h0();
                                        qb1Var.setItemAnimator(fnVar);
                                        pnVar.t(i20, 3);
                                        f2.m1 K3 = qb1Var.K(rnVar.E0);
                                        if (K3 != null) {
                                            View view4 = K3.f5875a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (rnVar.R == 0 && rnVar.S == 0) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    z10 = z11;
                                } else if (i10 == rnVar.A0) {
                                    z10 = !rnVar.O;
                                    rnVar.O = z10;
                                } else if (i10 == rnVar.f30848w0) {
                                    z10 = !rnVar.f30820d0;
                                    rnVar.f30820d0 = z10;
                                    rnVar.h0();
                                    int i21 = rnVar.f30846v0;
                                    if (i21 >= 0 && i18 < 0) {
                                        qb1Var.setItemAnimator(fnVar);
                                        pnVar.o(rnVar.f30846v0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        qb1Var.setItemAnimator(fnVar);
                                        pnVar.u(i18);
                                    }
                                } else if (i10 == rnVar.C0) {
                                    boolean z15 = rnVar.V;
                                    z10 = !z15;
                                    rnVar.V = z10;
                                    if (z15 && rnVar.W) {
                                        boolean z16 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z16) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z16 = true;
                                            }
                                        }
                                    }
                                    int childCount = qb1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        f2.m1 T = qb1Var.T(qb1Var.getChildAt(i23));
                                        if (T.f5879f == 5) {
                                            ((org.telegram.ui.Cells.c6) T.f5875a).f22649a.a(rnVar.V, true);
                                        }
                                    }
                                } else if (i10 == rnVar.G0) {
                                    z10 = !rnVar.T;
                                    rnVar.T = z10;
                                } else if (i10 == rnVar.D0) {
                                    if (!rnVar.f30816b0) {
                                        qb1Var.setItemAnimator(fnVar);
                                        z10 = !rnVar.W;
                                        rnVar.W = z10;
                                        int i24 = rnVar.f30834l0;
                                        rnVar.h0();
                                        if (rnVar.W) {
                                            pnVar.s(rnVar.f30834l0, 3);
                                        } else {
                                            pnVar.t(i24, 3);
                                        }
                                        pnVar.m(rnVar.f30850x0);
                                        if (rnVar.W) {
                                            rnVar.O = false;
                                            int i25 = rnVar.A0;
                                            if (i25 >= 0) {
                                                f2.m1 K4 = qb1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.f5875a).setChecked(false);
                                                } else {
                                                    pnVar.m(rnVar.A0);
                                                }
                                            }
                                        } else {
                                            int i26 = rnVar.A0;
                                            if (i26 >= 0 && qb1Var.K(i26) == null) {
                                                pnVar.m(rnVar.A0);
                                            }
                                        }
                                        rnVar.R();
                                        if (rnVar.W && !rnVar.V) {
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
                        if (rnVar.f30814a0 && !rnVar.W) {
                            m40Var.b(true);
                        }
                        qb1Var.getChildCount();
                        for (int i28 = rnVar.f30839q0; i28 < rnVar.f30839q0 + rnVar.J; i28++) {
                            f2.m1 K5 = qb1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.f5875a;
                                if (view5 instanceof org.telegram.ui.Cells.c6) {
                                    org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view5;
                                    c6Var.m(rnVar.W, true);
                                    c6Var.f22655r.a(zArr[i28 - rnVar.f30839q0], z13);
                                    if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == rnVar.D0 && !rnVar.f30814a0) {
                                        m40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        m40Var.f(c6Var.getCheckBox(), true);
                                        rnVar.f30814a0 = true;
                                    }
                                }
                            }
                        }
                        if (z12) {
                            ((org.telegram.ui.Cells.s8) view).setChecked(z10);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z10);
                        }
                        rnVar.T();
                        return;
                    }
                    return;
                }
                break;
            default:
                ov.n((ov) this.f31646c, (ArrayList) this.d, (org.telegram.ui.ActionBar.p2) this.f31647e, this.f31645b, view, i10);
                return;
        }
    }

    public um(ov ovVar, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f31646c = ovVar;
        this.d = arrayList;
        this.f31647e = p2Var;
        this.f31645b = g6Var;
    }
}
