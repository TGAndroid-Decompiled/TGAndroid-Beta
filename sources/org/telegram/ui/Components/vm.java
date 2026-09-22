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
import org.telegram.ui.fc1;
public final class vm implements ml0 {
    public final int f29202a = 1;
    public final org.telegram.ui.ActionBar.f6 f29203b;
    public final Object f29204c;
    public final Object d;
    public final Object e;

    public vm(un unVar, org.telegram.ui.ActionBar.f6 f6Var, vi viVar, Context context) {
        this.f29204c = unVar;
        this.f29203b = f6Var;
        this.d = viVar;
        this.e = context;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f29202a) {
            case 0:
                un unVar = (un) this.f29204c;
                vi viVar = (vi) this.d;
                Context context = (Context) this.e;
                i40 i40Var = unVar.f28844y;
                boolean[] zArr = unVar.L;
                c2.a aVar = unVar.N0;
                hn hnVar = unVar.v;
                sn snVar = unVar.f28833r;
                fc1 fc1Var = unVar.f28835s;
                int i11 = unVar.L0;
                org.telegram.ui.ActionBar.f6 f6Var = this.f29203b;
                if (i10 == i11) {
                    th.f fVar = new th.f(unVar.getContext(), f6Var);
                    fVar.f43589k0 = new l.d(unVar, 10);
                    ArrayList arrayList = unVar.P0;
                    fVar.f43581c0 = null;
                    fVar.f43592o0 = new HashSet(arrayList);
                    fVar.show();
                    return;
                } else if (i10 == unVar.I0) {
                    y70 F = y70.F(viVar.container, f6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = unVar.T0;
                        if (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            l21 a2 = l21.a(i13);
                            int i14 = org.telegram.ui.ActionBar.j6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, unVar.f26785a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.j6.E8, new wm(unVar, i13, view, 0));
                            i12++;
                        } else {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.ActionBar.n5(unVar, context, view, f6Var, 19), false);
                            F.f30569t = false;
                            F.f30568s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i10 == unVar.f28838u0) {
                    unVar.P();
                    return;
                } else {
                    boolean z13 = view instanceof org.telegram.ui.Cells.x8;
                    if (z13 || (view instanceof org.telegram.ui.Cells.b6)) {
                        boolean z14 = unVar.f28809c0;
                        jn jnVar = unVar.f28842x;
                        if (jnVar != null) {
                            jnVar.f();
                        }
                        c2.a[] aVarArr = unVar.O0;
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
                                    un unVar2 = (un) aVar.f3657c;
                                    sn snVar2 = unVar2.f28833r;
                                    if (i10 == i16) {
                                        fc1Var.setItemAnimator(hnVar);
                                        int i17 = aVar.f3656b;
                                        if (i17 >= 0) {
                                            s4.c1 L = unVar2.f28835s.L(i17);
                                            if (L != null) {
                                                View view2 = L.f42995a;
                                                if (view2 instanceof org.telegram.ui.Cells.b6) {
                                                    ((org.telegram.ui.Cells.b6) view2).setDivider(z11);
                                                }
                                            }
                                            snVar2.m(aVar.f3656b);
                                        }
                                        if (!z15) {
                                            snVar2.s(aVar.f3656b + 1, 1);
                                        } else {
                                            snVar2.t(aVar.f3656b + 1, 1);
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
                                z11 = unVar.f28805a0;
                                unVar.f28805a0 = !z11;
                                unVar.R();
                            } else {
                                int i18 = unVar.f28845y0;
                                if (i10 == i18) {
                                    z11 = !unVar.f28815f0;
                                    unVar.f28815f0 = z11;
                                } else if (i10 == unVar.C0) {
                                    if (!unVar.f28809c0 && !unVar.f28805a0) {
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
                                            s4.c1 L2 = fc1Var.L(unVar.H0);
                                            if (L2 != null) {
                                                View view3 = L2.f42995a;
                                                if (view3 instanceof org.telegram.ui.Cells.b6) {
                                                    ((org.telegram.ui.Cells.b6) view3).setDivider(true);
                                                }
                                            }
                                            fc1Var.setItemAnimator(hnVar);
                                            snVar.s(unVar.I0, 3);
                                        }
                                    } else {
                                        unVar.U = 0;
                                        unVar.V = 0;
                                        int i20 = unVar.I0;
                                        unVar.h0();
                                        fc1Var.setItemAnimator(hnVar);
                                        snVar.t(i20, 3);
                                        s4.c1 L3 = fc1Var.L(unVar.H0);
                                        if (L3 != null) {
                                            View view4 = L3.f42995a;
                                            if (view4 instanceof org.telegram.ui.Cells.b6) {
                                                ((org.telegram.ui.Cells.b6) view4).setDivider(false);
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
                                } else if (i10 == unVar.f28846z0) {
                                    z11 = !unVar.f28817g0;
                                    unVar.f28817g0 = z11;
                                    unVar.h0();
                                    int i21 = unVar.f28845y0;
                                    if (i21 >= 0 && i18 < 0) {
                                        fc1Var.setItemAnimator(hnVar);
                                        snVar.o(unVar.f28845y0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        fc1Var.setItemAnimator(hnVar);
                                        snVar.u(i18);
                                    }
                                } else if (i10 == unVar.F0) {
                                    boolean z16 = unVar.f28807b0;
                                    z11 = !z16;
                                    unVar.f28807b0 = z11;
                                    if (z16 && unVar.f28809c0) {
                                        boolean z17 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z17) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z17 = true;
                                            }
                                        }
                                    }
                                    int childCount = fc1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        s4.c1 U = fc1Var.U(fc1Var.getChildAt(i23));
                                        if (U.f42998f == 5) {
                                            ((org.telegram.ui.Cells.e6) U.f42995a).f20197a.a(unVar.f28807b0, true);
                                        }
                                    }
                                } else if (i10 == unVar.J0) {
                                    z11 = !unVar.W;
                                    unVar.W = z11;
                                } else if (i10 == unVar.G0) {
                                    if (!unVar.f28813e0) {
                                        fc1Var.setItemAnimator(hnVar);
                                        z11 = !unVar.f28809c0;
                                        unVar.f28809c0 = z11;
                                        int i24 = unVar.f28830o0;
                                        unVar.h0();
                                        if (unVar.f28809c0) {
                                            snVar.s(unVar.f28830o0, 3);
                                        } else {
                                            snVar.t(i24, 3);
                                        }
                                        snVar.m(unVar.A0);
                                        if (unVar.f28809c0) {
                                            unVar.R = false;
                                            int i25 = unVar.D0;
                                            if (i25 >= 0) {
                                                s4.c1 L4 = fc1Var.L(i25);
                                                if (L4 != null) {
                                                    ((org.telegram.ui.Cells.b6) L4.f42995a).setChecked(false);
                                                } else {
                                                    snVar.m(unVar.D0);
                                                }
                                            }
                                        } else {
                                            int i26 = unVar.D0;
                                            if (i26 >= 0 && fc1Var.L(i26) == null) {
                                                snVar.m(unVar.D0);
                                            }
                                        }
                                        unVar.R();
                                        if (unVar.f28809c0 && !unVar.f28807b0) {
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
                        if (unVar.f28811d0 && !unVar.f28809c0) {
                            i40Var.b(true);
                        }
                        fc1Var.getChildCount();
                        for (int i28 = unVar.f28837t0; i28 < unVar.f28837t0 + unVar.M; i28++) {
                            s4.c1 L5 = fc1Var.L(i28);
                            if (L5 != null) {
                                View view5 = L5.f42995a;
                                if (view5 instanceof org.telegram.ui.Cells.e6) {
                                    org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view5;
                                    e6Var.m(unVar.f28809c0, true);
                                    e6Var.f20202r.a(zArr[i28 - unVar.f28837t0], z14);
                                    if (e6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == unVar.G0 && !unVar.f28811d0) {
                                        i40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        i40Var.f(e6Var.getCheckBox(), true);
                                        unVar.f28811d0 = true;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            ((org.telegram.ui.Cells.x8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.b6) {
                            ((org.telegram.ui.Cells.b6) view).setChecked(z11);
                        }
                        unVar.T();
                        return;
                    }
                    return;
                }
                break;
            default:
                tv.n((tv) this.f29204c, (ArrayList) this.d, (org.telegram.ui.ActionBar.n2) this.e, this.f29203b, view, i10);
                return;
        }
    }

    public vm(tv tvVar, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f29204c = tvVar;
        this.d = arrayList;
        this.e = n2Var;
        this.f29203b = f6Var;
    }
}
