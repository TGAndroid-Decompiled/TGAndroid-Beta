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
import org.telegram.ui.sa1;
public final class gn implements wl0 {
    public final int f26618a = 1;
    public final org.telegram.ui.ActionBar.d6 f26619b;
    public final Object f26620c;
    public final Object d;
    public final Object e;

    public gn(fo foVar, org.telegram.ui.ActionBar.d6 d6Var, ti tiVar, Context context) {
        this.f26620c = foVar;
        this.f26619b = d6Var;
        this.d = tiVar;
        this.e = context;
    }

    @Override
    public final void a(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f26618a) {
            case 0:
                fo foVar = (fo) this.f26620c;
                ti tiVar = (ti) this.d;
                Context context = (Context) this.e;
                r40 r40Var = foVar.f26302y;
                boolean[] zArr = foVar.L;
                c5.f fVar = foVar.N0;
                rn rnVar = foVar.v;
                co coVar = foVar.f26291r;
                sa1 sa1Var = foVar.f26293s;
                int i11 = foVar.L0;
                org.telegram.ui.ActionBar.d6 d6Var = this.f26619b;
                if (i10 == i11) {
                    uh.f fVar2 = new uh.f(foVar.getContext(), d6Var);
                    fVar2.f47845k0 = new l2.f(foVar, 9);
                    ArrayList arrayList = foVar.P0;
                    fVar2.f47837c0 = null;
                    fVar2.f47848o0 = new HashSet(arrayList);
                    fVar2.show();
                    return;
                } else if (i10 == foVar.I0) {
                    i80 F = i80.F(tiVar.container, d6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = foVar.T0;
                        if (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            r21 a2 = r21.a(i13);
                            int i14 = org.telegram.ui.ActionBar.h6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i14, foVar.f28222a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.h6.E8, new org.telegram.ui.i4(foVar, i13, view, 6));
                            i12++;
                        } else {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.messenger.camera.i(foVar, context, view, d6Var, 23), false);
                            F.f27135t = false;
                            F.f27134s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i10 == foVar.f26296u0) {
                    foVar.S();
                    return;
                } else {
                    boolean z13 = view instanceof org.telegram.ui.Cells.v8;
                    if (z13 || (view instanceof org.telegram.ui.Cells.z5)) {
                        boolean z14 = foVar.f26267c0;
                        tn tnVar = foVar.f26300x;
                        if (tnVar != null) {
                            tnVar.f();
                        }
                        c5.f[] fVarArr = foVar.O0;
                        int length = fVarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                c5.f fVar3 = fVarArr[i15];
                                if (i10 == fVar3.f4728a) {
                                    boolean z15 = fVar3.f4729b;
                                    z11 = !z15;
                                    fVar3.f4729b = z11;
                                    int i16 = fVar.f4728a;
                                    fo foVar2 = (fo) fVar.f4730c;
                                    co coVar2 = foVar2.f26291r;
                                    if (i10 == i16) {
                                        sa1Var.setItemAnimator(rnVar);
                                        int i17 = fVar.f4728a;
                                        if (i17 >= 0) {
                                            s4.b1 K = foVar2.f26293s.K(i17);
                                            if (K != null) {
                                                View view2 = K.f45912a;
                                                if (view2 instanceof org.telegram.ui.Cells.z5) {
                                                    ((org.telegram.ui.Cells.z5) view2).setDivider(z11);
                                                }
                                            }
                                            coVar2.m(fVar.f4728a);
                                        }
                                        if (!z15) {
                                            coVar2.s(fVar.f4728a + 1, 1);
                                        } else {
                                            coVar2.t(fVar.f4728a + 1, 1);
                                        }
                                        foVar.k0();
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
                            if (i10 == foVar.B0) {
                                z11 = foVar.f26263a0;
                                foVar.f26263a0 = !z11;
                                foVar.U();
                            } else {
                                int i18 = foVar.f26303y0;
                                if (i10 == i18) {
                                    z11 = !foVar.f26273f0;
                                    foVar.f26273f0 = z11;
                                } else if (i10 == foVar.C0) {
                                    if (!foVar.f26267c0 && !foVar.f26263a0) {
                                        foVar.T = !foVar.T;
                                    }
                                    z11 = foVar.T;
                                } else if (i10 == foVar.E0) {
                                    z11 = !foVar.S;
                                    foVar.S = z11;
                                } else if (i10 == foVar.H0) {
                                    if (foVar.U == 0 && foVar.V == 0) {
                                        foVar.U = 86400;
                                        foVar.V = 0;
                                        int i19 = foVar.I0;
                                        foVar.k0();
                                        if (i19 < 0) {
                                            s4.b1 K2 = sa1Var.K(foVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.f45912a;
                                                if (view3 instanceof org.telegram.ui.Cells.z5) {
                                                    ((org.telegram.ui.Cells.z5) view3).setDivider(true);
                                                }
                                            }
                                            sa1Var.setItemAnimator(rnVar);
                                            coVar.s(foVar.I0, 3);
                                        }
                                    } else {
                                        foVar.U = 0;
                                        foVar.V = 0;
                                        int i20 = foVar.I0;
                                        foVar.k0();
                                        sa1Var.setItemAnimator(rnVar);
                                        coVar.t(i20, 3);
                                        s4.b1 K3 = sa1Var.K(foVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.f45912a;
                                            if (view4 instanceof org.telegram.ui.Cells.z5) {
                                                ((org.telegram.ui.Cells.z5) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (foVar.U == 0 && foVar.V == 0) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    z11 = z12;
                                } else if (i10 == foVar.D0) {
                                    z11 = !foVar.R;
                                    foVar.R = z11;
                                } else if (i10 == foVar.f26304z0) {
                                    z11 = !foVar.f26275g0;
                                    foVar.f26275g0 = z11;
                                    foVar.k0();
                                    int i21 = foVar.f26303y0;
                                    if (i21 >= 0 && i18 < 0) {
                                        sa1Var.setItemAnimator(rnVar);
                                        coVar.o(foVar.f26303y0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        sa1Var.setItemAnimator(rnVar);
                                        coVar.u(i18);
                                    }
                                } else if (i10 == foVar.F0) {
                                    boolean z16 = foVar.f26265b0;
                                    z11 = !z16;
                                    foVar.f26265b0 = z11;
                                    if (z16 && foVar.f26267c0) {
                                        boolean z17 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z17) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z17 = true;
                                            }
                                        }
                                    }
                                    int childCount = sa1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        s4.b1 T = sa1Var.T(sa1Var.getChildAt(i23));
                                        if (T.f45915f == 5) {
                                            ((org.telegram.ui.Cells.c6) T.f45912a).f22088a.a(foVar.f26265b0, true);
                                        }
                                    }
                                } else if (i10 == foVar.J0) {
                                    z11 = !foVar.W;
                                    foVar.W = z11;
                                } else if (i10 == foVar.G0) {
                                    if (!foVar.f26271e0) {
                                        sa1Var.setItemAnimator(rnVar);
                                        z11 = !foVar.f26267c0;
                                        foVar.f26267c0 = z11;
                                        int i24 = foVar.f26288o0;
                                        foVar.k0();
                                        if (foVar.f26267c0) {
                                            coVar.s(foVar.f26288o0, 3);
                                        } else {
                                            coVar.t(i24, 3);
                                        }
                                        coVar.m(foVar.A0);
                                        if (foVar.f26267c0) {
                                            foVar.R = false;
                                            int i25 = foVar.D0;
                                            if (i25 >= 0) {
                                                s4.b1 K4 = sa1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.z5) K4.f45912a).setChecked(false);
                                                } else {
                                                    coVar.m(foVar.D0);
                                                }
                                            }
                                        } else {
                                            int i26 = foVar.D0;
                                            if (i26 >= 0 && sa1Var.K(i26) == null) {
                                                coVar.m(foVar.D0);
                                            }
                                        }
                                        foVar.U();
                                        if (foVar.f26267c0 && !foVar.f26265b0) {
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
                        if (foVar.f26269d0 && !foVar.f26267c0) {
                            r40Var.b(true);
                        }
                        sa1Var.getChildCount();
                        for (int i28 = foVar.f26295t0; i28 < foVar.f26295t0 + foVar.M; i28++) {
                            s4.b1 K5 = sa1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.f45912a;
                                if (view5 instanceof org.telegram.ui.Cells.c6) {
                                    org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view5;
                                    c6Var.m(foVar.f26267c0, true);
                                    c6Var.f22093r.a(zArr[i28 - foVar.f26295t0], z14);
                                    if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == foVar.G0 && !foVar.f26269d0) {
                                        r40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        r40Var.f(c6Var.getCheckBox(), true);
                                        foVar.f26269d0 = true;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            ((org.telegram.ui.Cells.v8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.z5) {
                            ((org.telegram.ui.Cells.z5) view).setChecked(z11);
                        }
                        foVar.W();
                        return;
                    }
                    return;
                }
                break;
            default:
                aw.o((aw) this.f26620c, (ArrayList) this.d, (org.telegram.ui.ActionBar.n2) this.e, this.f26619b, view, i10);
                return;
        }
    }

    public gn(aw awVar, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f26620c = awVar;
        this.d = arrayList;
        this.e = n2Var;
        this.f26619b = d6Var;
    }
}
