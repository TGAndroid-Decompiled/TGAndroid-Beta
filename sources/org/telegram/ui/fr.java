package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class fr extends org.telegram.ui.Components.hm0 {
    public final Context f37004c;
    public final jr d;

    public fr(jr jrVar, Context context) {
        this.d = jrVar;
        this.f37004c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f45958a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fr.D(s4.b1):boolean");
    }

    public final TLObject E(int i10) {
        jr jrVar = this.d;
        int i11 = jrVar.E0;
        if (i10 >= i11 && i10 < jrVar.F0) {
            return (TLObject) jrVar.F.get(i10 - i11);
        }
        int i12 = jrVar.U0;
        if (i10 >= i12 && i10 < jrVar.V0) {
            return (TLObject) jrVar.H.get(i10 - i12);
        }
        int i13 = jrVar.X0;
        if (i10 >= i13 && i10 < jrVar.Y0) {
            return (TLObject) jrVar.G.get(i10 - i13);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.f38283d1;
    }

    @Override
    public final int j(int i10) {
        jr jrVar = this.d;
        if (i10 != jrVar.f38331z0 && i10 != jrVar.A0 && i10 != jrVar.f38320v0 && i10 != jrVar.f38316t0) {
            if ((i10 >= jrVar.E0 && i10 < jrVar.F0) || ((i10 >= jrVar.X0 && i10 < jrVar.Y0) || (i10 >= jrVar.U0 && i10 < jrVar.V0))) {
                return 0;
            }
            if (i10 != jrVar.C0 && i10 != jrVar.G0 && i10 != jrVar.H0) {
                if (i10 != jrVar.D0 && i10 != jrVar.S && i10 != jrVar.N0 && i10 != jrVar.f38314s0 && i10 != jrVar.f38306p0) {
                    if (i10 != jrVar.f38278b1 && i10 != jrVar.P0 && i10 != jrVar.R0 && i10 != jrVar.f38318u0 && i10 != jrVar.f38329y0 && i10 != jrVar.K0 && i10 != jrVar.M0 && i10 != jrVar.f38296j1 && i10 != jrVar.f38304o0 && i10 != jrVar.f38311r0) {
                        if (i10 == jrVar.f38281c1) {
                            return 4;
                        }
                        if (i10 == jrVar.B0) {
                            return 6;
                        }
                        if (i10 != jrVar.f38289g0 && i10 != jrVar.f38291h0 && i10 != jrVar.m0 && i10 != jrVar.f38293i0 && i10 != jrVar.f38295j0 && i10 != jrVar.T && i10 != jrVar.f38284e0 && i10 != jrVar.f38287f0 && i10 != jrVar.f38299l0 && i10 != jrVar.Q0) {
                            if (i10 != jrVar.Z0 && i10 != jrVar.T0 && i10 != jrVar.W0 && i10 != jrVar.f38290g1) {
                                if (i10 == jrVar.O0) {
                                    return 9;
                                }
                                if (i10 == jrVar.f38275a1) {
                                    return 10;
                                }
                                if (i10 == jrVar.f38288f1) {
                                    return 11;
                                }
                                if (i10 != jrVar.f38326x0 && i10 != jrVar.J0 && i10 != jrVar.L0) {
                                    if (jrVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == jrVar.U) {
                                        return 14;
                                    }
                                    if (i10 == jrVar.S0) {
                                        return 15;
                                    }
                                    if (i10 != jrVar.f38292h1 && i10 != jrVar.f38294i1 && i10 != jrVar.f38302n0) {
                                        if (i10 != jrVar.f38308q0) {
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
    public final void v(s4.b1 r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fr.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.Components.nw0 nw0Var;
        org.telegram.ui.Components.nw0 nw0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f37004c;
        jr jrVar = this.d;
        switch (i10) {
            case 0:
                int i14 = jrVar.O;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                if (i14 == 0 || i14 == 3) {
                    i12 = 6;
                }
                if (jrVar.f38285e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(i11, i12, this.f37004c, null, z10);
                a5Var.setDelegate(new er(this, 0));
                nw0Var2 = a5Var;
                nw0Var = nw0Var2;
                break;
            case 1:
                nw0Var = new org.telegram.ui.Cells.d9(context);
                break;
            case 2:
                nw0Var = new org.telegram.ui.Cells.x4(context);
                break;
            case 3:
                nw0Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
                if (jrVar.v) {
                    d9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    nw0Var = d9Var;
                    break;
                } else if (jrVar.f38322w) {
                    d9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    nw0Var = d9Var;
                    break;
                } else {
                    d9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    nw0Var = d9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.f37004c, org.telegram.ui.ActionBar.h6.L6, 21, 11, false, null);
                l4Var.setHeight(43);
                nw0Var2 = l4Var;
                nw0Var = nw0Var2;
                break;
            case 6:
                nw0Var = new org.telegram.ui.Cells.ba(context);
                break;
            case 7:
            case 14:
                nw0Var = new org.telegram.ui.Cells.u8(context);
                break;
            case 8:
                d6Var = ((org.telegram.ui.ActionBar.n2) jrVar).resourceProvider;
                View u3Var = new org.telegram.ui.Cells.u3(context, 26, d6Var);
                u3Var.setBackground(null);
                nw0Var = u3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.nw0 nw0Var3 = new org.telegram.ui.Components.nw0(context, null);
                nw0Var3.b(jrVar.f38307p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                nw0Var3.setCallback(new er(this, 1));
                nw0Var = nw0Var3;
                break;
            case 10:
                nw0Var = new org.telegram.ui.Cells.r4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
                b10Var.setIsSingleCell(true);
                b10Var.setViewType(6);
                b10Var.f24774w = false;
                b10Var.setUseHeaderOffset(false);
                b10Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.o0 o0Var = new s4.o0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) o0Var).topMargin = AndroidUtilities.dp(30.0f);
                b10Var.setLayoutParams(o0Var);
                nw0Var = b10Var;
                break;
            case 12:
                org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(23, this.f37004c, jrVar.getResourceProvider(), false, true);
                q8Var.v = 50;
                nw0Var = q8Var;
                break;
            case 13:
                org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(4, 21, this.f37004c, jrVar.getResourceProvider(), false);
                a2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.f21047g7, org.telegram.ui.ActionBar.h6.f21121k7);
                a2Var.setEnabled(true);
                nw0Var = a2Var;
                break;
            case 15:
                org.telegram.ui.Components.nw0 nw0Var4 = new org.telegram.ui.Components.nw0(context, null);
                Drawable[] drawableArr = {jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = jrVar.f38315s1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                nw0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                nw0Var4.setCallback(new er(this, 2));
                nw0Var2 = nw0Var4;
                nw0Var = nw0Var2;
                break;
            case 16:
                nw0Var = new org.telegram.ui.Cells.v8(context, jrVar.getResourceProvider());
                break;
            case 17:
                nw0Var = new org.telegram.ui.Cells.y7(context, jrVar.getResourceProvider());
                break;
        }
        return new s4.b1(nw0Var);
    }
}
