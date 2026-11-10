package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class nq extends org.telegram.ui.Components.oj0 {
    public final Context f48244c;
    public final rq d;

    public nq(rq rqVar, Context context) {
        this.d = rqVar;
        this.f48244c = context;
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57052a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nq.D(v4.d1):boolean");
    }

    public final TLObject E(int i7) {
        rq rqVar = this.d;
        int i10 = rqVar.D0;
        if (i7 >= i10 && i7 < rqVar.E0) {
            return (TLObject) rqVar.E.get(i7 - i10);
        }
        int i11 = rqVar.T0;
        if (i7 >= i11 && i7 < rqVar.U0) {
            return (TLObject) rqVar.G.get(i7 - i11);
        }
        int i12 = rqVar.W0;
        if (i7 >= i12 && i7 < rqVar.X0) {
            return (TLObject) rqVar.F.get(i7 - i12);
        }
        return null;
    }

    @Override
    public final int b() {
        return this.d.f49504c1;
    }

    @Override
    public final int d(int i7) {
        rq rqVar = this.d;
        if (i7 != rqVar.f49552y0 && i7 != rqVar.f49554z0 && i7 != rqVar.f49541u0 && i7 != rqVar.f49537s0) {
            if ((i7 >= rqVar.D0 && i7 < rqVar.E0) || ((i7 >= rqVar.W0 && i7 < rqVar.X0) || (i7 >= rqVar.T0 && i7 < rqVar.U0))) {
                return 0;
            }
            if (i7 != rqVar.B0 && i7 != rqVar.F0 && i7 != rqVar.G0) {
                if (i7 != rqVar.C0 && i7 != rqVar.R && i7 != rqVar.M0 && i7 != rqVar.f49534r0 && i7 != rqVar.f49527o0) {
                    if (i7 != rqVar.f49498a1 && i7 != rqVar.O0 && i7 != rqVar.Q0 && i7 != rqVar.f49539t0 && i7 != rqVar.f49549x0 && i7 != rqVar.J0 && i7 != rqVar.L0 && i7 != rqVar.f49518i1 && i7 != rqVar.f49526n0 && i7 != rqVar.f49531q0) {
                        if (i7 == rqVar.f49501b1) {
                            return 4;
                        }
                        if (i7 == rqVar.A0) {
                            return 6;
                        }
                        if (i7 != rqVar.f49511f0 && i7 != rqVar.f49513g0 && i7 != rqVar.f49523l0 && i7 != rqVar.f49515h0 && i7 != rqVar.f49517i0 && i7 != rqVar.S && i7 != rqVar.f49505d0 && i7 != rqVar.f49508e0 && i7 != rqVar.f49521k0 && i7 != rqVar.P0) {
                            if (i7 != rqVar.Y0 && i7 != rqVar.S0 && i7 != rqVar.V0 && i7 != rqVar.f49512f1) {
                                if (i7 == rqVar.N0) {
                                    return 9;
                                }
                                if (i7 == rqVar.Z0) {
                                    return 10;
                                }
                                if (i7 == rqVar.f49509e1) {
                                    return 11;
                                }
                                if (i7 != rqVar.f49546w0 && i7 != rqVar.I0 && i7 != rqVar.K0) {
                                    if (rqVar.u0(i7)) {
                                        return 13;
                                    }
                                    if (i7 == rqVar.T) {
                                        return 14;
                                    }
                                    if (i7 == rqVar.R0) {
                                        return 15;
                                    }
                                    if (i7 != rqVar.f49514g1 && i7 != rqVar.f49516h1 && i7 != rqVar.m0) {
                                        if (i7 != rqVar.f49529p0) {
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
    public final void t(v4.d1 r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nq.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        int i10;
        boolean z9;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.Components.wt0 wt0Var;
        org.telegram.ui.Components.wt0 wt0Var2;
        int i11 = 2;
        int i12 = 0;
        Context context = this.f48244c;
        rq rqVar = this.d;
        switch (i7) {
            case 0:
                int i13 = rqVar.N;
                if (i13 != 0 && i13 != 3) {
                    i10 = 6;
                } else {
                    i10 = 7;
                }
                if (i13 == 0 || i13 == 3) {
                    i11 = 6;
                }
                if (rqVar.f49506d1 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f48244c, i10, i11, z9, null);
                a5Var.setDelegate(new mq(this, 0));
                wt0Var2 = a5Var;
                wt0Var = wt0Var2;
                break;
            case 1:
                wt0Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 2:
                wt0Var = new org.telegram.ui.Cells.x4(context);
                break;
            case 3:
                wt0Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
                if (rqVar.f49536s) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131748238, null));
                    wt0Var = z8Var;
                    break;
                } else if (rqVar.f49545w) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131748237, null));
                    wt0Var = z8Var;
                    break;
                } else {
                    z8Var.setText(org.telegram.messenger.id.M0(2131748236, null));
                    wt0Var = z8Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.f48244c, org.telegram.ui.ActionBar.m6.L6, 21, 11, false, null);
                n4Var.setHeight(43);
                wt0Var2 = n4Var;
                wt0Var = wt0Var2;
                break;
            case 6:
                wt0Var = new org.telegram.ui.Cells.w9(context);
                break;
            case 7:
            case 14:
                wt0Var = new org.telegram.ui.Cells.q8(context);
                break;
            case 8:
                h6Var = ((org.telegram.ui.ActionBar.f2) rqVar).resourceProvider;
                View x3Var = new org.telegram.ui.Cells.x3(26, context, h6Var);
                x3Var.setBackground(null);
                wt0Var = x3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.wt0 wt0Var3 = new org.telegram.ui.Components.wt0(context, null);
                wt0Var3.b(rqVar.f49528o1, null, org.telegram.messenger.id.M0(2131745305, "SlowmodeOff"), org.telegram.messenger.id.a0(null, null, 2131745304, 5), org.telegram.messenger.id.a0(null, null, 2131745304, 10), org.telegram.messenger.id.a0(null, null, 2131745304, 30), org.telegram.messenger.id.a0(null, null, 2131745306, 1), org.telegram.messenger.id.a0(null, null, 2131745306, 5), org.telegram.messenger.id.a0(null, null, 2131745306, 15), org.telegram.messenger.id.a0(null, null, 2131745309, 1));
                wt0Var3.setCallback(new mq(this, 1));
                wt0Var = wt0Var3;
                break;
            case 10:
                wt0Var = new org.telegram.ui.Cells.t4(context, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
                lzVar.setIsSingleCell(true);
                lzVar.setViewType(6);
                lzVar.f35774x = false;
                lzVar.setUseHeaderOffset(false);
                lzVar.setPaddingLeft(org.telegram.messenger.g0.L(5.0f));
                v4.o0 o0Var = new v4.o0(-1, -1);
                int L = org.telegram.messenger.g0.L(12.0f);
                ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.g0.L(30.0f);
                lzVar.setLayoutParams(o0Var);
                wt0Var = lzVar;
                break;
            case 12:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(23, this.f48244c, rqVar.getResourceProvider(), false, true);
                m8Var.f29590w = 50;
                wt0Var = m8Var;
                break;
            case 13:
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(this.f48244c, 4, 21, false, rqVar.getResourceProvider());
                c2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.m6.V6, org.telegram.ui.ActionBar.m6.f27946g7, org.telegram.ui.ActionBar.m6.f28020k7);
                c2Var.setEnabled(true);
                wt0Var = c2Var;
                break;
            case 15:
                org.telegram.ui.Components.wt0 wt0Var4 = new org.telegram.ui.Components.wt0(context, null);
                Drawable[] drawableArr = {rqVar.getParentActivity().getDrawable(2131231930), rqVar.getParentActivity().getDrawable(2131231931), rqVar.getParentActivity().getDrawable(2131231931), rqVar.getParentActivity().getDrawable(2131231931), rqVar.getParentActivity().getDrawable(2131231931)};
                int i14 = rqVar.f49535r1;
                if (i14 > 0) {
                    i12 = i14 - 1;
                }
                wt0Var4.b(i12, drawableArr, "1", "2", "3", "4", "5");
                wt0Var4.setCallback(new mq(this, 2));
                wt0Var2 = wt0Var4;
                wt0Var = wt0Var2;
                break;
            case 16:
                wt0Var = new org.telegram.ui.Cells.r8(context, rqVar.getResourceProvider());
                break;
            case 17:
                wt0Var = new org.telegram.ui.Cells.t7(context, rqVar.getResourceProvider());
                break;
        }
        return new v4.d1(wt0Var);
    }
}
