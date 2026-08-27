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
import org.telegram.ui.ta1;

public final class jm implements pk0 {

    public final int f29723a = 1;

    public final org.telegram.ui.ActionBar.c6 f29724b;

    public final Object f29725c;
    public final Object d;

    public final Object f29726e;

    public jm(in inVar, org.telegram.ui.ActionBar.c6 c6Var, gi giVar, Context context) {
        this.f29725c = inVar;
        this.f29724b = c6Var;
        this.d = giVar;
        this.f29726e = context;
    }

    @Override
    public final void a(int i10, View view) {
        boolean z10;
        boolean z11;
        switch (this.f29723a) {
            case 0:
                in inVar = (in) this.f29725c;
                gi giVar = (gi) this.d;
                Context context = (Context) this.f29726e;
                x30 x30Var = inVar.f29446y;
                boolean[] zArr = inVar.H;
                m.a aVar = inVar.J0;
                vm vmVar = inVar.v;
                gn gnVar = inVar.f29435r;
                ta1 ta1Var = inVar.f29437s;
                int i11 = inVar.H0;
                org.telegram.ui.ActionBar.c6 c6Var = this.f29724b;
                if (i10 == i11) {
                    ch.h hVar = new ch.h(inVar.getContext(), c6Var);
                    hVar.f2922g0 = new n2.b0(inVar, 9);
                    ArrayList arrayList = inVar.L0;
                    hVar.Y = null;
                    hVar.f2926k0 = new HashSet(arrayList);
                    hVar.show();
                } else if (i10 == inVar.E0) {
                    b70 b70VarF = b70.F(giVar.container, c6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = inVar.P0;
                        if (i12 >= iArr.length) {
                            b70VarF.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.yf(inVar, context, view, c6Var, 14), false);
                            b70VarF.f26993t = false;
                            b70VarF.f26992s = 0;
                            b70VarF.Z();
                        } else {
                            int i13 = iArr[i12];
                            c11 c11VarA = c11.a(i13);
                            int i14 = org.telegram.ui.ActionBar.g6.F8;
                            c11VarA.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i14, inVar.f34899a), PorterDuff.Mode.SRC_IN));
                            b70VarF.b(0, c11VarA, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.g6.E8, new km(inVar, i13, view, 0));
                            i12++;
                        }
                    }
                } else if (i10 == inVar.f29434q0) {
                    inVar.P();
                } else {
                    boolean z12 = view instanceof org.telegram.ui.Cells.p8;
                    if (z12 || (view instanceof org.telegram.ui.Cells.x5)) {
                        boolean z13 = inVar.V;
                        ym ymVar = inVar.f29444x;
                        if (ymVar != null) {
                            ymVar.f();
                        }
                        m.a[] aVarArr = inVar.K0;
                        int length = aVarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                m.a aVar2 = aVarArr[i15];
                                if (i10 == aVar2.f17258b) {
                                    boolean z14 = aVar2.f17257a;
                                    z11 = !z14;
                                    aVar2.f17257a = z11;
                                    int i16 = aVar.f17258b;
                                    in inVar2 = (in) aVar.f17259c;
                                    gn gnVar2 = inVar2.f29435r;
                                    if (i10 == i16) {
                                        ta1Var.setItemAnimator(vmVar);
                                        int i17 = aVar.f17258b;
                                        if (i17 >= 0) {
                                            f2.o1 o1VarK = inVar2.f29437s.K(i17);
                                            if (o1VarK != null) {
                                                View view2 = o1VarK.f5789a;
                                                if (view2 instanceof org.telegram.ui.Cells.x5) {
                                                    ((org.telegram.ui.Cells.x5) view2).setDivider(z11);
                                                } else {
                                                    gnVar2.m(aVar.f17258b);
                                                }
                                            } else {
                                                gnVar2.m(aVar.f17258b);
                                            }
                                        }
                                        if (z14) {
                                            gnVar2.t(aVar.f17258b + 1, 1);
                                        } else {
                                            gnVar2.s(aVar.f17258b + 1, 1);
                                        }
                                        inVar.h0();
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
                            if (i10 == inVar.f29445x0) {
                                z11 = inVar.T;
                                inVar.T = !z11;
                                inVar.R();
                            } else {
                                int i18 = inVar.f29440u0;
                                if (i10 == i18) {
                                    z11 = !inVar.f29412b0;
                                    inVar.f29412b0 = z11;
                                } else if (i10 == inVar.f29447y0) {
                                    if (!inVar.V && !inVar.T) {
                                        inVar.P = !inVar.P;
                                    }
                                    z11 = inVar.P;
                                } else if (i10 == inVar.A0) {
                                    z11 = !inVar.O;
                                    inVar.O = z11;
                                } else if (i10 == inVar.D0) {
                                    if (inVar.Q == 0 && inVar.R == 0) {
                                        inVar.Q = 86400;
                                        inVar.R = 0;
                                        int i19 = inVar.E0;
                                        inVar.h0();
                                        if (i19 < 0) {
                                            f2.o1 o1VarK2 = ta1Var.K(inVar.D0);
                                            if (o1VarK2 != null) {
                                                View view3 = o1VarK2.f5789a;
                                                if (view3 instanceof org.telegram.ui.Cells.x5) {
                                                    ((org.telegram.ui.Cells.x5) view3).setDivider(true);
                                                }
                                            }
                                            ta1Var.setItemAnimator(vmVar);
                                            gnVar.s(inVar.E0, 3);
                                        }
                                    } else {
                                        inVar.Q = 0;
                                        inVar.R = 0;
                                        int i20 = inVar.E0;
                                        inVar.h0();
                                        ta1Var.setItemAnimator(vmVar);
                                        gnVar.t(i20, 3);
                                        f2.o1 o1VarK3 = ta1Var.K(inVar.D0);
                                        if (o1VarK3 != null) {
                                            View view4 = o1VarK3.f5789a;
                                            if (view4 instanceof org.telegram.ui.Cells.x5) {
                                                ((org.telegram.ui.Cells.x5) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    z11 = (inVar.Q == 0 && inVar.R == 0) ? false : true;
                                } else if (i10 == inVar.f29448z0) {
                                    z11 = !inVar.N;
                                    inVar.N = z11;
                                } else if (i10 == inVar.f29441v0) {
                                    z11 = !inVar.f29414c0;
                                    inVar.f29414c0 = z11;
                                    inVar.h0();
                                    int i21 = inVar.f29440u0;
                                    if (i21 >= 0 && i18 < 0) {
                                        ta1Var.setItemAnimator(vmVar);
                                        gnVar.o(inVar.f29440u0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        ta1Var.setItemAnimator(vmVar);
                                        gnVar.u(i18);
                                    }
                                } else if (i10 == inVar.B0) {
                                    boolean z15 = inVar.U;
                                    z11 = !z15;
                                    inVar.U = z11;
                                    if (z15 && inVar.V) {
                                        boolean z16 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z16) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z16 = true;
                                            }
                                        }
                                    }
                                    int childCount = ta1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        f2.o1 o1VarT = ta1Var.T(ta1Var.getChildAt(i23));
                                        if (o1VarT.f5793f == 5) {
                                            ((org.telegram.ui.Cells.z5) o1VarT.f5789a).f26031a.a(inVar.U, true);
                                        }
                                    }
                                } else if (i10 == inVar.F0) {
                                    z11 = !inVar.S;
                                    inVar.S = z11;
                                } else if (i10 == inVar.C0) {
                                    if (!inVar.f29410a0) {
                                        ta1Var.setItemAnimator(vmVar);
                                        z11 = !inVar.V;
                                        inVar.V = z11;
                                        int i24 = inVar.f29428k0;
                                        inVar.h0();
                                        if (inVar.V) {
                                            gnVar.s(inVar.f29428k0, 3);
                                        } else {
                                            gnVar.t(i24, 3);
                                        }
                                        gnVar.m(inVar.f29443w0);
                                        if (inVar.V) {
                                            inVar.N = false;
                                            int i25 = inVar.f29448z0;
                                            if (i25 >= 0) {
                                                f2.o1 o1VarK4 = ta1Var.K(i25);
                                                if (o1VarK4 != null) {
                                                    ((org.telegram.ui.Cells.x5) o1VarK4.f5789a).setChecked(false);
                                                } else {
                                                    gnVar.m(inVar.f29448z0);
                                                }
                                            }
                                        } else {
                                            int i26 = inVar.f29448z0;
                                            if (i26 >= 0 && ta1Var.K(i26) == null) {
                                                gnVar.m(inVar.f29448z0);
                                            }
                                        }
                                        inVar.R();
                                        if (inVar.V && !inVar.U) {
                                            boolean z17 = false;
                                            for (int i27 = 0; i27 < zArr.length; i27++) {
                                                if (z17) {
                                                    zArr[i27] = false;
                                                } else if (zArr[i27]) {
                                                    z17 = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (inVar.W && !inVar.V) {
                            x30Var.b(true);
                        }
                        ta1Var.getChildCount();
                        for (int i28 = inVar.f29433p0; i28 < inVar.f29433p0 + inVar.I; i28++) {
                            f2.o1 o1VarK5 = ta1Var.K(i28);
                            if (o1VarK5 != null) {
                                View view5 = o1VarK5.f5789a;
                                if (view5 instanceof org.telegram.ui.Cells.z5) {
                                    org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view5;
                                    z5Var.m(inVar.V, true);
                                    z5Var.f26037r.a(zArr[i28 - inVar.f29433p0], z13);
                                    if (z5Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == inVar.C0 && !inVar.W) {
                                        x30Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        x30Var.f(z5Var.getCheckBox(), true);
                                        inVar.W = true;
                                    }
                                }
                            }
                        }
                        if (z12) {
                            ((org.telegram.ui.Cells.p8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.x5) {
                            ((org.telegram.ui.Cells.x5) view).setChecked(z11);
                        }
                        inVar.T();
                    }
                }
                break;
            default:
                cv.n((cv) this.f29725c, (ArrayList) this.d, (org.telegram.ui.ActionBar.n2) this.f29726e, this.f29724b, view, i10);
                break;
        }
    }

    public jm(cv cvVar, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f29725c = cvVar;
        this.d = arrayList;
        this.f29726e = n2Var;
        this.f29724b = c6Var;
    }
}
