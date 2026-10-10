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
public final class mn implements fm0 {
    public final int f28851a = 1;
    public final org.telegram.ui.ActionBar.e6 f28852b;
    public final Object f28853c;
    public final Object d;
    public final Object f28854e;

    public mn(lo loVar, org.telegram.ui.ActionBar.e6 e6Var, yi yiVar, Context context) {
        this.f28853c = loVar;
        this.f28852b = e6Var;
        this.d = yiVar;
        this.f28854e = context;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f28851a) {
            case 0:
                lo loVar = (lo) this.f28853c;
                yi yiVar = (yi) this.d;
                Context context = (Context) this.f28854e;
                a50 a50Var = loVar.f28473y;
                boolean[] zArr = loVar.L;
                c2.a aVar = loVar.N0;
                xn xnVar = loVar.v;
                jo joVar = loVar.f28462r;
                fc1 fc1Var = loVar.f28464s;
                int i11 = loVar.L0;
                org.telegram.ui.ActionBar.e6 e6Var = this.f28852b;
                if (i10 == i11) {
                    th.f fVar = new th.f(loVar.getContext(), e6Var);
                    fVar.f48520k0 = new m2.t(loVar, 7);
                    ArrayList arrayList = loVar.P0;
                    fVar.f48512c0 = null;
                    fVar.f48523o0 = new HashSet(arrayList);
                    fVar.show();
                    return;
                } else if (i10 == loVar.I0) {
                    q80 F = q80.F(yiVar.container, e6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = loVar.T0;
                        if (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            b31 a2 = b31.a(i13);
                            int i14 = org.telegram.ui.ActionBar.i6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i14, loVar.f30210a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.i6.E8, new zk(loVar, i13, view, 1));
                            i12++;
                        } else {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.ActionBar.n5(loVar, context, view, e6Var, 20), false);
                            F.f30121t = false;
                            F.f30120s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i10 == loVar.f28467u0) {
                    loVar.S();
                    return;
                } else {
                    boolean z13 = view instanceof org.telegram.ui.Cells.w8;
                    if (z13 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z14 = loVar.f28438c0;
                        zn znVar = loVar.f28471x;
                        if (znVar != null) {
                            znVar.f();
                        }
                        c2.a[] aVarArr = loVar.O0;
                        int length = aVarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                c2.a aVar2 = aVarArr[i15];
                                if (i10 == aVar2.f3994b) {
                                    boolean z15 = aVar2.f3993a;
                                    z11 = !z15;
                                    aVar2.f3993a = z11;
                                    int i16 = aVar.f3994b;
                                    lo loVar2 = (lo) aVar.f3995c;
                                    jo joVar2 = loVar2.f28462r;
                                    if (i10 == i16) {
                                        fc1Var.setItemAnimator(xnVar);
                                        int i17 = aVar.f3994b;
                                        if (i17 >= 0) {
                                            s4.d1 K = loVar2.f28464s.K(i17);
                                            if (K != null) {
                                                View view2 = K.f47702a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z11);
                                                }
                                            }
                                            joVar2.m(aVar.f3994b);
                                        }
                                        if (!z15) {
                                            joVar2.s(aVar.f3994b + 1, 1);
                                        } else {
                                            joVar2.t(aVar.f3994b + 1, 1);
                                        }
                                        loVar.k0();
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
                            if (i10 == loVar.B0) {
                                z11 = loVar.f28434a0;
                                loVar.f28434a0 = !z11;
                                loVar.U();
                            } else {
                                int i18 = loVar.f28474y0;
                                if (i10 == i18) {
                                    z11 = !loVar.f28444f0;
                                    loVar.f28444f0 = z11;
                                } else if (i10 == loVar.C0) {
                                    if (!loVar.f28438c0 && !loVar.f28434a0) {
                                        loVar.T = !loVar.T;
                                    }
                                    z11 = loVar.T;
                                } else if (i10 == loVar.E0) {
                                    z11 = !loVar.S;
                                    loVar.S = z11;
                                } else if (i10 == loVar.H0) {
                                    if (loVar.U == 0 && loVar.V == 0) {
                                        loVar.U = 86400;
                                        loVar.V = 0;
                                        int i19 = loVar.I0;
                                        loVar.k0();
                                        if (i19 < 0) {
                                            s4.d1 K2 = fc1Var.K(loVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.f47702a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            fc1Var.setItemAnimator(xnVar);
                                            joVar.s(loVar.I0, 3);
                                        }
                                    } else {
                                        loVar.U = 0;
                                        loVar.V = 0;
                                        int i20 = loVar.I0;
                                        loVar.k0();
                                        fc1Var.setItemAnimator(xnVar);
                                        joVar.t(i20, 3);
                                        s4.d1 K3 = fc1Var.K(loVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.f47702a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (loVar.U == 0 && loVar.V == 0) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    z11 = z12;
                                } else if (i10 == loVar.D0) {
                                    z11 = !loVar.R;
                                    loVar.R = z11;
                                } else if (i10 == loVar.f28475z0) {
                                    z11 = !loVar.f28446g0;
                                    loVar.f28446g0 = z11;
                                    loVar.k0();
                                    int i21 = loVar.f28474y0;
                                    if (i21 >= 0 && i18 < 0) {
                                        fc1Var.setItemAnimator(xnVar);
                                        joVar.o(loVar.f28474y0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        fc1Var.setItemAnimator(xnVar);
                                        joVar.u(i18);
                                    }
                                } else if (i10 == loVar.F0) {
                                    boolean z16 = loVar.f28436b0;
                                    z11 = !z16;
                                    loVar.f28436b0 = z11;
                                    if (z16 && loVar.f28438c0) {
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
                                        s4.d1 T = fc1Var.T(fc1Var.getChildAt(i23));
                                        if (T.f47706f == 5) {
                                            ((org.telegram.ui.Cells.d6) T.f47702a).f21975a.a(loVar.f28436b0, true);
                                        }
                                    }
                                } else if (i10 == loVar.J0) {
                                    z11 = !loVar.W;
                                    loVar.W = z11;
                                } else if (i10 == loVar.G0) {
                                    if (!loVar.f28442e0) {
                                        fc1Var.setItemAnimator(xnVar);
                                        z11 = !loVar.f28438c0;
                                        loVar.f28438c0 = z11;
                                        int i24 = loVar.f28459o0;
                                        loVar.k0();
                                        if (loVar.f28438c0) {
                                            joVar.s(loVar.f28459o0, 3);
                                        } else {
                                            joVar.t(i24, 3);
                                        }
                                        joVar.m(loVar.A0);
                                        if (loVar.f28438c0) {
                                            loVar.R = false;
                                            int i25 = loVar.D0;
                                            if (i25 >= 0) {
                                                s4.d1 K4 = fc1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.f47702a).setChecked(false);
                                                } else {
                                                    joVar.m(loVar.D0);
                                                }
                                            }
                                        } else {
                                            int i26 = loVar.D0;
                                            if (i26 >= 0 && fc1Var.K(i26) == null) {
                                                joVar.m(loVar.D0);
                                            }
                                        }
                                        loVar.U();
                                        if (loVar.f28438c0 && !loVar.f28436b0) {
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
                        if (loVar.f28440d0 && !loVar.f28438c0) {
                            a50Var.b(true);
                        }
                        fc1Var.getChildCount();
                        for (int i28 = loVar.f28466t0; i28 < loVar.f28466t0 + loVar.M; i28++) {
                            s4.d1 K5 = fc1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.f47702a;
                                if (view5 instanceof org.telegram.ui.Cells.d6) {
                                    org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view5;
                                    d6Var.m(loVar.f28438c0, true);
                                    d6Var.f21981r.a(zArr[i28 - loVar.f28466t0], z14);
                                    if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == loVar.G0 && !loVar.f28440d0) {
                                        a50Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        a50Var.f(d6Var.getCheckBox(), true);
                                        loVar.f28440d0 = true;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z11);
                        }
                        loVar.W();
                        return;
                    }
                    return;
                }
                break;
            default:
                jw.p((jw) this.f28853c, (ArrayList) this.d, (org.telegram.ui.ActionBar.n2) this.f28854e, this.f28852b, view, i10);
                return;
        }
    }

    public mn(jw jwVar, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f28853c = jwVar;
        this.d = arrayList;
        this.f28854e = n2Var;
        this.f28852b = e6Var;
    }
}
