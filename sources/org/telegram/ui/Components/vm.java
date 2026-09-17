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
    public final int f31387a = 1;
    public final org.telegram.ui.ActionBar.f6 f31388b;
    public final Object f31389c;
    public final Object d;
    public final Object f31390e;

    public vm(tn tnVar, org.telegram.ui.ActionBar.f6 f6Var, vi viVar, Context context) {
        this.f31389c = tnVar;
        this.f31388b = f6Var;
        this.d = viVar;
        this.f31390e = context;
    }

    @Override
    public final void a(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f31387a) {
            case 0:
                tn tnVar = (tn) this.f31389c;
                vi viVar = (vi) this.d;
                Context context = (Context) this.f31390e;
                i40 i40Var = tnVar.f30691y;
                boolean[] zArr = tnVar.L;
                c2.a aVar = tnVar.N0;
                gn gnVar = tnVar.v;
                rn rnVar = tnVar.f30680r;
                ec1 ec1Var = tnVar.f30682s;
                int i11 = tnVar.L0;
                org.telegram.ui.ActionBar.f6 f6Var = this.f31388b;
                if (i10 == i11) {
                    uh.f fVar = new uh.f(tnVar.getContext(), f6Var);
                    fVar.f47286k0 = new ji.u4(tnVar, 11);
                    ArrayList arrayList = tnVar.P0;
                    fVar.f47278c0 = null;
                    fVar.f47289o0 = new HashSet(arrayList);
                    fVar.show();
                    return;
                } else if (i10 == tnVar.I0) {
                    n70 F = n70.F(viVar.container, f6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = tnVar.T0;
                        if (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            u11 a2 = u11.a(i13);
                            int i14 = org.telegram.ui.ActionBar.j6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, tnVar.f28780a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.j6.E8, new org.telegram.ui.dm(tnVar, i13, view, 1));
                            i12++;
                        } else {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.ActionBar.n5(tnVar, context, view, f6Var, 19), false);
                            F.f28689t = false;
                            F.f28688s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i10 == tnVar.f30685u0) {
                    tnVar.P();
                    return;
                } else {
                    boolean z13 = view instanceof org.telegram.ui.Cells.w8;
                    if (z13 || (view instanceof org.telegram.ui.Cells.z5)) {
                        boolean z14 = tnVar.f30656c0;
                        in inVar = tnVar.f30689x;
                        if (inVar != null) {
                            inVar.f();
                        }
                        c2.a[] aVarArr = tnVar.O0;
                        int length = aVarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                c2.a aVar2 = aVarArr[i15];
                                if (i10 == aVar2.f4166b) {
                                    boolean z15 = aVar2.f4165a;
                                    z11 = !z15;
                                    aVar2.f4165a = z11;
                                    int i16 = aVar.f4166b;
                                    tn tnVar2 = (tn) aVar.f4167c;
                                    rn rnVar2 = tnVar2.f30680r;
                                    if (i10 == i16) {
                                        ec1Var.setItemAnimator(gnVar);
                                        int i17 = aVar.f4166b;
                                        if (i17 >= 0) {
                                            s4.c1 K = tnVar2.f30682s.K(i17);
                                            if (K != null) {
                                                View view2 = K.f45767a;
                                                if (view2 instanceof org.telegram.ui.Cells.z5) {
                                                    ((org.telegram.ui.Cells.z5) view2).setDivider(z11);
                                                }
                                            }
                                            rnVar2.m(aVar.f4166b);
                                        }
                                        if (!z15) {
                                            rnVar2.s(aVar.f4166b + 1, 1);
                                        } else {
                                            rnVar2.t(aVar.f4166b + 1, 1);
                                        }
                                        tnVar.h0();
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
                            if (i10 == tnVar.B0) {
                                z11 = tnVar.f30652a0;
                                tnVar.f30652a0 = !z11;
                                tnVar.R();
                            } else {
                                int i18 = tnVar.f30692y0;
                                if (i10 == i18) {
                                    z11 = !tnVar.f30662f0;
                                    tnVar.f30662f0 = z11;
                                } else if (i10 == tnVar.C0) {
                                    if (!tnVar.f30656c0 && !tnVar.f30652a0) {
                                        tnVar.T = !tnVar.T;
                                    }
                                    z11 = tnVar.T;
                                } else if (i10 == tnVar.E0) {
                                    z11 = !tnVar.S;
                                    tnVar.S = z11;
                                } else if (i10 == tnVar.H0) {
                                    if (tnVar.U == 0 && tnVar.V == 0) {
                                        tnVar.U = 86400;
                                        tnVar.V = 0;
                                        int i19 = tnVar.I0;
                                        tnVar.h0();
                                        if (i19 < 0) {
                                            s4.c1 K2 = ec1Var.K(tnVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.f45767a;
                                                if (view3 instanceof org.telegram.ui.Cells.z5) {
                                                    ((org.telegram.ui.Cells.z5) view3).setDivider(true);
                                                }
                                            }
                                            ec1Var.setItemAnimator(gnVar);
                                            rnVar.s(tnVar.I0, 3);
                                        }
                                    } else {
                                        tnVar.U = 0;
                                        tnVar.V = 0;
                                        int i20 = tnVar.I0;
                                        tnVar.h0();
                                        ec1Var.setItemAnimator(gnVar);
                                        rnVar.t(i20, 3);
                                        s4.c1 K3 = ec1Var.K(tnVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.f45767a;
                                            if (view4 instanceof org.telegram.ui.Cells.z5) {
                                                ((org.telegram.ui.Cells.z5) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (tnVar.U == 0 && tnVar.V == 0) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    z11 = z12;
                                } else if (i10 == tnVar.D0) {
                                    z11 = !tnVar.R;
                                    tnVar.R = z11;
                                } else if (i10 == tnVar.f30693z0) {
                                    z11 = !tnVar.f30664g0;
                                    tnVar.f30664g0 = z11;
                                    tnVar.h0();
                                    int i21 = tnVar.f30692y0;
                                    if (i21 >= 0 && i18 < 0) {
                                        ec1Var.setItemAnimator(gnVar);
                                        rnVar.o(tnVar.f30692y0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        ec1Var.setItemAnimator(gnVar);
                                        rnVar.u(i18);
                                    }
                                } else if (i10 == tnVar.F0) {
                                    boolean z16 = tnVar.f30654b0;
                                    z11 = !z16;
                                    tnVar.f30654b0 = z11;
                                    if (z16 && tnVar.f30656c0) {
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
                                        if (T.f45771f == 5) {
                                            ((org.telegram.ui.Cells.c6) T.f45767a).f21710a.a(tnVar.f30654b0, true);
                                        }
                                    }
                                } else if (i10 == tnVar.J0) {
                                    z11 = !tnVar.W;
                                    tnVar.W = z11;
                                } else if (i10 == tnVar.G0) {
                                    if (!tnVar.f30660e0) {
                                        ec1Var.setItemAnimator(gnVar);
                                        z11 = !tnVar.f30656c0;
                                        tnVar.f30656c0 = z11;
                                        int i24 = tnVar.f30677o0;
                                        tnVar.h0();
                                        if (tnVar.f30656c0) {
                                            rnVar.s(tnVar.f30677o0, 3);
                                        } else {
                                            rnVar.t(i24, 3);
                                        }
                                        rnVar.m(tnVar.A0);
                                        if (tnVar.f30656c0) {
                                            tnVar.R = false;
                                            int i25 = tnVar.D0;
                                            if (i25 >= 0) {
                                                s4.c1 K4 = ec1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.z5) K4.f45767a).setChecked(false);
                                                } else {
                                                    rnVar.m(tnVar.D0);
                                                }
                                            }
                                        } else {
                                            int i26 = tnVar.D0;
                                            if (i26 >= 0 && ec1Var.K(i26) == null) {
                                                rnVar.m(tnVar.D0);
                                            }
                                        }
                                        tnVar.R();
                                        if (tnVar.f30656c0 && !tnVar.f30654b0) {
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
                        if (tnVar.f30658d0 && !tnVar.f30656c0) {
                            i40Var.b(true);
                        }
                        ec1Var.getChildCount();
                        for (int i28 = tnVar.f30684t0; i28 < tnVar.f30684t0 + tnVar.M; i28++) {
                            s4.c1 K5 = ec1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.f45767a;
                                if (view5 instanceof org.telegram.ui.Cells.c6) {
                                    org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view5;
                                    c6Var.m(tnVar.f30656c0, true);
                                    c6Var.f21716r.a(zArr[i28 - tnVar.f30684t0], z14);
                                    if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == tnVar.G0 && !tnVar.f30658d0) {
                                        i40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        i40Var.f(c6Var.getCheckBox(), true);
                                        tnVar.f30658d0 = true;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.z5) {
                            ((org.telegram.ui.Cells.z5) view).setChecked(z11);
                        }
                        tnVar.T();
                        return;
                    }
                    return;
                }
                break;
            default:
                rv.n((rv) this.f31389c, (ArrayList) this.d, (org.telegram.ui.ActionBar.n2) this.f31390e, this.f31388b, view, i10);
                return;
        }
    }

    public vm(rv rvVar, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f31389c = rvVar;
        this.d = arrayList;
        this.f31390e = n2Var;
        this.f31388b = f6Var;
    }
}
