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
import org.telegram.ui.va1;
public final class mm implements mk0 {
    public final int f30887a = 1;
    public final org.telegram.ui.ActionBar.b6 f30888b;
    public final Object f30889c;
    public final Object d;
    public final Object f30890e;

    public mm(jn jnVar, org.telegram.ui.ActionBar.b6 b6Var, ki kiVar, Context context) {
        this.f30889c = jnVar;
        this.f30888b = b6Var;
        this.d = kiVar;
        this.f30890e = context;
    }

    @Override
    public final void a(int i9, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f30887a) {
            case 0:
                jn jnVar = (jn) this.f30889c;
                ki kiVar = (ki) this.d;
                Context context = (Context) this.f30890e;
                s30 s30Var = jnVar.f29800y;
                boolean[] zArr = jnVar.H;
                m.a aVar = jnVar.J0;
                xm xmVar = jnVar.v;
                hn hnVar = jnVar.f29789r;
                va1 va1Var = jnVar.f29791s;
                int i10 = jnVar.H0;
                org.telegram.ui.ActionBar.b6 b6Var = this.f30888b;
                if (i9 == i10) {
                    bh.j jVar = new bh.j(jnVar.getContext(), b6Var);
                    jVar.f2041g0 = new n5.a0(jnVar, 7);
                    ArrayList arrayList = jnVar.L0;
                    jVar.Y = null;
                    jVar.f2045k0 = new HashSet(arrayList);
                    jVar.show();
                    return;
                } else if (i9 == jnVar.E0) {
                    x60 F = x60.F(kiVar.container, b6Var, view);
                    int i11 = 0;
                    while (true) {
                        int[] iArr = jnVar.P0;
                        if (i11 < iArr.length) {
                            int i12 = iArr[i11];
                            b11 a2 = b11.a(i12);
                            int i13 = org.telegram.ui.ActionBar.f6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i13, jnVar.f27492a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i12 / 3600, new Object[0]), i13, org.telegram.ui.ActionBar.f6.E8, new org.telegram.ui.rl(jnVar, i12, view, 1));
                            i11++;
                        } else {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.k6(jnVar, context, view, b6Var, 18), false);
                            F.f34581t = false;
                            F.f34580s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i9 == jnVar.f29788q0) {
                    jnVar.O();
                    return;
                } else {
                    boolean z13 = view instanceof org.telegram.ui.Cells.t8;
                    if (z13 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z14 = jnVar.V;
                        zm zmVar = jnVar.f29798x;
                        if (zmVar != null) {
                            zmVar.f();
                        }
                        m.a[] aVarArr = jnVar.K0;
                        int length = aVarArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 < length) {
                                m.a aVar2 = aVarArr[i14];
                                if (i9 == aVar2.f16883b) {
                                    boolean z15 = aVar2.f16882a;
                                    z11 = !z15;
                                    aVar2.f16882a = z11;
                                    int i15 = aVar.f16883b;
                                    jn jnVar2 = (jn) aVar.f16884c;
                                    hn hnVar2 = jnVar2.f29789r;
                                    if (i9 == i15) {
                                        va1Var.setItemAnimator(xmVar);
                                        int i16 = aVar.f16883b;
                                        if (i16 >= 0) {
                                            f2.q1 K = jnVar2.f29791s.K(i16);
                                            if (K != null) {
                                                View view2 = K.f5501a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z11);
                                                }
                                            }
                                            hnVar2.m(aVar.f16883b);
                                        }
                                        if (!z15) {
                                            hnVar2.s(aVar.f16883b + 1, 1);
                                        } else {
                                            hnVar2.t(aVar.f16883b + 1, 1);
                                        }
                                        jnVar.g0();
                                    }
                                    z10 = true;
                                } else {
                                    i14++;
                                }
                            } else {
                                z10 = false;
                                z11 = false;
                            }
                        }
                        if (!z10) {
                            if (i9 == jnVar.f29799x0) {
                                z11 = jnVar.T;
                                jnVar.T = !z11;
                                jnVar.Q();
                            } else {
                                int i17 = jnVar.f29794u0;
                                if (i9 == i17) {
                                    z11 = !jnVar.f29766b0;
                                    jnVar.f29766b0 = z11;
                                } else if (i9 == jnVar.f29801y0) {
                                    if (!jnVar.V && !jnVar.T) {
                                        jnVar.P = !jnVar.P;
                                    }
                                    z11 = jnVar.P;
                                } else if (i9 == jnVar.A0) {
                                    z11 = !jnVar.O;
                                    jnVar.O = z11;
                                } else if (i9 == jnVar.D0) {
                                    if (jnVar.Q == 0 && jnVar.R == 0) {
                                        jnVar.Q = 86400;
                                        jnVar.R = 0;
                                        int i18 = jnVar.E0;
                                        jnVar.g0();
                                        if (i18 < 0) {
                                            f2.q1 K2 = va1Var.K(jnVar.D0);
                                            if (K2 != null) {
                                                View view3 = K2.f5501a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            va1Var.setItemAnimator(xmVar);
                                            hnVar.s(jnVar.E0, 3);
                                        }
                                    } else {
                                        jnVar.Q = 0;
                                        jnVar.R = 0;
                                        int i19 = jnVar.E0;
                                        jnVar.g0();
                                        va1Var.setItemAnimator(xmVar);
                                        hnVar.t(i19, 3);
                                        f2.q1 K3 = va1Var.K(jnVar.D0);
                                        if (K3 != null) {
                                            View view4 = K3.f5501a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (jnVar.Q == 0 && jnVar.R == 0) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    z11 = z12;
                                } else if (i9 == jnVar.f29802z0) {
                                    z11 = !jnVar.N;
                                    jnVar.N = z11;
                                } else if (i9 == jnVar.f29795v0) {
                                    z11 = !jnVar.f29768c0;
                                    jnVar.f29768c0 = z11;
                                    jnVar.g0();
                                    int i20 = jnVar.f29794u0;
                                    if (i20 >= 0 && i17 < 0) {
                                        va1Var.setItemAnimator(xmVar);
                                        hnVar.o(jnVar.f29794u0);
                                    } else if (i17 >= 0 && i20 < 0) {
                                        va1Var.setItemAnimator(xmVar);
                                        hnVar.u(i17);
                                    }
                                } else if (i9 == jnVar.B0) {
                                    boolean z16 = jnVar.U;
                                    z11 = !z16;
                                    jnVar.U = z11;
                                    if (z16 && jnVar.V) {
                                        boolean z17 = false;
                                        for (int i21 = 0; i21 < zArr.length; i21++) {
                                            if (z17) {
                                                zArr[i21] = false;
                                            } else if (zArr[i21]) {
                                                z17 = true;
                                            }
                                        }
                                    }
                                    int childCount = va1Var.getChildCount();
                                    for (int i22 = 0; i22 < childCount; i22++) {
                                        f2.q1 T = va1Var.T(va1Var.getChildAt(i22));
                                        if (T.f5505f == 5) {
                                            ((org.telegram.ui.Cells.c6) T.f5501a).f24195a.a(jnVar.U, true);
                                        }
                                    }
                                } else if (i9 == jnVar.F0) {
                                    z11 = !jnVar.S;
                                    jnVar.S = z11;
                                } else if (i9 == jnVar.C0) {
                                    if (!jnVar.f29764a0) {
                                        va1Var.setItemAnimator(xmVar);
                                        z11 = !jnVar.V;
                                        jnVar.V = z11;
                                        int i23 = jnVar.f29782k0;
                                        jnVar.g0();
                                        if (jnVar.V) {
                                            hnVar.s(jnVar.f29782k0, 3);
                                        } else {
                                            hnVar.t(i23, 3);
                                        }
                                        hnVar.m(jnVar.f29797w0);
                                        if (jnVar.V) {
                                            jnVar.N = false;
                                            int i24 = jnVar.f29802z0;
                                            if (i24 >= 0) {
                                                f2.q1 K4 = va1Var.K(i24);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.f5501a).setChecked(false);
                                                } else {
                                                    hnVar.m(jnVar.f29802z0);
                                                }
                                            }
                                        } else {
                                            int i25 = jnVar.f29802z0;
                                            if (i25 >= 0 && va1Var.K(i25) == null) {
                                                hnVar.m(jnVar.f29802z0);
                                            }
                                        }
                                        jnVar.Q();
                                        if (jnVar.V && !jnVar.U) {
                                            boolean z18 = false;
                                            for (int i26 = 0; i26 < zArr.length; i26++) {
                                                if (z18) {
                                                    zArr[i26] = false;
                                                } else if (zArr[i26]) {
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
                        if (jnVar.W && !jnVar.V) {
                            s30Var.b(true);
                        }
                        va1Var.getChildCount();
                        for (int i27 = jnVar.f29787p0; i27 < jnVar.f29787p0 + jnVar.I; i27++) {
                            f2.q1 K5 = va1Var.K(i27);
                            if (K5 != null) {
                                View view5 = K5.f5501a;
                                if (view5 instanceof org.telegram.ui.Cells.c6) {
                                    org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view5;
                                    c6Var.m(jnVar.V, true);
                                    c6Var.f24201r.a(zArr[i27 - jnVar.f29787p0], z14);
                                    if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i9 == jnVar.C0 && !jnVar.W) {
                                        s30Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        s30Var.f(c6Var.getCheckBox(), true);
                                        jnVar.W = true;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            ((org.telegram.ui.Cells.t8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z11);
                        }
                        jnVar.S();
                        return;
                    }
                    return;
                }
                break;
            default:
                dv.n((dv) this.f30889c, (ArrayList) this.d, (org.telegram.ui.ActionBar.o2) this.f30890e, this.f30888b, view, i9);
                return;
        }
    }

    public mm(dv dvVar, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f30889c = dvVar;
        this.d = arrayList;
        this.f30890e = o2Var;
        this.f30888b = b6Var;
    }
}
