package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class lr extends org.telegram.ui.Components.tk0 {
    public final Context f39364c;
    public final pr d;

    public lr(pr prVar, Context context) {
        this.d = prVar;
        this.f39364c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47909a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lr.D(s4.c1):boolean");
    }

    public final TLObject E(int i10) {
        pr prVar = this.d;
        int i11 = prVar.D0;
        if (i10 >= i11 && i10 < prVar.E0) {
            return (TLObject) prVar.E.get(i10 - i11);
        }
        int i12 = prVar.T0;
        if (i10 >= i12 && i10 < prVar.U0) {
            return (TLObject) prVar.G.get(i10 - i12);
        }
        int i13 = prVar.W0;
        if (i10 >= i13 && i10 < prVar.X0) {
            return (TLObject) prVar.F.get(i10 - i13);
        }
        return null;
    }

    @Override
    public final int b() {
        return this.d.f40533c1;
    }

    @Override
    public final int d(int i10) {
        pr prVar = this.d;
        if (i10 != prVar.f40581y0 && i10 != prVar.f40583z0 && i10 != prVar.f40570u0 && i10 != prVar.f40566s0) {
            if ((i10 >= prVar.D0 && i10 < prVar.E0) || ((i10 >= prVar.W0 && i10 < prVar.X0) || (i10 >= prVar.T0 && i10 < prVar.U0))) {
                return 0;
            }
            if (i10 != prVar.B0 && i10 != prVar.F0 && i10 != prVar.G0) {
                if (i10 != prVar.C0 && i10 != prVar.R && i10 != prVar.M0 && i10 != prVar.f40563r0 && i10 != prVar.f40556o0) {
                    if (i10 != prVar.f40527a1 && i10 != prVar.O0 && i10 != prVar.Q0 && i10 != prVar.f40568t0 && i10 != prVar.f40578x0 && i10 != prVar.J0 && i10 != prVar.L0 && i10 != prVar.f40546i1 && i10 != prVar.f40554n0 && i10 != prVar.f40560q0) {
                        if (i10 == prVar.f40530b1) {
                            return 4;
                        }
                        if (i10 == prVar.A0) {
                            return 6;
                        }
                        if (i10 != prVar.f40539f0 && i10 != prVar.f40541g0 && i10 != prVar.f40551l0 && i10 != prVar.f40543h0 && i10 != prVar.f40545i0 && i10 != prVar.S && i10 != prVar.f40534d0 && i10 != prVar.f40536e0 && i10 != prVar.f40549k0 && i10 != prVar.P0) {
                            if (i10 != prVar.Y0 && i10 != prVar.S0 && i10 != prVar.V0 && i10 != prVar.f40540f1) {
                                if (i10 == prVar.N0) {
                                    return 9;
                                }
                                if (i10 == prVar.Z0) {
                                    return 10;
                                }
                                if (i10 == prVar.f40537e1) {
                                    return 11;
                                }
                                if (i10 != prVar.f40575w0 && i10 != prVar.I0 && i10 != prVar.K0) {
                                    if (prVar.u0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == prVar.T) {
                                        return 14;
                                    }
                                    if (i10 == prVar.R0) {
                                        return 15;
                                    }
                                    if (i10 != prVar.f40542g1 && i10 != prVar.f40544h1 && i10 != prVar.m0) {
                                        if (i10 != prVar.f40558p0) {
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
    public final void t(s4.c1 r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lr.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.Components.zu0 zu0Var;
        org.telegram.ui.Components.zu0 zu0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f39364c;
        pr prVar = this.d;
        switch (i10) {
            case 0:
                int i14 = prVar.N;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                if (i14 == 0 || i14 == 3) {
                    i12 = 6;
                }
                if (prVar.f40535d1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.e5 e5Var = new org.telegram.ui.Cells.e5(i11, i12, this.f39364c, null, z10);
                e5Var.setDelegate(new kr(this, 0));
                zu0Var2 = e5Var;
                zu0Var = zu0Var2;
                break;
            case 1:
                zu0Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 2:
                zu0Var = new org.telegram.ui.Cells.b5(context);
                break;
            case 3:
                zu0Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
                if (prVar.f40565s) {
                    b9Var.setText(org.telegram.messenger.dd.L0(2131748255, null));
                    zu0Var = b9Var;
                    break;
                } else if (prVar.f40574w) {
                    b9Var.setText(org.telegram.messenger.dd.L0(2131748254, null));
                    zu0Var = b9Var;
                    break;
                } else {
                    b9Var.setText(org.telegram.messenger.dd.L0(2131748253, null));
                    zu0Var = b9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(this.f39364c, org.telegram.ui.ActionBar.t6.L6, 21, 11, false, null);
                p4Var.setHeight(43);
                zu0Var2 = p4Var;
                zu0Var = zu0Var2;
                break;
            case 6:
                zu0Var = new org.telegram.ui.Cells.x9(context);
                break;
            case 7:
            case 14:
                zu0Var = new org.telegram.ui.Cells.s8(context);
                break;
            case 8:
                p6Var = ((org.telegram.ui.ActionBar.k2) prVar).resourceProvider;
                View z3Var = new org.telegram.ui.Cells.z3(26, context, p6Var);
                z3Var.setBackground(null);
                zu0Var = z3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.zu0 zu0Var3 = new org.telegram.ui.Components.zu0(context, null);
                zu0Var3.b(prVar.f40557o1, null, org.telegram.messenger.dd.L0(2131745323, "SlowmodeOff"), org.telegram.messenger.dd.a0(null, null, 2131745322, 5), org.telegram.messenger.dd.a0(null, null, 2131745322, 10), org.telegram.messenger.dd.a0(null, null, 2131745322, 30), org.telegram.messenger.dd.a0(null, null, 2131745324, 1), org.telegram.messenger.dd.a0(null, null, 2131745324, 5), org.telegram.messenger.dd.a0(null, null, 2131745324, 15), org.telegram.messenger.dd.a0(null, null, 2131745327, 1));
                zu0Var3.setCallback(new kr(this, 1));
                zu0Var = zu0Var3;
                break;
            case 10:
                zu0Var = new org.telegram.ui.Cells.v4(context, org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
                zzVar.setIsSingleCell(true);
                zzVar.setViewType(6);
                zzVar.f33280x = false;
                zzVar.setUseHeaderOffset(false);
                zzVar.setPaddingLeft(org.telegram.messenger.i0.L(5.0f));
                s4.o0 o0Var = new s4.o0(-1, -1);
                int L = org.telegram.messenger.i0.L(12.0f);
                ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.i0.L(30.0f);
                zzVar.setLayoutParams(o0Var);
                zu0Var = zzVar;
                break;
            case 12:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(23, this.f39364c, prVar.getResourceProvider(), false, true);
                p8Var.f22465w = 50;
                zu0Var = p8Var;
                break;
            case 13:
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(4, 21, this.f39364c, prVar.getResourceProvider(), false);
                c2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.t6.V6, org.telegram.ui.ActionBar.t6.f20987g7, org.telegram.ui.ActionBar.t6.f21060k7);
                c2Var.setEnabled(true);
                zu0Var = c2Var;
                break;
            case 15:
                org.telegram.ui.Components.zu0 zu0Var4 = new org.telegram.ui.Components.zu0(context, null);
                Drawable[] drawableArr = {prVar.getParentActivity().getDrawable(2131231929), prVar.getParentActivity().getDrawable(2131231930), prVar.getParentActivity().getDrawable(2131231930), prVar.getParentActivity().getDrawable(2131231930), prVar.getParentActivity().getDrawable(2131231930)};
                int i15 = prVar.f40564r1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                zu0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                zu0Var4.setCallback(new kr(this, 2));
                zu0Var2 = zu0Var4;
                zu0Var = zu0Var2;
                break;
            case 16:
                zu0Var = new org.telegram.ui.Cells.t8(context, prVar.getResourceProvider());
                break;
            case 17:
                zu0Var = new org.telegram.ui.Cells.x7(context, prVar.getResourceProvider());
                break;
        }
        return new s4.c1(zu0Var);
    }
}
