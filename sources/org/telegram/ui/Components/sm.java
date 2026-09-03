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
import org.telegram.ui.rb1;
public final class sm implements hl0 {
    public final int f28762a = 1;
    public final org.telegram.ui.ActionBar.f6 f28763b;
    public final Object f28764c;
    public final Object d;
    public final Object e;

    public sm(pn pnVar, org.telegram.ui.ActionBar.f6 f6Var, li liVar, Context context) {
        this.f28764c = pnVar;
        this.f28763b = f6Var;
        this.d = liVar;
        this.e = context;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z4;
        boolean z10;
        boolean z11;
        switch (this.f28762a) {
            case 0:
                pn pnVar = (pn) this.f28764c;
                li liVar = (li) this.d;
                Context context = (Context) this.e;
                l40 l40Var = pnVar.f27969y;
                boolean[] zArr = pnVar.I;
                b7.l0 l0Var = pnVar.K0;
                dn dnVar = pnVar.v;
                nn nnVar = pnVar.f27958r;
                rb1 rb1Var = pnVar.f27960s;
                int i11 = pnVar.I0;
                org.telegram.ui.ActionBar.f6 f6Var = this.f28763b;
                if (i10 == i11) {
                    gh.f fVar = new gh.f(pnVar.getContext(), f6Var);
                    fVar.f6833h0 = new o3.c(pnVar, 4);
                    ArrayList arrayList = pnVar.M0;
                    fVar.Z = null;
                    fVar.f6837l0 = new HashSet(arrayList);
                    fVar.show();
                    return;
                } else if (i10 == pnVar.F0) {
                    p70 F = p70.F(liVar.container, f6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = pnVar.Q0;
                        if (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            x11 a2 = x11.a(i13);
                            int i14 = org.telegram.ui.ActionBar.j6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, pnVar.f24281a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.j6.E8, new ah.a(pnVar, i13, view, 28));
                            i12++;
                        } else {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.kh(pnVar, context, view, f6Var, 10), false);
                            F.f27778t = false;
                            F.f27777s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i10 == pnVar.f27959r0) {
                    pnVar.P();
                    return;
                } else {
                    boolean z12 = view instanceof org.telegram.ui.Cells.r8;
                    if (z12 || (view instanceof org.telegram.ui.Cells.z5)) {
                        boolean z13 = pnVar.W;
                        fn fnVar = pnVar.f27967x;
                        if (fnVar != null) {
                            fnVar.f();
                        }
                        b7.l0[] l0VarArr = pnVar.L0;
                        int length = l0VarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                b7.l0 l0Var2 = l0VarArr[i15];
                                if (i10 == l0Var2.f1711b) {
                                    boolean z14 = l0Var2.f1710a;
                                    z10 = !z14;
                                    l0Var2.f1710a = z10;
                                    int i16 = l0Var.f1711b;
                                    pn pnVar2 = (pn) l0Var.f1712c;
                                    nn nnVar2 = pnVar2.f27958r;
                                    if (i10 == i16) {
                                        rb1Var.setItemAnimator(dnVar);
                                        int i17 = l0Var.f1711b;
                                        if (i17 >= 0) {
                                            f2.l1 K = pnVar2.f27960s.K(i17);
                                            if (K != null) {
                                                View view2 = K.f5774a;
                                                if (view2 instanceof org.telegram.ui.Cells.z5) {
                                                    ((org.telegram.ui.Cells.z5) view2).setDivider(z10);
                                                }
                                            }
                                            nnVar2.m(l0Var.f1711b);
                                        }
                                        if (!z14) {
                                            nnVar2.s(l0Var.f1711b + 1, 1);
                                        } else {
                                            nnVar2.t(l0Var.f1711b + 1, 1);
                                        }
                                        pnVar.h0();
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
                            if (i10 == pnVar.f27970y0) {
                                z10 = pnVar.U;
                                pnVar.U = !z10;
                                pnVar.R();
                            } else {
                                int i18 = pnVar.f27964v0;
                                if (i10 == i18) {
                                    z10 = !pnVar.f27936c0;
                                    pnVar.f27936c0 = z10;
                                } else if (i10 == pnVar.f27971z0) {
                                    if (!pnVar.W && !pnVar.U) {
                                        pnVar.Q = !pnVar.Q;
                                    }
                                    z10 = pnVar.Q;
                                } else if (i10 == pnVar.B0) {
                                    z10 = !pnVar.P;
                                    pnVar.P = z10;
                                } else if (i10 == pnVar.E0) {
                                    if (pnVar.R == 0 && pnVar.S == 0) {
                                        pnVar.R = 86400;
                                        pnVar.S = 0;
                                        int i19 = pnVar.F0;
                                        pnVar.h0();
                                        if (i19 < 0) {
                                            f2.l1 K2 = rb1Var.K(pnVar.E0);
                                            if (K2 != null) {
                                                View view3 = K2.f5774a;
                                                if (view3 instanceof org.telegram.ui.Cells.z5) {
                                                    ((org.telegram.ui.Cells.z5) view3).setDivider(true);
                                                }
                                            }
                                            rb1Var.setItemAnimator(dnVar);
                                            nnVar.s(pnVar.F0, 3);
                                        }
                                    } else {
                                        pnVar.R = 0;
                                        pnVar.S = 0;
                                        int i20 = pnVar.F0;
                                        pnVar.h0();
                                        rb1Var.setItemAnimator(dnVar);
                                        nnVar.t(i20, 3);
                                        f2.l1 K3 = rb1Var.K(pnVar.E0);
                                        if (K3 != null) {
                                            View view4 = K3.f5774a;
                                            if (view4 instanceof org.telegram.ui.Cells.z5) {
                                                ((org.telegram.ui.Cells.z5) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (pnVar.R == 0 && pnVar.S == 0) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    z10 = z11;
                                } else if (i10 == pnVar.A0) {
                                    z10 = !pnVar.O;
                                    pnVar.O = z10;
                                } else if (i10 == pnVar.f27966w0) {
                                    z10 = !pnVar.f27938d0;
                                    pnVar.f27938d0 = z10;
                                    pnVar.h0();
                                    int i21 = pnVar.f27964v0;
                                    if (i21 >= 0 && i18 < 0) {
                                        rb1Var.setItemAnimator(dnVar);
                                        nnVar.o(pnVar.f27964v0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        rb1Var.setItemAnimator(dnVar);
                                        nnVar.u(i18);
                                    }
                                } else if (i10 == pnVar.C0) {
                                    boolean z15 = pnVar.V;
                                    z10 = !z15;
                                    pnVar.V = z10;
                                    if (z15 && pnVar.W) {
                                        boolean z16 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z16) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z16 = true;
                                            }
                                        }
                                    }
                                    int childCount = rb1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        f2.l1 T = rb1Var.T(rb1Var.getChildAt(i23));
                                        if (T.f5777f == 5) {
                                            ((org.telegram.ui.Cells.b6) T.f5774a).f20844a.a(pnVar.V, true);
                                        }
                                    }
                                } else if (i10 == pnVar.G0) {
                                    z10 = !pnVar.T;
                                    pnVar.T = z10;
                                } else if (i10 == pnVar.D0) {
                                    if (!pnVar.f27934b0) {
                                        rb1Var.setItemAnimator(dnVar);
                                        z10 = !pnVar.W;
                                        pnVar.W = z10;
                                        int i24 = pnVar.f27952l0;
                                        pnVar.h0();
                                        if (pnVar.W) {
                                            nnVar.s(pnVar.f27952l0, 3);
                                        } else {
                                            nnVar.t(i24, 3);
                                        }
                                        nnVar.m(pnVar.f27968x0);
                                        if (pnVar.W) {
                                            pnVar.O = false;
                                            int i25 = pnVar.A0;
                                            if (i25 >= 0) {
                                                f2.l1 K4 = rb1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.z5) K4.f5774a).setChecked(false);
                                                } else {
                                                    nnVar.m(pnVar.A0);
                                                }
                                            }
                                        } else {
                                            int i26 = pnVar.A0;
                                            if (i26 >= 0 && rb1Var.K(i26) == null) {
                                                nnVar.m(pnVar.A0);
                                            }
                                        }
                                        pnVar.R();
                                        if (pnVar.W && !pnVar.V) {
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
                        if (pnVar.f27932a0 && !pnVar.W) {
                            l40Var.b(true);
                        }
                        rb1Var.getChildCount();
                        for (int i28 = pnVar.f27957q0; i28 < pnVar.f27957q0 + pnVar.J; i28++) {
                            f2.l1 K5 = rb1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.f5774a;
                                if (view5 instanceof org.telegram.ui.Cells.b6) {
                                    org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view5;
                                    b6Var.m(pnVar.W, true);
                                    b6Var.f20849r.a(zArr[i28 - pnVar.f27957q0], z13);
                                    if (b6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == pnVar.D0 && !pnVar.f27932a0) {
                                        l40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        l40Var.f(b6Var.getCheckBox(), true);
                                        pnVar.f27932a0 = true;
                                    }
                                }
                            }
                        }
                        if (z12) {
                            ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                        } else if (view instanceof org.telegram.ui.Cells.z5) {
                            ((org.telegram.ui.Cells.z5) view).setChecked(z10);
                        }
                        pnVar.T();
                        return;
                    }
                    return;
                }
                break;
            default:
                lv.n((lv) this.f28764c, (ArrayList) this.d, (org.telegram.ui.ActionBar.p2) this.e, this.f28763b, view, i10);
                return;
        }
    }

    public sm(lv lvVar, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f28764c = lvVar;
        this.d = arrayList;
        this.e = p2Var;
        this.f28763b = f6Var;
    }
}
