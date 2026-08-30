package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class lr extends org.telegram.ui.Components.rl0 {
    public final Context f36127c;
    public final pr d;

    public lr(pr prVar, Context context) {
        this.d = prVar;
        this.f36127c = context;
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5785a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.l1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lr.D(f2.l1):boolean");
    }

    public final TLObject E(int i10) {
        pr prVar = this.d;
        int i11 = prVar.B0;
        if (i10 >= i11 && i10 < prVar.C0) {
            return (TLObject) prVar.C.get(i10 - i11);
        }
        int i12 = prVar.R0;
        if (i10 >= i12 && i10 < prVar.S0) {
            return (TLObject) prVar.E.get(i10 - i12);
        }
        int i13 = prVar.U0;
        if (i10 >= i13 && i10 < prVar.V0) {
            return (TLObject) prVar.D.get(i10 - i13);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.f37446a1;
    }

    @Override
    public final int j(int i10) {
        pr prVar = this.d;
        if (i10 != prVar.f37494w0 && i10 != prVar.f37497x0 && i10 != prVar.f37485s0 && i10 != prVar.f37479q0) {
            if ((i10 >= prVar.B0 && i10 < prVar.C0) || ((i10 >= prVar.U0 && i10 < prVar.V0) || (i10 >= prVar.R0 && i10 < prVar.S0))) {
                return 0;
            }
            if (i10 != prVar.f37502z0 && i10 != prVar.D0 && i10 != prVar.E0) {
                if (i10 != prVar.A0 && i10 != prVar.P && i10 != prVar.K0 && i10 != prVar.f37477p0 && i10 != prVar.m0) {
                    if (i10 != prVar.Y0 && i10 != prVar.M0 && i10 != prVar.O0 && i10 != prVar.f37482r0 && i10 != prVar.f37491v0 && i10 != prVar.H0 && i10 != prVar.J0 && i10 != prVar.f37461g1 && i10 != prVar.f37470l0 && i10 != prVar.f37475o0) {
                        if (i10 == prVar.Z0) {
                            return 4;
                        }
                        if (i10 == prVar.f37500y0) {
                            return 6;
                        }
                        if (i10 != prVar.f37453d0 && i10 != prVar.f37455e0 && i10 != prVar.f37466j0 && i10 != prVar.f37458f0 && i10 != prVar.f37460g0 && i10 != prVar.Q && i10 != prVar.f37448b0 && i10 != prVar.f37451c0 && i10 != prVar.f37464i0 && i10 != prVar.N0) {
                            if (i10 != prVar.W0 && i10 != prVar.Q0 && i10 != prVar.T0 && i10 != prVar.f37454d1) {
                                if (i10 == prVar.L0) {
                                    return 9;
                                }
                                if (i10 == prVar.X0) {
                                    return 10;
                                }
                                if (i10 == prVar.f37452c1) {
                                    return 11;
                                }
                                if (i10 != prVar.f37489u0 && i10 != prVar.G0 && i10 != prVar.I0) {
                                    if (prVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == prVar.R) {
                                        return 14;
                                    }
                                    if (i10 == prVar.P0) {
                                        return 15;
                                    }
                                    if (i10 != prVar.f37456e1 && i10 != prVar.f37459f1 && i10 != prVar.f37468k0) {
                                        if (i10 != prVar.f37473n0) {
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
    public final void v(f2.l1 r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lr.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z4;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Components.uv0 uv0Var;
        org.telegram.ui.Components.uv0 uv0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f36127c;
        pr prVar = this.d;
        switch (i10) {
            case 0:
                int i14 = prVar.L;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                i12 = (i14 == 0 || i14 == 3) ? 6 : 6;
                if (prVar.f37449b1 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(i11, i12, this.f36127c, null, z4);
                b5Var.setDelegate(new kr(this, 0));
                uv0Var2 = b5Var;
                uv0Var = uv0Var2;
                break;
            case 1:
                uv0Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 2:
                uv0Var = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                uv0Var = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 4:
                org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
                if (prVar.v) {
                    a9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    uv0Var = a9Var;
                    break;
                } else if (prVar.f37493w) {
                    a9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    uv0Var = a9Var;
                    break;
                } else {
                    a9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    uv0Var = a9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f36127c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                uv0Var2 = m4Var;
                uv0Var = uv0Var2;
                break;
            case 6:
                uv0Var = new org.telegram.ui.Cells.aa(context);
                break;
            case 7:
            case 14:
                uv0Var = new org.telegram.ui.Cells.r8(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.p2) prVar).resourceProvider;
                View u3Var = new org.telegram.ui.Cells.u3(context, 26, f6Var);
                u3Var.setBackground(null);
                uv0Var = u3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.uv0 uv0Var3 = new org.telegram.ui.Components.uv0(context, null);
                uv0Var3.b(prVar.f37471m1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                uv0Var3.setCallback(new kr(this, 1));
                uv0Var = uv0Var3;
                break;
            case 10:
                uv0Var = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(6);
                t00Var.f28855w = false;
                t00Var.setUseHeaderOffset(false);
                t00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                f2.w0 w0Var = new f2.w0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) w0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) w0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) w0Var).topMargin = AndroidUtilities.dp(30.0f);
                t00Var.setLayoutParams(w0Var);
                uv0Var = t00Var;
                break;
            case 12:
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(23, this.f36127c, prVar.getResourceProvider(), false, true);
                o8Var.v = 50;
                uv0Var = o8Var;
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.f36127c, prVar.getResourceProvider(), false);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f19961g7, org.telegram.ui.ActionBar.j6.f20032k7);
                z1Var.setEnabled(true);
                uv0Var = z1Var;
                break;
            case 15:
                org.telegram.ui.Components.uv0 uv0Var4 = new org.telegram.ui.Components.uv0(context, null);
                Drawable[] drawableArr = {prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), prVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = prVar.f37478p1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                uv0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                uv0Var4.setCallback(new kr(this, 2));
                uv0Var2 = uv0Var4;
                uv0Var = uv0Var2;
                break;
            case 16:
                uv0Var = new org.telegram.ui.Cells.s8(context, prVar.getResourceProvider());
                break;
            case 17:
                uv0Var = new org.telegram.ui.Cells.x7(context, prVar.getResourceProvider());
                break;
        }
        return new f2.l1(uv0Var);
    }
}
