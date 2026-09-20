package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class or extends org.telegram.ui.Components.ul0 {
    public final Context f36359c;
    public final sr d;

    public or(sr srVar, Context context) {
        this.d = srVar;
        this.f36359c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42974a;
        if (view instanceof org.telegram.ui.Cells.c5) {
            ((org.telegram.ui.Cells.c5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.or.D(s4.c1):boolean");
    }

    public final TLObject E(int i10) {
        sr srVar = this.d;
        int i11 = srVar.E0;
        if (i10 >= i11 && i10 < srVar.F0) {
            return (TLObject) srVar.F.get(i10 - i11);
        }
        int i12 = srVar.U0;
        if (i10 >= i12 && i10 < srVar.V0) {
            return (TLObject) srVar.H.get(i10 - i12);
        }
        int i13 = srVar.X0;
        if (i10 >= i13 && i10 < srVar.Y0) {
            return (TLObject) srVar.G.get(i10 - i13);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.f37457d1;
    }

    @Override
    public final int j(int i10) {
        sr srVar = this.d;
        if (i10 != srVar.f37505z0 && i10 != srVar.A0 && i10 != srVar.f37494v0 && i10 != srVar.f37490t0) {
            if ((i10 >= srVar.E0 && i10 < srVar.F0) || ((i10 >= srVar.X0 && i10 < srVar.Y0) || (i10 >= srVar.U0 && i10 < srVar.V0))) {
                return 0;
            }
            if (i10 != srVar.C0 && i10 != srVar.G0 && i10 != srVar.H0) {
                if (i10 != srVar.D0 && i10 != srVar.S && i10 != srVar.N0 && i10 != srVar.f37488s0 && i10 != srVar.f37480p0) {
                    if (i10 != srVar.f37452b1 && i10 != srVar.P0 && i10 != srVar.R0 && i10 != srVar.f37492u0 && i10 != srVar.f37503y0 && i10 != srVar.K0 && i10 != srVar.M0 && i10 != srVar.f37470j1 && i10 != srVar.f37478o0 && i10 != srVar.f37485r0) {
                        if (i10 == srVar.f37455c1) {
                            return 4;
                        }
                        if (i10 == srVar.B0) {
                            return 6;
                        }
                        if (i10 != srVar.f37463g0 && i10 != srVar.f37465h0 && i10 != srVar.m0 && i10 != srVar.f37467i0 && i10 != srVar.f37469j0 && i10 != srVar.T && i10 != srVar.f37458e0 && i10 != srVar.f37461f0 && i10 != srVar.f37473l0 && i10 != srVar.Q0) {
                            if (i10 != srVar.Z0 && i10 != srVar.T0 && i10 != srVar.W0 && i10 != srVar.f37464g1) {
                                if (i10 == srVar.O0) {
                                    return 9;
                                }
                                if (i10 == srVar.f37449a1) {
                                    return 10;
                                }
                                if (i10 == srVar.f37462f1) {
                                    return 11;
                                }
                                if (i10 != srVar.f37500x0 && i10 != srVar.J0 && i10 != srVar.L0) {
                                    if (srVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == srVar.U) {
                                        return 14;
                                    }
                                    if (i10 == srVar.S0) {
                                        return 15;
                                    }
                                    if (i10 != srVar.f37466h1 && i10 != srVar.f37468i1 && i10 != srVar.f37476n0) {
                                        if (i10 != srVar.f37482q0) {
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
    public final void v(s4.c1 r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.or.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Components.ew0 ew0Var;
        org.telegram.ui.Components.ew0 ew0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f36359c;
        sr srVar = this.d;
        switch (i10) {
            case 0:
                int i14 = srVar.O;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                i12 = (i14 == 0 || i14 == 3) ? 6 : 6;
                if (srVar.f37459e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.c5 c5Var = new org.telegram.ui.Cells.c5(i11, i12, this.f36359c, null, z10);
                c5Var.setDelegate(new nr(this, 0));
                ew0Var2 = c5Var;
                ew0Var = ew0Var2;
                break;
            case 1:
                ew0Var = new org.telegram.ui.Cells.f9(context);
                break;
            case 2:
                ew0Var = new org.telegram.ui.Cells.z4(context);
                break;
            case 3:
                ew0Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
                if (srVar.v) {
                    f9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    ew0Var = f9Var;
                    break;
                } else if (srVar.f37496w) {
                    f9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    ew0Var = f9Var;
                    break;
                } else {
                    f9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    ew0Var = f9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.f36359c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
                n4Var.setHeight(43);
                ew0Var2 = n4Var;
                ew0Var = ew0Var2;
                break;
            case 6:
                ew0Var = new org.telegram.ui.Cells.fa(context);
                break;
            case 7:
            case 14:
                ew0Var = new org.telegram.ui.Cells.w8(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.n2) srVar).resourceProvider;
                View w3Var = new org.telegram.ui.Cells.w3(context, 26, f6Var);
                w3Var.setBackground(null);
                ew0Var = w3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.ew0 ew0Var3 = new org.telegram.ui.Components.ew0(context, null);
                ew0Var3.b(srVar.f37481p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                ew0Var3.setCallback(new nr(this, 1));
                ew0Var = ew0Var3;
                break;
            case 10:
                ew0Var = new org.telegram.ui.Cells.t4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(6);
                t00Var.f28252w = false;
                t00Var.setUseHeaderOffset(false);
                t00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.p0 p0Var = new s4.p0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(30.0f);
                t00Var.setLayoutParams(p0Var);
                ew0Var = t00Var;
                break;
            case 12:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(23, this.f36359c, srVar.getResourceProvider(), false, true);
                s8Var.v = 50;
                ew0Var = s8Var;
                break;
            case 13:
                org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(4, 21, this.f36359c, srVar.getResourceProvider(), false);
                a2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f19149g7, org.telegram.ui.ActionBar.j6.f19223k7);
                a2Var.setEnabled(true);
                ew0Var = a2Var;
                break;
            case 15:
                org.telegram.ui.Components.ew0 ew0Var4 = new org.telegram.ui.Components.ew0(context, null);
                Drawable[] drawableArr = {srVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), srVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), srVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), srVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), srVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = srVar.f37489s1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                ew0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                ew0Var4.setCallback(new nr(this, 2));
                ew0Var2 = ew0Var4;
                ew0Var = ew0Var2;
                break;
            case 16:
                ew0Var = new org.telegram.ui.Cells.x8(context, srVar.getResourceProvider());
                break;
            case 17:
                ew0Var = new org.telegram.ui.Cells.a8(context, srVar.getResourceProvider());
                break;
        }
        return new s4.c1(ew0Var);
    }
}
