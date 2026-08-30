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
import org.telegram.ui.jb1;
public final class tm implements il0 {
    public final int f28990a = 1;
    public final org.telegram.ui.ActionBar.f6 f28991b;
    public final Object f28992c;
    public final Object d;
    public final Object e;

    public tm(qn qnVar, org.telegram.ui.ActionBar.f6 f6Var, li liVar, Context context) {
        this.f28992c = qnVar;
        this.f28991b = f6Var;
        this.d = liVar;
        this.e = context;
    }

    @Override
    public final void f(int i10, View view) {
        boolean z4;
        boolean z10;
        boolean z11;
        switch (this.f28990a) {
            case 0:
                qn qnVar = (qn) this.f28992c;
                li liVar = (li) this.d;
                Context context = (Context) this.e;
                k40 k40Var = qnVar.f28197y;
                boolean[] zArr = qnVar.I;
                b7.l0 l0Var = qnVar.K0;
                en enVar = qnVar.v;
                on onVar = qnVar.f28186r;
                jb1 jb1Var = qnVar.f28188s;
                int i11 = qnVar.I0;
                org.telegram.ui.ActionBar.f6 f6Var = this.f28991b;
                if (i10 == i11) {
                    gh.f fVar = new gh.f(qnVar.getContext(), f6Var);
                    fVar.f6846h0 = new androidx.biometric.f0(qnVar, 28);
                    ArrayList arrayList = qnVar.M0;
                    fVar.Z = null;
                    fVar.f6850l0 = new HashSet(arrayList);
                    fVar.show();
                    return;
                } else if (i10 == qnVar.F0) {
                    o70 F = o70.F(liVar.container, f6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = qnVar.Q0;
                        if (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            x11 a2 = x11.a(i13);
                            int i14 = org.telegram.ui.ActionBar.j6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, qnVar.f24277a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.j6.E8, new ah.a(qnVar, i13, view, 28));
                            i12++;
                        } else {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.ih(qnVar, context, view, f6Var, 10), false);
                            F.f27490t = false;
                            F.f27489s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i10 == qnVar.f28187r0) {
                    qnVar.P();
                    return;
                } else {
                    boolean z12 = view instanceof org.telegram.ui.Cells.s8;
                    if (z12 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z13 = qnVar.W;
                        gn gnVar = qnVar.f28195x;
                        if (gnVar != null) {
                            gnVar.f();
                        }
                        b7.l0[] l0VarArr = qnVar.L0;
                        int length = l0VarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                b7.l0 l0Var2 = l0VarArr[i15];
                                if (i10 == l0Var2.f1700b) {
                                    boolean z14 = l0Var2.f1699a;
                                    z10 = !z14;
                                    l0Var2.f1699a = z10;
                                    int i16 = l0Var.f1700b;
                                    qn qnVar2 = (qn) l0Var.f1701c;
                                    on onVar2 = qnVar2.f28186r;
                                    if (i10 == i16) {
                                        jb1Var.setItemAnimator(enVar);
                                        int i17 = l0Var.f1700b;
                                        if (i17 >= 0) {
                                            f2.l1 K = qnVar2.f28188s.K(i17);
                                            if (K != null) {
                                                View view2 = K.f5785a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z10);
                                                }
                                            }
                                            onVar2.m(l0Var.f1700b);
                                        }
                                        if (!z14) {
                                            onVar2.s(l0Var.f1700b + 1, 1);
                                        } else {
                                            onVar2.t(l0Var.f1700b + 1, 1);
                                        }
                                        qnVar.h0();
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
                            if (i10 == qnVar.f28198y0) {
                                z10 = qnVar.U;
                                qnVar.U = !z10;
                                qnVar.R();
                            } else {
                                int i18 = qnVar.f28192v0;
                                if (i10 == i18) {
                                    z10 = !qnVar.f28164c0;
                                    qnVar.f28164c0 = z10;
                                } else if (i10 == qnVar.f28199z0) {
                                    if (!qnVar.W && !qnVar.U) {
                                        qnVar.Q = !qnVar.Q;
                                    }
                                    z10 = qnVar.Q;
                                } else if (i10 == qnVar.B0) {
                                    z10 = !qnVar.P;
                                    qnVar.P = z10;
                                } else if (i10 == qnVar.E0) {
                                    if (qnVar.R == 0 && qnVar.S == 0) {
                                        qnVar.R = 86400;
                                        qnVar.S = 0;
                                        int i19 = qnVar.F0;
                                        qnVar.h0();
                                        if (i19 < 0) {
                                            f2.l1 K2 = jb1Var.K(qnVar.E0);
                                            if (K2 != null) {
                                                View view3 = K2.f5785a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            jb1Var.setItemAnimator(enVar);
                                            onVar.s(qnVar.F0, 3);
                                        }
                                    } else {
                                        qnVar.R = 0;
                                        qnVar.S = 0;
                                        int i20 = qnVar.F0;
                                        qnVar.h0();
                                        jb1Var.setItemAnimator(enVar);
                                        onVar.t(i20, 3);
                                        f2.l1 K3 = jb1Var.K(qnVar.E0);
                                        if (K3 != null) {
                                            View view4 = K3.f5785a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (qnVar.R == 0 && qnVar.S == 0) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    z10 = z11;
                                } else if (i10 == qnVar.A0) {
                                    z10 = !qnVar.O;
                                    qnVar.O = z10;
                                } else if (i10 == qnVar.f28194w0) {
                                    z10 = !qnVar.f28166d0;
                                    qnVar.f28166d0 = z10;
                                    qnVar.h0();
                                    int i21 = qnVar.f28192v0;
                                    if (i21 >= 0 && i18 < 0) {
                                        jb1Var.setItemAnimator(enVar);
                                        onVar.o(qnVar.f28192v0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        jb1Var.setItemAnimator(enVar);
                                        onVar.u(i18);
                                    }
                                } else if (i10 == qnVar.C0) {
                                    boolean z15 = qnVar.V;
                                    z10 = !z15;
                                    qnVar.V = z10;
                                    if (z15 && qnVar.W) {
                                        boolean z16 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z16) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z16 = true;
                                            }
                                        }
                                    }
                                    int childCount = jb1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        f2.l1 T = jb1Var.T(jb1Var.getChildAt(i23));
                                        if (T.f5788f == 5) {
                                            ((org.telegram.ui.Cells.c6) T.f5785a).f20915a.a(qnVar.V, true);
                                        }
                                    }
                                } else if (i10 == qnVar.G0) {
                                    z10 = !qnVar.T;
                                    qnVar.T = z10;
                                } else if (i10 == qnVar.D0) {
                                    if (!qnVar.f28162b0) {
                                        jb1Var.setItemAnimator(enVar);
                                        z10 = !qnVar.W;
                                        qnVar.W = z10;
                                        int i24 = qnVar.f28180l0;
                                        qnVar.h0();
                                        if (qnVar.W) {
                                            onVar.s(qnVar.f28180l0, 3);
                                        } else {
                                            onVar.t(i24, 3);
                                        }
                                        onVar.m(qnVar.f28196x0);
                                        if (qnVar.W) {
                                            qnVar.O = false;
                                            int i25 = qnVar.A0;
                                            if (i25 >= 0) {
                                                f2.l1 K4 = jb1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.f5785a).setChecked(false);
                                                } else {
                                                    onVar.m(qnVar.A0);
                                                }
                                            }
                                        } else {
                                            int i26 = qnVar.A0;
                                            if (i26 >= 0 && jb1Var.K(i26) == null) {
                                                onVar.m(qnVar.A0);
                                            }
                                        }
                                        qnVar.R();
                                        if (qnVar.W && !qnVar.V) {
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
                        if (qnVar.f28160a0 && !qnVar.W) {
                            k40Var.b(true);
                        }
                        jb1Var.getChildCount();
                        for (int i28 = qnVar.f28185q0; i28 < qnVar.f28185q0 + qnVar.J; i28++) {
                            f2.l1 K5 = jb1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.f5785a;
                                if (view5 instanceof org.telegram.ui.Cells.c6) {
                                    org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view5;
                                    c6Var.m(qnVar.W, true);
                                    c6Var.f20920r.a(zArr[i28 - qnVar.f28185q0], z13);
                                    if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == qnVar.D0 && !qnVar.f28160a0) {
                                        k40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        k40Var.f(c6Var.getCheckBox(), true);
                                        qnVar.f28160a0 = true;
                                    }
                                }
                            }
                        }
                        if (z12) {
                            ((org.telegram.ui.Cells.s8) view).setChecked(z10);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z10);
                        }
                        qnVar.T();
                        return;
                    }
                    return;
                }
                break;
            default:
                mv.n((mv) this.f28992c, (ArrayList) this.d, (org.telegram.ui.ActionBar.p2) this.e, this.f28991b, view, i10);
                return;
        }
    }

    public tm(mv mvVar, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f28992c = mvVar;
        this.d = arrayList;
        this.e = p2Var;
        this.f28991b = f6Var;
    }
}
