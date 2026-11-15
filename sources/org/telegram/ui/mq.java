package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class mq extends org.telegram.ui.Components.tj0 {
    public final Context f49308c;
    public final qq d;

    public mq(qq qqVar, Context context) {
        this.d = qqVar;
        this.f49308c = context;
    }

    @Override
    public final void A(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.e1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mq.D(v4.e1):boolean");
    }

    public final TLObject E(int i7) {
        qq qqVar = this.d;
        int i10 = qqVar.E0;
        if (i7 >= i10 && i7 < qqVar.F0) {
            return (TLObject) qqVar.F.get(i7 - i10);
        }
        int i11 = qqVar.U0;
        if (i7 >= i11 && i7 < qqVar.V0) {
            return (TLObject) qqVar.H.get(i7 - i11);
        }
        int i12 = qqVar.X0;
        if (i7 >= i12 && i7 < qqVar.Y0) {
            return (TLObject) qqVar.G.get(i7 - i12);
        }
        return null;
    }

    @Override
    public final int b() {
        return this.d.f50718d1;
    }

    @Override
    public final int d(int i7) {
        qq qqVar = this.d;
        if (i7 != qqVar.f50766z0 && i7 != qqVar.A0 && i7 != qqVar.f50755v0 && i7 != qqVar.f50751t0) {
            if ((i7 >= qqVar.E0 && i7 < qqVar.F0) || ((i7 >= qqVar.X0 && i7 < qqVar.Y0) || (i7 >= qqVar.U0 && i7 < qqVar.V0))) {
                return 0;
            }
            if (i7 != qqVar.C0 && i7 != qqVar.G0 && i7 != qqVar.H0) {
                if (i7 != qqVar.D0 && i7 != qqVar.S && i7 != qqVar.N0 && i7 != qqVar.f50749s0 && i7 != qqVar.f50741p0) {
                    if (i7 != qqVar.f50713b1 && i7 != qqVar.P0 && i7 != qqVar.R0 && i7 != qqVar.f50753u0 && i7 != qqVar.f50764y0 && i7 != qqVar.K0 && i7 != qqVar.M0 && i7 != qqVar.f50732j1 && i7 != qqVar.f50739o0 && i7 != qqVar.f50746r0) {
                        if (i7 == qqVar.f50716c1) {
                            return 4;
                        }
                        if (i7 == qqVar.B0) {
                            return 6;
                        }
                        if (i7 != qqVar.f50725g0 && i7 != qqVar.f50727h0 && i7 != qqVar.m0 && i7 != qqVar.f50729i0 && i7 != qqVar.f50731j0 && i7 != qqVar.T && i7 != qqVar.f50720e0 && i7 != qqVar.f50723f0 && i7 != qqVar.f50735l0 && i7 != qqVar.Q0) {
                            if (i7 != qqVar.Z0 && i7 != qqVar.T0 && i7 != qqVar.W0 && i7 != qqVar.f50726g1) {
                                if (i7 == qqVar.O0) {
                                    return 9;
                                }
                                if (i7 == qqVar.f50710a1) {
                                    return 10;
                                }
                                if (i7 == qqVar.f50724f1) {
                                    return 11;
                                }
                                if (i7 != qqVar.f50761x0 && i7 != qqVar.J0 && i7 != qqVar.L0) {
                                    if (qqVar.u0(i7)) {
                                        return 13;
                                    }
                                    if (i7 == qqVar.U) {
                                        return 14;
                                    }
                                    if (i7 == qqVar.S0) {
                                        return 15;
                                    }
                                    if (i7 != qqVar.f50728h1 && i7 != qqVar.f50730i1 && i7 != qqVar.f50738n0) {
                                        if (i7 != qqVar.f50743q0) {
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
    public final void t(v4.e1 r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mq.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        int i10;
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.Components.wt0 wt0Var;
        org.telegram.ui.Components.wt0 wt0Var2;
        int i11 = 2;
        int i12 = 0;
        Context context = this.f49308c;
        qq qqVar = this.d;
        switch (i7) {
            case 0:
                int i13 = qqVar.O;
                if (i13 != 0 && i13 != 3) {
                    i10 = 6;
                } else {
                    i10 = 7;
                }
                if (i13 == 0 || i13 == 3) {
                    i11 = 6;
                }
                if (qqVar.f50721e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f49308c, i10, i11, z10, null);
                a5Var.setDelegate(new lq(this, 0));
                wt0Var2 = a5Var;
                wt0Var = wt0Var2;
                break;
            case 1:
                wt0Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 2:
                wt0Var = new org.telegram.ui.Cells.x4(context);
                break;
            case 3:
                wt0Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                break;
            case 4:
                org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
                if (qqVar.f50748s) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131748238, null));
                    wt0Var = y8Var;
                    break;
                } else if (qqVar.f50757w) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131748237, null));
                    wt0Var = y8Var;
                    break;
                } else {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131748236, null));
                    wt0Var = y8Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.f49308c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
                n4Var.setHeight(43);
                wt0Var2 = n4Var;
                wt0Var = wt0Var2;
                break;
            case 6:
                wt0Var = new org.telegram.ui.Cells.v9(context);
                break;
            case 7:
            case 14:
                wt0Var = new org.telegram.ui.Cells.p8(context);
                break;
            case 8:
                e6Var = ((org.telegram.ui.ActionBar.e2) qqVar).resourceProvider;
                View x3Var = new org.telegram.ui.Cells.x3(26, context, e6Var);
                x3Var.setBackground(null);
                wt0Var = x3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.wt0 wt0Var3 = new org.telegram.ui.Components.wt0(context, null);
                wt0Var3.b(qqVar.f50742p1, null, org.telegram.messenger.hd.M0(2131745305, "SlowmodeOff"), org.telegram.messenger.hd.a0(null, null, 2131745304, 5), org.telegram.messenger.hd.a0(null, null, 2131745304, 10), org.telegram.messenger.hd.a0(null, null, 2131745304, 30), org.telegram.messenger.hd.a0(null, null, 2131745306, 1), org.telegram.messenger.hd.a0(null, null, 2131745306, 5), org.telegram.messenger.hd.a0(null, null, 2131745306, 15), org.telegram.messenger.hd.a0(null, null, 2131745309, 1));
                wt0Var3.setCallback(new lq(this, 1));
                wt0Var = wt0Var3;
                break;
            case 10:
                wt0Var = new org.telegram.ui.Cells.t4(context, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
                pzVar.setIsSingleCell(true);
                pzVar.setViewType(6);
                pzVar.f38448x = false;
                pzVar.setUseHeaderOffset(false);
                pzVar.setPaddingLeft(org.telegram.messenger.g0.L(5.0f));
                v4.p0 p0Var = new v4.p0(-1, -1);
                int L = org.telegram.messenger.g0.L(12.0f);
                ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = org.telegram.messenger.g0.L(30.0f);
                pzVar.setLayoutParams(p0Var);
                wt0Var = pzVar;
                break;
            case 12:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(23, this.f49308c, qqVar.getResourceProvider(), false, true);
                l8Var.f30661w = 50;
                wt0Var = l8Var;
                break;
            case 13:
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(this.f49308c, 4, 21, false, qqVar.getResourceProvider());
                c2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f28905g7, org.telegram.ui.ActionBar.j6.f28979k7);
                c2Var.setEnabled(true);
                wt0Var = c2Var;
                break;
            case 15:
                org.telegram.ui.Components.wt0 wt0Var4 = new org.telegram.ui.Components.wt0(context, null);
                Drawable[] drawableArr = {qqVar.getParentActivity().getDrawable(2131231930), qqVar.getParentActivity().getDrawable(2131231931), qqVar.getParentActivity().getDrawable(2131231931), qqVar.getParentActivity().getDrawable(2131231931), qqVar.getParentActivity().getDrawable(2131231931)};
                int i14 = qqVar.f50750s1;
                if (i14 > 0) {
                    i12 = i14 - 1;
                }
                wt0Var4.b(i12, drawableArr, "1", "2", "3", "4", "5");
                wt0Var4.setCallback(new lq(this, 2));
                wt0Var2 = wt0Var4;
                wt0Var = wt0Var2;
                break;
            case 16:
                wt0Var = new org.telegram.ui.Cells.q8(context, qqVar.getResourceProvider());
                break;
            case 17:
                wt0Var = new org.telegram.ui.Cells.s7(context, qqVar.getResourceProvider());
                break;
        }
        return new v4.e1(wt0Var);
    }
}
