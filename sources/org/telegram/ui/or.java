package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class or extends org.telegram.ui.Components.rm0 {
    public final Context f40598c;
    public final sr d;

    public or(sr srVar, Context context) {
        this.d = srVar;
        this.f40598c = context;
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47748a;
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
        return this.d.f41794d1;
    }

    @Override
    public final int j(int i10) {
        sr srVar = this.d;
        if (i10 != srVar.f41843z0 && i10 != srVar.A0 && i10 != srVar.f41832v0 && i10 != srVar.f41828t0) {
            if ((i10 >= srVar.E0 && i10 < srVar.F0) || ((i10 >= srVar.X0 && i10 < srVar.Y0) || (i10 >= srVar.U0 && i10 < srVar.V0))) {
                return 0;
            }
            if (i10 != srVar.C0 && i10 != srVar.G0 && i10 != srVar.H0) {
                if (i10 != srVar.D0 && i10 != srVar.S && i10 != srVar.N0 && i10 != srVar.f41826s0 && i10 != srVar.f41818p0) {
                    if (i10 != srVar.f41789b1 && i10 != srVar.P0 && i10 != srVar.R0 && i10 != srVar.f41830u0 && i10 != srVar.f41841y0 && i10 != srVar.K0 && i10 != srVar.M0 && i10 != srVar.f41808j1 && i10 != srVar.f41816o0 && i10 != srVar.f41823r0) {
                        if (i10 == srVar.f41792c1) {
                            return 4;
                        }
                        if (i10 == srVar.B0) {
                            return 6;
                        }
                        if (i10 != srVar.f41801g0 && i10 != srVar.f41803h0 && i10 != srVar.m0 && i10 != srVar.f41805i0 && i10 != srVar.f41807j0 && i10 != srVar.T && i10 != srVar.f41796e0 && i10 != srVar.f41799f0 && i10 != srVar.f41811l0 && i10 != srVar.Q0) {
                            if (i10 != srVar.Z0 && i10 != srVar.T0 && i10 != srVar.W0 && i10 != srVar.f41802g1) {
                                if (i10 == srVar.O0) {
                                    return 9;
                                }
                                if (i10 == srVar.f41786a1) {
                                    return 10;
                                }
                                if (i10 == srVar.f41800f1) {
                                    return 11;
                                }
                                if (i10 != srVar.f41838x0 && i10 != srVar.J0 && i10 != srVar.L0) {
                                    if (srVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == srVar.U) {
                                        return 14;
                                    }
                                    if (i10 == srVar.S0) {
                                        return 15;
                                    }
                                    if (i10 != srVar.f41804h1 && i10 != srVar.f41806i1 && i10 != srVar.f41814n0) {
                                        if (i10 != srVar.f41820q0) {
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
        org.telegram.ui.Components.yw0 yw0Var;
        org.telegram.ui.Components.yw0 yw0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f40598c;
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
                if (srVar.f41797e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(i11, i12, this.f40598c, null, z10);
                b5Var.setDelegate(new nr(this, 0));
                yw0Var2 = b5Var;
                yw0Var = yw0Var2;
                break;
            case 1:
                yw0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
                yw0Var = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                yw0Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
                if (srVar.v) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    yw0Var = e9Var;
                    break;
                } else if (srVar.f41834w) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    yw0Var = e9Var;
                    break;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    yw0Var = e9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f40598c, org.telegram.ui.ActionBar.h6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                yw0Var2 = m4Var;
                yw0Var = yw0Var2;
                break;
            case 6:
                yw0Var = new org.telegram.ui.Cells.ca(context);
                break;
            case 7:
            case 14:
                yw0Var = new org.telegram.ui.Cells.v8(context);
                break;
            case 8:
                d6Var = ((org.telegram.ui.ActionBar.m2) srVar).resourceProvider;
                View v3Var = new org.telegram.ui.Cells.v3(context, 26, d6Var);
                v3Var.setBackground(null);
                yw0Var = v3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.yw0 yw0Var3 = new org.telegram.ui.Components.yw0(context, null);
                yw0Var3.b(srVar.f41819p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                yw0Var3.setCallback(new nr(this, 1));
                yw0Var = yw0Var3;
                break;
            case 10:
                yw0Var = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(context, null);
                k10Var.setIsSingleCell(true);
                k10Var.setViewType(6);
                k10Var.f27811w = false;
                k10Var.setUseHeaderOffset(false);
                k10Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.q0 q0Var = new s4.q0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) q0Var).topMargin = AndroidUtilities.dp(30.0f);
                k10Var.setLayoutParams(q0Var);
                yw0Var = k10Var;
                break;
            case 12:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, this.f40598c, srVar.getResourceProvider(), false, true);
                r8Var.v = 50;
                yw0Var = r8Var;
                break;
            case 13:
                org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(4, 21, this.f40598c, srVar.getResourceProvider(), false);
                a2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.f20843g7, org.telegram.ui.ActionBar.h6.f20915k7);
                a2Var.setEnabled(true);
                yw0Var = a2Var;
                break;
            case 15:
                org.telegram.ui.Components.yw0 yw0Var4 = new org.telegram.ui.Components.yw0(context, null);
                Drawable[] drawableArr = {srVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), srVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), srVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), srVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), srVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = srVar.f41827s1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                yw0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                yw0Var4.setCallback(new nr(this, 2));
                yw0Var2 = yw0Var4;
                yw0Var = yw0Var2;
                break;
            case 16:
                yw0Var = new org.telegram.ui.Cells.w8(context, srVar.getResourceProvider());
                break;
            case 17:
                yw0Var = new org.telegram.ui.Cells.z7(context, srVar.getResourceProvider());
                break;
        }
        return new s4.d1(yw0Var);
    }
}
