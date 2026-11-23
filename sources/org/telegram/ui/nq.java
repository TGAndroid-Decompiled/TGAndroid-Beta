package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class nq extends org.telegram.ui.Components.dk0 {
    public final Context f50274c;
    public final rq d;

    public nq(rq rqVar, Context context) {
        this.d = rqVar;
        this.f50274c = context;
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59165a;
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
        return this.d.f51705d1;
    }

    @Override
    public final int d(int i7) {
        rq rqVar = this.d;
        if (i7 != rqVar.f51753z0 && i7 != rqVar.A0 && i7 != rqVar.f51742v0 && i7 != rqVar.f51738t0) {
            if ((i7 >= rqVar.E0 && i7 < rqVar.F0) || ((i7 >= rqVar.X0 && i7 < rqVar.Y0) || (i7 >= rqVar.U0 && i7 < rqVar.V0))) {
                return 0;
            }
            if (i7 != rqVar.C0 && i7 != rqVar.G0 && i7 != rqVar.H0) {
                if (i7 != rqVar.D0 && i7 != rqVar.S && i7 != rqVar.N0 && i7 != rqVar.f51736s0 && i7 != rqVar.f51728p0) {
                    if (i7 != rqVar.f51700b1 && i7 != rqVar.P0 && i7 != rqVar.R0 && i7 != rqVar.f51740u0 && i7 != rqVar.f51751y0 && i7 != rqVar.K0 && i7 != rqVar.M0 && i7 != rqVar.f51719j1 && i7 != rqVar.f51726o0 && i7 != rqVar.f51733r0) {
                        if (i7 == rqVar.f51703c1) {
                            return 4;
                        }
                        if (i7 == rqVar.B0) {
                            return 6;
                        }
                        if (i7 != rqVar.f51712g0 && i7 != rqVar.f51714h0 && i7 != rqVar.m0 && i7 != rqVar.f51716i0 && i7 != rqVar.f51718j0 && i7 != rqVar.T && i7 != rqVar.f51707e0 && i7 != rqVar.f51710f0 && i7 != rqVar.f51722l0 && i7 != rqVar.Q0) {
                            if (i7 != rqVar.Z0 && i7 != rqVar.T0 && i7 != rqVar.W0 && i7 != rqVar.f51713g1) {
                                if (i7 == rqVar.O0) {
                                    return 9;
                                }
                                if (i7 == rqVar.f51697a1) {
                                    return 10;
                                }
                                if (i7 == rqVar.f51711f1) {
                                    return 11;
                                }
                                if (i7 != rqVar.f51748x0 && i7 != rqVar.J0 && i7 != rqVar.L0) {
                                    if (rqVar.u0(i7)) {
                                        return 13;
                                    }
                                    if (i7 == rqVar.U) {
                                        return 14;
                                    }
                                    if (i7 == rqVar.S0) {
                                        return 15;
                                    }
                                    if (i7 != rqVar.f51715h1 && i7 != rqVar.f51717i1 && i7 != rqVar.f51725n0) {
                                        if (i7 != rqVar.f51730q0) {
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
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.Components.hu0 hu0Var;
        org.telegram.ui.Components.hu0 hu0Var2;
        int i11 = 2;
        int i12 = 0;
        Context context = this.f50274c;
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
                if (rqVar.f51708e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(this.f50274c, i10, i11, z10, null);
                b5Var.setDelegate(new mq(this, 0));
                hu0Var2 = b5Var;
                hu0Var = hu0Var2;
                break;
            case 1:
                hu0Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 2:
                hu0Var = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                hu0Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 4:
                org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
                if (rqVar.f51735s) {
                    a9Var.setText(org.telegram.messenger.hd.N0(2131748045, null));
                    hu0Var = a9Var;
                    break;
                } else if (rqVar.f51744w) {
                    a9Var.setText(org.telegram.messenger.hd.N0(2131748044, null));
                    hu0Var = a9Var;
                    break;
                } else {
                    a9Var.setText(org.telegram.messenger.hd.N0(2131748043, null));
                    hu0Var = a9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(this.f50274c, org.telegram.ui.ActionBar.m6.L6, 21, 11, false, null);
                o4Var.setHeight(43);
                hu0Var2 = o4Var;
                hu0Var = hu0Var2;
                break;
            case 6:
                hu0Var = new org.telegram.ui.Cells.x9(context);
                break;
            case 7:
            case 14:
                hu0Var = new org.telegram.ui.Cells.r8(context);
                break;
            case 8:
                h6Var = ((org.telegram.ui.ActionBar.g2) rqVar).resourceProvider;
                View y3Var = new org.telegram.ui.Cells.y3(26, context, h6Var);
                y3Var.setBackground(null);
                hu0Var = y3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.hu0 hu0Var3 = new org.telegram.ui.Components.hu0(context, null);
                hu0Var3.b(rqVar.f51729p1, null, org.telegram.messenger.hd.N0(2131745109, "SlowmodeOff"), org.telegram.messenger.hd.a0(null, null, 2131745108, 5), org.telegram.messenger.hd.a0(null, null, 2131745108, 10), org.telegram.messenger.hd.a0(null, null, 2131745108, 30), org.telegram.messenger.hd.a0(null, null, 2131745110, 1), org.telegram.messenger.hd.a0(null, null, 2131745110, 5), org.telegram.messenger.hd.a0(null, null, 2131745110, 15), org.telegram.messenger.hd.a0(null, null, 2131745113, 1));
                hu0Var3.setCallback(new mq(this, 1));
                hu0Var = hu0Var3;
                break;
            case 10:
                hu0Var = new org.telegram.ui.Cells.u4(context, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
                yzVar.setIsSingleCell(true);
                yzVar.setViewType(6);
                yzVar.f42605x = false;
                yzVar.setUseHeaderOffset(false);
                yzVar.setPaddingLeft(org.telegram.messenger.g0.L(5.0f));
                v4.q0 q0Var = new v4.q0(-1, -1);
                int L = org.telegram.messenger.g0.L(12.0f);
                ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) q0Var).topMargin = org.telegram.messenger.g0.L(30.0f);
                yzVar.setLayoutParams(q0Var);
                hu0Var = yzVar;
                break;
            case 12:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(23, this.f50274c, rqVar.getResourceProvider(), false, true);
                n8Var.f31173w = 50;
                hu0Var = n8Var;
                break;
            case 13:
                org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(this.f50274c, 4, 21, false, rqVar.getResourceProvider());
                d2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                d2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.m6.V6, org.telegram.ui.ActionBar.m6.f29437g7, org.telegram.ui.ActionBar.m6.f29511k7);
                d2Var.setEnabled(true);
                hu0Var = d2Var;
                break;
            case 15:
                org.telegram.ui.Components.hu0 hu0Var4 = new org.telegram.ui.Components.hu0(context, null);
                Drawable[] drawableArr = {rqVar.getParentActivity().getDrawable(2131231931), rqVar.getParentActivity().getDrawable(2131231932), rqVar.getParentActivity().getDrawable(2131231932), rqVar.getParentActivity().getDrawable(2131231932), rqVar.getParentActivity().getDrawable(2131231932)};
                int i14 = rqVar.f51737s1;
                if (i14 > 0) {
                    i12 = i14 - 1;
                }
                hu0Var4.b(i12, drawableArr, "1", "2", "3", "4", "5");
                hu0Var4.setCallback(new mq(this, 2));
                hu0Var2 = hu0Var4;
                hu0Var = hu0Var2;
                break;
            case 16:
                hu0Var = new org.telegram.ui.Cells.s8(context, rqVar.getResourceProvider());
                break;
            case 17:
                hu0Var = new org.telegram.ui.Cells.u7(context, rqVar.getResourceProvider());
                break;
        }
        return new v4.f1(hu0Var);
    }
}
