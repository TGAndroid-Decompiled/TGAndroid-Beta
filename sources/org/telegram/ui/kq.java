package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class kq extends org.telegram.ui.Components.oj0 {
    public final Context f47263c;
    public final oq d;

    public kq(oq oqVar, Context context) {
        this.d = oqVar;
        this.f47263c = context;
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57044a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kq.D(v4.d1):boolean");
    }

    public final TLObject E(int i7) {
        oq oqVar = this.d;
        int i10 = oqVar.D0;
        if (i7 >= i10 && i7 < oqVar.E0) {
            return (TLObject) oqVar.E.get(i7 - i10);
        }
        int i11 = oqVar.T0;
        if (i7 >= i11 && i7 < oqVar.U0) {
            return (TLObject) oqVar.G.get(i7 - i11);
        }
        int i12 = oqVar.W0;
        if (i7 >= i12 && i7 < oqVar.X0) {
            return (TLObject) oqVar.F.get(i7 - i12);
        }
        return null;
    }

    @Override
    public final int b() {
        return this.d.f48470c1;
    }

    @Override
    public final int d(int i7) {
        oq oqVar = this.d;
        if (i7 != oqVar.f48518y0 && i7 != oqVar.f48520z0 && i7 != oqVar.f48507u0 && i7 != oqVar.f48503s0) {
            if ((i7 >= oqVar.D0 && i7 < oqVar.E0) || ((i7 >= oqVar.W0 && i7 < oqVar.X0) || (i7 >= oqVar.T0 && i7 < oqVar.U0))) {
                return 0;
            }
            if (i7 != oqVar.B0 && i7 != oqVar.F0 && i7 != oqVar.G0) {
                if (i7 != oqVar.C0 && i7 != oqVar.R && i7 != oqVar.M0 && i7 != oqVar.f48500r0 && i7 != oqVar.f48493o0) {
                    if (i7 != oqVar.f48464a1 && i7 != oqVar.O0 && i7 != oqVar.Q0 && i7 != oqVar.f48505t0 && i7 != oqVar.f48515x0 && i7 != oqVar.J0 && i7 != oqVar.L0 && i7 != oqVar.f48484i1 && i7 != oqVar.f48492n0 && i7 != oqVar.f48497q0) {
                        if (i7 == oqVar.f48467b1) {
                            return 4;
                        }
                        if (i7 == oqVar.A0) {
                            return 6;
                        }
                        if (i7 != oqVar.f48477f0 && i7 != oqVar.f48479g0 && i7 != oqVar.f48489l0 && i7 != oqVar.f48481h0 && i7 != oqVar.f48483i0 && i7 != oqVar.S && i7 != oqVar.f48471d0 && i7 != oqVar.f48474e0 && i7 != oqVar.f48487k0 && i7 != oqVar.P0) {
                            if (i7 != oqVar.Y0 && i7 != oqVar.S0 && i7 != oqVar.V0 && i7 != oqVar.f48478f1) {
                                if (i7 == oqVar.N0) {
                                    return 9;
                                }
                                if (i7 == oqVar.Z0) {
                                    return 10;
                                }
                                if (i7 == oqVar.f48475e1) {
                                    return 11;
                                }
                                if (i7 != oqVar.f48512w0 && i7 != oqVar.I0 && i7 != oqVar.K0) {
                                    if (oqVar.u0(i7)) {
                                        return 13;
                                    }
                                    if (i7 == oqVar.T) {
                                        return 14;
                                    }
                                    if (i7 == oqVar.R0) {
                                        return 15;
                                    }
                                    if (i7 != oqVar.f48480g1 && i7 != oqVar.f48482h1 && i7 != oqVar.m0) {
                                        if (i7 != oqVar.f48495p0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kq.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        int i10;
        boolean z9;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Components.vt0 vt0Var;
        org.telegram.ui.Components.vt0 vt0Var2;
        int i11 = 2;
        int i12 = 0;
        Context context = this.f47263c;
        oq oqVar = this.d;
        switch (i7) {
            case 0:
                int i13 = oqVar.N;
                if (i13 != 0 && i13 != 3) {
                    i10 = 6;
                } else {
                    i10 = 7;
                }
                if (i13 == 0 || i13 == 3) {
                    i11 = 6;
                }
                if (oqVar.f48472d1 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f47263c, i10, i11, z9, null);
                a5Var.setDelegate(new jq(this, 0));
                vt0Var2 = a5Var;
                vt0Var = vt0Var2;
                break;
            case 1:
                vt0Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 2:
                vt0Var = new org.telegram.ui.Cells.x4(context);
                break;
            case 3:
                vt0Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
                if (oqVar.f48502s) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131748239, null));
                    vt0Var = z8Var;
                    break;
                } else if (oqVar.f48511w) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131748238, null));
                    vt0Var = z8Var;
                    break;
                } else {
                    z8Var.setText(org.telegram.messenger.id.M0(2131748237, null));
                    vt0Var = z8Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.f47263c, org.telegram.ui.ActionBar.k6.L6, 21, 11, false, null);
                n4Var.setHeight(43);
                vt0Var2 = n4Var;
                vt0Var = vt0Var2;
                break;
            case 6:
                vt0Var = new org.telegram.ui.Cells.w9(context);
                break;
            case 7:
            case 14:
                vt0Var = new org.telegram.ui.Cells.q8(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.f2) oqVar).resourceProvider;
                View x3Var = new org.telegram.ui.Cells.x3(26, context, f6Var);
                x3Var.setBackground(null);
                vt0Var = x3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.vt0 vt0Var3 = new org.telegram.ui.Components.vt0(context, null);
                vt0Var3.b(oqVar.f48494o1, null, org.telegram.messenger.id.M0(2131745308, "SlowmodeOff"), org.telegram.messenger.id.a0(null, null, 2131745307, 5), org.telegram.messenger.id.a0(null, null, 2131745307, 10), org.telegram.messenger.id.a0(null, null, 2131745307, 30), org.telegram.messenger.id.a0(null, null, 2131745309, 1), org.telegram.messenger.id.a0(null, null, 2131745309, 5), org.telegram.messenger.id.a0(null, null, 2131745309, 15), org.telegram.messenger.id.a0(null, null, 2131745312, 1));
                vt0Var3.setCallback(new jq(this, 1));
                vt0Var = vt0Var3;
                break;
            case 10:
                vt0Var = new org.telegram.ui.Cells.t4(context, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
                mzVar.setIsSingleCell(true);
                mzVar.setViewType(6);
                mzVar.f36172x = false;
                mzVar.setUseHeaderOffset(false);
                mzVar.setPaddingLeft(org.telegram.messenger.g0.L(5.0f));
                v4.o0 o0Var = new v4.o0(-1, -1);
                int L = org.telegram.messenger.g0.L(12.0f);
                ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.g0.L(30.0f);
                mzVar.setLayoutParams(o0Var);
                vt0Var = mzVar;
                break;
            case 12:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(23, this.f47263c, oqVar.getResourceProvider(), false, true);
                m8Var.f29575w = 50;
                vt0Var = m8Var;
                break;
            case 13:
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(this.f47263c, 4, 21, false, oqVar.getResourceProvider());
                c2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.f27908g7, org.telegram.ui.ActionBar.k6.f27982k7);
                c2Var.setEnabled(true);
                vt0Var = c2Var;
                break;
            case 15:
                org.telegram.ui.Components.vt0 vt0Var4 = new org.telegram.ui.Components.vt0(context, null);
                Drawable[] drawableArr = {oqVar.getParentActivity().getDrawable(2131231930), oqVar.getParentActivity().getDrawable(2131231931), oqVar.getParentActivity().getDrawable(2131231931), oqVar.getParentActivity().getDrawable(2131231931), oqVar.getParentActivity().getDrawable(2131231931)};
                int i14 = oqVar.f48501r1;
                if (i14 > 0) {
                    i12 = i14 - 1;
                }
                vt0Var4.b(i12, drawableArr, "1", "2", "3", "4", "5");
                vt0Var4.setCallback(new jq(this, 2));
                vt0Var2 = vt0Var4;
                vt0Var = vt0Var2;
                break;
            case 16:
                vt0Var = new org.telegram.ui.Cells.r8(context, oqVar.getResourceProvider());
                break;
            case 17:
                vt0Var = new org.telegram.ui.Cells.t7(context, oqVar.getResourceProvider());
                break;
        }
        return new v4.d1(vt0Var);
    }
}
