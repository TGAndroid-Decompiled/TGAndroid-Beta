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
import org.telegram.ui.wb1;
public final class ym implements nl0 {
    public final int f30737a = 1;
    public final org.telegram.ui.ActionBar.d6 f30738b;
    public final Object f30739c;
    public final Object d;
    public final Object e;

    public ym(xn xnVar, org.telegram.ui.ActionBar.d6 d6Var, xi xiVar, Context context) {
        this.f30739c = xnVar;
        this.f30738b = d6Var;
        this.d = xiVar;
        this.e = context;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f30737a) {
            case 0:
                xn xnVar = (xn) this.f30739c;
                xi xiVar = (xi) this.d;
                Context context = (Context) this.e;
                m40 m40Var = xnVar.f30423y;
                boolean[] zArr = xnVar.L;
                c2.a aVar = xnVar.N0;
                kn knVar = xnVar.v;
                vn vnVar = xnVar.f30412r;
                wb1 wb1Var = xnVar.f30414s;
                int i11 = xnVar.L0;
                org.telegram.ui.ActionBar.d6 d6Var = this.f30738b;
                if (i10 == i11) {
                    th.f fVar = new th.f(xnVar.getContext(), d6Var);
                    fVar.f43661k0 = new l.d(xnVar);
                    ArrayList arrayList = xnVar.P0;
                    fVar.f43653c0 = null;
                    fVar.f43664o0 = new HashSet(arrayList);
                    fVar.show();
                    return;
                } else if (i10 == xnVar.I0) {
                    b80 F = b80.F(xiVar.container, d6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = xnVar.T0;
                        if (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            l21 a2 = l21.a(i13);
                            int i14 = org.telegram.ui.ActionBar.h6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i14, xnVar.f27361a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.h6.E8, new zm(xnVar, i13, view, 0));
                            i12++;
                        } else {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.ActionBar.l5(xnVar, context, view, d6Var, 20), false);
                            F.f22873t = false;
                            F.f22872s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i10 == xnVar.f30417u0) {
                    xnVar.P();
                    return;
                } else {
                    boolean z13 = view instanceof org.telegram.ui.Cells.w8;
                    if (z13 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z14 = xnVar.f30388c0;
                        mn mnVar = xnVar.f30421x;
                        if (mnVar != null) {
                            mnVar.f();
                        }
                        c2.a[] aVarArr = xnVar.O0;
                        int length = aVarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                c2.a aVar2 = aVarArr[i15];
                                if (i10 == aVar2.f3656b) {
                                    boolean z15 = aVar2.f3655a;
                                    z11 = !z15;
                                    aVar2.f3655a = z11;
                                    int i16 = aVar.f3656b;
                                    xn xnVar2 = (xn) aVar.f3657c;
                                    vn vnVar2 = xnVar2.f30412r;
                                    if (i10 == i16) {
                                        wb1Var.setItemAnimator(knVar);
                                        int i17 = aVar.f3656b;
                                        if (i17 >= 0) {
                                            s4.c1 K = xnVar2.f30414s.K(i17);
                                            if (K != null) {
                                                View view2 = K.f43068a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z11);
                                                }
                                            }
                                            vnVar2.m(aVar.f3656b);
                                        }
                                        if (!z15) {
                                            vnVar2.s(aVar.f3656b + 1, 1);
                                        } else {
                                            vnVar2.t(aVar.f3656b + 1, 1);
                                        }
                                        xnVar.h0();
                                    }
                                    z10 = true;
                                } else {
                                    i15++;
                                }
                            } else {
                                z10 = false;
                                z11 = false;
                            }
                        }
                        if (!z10) {
                            if (i10 == xnVar.B0) {
                                z11 = xnVar.f30384a0;
                                xnVar.f30384a0 = !z11;
                                xnVar.R();
                            } else {
                                int i18 = xnVar.f30424y0;
                                if (i10 == i18) {
                                    z11 = !xnVar.f30394f0;
                                    xnVar.f30394f0 = z11;
                                } else if (i10 == xnVar.C0) {
                                    if (!xnVar.f30388c0 && !xnVar.f30384a0) {
                                        xnVar.T = !xnVar.T;
                                    }
                                    z11 = xnVar.T;
                                } else if (i10 == xnVar.E0) {
                                    z11 = !xnVar.S;
                                    xnVar.S = z11;
                                } else if (i10 == xnVar.H0) {
                                    if (xnVar.U == 0 && xnVar.V == 0) {
                                        xnVar.U = 86400;
                                        xnVar.V = 0;
                                        int i19 = xnVar.I0;
                                        xnVar.h0();
                                        if (i19 < 0) {
                                            s4.c1 K2 = wb1Var.K(xnVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.f43068a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            wb1Var.setItemAnimator(knVar);
                                            vnVar.s(xnVar.I0, 3);
                                        }
                                    } else {
                                        xnVar.U = 0;
                                        xnVar.V = 0;
                                        int i20 = xnVar.I0;
                                        xnVar.h0();
                                        wb1Var.setItemAnimator(knVar);
                                        vnVar.t(i20, 3);
                                        s4.c1 K3 = wb1Var.K(xnVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.f43068a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (xnVar.U == 0 && xnVar.V == 0) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    z11 = z12;
                                } else if (i10 == xnVar.D0) {
                                    z11 = !xnVar.R;
                                    xnVar.R = z11;
                                } else if (i10 == xnVar.f30425z0) {
                                    z11 = !xnVar.f30396g0;
                                    xnVar.f30396g0 = z11;
                                    xnVar.h0();
                                    int i21 = xnVar.f30424y0;
                                    if (i21 >= 0 && i18 < 0) {
                                        wb1Var.setItemAnimator(knVar);
                                        vnVar.o(xnVar.f30424y0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        wb1Var.setItemAnimator(knVar);
                                        vnVar.u(i18);
                                    }
                                } else if (i10 == xnVar.F0) {
                                    boolean z16 = xnVar.f30386b0;
                                    z11 = !z16;
                                    xnVar.f30386b0 = z11;
                                    if (z16 && xnVar.f30388c0) {
                                        boolean z17 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z17) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z17 = true;
                                            }
                                        }
                                    }
                                    int childCount = wb1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        s4.c1 T = wb1Var.T(wb1Var.getChildAt(i23));
                                        if (T.f43071f == 5) {
                                            ((org.telegram.ui.Cells.d6) T.f43068a).f20151a.a(xnVar.f30386b0, true);
                                        }
                                    }
                                } else if (i10 == xnVar.J0) {
                                    z11 = !xnVar.W;
                                    xnVar.W = z11;
                                } else if (i10 == xnVar.G0) {
                                    if (!xnVar.f30392e0) {
                                        wb1Var.setItemAnimator(knVar);
                                        z11 = !xnVar.f30388c0;
                                        xnVar.f30388c0 = z11;
                                        int i24 = xnVar.f30409o0;
                                        xnVar.h0();
                                        if (xnVar.f30388c0) {
                                            vnVar.s(xnVar.f30409o0, 3);
                                        } else {
                                            vnVar.t(i24, 3);
                                        }
                                        vnVar.m(xnVar.A0);
                                        if (xnVar.f30388c0) {
                                            xnVar.R = false;
                                            int i25 = xnVar.D0;
                                            if (i25 >= 0) {
                                                s4.c1 K4 = wb1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.f43068a).setChecked(false);
                                                } else {
                                                    vnVar.m(xnVar.D0);
                                                }
                                            }
                                        } else {
                                            int i26 = xnVar.D0;
                                            if (i26 >= 0 && wb1Var.K(i26) == null) {
                                                vnVar.m(xnVar.D0);
                                            }
                                        }
                                        xnVar.R();
                                        if (xnVar.f30388c0 && !xnVar.f30386b0) {
                                            boolean z18 = false;
                                            for (int i27 = 0; i27 < zArr.length; i27++) {
                                                if (z18) {
                                                    zArr[i27] = false;
                                                } else if (zArr[i27]) {
                                                    z18 = true;
                                                }
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                        if (xnVar.f30390d0 && !xnVar.f30388c0) {
                            m40Var.b(true);
                        }
                        wb1Var.getChildCount();
                        for (int i28 = xnVar.f30416t0; i28 < xnVar.f30416t0 + xnVar.M; i28++) {
                            s4.c1 K5 = wb1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.f43068a;
                                if (view5 instanceof org.telegram.ui.Cells.d6) {
                                    org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view5;
                                    d6Var2.m(xnVar.f30388c0, true);
                                    d6Var2.f20156r.a(zArr[i28 - xnVar.f30416t0], z14);
                                    if (d6Var2.getTop() > AndroidUtilities.dp(40.0f) && i10 == xnVar.G0 && !xnVar.f30390d0) {
                                        m40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        m40Var.f(d6Var2.getCheckBox(), true);
                                        xnVar.f30390d0 = true;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z11);
                        }
                        xnVar.T();
                        return;
                    }
                    return;
                }
                break;
            default:
                vv.n((vv) this.f30739c, (ArrayList) this.d, (org.telegram.ui.ActionBar.m2) this.e, this.f30738b, view, i10);
                return;
        }
    }

    public ym(vv vvVar, ArrayList arrayList, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f30739c = vvVar;
        this.d = arrayList;
        this.e = m2Var;
        this.f30738b = d6Var;
    }
}
