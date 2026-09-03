package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
public final class mr extends org.telegram.ui.Components.rl0 {
    public final Context f39062c;
    public final qr d;

    public mr(qr qrVar, Context context) {
        this.d = qrVar;
        this.f39062c = context;
    }

    @Override
    public final void A(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.m1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mr.D(f2.m1):boolean");
    }

    public final TLObject E(int i10) {
        qr qrVar = this.d;
        int i11 = qrVar.B0;
        if (i10 >= i11 && i10 < qrVar.C0) {
            return (TLObject) qrVar.C.get(i10 - i11);
        }
        int i12 = qrVar.R0;
        if (i10 >= i12 && i10 < qrVar.S0) {
            return (TLObject) qrVar.E.get(i10 - i12);
        }
        int i13 = qrVar.U0;
        if (i10 >= i13 && i10 < qrVar.V0) {
            return (TLObject) qrVar.D.get(i10 - i13);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.f40569a1;
    }

    @Override
    public final int j(int i10) {
        qr qrVar = this.d;
        if (i10 != qrVar.f40618w0 && i10 != qrVar.f40621x0 && i10 != qrVar.f40609s0 && i10 != qrVar.f40603q0) {
            if ((i10 >= qrVar.B0 && i10 < qrVar.C0) || ((i10 >= qrVar.U0 && i10 < qrVar.V0) || (i10 >= qrVar.R0 && i10 < qrVar.S0))) {
                return 0;
            }
            if (i10 != qrVar.f40626z0 && i10 != qrVar.D0 && i10 != qrVar.E0) {
                if (i10 != qrVar.A0 && i10 != qrVar.P && i10 != qrVar.K0 && i10 != qrVar.f40601p0 && i10 != qrVar.m0) {
                    if (i10 != qrVar.Y0 && i10 != qrVar.M0 && i10 != qrVar.O0 && i10 != qrVar.f40606r0 && i10 != qrVar.f40615v0 && i10 != qrVar.H0 && i10 != qrVar.J0 && i10 != qrVar.f40585g1 && i10 != qrVar.f40594l0 && i10 != qrVar.f40599o0) {
                        if (i10 == qrVar.Z0) {
                            return 4;
                        }
                        if (i10 == qrVar.f40624y0) {
                            return 6;
                        }
                        if (i10 != qrVar.f40576d0 && i10 != qrVar.f40579e0 && i10 != qrVar.f40590j0 && i10 != qrVar.f40582f0 && i10 != qrVar.f40584g0 && i10 != qrVar.Q && i10 != qrVar.f40571b0 && i10 != qrVar.f40574c0 && i10 != qrVar.f40588i0 && i10 != qrVar.N0) {
                            if (i10 != qrVar.W0 && i10 != qrVar.Q0 && i10 != qrVar.T0 && i10 != qrVar.f40577d1) {
                                if (i10 == qrVar.L0) {
                                    return 9;
                                }
                                if (i10 == qrVar.X0) {
                                    return 10;
                                }
                                if (i10 == qrVar.f40575c1) {
                                    return 11;
                                }
                                if (i10 != qrVar.f40613u0 && i10 != qrVar.G0 && i10 != qrVar.I0) {
                                    if (qrVar.p0(i10)) {
                                        return 13;
                                    }
                                    if (i10 == qrVar.R) {
                                        return 14;
                                    }
                                    if (i10 == qrVar.P0) {
                                        return 15;
                                    }
                                    if (i10 != qrVar.f40580e1 && i10 != qrVar.f40583f1 && i10 != qrVar.f40592k0) {
                                        if (i10 != qrVar.f40597n0) {
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
    public final void v(f2.m1 r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mr.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        int i11;
        boolean z4;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.Components.uv0 uv0Var;
        org.telegram.ui.Components.uv0 uv0Var2;
        int i12 = 2;
        int i13 = 0;
        Context context = this.f39062c;
        qr qrVar = this.d;
        switch (i10) {
            case 0:
                int i14 = qrVar.L;
                if (i14 != 0 && i14 != 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                }
                i12 = (i14 == 0 || i14 == 3) ? 6 : 6;
                if (qrVar.f40572b1 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(i11, i12, this.f39062c, null, z4);
                b5Var.setDelegate(new lr(this, 0));
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
                if (qrVar.v) {
                    a9Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    uv0Var = a9Var;
                    break;
                } else if (qrVar.f40617w) {
                    a9Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    uv0Var = a9Var;
                    break;
                } else {
                    a9Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    uv0Var = a9Var;
                    break;
                }
            case 5:
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f39062c, org.telegram.ui.ActionBar.k6.L6, 21, 11, false, null);
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
                g6Var = ((org.telegram.ui.ActionBar.p2) qrVar).resourceProvider;
                View u3Var = new org.telegram.ui.Cells.u3(context, 26, g6Var);
                u3Var.setBackground(null);
                uv0Var = u3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.uv0 uv0Var3 = new org.telegram.ui.Components.uv0(context, null);
                uv0Var3.b(qrVar.f40595m1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                uv0Var3.setCallback(new lr(this, 1));
                uv0Var = uv0Var3;
                break;
            case 10:
                uv0Var = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(6);
                u00Var.f31465w = false;
                u00Var.setUseHeaderOffset(false);
                u00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                f2.x0 x0Var = new f2.x0(-1, -1);
                int dp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) x0Var).rightMargin = dp;
                ((ViewGroup.MarginLayoutParams) x0Var).leftMargin = dp;
                ((ViewGroup.MarginLayoutParams) x0Var).topMargin = AndroidUtilities.dp(30.0f);
                u00Var.setLayoutParams(x0Var);
                uv0Var = u00Var;
                break;
            case 12:
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(23, this.f39062c, qrVar.getResourceProvider(), false, true);
                o8Var.v = 50;
                uv0Var = o8Var;
                break;
            case 13:
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(4, 21, this.f39062c, qrVar.getResourceProvider(), false);
                z1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.f21717g7, org.telegram.ui.ActionBar.k6.f21788k7);
                z1Var.setEnabled(true);
                uv0Var = z1Var;
                break;
            case 15:
                org.telegram.ui.Components.uv0 uv0Var4 = new org.telegram.ui.Components.uv0(context, null);
                Drawable[] drawableArr = {qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), qrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i15 = qrVar.f40602p1;
                if (i15 > 0) {
                    i13 = i15 - 1;
                }
                uv0Var4.b(i13, drawableArr, "1", "2", "3", "4", "5");
                uv0Var4.setCallback(new lr(this, 2));
                uv0Var2 = uv0Var4;
                uv0Var = uv0Var2;
                break;
            case 16:
                uv0Var = new org.telegram.ui.Cells.s8(context, qrVar.getResourceProvider());
                break;
            case 17:
                uv0Var = new org.telegram.ui.Cells.x7(context, qrVar.getResourceProvider());
                break;
        }
        return new f2.m1(uv0Var);
    }
}
