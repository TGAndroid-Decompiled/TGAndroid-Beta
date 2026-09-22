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
import org.telegram.ui.ec1;
public final class vm implements zk0 {
    public final int f28826a = 1;
    public final org.telegram.ui.ActionBar.e6 f28827b;
    public final Object f28828c;
    public final Object d;
    public final Object e;

    public vm(un unVar, org.telegram.ui.ActionBar.e6 e6Var, vi viVar, Context context) {
        this.f28828c = unVar;
        this.f28827b = e6Var;
        this.d = viVar;
        this.e = context;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f28826a) {
            case 0:
                un unVar = (un) this.f28828c;
                vi viVar = (vi) this.d;
                Context context = (Context) this.e;
                i40 i40Var = unVar.f28469y;
                boolean[] zArr = unVar.L;
                c2.a aVar = unVar.N0;
                hn hnVar = unVar.v;
                sn snVar = unVar.f28458r;
                ec1 ec1Var = unVar.f28460s;
                int i11 = unVar.L0;
                org.telegram.ui.ActionBar.e6 e6Var = this.f28827b;
                if (i10 == i11) {
                    th.f fVar = new th.f(unVar.getContext(), e6Var);
                    fVar.f43265k0 = new k2.u(unVar, 12);
                    ArrayList arrayList = unVar.P0;
                    fVar.f43257c0 = null;
                    fVar.f43268o0 = new HashSet(arrayList);
                    fVar.show();
                    return;
                } else if (i10 == unVar.I0) {
                    n70 F = n70.F(viVar.container, e6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = unVar.T0;
                        if (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            v11 a2 = v11.a(i13);
                            int i14 = org.telegram.ui.ActionBar.i6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i14, unVar.f26460a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.i6.E8, new wm(unVar, i13, view, 0));
                            i12++;
                        } else {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.ActionBar.n5(unVar, context, view, e6Var, 19), false);
                            F.f26368t = false;
                            F.f26367s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i10 == unVar.f28463u0) {
                    unVar.P();
                    return;
                } else {
                    boolean z13 = view instanceof org.telegram.ui.Cells.w8;
                    if (z13 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z14 = unVar.f28434c0;
                        jn jnVar = unVar.f28467x;
                        if (jnVar != null) {
                            jnVar.f();
                        }
                        c2.a[] aVarArr = unVar.O0;
                        int length = aVarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                c2.a aVar2 = aVarArr[i15];
                                if (i10 == aVar2.f3654b) {
                                    boolean z15 = aVar2.f3653a;
                                    z11 = !z15;
                                    aVar2.f3653a = z11;
                                    int i16 = aVar.f3654b;
                                    un unVar2 = (un) aVar.f3655c;
                                    sn snVar2 = unVar2.f28458r;
                                    if (i10 == i16) {
                                        ec1Var.setItemAnimator(hnVar);
                                        int i17 = aVar.f3654b;
                                        if (i17 >= 0) {
                                            s4.c1 K = unVar2.f28460s.K(i17);
                                            if (K != null) {
                                                View view2 = K.f42671a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z11);
                                                }
                                            }
                                            snVar2.m(aVar.f3654b);
                                        }
                                        if (!z15) {
                                            snVar2.s(aVar.f3654b + 1, 1);
                                        } else {
                                            snVar2.t(aVar.f3654b + 1, 1);
                                        }
                                        unVar.h0();
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
                            if (i10 == unVar.B0) {
                                z11 = unVar.f28430a0;
                                unVar.f28430a0 = !z11;
                                unVar.R();
                            } else {
                                int i18 = unVar.f28470y0;
                                if (i10 == i18) {
                                    z11 = !unVar.f28440f0;
                                    unVar.f28440f0 = z11;
                                } else if (i10 == unVar.C0) {
                                    if (!unVar.f28434c0 && !unVar.f28430a0) {
                                        unVar.T = !unVar.T;
                                    }
                                    z11 = unVar.T;
                                } else if (i10 == unVar.E0) {
                                    z11 = !unVar.S;
                                    unVar.S = z11;
                                } else if (i10 == unVar.H0) {
                                    if (unVar.U == 0 && unVar.V == 0) {
                                        unVar.U = 86400;
                                        unVar.V = 0;
                                        int i19 = unVar.I0;
                                        unVar.h0();
                                        if (i19 < 0) {
                                            s4.c1 K2 = ec1Var.K(unVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.f42671a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            ec1Var.setItemAnimator(hnVar);
                                            snVar.s(unVar.I0, 3);
                                        }
                                    } else {
                                        unVar.U = 0;
                                        unVar.V = 0;
                                        int i20 = unVar.I0;
                                        unVar.h0();
                                        ec1Var.setItemAnimator(hnVar);
                                        snVar.t(i20, 3);
                                        s4.c1 K3 = ec1Var.K(unVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.f42671a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (unVar.U == 0 && unVar.V == 0) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    z11 = z12;
                                } else if (i10 == unVar.D0) {
                                    z11 = !unVar.R;
                                    unVar.R = z11;
                                } else if (i10 == unVar.f28471z0) {
                                    z11 = !unVar.f28442g0;
                                    unVar.f28442g0 = z11;
                                    unVar.h0();
                                    int i21 = unVar.f28470y0;
                                    if (i21 >= 0 && i18 < 0) {
                                        ec1Var.setItemAnimator(hnVar);
                                        snVar.o(unVar.f28470y0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        ec1Var.setItemAnimator(hnVar);
                                        snVar.u(i18);
                                    }
                                } else if (i10 == unVar.F0) {
                                    boolean z16 = unVar.f28432b0;
                                    z11 = !z16;
                                    unVar.f28432b0 = z11;
                                    if (z16 && unVar.f28434c0) {
                                        boolean z17 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z17) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z17 = true;
                                            }
                                        }
                                    }
                                    int childCount = ec1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        s4.c1 T = ec1Var.T(ec1Var.getChildAt(i23));
                                        if (T.f42674f == 5) {
                                            ((org.telegram.ui.Cells.d6) T.f42671a).f19898a.a(unVar.f28432b0, true);
                                        }
                                    }
                                } else if (i10 == unVar.J0) {
                                    z11 = !unVar.W;
                                    unVar.W = z11;
                                } else if (i10 == unVar.G0) {
                                    if (!unVar.f28438e0) {
                                        ec1Var.setItemAnimator(hnVar);
                                        z11 = !unVar.f28434c0;
                                        unVar.f28434c0 = z11;
                                        int i24 = unVar.f28455o0;
                                        unVar.h0();
                                        if (unVar.f28434c0) {
                                            snVar.s(unVar.f28455o0, 3);
                                        } else {
                                            snVar.t(i24, 3);
                                        }
                                        snVar.m(unVar.A0);
                                        if (unVar.f28434c0) {
                                            unVar.R = false;
                                            int i25 = unVar.D0;
                                            if (i25 >= 0) {
                                                s4.c1 K4 = ec1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.f42671a).setChecked(false);
                                                } else {
                                                    snVar.m(unVar.D0);
                                                }
                                            }
                                        } else {
                                            int i26 = unVar.D0;
                                            if (i26 >= 0 && ec1Var.K(i26) == null) {
                                                snVar.m(unVar.D0);
                                            }
                                        }
                                        unVar.R();
                                        if (unVar.f28434c0 && !unVar.f28432b0) {
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
                        if (unVar.f28436d0 && !unVar.f28434c0) {
                            i40Var.b(true);
                        }
                        ec1Var.getChildCount();
                        for (int i28 = unVar.f28462t0; i28 < unVar.f28462t0 + unVar.M; i28++) {
                            s4.c1 K5 = ec1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.f42671a;
                                if (view5 instanceof org.telegram.ui.Cells.d6) {
                                    org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view5;
                                    d6Var.m(unVar.f28434c0, true);
                                    d6Var.f19903r.a(zArr[i28 - unVar.f28462t0], z14);
                                    if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == unVar.G0 && !unVar.f28436d0) {
                                        i40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        i40Var.f(d6Var.getCheckBox(), true);
                                        unVar.f28436d0 = true;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z11);
                        }
                        unVar.T();
                        return;
                    }
                    return;
                }
                break;
            default:
                sv.n((sv) this.f28828c, (ArrayList) this.d, (org.telegram.ui.ActionBar.n2) this.e, this.f28827b, view, i10);
                return;
        }
    }

    public vm(sv svVar, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f28828c = svVar;
        this.d = arrayList;
        this.e = n2Var;
        this.f28827b = e6Var;
    }
}
