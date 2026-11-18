package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class nq extends org.telegram.ui.Components.bk0 {
    public final Context f50263c;
    public final rq d;

    public nq(rq rqVar, Context context) {
        this.d = rqVar;
        this.f50263c = context;
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59123a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nq.D(v4.f1):boolean");
    }

    public final TLObject E(int i7) {
        rq rqVar = this.d;
        int i10 = rqVar.E0;
        if (i7 >= i10 && i7 < rqVar.F0) {
            return (TLObject) rqVar.F.get(i7 - i10);
        }
        int i11 = rqVar.U0;
        if (i7 >= i11 && i7 < rqVar.V0) {
            return (TLObject) rqVar.H.get(i7 - i11);
        }
        int i12 = rqVar.X0;
        if (i7 >= i12 && i7 < rqVar.Y0) {
            return (TLObject) rqVar.G.get(i7 - i12);
        }
        return null;
    }

    @Override
    public final int b() {
        return this.d.f51726d1;
    }

    @Override
    public final int d(int i7) {
        rq rqVar = this.d;
        if (i7 != rqVar.f51774z0 && i7 != rqVar.A0 && i7 != rqVar.f51763v0 && i7 != rqVar.f51759t0) {
            if ((i7 >= rqVar.E0 && i7 < rqVar.F0) || ((i7 >= rqVar.X0 && i7 < rqVar.Y0) || (i7 >= rqVar.U0 && i7 < rqVar.V0))) {
                return 0;
            }
            if (i7 != rqVar.C0 && i7 != rqVar.G0 && i7 != rqVar.H0) {
                if (i7 != rqVar.D0 && i7 != rqVar.S && i7 != rqVar.N0 && i7 != rqVar.f51757s0 && i7 != rqVar.f51749p0) {
                    if (i7 != rqVar.f51721b1 && i7 != rqVar.P0 && i7 != rqVar.R0 && i7 != rqVar.f51761u0 && i7 != rqVar.f51772y0 && i7 != rqVar.K0 && i7 != rqVar.M0 && i7 != rqVar.f51740j1 && i7 != rqVar.f51747o0 && i7 != rqVar.f51754r0) {
                        if (i7 == rqVar.f51724c1) {
                            return 4;
                        }
                        if (i7 == rqVar.B0) {
                            return 6;
                        }
                        if (i7 != rqVar.f51733g0 && i7 != rqVar.f51735h0 && i7 != rqVar.m0 && i7 != rqVar.f51737i0 && i7 != rqVar.f51739j0 && i7 != rqVar.T && i7 != rqVar.f51728e0 && i7 != rqVar.f51731f0 && i7 != rqVar.f51743l0 && i7 != rqVar.Q0) {
                            if (i7 != rqVar.Z0 && i7 != rqVar.T0 && i7 != rqVar.W0 && i7 != rqVar.f51734g1) {
                                if (i7 == rqVar.O0) {
                                    return 9;
                                }
                                if (i7 == rqVar.f51718a1) {
                                    return 10;
                                }
                                if (i7 == rqVar.f51732f1) {
                                    return 11;
                                }
                                if (i7 != rqVar.f51769x0 && i7 != rqVar.J0 && i7 != rqVar.L0) {
                                    if (rqVar.u0(i7)) {
                                        return 13;
                                    }
                                    if (i7 == rqVar.U) {
                                        return 14;
                                    }
                                    if (i7 == rqVar.S0) {
                                        return 15;
                                    }
                                    if (i7 != rqVar.f51736h1 && i7 != rqVar.f51738i1 && i7 != rqVar.f51746n0) {
                                        if (i7 != rqVar.f51751q0) {
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
    public final void t(v4.f1 r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nq.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        int i10;
        boolean z10;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.Components.eu0 eu0Var;
        org.telegram.ui.Components.eu0 eu0Var2;
        int i11 = 2;
        int i12 = 0;
        Context context = this.f50263c;
        rq rqVar = this.d;
        switch (i7) {
            case 0:
                int i13 = rqVar.O;
                if (i13 != 0 && i13 != 3) {
                    i10 = 6;
                } else {
                    i10 = 7;
                }
                if (i13 == 0 || i13 == 3) {
                    i11 = 6;
                }
                if (rqVar.f51729e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(this.f50263c, i10, i11, z10, null);
                b5Var.setDelegate(new mq(this, 0));
                eu0Var2 = b5Var;
                eu0Var = eu0Var2;
                break;
            case 1:
                eu0Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 2:
                eu0Var = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                eu0Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 4:
                org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
                if (rqVar.f51756s) {
                    a9Var.setText(org.telegram.messenger.gd.M0(2131748046, null));
                    eu0Var = a9Var;
                    break;
                } else if (rqVar.f51765w) {
                    a9Var.setText(org.telegram.messenger.gd.M0(2131748045, null));
                    eu0Var = a9Var;
                    break;
                } else {
                    a9Var.setText(org.telegram.messenger.gd.M0(2131748044, null));
                    eu0Var = a9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(this.f50263c, org.telegram.ui.ActionBar.n6.L6, 21, 11, false, null);
                o4Var.setHeight(43);
                eu0Var2 = o4Var;
                eu0Var = eu0Var2;
                break;
            case 6:
                eu0Var = new org.telegram.ui.Cells.x9(context);
                break;
            case 7:
            case 14:
                eu0Var = new org.telegram.ui.Cells.r8(context);
                break;
            case 8:
                i6Var = ((org.telegram.ui.ActionBar.h2) rqVar).resourceProvider;
                View y3Var = new org.telegram.ui.Cells.y3(26, context, i6Var);
                y3Var.setBackground(null);
                eu0Var = y3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.eu0 eu0Var3 = new org.telegram.ui.Components.eu0(context, null);
                eu0Var3.b(rqVar.f51750p1, null, org.telegram.messenger.gd.M0(2131745110, "SlowmodeOff"), org.telegram.messenger.gd.a0(null, null, 2131745109, 5), org.telegram.messenger.gd.a0(null, null, 2131745109, 10), org.telegram.messenger.gd.a0(null, null, 2131745109, 30), org.telegram.messenger.gd.a0(null, null, 2131745111, 1), org.telegram.messenger.gd.a0(null, null, 2131745111, 5), org.telegram.messenger.gd.a0(null, null, 2131745111, 15), org.telegram.messenger.gd.a0(null, null, 2131745114, 1));
                eu0Var3.setCallback(new mq(this, 1));
                eu0Var = eu0Var3;
                break;
            case 10:
                eu0Var = new org.telegram.ui.Cells.u4(context, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(context, null);
                wzVar.setIsSingleCell(true);
                wzVar.setViewType(6);
                wzVar.f41829x = false;
                wzVar.setUseHeaderOffset(false);
                wzVar.setPaddingLeft(org.telegram.messenger.g0.L(5.0f));
                v4.q0 q0Var = new v4.q0(-1, -1);
                int L = org.telegram.messenger.g0.L(12.0f);
                ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) q0Var).topMargin = org.telegram.messenger.g0.L(30.0f);
                wzVar.setLayoutParams(q0Var);
                eu0Var = wzVar;
                break;
            case 12:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(23, this.f50263c, rqVar.getResourceProvider(), false, true);
                n8Var.f31142w = 50;
                eu0Var = n8Var;
                break;
            case 13:
                org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(this.f50263c, 4, 21, false, rqVar.getResourceProvider());
                d2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                d2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.n6.V6, org.telegram.ui.ActionBar.n6.f29450g7, org.telegram.ui.ActionBar.n6.f29524k7);
                d2Var.setEnabled(true);
                eu0Var = d2Var;
                break;
            case 15:
                org.telegram.ui.Components.eu0 eu0Var4 = new org.telegram.ui.Components.eu0(context, null);
                Drawable[] drawableArr = {rqVar.getParentActivity().getDrawable(2131231931), rqVar.getParentActivity().getDrawable(2131231932), rqVar.getParentActivity().getDrawable(2131231932), rqVar.getParentActivity().getDrawable(2131231932), rqVar.getParentActivity().getDrawable(2131231932)};
                int i14 = rqVar.f51758s1;
                if (i14 > 0) {
                    i12 = i14 - 1;
                }
                eu0Var4.b(i12, drawableArr, "1", "2", "3", "4", "5");
                eu0Var4.setCallback(new mq(this, 2));
                eu0Var2 = eu0Var4;
                eu0Var = eu0Var2;
                break;
            case 16:
                eu0Var = new org.telegram.ui.Cells.s8(context, rqVar.getResourceProvider());
                break;
            case 17:
                eu0Var = new org.telegram.ui.Cells.u7(context, rqVar.getResourceProvider());
                break;
        }
        return new v4.f1(eu0Var);
    }
}
