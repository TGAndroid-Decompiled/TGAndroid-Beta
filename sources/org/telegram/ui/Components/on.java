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
import org.telegram.ui.hc1;
public final class on implements km0 {
    public final int f29254a = 1;
    public final org.telegram.ui.ActionBar.c6 f29255b;
    public final Object f29256c;
    public final Object d;
    public final Object f29257e;

    public on(no noVar, org.telegram.ui.ActionBar.c6 c6Var, aj ajVar, Context context) {
        this.f29256c = noVar;
        this.f29255b = c6Var;
        this.d = ajVar;
        this.f29257e = context;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f29254a) {
            case 0:
                no noVar = (no) this.f29256c;
                aj ajVar = (aj) this.d;
                Context context = (Context) this.f29257e;
                c50 c50Var = noVar.f28916y;
                boolean[] zArr = noVar.L;
                c2.a aVar = noVar.N0;
                zn znVar = noVar.v;
                lo loVar = noVar.f28905r;
                hc1 hc1Var = noVar.f28907s;
                int i11 = noVar.L0;
                org.telegram.ui.ActionBar.c6 c6Var = this.f29255b;
                if (i10 == i11) {
                    th.f fVar = new th.f(noVar.getContext(), c6Var);
                    fVar.f48715k0 = new n4.l(noVar);
                    ArrayList arrayList = noVar.P0;
                    fVar.f48707c0 = null;
                    fVar.f48718o0 = new HashSet(arrayList);
                    fVar.show();
                    return;
                } else if (i10 == noVar.I0) {
                    s80 F = s80.F(ajVar.container, c6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = noVar.T0;
                        if (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            g31 a2 = g31.a(i13);
                            int i14 = org.telegram.ui.ActionBar.h6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i14, noVar.f30569a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.h6.E8, new bl(noVar, i13, view, 1));
                            i12++;
                        } else {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.ActionBar.l5(noVar, context, view, c6Var, 19), false);
                            F.f30469t = false;
                            F.f30468s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i10 == noVar.f28910u0) {
                    noVar.S();
                    return;
                } else {
                    boolean z13 = view instanceof org.telegram.ui.Cells.w8;
                    if (z13 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z14 = noVar.f28881c0;
                        bo boVar = noVar.f28914x;
                        if (boVar != null) {
                            boVar.f();
                        }
                        c2.a[] aVarArr = noVar.O0;
                        int length = aVarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                c2.a aVar2 = aVarArr[i15];
                                if (i10 == aVar2.f3993b) {
                                    boolean z15 = aVar2.f3992a;
                                    z11 = !z15;
                                    aVar2.f3992a = z11;
                                    int i16 = aVar.f3993b;
                                    no noVar2 = (no) aVar.f3994c;
                                    lo loVar2 = noVar2.f28905r;
                                    if (i10 == i16) {
                                        hc1Var.setItemAnimator(znVar);
                                        int i17 = aVar.f3993b;
                                        if (i17 >= 0) {
                                            s4.d1 K = noVar2.f28907s.K(i17);
                                            if (K != null) {
                                                View view2 = K.f47897a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z11);
                                                }
                                            }
                                            loVar2.m(aVar.f3993b);
                                        }
                                        if (!z15) {
                                            loVar2.s(aVar.f3993b + 1, 1);
                                        } else {
                                            loVar2.t(aVar.f3993b + 1, 1);
                                        }
                                        noVar.k0();
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
                            if (i10 == noVar.B0) {
                                z11 = noVar.f28877a0;
                                noVar.f28877a0 = !z11;
                                noVar.U();
                            } else {
                                int i18 = noVar.f28917y0;
                                if (i10 == i18) {
                                    z11 = !noVar.f28887f0;
                                    noVar.f28887f0 = z11;
                                } else if (i10 == noVar.C0) {
                                    if (!noVar.f28881c0 && !noVar.f28877a0) {
                                        noVar.T = !noVar.T;
                                    }
                                    z11 = noVar.T;
                                } else if (i10 == noVar.E0) {
                                    z11 = !noVar.S;
                                    noVar.S = z11;
                                } else if (i10 == noVar.H0) {
                                    if (noVar.U == 0 && noVar.V == 0) {
                                        noVar.U = 86400;
                                        noVar.V = 0;
                                        int i19 = noVar.I0;
                                        noVar.k0();
                                        if (i19 < 0) {
                                            s4.d1 K2 = hc1Var.K(noVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.f47897a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            hc1Var.setItemAnimator(znVar);
                                            loVar.s(noVar.I0, 3);
                                        }
                                    } else {
                                        noVar.U = 0;
                                        noVar.V = 0;
                                        int i20 = noVar.I0;
                                        noVar.k0();
                                        hc1Var.setItemAnimator(znVar);
                                        loVar.t(i20, 3);
                                        s4.d1 K3 = hc1Var.K(noVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.f47897a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (noVar.U == 0 && noVar.V == 0) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    z11 = z12;
                                } else if (i10 == noVar.D0) {
                                    z11 = !noVar.R;
                                    noVar.R = z11;
                                } else if (i10 == noVar.f28918z0) {
                                    z11 = !noVar.f28889g0;
                                    noVar.f28889g0 = z11;
                                    noVar.k0();
                                    int i21 = noVar.f28917y0;
                                    if (i21 >= 0 && i18 < 0) {
                                        hc1Var.setItemAnimator(znVar);
                                        loVar.o(noVar.f28917y0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        hc1Var.setItemAnimator(znVar);
                                        loVar.u(i18);
                                    }
                                } else if (i10 == noVar.F0) {
                                    boolean z16 = noVar.f28879b0;
                                    z11 = !z16;
                                    noVar.f28879b0 = z11;
                                    if (z16 && noVar.f28881c0) {
                                        boolean z17 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z17) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z17 = true;
                                            }
                                        }
                                    }
                                    int childCount = hc1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        s4.d1 T = hc1Var.T(hc1Var.getChildAt(i23));
                                        if (T.f47901f == 5) {
                                            ((org.telegram.ui.Cells.d6) T.f47897a).f21734a.a(noVar.f28879b0, true);
                                        }
                                    }
                                } else if (i10 == noVar.J0) {
                                    z11 = !noVar.W;
                                    noVar.W = z11;
                                } else if (i10 == noVar.G0) {
                                    if (!noVar.f28885e0) {
                                        hc1Var.setItemAnimator(znVar);
                                        z11 = !noVar.f28881c0;
                                        noVar.f28881c0 = z11;
                                        int i24 = noVar.f28902o0;
                                        noVar.k0();
                                        if (noVar.f28881c0) {
                                            loVar.s(noVar.f28902o0, 3);
                                        } else {
                                            loVar.t(i24, 3);
                                        }
                                        loVar.m(noVar.A0);
                                        if (noVar.f28881c0) {
                                            noVar.R = false;
                                            int i25 = noVar.D0;
                                            if (i25 >= 0) {
                                                s4.d1 K4 = hc1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.f47897a).setChecked(false);
                                                } else {
                                                    loVar.m(noVar.D0);
                                                }
                                            }
                                        } else {
                                            int i26 = noVar.D0;
                                            if (i26 >= 0 && hc1Var.K(i26) == null) {
                                                loVar.m(noVar.D0);
                                            }
                                        }
                                        noVar.U();
                                        if (noVar.f28881c0 && !noVar.f28879b0) {
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
                        if (noVar.f28883d0 && !noVar.f28881c0) {
                            c50Var.b(true);
                        }
                        hc1Var.getChildCount();
                        for (int i28 = noVar.f28909t0; i28 < noVar.f28909t0 + noVar.M; i28++) {
                            s4.d1 K5 = hc1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.f47897a;
                                if (view5 instanceof org.telegram.ui.Cells.d6) {
                                    org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view5;
                                    d6Var.m(noVar.f28881c0, true);
                                    d6Var.f21740r.a(zArr[i28 - noVar.f28909t0], z14);
                                    if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == noVar.G0 && !noVar.f28883d0) {
                                        c50Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        c50Var.f(d6Var.getCheckBox(), true);
                                        noVar.f28883d0 = true;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z11);
                        }
                        noVar.W();
                        return;
                    }
                    return;
                }
                break;
            default:
                lw.p((lw) this.f29256c, (ArrayList) this.d, (org.telegram.ui.ActionBar.m2) this.f29257e, this.f29255b, view, i10);
                return;
        }
    }

    public on(lw lwVar, ArrayList arrayList, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f29256c = lwVar;
        this.d = arrayList;
        this.f29257e = m2Var;
        this.f29255b = c6Var;
    }
}
