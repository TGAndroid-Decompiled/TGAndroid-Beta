package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.wa1;
public final class en implements zl0 {
    public final int f26079a = 0;
    public final org.telegram.ui.ActionBar.g6 f26080b;
    public final Object f26081c;
    public final Object d;
    public final Object e;

    public en(co coVar, org.telegram.ui.ActionBar.g6 g6Var, ri riVar, Context context) {
        this.f26081c = coVar;
        this.f26080b = g6Var;
        this.d = riVar;
        this.e = context;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f26079a) {
            case 0:
                co coVar = (co) this.f26081c;
                ri riVar = (ri) this.d;
                Context context = (Context) this.e;
                p40 p40Var = coVar.f25401y;
                boolean[] zArr = coVar.L;
                c5.f fVar = coVar.N0;
                pn pnVar = coVar.v;
                ao aoVar = coVar.f25390r;
                wa1 wa1Var = coVar.f25392s;
                int i11 = coVar.L0;
                org.telegram.ui.ActionBar.g6 g6Var = this.f26080b;
                if (i10 == i11) {
                    uh.f fVar2 = new uh.f(coVar.getContext(), g6Var);
                    fVar2.f48289k0 = new l2.f(coVar, 9);
                    ArrayList arrayList = coVar.P0;
                    fVar2.f48281c0 = null;
                    fVar2.f48292o0 = new HashSet(arrayList);
                    fVar2.show();
                    return;
                } else if (i10 == coVar.I0) {
                    h80 F = h80.F(riVar.container, g6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = coVar.T0;
                        if (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            v21 a2 = v21.a(i13);
                            int i14 = org.telegram.ui.ActionBar.k6.F8;
                            org.telegram.ui.ActionBar.r6.z(coVar, a2, i14, g6Var, PorterDuff.Mode.SRC_IN);
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.h4(coVar, i13, view, 6));
                            i12++;
                        } else {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.messenger.camera.i(coVar, context, view, g6Var, 23), false);
                            F.f26930t = false;
                            F.f26929s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i10 == coVar.f25395u0) {
                    coVar.S();
                    return;
                } else {
                    boolean z13 = view instanceof org.telegram.ui.Cells.w8;
                    if (z13 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z14 = coVar.f25361c0;
                        rn rnVar = coVar.f25399x;
                        if (rnVar != null) {
                            rnVar.f();
                        }
                        c5.f[] fVarArr = coVar.O0;
                        int length = fVarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                c5.f fVar3 = fVarArr[i15];
                                if (i10 == fVar3.f4733a) {
                                    boolean z15 = fVar3.f4734b;
                                    z11 = !z15;
                                    fVar3.f4734b = z11;
                                    int i16 = fVar.f4733a;
                                    co coVar2 = (co) fVar.f4735c;
                                    ao aoVar2 = coVar2.f25390r;
                                    if (i10 == i16) {
                                        wa1Var.setItemAnimator(pnVar);
                                        int i17 = fVar.f4733a;
                                        if (i17 >= 0) {
                                            s4.b1 K = coVar2.f25392s.K(i17);
                                            if (K != null) {
                                                View view2 = K.f46342a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z11);
                                                }
                                            }
                                            aoVar2.m(fVar.f4733a);
                                        }
                                        if (!z15) {
                                            aoVar2.s(fVar.f4733a + 1, 1);
                                        } else {
                                            aoVar2.t(fVar.f4733a + 1, 1);
                                        }
                                        coVar.l0();
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
                            if (i10 == coVar.B0) {
                                z11 = coVar.f25357a0;
                                coVar.f25357a0 = !z11;
                                coVar.U();
                            } else {
                                int i18 = coVar.f25402y0;
                                if (i10 == i18) {
                                    z11 = !coVar.f25367f0;
                                    coVar.f25367f0 = z11;
                                } else if (i10 == coVar.C0) {
                                    if (!coVar.f25361c0 && !coVar.f25357a0) {
                                        coVar.T = !coVar.T;
                                    }
                                    z11 = coVar.T;
                                } else if (i10 == coVar.E0) {
                                    z11 = !coVar.S;
                                    coVar.S = z11;
                                } else if (i10 == coVar.H0) {
                                    if (coVar.U == 0 && coVar.V == 0) {
                                        coVar.U = 86400;
                                        coVar.V = 0;
                                        int i19 = coVar.I0;
                                        coVar.l0();
                                        if (i19 < 0) {
                                            s4.b1 K2 = wa1Var.K(coVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.f46342a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            wa1Var.setItemAnimator(pnVar);
                                            aoVar.s(coVar.I0, 3);
                                        }
                                    } else {
                                        coVar.U = 0;
                                        coVar.V = 0;
                                        int i20 = coVar.I0;
                                        coVar.l0();
                                        wa1Var.setItemAnimator(pnVar);
                                        aoVar.t(i20, 3);
                                        s4.b1 K3 = wa1Var.K(coVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.f46342a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (coVar.U == 0 && coVar.V == 0) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    z11 = z12;
                                } else if (i10 == coVar.D0) {
                                    z11 = !coVar.R;
                                    coVar.R = z11;
                                } else if (i10 == coVar.f25403z0) {
                                    z11 = !coVar.f25369g0;
                                    coVar.f25369g0 = z11;
                                    coVar.l0();
                                    int i21 = coVar.f25402y0;
                                    if (i21 >= 0 && i18 < 0) {
                                        wa1Var.setItemAnimator(pnVar);
                                        aoVar.o(coVar.f25402y0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        wa1Var.setItemAnimator(pnVar);
                                        aoVar.u(i18);
                                    }
                                } else if (i10 == coVar.F0) {
                                    boolean z16 = coVar.f25359b0;
                                    z11 = !z16;
                                    coVar.f25359b0 = z11;
                                    if (z16 && coVar.f25361c0) {
                                        boolean z17 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z17) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z17 = true;
                                            }
                                        }
                                    }
                                    int childCount = wa1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        s4.b1 T = wa1Var.T(wa1Var.getChildAt(i23));
                                        if (T.f46345f == 5) {
                                            ((org.telegram.ui.Cells.d6) T.f46342a).f22278a.a(coVar.f25359b0, true);
                                        }
                                    }
                                } else if (i10 == coVar.J0) {
                                    z11 = !coVar.W;
                                    coVar.W = z11;
                                } else if (i10 == coVar.G0) {
                                    if (!coVar.f25365e0) {
                                        wa1Var.setItemAnimator(pnVar);
                                        z11 = !coVar.f25361c0;
                                        coVar.f25361c0 = z11;
                                        int i24 = coVar.f25384o0;
                                        coVar.l0();
                                        if (coVar.f25361c0) {
                                            aoVar.s(coVar.f25384o0, 3);
                                        } else {
                                            aoVar.t(i24, 3);
                                        }
                                        aoVar.m(coVar.A0);
                                        if (coVar.f25361c0) {
                                            coVar.R = false;
                                            int i25 = coVar.D0;
                                            if (i25 >= 0) {
                                                s4.b1 K4 = wa1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.f46342a).setChecked(false);
                                                } else {
                                                    aoVar.m(coVar.D0);
                                                }
                                            }
                                        } else {
                                            int i26 = coVar.D0;
                                            if (i26 >= 0 && wa1Var.K(i26) == null) {
                                                aoVar.m(coVar.D0);
                                            }
                                        }
                                        coVar.U();
                                        if (coVar.f25361c0 && !coVar.f25359b0) {
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
                        if (coVar.f25363d0 && !coVar.f25361c0) {
                            wa1Var.getChildCount();
                            p40Var.b(true);
                        }
                        for (int i28 = coVar.f25394t0; i28 < coVar.f25394t0 + coVar.M; i28++) {
                            s4.b1 K5 = wa1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.f46342a;
                                if (view5 instanceof org.telegram.ui.Cells.d6) {
                                    org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view5;
                                    d6Var.m(coVar.f25361c0, true);
                                    d6Var.f22283r.a(zArr[i28 - coVar.f25394t0], z14);
                                    if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == coVar.G0 && !coVar.f25363d0) {
                                        p40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        p40Var.f(d6Var.getCheckBox(), true);
                                        coVar.f25363d0 = true;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z11);
                        }
                        coVar.W();
                        return;
                    }
                    return;
                }
                break;
            default:
                yv.n((yv) this.f26081c, (ArrayList) this.d, (org.telegram.ui.ActionBar.o2) this.e, this.f26080b, view, i10);
                return;
        }
    }

    public en(yv yvVar, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f26081c = yvVar;
        this.d = arrayList;
        this.e = o2Var;
        this.f26080b = g6Var;
    }
}
