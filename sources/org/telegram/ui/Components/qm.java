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
import org.telegram.ui.wa1;
public final class qm implements zk0 {
    public final int f32007a = 1;
    public final org.telegram.ui.ActionBar.c6 f32008b;
    public final Object f32009c;
    public final Object d;
    public final Object f32010e;

    public qm(on onVar, org.telegram.ui.ActionBar.c6 c6Var, ni niVar, Context context) {
        this.f32009c = onVar;
        this.f32008b = c6Var;
        this.d = niVar;
        this.f32010e = context;
    }

    @Override
    public final void c(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f32007a) {
            case 0:
                on onVar = (on) this.f32009c;
                ni niVar = (ni) this.d;
                Context context = (Context) this.f32010e;
                g40 g40Var = onVar.f31436y;
                boolean[] zArr = onVar.H;
                m.a aVar = onVar.J0;
                cn cnVar = onVar.v;
                mn mnVar = onVar.f31425r;
                wa1 wa1Var = onVar.f31427s;
                int i11 = onVar.H0;
                org.telegram.ui.ActionBar.c6 c6Var = this.f32008b;
                if (i10 == i11) {
                    eh.f fVar = new eh.f(onVar.getContext(), c6Var);
                    fVar.f6225g0 = new nh.d6(onVar, 7);
                    ArrayList arrayList = onVar.L0;
                    fVar.Y = null;
                    fVar.f6229k0 = new HashSet(arrayList);
                    fVar.show();
                    return;
                } else if (i10 == onVar.E0) {
                    j70 F = j70.F(niVar.container, c6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = onVar.P0;
                        if (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            m11 a2 = m11.a(i13);
                            int i14 = org.telegram.ui.ActionBar.g6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i14, onVar.f28402a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.g6.E8, new rm(onVar, i13, view, 0));
                            i12++;
                        } else {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.gg(onVar, context, view, c6Var, 12), false);
                            F.f29601t = false;
                            F.f29600s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i10 == onVar.f31424q0) {
                    onVar.P();
                    return;
                } else {
                    boolean z13 = view instanceof org.telegram.ui.Cells.q8;
                    if (z13 || (view instanceof org.telegram.ui.Cells.y5)) {
                        boolean z14 = onVar.V;
                        en enVar = onVar.f31434x;
                        if (enVar != null) {
                            enVar.f();
                        }
                        m.a[] aVarArr = onVar.K0;
                        int length = aVarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                m.a aVar2 = aVarArr[i15];
                                if (i10 == aVar2.f16482b) {
                                    boolean z15 = aVar2.f16481a;
                                    z11 = !z15;
                                    aVar2.f16481a = z11;
                                    int i16 = aVar.f16482b;
                                    on onVar2 = (on) aVar.f16483c;
                                    mn mnVar2 = onVar2.f31425r;
                                    if (i10 == i16) {
                                        wa1Var.setItemAnimator(cnVar);
                                        int i17 = aVar.f16482b;
                                        if (i17 >= 0) {
                                            f2.n1 K = onVar2.f31427s.K(i17);
                                            if (K != null) {
                                                View view2 = K.f6432a;
                                                if (view2 instanceof org.telegram.ui.Cells.y5) {
                                                    ((org.telegram.ui.Cells.y5) view2).setDivider(z11);
                                                }
                                            }
                                            mnVar2.m(aVar.f16482b);
                                        }
                                        if (!z15) {
                                            mnVar2.s(aVar.f16482b + 1, 1);
                                        } else {
                                            mnVar2.t(aVar.f16482b + 1, 1);
                                        }
                                        onVar.h0();
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
                            if (i10 == onVar.f31435x0) {
                                z11 = onVar.T;
                                onVar.T = !z11;
                                onVar.R();
                            } else {
                                int i18 = onVar.f31430u0;
                                if (i10 == i18) {
                                    z11 = !onVar.f31402b0;
                                    onVar.f31402b0 = z11;
                                } else if (i10 == onVar.f31437y0) {
                                    if (!onVar.V && !onVar.T) {
                                        onVar.P = !onVar.P;
                                    }
                                    z11 = onVar.P;
                                } else if (i10 == onVar.A0) {
                                    z11 = !onVar.O;
                                    onVar.O = z11;
                                } else if (i10 == onVar.D0) {
                                    if (onVar.Q == 0 && onVar.R == 0) {
                                        onVar.Q = 86400;
                                        onVar.R = 0;
                                        int i19 = onVar.E0;
                                        onVar.h0();
                                        if (i19 < 0) {
                                            f2.n1 K2 = wa1Var.K(onVar.D0);
                                            if (K2 != null) {
                                                View view3 = K2.f6432a;
                                                if (view3 instanceof org.telegram.ui.Cells.y5) {
                                                    ((org.telegram.ui.Cells.y5) view3).setDivider(true);
                                                }
                                            }
                                            wa1Var.setItemAnimator(cnVar);
                                            mnVar.s(onVar.E0, 3);
                                        }
                                    } else {
                                        onVar.Q = 0;
                                        onVar.R = 0;
                                        int i20 = onVar.E0;
                                        onVar.h0();
                                        wa1Var.setItemAnimator(cnVar);
                                        mnVar.t(i20, 3);
                                        f2.n1 K3 = wa1Var.K(onVar.D0);
                                        if (K3 != null) {
                                            View view4 = K3.f6432a;
                                            if (view4 instanceof org.telegram.ui.Cells.y5) {
                                                ((org.telegram.ui.Cells.y5) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (onVar.Q == 0 && onVar.R == 0) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    z11 = z12;
                                } else if (i10 == onVar.f31438z0) {
                                    z11 = !onVar.N;
                                    onVar.N = z11;
                                } else if (i10 == onVar.f31431v0) {
                                    z11 = !onVar.f31404c0;
                                    onVar.f31404c0 = z11;
                                    onVar.h0();
                                    int i21 = onVar.f31430u0;
                                    if (i21 >= 0 && i18 < 0) {
                                        wa1Var.setItemAnimator(cnVar);
                                        mnVar.o(onVar.f31430u0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        wa1Var.setItemAnimator(cnVar);
                                        mnVar.u(i18);
                                    }
                                } else if (i10 == onVar.B0) {
                                    boolean z16 = onVar.U;
                                    z11 = !z16;
                                    onVar.U = z11;
                                    if (z16 && onVar.V) {
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
                                        f2.n1 T = wa1Var.T(wa1Var.getChildAt(i23));
                                        if (T.f6436f == 5) {
                                            ((org.telegram.ui.Cells.a6) T.f6432a).f24081a.a(onVar.U, true);
                                        }
                                    }
                                } else if (i10 == onVar.F0) {
                                    z11 = !onVar.S;
                                    onVar.S = z11;
                                } else if (i10 == onVar.C0) {
                                    if (!onVar.f31400a0) {
                                        wa1Var.setItemAnimator(cnVar);
                                        z11 = !onVar.V;
                                        onVar.V = z11;
                                        int i24 = onVar.f31418k0;
                                        onVar.h0();
                                        if (onVar.V) {
                                            mnVar.s(onVar.f31418k0, 3);
                                        } else {
                                            mnVar.t(i24, 3);
                                        }
                                        mnVar.m(onVar.f31433w0);
                                        if (onVar.V) {
                                            onVar.N = false;
                                            int i25 = onVar.f31438z0;
                                            if (i25 >= 0) {
                                                f2.n1 K4 = wa1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.y5) K4.f6432a).setChecked(false);
                                                } else {
                                                    mnVar.m(onVar.f31438z0);
                                                }
                                            }
                                        } else {
                                            int i26 = onVar.f31438z0;
                                            if (i26 >= 0 && wa1Var.K(i26) == null) {
                                                mnVar.m(onVar.f31438z0);
                                            }
                                        }
                                        onVar.R();
                                        if (onVar.V && !onVar.U) {
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
                        if (onVar.W && !onVar.V) {
                            g40Var.b(true);
                        }
                        wa1Var.getChildCount();
                        for (int i28 = onVar.f31423p0; i28 < onVar.f31423p0 + onVar.I; i28++) {
                            f2.n1 K5 = wa1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.f6432a;
                                if (view5 instanceof org.telegram.ui.Cells.a6) {
                                    org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view5;
                                    a6Var.m(onVar.V, true);
                                    a6Var.f24087r.a(zArr[i28 - onVar.f31423p0], z14);
                                    if (a6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == onVar.C0 && !onVar.W) {
                                        g40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        g40Var.f(a6Var.getCheckBox(), true);
                                        onVar.W = true;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            ((org.telegram.ui.Cells.q8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.y5) {
                            ((org.telegram.ui.Cells.y5) view).setChecked(z11);
                        }
                        onVar.T();
                        return;
                    }
                    return;
                }
                break;
            default:
                jv.n((jv) this.f32009c, (ArrayList) this.d, (org.telegram.ui.ActionBar.o2) this.f32010e, this.f32008b, view, i10);
                return;
        }
    }

    public qm(jv jvVar, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f32009c = jvVar;
        this.d = arrayList;
        this.f32010e = o2Var;
        this.f32008b = c6Var;
    }
}
