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
public final class xm implements ll0 {
    public final int f30420a = 1;
    public final org.telegram.ui.ActionBar.d6 f30421b;
    public final Object f30422c;
    public final Object d;
    public final Object e;

    public xm(wn wnVar, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar, Context context) {
        this.f30422c = wnVar;
        this.f30421b = d6Var;
        this.d = wiVar;
        this.e = context;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f30420a) {
            case 0:
                wn wnVar = (wn) this.f30422c;
                wi wiVar = (wi) this.d;
                Context context = (Context) this.e;
                k40 k40Var = wnVar.f30146y;
                boolean[] zArr = wnVar.L;
                c2.a aVar = wnVar.N0;
                jn jnVar = wnVar.v;
                un unVar = wnVar.f30135r;
                wb1 wb1Var = wnVar.f30137s;
                int i11 = wnVar.L0;
                org.telegram.ui.ActionBar.d6 d6Var = this.f30421b;
                if (i10 == i11) {
                    th.f fVar = new th.f(wnVar.getContext(), d6Var);
                    fVar.f43552k0 = new l.d(wnVar);
                    ArrayList arrayList = wnVar.P0;
                    fVar.f43544c0 = null;
                    fVar.f43555o0 = new HashSet(arrayList);
                    fVar.show();
                    return;
                } else if (i10 == wnVar.I0) {
                    z70 F = z70.F(wiVar.container, d6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = wnVar.T0;
                        if (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            j21 a2 = j21.a(i13);
                            int i14 = org.telegram.ui.ActionBar.h6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i14, wnVar.f27042a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.h6.E8, new ym(wnVar, i13, view, 0));
                            i12++;
                        } else {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.ActionBar.l5(wnVar, context, view, d6Var, 20), false);
                            F.f30840t = false;
                            F.f30839s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i10 == wnVar.f30140u0) {
                    wnVar.P();
                    return;
                } else {
                    boolean z13 = view instanceof org.telegram.ui.Cells.w8;
                    if (z13 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z14 = wnVar.f30111c0;
                        ln lnVar = wnVar.f30144x;
                        if (lnVar != null) {
                            lnVar.f();
                        }
                        c2.a[] aVarArr = wnVar.O0;
                        int length = aVarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                c2.a aVar2 = aVarArr[i15];
                                if (i10 == aVar2.f3649b) {
                                    boolean z15 = aVar2.f3648a;
                                    z11 = !z15;
                                    aVar2.f3648a = z11;
                                    int i16 = aVar.f3649b;
                                    wn wnVar2 = (wn) aVar.f3650c;
                                    un unVar2 = wnVar2.f30135r;
                                    if (i10 == i16) {
                                        wb1Var.setItemAnimator(jnVar);
                                        int i17 = aVar.f3649b;
                                        if (i17 >= 0) {
                                            s4.c1 K = wnVar2.f30137s.K(i17);
                                            if (K != null) {
                                                View view2 = K.f42959a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z11);
                                                }
                                            }
                                            unVar2.m(aVar.f3649b);
                                        }
                                        if (!z15) {
                                            unVar2.s(aVar.f3649b + 1, 1);
                                        } else {
                                            unVar2.t(aVar.f3649b + 1, 1);
                                        }
                                        wnVar.h0();
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
                            if (i10 == wnVar.B0) {
                                z11 = wnVar.f30107a0;
                                wnVar.f30107a0 = !z11;
                                wnVar.R();
                            } else {
                                int i18 = wnVar.f30147y0;
                                if (i10 == i18) {
                                    z11 = !wnVar.f30117f0;
                                    wnVar.f30117f0 = z11;
                                } else if (i10 == wnVar.C0) {
                                    if (!wnVar.f30111c0 && !wnVar.f30107a0) {
                                        wnVar.T = !wnVar.T;
                                    }
                                    z11 = wnVar.T;
                                } else if (i10 == wnVar.E0) {
                                    z11 = !wnVar.S;
                                    wnVar.S = z11;
                                } else if (i10 == wnVar.H0) {
                                    if (wnVar.U == 0 && wnVar.V == 0) {
                                        wnVar.U = 86400;
                                        wnVar.V = 0;
                                        int i19 = wnVar.I0;
                                        wnVar.h0();
                                        if (i19 < 0) {
                                            s4.c1 K2 = wb1Var.K(wnVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.f42959a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            wb1Var.setItemAnimator(jnVar);
                                            unVar.s(wnVar.I0, 3);
                                        }
                                    } else {
                                        wnVar.U = 0;
                                        wnVar.V = 0;
                                        int i20 = wnVar.I0;
                                        wnVar.h0();
                                        wb1Var.setItemAnimator(jnVar);
                                        unVar.t(i20, 3);
                                        s4.c1 K3 = wb1Var.K(wnVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.f42959a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (wnVar.U == 0 && wnVar.V == 0) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    z11 = z12;
                                } else if (i10 == wnVar.D0) {
                                    z11 = !wnVar.R;
                                    wnVar.R = z11;
                                } else if (i10 == wnVar.f30148z0) {
                                    z11 = !wnVar.f30119g0;
                                    wnVar.f30119g0 = z11;
                                    wnVar.h0();
                                    int i21 = wnVar.f30147y0;
                                    if (i21 >= 0 && i18 < 0) {
                                        wb1Var.setItemAnimator(jnVar);
                                        unVar.o(wnVar.f30147y0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        wb1Var.setItemAnimator(jnVar);
                                        unVar.u(i18);
                                    }
                                } else if (i10 == wnVar.F0) {
                                    boolean z16 = wnVar.f30109b0;
                                    z11 = !z16;
                                    wnVar.f30109b0 = z11;
                                    if (z16 && wnVar.f30111c0) {
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
                                        if (T.f42962f == 5) {
                                            ((org.telegram.ui.Cells.d6) T.f42959a).f20134a.a(wnVar.f30109b0, true);
                                        }
                                    }
                                } else if (i10 == wnVar.J0) {
                                    z11 = !wnVar.W;
                                    wnVar.W = z11;
                                } else if (i10 == wnVar.G0) {
                                    if (!wnVar.f30115e0) {
                                        wb1Var.setItemAnimator(jnVar);
                                        z11 = !wnVar.f30111c0;
                                        wnVar.f30111c0 = z11;
                                        int i24 = wnVar.f30132o0;
                                        wnVar.h0();
                                        if (wnVar.f30111c0) {
                                            unVar.s(wnVar.f30132o0, 3);
                                        } else {
                                            unVar.t(i24, 3);
                                        }
                                        unVar.m(wnVar.A0);
                                        if (wnVar.f30111c0) {
                                            wnVar.R = false;
                                            int i25 = wnVar.D0;
                                            if (i25 >= 0) {
                                                s4.c1 K4 = wb1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.f42959a).setChecked(false);
                                                } else {
                                                    unVar.m(wnVar.D0);
                                                }
                                            }
                                        } else {
                                            int i26 = wnVar.D0;
                                            if (i26 >= 0 && wb1Var.K(i26) == null) {
                                                unVar.m(wnVar.D0);
                                            }
                                        }
                                        wnVar.R();
                                        if (wnVar.f30111c0 && !wnVar.f30109b0) {
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
                        if (wnVar.f30113d0 && !wnVar.f30111c0) {
                            k40Var.b(true);
                        }
                        wb1Var.getChildCount();
                        for (int i28 = wnVar.f30139t0; i28 < wnVar.f30139t0 + wnVar.M; i28++) {
                            s4.c1 K5 = wb1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.f42959a;
                                if (view5 instanceof org.telegram.ui.Cells.d6) {
                                    org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view5;
                                    d6Var2.m(wnVar.f30111c0, true);
                                    d6Var2.f20139r.a(zArr[i28 - wnVar.f30139t0], z14);
                                    if (d6Var2.getTop() > AndroidUtilities.dp(40.0f) && i10 == wnVar.G0 && !wnVar.f30113d0) {
                                        k40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        k40Var.f(d6Var2.getCheckBox(), true);
                                        wnVar.f30113d0 = true;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z11);
                        }
                        wnVar.T();
                        return;
                    }
                    return;
                }
                break;
            default:
                uv.n((uv) this.f30422c, (ArrayList) this.d, (org.telegram.ui.ActionBar.m2) this.e, this.f30421b, view, i10);
                return;
        }
    }

    public xm(uv uvVar, ArrayList arrayList, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f30422c = uvVar;
        this.d = arrayList;
        this.e = m2Var;
        this.f30421b = d6Var;
    }
}
