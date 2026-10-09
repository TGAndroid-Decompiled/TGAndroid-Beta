package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class pr extends org.telegram.ui.Components.pm0 {
    public final Context f40871c;
    public final tr d;

    public pr(tr trVar, Context context) {
        this.d = trVar;
        this.f40871c = context;
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47658a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pr.D(s4.d1):boolean");
    }

    public final TLObject E(int i10) {
        tr trVar = this.d;
        int i11 = trVar.E0;
        if (i10 >= i11 && i10 < trVar.F0) {
            return (TLObject) trVar.F.get(i10 - i11);
        }
        int i12 = trVar.U0;
        if (i10 >= i12 && i10 < trVar.V0) {
            return (TLObject) trVar.H.get(i10 - i12);
        }
        int i13 = trVar.X0;
        if (i10 >= i13 && i10 < trVar.Y0) {
            return (TLObject) trVar.G.get(i10 - i13);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.f42062d1;
    }

    @Override
    public final int j(int i10) {
        tr trVar = this.d;
        if (i10 != trVar.f42111z0 && i10 != trVar.A0 && i10 != trVar.f42100v0 && i10 != trVar.f42096t0) {
            if ((i10 >= trVar.E0 && i10 < trVar.F0) || ((i10 >= trVar.X0 && i10 < trVar.Y0) || (i10 >= trVar.U0 && i10 < trVar.V0))) {
                return 0;
            }
            if (i10 != trVar.C0 && i10 != trVar.G0 && i10 != trVar.H0) {
                if (i10 != trVar.D0 && i10 != trVar.S && i10 != trVar.N0 && i10 != trVar.f42094s0 && i10 != trVar.f42086p0) {
                    if (i10 != trVar.f42057b1 && i10 != trVar.P0 && i10 != trVar.R0 && i10 != trVar.f42098u0 && i10 != trVar.f42109y0 && i10 != trVar.K0 && i10 != trVar.M0 && i10 != trVar.f42076j1 && i10 != trVar.f42084o0 && i10 != trVar.f42091r0) {
                        if (i10 == trVar.f42060c1) {
                            return 4;
                        }
                        if (i10 == trVar.B0) {
                            return 6;
                        }
                        if (i10 != trVar.f42069g0 && i10 != trVar.f42071h0 && i10 != trVar.m0 && i10 != trVar.f42073i0 && i10 != trVar.f42075j0 && i10 != trVar.T && i10 != trVar.f42064e0 && i10 != trVar.f42067f0 && i10 != trVar.f42079l0 && i10 != trVar.Q0) {
                            if (i10 != trVar.Z0 && i10 != trVar.T0 && i10 != trVar.W0 && i10 != trVar.f42070g1) {
                                if (i10 == trVar.O0) {
                                    return 9;
                                }
                                if (i10 == trVar.f42054a1) {
                                    return 10;
                                }
                                if (i10 == trVar.f42068f1) {
                                    return 11;
                                }
                                if (i10 != trVar.f42106x0 && i10 != trVar.J0 && i10 != trVar.L0) {
                                    if (trVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == trVar.U) {
                                        return 14;
                                    }
                                    if (i10 == trVar.S0) {
                                        return 15;
                                    }
                                    if (i10 != trVar.f42072h1 && i10 != trVar.f42074i1 && i10 != trVar.f42082n0) {
                                        if (i10 != trVar.f42088q0) {
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
    public final void v(s4.d1 r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pr.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.Components.ww0 ww0Var;
        org.telegram.ui.Components.ww0 ww0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f40871c;
        tr trVar = this.d;
        switch (i10) {
            case 0:
                int i14 = trVar.O;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                if (i14 == 0 || i14 == 3) {
                    i12 = 6;
                }
                if (trVar.f42065e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(i11, i12, this.f40871c, null, z10);
                b5Var.setDelegate(new or(this, 0));
                ww0Var2 = b5Var;
                ww0Var = ww0Var2;
                break;
            case 1:
                ww0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
                ww0Var = new org.telegram.ui.Cells.y4(context);
                break;
            case 3:
                ww0Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
                if (trVar.v) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    ww0Var = e9Var;
                    break;
                } else if (trVar.f42102w) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    ww0Var = e9Var;
                    break;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    ww0Var = e9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f40871c, org.telegram.ui.ActionBar.i6.L6, 21, 11, false, null);
                m4Var.setHeight(43);
                ww0Var2 = m4Var;
                ww0Var = ww0Var2;
                break;
            case 6:
                ww0Var = new org.telegram.ui.Cells.ca(context);
                break;
            case 7:
            case 14:
                ww0Var = new org.telegram.ui.Cells.v8(context);
                break;
            case 8:
                e6Var = ((org.telegram.ui.ActionBar.n2) trVar).resourceProvider;
                View v3Var = new org.telegram.ui.Cells.v3(context, 26, e6Var);
                v3Var.setBackground(null);
                ww0Var = v3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.ww0 ww0Var3 = new org.telegram.ui.Components.ww0(context, null);
                ww0Var3.b(trVar.f42087p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                ww0Var3.setCallback(new or(this, 1));
                ww0Var = ww0Var3;
                break;
            case 10:
                ww0Var = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, null);
                j10Var.setIsSingleCell(true);
                j10Var.setViewType(6);
                j10Var.f27555w = false;
                j10Var.setUseHeaderOffset(false);
                j10Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.q0 q0Var = new s4.q0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) q0Var).topMargin = AndroidUtilities.dp(30.0f);
                j10Var.setLayoutParams(q0Var);
                ww0Var = j10Var;
                break;
            case 12:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, this.f40871c, trVar.getResourceProvider(), false, true);
                r8Var.v = 50;
                ww0Var = r8Var;
                break;
            case 13:
                org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(4, 21, this.f40871c, trVar.getResourceProvider(), false);
                a2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.i6.V6, org.telegram.ui.ActionBar.i6.f20854g7, org.telegram.ui.ActionBar.i6.f20926k7);
                a2Var.setEnabled(true);
                ww0Var = a2Var;
                break;
            case 15:
                org.telegram.ui.Components.ww0 ww0Var4 = new org.telegram.ui.Components.ww0(context, null);
                Drawable[] drawableArr = {trVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), trVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), trVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), trVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), trVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = trVar.f42095s1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                ww0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                ww0Var4.setCallback(new or(this, 2));
                ww0Var2 = ww0Var4;
                ww0Var = ww0Var2;
                break;
            case 16:
                ww0Var = new org.telegram.ui.Cells.w8(context, trVar.getResourceProvider());
                break;
            case 17:
                ww0Var = new org.telegram.ui.Cells.z7(context, trVar.getResourceProvider());
                break;
        }
        return new s4.d1(ww0Var);
    }
}
