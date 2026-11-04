package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class bw0 extends org.telegram.ui.Components.sj0 {
    public final Context f44156c;
    public final HashMap d = new HashMap();
    public final ProfileActivity f44157e;

    public bw0(ProfileActivity profileActivity, Context context) {
        this.f44157e = profileActivity;
        this.f44156c = context;
    }

    @Override
    public final void A(u4.d1 d1Var) {
        int b10 = d1Var.b();
        ProfileActivity profileActivity = this.f44157e;
        if (b10 == profileActivity.O2) {
            profileActivity.M2 = null;
        }
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        ProfileActivity profileActivity = this.f44157e;
        if (profileActivity.f41761f3 != -1) {
            int b10 = d1Var.b();
            if (b10 != profileActivity.f41761f3 && b10 != profileActivity.T2 && b10 != profileActivity.f41775h3 && b10 != profileActivity.f41768g3 && b10 != profileActivity.V2 && b10 != profileActivity.W2 && b10 != profileActivity.f41900z3 && b10 != profileActivity.i3 && b10 != profileActivity.f41788j3 && b10 != profileActivity.f41834q3 && b10 != profileActivity.f41814n3 && b10 != profileActivity.f41794k3 && b10 != profileActivity.f41806m3 && b10 != profileActivity.f41842r3 && b10 != profileActivity.f41849s3 && b10 != profileActivity.f41869v3 && b10 != profileActivity.f41877w3 && b10 != profileActivity.f41885x3 && b10 != profileActivity.f41893y3 && b10 != profileActivity.O2 && b10 != profileActivity.f41724a4 && b10 != profileActivity.f41739c4 && b10 != profileActivity.f41769g4 && b10 != profileActivity.f41762f4 && b10 != profileActivity.f41801l3 && b10 != profileActivity.U2 && b10 != profileActivity.Q2 && b10 != profileActivity.f41746d4 && b10 != profileActivity.f41754e4 && b10 != profileActivity.f41802l4) {
                return false;
            }
        } else {
            View view = d1Var.f55540a;
            if (view instanceof org.telegram.ui.Cells.pa) {
                Object currentObject = ((org.telegram.ui.Cells.pa) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && org.telegram.messenger.l10.B((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i3 = d1Var.f55544f;
            if (i3 == 1 || i3 == 5 || i3 == 7 || i3 == 11 || i3 == 31 || i3 == 28 || i3 == 12 || i3 == 13 || i3 == 9 || i3 == 10 || i3 == 25 || i3 == 32) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.CharSequence E(java.lang.String r7, java.util.ArrayList r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bw0.E(java.lang.String, java.util.ArrayList, java.lang.String):java.lang.CharSequence");
    }

    @Override
    public final int b() {
        return this.f44157e.N2;
    }

    @Override
    public final int d(int i3) {
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.f44157e;
        if (i3 != profileActivity.D3 && i3 != profileActivity.f41856t4 && i3 != profileActivity.f41753e3 && i3 != profileActivity.S2 && i3 != profileActivity.f41827p3 && i3 != profileActivity.f41862u3 && i3 != profileActivity.n4) {
            if (i3 != profileActivity.G3 && i3 != profileActivity.I3 && i3 != profileActivity.T2 && i3 != profileActivity.U2) {
                if (i3 != profileActivity.L3 && i3 != profileActivity.V2) {
                    if (i3 == profileActivity.H3) {
                        return 30;
                    }
                    if (i3 != profileActivity.J3 && i3 != profileActivity.K3 && i3 != profileActivity.W2) {
                        if (i3 != profileActivity.f41835q4 && i3 != profileActivity.f41843r4 && i3 != profileActivity.V3 && i3 != profileActivity.X3 && i3 != profileActivity.W3 && i3 != profileActivity.f41886x4 && i3 != profileActivity.f41894y4 && i3 != profileActivity.f41901z4 && i3 != profileActivity.A4 && i3 != profileActivity.G4 && i3 != profileActivity.f41878w4 && i3 != profileActivity.M4 && i3 != profileActivity.L4 && i3 != profileActivity.U3 && i3 != profileActivity.f41761f3 && i3 != profileActivity.f41775h3 && i3 != profileActivity.f41768g3 && i3 != profileActivity.i3 && i3 != profileActivity.f41788j3 && i3 != profileActivity.f41834q3 && i3 != profileActivity.f41814n3 && i3 != profileActivity.f41794k3 && i3 != profileActivity.f41806m3 && i3 != profileActivity.f41842r3 && i3 != profileActivity.f41849s3 && i3 != profileActivity.f41869v3 && i3 != profileActivity.f41877w3 && i3 != profileActivity.f41885x3 && i3 != profileActivity.f41893y3 && i3 != profileActivity.O2 && i3 != profileActivity.f41724a4 && i3 != profileActivity.Z3 && i3 != profileActivity.f41801l3 && i3 != profileActivity.f41769g4 && i3 != profileActivity.f41762f4 && i3 != profileActivity.B4 && i3 != profileActivity.C4 && i3 != profileActivity.D4) {
                            i10 = profileActivity.botPermissionLocation;
                            if (i3 != i10) {
                                i11 = profileActivity.botPermissionBiometry;
                                if (i3 != i11) {
                                    i12 = profileActivity.botPermissionEmojiStatus;
                                    if (i3 != i12 && i3 != profileActivity.f41754e4) {
                                        if (i3 == profileActivity.M3) {
                                            return 5;
                                        }
                                        if (i3 == profileActivity.N3) {
                                            return 6;
                                        }
                                        if (i3 == profileActivity.Q3) {
                                            return 20;
                                        }
                                        if (i3 != profileActivity.N4 && i3 != profileActivity.H4 && i3 != profileActivity.f41807m4 && i3 != profileActivity.f41850s4 && i3 != profileActivity.f41745d3 && i3 != profileActivity.f41820o3 && i3 != profileActivity.f41855t3 && i3 != profileActivity.P2 && i3 != profileActivity.f41731b3 && i3 != profileActivity.X2 && i3 != profileActivity.f41776h4 && i3 != profileActivity.Y3 && i3 != profileActivity.R2 && i3 != profileActivity.Z2 && i3 != profileActivity.F4 && i3 != profileActivity.f41828p4 && i3 != profileActivity.E4 && i3 != profileActivity.f41795k4) {
                                            if (i3 >= profileActivity.f41863u4 && i3 < profileActivity.f41870v4) {
                                                return 8;
                                            }
                                            if (i3 == profileActivity.A3) {
                                                return 11;
                                            }
                                            if (i3 == profileActivity.B3) {
                                                return 31;
                                            }
                                            if (i3 == profileActivity.C3) {
                                                return 12;
                                            }
                                            if (i3 == profileActivity.K4) {
                                                return 13;
                                            }
                                            if (i3 == profileActivity.f41900z3) {
                                                return 14;
                                            }
                                            if (i3 != profileActivity.f41738c3 && i3 != profileActivity.f41723a3 && i3 != profileActivity.Y2) {
                                                if (i3 == profileActivity.f41732b4) {
                                                    return 17;
                                                }
                                                if (i3 == profileActivity.f41739c4) {
                                                    return 18;
                                                }
                                                if (i3 == profileActivity.f41746d4) {
                                                    return 24;
                                                }
                                                if (i3 == profileActivity.P3) {
                                                    return 21;
                                                }
                                                if (i3 == profileActivity.O3) {
                                                    return 22;
                                                }
                                                if (i3 == profileActivity.Q2) {
                                                    return 23;
                                                }
                                                if (i3 == profileActivity.f41782i4) {
                                                    return 25;
                                                }
                                                if (i3 != profileActivity.R3 && i3 != profileActivity.T3) {
                                                    if (i3 == profileActivity.f41789j4) {
                                                        return 32;
                                                    }
                                                    if (i3 == profileActivity.f41802l4) {
                                                        return 33;
                                                    }
                                                    if (i3 == profileActivity.S3) {
                                                        return 27;
                                                    }
                                                    if (i3 != profileActivity.E3 && i3 != profileActivity.F3) {
                                                        return 0;
                                                    }
                                                    return 28;
                                                }
                                                return 26;
                                            }
                                            return 15;
                                        }
                                        return 7;
                                    }
                                    return 4;
                                }
                                return 4;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 19;
            }
            return 2;
        }
        return 1;
    }

    @Override
    public final void t(u4.d1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bw0.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        boolean z10;
        boolean z11;
        int i10;
        wv0 paVar;
        float f10;
        View yv0Var;
        int i11 = 1;
        boolean z12 = false;
        Context context = this.f44156c;
        ProfileActivity profileActivity = this.f44157e;
        switch (i3) {
            case 1:
                paVar = new org.telegram.ui.Cells.n4(this.f44156c, org.telegram.ui.ActionBar.k6.L6, 18, 7, false, profileActivity.A0);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.e6 e6Var = profileActivity.A0;
                if (i3 == 30) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (i3 == 19) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                vv0 vv0Var = new vv0(this, this.f44156c, e6Var, z12, z11);
                vv0Var.setContentDescriptionValueFirst(true);
                paVar = vv0Var;
                break;
            case 3:
                wv0 wv0Var = new wv0(this, context, profileActivity, profileActivity.A0);
                profileActivity.f41756e6 = wv0Var;
                paVar = wv0Var;
                break;
            case 4:
                paVar = new jr(this, context, profileActivity.A0);
                break;
            case 5:
                View e3Var = new org.telegram.ui.Cells.e3(context, profileActivity.A0);
                e3Var.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f), 0, 0);
                paVar = e3Var;
                break;
            case 6:
                paVar = new xv0(this, context, profileActivity.A0);
                break;
            case 7:
                paVar = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                if (profileActivity.f41878w4 == -1) {
                    i10 = 9;
                } else {
                    i10 = 6;
                }
                paVar = new org.telegram.ui.Cells.pa(i10, 0, this.f44156c, profileActivity.A0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(10, context, profileActivity.A0);
                y8Var.getTextView().setGravity(1);
                org.telegram.ui.ActionBar.r6.V(y8Var.getTextView(), org.telegram.ui.ActionBar.k6.A6, profileActivity.A0);
                y8Var.getTextView().setMovementMethod(null);
                y8Var.setText(org.telegram.messenger.g0.D0());
                y8Var.getTextView().setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
                paVar = y8Var;
                break;
            case 11:
            case 31:
                if (i3 == 31) {
                    f10 = 12.0f;
                } else {
                    f10 = 6.0f;
                }
                View v3Var = new org.telegram.ui.Cells.v3(context, org.telegram.messenger.g0.L(f10), 2);
                v3Var.setTag(-33024);
                paVar = v3Var;
                break;
            case 12:
                yv0Var = new yv0(this, context);
                yv0Var.setBackground(new ColorDrawable(0));
                yv0Var.setTag(-33024);
                paVar = yv0Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                yv0Var = profileActivity.O;
                yv0Var.setTag(-33024);
                paVar = yv0Var;
                break;
            case 15:
                paVar = new aw0(this, context, profileActivity.A0);
                break;
            case 17:
                paVar = new org.telegram.ui.Cells.y8(context, profileActivity.A0);
                break;
            case 18:
            case 24:
                if (i3 == 18) {
                    i11 = 0;
                }
                View o1Var = new vg.o1(i11, context, profileActivity.A0);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, o1Var, profileActivity.A0);
                paVar = o1Var;
                break;
            case 20:
                paVar = new org.telegram.ui.Cells.q8(18, context, profileActivity.A0, false);
                break;
            case 21:
                View h1Var = new lg.h1(context, profileActivity.A0);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, h1Var, profileActivity.A0);
                paVar = h1Var;
                break;
            case 22:
                View zv0Var = new zv0(this, context, profileActivity.A0);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, zv0Var, profileActivity.A0);
                paVar = zv0Var;
                break;
            case 23:
                paVar = new org.telegram.ui.Cells.e6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                gi.d dVar = new gi.d(context, profileActivity.A0, true);
                dVar.f();
                dVar.i(org.telegram.messenger.bd.M0(2131746716, null), false, true);
                dVar.setOnClickListener(new pv0(this, 0));
                frameLayout.addView(dVar, b8.mf.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, frameLayout, profileActivity.A0);
                paVar = frameLayout;
                break;
            case 26:
                paVar = new org.telegram.ui.Cells.y8(context, profileActivity.A0);
                break;
            case 27:
                paVar = new ii.h(context, profileActivity.A0);
                break;
            case 28:
                yv0Var = new org.telegram.ui.Components.sm(context, 22);
                yv0Var.setTag(-33024);
                paVar = yv0Var;
                break;
            case 32:
                paVar = new nw0(profileActivity, context);
                break;
            case 33:
                paVar = new ki.c(context, profileActivity.A0);
                break;
        }
        if (i3 != 13) {
            paVar.setLayoutParams(new u4.p0(-1, -2));
        }
        return new u4.d1(paVar);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        ProfileActivity profileActivity = this.f44157e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.w8) {
            ((org.telegram.ui.Cells.w8) view).f30822a.setLoading(profileActivity.f41790j5);
            ((org.telegram.ui.Cells.w8) view).f30823b.setLoading(profileActivity.f41790j5);
        }
    }

    @Override
    public final void z(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        ProfileActivity profileActivity = this.f44157e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
