package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class ir extends org.telegram.ui.Components.mm0 {
    public final Context f40263c;
    public final mr d;

    public ir(mr mrVar, Context context) {
        this.d = mrVar;
        this.f40263c = context;
    }

    @Override
    public final void A(s4.e1 e1Var) {
        View view = e1Var.f47773a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override
    public final boolean D(s4.e1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ir.D(s4.e1):boolean");
    }

    public final TLObject E(int i10) {
        mr mrVar = this.d;
        int i11 = mrVar.D0;
        if (i10 >= i11 && i10 < mrVar.E0) {
            return (TLObject) mrVar.E.get(i10 - i11);
        }
        int i12 = mrVar.T0;
        if (i10 >= i12 && i10 < mrVar.U0) {
            return (TLObject) mrVar.G.get(i10 - i12);
        }
        int i13 = mrVar.W0;
        if (i10 >= i13 && i10 < mrVar.X0) {
            return (TLObject) mrVar.F.get(i10 - i13);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.f41510c1;
    }

    @Override
    public final int j(int i10) {
        mr mrVar = this.d;
        if (i10 != mrVar.f41558y0 && i10 != mrVar.f41560z0 && i10 != mrVar.f41547u0 && i10 != mrVar.f41543s0) {
            if ((i10 >= mrVar.D0 && i10 < mrVar.E0) || ((i10 >= mrVar.W0 && i10 < mrVar.X0) || (i10 >= mrVar.T0 && i10 < mrVar.U0))) {
                return 0;
            }
            if (i10 != mrVar.B0 && i10 != mrVar.F0 && i10 != mrVar.G0) {
                if (i10 != mrVar.C0 && i10 != mrVar.R && i10 != mrVar.M0 && i10 != mrVar.f41540r0 && i10 != mrVar.f41533o0) {
                    if (i10 != mrVar.f41504a1 && i10 != mrVar.O0 && i10 != mrVar.Q0 && i10 != mrVar.f41545t0 && i10 != mrVar.f41555x0 && i10 != mrVar.J0 && i10 != mrVar.L0 && i10 != mrVar.f41523i1 && i10 != mrVar.f41531n0 && i10 != mrVar.f41537q0) {
                        if (i10 == mrVar.f41507b1) {
                            return 4;
                        }
                        if (i10 == mrVar.A0) {
                            return 6;
                        }
                        if (i10 != mrVar.f41516f0 && i10 != mrVar.f41518g0 && i10 != mrVar.f41528l0 && i10 != mrVar.f41520h0 && i10 != mrVar.f41522i0 && i10 != mrVar.S && i10 != mrVar.f41511d0 && i10 != mrVar.f41513e0 && i10 != mrVar.f41526k0 && i10 != mrVar.P0) {
                            if (i10 != mrVar.Y0 && i10 != mrVar.S0 && i10 != mrVar.V0 && i10 != mrVar.f41517f1) {
                                if (i10 == mrVar.N0) {
                                    return 9;
                                }
                                if (i10 == mrVar.Z0) {
                                    return 10;
                                }
                                if (i10 == mrVar.f41514e1) {
                                    return 11;
                                }
                                if (i10 != mrVar.f41552w0 && i10 != mrVar.I0 && i10 != mrVar.K0) {
                                    if (mrVar.q0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == mrVar.T) {
                                        return 14;
                                    }
                                    if (i10 == mrVar.R0) {
                                        return 15;
                                    }
                                    if (i10 != mrVar.f41519g1 && i10 != mrVar.f41521h1 && i10 != mrVar.m0) {
                                        if (i10 != mrVar.f41535p0) {
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
    public final void v(s4.e1 r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ir.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.Components.ax0 ax0Var;
        org.telegram.ui.Components.ax0 ax0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f40263c;
        mr mrVar = this.d;
        switch (i10) {
            case 0:
                int i14 = mrVar.N;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                if (i14 == 0 || i14 == 3) {
                    i12 = 6;
                }
                if (mrVar.f41512d1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.f5 f5Var = new org.telegram.ui.Cells.f5(i11, i12, this.f40263c, null, z10);
                f5Var.setDelegate(new hr(this, 0));
                ax0Var2 = f5Var;
                ax0Var = ax0Var2;
                break;
            case 1:
                ax0Var = new org.telegram.ui.Cells.i9(context);
                break;
            case 2:
                ax0Var = new org.telegram.ui.Cells.c5(context);
                break;
            case 3:
                ax0Var = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 4:
                org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context);
                if (mrVar.f41542s) {
                    i9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    ax0Var = i9Var;
                    break;
                } else if (mrVar.v) {
                    i9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    ax0Var = i9Var;
                    break;
                } else {
                    i9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    ax0Var = i9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(this.f40263c, org.telegram.ui.ActionBar.y6.L6, 21, 11, false, null);
                q4Var.setHeight(43);
                ax0Var2 = q4Var;
                ax0Var = ax0Var2;
                break;
            case 6:
                ax0Var = new org.telegram.ui.Cells.ga(context);
                break;
            case 7:
            case 14:
                ax0Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 8:
                u6Var = ((org.telegram.ui.ActionBar.r2) mrVar).resourceProvider;
                View z3Var = new org.telegram.ui.Cells.z3(context, 26, u6Var);
                z3Var.setBackground(null);
                ax0Var = z3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.ax0 ax0Var3 = new org.telegram.ui.Components.ax0(context, null);
                ax0Var3.b(mrVar.f41534o1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                ax0Var3.setCallback(new hr(this, 1));
                ax0Var = ax0Var3;
                break;
            case 10:
                ax0Var = new org.telegram.ui.Cells.w4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
                c10Var.setIsSingleCell(true);
                c10Var.setViewType(6);
                c10Var.f27026w = false;
                c10Var.setUseHeaderOffset(false);
                c10Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.q0 q0Var = new s4.q0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) q0Var).topMargin = AndroidUtilities.dp(30.0f);
                c10Var.setLayoutParams(q0Var);
                ax0Var = c10Var;
                break;
            case 12:
                org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(23, this.f40263c, mrVar.getResourceProvider(), false, true);
                v8Var.v = 50;
                ax0Var = v8Var;
                break;
            case 13:
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(4, 21, this.f40263c, mrVar.getResourceProvider(), false);
                y1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                y1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.y6.V6, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.f23486k7);
                y1Var.setEnabled(true);
                ax0Var = y1Var;
                break;
            case 15:
                org.telegram.ui.Components.ax0 ax0Var4 = new org.telegram.ui.Components.ax0(context, null);
                Drawable[] drawableArr = {mrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), mrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), mrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), mrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), mrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = mrVar.f41541r1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                ax0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                ax0Var4.setCallback(new hr(this, 2));
                ax0Var2 = ax0Var4;
                ax0Var = ax0Var2;
                break;
            case 16:
                ax0Var = new org.telegram.ui.Cells.a9(context, mrVar.getResourceProvider());
                break;
            case 17:
                ax0Var = new org.telegram.ui.Cells.c8(context, mrVar.getResourceProvider());
                break;
        }
        return new s4.e1(ax0Var);
    }
}
