package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class nr extends org.telegram.ui.Components.yl0 {
    public final Context f39023c;
    public final rr d;

    public nr(rr rrVar, Context context) {
        this.d = rrVar;
        this.f39023c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f46538a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nr.D(s4.c1):boolean");
    }

    public final TLObject E(int i10) {
        rr rrVar = this.d;
        int i11 = rrVar.E0;
        if (i10 >= i11 && i10 < rrVar.F0) {
            return (TLObject) rrVar.F.get(i10 - i11);
        }
        int i12 = rrVar.U0;
        if (i10 >= i12 && i10 < rrVar.V0) {
            return (TLObject) rrVar.H.get(i10 - i12);
        }
        int i13 = rrVar.X0;
        if (i10 >= i13 && i10 < rrVar.Y0) {
            return (TLObject) rrVar.G.get(i10 - i13);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.f40174d1;
    }

    @Override
    public final int j(int i10) {
        rr rrVar = this.d;
        if (i10 != rrVar.f40223z0 && i10 != rrVar.A0 && i10 != rrVar.f40212v0 && i10 != rrVar.f40208t0) {
            if ((i10 >= rrVar.E0 && i10 < rrVar.F0) || ((i10 >= rrVar.X0 && i10 < rrVar.Y0) || (i10 >= rrVar.U0 && i10 < rrVar.V0))) {
                return 0;
            }
            if (i10 != rrVar.C0 && i10 != rrVar.G0 && i10 != rrVar.H0) {
                if (i10 != rrVar.D0 && i10 != rrVar.S && i10 != rrVar.N0 && i10 != rrVar.f40206s0 && i10 != rrVar.f40198p0) {
                    if (i10 != rrVar.f40169b1 && i10 != rrVar.P0 && i10 != rrVar.R0 && i10 != rrVar.f40210u0 && i10 != rrVar.f40221y0 && i10 != rrVar.K0 && i10 != rrVar.M0 && i10 != rrVar.f40188j1 && i10 != rrVar.f40196o0 && i10 != rrVar.f40203r0) {
                        if (i10 == rrVar.f40172c1) {
                            return 4;
                        }
                        if (i10 == rrVar.B0) {
                            return 6;
                        }
                        if (i10 != rrVar.f40181g0 && i10 != rrVar.f40183h0 && i10 != rrVar.m0 && i10 != rrVar.f40185i0 && i10 != rrVar.f40187j0 && i10 != rrVar.T && i10 != rrVar.f40176e0 && i10 != rrVar.f40179f0 && i10 != rrVar.f40191l0 && i10 != rrVar.Q0) {
                            if (i10 != rrVar.Z0 && i10 != rrVar.T0 && i10 != rrVar.W0 && i10 != rrVar.f40182g1) {
                                if (i10 == rrVar.O0) {
                                    return 9;
                                }
                                if (i10 == rrVar.f40166a1) {
                                    return 10;
                                }
                                if (i10 == rrVar.f40180f1) {
                                    return 11;
                                }
                                if (i10 != rrVar.f40218x0 && i10 != rrVar.J0 && i10 != rrVar.L0) {
                                    if (rrVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == rrVar.U) {
                                        return 14;
                                    }
                                    if (i10 == rrVar.S0) {
                                        return 15;
                                    }
                                    if (i10 != rrVar.f40184h1 && i10 != rrVar.f40186i1 && i10 != rrVar.f40194n0) {
                                        if (i10 != rrVar.f40200q0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nr.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.Components.qw0 qw0Var;
        org.telegram.ui.Components.qw0 qw0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f39023c;
        rr rrVar = this.d;
        switch (i10) {
            case 0:
                int i14 = rrVar.O;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                i12 = (i14 == 0 || i14 == 3) ? 6 : 6;
                if (rrVar.f40177e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(i11, i12, this.f39023c, null, z10);
                b5Var.setDelegate(new mr(this, 0));
                qw0Var2 = b5Var;
                qw0Var = qw0Var2;
                break;
            case 1:
                qw0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
                qw0Var = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                qw0Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
                if (rrVar.v) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    qw0Var = e9Var;
                    break;
                } else if (rrVar.f40214w) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    qw0Var = e9Var;
                    break;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    qw0Var = e9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f39023c, org.telegram.ui.ActionBar.i6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                qw0Var2 = m4Var;
                qw0Var = qw0Var2;
                break;
            case 6:
                qw0Var = new org.telegram.ui.Cells.ea(context);
                break;
            case 7:
            case 14:
                qw0Var = new org.telegram.ui.Cells.v8(context);
                break;
            case 8:
                d6Var = ((org.telegram.ui.ActionBar.n2) rrVar).resourceProvider;
                View v3Var = new org.telegram.ui.Cells.v3(context, 26, d6Var);
                v3Var.setBackground(null);
                qw0Var = v3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.qw0 qw0Var3 = new org.telegram.ui.Components.qw0(context, null);
                qw0Var3.b(rrVar.f40199p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                qw0Var3.setCallback(new mr(this, 1));
                qw0Var = qw0Var3;
                break;
            case 10:
                qw0Var = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(context, null);
                w00Var.setIsSingleCell(true);
                w00Var.setViewType(6);
                w00Var.f32460w = false;
                w00Var.setUseHeaderOffset(false);
                w00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.p0 p0Var = new s4.p0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(30.0f);
                w00Var.setLayoutParams(p0Var);
                qw0Var = w00Var;
                break;
            case 12:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, this.f39023c, rrVar.getResourceProvider(), false, true);
                r8Var.v = 50;
                qw0Var = r8Var;
                break;
            case 13:
                org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(4, 21, this.f39023c, rrVar.getResourceProvider(), false);
                a2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.i6.V6, org.telegram.ui.ActionBar.i6.f20883g7, org.telegram.ui.ActionBar.i6.f20957k7);
                a2Var.setEnabled(true);
                qw0Var = a2Var;
                break;
            case 15:
                org.telegram.ui.Components.qw0 qw0Var4 = new org.telegram.ui.Components.qw0(context, null);
                Drawable[] drawableArr = {rrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), rrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), rrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), rrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), rrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = rrVar.f40207s1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                qw0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                qw0Var4.setCallback(new mr(this, 2));
                qw0Var2 = qw0Var4;
                qw0Var = qw0Var2;
                break;
            case 16:
                qw0Var = new org.telegram.ui.Cells.w8(context, rrVar.getResourceProvider());
                break;
            case 17:
                qw0Var = new org.telegram.ui.Cells.z7(context, rrVar.getResourceProvider());
                break;
        }
        return new s4.c1(qw0Var);
    }
}
