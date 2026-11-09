package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class lw0 extends org.telegram.ui.Components.pj0 {
    public final Context f47689c;
    public final HashMap d = new HashMap();
    public final ProfileActivity f47690e;

    public lw0(ProfileActivity profileActivity, Context context) {
        this.f47690e = profileActivity;
        this.f47689c = context;
    }

    @Override
    public final void A(v4.d1 d1Var) {
        int b10 = d1Var.b();
        ProfileActivity profileActivity = this.f47690e;
        if (b10 == profileActivity.N2) {
            profileActivity.L2 = null;
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        ProfileActivity profileActivity = this.f47690e;
        if (profileActivity.f41732e3 != -1) {
            int b10 = d1Var.b();
            if (b10 != profileActivity.f41732e3 && b10 != profileActivity.S2 && b10 != profileActivity.f41747g3 && b10 != profileActivity.f41740f3 && b10 != profileActivity.U2 && b10 != profileActivity.V2 && b10 != profileActivity.f41872y3 && b10 != profileActivity.f41754h3 && b10 != profileActivity.f41761i3 && b10 != profileActivity.f41806p3 && b10 != profileActivity.f41786m3 && b10 != profileActivity.j3 && b10 != profileActivity.f41780l3 && b10 != profileActivity.f41813q3 && b10 != profileActivity.f41821r3 && b10 != profileActivity.f41841u3 && b10 != profileActivity.f41848v3 && b10 != profileActivity.f41856w3 && b10 != profileActivity.f41864x3 && b10 != profileActivity.N2 && b10 != profileActivity.Z3 && b10 != profileActivity.f41711b4 && b10 != profileActivity.f41741f4 && b10 != profileActivity.f41733e4 && b10 != profileActivity.f41774k3 && b10 != profileActivity.T2 && b10 != profileActivity.P2 && b10 != profileActivity.f41719c4 && b10 != profileActivity.f41725d4 && b10 != profileActivity.f41775k4) {
                return false;
            }
        } else {
            View view = d1Var.f57056a;
            if (view instanceof org.telegram.ui.Cells.pa) {
                Object currentObject = ((org.telegram.ui.Cells.pa) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && org.telegram.messenger.t10.B((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i7 = d1Var.f57060f;
            if (i7 == 1 || i7 == 5 || i7 == 7 || i7 == 11 || i7 == 31 || i7 == 28 || i7 == 12 || i7 == 13 || i7 == 9 || i7 == 10 || i7 == 25 || i7 == 32) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.CharSequence E(java.lang.String r7, java.util.ArrayList r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lw0.E(java.lang.String, java.util.ArrayList, java.lang.String):java.lang.CharSequence");
    }

    @Override
    public final int b() {
        return this.f47690e.M2;
    }

    @Override
    public final int d(int i7) {
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.f47690e;
        if (i7 != profileActivity.C3 && i7 != profileActivity.f41830s4 && i7 != profileActivity.f41724d3 && i7 != profileActivity.R2 && i7 != profileActivity.f41800o3 && i7 != profileActivity.f41835t3 && i7 != profileActivity.f41787m4) {
            if (i7 != profileActivity.F3 && i7 != profileActivity.H3 && i7 != profileActivity.S2 && i7 != profileActivity.T2) {
                if (i7 != profileActivity.K3 && i7 != profileActivity.U2) {
                    if (i7 == profileActivity.G3) {
                        return 30;
                    }
                    if (i7 != profileActivity.I3 && i7 != profileActivity.J3 && i7 != profileActivity.V2) {
                        if (i7 != profileActivity.f41807p4 && i7 != profileActivity.f41814q4 && i7 != profileActivity.U3 && i7 != profileActivity.W3 && i7 != profileActivity.V3 && i7 != profileActivity.f41857w4 && i7 != profileActivity.f41865x4 && i7 != profileActivity.f41873y4 && i7 != profileActivity.f41880z4 && i7 != profileActivity.F4 && i7 != profileActivity.f41849v4 && i7 != profileActivity.L4 && i7 != profileActivity.K4 && i7 != profileActivity.T3 && i7 != profileActivity.f41732e3 && i7 != profileActivity.f41747g3 && i7 != profileActivity.f41740f3 && i7 != profileActivity.f41754h3 && i7 != profileActivity.f41761i3 && i7 != profileActivity.f41806p3 && i7 != profileActivity.f41786m3 && i7 != profileActivity.j3 && i7 != profileActivity.f41780l3 && i7 != profileActivity.f41813q3 && i7 != profileActivity.f41821r3 && i7 != profileActivity.f41841u3 && i7 != profileActivity.f41848v3 && i7 != profileActivity.f41856w3 && i7 != profileActivity.f41864x3 && i7 != profileActivity.N2 && i7 != profileActivity.Z3 && i7 != profileActivity.Y3 && i7 != profileActivity.f41774k3 && i7 != profileActivity.f41741f4 && i7 != profileActivity.f41733e4 && i7 != profileActivity.A4 && i7 != profileActivity.B4 && i7 != profileActivity.C4) {
                            i10 = profileActivity.botPermissionLocation;
                            if (i7 != i10) {
                                i11 = profileActivity.botPermissionBiometry;
                                if (i7 != i11) {
                                    i12 = profileActivity.botPermissionEmojiStatus;
                                    if (i7 != i12 && i7 != profileActivity.f41725d4) {
                                        if (i7 == profileActivity.L3) {
                                            return 5;
                                        }
                                        if (i7 == profileActivity.M3) {
                                            return 6;
                                        }
                                        if (i7 == profileActivity.P3) {
                                            return 20;
                                        }
                                        if (i7 != profileActivity.M4 && i7 != profileActivity.G4 && i7 != profileActivity.f41781l4 && i7 != profileActivity.f41822r4 && i7 != profileActivity.f41718c3 && i7 != profileActivity.f41793n3 && i7 != profileActivity.f41829s3 && i7 != profileActivity.O2 && i7 != profileActivity.f41702a3 && i7 != profileActivity.W2 && i7 != profileActivity.f41748g4 && i7 != profileActivity.X3 && i7 != profileActivity.Q2 && i7 != profileActivity.Y2 && i7 != profileActivity.E4 && i7 != profileActivity.o4 && i7 != profileActivity.D4 && i7 != profileActivity.f41768j4) {
                                            if (i7 >= profileActivity.f41836t4 && i7 < profileActivity.f41842u4) {
                                                return 8;
                                            }
                                            if (i7 == profileActivity.f41879z3) {
                                                return 11;
                                            }
                                            if (i7 == profileActivity.A3) {
                                                return 31;
                                            }
                                            if (i7 == profileActivity.B3) {
                                                return 12;
                                            }
                                            if (i7 == profileActivity.J4) {
                                                return 13;
                                            }
                                            if (i7 == profileActivity.f41872y3) {
                                                return 14;
                                            }
                                            if (i7 != profileActivity.f41710b3 && i7 != profileActivity.Z2 && i7 != profileActivity.X2) {
                                                if (i7 == profileActivity.f41703a4) {
                                                    return 17;
                                                }
                                                if (i7 == profileActivity.f41711b4) {
                                                    return 18;
                                                }
                                                if (i7 == profileActivity.f41719c4) {
                                                    return 24;
                                                }
                                                if (i7 == profileActivity.O3) {
                                                    return 21;
                                                }
                                                if (i7 == profileActivity.N3) {
                                                    return 22;
                                                }
                                                if (i7 == profileActivity.P2) {
                                                    return 23;
                                                }
                                                if (i7 == profileActivity.f41755h4) {
                                                    return 25;
                                                }
                                                if (i7 != profileActivity.Q3 && i7 != profileActivity.S3) {
                                                    if (i7 == profileActivity.f41762i4) {
                                                        return 32;
                                                    }
                                                    if (i7 == profileActivity.f41775k4) {
                                                        return 33;
                                                    }
                                                    if (i7 == profileActivity.R3) {
                                                        return 27;
                                                    }
                                                    if (i7 != profileActivity.D3 && i7 != profileActivity.E3) {
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
    public final void t(v4.d1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lw0.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        boolean z9;
        boolean z10;
        int i10;
        gw0 paVar;
        float f10;
        View iw0Var;
        int i11 = 1;
        boolean z11 = false;
        Context context = this.f47689c;
        ProfileActivity profileActivity = this.f47690e;
        switch (i7) {
            case 1:
                paVar = new org.telegram.ui.Cells.n4(this.f47689c, org.telegram.ui.ActionBar.l6.L6, 18, 7, false, profileActivity.f41876z0);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.g6 g6Var = profileActivity.f41876z0;
                if (i7 == 30) {
                    z9 = false;
                    z11 = true;
                } else {
                    z9 = false;
                }
                if (i7 == 19) {
                    z10 = true;
                } else {
                    z10 = z9;
                }
                fw0 fw0Var = new fw0(this, this.f47689c, g6Var, z11, z10);
                fw0Var.setContentDescriptionValueFirst(true);
                paVar = fw0Var;
                break;
            case 3:
                gw0 gw0Var = new gw0(this, context, profileActivity, profileActivity.f41876z0);
                profileActivity.f41743f6 = gw0Var;
                paVar = gw0Var;
                break;
            case 4:
                paVar = new nr(this, context, profileActivity.f41876z0);
                break;
            case 5:
                View e3Var = new org.telegram.ui.Cells.e3(context, profileActivity.f41876z0);
                e3Var.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f), 0, 0);
                paVar = e3Var;
                break;
            case 6:
                paVar = new hw0(this, context, profileActivity.f41876z0);
                break;
            case 7:
                paVar = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                if (profileActivity.f41849v4 == -1) {
                    i10 = 9;
                } else {
                    i10 = 6;
                }
                paVar = new org.telegram.ui.Cells.pa(i10, 0, this.f47689c, profileActivity.f41876z0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(10, context, profileActivity.f41876z0);
                z8Var.getTextView().setGravity(1);
                org.telegram.ui.ActionBar.s6.U(z8Var.getTextView(), org.telegram.ui.ActionBar.l6.A6, profileActivity.f41876z0);
                z8Var.getTextView().setMovementMethod(null);
                z8Var.setText(org.telegram.messenger.g0.D0());
                z8Var.getTextView().setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
                paVar = z8Var;
                break;
            case 11:
            case 31:
                if (i7 == 31) {
                    f10 = 12.0f;
                } else {
                    f10 = 6.0f;
                }
                View v3Var = new org.telegram.ui.Cells.v3(context, org.telegram.messenger.g0.L(f10), 2);
                v3Var.setTag(-33024);
                paVar = v3Var;
                break;
            case 12:
                iw0Var = new iw0(this, context);
                iw0Var.setBackground(new ColorDrawable(0));
                iw0Var.setTag(-33024);
                paVar = iw0Var;
                break;
            case 13:
                if (profileActivity.N.getParent() != null) {
                    ((ViewGroup) profileActivity.N.getParent()).removeView(profileActivity.N);
                }
                iw0Var = profileActivity.N;
                iw0Var.setTag(-33024);
                paVar = iw0Var;
                break;
            case 15:
                paVar = new kw0(this, context, profileActivity.f41876z0);
                break;
            case 17:
                paVar = new org.telegram.ui.Cells.z8(context, profileActivity.f41876z0);
                break;
            case 18:
            case 24:
                if (i7 == 18) {
                    i11 = 0;
                }
                View l1Var = new ug.l1(i11, context, profileActivity.f41876z0);
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, l1Var, profileActivity.f41876z0);
                paVar = l1Var;
                break;
            case 20:
                paVar = new org.telegram.ui.Cells.r8(18, context, profileActivity.f41876z0, false);
                break;
            case 21:
                View g1Var = new kg.g1(context, profileActivity.f41876z0);
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, g1Var, profileActivity.f41876z0);
                paVar = g1Var;
                break;
            case 22:
                View jw0Var = new jw0(this, context, profileActivity.f41876z0);
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, jw0Var, profileActivity.f41876z0);
                paVar = jw0Var;
                break;
            case 23:
                paVar = new org.telegram.ui.Cells.f6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                fi.d dVar = new fi.d(context, profileActivity.f41876z0, true);
                dVar.f();
                dVar.i(org.telegram.messenger.id.M0(2131746708, null), false, true);
                dVar.setOnClickListener(new aw0(this, 0));
                frameLayout.addView(dVar, c8.ha.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, frameLayout, profileActivity.f41876z0);
                paVar = frameLayout;
                break;
            case 26:
                paVar = new org.telegram.ui.Cells.z8(context, profileActivity.f41876z0);
                break;
            case 27:
                paVar = new hi.g(context, profileActivity.f41876z0);
                break;
            case 28:
                iw0Var = new org.telegram.ui.Components.tm(context, 21);
                iw0Var.setTag(-33024);
                paVar = iw0Var;
                break;
            case 32:
                paVar = new yw0(profileActivity, context);
                break;
            case 33:
                paVar = new ji.c(context, profileActivity.f41876z0);
                break;
        }
        if (i7 != 13) {
            paVar.setLayoutParams(new v4.o0(-1, -2));
        }
        return new v4.d1(paVar);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        View view = d1Var.f57056a;
        ProfileActivity profileActivity = this.f47690e;
        if (view == profileActivity.N) {
            profileActivity.P = true;
        }
        if (view instanceof org.telegram.ui.Cells.x8) {
            ((org.telegram.ui.Cells.x8) view).f30909a.setLoading(profileActivity.f41776k5);
            ((org.telegram.ui.Cells.x8) view).f30910b.setLoading(profileActivity.f41776k5);
        }
    }

    @Override
    public final void z(v4.d1 d1Var) {
        View view = d1Var.f57056a;
        ProfileActivity profileActivity = this.f47690e;
        if (view == profileActivity.N) {
            profileActivity.P = false;
        }
    }
}
