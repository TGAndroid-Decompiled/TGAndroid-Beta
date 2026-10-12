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
import org.telegram.ui.kc1;
public final class jn implements am0 {
    public final int f26410a = 1;
    public final org.telegram.ui.ActionBar.c6 f26411b;
    public final Object f26412c;
    public final Object d;
    public final Object e;

    public jn(io ioVar, org.telegram.ui.ActionBar.c6 c6Var, vi viVar, Context context) {
        this.f26412c = ioVar;
        this.f26411b = c6Var;
        this.d = viVar;
        this.e = context;
    }

    @Override
    public final void a(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f26410a) {
            case 0:
                io ioVar = (io) this.f26412c;
                vi viVar = (vi) this.d;
                Context context = (Context) this.e;
                v40 v40Var = ioVar.f26040y;
                boolean[] zArr = ioVar.L;
                c5.f fVar = ioVar.N0;
                un unVar = ioVar.v;
                go goVar = ioVar.f26029r;
                kc1 kc1Var = ioVar.f26031s;
                int i11 = ioVar.L0;
                org.telegram.ui.ActionBar.c6 c6Var = this.f26411b;
                if (i10 == i11) {
                    uh.f fVar2 = new uh.f(ioVar.getContext(), c6Var);
                    fVar2.f46456k0 = new l2.f(ioVar, 8);
                    ArrayList arrayList = ioVar.P0;
                    fVar2.f46448c0 = null;
                    fVar2.f46459o0 = new HashSet(arrayList);
                    fVar2.show();
                    return;
                } else if (i10 == ioVar.I0) {
                    m80 F = m80.F(viVar.container, c6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = ioVar.T0;
                        if (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            w21 a2 = w21.a(i13);
                            int i14 = org.telegram.ui.ActionBar.g6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i14, ioVar.f27670a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.g6.E8, new org.telegram.ui.gm(ioVar, i13, view, 2));
                            i12++;
                        } else {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.p6(ioVar, context, view, c6Var, 18), false);
                            F.f27299t = false;
                            F.f27298s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i10 == ioVar.f26034u0) {
                    ioVar.S();
                    return;
                } else {
                    boolean z13 = view instanceof org.telegram.ui.Cells.w8;
                    if (z13 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z14 = ioVar.f26005c0;
                        wn wnVar = ioVar.f26038x;
                        if (wnVar != null) {
                            wnVar.f();
                        }
                        c5.f[] fVarArr = ioVar.O0;
                        int length = fVarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                c5.f fVar3 = fVarArr[i15];
                                if (i10 == fVar3.f4357a) {
                                    boolean z15 = fVar3.f4358b;
                                    z11 = !z15;
                                    fVar3.f4358b = z11;
                                    int i16 = fVar.f4357a;
                                    io ioVar2 = (io) fVar.f4359c;
                                    go goVar2 = ioVar2.f26029r;
                                    if (i10 == i16) {
                                        kc1Var.setItemAnimator(unVar);
                                        int i17 = fVar.f4357a;
                                        if (i17 >= 0) {
                                            s4.b1 K = ioVar2.f26031s.K(i17);
                                            if (K != null) {
                                                View view2 = K.f44838a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z11);
                                                }
                                            }
                                            goVar2.m(fVar.f4357a);
                                        }
                                        if (!z15) {
                                            goVar2.s(fVar.f4357a + 1, 1);
                                        } else {
                                            goVar2.t(fVar.f4357a + 1, 1);
                                        }
                                        ioVar.k0();
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
                            if (i10 == ioVar.B0) {
                                z11 = ioVar.f26001a0;
                                ioVar.f26001a0 = !z11;
                                ioVar.U();
                            } else {
                                int i18 = ioVar.f26041y0;
                                if (i10 == i18) {
                                    z11 = !ioVar.f26011f0;
                                    ioVar.f26011f0 = z11;
                                } else if (i10 == ioVar.C0) {
                                    if (!ioVar.f26005c0 && !ioVar.f26001a0) {
                                        ioVar.T = !ioVar.T;
                                    }
                                    z11 = ioVar.T;
                                } else if (i10 == ioVar.E0) {
                                    z11 = !ioVar.S;
                                    ioVar.S = z11;
                                } else if (i10 == ioVar.H0) {
                                    if (ioVar.U == 0 && ioVar.V == 0) {
                                        ioVar.U = 86400;
                                        ioVar.V = 0;
                                        int i19 = ioVar.I0;
                                        ioVar.k0();
                                        if (i19 < 0) {
                                            s4.b1 K2 = kc1Var.K(ioVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.f44838a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            kc1Var.setItemAnimator(unVar);
                                            goVar.s(ioVar.I0, 3);
                                        }
                                    } else {
                                        ioVar.U = 0;
                                        ioVar.V = 0;
                                        int i20 = ioVar.I0;
                                        ioVar.k0();
                                        kc1Var.setItemAnimator(unVar);
                                        goVar.t(i20, 3);
                                        s4.b1 K3 = kc1Var.K(ioVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.f44838a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (ioVar.U == 0 && ioVar.V == 0) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    z11 = z12;
                                } else if (i10 == ioVar.D0) {
                                    z11 = !ioVar.R;
                                    ioVar.R = z11;
                                } else if (i10 == ioVar.f26042z0) {
                                    z11 = !ioVar.f26013g0;
                                    ioVar.f26013g0 = z11;
                                    ioVar.k0();
                                    int i21 = ioVar.f26041y0;
                                    if (i21 >= 0 && i18 < 0) {
                                        kc1Var.setItemAnimator(unVar);
                                        goVar.o(ioVar.f26041y0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        kc1Var.setItemAnimator(unVar);
                                        goVar.u(i18);
                                    }
                                } else if (i10 == ioVar.F0) {
                                    boolean z16 = ioVar.f26003b0;
                                    z11 = !z16;
                                    ioVar.f26003b0 = z11;
                                    if (z16 && ioVar.f26005c0) {
                                        boolean z17 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z17) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z17 = true;
                                            }
                                        }
                                    }
                                    int childCount = kc1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        s4.b1 T = kc1Var.T(kc1Var.getChildAt(i23));
                                        if (T.f44841f == 5) {
                                            ((org.telegram.ui.Cells.d6) T.f44838a).f21069a.a(ioVar.f26003b0, true);
                                        }
                                    }
                                } else if (i10 == ioVar.J0) {
                                    z11 = !ioVar.W;
                                    ioVar.W = z11;
                                } else if (i10 == ioVar.G0) {
                                    if (!ioVar.f26009e0) {
                                        kc1Var.setItemAnimator(unVar);
                                        z11 = !ioVar.f26005c0;
                                        ioVar.f26005c0 = z11;
                                        int i24 = ioVar.f26026o0;
                                        ioVar.k0();
                                        if (ioVar.f26005c0) {
                                            goVar.s(ioVar.f26026o0, 3);
                                        } else {
                                            goVar.t(i24, 3);
                                        }
                                        goVar.m(ioVar.A0);
                                        if (ioVar.f26005c0) {
                                            ioVar.R = false;
                                            int i25 = ioVar.D0;
                                            if (i25 >= 0) {
                                                s4.b1 K4 = kc1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.f44838a).setChecked(false);
                                                } else {
                                                    goVar.m(ioVar.D0);
                                                }
                                            }
                                        } else {
                                            int i26 = ioVar.D0;
                                            if (i26 >= 0 && kc1Var.K(i26) == null) {
                                                goVar.m(ioVar.D0);
                                            }
                                        }
                                        ioVar.U();
                                        if (ioVar.f26005c0 && !ioVar.f26003b0) {
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
                        if (ioVar.f26007d0 && !ioVar.f26005c0) {
                            v40Var.b(true);
                        }
                        kc1Var.getChildCount();
                        for (int i28 = ioVar.f26033t0; i28 < ioVar.f26033t0 + ioVar.M; i28++) {
                            s4.b1 K5 = kc1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.f44838a;
                                if (view5 instanceof org.telegram.ui.Cells.d6) {
                                    org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view5;
                                    d6Var.m(ioVar.f26005c0, true);
                                    d6Var.f21074r.a(zArr[i28 - ioVar.f26033t0], z14);
                                    if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == ioVar.G0 && !ioVar.f26007d0) {
                                        v40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        v40Var.f(d6Var.getCheckBox(), true);
                                        ioVar.f26007d0 = true;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z11);
                        }
                        ioVar.W();
                        return;
                    }
                    return;
                }
                break;
            default:
                ew.o((ew) this.f26412c, (ArrayList) this.d, (org.telegram.ui.ActionBar.m2) this.e, this.f26411b, view, i10);
                return;
        }
    }

    public jn(ew ewVar, ArrayList arrayList, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f26412c = ewVar;
        this.d = arrayList;
        this.e = m2Var;
        this.f26411b = c6Var;
    }
}
