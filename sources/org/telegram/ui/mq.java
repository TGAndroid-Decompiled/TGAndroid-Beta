package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
public final class mq extends org.telegram.ui.Components.pj0 {
    public final Context f47947c;
    public final qq d;

    public mq(qq qqVar, Context context) {
        this.d = qqVar;
        this.f47947c = context;
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57056a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mq.D(v4.d1):boolean");
    }

    public final TLObject E(int i7) {
        qq qqVar = this.d;
        int i10 = qqVar.D0;
        if (i7 >= i10 && i7 < qqVar.E0) {
            return (TLObject) qqVar.E.get(i7 - i10);
        }
        int i11 = qqVar.T0;
        if (i7 >= i11 && i7 < qqVar.U0) {
            return (TLObject) qqVar.G.get(i7 - i11);
        }
        int i12 = qqVar.W0;
        if (i7 >= i12 && i7 < qqVar.X0) {
            return (TLObject) qqVar.F.get(i7 - i12);
        }
        return null;
    }

    @Override
    public final int b() {
        return this.d.f49123c1;
    }

    @Override
    public final int d(int i7) {
        qq qqVar = this.d;
        if (i7 != qqVar.f49171y0 && i7 != qqVar.f49173z0 && i7 != qqVar.f49160u0 && i7 != qqVar.f49156s0) {
            if ((i7 >= qqVar.D0 && i7 < qqVar.E0) || ((i7 >= qqVar.W0 && i7 < qqVar.X0) || (i7 >= qqVar.T0 && i7 < qqVar.U0))) {
                return 0;
            }
            if (i7 != qqVar.B0 && i7 != qqVar.F0 && i7 != qqVar.G0) {
                if (i7 != qqVar.C0 && i7 != qqVar.R && i7 != qqVar.M0 && i7 != qqVar.f49153r0 && i7 != qqVar.f49146o0) {
                    if (i7 != qqVar.f49117a1 && i7 != qqVar.O0 && i7 != qqVar.Q0 && i7 != qqVar.f49158t0 && i7 != qqVar.f49168x0 && i7 != qqVar.J0 && i7 != qqVar.L0 && i7 != qqVar.f49137i1 && i7 != qqVar.f49145n0 && i7 != qqVar.f49150q0) {
                        if (i7 == qqVar.f49120b1) {
                            return 4;
                        }
                        if (i7 == qqVar.A0) {
                            return 6;
                        }
                        if (i7 != qqVar.f49130f0 && i7 != qqVar.f49132g0 && i7 != qqVar.f49142l0 && i7 != qqVar.f49134h0 && i7 != qqVar.f49136i0 && i7 != qqVar.S && i7 != qqVar.f49124d0 && i7 != qqVar.f49127e0 && i7 != qqVar.f49140k0 && i7 != qqVar.P0) {
                            if (i7 != qqVar.Y0 && i7 != qqVar.S0 && i7 != qqVar.V0 && i7 != qqVar.f49131f1) {
                                if (i7 == qqVar.N0) {
                                    return 9;
                                }
                                if (i7 == qqVar.Z0) {
                                    return 10;
                                }
                                if (i7 == qqVar.f49128e1) {
                                    return 11;
                                }
                                if (i7 != qqVar.f49165w0 && i7 != qqVar.I0 && i7 != qqVar.K0) {
                                    if (qqVar.u0(i7)) {
                                        return 13;
                                    }
                                    if (i7 == qqVar.T) {
                                        return 14;
                                    }
                                    if (i7 == qqVar.R0) {
                                        return 15;
                                    }
                                    if (i7 != qqVar.f49133g1 && i7 != qqVar.f49135h1 && i7 != qqVar.m0) {
                                        if (i7 != qqVar.f49148p0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mq.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        int i10;
        boolean z9;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.Components.xt0 xt0Var;
        org.telegram.ui.Components.xt0 xt0Var2;
        int i11 = 2;
        int i12 = 0;
        Context context = this.f47947c;
        qq qqVar = this.d;
        switch (i7) {
            case 0:
                int i13 = qqVar.N;
                if (i13 != 0 && i13 != 3) {
                    i10 = 6;
                } else {
                    i10 = 7;
                }
                if (i13 == 0 || i13 == 3) {
                    i11 = 6;
                }
                if (qqVar.f49125d1 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f47947c, i10, i11, z9, null);
                a5Var.setDelegate(new lq(this, 0));
                xt0Var2 = a5Var;
                xt0Var = xt0Var2;
                break;
            case 1:
                xt0Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 2:
                xt0Var = new org.telegram.ui.Cells.x4(context);
                break;
            case 3:
                xt0Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
                if (qqVar.f49155s) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131748238, null));
                    xt0Var = z8Var;
                    break;
                } else if (qqVar.f49164w) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131748237, null));
                    xt0Var = z8Var;
                    break;
                } else {
                    z8Var.setText(org.telegram.messenger.id.M0(2131748236, null));
                    xt0Var = z8Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.f47947c, org.telegram.ui.ActionBar.l6.L6, 21, 11, false, null);
                n4Var.setHeight(43);
                xt0Var2 = n4Var;
                xt0Var = xt0Var2;
                break;
            case 6:
                xt0Var = new org.telegram.ui.Cells.w9(context);
                break;
            case 7:
            case 14:
                xt0Var = new org.telegram.ui.Cells.q8(context);
                break;
            case 8:
                g6Var = ((org.telegram.ui.ActionBar.f2) qqVar).resourceProvider;
                View x3Var = new org.telegram.ui.Cells.x3(26, context, g6Var);
                x3Var.setBackground(null);
                xt0Var = x3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.xt0 xt0Var3 = new org.telegram.ui.Components.xt0(context, null);
                xt0Var3.b(qqVar.f49147o1, null, org.telegram.messenger.id.M0(2131745305, "SlowmodeOff"), org.telegram.messenger.id.a0(null, null, 2131745304, 5), org.telegram.messenger.id.a0(null, null, 2131745304, 10), org.telegram.messenger.id.a0(null, null, 2131745304, 30), org.telegram.messenger.id.a0(null, null, 2131745306, 1), org.telegram.messenger.id.a0(null, null, 2131745306, 5), org.telegram.messenger.id.a0(null, null, 2131745306, 15), org.telegram.messenger.id.a0(null, null, 2131745309, 1));
                xt0Var3.setCallback(new lq(this, 1));
                xt0Var = xt0Var3;
                break;
            case 10:
                xt0Var = new org.telegram.ui.Cells.t4(context, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
                mzVar.setIsSingleCell(true);
                mzVar.setViewType(6);
                mzVar.f36181x = false;
                mzVar.setUseHeaderOffset(false);
                mzVar.setPaddingLeft(org.telegram.messenger.g0.L(5.0f));
                v4.o0 o0Var = new v4.o0(-1, -1);
                int L = org.telegram.messenger.g0.L(12.0f);
                ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.g0.L(30.0f);
                mzVar.setLayoutParams(o0Var);
                xt0Var = mzVar;
                break;
            case 12:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(23, this.f47947c, qqVar.getResourceProvider(), false, true);
                m8Var.f29579w = 50;
                xt0Var = m8Var;
                break;
            case 13:
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(this.f47947c, 4, 21, false, qqVar.getResourceProvider());
                c2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.l6.V6, org.telegram.ui.ActionBar.l6.f27921g7, org.telegram.ui.ActionBar.l6.f27995k7);
                c2Var.setEnabled(true);
                xt0Var = c2Var;
                break;
            case 15:
                org.telegram.ui.Components.xt0 xt0Var4 = new org.telegram.ui.Components.xt0(context, null);
                Drawable[] drawableArr = {qqVar.getParentActivity().getDrawable(2131231930), qqVar.getParentActivity().getDrawable(2131231931), qqVar.getParentActivity().getDrawable(2131231931), qqVar.getParentActivity().getDrawable(2131231931), qqVar.getParentActivity().getDrawable(2131231931)};
                int i14 = qqVar.f49154r1;
                if (i14 > 0) {
                    i12 = i14 - 1;
                }
                xt0Var4.b(i12, drawableArr, "1", "2", "3", "4", "5");
                xt0Var4.setCallback(new lq(this, 2));
                xt0Var2 = xt0Var4;
                xt0Var = xt0Var2;
                break;
            case 16:
                xt0Var = new org.telegram.ui.Cells.r8(context, qqVar.getResourceProvider());
                break;
            case 17:
                xt0Var = new org.telegram.ui.Cells.t7(context, qqVar.getResourceProvider());
                break;
        }
        return new v4.d1(xt0Var);
    }
}
