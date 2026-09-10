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
import org.telegram.ui.ic1;
public final class cn implements jl0 {
    public final int f22202a = 1;
    public final org.telegram.ui.ActionBar.f6 f22203b;
    public final Object f22204c;
    public final Object d;
    public final Object e;

    public cn(zn znVar, org.telegram.ui.ActionBar.f6 f6Var, yi yiVar, Context context) {
        this.f22204c = znVar;
        this.f22203b = f6Var;
        this.d = yiVar;
        this.e = context;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f22202a) {
            case 0:
                zn znVar = (zn) this.f22204c;
                yi yiVar = (yi) this.d;
                Context context = (Context) this.e;
                s40 s40Var = znVar.f29771y;
                boolean[] zArr = znVar.L;
                c2.a aVar = znVar.N0;
                nn nnVar = znVar.v;
                xn xnVar = znVar.f29760r;
                ic1 ic1Var = znVar.f29762s;
                int i11 = znVar.L0;
                org.telegram.ui.ActionBar.f6 f6Var = this.f22203b;
                if (i10 == i11) {
                    sh.f fVar = new sh.f(znVar.getContext(), f6Var);
                    fVar.f42054k0 = new m.g3(znVar, 7);
                    ArrayList arrayList = znVar.P0;
                    fVar.f42046c0 = null;
                    fVar.f42057o0 = new HashSet(arrayList);
                    fVar.show();
                    return;
                } else if (i10 == znVar.I0) {
                    w70 F = w70.F(yiVar.container, f6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = znVar.T0;
                        if (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            j21 a2 = j21.a(i13);
                            int i14 = org.telegram.ui.ActionBar.j6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, znVar.f26421a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.j6.E8, new bi.g3(znVar, i13, view, 28));
                            i12++;
                        } else {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.da(znVar, context, view, f6Var, 15), false);
                            F.f28702t = false;
                            F.f28701s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i10 == znVar.f29765u0) {
                    znVar.P();
                    return;
                } else {
                    boolean z13 = view instanceof org.telegram.ui.Cells.x8;
                    if (z13 || (view instanceof org.telegram.ui.Cells.b6)) {
                        boolean z14 = znVar.f29736c0;
                        pn pnVar = znVar.f29769x;
                        if (pnVar != null) {
                            pnVar.f();
                        }
                        c2.a[] aVarArr = znVar.O0;
                        int length = aVarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                c2.a aVar2 = aVarArr[i15];
                                if (i10 == aVar2.f4071b) {
                                    boolean z15 = aVar2.f4070a;
                                    z11 = !z15;
                                    aVar2.f4070a = z11;
                                    int i16 = aVar.f4071b;
                                    zn znVar2 = (zn) aVar.f4072c;
                                    xn xnVar2 = znVar2.f29760r;
                                    if (i10 == i16) {
                                        ic1Var.setItemAnimator(nnVar);
                                        int i17 = aVar.f4071b;
                                        if (i17 >= 0) {
                                            s4.c1 K = znVar2.f29762s.K(i17);
                                            if (K != null) {
                                                View view2 = K.f41610a;
                                                if (view2 instanceof org.telegram.ui.Cells.b6) {
                                                    ((org.telegram.ui.Cells.b6) view2).setDivider(z11);
                                                }
                                            }
                                            xnVar2.m(aVar.f4071b);
                                        }
                                        if (!z15) {
                                            xnVar2.s(aVar.f4071b + 1, 1);
                                        } else {
                                            xnVar2.t(aVar.f4071b + 1, 1);
                                        }
                                        znVar.h0();
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
                            if (i10 == znVar.B0) {
                                z11 = znVar.f29732a0;
                                znVar.f29732a0 = !z11;
                                znVar.R();
                            } else {
                                int i18 = znVar.f29772y0;
                                if (i10 == i18) {
                                    z11 = !znVar.f29742f0;
                                    znVar.f29742f0 = z11;
                                } else if (i10 == znVar.C0) {
                                    if (!znVar.f29736c0 && !znVar.f29732a0) {
                                        znVar.T = !znVar.T;
                                    }
                                    z11 = znVar.T;
                                } else if (i10 == znVar.E0) {
                                    z11 = !znVar.S;
                                    znVar.S = z11;
                                } else if (i10 == znVar.H0) {
                                    if (znVar.U == 0 && znVar.V == 0) {
                                        znVar.U = 86400;
                                        znVar.V = 0;
                                        int i19 = znVar.I0;
                                        znVar.h0();
                                        if (i19 < 0) {
                                            s4.c1 K2 = ic1Var.K(znVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.f41610a;
                                                if (view3 instanceof org.telegram.ui.Cells.b6) {
                                                    ((org.telegram.ui.Cells.b6) view3).setDivider(true);
                                                }
                                            }
                                            ic1Var.setItemAnimator(nnVar);
                                            xnVar.s(znVar.I0, 3);
                                        }
                                    } else {
                                        znVar.U = 0;
                                        znVar.V = 0;
                                        int i20 = znVar.I0;
                                        znVar.h0();
                                        ic1Var.setItemAnimator(nnVar);
                                        xnVar.t(i20, 3);
                                        s4.c1 K3 = ic1Var.K(znVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.f41610a;
                                            if (view4 instanceof org.telegram.ui.Cells.b6) {
                                                ((org.telegram.ui.Cells.b6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (znVar.U == 0 && znVar.V == 0) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    z11 = z12;
                                } else if (i10 == znVar.D0) {
                                    z11 = !znVar.R;
                                    znVar.R = z11;
                                } else if (i10 == znVar.f29773z0) {
                                    z11 = !znVar.f29744g0;
                                    znVar.f29744g0 = z11;
                                    znVar.h0();
                                    int i21 = znVar.f29772y0;
                                    if (i21 >= 0 && i18 < 0) {
                                        ic1Var.setItemAnimator(nnVar);
                                        xnVar.o(znVar.f29772y0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        ic1Var.setItemAnimator(nnVar);
                                        xnVar.u(i18);
                                    }
                                } else if (i10 == znVar.F0) {
                                    boolean z16 = znVar.f29734b0;
                                    z11 = !z16;
                                    znVar.f29734b0 = z11;
                                    if (z16 && znVar.f29736c0) {
                                        boolean z17 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z17) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z17 = true;
                                            }
                                        }
                                    }
                                    int childCount = ic1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        s4.c1 T = ic1Var.T(ic1Var.getChildAt(i23));
                                        if (T.f41613f == 5) {
                                            ((org.telegram.ui.Cells.e6) T.f41610a).f19073a.a(znVar.f29734b0, true);
                                        }
                                    }
                                } else if (i10 == znVar.J0) {
                                    z11 = !znVar.W;
                                    znVar.W = z11;
                                } else if (i10 == znVar.G0) {
                                    if (!znVar.f29740e0) {
                                        ic1Var.setItemAnimator(nnVar);
                                        z11 = !znVar.f29736c0;
                                        znVar.f29736c0 = z11;
                                        int i24 = znVar.f29757o0;
                                        znVar.h0();
                                        if (znVar.f29736c0) {
                                            xnVar.s(znVar.f29757o0, 3);
                                        } else {
                                            xnVar.t(i24, 3);
                                        }
                                        xnVar.m(znVar.A0);
                                        if (znVar.f29736c0) {
                                            znVar.R = false;
                                            int i25 = znVar.D0;
                                            if (i25 >= 0) {
                                                s4.c1 K4 = ic1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.b6) K4.f41610a).setChecked(false);
                                                } else {
                                                    xnVar.m(znVar.D0);
                                                }
                                            }
                                        } else {
                                            int i26 = znVar.D0;
                                            if (i26 >= 0 && ic1Var.K(i26) == null) {
                                                xnVar.m(znVar.D0);
                                            }
                                        }
                                        znVar.R();
                                        if (znVar.f29736c0 && !znVar.f29734b0) {
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
                        if (znVar.f29738d0 && !znVar.f29736c0) {
                            s40Var.b(true);
                        }
                        ic1Var.getChildCount();
                        for (int i28 = znVar.f29764t0; i28 < znVar.f29764t0 + znVar.M; i28++) {
                            s4.c1 K5 = ic1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.f41610a;
                                if (view5 instanceof org.telegram.ui.Cells.e6) {
                                    org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view5;
                                    e6Var.m(znVar.f29736c0, true);
                                    e6Var.f19078r.a(zArr[i28 - znVar.f29764t0], z14);
                                    if (e6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == znVar.G0 && !znVar.f29738d0) {
                                        s40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        s40Var.f(e6Var.getCheckBox(), true);
                                        znVar.f29738d0 = true;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            ((org.telegram.ui.Cells.x8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.b6) {
                            ((org.telegram.ui.Cells.b6) view).setChecked(z11);
                        }
                        znVar.T();
                        return;
                    }
                    return;
                }
                break;
            default:
                wv.n((wv) this.f22204c, (ArrayList) this.d, (org.telegram.ui.ActionBar.p2) this.e, this.f22203b, view, i10);
                return;
        }
    }

    public cn(wv wvVar, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f22204c = wvVar;
        this.d = arrayList;
        this.e = p2Var;
        this.f22203b = f6Var;
    }
}
