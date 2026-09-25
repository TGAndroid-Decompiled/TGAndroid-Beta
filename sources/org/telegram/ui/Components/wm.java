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
public final class wm implements kl0 {
    public final int f30136a = 1;
    public final org.telegram.ui.ActionBar.d6 f30137b;
    public final Object f30138c;
    public final Object d;
    public final Object e;

    public wm(vn vnVar, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar, Context context) {
        this.f30138c = vnVar;
        this.f30137b = d6Var;
        this.d = wiVar;
        this.e = context;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f30136a) {
            case 0:
                vn vnVar = (vn) this.f30138c;
                wi wiVar = (wi) this.d;
                Context context = (Context) this.e;
                j40 j40Var = vnVar.f29224y;
                boolean[] zArr = vnVar.L;
                c2.a aVar = vnVar.N0;
                in inVar = vnVar.v;
                tn tnVar = vnVar.f29213r;
                wb1 wb1Var = vnVar.f29215s;
                int i11 = vnVar.L0;
                org.telegram.ui.ActionBar.d6 d6Var = this.f30137b;
                if (i10 == i11) {
                    th.f fVar = new th.f(vnVar.getContext(), d6Var);
                    fVar.f43554k0 = new l.d(vnVar);
                    ArrayList arrayList = vnVar.P0;
                    fVar.f43546c0 = null;
                    fVar.f43557o0 = new HashSet(arrayList);
                    fVar.show();
                    return;
                } else if (i10 == vnVar.I0) {
                    y70 F = y70.F(wiVar.container, d6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = vnVar.T0;
                        if (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            i21 a2 = i21.a(i13);
                            int i14 = org.telegram.ui.ActionBar.h6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i14, vnVar.f27087a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.h6.E8, new xm(vnVar, i13, view, 0));
                            i12++;
                        } else {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.ActionBar.l5(vnVar, context, view, d6Var, 20), false);
                            F.f30556t = false;
                            F.f30555s = 0;
                            F.Z();
                            return;
                        }
                    }
                } else if (i10 == vnVar.f29218u0) {
                    vnVar.P();
                    return;
                } else {
                    boolean z13 = view instanceof org.telegram.ui.Cells.w8;
                    if (z13 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z14 = vnVar.f29189c0;
                        kn knVar = vnVar.f29222x;
                        if (knVar != null) {
                            knVar.f();
                        }
                        c2.a[] aVarArr = vnVar.O0;
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
                                    vn vnVar2 = (vn) aVar.f3650c;
                                    tn tnVar2 = vnVar2.f29213r;
                                    if (i10 == i16) {
                                        wb1Var.setItemAnimator(inVar);
                                        int i17 = aVar.f3649b;
                                        if (i17 >= 0) {
                                            s4.c1 K = vnVar2.f29215s.K(i17);
                                            if (K != null) {
                                                View view2 = K.f42961a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z11);
                                                }
                                            }
                                            tnVar2.m(aVar.f3649b);
                                        }
                                        if (!z15) {
                                            tnVar2.s(aVar.f3649b + 1, 1);
                                        } else {
                                            tnVar2.t(aVar.f3649b + 1, 1);
                                        }
                                        vnVar.h0();
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
                            if (i10 == vnVar.B0) {
                                z11 = vnVar.f29185a0;
                                vnVar.f29185a0 = !z11;
                                vnVar.R();
                            } else {
                                int i18 = vnVar.f29225y0;
                                if (i10 == i18) {
                                    z11 = !vnVar.f29195f0;
                                    vnVar.f29195f0 = z11;
                                } else if (i10 == vnVar.C0) {
                                    if (!vnVar.f29189c0 && !vnVar.f29185a0) {
                                        vnVar.T = !vnVar.T;
                                    }
                                    z11 = vnVar.T;
                                } else if (i10 == vnVar.E0) {
                                    z11 = !vnVar.S;
                                    vnVar.S = z11;
                                } else if (i10 == vnVar.H0) {
                                    if (vnVar.U == 0 && vnVar.V == 0) {
                                        vnVar.U = 86400;
                                        vnVar.V = 0;
                                        int i19 = vnVar.I0;
                                        vnVar.h0();
                                        if (i19 < 0) {
                                            s4.c1 K2 = wb1Var.K(vnVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.f42961a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            wb1Var.setItemAnimator(inVar);
                                            tnVar.s(vnVar.I0, 3);
                                        }
                                    } else {
                                        vnVar.U = 0;
                                        vnVar.V = 0;
                                        int i20 = vnVar.I0;
                                        vnVar.h0();
                                        wb1Var.setItemAnimator(inVar);
                                        tnVar.t(i20, 3);
                                        s4.c1 K3 = wb1Var.K(vnVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.f42961a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (vnVar.U == 0 && vnVar.V == 0) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    z11 = z12;
                                } else if (i10 == vnVar.D0) {
                                    z11 = !vnVar.R;
                                    vnVar.R = z11;
                                } else if (i10 == vnVar.f29226z0) {
                                    z11 = !vnVar.f29197g0;
                                    vnVar.f29197g0 = z11;
                                    vnVar.h0();
                                    int i21 = vnVar.f29225y0;
                                    if (i21 >= 0 && i18 < 0) {
                                        wb1Var.setItemAnimator(inVar);
                                        tnVar.o(vnVar.f29225y0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        wb1Var.setItemAnimator(inVar);
                                        tnVar.u(i18);
                                    }
                                } else if (i10 == vnVar.F0) {
                                    boolean z16 = vnVar.f29187b0;
                                    z11 = !z16;
                                    vnVar.f29187b0 = z11;
                                    if (z16 && vnVar.f29189c0) {
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
                                        if (T.f42964f == 5) {
                                            ((org.telegram.ui.Cells.d6) T.f42961a).f20135a.a(vnVar.f29187b0, true);
                                        }
                                    }
                                } else if (i10 == vnVar.J0) {
                                    z11 = !vnVar.W;
                                    vnVar.W = z11;
                                } else if (i10 == vnVar.G0) {
                                    if (!vnVar.f29193e0) {
                                        wb1Var.setItemAnimator(inVar);
                                        z11 = !vnVar.f29189c0;
                                        vnVar.f29189c0 = z11;
                                        int i24 = vnVar.f29210o0;
                                        vnVar.h0();
                                        if (vnVar.f29189c0) {
                                            tnVar.s(vnVar.f29210o0, 3);
                                        } else {
                                            tnVar.t(i24, 3);
                                        }
                                        tnVar.m(vnVar.A0);
                                        if (vnVar.f29189c0) {
                                            vnVar.R = false;
                                            int i25 = vnVar.D0;
                                            if (i25 >= 0) {
                                                s4.c1 K4 = wb1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.f42961a).setChecked(false);
                                                } else {
                                                    tnVar.m(vnVar.D0);
                                                }
                                            }
                                        } else {
                                            int i26 = vnVar.D0;
                                            if (i26 >= 0 && wb1Var.K(i26) == null) {
                                                tnVar.m(vnVar.D0);
                                            }
                                        }
                                        vnVar.R();
                                        if (vnVar.f29189c0 && !vnVar.f29187b0) {
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
                        if (vnVar.f29191d0 && !vnVar.f29189c0) {
                            j40Var.b(true);
                        }
                        wb1Var.getChildCount();
                        for (int i28 = vnVar.f29217t0; i28 < vnVar.f29217t0 + vnVar.M; i28++) {
                            s4.c1 K5 = wb1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.f42961a;
                                if (view5 instanceof org.telegram.ui.Cells.d6) {
                                    org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view5;
                                    d6Var2.m(vnVar.f29189c0, true);
                                    d6Var2.f20140r.a(zArr[i28 - vnVar.f29217t0], z14);
                                    if (d6Var2.getTop() > AndroidUtilities.dp(40.0f) && i10 == vnVar.G0 && !vnVar.f29191d0) {
                                        j40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        j40Var.f(d6Var2.getCheckBox(), true);
                                        vnVar.f29191d0 = true;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z11);
                        }
                        vnVar.T();
                        return;
                    }
                    return;
                }
                break;
            default:
                tv.n((tv) this.f30138c, (ArrayList) this.d, (org.telegram.ui.ActionBar.m2) this.e, this.f30137b, view, i10);
                return;
        }
    }

    public wm(tv tvVar, ArrayList arrayList, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f30138c = tvVar;
        this.d = arrayList;
        this.e = m2Var;
        this.f30137b = d6Var;
    }
}
