package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class lr extends org.telegram.ui.Components.vl0 {
    public final Context f35404c;
    public final pr d;

    public lr(pr prVar, Context context) {
        this.d = prVar;
        this.f35404c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42960a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lr.D(s4.c1):boolean");
    }

    public final TLObject E(int i10) {
        pr prVar = this.d;
        int i11 = prVar.E0;
        if (i10 >= i11 && i10 < prVar.F0) {
            return (TLObject) prVar.F.get(i10 - i11);
        }
        int i12 = prVar.U0;
        if (i10 >= i12 && i10 < prVar.V0) {
            return (TLObject) prVar.H.get(i10 - i12);
        }
        int i13 = prVar.X0;
        if (i10 >= i13 && i10 < prVar.Y0) {
            return (TLObject) prVar.G.get(i10 - i13);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.f36619d1;
    }

    @Override
    public final int j(int i10) {
        pr prVar = this.d;
        if (i10 != prVar.f36667z0 && i10 != prVar.A0 && i10 != prVar.f36656v0 && i10 != prVar.f36652t0) {
            if ((i10 >= prVar.E0 && i10 < prVar.F0) || ((i10 >= prVar.X0 && i10 < prVar.Y0) || (i10 >= prVar.U0 && i10 < prVar.V0))) {
                return 0;
            }
            if (i10 != prVar.C0 && i10 != prVar.G0 && i10 != prVar.H0) {
                if (i10 != prVar.D0 && i10 != prVar.S && i10 != prVar.N0 && i10 != prVar.f36650s0 && i10 != prVar.f36642p0) {
                    if (i10 != prVar.f36614b1 && i10 != prVar.P0 && i10 != prVar.R0 && i10 != prVar.f36654u0 && i10 != prVar.f36665y0 && i10 != prVar.K0 && i10 != prVar.M0 && i10 != prVar.f36632j1 && i10 != prVar.f36640o0 && i10 != prVar.f36647r0) {
                        if (i10 == prVar.f36617c1) {
                            return 4;
                        }
                        if (i10 == prVar.B0) {
                            return 6;
                        }
                        if (i10 != prVar.f36625g0 && i10 != prVar.f36627h0 && i10 != prVar.m0 && i10 != prVar.f36629i0 && i10 != prVar.f36631j0 && i10 != prVar.T && i10 != prVar.f36620e0 && i10 != prVar.f36623f0 && i10 != prVar.f36635l0 && i10 != prVar.Q0) {
                            if (i10 != prVar.Z0 && i10 != prVar.T0 && i10 != prVar.W0 && i10 != prVar.f36626g1) {
                                if (i10 == prVar.O0) {
                                    return 9;
                                }
                                if (i10 == prVar.f36611a1) {
                                    return 10;
                                }
                                if (i10 == prVar.f36624f1) {
                                    return 11;
                                }
                                if (i10 != prVar.f36662x0 && i10 != prVar.J0 && i10 != prVar.L0) {
                                    if (prVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == prVar.U) {
                                        return 14;
                                    }
                                    if (i10 == prVar.S0) {
                                        return 15;
                                    }
                                    if (i10 != prVar.f36628h1 && i10 != prVar.f36630i1 && i10 != prVar.f36638n0) {
                                        if (i10 != prVar.f36644q0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lr.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.Components.ew0 ew0Var;
        org.telegram.ui.Components.ew0 ew0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f35404c;
        pr prVar = this.d;
        switch (i10) {
            case 0:
                int i14 = prVar.O;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                i12 = (i14 == 0 || i14 == 3) ? 6 : 6;
                if (prVar.f36621e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(i11, i12, this.f35404c, null, z10);
                b5Var.setDelegate(new kr(this, 0));
                ew0Var2 = b5Var;
                ew0Var = ew0Var2;
                break;
            case 1:
                ew0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
                ew0Var = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                ew0Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
                if (prVar.v) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    ew0Var = e9Var;
                    break;
                } else if (prVar.f36658w) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    ew0Var = e9Var;
                    break;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    ew0Var = e9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f35404c, org.telegram.ui.ActionBar.h6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                ew0Var2 = m4Var;
                ew0Var = ew0Var2;
                break;
            case 6:
                ew0Var = new org.telegram.ui.Cells.ea(context);
                break;
            case 7:
            case 14:
                ew0Var = new org.telegram.ui.Cells.v8(context);
                break;
            case 8:
                d6Var = ((org.telegram.ui.ActionBar.m2) prVar).resourceProvider;
                View v3Var = new org.telegram.ui.Cells.v3(context, 26, d6Var);
                v3Var.setBackground(null);
                ew0Var = v3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.ew0 ew0Var3 = new org.telegram.ui.Components.ew0(context, null);
                ew0Var3.b(prVar.f36643p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                ew0Var3.setCallback(new kr(this, 1));
                ew0Var = ew0Var3;
                break;
            case 10:
                ew0Var = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(6);
                u00Var.f28661w = false;
                u00Var.setUseHeaderOffset(false);
                u00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.p0 p0Var = new s4.p0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(30.0f);
                u00Var.setLayoutParams(p0Var);
                ew0Var = u00Var;
                break;
            case 12:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, this.f35404c, prVar.getResourceProvider(), false, true);
                r8Var.v = 50;
                ew0Var = r8Var;
                break;
            case 13:
                org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(4, 21, this.f35404c, prVar.getResourceProvider(), false);
                a2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.f19114g7, org.telegram.ui.ActionBar.h6.f19187k7);
                a2Var.setEnabled(true);
                ew0Var = a2Var;
                break;
            case 15:
                org.telegram.ui.Components.ew0 ew0Var4 = new org.telegram.ui.Components.ew0(context, null);
                Drawable[] drawableArr = {prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = prVar.f36651s1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                ew0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                ew0Var4.setCallback(new kr(this, 2));
                ew0Var2 = ew0Var4;
                ew0Var = ew0Var2;
                break;
            case 16:
                ew0Var = new org.telegram.ui.Cells.w8(context, prVar.getResourceProvider());
                break;
            case 17:
                ew0Var = new org.telegram.ui.Cells.z7(context, prVar.getResourceProvider());
                break;
        }
        return new s4.c1(ew0Var);
    }
}
