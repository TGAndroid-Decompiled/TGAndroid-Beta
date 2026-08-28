package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class er extends org.telegram.ui.Components.vk0 {
    public final Context f38018c;
    public final jr d;

    public er(jr jrVar, Context context) {
        this.d = jrVar;
        this.f38018c = context;
    }

    @Override
    public final void A(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.q1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.er.D(f2.q1):boolean");
    }

    public final TLObject E(int i9) {
        jr jrVar = this.d;
        int i10 = jrVar.A0;
        if (i9 >= i10 && i9 < jrVar.B0) {
            return (TLObject) jrVar.B.get(i9 - i10);
        }
        int i11 = jrVar.Q0;
        if (i9 >= i11 && i9 < jrVar.R0) {
            return (TLObject) jrVar.D.get(i9 - i11);
        }
        int i12 = jrVar.T0;
        if (i9 >= i12 && i9 < jrVar.U0) {
            return (TLObject) jrVar.C.get(i9 - i12);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.Z0;
    }

    @Override
    public final int j(int i9) {
        jr jrVar = this.d;
        if (i9 != jrVar.f39605v0 && i9 != jrVar.f39608w0 && i9 != jrVar.f39596r0 && i9 != jrVar.f39591p0) {
            if ((i9 >= jrVar.A0 && i9 < jrVar.B0) || ((i9 >= jrVar.T0 && i9 < jrVar.U0) || (i9 >= jrVar.Q0 && i9 < jrVar.R0))) {
                return 0;
            }
            if (i9 != jrVar.f39614y0 && i9 != jrVar.C0 && i9 != jrVar.D0) {
                if (i9 != jrVar.f39616z0 && i9 != jrVar.O && i9 != jrVar.J0 && i9 != jrVar.f39589o0 && i9 != jrVar.f39584l0) {
                    if (i9 != jrVar.X0 && i9 != jrVar.L0 && i9 != jrVar.N0 && i9 != jrVar.f39593q0 && i9 != jrVar.f39603u0 && i9 != jrVar.G0 && i9 != jrVar.I0 && i9 != jrVar.f39573f1 && i9 != jrVar.f39582k0 && i9 != jrVar.f39587n0) {
                        if (i9 == jrVar.Y0) {
                            return 4;
                        }
                        if (i9 == jrVar.f39611x0) {
                            return 6;
                        }
                        if (i9 != jrVar.f39564c0 && i9 != jrVar.f39566d0 && i9 != jrVar.f39578i0 && i9 != jrVar.f39569e0 && i9 != jrVar.f39572f0 && i9 != jrVar.P && i9 != jrVar.f39558a0 && i9 != jrVar.f39561b0 && i9 != jrVar.f39576h0 && i9 != jrVar.M0) {
                            if (i9 != jrVar.V0 && i9 != jrVar.P0 && i9 != jrVar.S0 && i9 != jrVar.f39565c1) {
                                if (i9 == jrVar.K0) {
                                    return 9;
                                }
                                if (i9 == jrVar.W0) {
                                    return 10;
                                }
                                if (i9 == jrVar.f39562b1) {
                                    return 11;
                                }
                                if (i9 != jrVar.f39601t0 && i9 != jrVar.F0 && i9 != jrVar.H0) {
                                    if (jrVar.o0(i9)) {
                                        return 13;
                                    }
                                    if (i9 == jrVar.Q) {
                                        return 14;
                                    }
                                    if (i9 == jrVar.O0) {
                                        return 15;
                                    }
                                    if (i9 != jrVar.f39567d1 && i9 != jrVar.f39570e1 && i9 != jrVar.f39580j0) {
                                        if (i9 != jrVar.m0) {
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
    public final void v(f2.q1 r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.er.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        int i10;
        boolean z10;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.Components.bv0 bv0Var;
        org.telegram.ui.Components.bv0 bv0Var2;
        int i11 = 2;
        int i12 = 0;
        Context context = this.f38018c;
        jr jrVar = this.d;
        switch (i9) {
            case 0:
                int i13 = jrVar.K;
                if (i13 != 0 && i13 != 3) {
                    i10 = 6;
                } else {
                    i10 = 7;
                }
                i11 = (i13 == 0 || i13 == 3) ? 6 : 6;
                if (jrVar.f39559a1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(i10, i11, this.f38018c, null, z10);
                b5Var.setDelegate(new dr(this, 0));
                bv0Var2 = b5Var;
                bv0Var = bv0Var2;
                break;
            case 1:
                bv0Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 2:
                bv0Var = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                bv0Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            case 4:
                org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
                if (jrVar.v) {
                    b9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    bv0Var = b9Var;
                    break;
                } else if (jrVar.f39607w) {
                    b9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    bv0Var = b9Var;
                    break;
                } else {
                    b9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    bv0Var = b9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f38018c, org.telegram.ui.ActionBar.f6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                bv0Var2 = m4Var;
                bv0Var = bv0Var2;
                break;
            case 6:
                bv0Var = new org.telegram.ui.Cells.ba(context);
                break;
            case 7:
            case 14:
                bv0Var = new org.telegram.ui.Cells.s8(context);
                break;
            case 8:
                b6Var = ((org.telegram.ui.ActionBar.o2) jrVar).resourceProvider;
                View v3Var = new org.telegram.ui.Cells.v3(context, 26, b6Var);
                v3Var.setBackground(null);
                bv0Var = v3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.bv0 bv0Var3 = new org.telegram.ui.Components.bv0(context, null);
                bv0Var3.b(jrVar.l1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                bv0Var3.setCallback(new dr(this, 1));
                bv0Var = bv0Var3;
                break;
            case 10:
                bv0Var = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
                e00Var.setIsSingleCell(true);
                e00Var.setViewType(6);
                e00Var.f27885w = false;
                e00Var.setUseHeaderOffset(false);
                e00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                f2.a1 a1Var = new f2.a1(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) a1Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) a1Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) a1Var).topMargin = AndroidUtilities.dp(30.0f);
                e00Var.setLayoutParams(a1Var);
                bv0Var = e00Var;
                break;
            case 12:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(23, this.f38018c, jrVar.getResourceProvider(), false, true);
                p8Var.v = 50;
                bv0Var = p8Var;
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.f38018c, jrVar.getResourceProvider(), false);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.f6.V6, org.telegram.ui.ActionBar.f6.f23056g7, org.telegram.ui.ActionBar.f6.f23128k7);
                z1Var.setEnabled(true);
                bv0Var = z1Var;
                break;
            case 15:
                org.telegram.ui.Components.bv0 bv0Var4 = new org.telegram.ui.Components.bv0(context, null);
                Drawable[] drawableArr = {jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i14 = jrVar.f39590o1;
                if (i14 > 0) {
                    i12 = i14 - 1;
                }
                bv0Var4.b(i12, drawableArr, "1", "2", "3", "4", "5");
                bv0Var4.setCallback(new dr(this, 2));
                bv0Var2 = bv0Var4;
                bv0Var = bv0Var2;
                break;
            case 16:
                bv0Var = new org.telegram.ui.Cells.t8(context, jrVar.getResourceProvider());
                break;
            case 17:
                bv0Var = new org.telegram.ui.Cells.x7(context, jrVar.getResourceProvider());
                break;
        }
        return new f2.q1(bv0Var);
    }
}
