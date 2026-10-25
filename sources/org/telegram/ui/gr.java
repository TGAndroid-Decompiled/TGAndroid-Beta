package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class gr extends org.telegram.ui.Components.lm0 {
    public final Context f39770c;
    public final kr d;

    public gr(kr krVar, Context context) {
        this.d = krVar;
        this.f39770c = context;
    }

    @Override
    public final void A(s4.e1 e1Var) {
        View view = e1Var.f47735a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override
    public final boolean D(s4.e1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gr.D(s4.e1):boolean");
    }

    public final TLObject E(int i10) {
        kr krVar = this.d;
        int i11 = krVar.D0;
        if (i10 >= i11 && i10 < krVar.E0) {
            return (TLObject) krVar.E.get(i10 - i11);
        }
        int i12 = krVar.T0;
        if (i10 >= i12 && i10 < krVar.U0) {
            return (TLObject) krVar.G.get(i10 - i12);
        }
        int i13 = krVar.W0;
        if (i10 >= i13 && i10 < krVar.X0) {
            return (TLObject) krVar.F.get(i10 - i13);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.f41009c1;
    }

    @Override
    public final int j(int i10) {
        kr krVar = this.d;
        if (i10 != krVar.f41057y0 && i10 != krVar.f41059z0 && i10 != krVar.f41046u0 && i10 != krVar.f41042s0) {
            if ((i10 >= krVar.D0 && i10 < krVar.E0) || ((i10 >= krVar.W0 && i10 < krVar.X0) || (i10 >= krVar.T0 && i10 < krVar.U0))) {
                return 0;
            }
            if (i10 != krVar.B0 && i10 != krVar.F0 && i10 != krVar.G0) {
                if (i10 != krVar.C0 && i10 != krVar.R && i10 != krVar.M0 && i10 != krVar.f41039r0 && i10 != krVar.f41032o0) {
                    if (i10 != krVar.f41003a1 && i10 != krVar.O0 && i10 != krVar.Q0 && i10 != krVar.f41044t0 && i10 != krVar.f41054x0 && i10 != krVar.J0 && i10 != krVar.L0 && i10 != krVar.f41022i1 && i10 != krVar.f41030n0 && i10 != krVar.f41036q0) {
                        if (i10 == krVar.f41006b1) {
                            return 4;
                        }
                        if (i10 == krVar.A0) {
                            return 6;
                        }
                        if (i10 != krVar.f41015f0 && i10 != krVar.f41017g0 && i10 != krVar.f41027l0 && i10 != krVar.f41019h0 && i10 != krVar.f41021i0 && i10 != krVar.S && i10 != krVar.f41010d0 && i10 != krVar.f41012e0 && i10 != krVar.f41025k0 && i10 != krVar.P0) {
                            if (i10 != krVar.Y0 && i10 != krVar.S0 && i10 != krVar.V0 && i10 != krVar.f41016f1) {
                                if (i10 == krVar.N0) {
                                    return 9;
                                }
                                if (i10 == krVar.Z0) {
                                    return 10;
                                }
                                if (i10 == krVar.f41013e1) {
                                    return 11;
                                }
                                if (i10 != krVar.f41051w0 && i10 != krVar.I0 && i10 != krVar.K0) {
                                    if (krVar.q0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == krVar.T) {
                                        return 14;
                                    }
                                    if (i10 == krVar.R0) {
                                        return 15;
                                    }
                                    if (i10 != krVar.f41018g1 && i10 != krVar.f41020h1 && i10 != krVar.m0) {
                                        if (i10 != krVar.f41034p0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gr.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.Components.zw0 zw0Var;
        org.telegram.ui.Components.zw0 zw0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f39770c;
        kr krVar = this.d;
        switch (i10) {
            case 0:
                int i14 = krVar.N;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                if (i14 == 0 || i14 == 3) {
                    i12 = 6;
                }
                if (krVar.f41011d1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.f5 f5Var = new org.telegram.ui.Cells.f5(i11, i12, this.f39770c, null, z10);
                f5Var.setDelegate(new fr(this, 0));
                zw0Var2 = f5Var;
                zw0Var = zw0Var2;
                break;
            case 1:
                zw0Var = new org.telegram.ui.Cells.i9(context);
                break;
            case 2:
                zw0Var = new org.telegram.ui.Cells.c5(context);
                break;
            case 3:
                zw0Var = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 4:
                org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context);
                if (krVar.f41041s) {
                    i9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    zw0Var = i9Var;
                    break;
                } else if (krVar.v) {
                    i9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    zw0Var = i9Var;
                    break;
                } else {
                    i9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    zw0Var = i9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(this.f39770c, org.telegram.ui.ActionBar.y6.L6, 21, 11, false, null);
                q4Var.setHeight(43);
                zw0Var2 = q4Var;
                zw0Var = zw0Var2;
                break;
            case 6:
                zw0Var = new org.telegram.ui.Cells.ga(context);
                break;
            case 7:
            case 14:
                zw0Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 8:
                u6Var = ((org.telegram.ui.ActionBar.r2) krVar).resourceProvider;
                View z3Var = new org.telegram.ui.Cells.z3(context, 26, u6Var);
                z3Var.setBackground(null);
                zw0Var = z3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.zw0 zw0Var3 = new org.telegram.ui.Components.zw0(context, null);
                zw0Var3.b(krVar.f41033o1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                zw0Var3.setCallback(new fr(this, 1));
                zw0Var = zw0Var3;
                break;
            case 10:
                zw0Var = new org.telegram.ui.Cells.w4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
                c10Var.setIsSingleCell(true);
                c10Var.setViewType(6);
                c10Var.f27029w = false;
                c10Var.setUseHeaderOffset(false);
                c10Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.q0 q0Var = new s4.q0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) q0Var).topMargin = AndroidUtilities.dp(30.0f);
                c10Var.setLayoutParams(q0Var);
                zw0Var = c10Var;
                break;
            case 12:
                org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(23, this.f39770c, krVar.getResourceProvider(), false, true);
                v8Var.v = 50;
                zw0Var = v8Var;
                break;
            case 13:
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(4, 21, this.f39770c, krVar.getResourceProvider(), false);
                y1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                y1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.y6.V6, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.f23483k7);
                y1Var.setEnabled(true);
                zw0Var = y1Var;
                break;
            case 15:
                org.telegram.ui.Components.zw0 zw0Var4 = new org.telegram.ui.Components.zw0(context, null);
                Drawable[] drawableArr = {krVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), krVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), krVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), krVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), krVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = krVar.f41040r1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                zw0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                zw0Var4.setCallback(new fr(this, 2));
                zw0Var2 = zw0Var4;
                zw0Var = zw0Var2;
                break;
            case 16:
                zw0Var = new org.telegram.ui.Cells.a9(context, krVar.getResourceProvider());
                break;
            case 17:
                zw0Var = new org.telegram.ui.Cells.c8(context, krVar.getResourceProvider());
                break;
        }
        return new s4.e1(zw0Var);
    }
}
