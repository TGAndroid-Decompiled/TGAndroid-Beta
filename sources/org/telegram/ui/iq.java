package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class iq extends org.telegram.ui.Components.sj0 {
    public final Context f46364c;
    public final nq d;

    public iq(nq nqVar, Context context) {
        this.d = nqVar;
        this.f46364c = context;
    }

    @Override
    public final void A(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(u4.d1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iq.D(u4.d1):boolean");
    }

    public final TLObject E(int i3) {
        nq nqVar = this.d;
        int i10 = nqVar.E0;
        if (i3 >= i10 && i3 < nqVar.F0) {
            return (TLObject) nqVar.F.get(i3 - i10);
        }
        int i11 = nqVar.U0;
        if (i3 >= i11 && i3 < nqVar.V0) {
            return (TLObject) nqVar.H.get(i3 - i11);
        }
        int i12 = nqVar.X0;
        if (i3 >= i12 && i3 < nqVar.Y0) {
            return (TLObject) nqVar.G.get(i3 - i12);
        }
        return null;
    }

    @Override
    public final int b() {
        return this.d.f48056d1;
    }

    @Override
    public final int d(int i3) {
        nq nqVar = this.d;
        if (i3 != nqVar.f48104z0 && i3 != nqVar.A0 && i3 != nqVar.f48093v0 && i3 != nqVar.f48089t0) {
            if ((i3 >= nqVar.E0 && i3 < nqVar.F0) || ((i3 >= nqVar.X0 && i3 < nqVar.Y0) || (i3 >= nqVar.U0 && i3 < nqVar.V0))) {
                return 0;
            }
            if (i3 != nqVar.C0 && i3 != nqVar.G0 && i3 != nqVar.H0) {
                if (i3 != nqVar.D0 && i3 != nqVar.S && i3 != nqVar.N0 && i3 != nqVar.f48087s0 && i3 != nqVar.f48079p0) {
                    if (i3 != nqVar.f48051b1 && i3 != nqVar.P0 && i3 != nqVar.R0 && i3 != nqVar.f48091u0 && i3 != nqVar.f48102y0 && i3 != nqVar.K0 && i3 != nqVar.M0 && i3 != nqVar.f48070j1 && i3 != nqVar.f48077o0 && i3 != nqVar.f48084r0) {
                        if (i3 == nqVar.f48054c1) {
                            return 4;
                        }
                        if (i3 == nqVar.B0) {
                            return 6;
                        }
                        if (i3 != nqVar.f48063g0 && i3 != nqVar.f48065h0 && i3 != nqVar.m0 && i3 != nqVar.f48067i0 && i3 != nqVar.f48069j0 && i3 != nqVar.T && i3 != nqVar.f48058e0 && i3 != nqVar.f48061f0 && i3 != nqVar.f48072l0 && i3 != nqVar.Q0) {
                            if (i3 != nqVar.Z0 && i3 != nqVar.T0 && i3 != nqVar.W0 && i3 != nqVar.f48064g1) {
                                if (i3 == nqVar.O0) {
                                    return 9;
                                }
                                if (i3 == nqVar.f48048a1) {
                                    return 10;
                                }
                                if (i3 == nqVar.f48062f1) {
                                    return 11;
                                }
                                if (i3 != nqVar.f48099x0 && i3 != nqVar.J0 && i3 != nqVar.L0) {
                                    if (nqVar.u0(i3)) {
                                        return 13;
                                    }
                                    if (i3 == nqVar.U) {
                                        return 14;
                                    }
                                    if (i3 == nqVar.S0) {
                                        return 15;
                                    }
                                    if (i3 != nqVar.f48066h1 && i3 != nqVar.f48068i1 && i3 != nqVar.f48075n0) {
                                        if (i3 != nqVar.f48081q0) {
                                            return 0;
                                        }
                                        return 17;
                                    }
                                    return 16;
                                }
                                return 12;
                            }
                            return 8;
                        }
                        return 7;
                    }
                    return 1;
                }
                return 5;
            }
            return 3;
        }
        return 2;
    }

    @Override
    public final void t(u4.d1 r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iq.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        int i10;
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.Components.ut0 ut0Var;
        org.telegram.ui.Components.ut0 ut0Var2;
        int i11 = 2;
        int i12 = 0;
        Context context = this.f46364c;
        nq nqVar = this.d;
        switch (i3) {
            case 0:
                int i13 = nqVar.O;
                if (i13 != 0 && i13 != 3) {
                    i10 = 6;
                } else {
                    i10 = 7;
                }
                if (i13 == 0 || i13 == 3) {
                    i11 = 6;
                }
                if (nqVar.f48059e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f46364c, i10, i11, z10, null);
                a5Var.setDelegate(new hq(this, 0));
                ut0Var2 = a5Var;
                ut0Var = ut0Var2;
                break;
            case 1:
                ut0Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 2:
                ut0Var = new org.telegram.ui.Cells.x4(context);
                break;
            case 3:
                ut0Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
                if (nqVar.f48086s) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131748246, null));
                    ut0Var = y8Var;
                    break;
                } else if (nqVar.f48095w) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131748245, null));
                    ut0Var = y8Var;
                    break;
                } else {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131748244, null));
                    ut0Var = y8Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.f46364c, org.telegram.ui.ActionBar.k6.L6, 21, 11, false, null);
                n4Var.setHeight(43);
                ut0Var2 = n4Var;
                ut0Var = ut0Var2;
                break;
            case 6:
                ut0Var = new org.telegram.ui.Cells.v9(context);
                break;
            case 7:
            case 14:
                ut0Var = new org.telegram.ui.Cells.p8(context);
                break;
            case 8:
                e6Var = ((org.telegram.ui.ActionBar.d2) nqVar).resourceProvider;
                View x3Var = new org.telegram.ui.Cells.x3(26, context, e6Var);
                x3Var.setBackground(null);
                ut0Var = x3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.ut0 ut0Var3 = new org.telegram.ui.Components.ut0(context, null);
                ut0Var3.b(nqVar.f48080p1, null, org.telegram.messenger.bd.M0(2131745315, "SlowmodeOff"), org.telegram.messenger.bd.a0(null, null, 2131745314, 5), org.telegram.messenger.bd.a0(null, null, 2131745314, 10), org.telegram.messenger.bd.a0(null, null, 2131745314, 30), org.telegram.messenger.bd.a0(null, null, 2131745316, 1), org.telegram.messenger.bd.a0(null, null, 2131745316, 5), org.telegram.messenger.bd.a0(null, null, 2131745316, 15), org.telegram.messenger.bd.a0(null, null, 2131745319, 1));
                ut0Var3.setCallback(new hq(this, 1));
                ut0Var = ut0Var3;
                break;
            case 10:
                ut0Var = new org.telegram.ui.Cells.t4(context, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
                izVar.setIsSingleCell(true);
                izVar.setViewType(6);
                izVar.f34869x = false;
                izVar.setUseHeaderOffset(false);
                izVar.setPaddingLeft(org.telegram.messenger.g0.L(5.0f));
                u4.p0 p0Var = new u4.p0(-1, -1);
                int L = org.telegram.messenger.g0.L(12.0f);
                ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = org.telegram.messenger.g0.L(30.0f);
                izVar.setLayoutParams(p0Var);
                ut0Var = izVar;
                break;
            case 12:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(23, this.f46364c, nqVar.getResourceProvider(), false, true);
                l8Var.f29600w = 50;
                ut0Var = l8Var;
                break;
            case 13:
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(this.f46364c, 4, 21, false, nqVar.getResourceProvider());
                c2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.f28008k7);
                c2Var.setEnabled(true);
                ut0Var = c2Var;
                break;
            case 15:
                org.telegram.ui.Components.ut0 ut0Var4 = new org.telegram.ui.Components.ut0(context, null);
                Drawable[] drawableArr = {nqVar.getParentActivity().getDrawable(2131231930), nqVar.getParentActivity().getDrawable(2131231931), nqVar.getParentActivity().getDrawable(2131231931), nqVar.getParentActivity().getDrawable(2131231931), nqVar.getParentActivity().getDrawable(2131231931)};
                int i14 = nqVar.f48088s1;
                if (i14 > 0) {
                    i12 = i14 - 1;
                }
                ut0Var4.b(i12, drawableArr, "1", "2", "3", "4", "5");
                ut0Var4.setCallback(new hq(this, 2));
                ut0Var2 = ut0Var4;
                ut0Var = ut0Var2;
                break;
            case 16:
                ut0Var = new org.telegram.ui.Cells.q8(context, nqVar.getResourceProvider());
                break;
            case 17:
                ut0Var = new org.telegram.ui.Cells.s7(context, nqVar.getResourceProvider());
                break;
        }
        return new u4.d1(ut0Var);
    }
}
