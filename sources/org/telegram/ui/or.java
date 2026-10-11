package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class or extends org.telegram.ui.Components.qm0 {
    public final Context f40632c;
    public final sr d;

    public or(sr srVar, Context context) {
        this.d = srVar;
        this.f40632c = context;
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47782a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.or.D(s4.d1):boolean");
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
        return this.d.f41828d1;
    }

    @Override
    public final int j(int i10) {
        sr srVar = this.d;
        if (i10 != srVar.f41877z0 && i10 != srVar.A0 && i10 != srVar.f41866v0 && i10 != srVar.f41862t0) {
            if ((i10 >= srVar.E0 && i10 < srVar.F0) || ((i10 >= srVar.X0 && i10 < srVar.Y0) || (i10 >= srVar.U0 && i10 < srVar.V0))) {
                return 0;
            }
            if (i10 != srVar.C0 && i10 != srVar.G0 && i10 != srVar.H0) {
                if (i10 != srVar.D0 && i10 != srVar.S && i10 != srVar.N0 && i10 != srVar.f41860s0 && i10 != srVar.f41852p0) {
                    if (i10 != srVar.f41823b1 && i10 != srVar.P0 && i10 != srVar.R0 && i10 != srVar.f41864u0 && i10 != srVar.f41875y0 && i10 != srVar.K0 && i10 != srVar.M0 && i10 != srVar.f41842j1 && i10 != srVar.f41850o0 && i10 != srVar.f41857r0) {
                        if (i10 == srVar.f41826c1) {
                            return 4;
                        }
                        if (i10 == srVar.B0) {
                            return 6;
                        }
                        if (i10 != srVar.f41835g0 && i10 != srVar.f41837h0 && i10 != srVar.m0 && i10 != srVar.f41839i0 && i10 != srVar.f41841j0 && i10 != srVar.T && i10 != srVar.f41830e0 && i10 != srVar.f41833f0 && i10 != srVar.f41845l0 && i10 != srVar.Q0) {
                            if (i10 != srVar.Z0 && i10 != srVar.T0 && i10 != srVar.W0 && i10 != srVar.f41836g1) {
                                if (i10 == srVar.O0) {
                                    return 9;
                                }
                                if (i10 == srVar.f41820a1) {
                                    return 10;
                                }
                                if (i10 == srVar.f41834f1) {
                                    return 11;
                                }
                                if (i10 != srVar.f41872x0 && i10 != srVar.J0 && i10 != srVar.L0) {
                                    if (srVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == srVar.U) {
                                        return 14;
                                    }
                                    if (i10 == srVar.S0) {
                                        return 15;
                                    }
                                    if (i10 != srVar.f41838h1 && i10 != srVar.f41840i1 && i10 != srVar.f41848n0) {
                                        if (i10 != srVar.f41854q0) {
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
    public final void v(s4.d1 r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.or.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.Components.xw0 xw0Var;
        org.telegram.ui.Components.xw0 xw0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f40632c;
        sr srVar = this.d;
        switch (i10) {
            case 0:
                int i14 = srVar.O;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                if (i14 == 0 || i14 == 3) {
                    i12 = 6;
                }
                if (srVar.f41831e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(i11, i12, this.f40632c, null, z10);
                b5Var.setDelegate(new nr(this, 0));
                xw0Var2 = b5Var;
                xw0Var = xw0Var2;
                break;
            case 1:
                xw0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
                xw0Var = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                xw0Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
                if (srVar.v) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    xw0Var = e9Var;
                    break;
                } else if (srVar.f41868w) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    xw0Var = e9Var;
                    break;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    xw0Var = e9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f40632c, org.telegram.ui.ActionBar.h6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                xw0Var2 = m4Var;
                xw0Var = xw0Var2;
                break;
            case 6:
                xw0Var = new org.telegram.ui.Cells.ca(context);
                break;
            case 7:
            case 14:
                xw0Var = new org.telegram.ui.Cells.v8(context);
                break;
            case 8:
                d6Var = ((org.telegram.ui.ActionBar.m2) srVar).resourceProvider;
                View v3Var = new org.telegram.ui.Cells.v3(context, 26, d6Var);
                v3Var.setBackground(null);
                xw0Var = v3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.xw0 xw0Var3 = new org.telegram.ui.Components.xw0(context, null);
                xw0Var3.b(srVar.f41853p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                xw0Var3.setCallback(new nr(this, 1));
                xw0Var = xw0Var3;
                break;
            case 10:
                xw0Var = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(context, null);
                k10Var.setIsSingleCell(true);
                k10Var.setViewType(6);
                k10Var.f27916w = false;
                k10Var.setUseHeaderOffset(false);
                k10Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.q0 q0Var = new s4.q0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) q0Var).topMargin = AndroidUtilities.dp(30.0f);
                k10Var.setLayoutParams(q0Var);
                xw0Var = k10Var;
                break;
            case 12:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, this.f40632c, srVar.getResourceProvider(), false, true);
                r8Var.v = 50;
                xw0Var = r8Var;
                break;
            case 13:
                org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(4, 21, this.f40632c, srVar.getResourceProvider(), false);
                a2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.f20879g7, org.telegram.ui.ActionBar.h6.f20951k7);
                a2Var.setEnabled(true);
                xw0Var = a2Var;
                break;
            case 15:
                org.telegram.ui.Components.xw0 xw0Var4 = new org.telegram.ui.Components.xw0(context, null);
                Drawable[] drawableArr = {srVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), srVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), srVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), srVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), srVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = srVar.f41861s1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                xw0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                xw0Var4.setCallback(new nr(this, 2));
                xw0Var2 = xw0Var4;
                xw0Var = xw0Var2;
                break;
            case 16:
                xw0Var = new org.telegram.ui.Cells.w8(context, srVar.getResourceProvider());
                break;
            case 17:
                xw0Var = new org.telegram.ui.Cells.z7(context, srVar.getResourceProvider());
                break;
        }
        return new s4.d1(xw0Var);
    }
}
