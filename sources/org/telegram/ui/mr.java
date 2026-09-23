package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class mr extends org.telegram.ui.Components.ll0 {
    public final Context f35379c;
    public final qr d;

    public mr(qr qrVar, Context context) {
        this.d = qrVar;
        this.f35379c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42627a;
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
        return this.d.f36555d1;
    }

    @Override
    public final int j(int i10) {
        qr qrVar = this.d;
        if (i10 != qrVar.f36603z0 && i10 != qrVar.A0 && i10 != qrVar.f36592v0 && i10 != qrVar.f36588t0) {
            if ((i10 >= qrVar.E0 && i10 < qrVar.F0) || ((i10 >= qrVar.X0 && i10 < qrVar.Y0) || (i10 >= qrVar.U0 && i10 < qrVar.V0))) {
                return 0;
            }
            if (i10 != qrVar.C0 && i10 != qrVar.G0 && i10 != qrVar.H0) {
                if (i10 != qrVar.D0 && i10 != qrVar.S && i10 != qrVar.N0 && i10 != qrVar.f36586s0 && i10 != qrVar.f36578p0) {
                    if (i10 != qrVar.f36550b1 && i10 != qrVar.P0 && i10 != qrVar.R0 && i10 != qrVar.f36590u0 && i10 != qrVar.f36601y0 && i10 != qrVar.K0 && i10 != qrVar.M0 && i10 != qrVar.f36568j1 && i10 != qrVar.f36576o0 && i10 != qrVar.f36583r0) {
                        if (i10 == qrVar.f36553c1) {
                            return 4;
                        }
                        if (i10 == qrVar.B0) {
                            return 6;
                        }
                        if (i10 != qrVar.f36561g0 && i10 != qrVar.f36563h0 && i10 != qrVar.m0 && i10 != qrVar.f36565i0 && i10 != qrVar.f36567j0 && i10 != qrVar.T && i10 != qrVar.f36556e0 && i10 != qrVar.f36559f0 && i10 != qrVar.f36571l0 && i10 != qrVar.Q0) {
                            if (i10 != qrVar.Z0 && i10 != qrVar.T0 && i10 != qrVar.W0 && i10 != qrVar.f36562g1) {
                                if (i10 == qrVar.O0) {
                                    return 9;
                                }
                                if (i10 == qrVar.f36547a1) {
                                    return 10;
                                }
                                if (i10 == qrVar.f36560f1) {
                                    return 11;
                                }
                                if (i10 != qrVar.f36598x0 && i10 != qrVar.J0 && i10 != qrVar.L0) {
                                    if (qrVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == qrVar.U) {
                                        return 14;
                                    }
                                    if (i10 == qrVar.S0) {
                                        return 15;
                                    }
                                    if (i10 != qrVar.f36564h1 && i10 != qrVar.f36566i1 && i10 != qrVar.f36574n0) {
                                        if (i10 != qrVar.f36580q0) {
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
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.Components.tv0 tv0Var;
        org.telegram.ui.Components.tv0 tv0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f35379c;
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
                if (qrVar.f36557e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(i11, i12, this.f35379c, null, z10);
                b5Var.setDelegate(new lr(this, 0));
                tv0Var2 = b5Var;
                tv0Var = tv0Var2;
                break;
            case 1:
                tv0Var = new org.telegram.ui.Cells.f9(context);
                break;
            case 2:
                tv0Var = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                tv0Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                break;
            case 4:
                org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
                if (qrVar.v) {
                    f9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    tv0Var = f9Var;
                    break;
                } else if (qrVar.f36594w) {
                    f9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    tv0Var = f9Var;
                    break;
                } else {
                    f9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    tv0Var = f9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f35379c, org.telegram.ui.ActionBar.h6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                tv0Var2 = m4Var;
                tv0Var = tv0Var2;
                break;
            case 6:
                tv0Var = new org.telegram.ui.Cells.fa(context);
                break;
            case 7:
            case 14:
                tv0Var = new org.telegram.ui.Cells.w8(context);
                break;
            case 8:
                d6Var = ((org.telegram.ui.ActionBar.n2) qrVar).resourceProvider;
                View v3Var = new org.telegram.ui.Cells.v3(context, 26, d6Var);
                v3Var.setBackground(null);
                tv0Var = v3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.tv0 tv0Var3 = new org.telegram.ui.Components.tv0(context, null);
                tv0Var3.b(qrVar.f36579p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                tv0Var3.setCallback(new lr(this, 1));
                tv0Var = tv0Var3;
                break;
            case 10:
                tv0Var = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(6);
                u00Var.f28353w = false;
                u00Var.setUseHeaderOffset(false);
                u00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.p0 p0Var = new s4.p0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(30.0f);
                u00Var.setLayoutParams(p0Var);
                tv0Var = u00Var;
                break;
            case 12:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(23, this.f35379c, qrVar.getResourceProvider(), false, true);
                s8Var.v = 50;
                tv0Var = s8Var;
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.f35379c, qrVar.getResourceProvider(), false);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.f18844g7, org.telegram.ui.ActionBar.h6.f18917k7);
                z1Var.setEnabled(true);
                tv0Var = z1Var;
                break;
            case 15:
                org.telegram.ui.Components.tv0 tv0Var4 = new org.telegram.ui.Components.tv0(context, null);
                Drawable[] drawableArr = {qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = qrVar.f36587s1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                tv0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                tv0Var4.setCallback(new lr(this, 2));
                tv0Var2 = tv0Var4;
                tv0Var = tv0Var2;
                break;
            case 16:
                tv0Var = new org.telegram.ui.Cells.x8(context, qrVar.getResourceProvider());
                break;
            case 17:
                tv0Var = new org.telegram.ui.Cells.a8(context, qrVar.getResourceProvider());
                break;
        }
        return new s4.c1(tv0Var);
    }
}
