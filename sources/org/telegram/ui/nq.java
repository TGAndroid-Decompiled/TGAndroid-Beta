package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class nq extends org.telegram.ui.Components.dk0 {
    public final Context f50390c;
    public final rq d;

    public nq(rq rqVar, Context context) {
        this.d = rqVar;
        this.f50390c = context;
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59245a;
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
        return this.d.f51820d1;
    }

    @Override
    public final int d(int i7) {
        rq rqVar = this.d;
        if (i7 != rqVar.f51868z0 && i7 != rqVar.A0 && i7 != rqVar.f51857v0 && i7 != rqVar.f51853t0) {
            if ((i7 >= rqVar.E0 && i7 < rqVar.F0) || ((i7 >= rqVar.X0 && i7 < rqVar.Y0) || (i7 >= rqVar.U0 && i7 < rqVar.V0))) {
                return 0;
            }
            if (i7 != rqVar.C0 && i7 != rqVar.G0 && i7 != rqVar.H0) {
                if (i7 != rqVar.D0 && i7 != rqVar.S && i7 != rqVar.N0 && i7 != rqVar.f51851s0 && i7 != rqVar.f51843p0) {
                    if (i7 != rqVar.f51815b1 && i7 != rqVar.P0 && i7 != rqVar.R0 && i7 != rqVar.f51855u0 && i7 != rqVar.f51866y0 && i7 != rqVar.K0 && i7 != rqVar.M0 && i7 != rqVar.f51834j1 && i7 != rqVar.f51841o0 && i7 != rqVar.f51848r0) {
                        if (i7 == rqVar.f51818c1) {
                            return 4;
                        }
                        if (i7 == rqVar.B0) {
                            return 6;
                        }
                        if (i7 != rqVar.f51827g0 && i7 != rqVar.f51829h0 && i7 != rqVar.m0 && i7 != rqVar.f51831i0 && i7 != rqVar.f51833j0 && i7 != rqVar.T && i7 != rqVar.f51822e0 && i7 != rqVar.f51825f0 && i7 != rqVar.f51837l0 && i7 != rqVar.Q0) {
                            if (i7 != rqVar.Z0 && i7 != rqVar.T0 && i7 != rqVar.W0 && i7 != rqVar.f51828g1) {
                                if (i7 == rqVar.O0) {
                                    return 9;
                                }
                                if (i7 == rqVar.f51812a1) {
                                    return 10;
                                }
                                if (i7 == rqVar.f51826f1) {
                                    return 11;
                                }
                                if (i7 != rqVar.f51863x0 && i7 != rqVar.J0 && i7 != rqVar.L0) {
                                    if (rqVar.u0(i7)) {
                                        return 13;
                                    }
                                    if (i7 == rqVar.U) {
                                        return 14;
                                    }
                                    if (i7 == rqVar.S0) {
                                        return 15;
                                    }
                                    if (i7 != rqVar.f51830h1 && i7 != rqVar.f51832i1 && i7 != rqVar.f51840n0) {
                                        if (i7 != rqVar.f51845q0) {
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
        org.telegram.ui.Components.gu0 gu0Var;
        org.telegram.ui.Components.gu0 gu0Var2;
        int i11 = 2;
        int i12 = 0;
        Context context = this.f50390c;
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
                if (rqVar.f51823e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(this.f50390c, i10, i11, z10, null);
                b5Var.setDelegate(new mq(this, 0));
                gu0Var2 = b5Var;
                gu0Var = gu0Var2;
                break;
            case 1:
                gu0Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 2:
                gu0Var = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                gu0Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 4:
                org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
                if (rqVar.f51850s) {
                    z8Var.setText(org.telegram.messenger.gd.N0(2131748045, null));
                    gu0Var = z8Var;
                    break;
                } else if (rqVar.f51859w) {
                    z8Var.setText(org.telegram.messenger.gd.N0(2131748044, null));
                    gu0Var = z8Var;
                    break;
                } else {
                    z8Var.setText(org.telegram.messenger.gd.N0(2131748043, null));
                    gu0Var = z8Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(this.f50390c, org.telegram.ui.ActionBar.n6.L6, 21, 11, false, null);
                o4Var.setHeight(43);
                gu0Var2 = o4Var;
                gu0Var = gu0Var2;
                break;
            case 6:
                gu0Var = new org.telegram.ui.Cells.w9(context);
                break;
            case 7:
            case 14:
                gu0Var = new org.telegram.ui.Cells.q8(context);
                break;
            case 8:
                i6Var = ((org.telegram.ui.ActionBar.g2) rqVar).resourceProvider;
                View y3Var = new org.telegram.ui.Cells.y3(26, context, i6Var);
                y3Var.setBackground(null);
                gu0Var = y3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.gu0 gu0Var3 = new org.telegram.ui.Components.gu0(context, null);
                gu0Var3.b(rqVar.f51844p1, null, org.telegram.messenger.gd.N0(2131745109, "SlowmodeOff"), org.telegram.messenger.gd.a0(null, null, 2131745108, 5), org.telegram.messenger.gd.a0(null, null, 2131745108, 10), org.telegram.messenger.gd.a0(null, null, 2131745108, 30), org.telegram.messenger.gd.a0(null, null, 2131745110, 1), org.telegram.messenger.gd.a0(null, null, 2131745110, 5), org.telegram.messenger.gd.a0(null, null, 2131745110, 15), org.telegram.messenger.gd.a0(null, null, 2131745113, 1));
                gu0Var3.setCallback(new mq(this, 1));
                gu0Var = gu0Var3;
                break;
            case 10:
                gu0Var = new org.telegram.ui.Cells.u4(context, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
                vzVar.setIsSingleCell(true);
                vzVar.setViewType(6);
                vzVar.f41457x = false;
                vzVar.setUseHeaderOffset(false);
                vzVar.setPaddingLeft(org.telegram.messenger.g0.L(5.0f));
                v4.q0 q0Var = new v4.q0(-1, -1);
                int L = org.telegram.messenger.g0.L(12.0f);
                ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) q0Var).topMargin = org.telegram.messenger.g0.L(30.0f);
                vzVar.setLayoutParams(q0Var);
                gu0Var = vzVar;
                break;
            case 12:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(23, this.f50390c, rqVar.getResourceProvider(), false, true);
                m8Var.f31181w = 50;
                gu0Var = m8Var;
                break;
            case 13:
                org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(this.f50390c, 4, 21, false, rqVar.getResourceProvider());
                d2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                d2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.n6.V6, org.telegram.ui.ActionBar.n6.f29507g7, org.telegram.ui.ActionBar.n6.f29581k7);
                d2Var.setEnabled(true);
                gu0Var = d2Var;
                break;
            case 15:
                org.telegram.ui.Components.gu0 gu0Var4 = new org.telegram.ui.Components.gu0(context, null);
                Drawable[] drawableArr = {rqVar.getParentActivity().getDrawable(2131231934), rqVar.getParentActivity().getDrawable(2131231935), rqVar.getParentActivity().getDrawable(2131231935), rqVar.getParentActivity().getDrawable(2131231935), rqVar.getParentActivity().getDrawable(2131231935)};
                int i14 = rqVar.f51852s1;
                if (i14 > 0) {
                    i12 = i14 - 1;
                }
                gu0Var4.b(i12, drawableArr, "1", "2", "3", "4", "5");
                gu0Var4.setCallback(new mq(this, 2));
                gu0Var2 = gu0Var4;
                gu0Var = gu0Var2;
                break;
            case 16:
                gu0Var = new org.telegram.ui.Cells.r8(context, rqVar.getResourceProvider());
                break;
            case 17:
                gu0Var = new org.telegram.ui.Cells.t7(context, rqVar.getResourceProvider());
                break;
        }
        return new v4.f1(gu0Var);
    }
}
