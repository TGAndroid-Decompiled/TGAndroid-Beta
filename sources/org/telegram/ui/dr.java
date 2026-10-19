package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class dr extends org.telegram.ui.Components.hm0 {
    public final Context f36444c;
    public final hr d;

    public dr(hr hrVar, Context context) {
        this.d = hrVar;
        this.f36444c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f45910a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dr.D(s4.b1):boolean");
    }

    public final TLObject E(int i10) {
        hr hrVar = this.d;
        int i11 = hrVar.E0;
        if (i10 >= i11 && i10 < hrVar.F0) {
            return (TLObject) hrVar.F.get(i10 - i11);
        }
        int i12 = hrVar.U0;
        if (i10 >= i12 && i10 < hrVar.V0) {
            return (TLObject) hrVar.H.get(i10 - i12);
        }
        int i13 = hrVar.X0;
        if (i10 >= i13 && i10 < hrVar.Y0) {
            return (TLObject) hrVar.G.get(i10 - i13);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.f37748d1;
    }

    @Override
    public final int j(int i10) {
        hr hrVar = this.d;
        if (i10 != hrVar.f37796z0 && i10 != hrVar.A0 && i10 != hrVar.f37785v0 && i10 != hrVar.f37781t0) {
            if ((i10 >= hrVar.E0 && i10 < hrVar.F0) || ((i10 >= hrVar.X0 && i10 < hrVar.Y0) || (i10 >= hrVar.U0 && i10 < hrVar.V0))) {
                return 0;
            }
            if (i10 != hrVar.C0 && i10 != hrVar.G0 && i10 != hrVar.H0) {
                if (i10 != hrVar.D0 && i10 != hrVar.S && i10 != hrVar.N0 && i10 != hrVar.f37779s0 && i10 != hrVar.f37771p0) {
                    if (i10 != hrVar.f37743b1 && i10 != hrVar.P0 && i10 != hrVar.R0 && i10 != hrVar.f37783u0 && i10 != hrVar.f37794y0 && i10 != hrVar.K0 && i10 != hrVar.M0 && i10 != hrVar.f37761j1 && i10 != hrVar.f37769o0 && i10 != hrVar.f37776r0) {
                        if (i10 == hrVar.f37746c1) {
                            return 4;
                        }
                        if (i10 == hrVar.B0) {
                            return 6;
                        }
                        if (i10 != hrVar.f37754g0 && i10 != hrVar.f37756h0 && i10 != hrVar.m0 && i10 != hrVar.f37758i0 && i10 != hrVar.f37760j0 && i10 != hrVar.T && i10 != hrVar.f37749e0 && i10 != hrVar.f37752f0 && i10 != hrVar.f37764l0 && i10 != hrVar.Q0) {
                            if (i10 != hrVar.Z0 && i10 != hrVar.T0 && i10 != hrVar.W0 && i10 != hrVar.f37755g1) {
                                if (i10 == hrVar.O0) {
                                    return 9;
                                }
                                if (i10 == hrVar.f37740a1) {
                                    return 10;
                                }
                                if (i10 == hrVar.f37753f1) {
                                    return 11;
                                }
                                if (i10 != hrVar.f37791x0 && i10 != hrVar.J0 && i10 != hrVar.L0) {
                                    if (hrVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == hrVar.U) {
                                        return 14;
                                    }
                                    if (i10 == hrVar.S0) {
                                        return 15;
                                    }
                                    if (i10 != hrVar.f37757h1 && i10 != hrVar.f37759i1 && i10 != hrVar.f37767n0) {
                                        if (i10 != hrVar.f37773q0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dr.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.Components.ow0 ow0Var;
        org.telegram.ui.Components.ow0 ow0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f36444c;
        hr hrVar = this.d;
        switch (i10) {
            case 0:
                int i14 = hrVar.O;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                if (i14 == 0 || i14 == 3) {
                    i12 = 6;
                }
                if (hrVar.f37750e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(i11, i12, this.f36444c, null, z10);
                a5Var.setDelegate(new cr(this, 0));
                ow0Var2 = a5Var;
                ow0Var = ow0Var2;
                break;
            case 1:
                ow0Var = new org.telegram.ui.Cells.d9(context);
                break;
            case 2:
                ow0Var = new org.telegram.ui.Cells.x4(context);
                break;
            case 3:
                ow0Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
                if (hrVar.v) {
                    d9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    ow0Var = d9Var;
                    break;
                } else if (hrVar.f37787w) {
                    d9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    ow0Var = d9Var;
                    break;
                } else {
                    d9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    ow0Var = d9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.f36444c, org.telegram.ui.ActionBar.h6.L6, 21, 11, false, null);
                l4Var.setHeight(43);
                ow0Var2 = l4Var;
                ow0Var = ow0Var2;
                break;
            case 6:
                ow0Var = new org.telegram.ui.Cells.ba(context);
                break;
            case 7:
            case 14:
                ow0Var = new org.telegram.ui.Cells.u8(context);
                break;
            case 8:
                d6Var = ((org.telegram.ui.ActionBar.n2) hrVar).resourceProvider;
                View u3Var = new org.telegram.ui.Cells.u3(context, 26, d6Var);
                u3Var.setBackground(null);
                ow0Var = u3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.ow0 ow0Var3 = new org.telegram.ui.Components.ow0(context, null);
                ow0Var3.b(hrVar.f37772p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                ow0Var3.setCallback(new cr(this, 1));
                ow0Var = ow0Var3;
                break;
            case 10:
                ow0Var = new org.telegram.ui.Cells.r4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
                b10Var.setIsSingleCell(true);
                b10Var.setViewType(6);
                b10Var.f24772w = false;
                b10Var.setUseHeaderOffset(false);
                b10Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.o0 o0Var = new s4.o0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) o0Var).topMargin = AndroidUtilities.dp(30.0f);
                b10Var.setLayoutParams(o0Var);
                ow0Var = b10Var;
                break;
            case 12:
                org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(23, this.f36444c, hrVar.getResourceProvider(), false, true);
                q8Var.v = 50;
                ow0Var = q8Var;
                break;
            case 13:
                org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(4, 21, this.f36444c, hrVar.getResourceProvider(), false);
                a2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.f21043g7, org.telegram.ui.ActionBar.h6.f21117k7);
                a2Var.setEnabled(true);
                ow0Var = a2Var;
                break;
            case 15:
                org.telegram.ui.Components.ow0 ow0Var4 = new org.telegram.ui.Components.ow0(context, null);
                Drawable[] drawableArr = {hrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), hrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), hrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), hrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), hrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = hrVar.f37780s1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                ow0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                ow0Var4.setCallback(new cr(this, 2));
                ow0Var2 = ow0Var4;
                ow0Var = ow0Var2;
                break;
            case 16:
                ow0Var = new org.telegram.ui.Cells.v8(context, hrVar.getResourceProvider());
                break;
            case 17:
                ow0Var = new org.telegram.ui.Cells.y7(context, hrVar.getResourceProvider());
                break;
        }
        return new s4.b1(ow0Var);
    }
}
