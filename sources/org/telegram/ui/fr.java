package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class fr extends org.telegram.ui.Components.km0 {
    public final Context f37375c;
    public final jr d;

    public fr(jr jrVar, Context context) {
        this.d = jrVar;
        this.f37375c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f46342a;
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
        return this.d.f38626d1;
    }

    @Override
    public final int j(int i10) {
        jr jrVar = this.d;
        if (i10 != jrVar.f38674z0 && i10 != jrVar.A0 && i10 != jrVar.f38663v0 && i10 != jrVar.f38659t0) {
            if ((i10 >= jrVar.E0 && i10 < jrVar.F0) || ((i10 >= jrVar.X0 && i10 < jrVar.Y0) || (i10 >= jrVar.U0 && i10 < jrVar.V0))) {
                return 0;
            }
            if (i10 != jrVar.C0 && i10 != jrVar.G0 && i10 != jrVar.H0) {
                if (i10 != jrVar.D0 && i10 != jrVar.S && i10 != jrVar.N0 && i10 != jrVar.f38657s0 && i10 != jrVar.f38649p0) {
                    if (i10 != jrVar.f38621b1 && i10 != jrVar.P0 && i10 != jrVar.R0 && i10 != jrVar.f38661u0 && i10 != jrVar.f38672y0 && i10 != jrVar.K0 && i10 != jrVar.M0 && i10 != jrVar.f38639j1 && i10 != jrVar.f38647o0 && i10 != jrVar.f38654r0) {
                        if (i10 == jrVar.f38624c1) {
                            return 4;
                        }
                        if (i10 == jrVar.B0) {
                            return 6;
                        }
                        if (i10 != jrVar.f38632g0 && i10 != jrVar.f38634h0 && i10 != jrVar.m0 && i10 != jrVar.f38636i0 && i10 != jrVar.f38638j0 && i10 != jrVar.T && i10 != jrVar.f38627e0 && i10 != jrVar.f38630f0 && i10 != jrVar.f38642l0 && i10 != jrVar.Q0) {
                            if (i10 != jrVar.Z0 && i10 != jrVar.T0 && i10 != jrVar.W0 && i10 != jrVar.f38633g1) {
                                if (i10 == jrVar.O0) {
                                    return 9;
                                }
                                if (i10 == jrVar.f38618a1) {
                                    return 10;
                                }
                                if (i10 == jrVar.f38631f1) {
                                    return 11;
                                }
                                if (i10 != jrVar.f38669x0 && i10 != jrVar.J0 && i10 != jrVar.L0) {
                                    if (jrVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == jrVar.U) {
                                        return 14;
                                    }
                                    if (i10 == jrVar.S0) {
                                        return 15;
                                    }
                                    if (i10 != jrVar.f38635h1 && i10 != jrVar.f38637i1 && i10 != jrVar.f38645n0) {
                                        if (i10 != jrVar.f38651q0) {
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
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.Components.rw0 rw0Var;
        org.telegram.ui.Components.rw0 rw0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f37375c;
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
                if (jrVar.f38628e1 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(i11, i12, this.f37375c, null, z10);
                a5Var.setDelegate(new er(this, 0));
                rw0Var2 = a5Var;
                rw0Var = rw0Var2;
                break;
            case 1:
                rw0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
                rw0Var = new org.telegram.ui.Cells.x4(context);
                break;
            case 3:
                rw0Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                break;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
                if (jrVar.v) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    rw0Var = e9Var;
                    break;
                } else if (jrVar.f38665w) {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    rw0Var = e9Var;
                    break;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    rw0Var = e9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.f37375c, org.telegram.ui.ActionBar.k6.L6, 21, 11, false, null);
                l4Var.setHeight(43);
                rw0Var2 = l4Var;
                rw0Var = rw0Var2;
                break;
            case 6:
                rw0Var = new org.telegram.ui.Cells.ca(context);
                break;
            case 7:
            case 14:
                rw0Var = new org.telegram.ui.Cells.v8(context);
                break;
            case 8:
                g6Var = ((org.telegram.ui.ActionBar.o2) jrVar).resourceProvider;
                View u3Var = new org.telegram.ui.Cells.u3(context, 26, g6Var);
                u3Var.setBackground(null);
                rw0Var = u3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.rw0 rw0Var3 = new org.telegram.ui.Components.rw0(context, null);
                rw0Var3.b(jrVar.f38650p1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                rw0Var3.setCallback(new er(this, 1));
                rw0Var = rw0Var3;
                break;
            case 10:
                rw0Var = new org.telegram.ui.Cells.r4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00(context, null);
                z00Var.setIsSingleCell(true);
                z00Var.setViewType(6);
                z00Var.f33104w = false;
                z00Var.setUseHeaderOffset(false);
                z00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                s4.o0 o0Var = new s4.o0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) o0Var).topMargin = AndroidUtilities.dp(30.0f);
                z00Var.setLayoutParams(o0Var);
                rw0Var = z00Var;
                break;
            case 12:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, this.f37375c, jrVar.getResourceProvider(), false, true);
                r8Var.v = 50;
                rw0Var = r8Var;
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.f37375c, jrVar.getResourceProvider(), false);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.f21238g7, org.telegram.ui.ActionBar.k6.f21312k7);
                z1Var.setEnabled(true);
                rw0Var = z1Var;
                break;
            case 15:
                org.telegram.ui.Components.rw0 rw0Var4 = new org.telegram.ui.Components.rw0(context, null);
                Drawable[] drawableArr = {jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), jrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = jrVar.f38658s1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                rw0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                rw0Var4.setCallback(new er(this, 2));
                rw0Var2 = rw0Var4;
                rw0Var = rw0Var2;
                break;
            case 16:
                rw0Var = new org.telegram.ui.Cells.w8(context, jrVar.getResourceProvider());
                break;
            case 17:
                rw0Var = new org.telegram.ui.Cells.y7(context, jrVar.getResourceProvider());
                break;
        }
        return new s4.b1(rw0Var);
    }
}
