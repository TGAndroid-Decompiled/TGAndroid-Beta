package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class nr extends org.telegram.ui.Components.ql0 {
    public final Context f36575c;
    public final rr d;

    public nr(rr rrVar, Context context) {
        this.d = rrVar;
        this.f36575c = context;
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(f2.l1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nr.D(f2.l1):boolean");
    }

    public final TLObject E(int i10) {
        rr rrVar = this.d;
        int i11 = rrVar.B0;
        if (i10 >= i11 && i10 < rrVar.C0) {
            return (TLObject) rrVar.C.get(i10 - i11);
        }
        int i12 = rrVar.R0;
        if (i10 >= i12 && i10 < rrVar.S0) {
            return (TLObject) rrVar.E.get(i10 - i12);
        }
        int i13 = rrVar.U0;
        if (i10 >= i13 && i10 < rrVar.V0) {
            return (TLObject) rrVar.D.get(i10 - i13);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.f37957a1;
    }

    @Override
    public final int j(int i10) {
        rr rrVar = this.d;
        if (i10 != rrVar.f38005w0 && i10 != rrVar.f38008x0 && i10 != rrVar.f37996s0 && i10 != rrVar.f37990q0) {
            if ((i10 >= rrVar.B0 && i10 < rrVar.C0) || ((i10 >= rrVar.U0 && i10 < rrVar.V0) || (i10 >= rrVar.R0 && i10 < rrVar.S0))) {
                return 0;
            }
            if (i10 != rrVar.f38013z0 && i10 != rrVar.D0 && i10 != rrVar.E0) {
                if (i10 != rrVar.A0 && i10 != rrVar.P && i10 != rrVar.K0 && i10 != rrVar.f37988p0 && i10 != rrVar.m0) {
                    if (i10 != rrVar.Y0 && i10 != rrVar.M0 && i10 != rrVar.O0 && i10 != rrVar.f37993r0 && i10 != rrVar.f38002v0 && i10 != rrVar.H0 && i10 != rrVar.J0 && i10 != rrVar.f37972g1 && i10 != rrVar.f37981l0 && i10 != rrVar.f37986o0) {
                        if (i10 == rrVar.Z0) {
                            return 4;
                        }
                        if (i10 == rrVar.f38011y0) {
                            return 6;
                        }
                        if (i10 != rrVar.f37964d0 && i10 != rrVar.f37966e0 && i10 != rrVar.f37977j0 && i10 != rrVar.f37969f0 && i10 != rrVar.f37971g0 && i10 != rrVar.Q && i10 != rrVar.f37959b0 && i10 != rrVar.f37962c0 && i10 != rrVar.f37975i0 && i10 != rrVar.N0) {
                            if (i10 != rrVar.W0 && i10 != rrVar.Q0 && i10 != rrVar.T0 && i10 != rrVar.f37965d1) {
                                if (i10 == rrVar.L0) {
                                    return 9;
                                }
                                if (i10 == rrVar.X0) {
                                    return 10;
                                }
                                if (i10 == rrVar.f37963c1) {
                                    return 11;
                                }
                                if (i10 != rrVar.f38000u0 && i10 != rrVar.G0 && i10 != rrVar.I0) {
                                    if (rrVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == rrVar.R) {
                                        return 14;
                                    }
                                    if (i10 == rrVar.P0) {
                                        return 15;
                                    }
                                    if (i10 != rrVar.f37967e1 && i10 != rrVar.f37970f1 && i10 != rrVar.f37979k0) {
                                        if (i10 != rrVar.f37984n0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nr.v(f2.l1, int):void");
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
        Context context = this.f36575c;
        rr rrVar = this.d;
        switch (i10) {
            case 0:
                int i14 = rrVar.L;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                i12 = (i14 == 0 || i14 == 3) ? 6 : 6;
                if (rrVar.f37960b1 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(i11, i12, this.f36575c, null, z4);
                a5Var.setDelegate(new mr(this, 0));
                uv0Var2 = a5Var;
                uv0Var = uv0Var2;
                break;
            case 1:
                uv0Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 2:
                uv0Var = new org.telegram.ui.Cells.x4(context);
                break;
            case 3:
                uv0Var = new org.telegram.ui.Cells.y6(context, (b) null);
                break;
            case 4:
                org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
                if (rrVar.v) {
                    z8Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    uv0Var = z8Var;
                    break;
                } else if (rrVar.f38004w) {
                    z8Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    uv0Var = z8Var;
                    break;
                } else {
                    z8Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    uv0Var = z8Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.f36575c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
                l4Var.setHeight(43);
                uv0Var2 = l4Var;
                uv0Var = uv0Var2;
                break;
            case 6:
                uv0Var = new org.telegram.ui.Cells.z9(context);
                break;
            case 7:
            case 14:
                uv0Var = new org.telegram.ui.Cells.q8(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.p2) rrVar).resourceProvider;
                View t3Var = new org.telegram.ui.Cells.t3(context, 26, f6Var);
                t3Var.setBackground(null);
                uv0Var = t3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.uv0 uv0Var3 = new org.telegram.ui.Components.uv0(context, null);
                uv0Var3.b(rrVar.f37982m1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                uv0Var3.setCallback(new mr(this, 1));
                uv0Var = uv0Var3;
                break;
            case 10:
                uv0Var = new org.telegram.ui.Cells.r4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(6);
                u00Var.f29071w = false;
                u00Var.setUseHeaderOffset(false);
                u00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                f2.w0 w0Var = new f2.w0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) w0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) w0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) w0Var).topMargin = AndroidUtilities.dp(30.0f);
                u00Var.setLayoutParams(w0Var);
                uv0Var = u00Var;
                break;
            case 12:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(23, this.f36575c, rrVar.getResourceProvider(), false, true);
                n8Var.v = 50;
                uv0Var = n8Var;
                break;
            case 13:
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(4, 21, this.f36575c, rrVar.getResourceProvider(), false);
                y1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                y1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f19936g7, org.telegram.ui.ActionBar.j6.f20007k7);
                y1Var.setEnabled(true);
                uv0Var = y1Var;
                break;
            case 15:
                org.telegram.ui.Components.uv0 uv0Var4 = new org.telegram.ui.Components.uv0(context, null);
                Drawable[] drawableArr = {rrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), rrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), rrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), rrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), rrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = rrVar.f37989p1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                uv0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                uv0Var4.setCallback(new mr(this, 2));
                uv0Var2 = uv0Var4;
                uv0Var = uv0Var2;
                break;
            case 16:
                uv0Var = new org.telegram.ui.Cells.r8(context, rrVar.getResourceProvider());
                break;
            case 17:
                uv0Var = new org.telegram.ui.Cells.w7(context, rrVar.getResourceProvider());
                break;
        }
        return new f2.l1(uv0Var);
    }
}
