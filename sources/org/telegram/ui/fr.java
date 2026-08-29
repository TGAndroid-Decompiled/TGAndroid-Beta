package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class fr extends org.telegram.ui.Components.il0 {
    public final Context f38227c;
    public final jr d;

    public fr(jr jrVar, Context context) {
        this.d = jrVar;
        this.f38227c = context;
    }

    @Override
    public final void A(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        if (view instanceof org.telegram.ui.Cells.z4) {
            ((org.telegram.ui.Cells.z4) view).a();
        }
    }

    @Override
    public final boolean D(f2.n1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fr.D(f2.n1):boolean");
    }

    public final TLObject E(int i10) {
        jr jrVar = this.d;
        int i11 = jrVar.A0;
        if (i10 >= i11 && i10 < jrVar.B0) {
            return (TLObject) jrVar.B.get(i10 - i11);
        }
        int i12 = jrVar.Q0;
        if (i10 >= i12 && i10 < jrVar.R0) {
            return (TLObject) jrVar.D.get(i10 - i12);
        }
        int i13 = jrVar.T0;
        if (i10 >= i13 && i10 < jrVar.U0) {
            return (TLObject) jrVar.C.get(i10 - i13);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.Z0;
    }

    @Override
    public final int j(int i10) {
        jr jrVar = this.d;
        if (i10 != jrVar.f39666v0 && i10 != jrVar.f39669w0 && i10 != jrVar.f39657r0 && i10 != jrVar.f39652p0) {
            if ((i10 >= jrVar.A0 && i10 < jrVar.B0) || ((i10 >= jrVar.T0 && i10 < jrVar.U0) || (i10 >= jrVar.Q0 && i10 < jrVar.R0))) {
                return 0;
            }
            if (i10 != jrVar.f39675y0 && i10 != jrVar.C0 && i10 != jrVar.D0) {
                if (i10 != jrVar.f39677z0 && i10 != jrVar.O && i10 != jrVar.J0 && i10 != jrVar.f39650o0 && i10 != jrVar.f39645l0) {
                    if (i10 != jrVar.X0 && i10 != jrVar.L0 && i10 != jrVar.N0 && i10 != jrVar.f39654q0 && i10 != jrVar.f39664u0 && i10 != jrVar.G0 && i10 != jrVar.I0 && i10 != jrVar.f39634f1 && i10 != jrVar.f39643k0 && i10 != jrVar.f39648n0) {
                        if (i10 == jrVar.Y0) {
                            return 4;
                        }
                        if (i10 == jrVar.f39672x0) {
                            return 6;
                        }
                        if (i10 != jrVar.f39625c0 && i10 != jrVar.f39627d0 && i10 != jrVar.f39639i0 && i10 != jrVar.f39630e0 && i10 != jrVar.f39633f0 && i10 != jrVar.P && i10 != jrVar.f39619a0 && i10 != jrVar.f39622b0 && i10 != jrVar.f39637h0 && i10 != jrVar.M0) {
                            if (i10 != jrVar.V0 && i10 != jrVar.P0 && i10 != jrVar.S0 && i10 != jrVar.f39626c1) {
                                if (i10 == jrVar.K0) {
                                    return 9;
                                }
                                if (i10 == jrVar.W0) {
                                    return 10;
                                }
                                if (i10 == jrVar.f39623b1) {
                                    return 11;
                                }
                                if (i10 != jrVar.f39662t0 && i10 != jrVar.F0 && i10 != jrVar.H0) {
                                    if (jrVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == jrVar.Q) {
                                        return 14;
                                    }
                                    if (i10 == jrVar.O0) {
                                        return 15;
                                    }
                                    if (i10 != jrVar.f39628d1 && i10 != jrVar.f39631e1 && i10 != jrVar.f39641j0) {
                                        if (i10 != jrVar.m0) {
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
    public final void v(f2.n1 r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fr.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.Components.lv0 lv0Var;
        org.telegram.ui.Components.lv0 lv0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f38227c;
        jr jrVar = this.d;
        switch (i10) {
            case 0:
                int i14 = jrVar.K;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                i12 = (i14 == 0 || i14 == 3) ? 6 : 6;
                if (jrVar.f39620a1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.z4 z4Var = new org.telegram.ui.Cells.z4(i11, i12, this.f38227c, null, z10);
                z4Var.setDelegate(new er(this, 0));
                lv0Var2 = z4Var;
                lv0Var = lv0Var2;
                break;
            case 1:
                lv0Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 2:
                lv0Var = new org.telegram.ui.Cells.w4(context);
                break;
            case 3:
                lv0Var = new org.telegram.ui.Cells.x6(context, (b) null);
                break;
            case 4:
                org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
                if (jrVar.v) {
                    y8Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    lv0Var = y8Var;
                    break;
                } else if (jrVar.f39668w) {
                    y8Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    lv0Var = y8Var;
                    break;
                } else {
                    y8Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    lv0Var = y8Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(this.f38227c, org.telegram.ui.ActionBar.g6.L6, 21, 11, false, null);
                k4Var.setHeight(43);
                lv0Var2 = k4Var;
                lv0Var = lv0Var2;
                break;
            case 6:
                lv0Var = new org.telegram.ui.Cells.y9(context);
                break;
            case 7:
            case 14:
                lv0Var = new org.telegram.ui.Cells.p8(context);
                break;
            case 8:
                c6Var = ((org.telegram.ui.ActionBar.o2) jrVar).resourceProvider;
                View s3Var = new org.telegram.ui.Cells.s3(context, 26, c6Var);
                s3Var.setBackground(null);
                lv0Var = s3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.lv0 lv0Var3 = new org.telegram.ui.Components.lv0(context, null);
                lv0Var3.b(jrVar.l1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                lv0Var3.setCallback(new er(this, 1));
                lv0Var = lv0Var3;
                break;
            case 10:
                lv0Var = new org.telegram.ui.Cells.q4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
                p00Var.setIsSingleCell(true);
                p00Var.setViewType(6);
                p00Var.f31529w = false;
                p00Var.setUseHeaderOffset(false);
                p00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                f2.x0 x0Var = new f2.x0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) x0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) x0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) x0Var).topMargin = AndroidUtilities.dp(30.0f);
                p00Var.setLayoutParams(x0Var);
                lv0Var = p00Var;
                break;
            case 12:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(23, this.f38227c, jrVar.getResourceProvider(), false, true);
                m8Var.v = 50;
                lv0Var = m8Var;
                break;
            case 13:
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(4, 21, this.f38227c, jrVar.getResourceProvider(), false);
                y1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                y1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.g6.V6, org.telegram.ui.ActionBar.g6.f23118g7, org.telegram.ui.ActionBar.g6.f23190k7);
                y1Var.setEnabled(true);
                lv0Var = y1Var;
                break;
            case 15:
                org.telegram.ui.Components.lv0 lv0Var4 = new org.telegram.ui.Components.lv0(context, null);
                Drawable[] drawableArr = {jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = jrVar.f39651o1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                lv0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                lv0Var4.setCallback(new er(this, 2));
                lv0Var2 = lv0Var4;
                lv0Var = lv0Var2;
                break;
            case 16:
                lv0Var = new org.telegram.ui.Cells.q8(context, jrVar.getResourceProvider());
                break;
            case 17:
                lv0Var = new org.telegram.ui.Cells.v7(context, jrVar.getResourceProvider());
                break;
        }
        return new f2.n1(lv0Var);
    }
}
