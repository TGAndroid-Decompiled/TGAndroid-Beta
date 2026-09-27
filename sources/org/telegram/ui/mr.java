package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class mr extends org.telegram.ui.Components.xl0 {
    public final Context f35745c;
    public final qr d;

    public mr(qr qrVar, Context context) {
        this.d = qrVar;
        this.f35745c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f43005a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mr.D(s4.c1):boolean");
    }

    public final TLObject E(int i10) {
        qr qrVar = this.d;
        int i11 = qrVar.E0;
        if (i10 >= i11 && i10 < qrVar.F0) {
            return (TLObject) qrVar.F.get(i10 - i11);
        }
        int i12 = qrVar.U0;
        if (i10 >= i12 && i10 < qrVar.V0) {
            return (TLObject) qrVar.H.get(i10 - i12);
        }
        int i13 = qrVar.X0;
        if (i10 >= i13 && i10 < qrVar.Y0) {
            return (TLObject) qrVar.G.get(i10 - i13);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.f36827d1;
    }

    @Override
    public final int j(int i10) {
        qr qrVar = this.d;
        if (i10 != qrVar.f36875z0 && i10 != qrVar.A0 && i10 != qrVar.f36864v0 && i10 != qrVar.f36860t0) {
            if ((i10 >= qrVar.E0 && i10 < qrVar.F0) || ((i10 >= qrVar.X0 && i10 < qrVar.Y0) || (i10 >= qrVar.U0 && i10 < qrVar.V0))) {
                return 0;
            }
            if (i10 != qrVar.C0 && i10 != qrVar.G0 && i10 != qrVar.H0) {
                if (i10 != qrVar.D0 && i10 != qrVar.S && i10 != qrVar.N0 && i10 != qrVar.f36858s0 && i10 != qrVar.f36850p0) {
                    if (i10 != qrVar.f36822b1 && i10 != qrVar.P0 && i10 != qrVar.R0 && i10 != qrVar.f36862u0 && i10 != qrVar.f36873y0 && i10 != qrVar.K0 && i10 != qrVar.M0 && i10 != qrVar.f36840j1 && i10 != qrVar.f36848o0 && i10 != qrVar.f36855r0) {
                        if (i10 == qrVar.f36825c1) {
                            return 4;
                        }
                        if (i10 == qrVar.B0) {
                            return 6;
                        }
                        if (i10 != qrVar.f36833g0 && i10 != qrVar.f36835h0 && i10 != qrVar.m0 && i10 != qrVar.f36837i0 && i10 != qrVar.f36839j0 && i10 != qrVar.T && i10 != qrVar.f36828e0 && i10 != qrVar.f36831f0 && i10 != qrVar.f36843l0 && i10 != qrVar.Q0) {
                            if (i10 != qrVar.Z0 && i10 != qrVar.T0 && i10 != qrVar.W0 && i10 != qrVar.f36834g1) {
                                if (i10 == qrVar.O0) {
                                    return 9;
                                }
                                if (i10 == qrVar.f36819a1) {
                                    return 10;
                                }
                                if (i10 == qrVar.f36832f1) {
                                    return 11;
                                }
                                if (i10 != qrVar.f36870x0 && i10 != qrVar.J0 && i10 != qrVar.L0) {
                                    if (qrVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == qrVar.U) {
                                        return 14;
                                    }
                                    if (i10 == qrVar.S0) {
                                        return 15;
                                    }
                                    if (i10 != qrVar.f36836h1 && i10 != qrVar.f36838i1 && i10 != qrVar.f36846n0) {
                                        if (i10 != qrVar.f36852q0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mr.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.Components.gw0 gw0Var;
        org.telegram.ui.Components.gw0 gw0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f35745c;
        qr qrVar = this.d;
        switch (i10) {
            case 0:
                int i14 = qrVar.O;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                i12 = (i14 == 0 || i14 == 3) ? 6 : 6;
                if (qrVar.f36829e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(i11, i12, this.f35745c, null, z10);
                b5Var.setDelegate(new lr(this, 0));
                gw0Var2 = b5Var;
                gw0Var = gw0Var2;
                break;
            case 1:
                gw0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
                gw0Var = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                gw0Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
                if (qrVar.v) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    gw0Var = e9Var;
                    break;
                } else if (qrVar.f36866w) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    gw0Var = e9Var;
                    break;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    gw0Var = e9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f35745c, org.telegram.ui.ActionBar.i6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                gw0Var2 = m4Var;
                gw0Var = gw0Var2;
                break;
            case 6:
                gw0Var = new org.telegram.ui.Cells.ea(context);
                break;
            case 7:
            case 14:
                gw0Var = new org.telegram.ui.Cells.v8(context);
                break;
            case 8:
                e6Var = ((org.telegram.ui.ActionBar.o2) qrVar).resourceProvider;
                View v3Var = new org.telegram.ui.Cells.v3(context, 26, e6Var);
                v3Var.setBackground(null);
                gw0Var = v3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.gw0 gw0Var3 = new org.telegram.ui.Components.gw0(context, null);
                gw0Var3.b(qrVar.f36851p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                gw0Var3.setCallback(new lr(this, 1));
                gw0Var = gw0Var3;
                break;
            case 10:
                gw0Var = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(context, null);
                v00Var.setIsSingleCell(true);
                v00Var.setViewType(6);
                v00Var.f28982w = false;
                v00Var.setUseHeaderOffset(false);
                v00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.p0 p0Var = new s4.p0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(30.0f);
                v00Var.setLayoutParams(p0Var);
                gw0Var = v00Var;
                break;
            case 12:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, this.f35745c, qrVar.getResourceProvider(), false, true);
                r8Var.v = 50;
                gw0Var = r8Var;
                break;
            case 13:
                org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(4, 21, this.f35745c, qrVar.getResourceProvider(), false);
                a2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.i6.V6, org.telegram.ui.ActionBar.i6.f19112g7, org.telegram.ui.ActionBar.i6.f19186k7);
                a2Var.setEnabled(true);
                gw0Var = a2Var;
                break;
            case 15:
                org.telegram.ui.Components.gw0 gw0Var4 = new org.telegram.ui.Components.gw0(context, null);
                Drawable[] drawableArr = {qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = qrVar.f36859s1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                gw0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                gw0Var4.setCallback(new lr(this, 2));
                gw0Var2 = gw0Var4;
                gw0Var = gw0Var2;
                break;
            case 16:
                gw0Var = new org.telegram.ui.Cells.w8(context, qrVar.getResourceProvider());
                break;
            case 17:
                gw0Var = new org.telegram.ui.Cells.z7(context, qrVar.getResourceProvider());
                break;
        }
        return new s4.c1(gw0Var);
    }
}
