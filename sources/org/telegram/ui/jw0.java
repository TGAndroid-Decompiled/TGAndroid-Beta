package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class jw0 extends org.telegram.ui.Components.dk0 {
    public final Context f49217c;
    public final HashMap d = new HashMap();
    public final ProfileActivity f49218e;

    public jw0(ProfileActivity profileActivity, Context context) {
        this.f49218e = profileActivity;
        this.f49217c = context;
    }

    @Override
    public final void A(v4.f1 f1Var) {
        int b10 = f1Var.b();
        ProfileActivity profileActivity = this.f49218e;
        if (b10 == profileActivity.P2) {
            profileActivity.N2 = null;
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        ProfileActivity profileActivity = this.f49218e;
        if (profileActivity.f43683g3 != -1) {
            int b10 = f1Var.b();
            if (b10 != profileActivity.f43683g3 && b10 != profileActivity.U2 && b10 != profileActivity.f43697i3 && b10 != profileActivity.f43690h3 && b10 != profileActivity.W2 && b10 != profileActivity.X2 && b10 != profileActivity.A3 && b10 != profileActivity.j3 && b10 != profileActivity.f43710k3 && b10 != profileActivity.f43757r3 && b10 != profileActivity.f43736o3 && b10 != profileActivity.f43716l3 && b10 != profileActivity.f43729n3 && b10 != profileActivity.f43765s3 && b10 != profileActivity.f43771t3 && b10 != profileActivity.f43792w3 && b10 != profileActivity.f43800x3 && b10 != profileActivity.f43808y3 && b10 != profileActivity.f43815z3 && b10 != profileActivity.P2 && b10 != profileActivity.f43661d4 && b10 != profileActivity.f43677f4 && b10 != profileActivity.f43704j4 && b10 != profileActivity.f43698i4 && b10 != profileActivity.f43722m3 && b10 != profileActivity.V2 && b10 != profileActivity.R2 && b10 != profileActivity.f43684g4 && b10 != profileActivity.f43691h4 && b10 != profileActivity.o4) {
                return false;
            }
        } else {
            View view = f1Var.f59245a;
            if (view instanceof org.telegram.ui.Cells.sa) {
                Object currentObject = ((org.telegram.ui.Cells.sa) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && org.telegram.messenger.n10.C((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i7 = f1Var.f59249f;
            if (i7 == 1 || i7 == 5 || i7 == 7 || i7 == 11 || i7 == 31 || i7 == 28 || i7 == 12 || i7 == 13 || i7 == 9 || i7 == 10 || i7 == 25 || i7 == 32) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.CharSequence E(java.lang.String r7, java.util.ArrayList r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jw0.E(java.lang.String, java.util.ArrayList, java.lang.String):java.lang.CharSequence");
    }

    @Override
    public final int b() {
        return this.f49218e.O2;
    }

    @Override
    public final int d(int i7) {
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.f49218e;
        if (i7 != profileActivity.E3 && i7 != profileActivity.f43793w4 && i7 != profileActivity.f43676f3 && i7 != profileActivity.T2 && i7 != profileActivity.f43749q3 && i7 != profileActivity.f43784v3 && i7 != profileActivity.f43750q4) {
            if (i7 != profileActivity.H3 && i7 != profileActivity.J3 && i7 != profileActivity.U2 && i7 != profileActivity.V2) {
                if (i7 != profileActivity.M3 && i7 != profileActivity.W2) {
                    if (i7 == profileActivity.I3) {
                        return 30;
                    }
                    if (i7 != profileActivity.K3 && i7 != profileActivity.L3 && i7 != profileActivity.X2) {
                        if (i7 != profileActivity.f43772t4 && i7 != profileActivity.f43778u4 && i7 != profileActivity.W3 && i7 != profileActivity.Y3 && i7 != profileActivity.X3 && i7 != profileActivity.A4 && i7 != profileActivity.B4 && i7 != profileActivity.C4 && i7 != profileActivity.D4 && i7 != profileActivity.J4 && i7 != profileActivity.f43816z4 && i7 != profileActivity.P4 && i7 != profileActivity.O4 && i7 != profileActivity.V3 && i7 != profileActivity.f43683g3 && i7 != profileActivity.f43697i3 && i7 != profileActivity.f43690h3 && i7 != profileActivity.j3 && i7 != profileActivity.f43710k3 && i7 != profileActivity.f43757r3 && i7 != profileActivity.f43736o3 && i7 != profileActivity.f43716l3 && i7 != profileActivity.f43729n3 && i7 != profileActivity.f43765s3 && i7 != profileActivity.f43771t3 && i7 != profileActivity.f43792w3 && i7 != profileActivity.f43800x3 && i7 != profileActivity.f43808y3 && i7 != profileActivity.f43815z3 && i7 != profileActivity.P2 && i7 != profileActivity.f43661d4 && i7 != profileActivity.f43647b4 && i7 != profileActivity.f43639a4 && i7 != profileActivity.f43722m3 && i7 != profileActivity.f43704j4 && i7 != profileActivity.f43698i4 && i7 != profileActivity.E4 && i7 != profileActivity.F4 && i7 != profileActivity.G4) {
                            i10 = profileActivity.botPermissionLocation;
                            if (i7 != i10) {
                                i11 = profileActivity.botPermissionBiometry;
                                if (i7 != i11) {
                                    i12 = profileActivity.botPermissionEmojiStatus;
                                    if (i7 != i12 && i7 != profileActivity.f43691h4) {
                                        if (i7 == profileActivity.N3) {
                                            return 5;
                                        }
                                        if (i7 == profileActivity.O3) {
                                            return 6;
                                        }
                                        if (i7 == profileActivity.R3) {
                                            return 20;
                                        }
                                        if (i7 != profileActivity.Q4 && i7 != profileActivity.K4 && i7 != profileActivity.f43743p4 && i7 != profileActivity.f43785v4 && i7 != profileActivity.f43668e3 && i7 != profileActivity.f43742p3 && i7 != profileActivity.f43777u3 && i7 != profileActivity.Q2 && i7 != profileActivity.f43654c3 && i7 != profileActivity.Y2 && i7 != profileActivity.f43711k4 && i7 != profileActivity.Z3 && i7 != profileActivity.f43655c4 && i7 != profileActivity.S2 && i7 != profileActivity.f43638a3 && i7 != profileActivity.I4 && i7 != profileActivity.f43766s4 && i7 != profileActivity.H4 && i7 != profileActivity.f43730n4) {
                                            if (i7 >= profileActivity.f43801x4 && i7 < profileActivity.f43809y4) {
                                                return 8;
                                            }
                                            if (i7 == profileActivity.B3) {
                                                return 11;
                                            }
                                            if (i7 == profileActivity.C3) {
                                                return 31;
                                            }
                                            if (i7 == profileActivity.D3) {
                                                return 12;
                                            }
                                            if (i7 == profileActivity.N4) {
                                                return 13;
                                            }
                                            if (i7 == profileActivity.A3) {
                                                return 14;
                                            }
                                            if (i7 != profileActivity.f43660d3 && i7 != profileActivity.f43646b3 && i7 != profileActivity.Z2) {
                                                if (i7 == profileActivity.f43669e4) {
                                                    return 17;
                                                }
                                                if (i7 == profileActivity.f43677f4) {
                                                    return 18;
                                                }
                                                if (i7 == profileActivity.f43684g4) {
                                                    return 24;
                                                }
                                                if (i7 == profileActivity.Q3) {
                                                    return 21;
                                                }
                                                if (i7 == profileActivity.P3) {
                                                    return 22;
                                                }
                                                if (i7 == profileActivity.R2) {
                                                    return 23;
                                                }
                                                if (i7 == profileActivity.f43717l4) {
                                                    return 25;
                                                }
                                                if (i7 != profileActivity.S3 && i7 != profileActivity.U3) {
                                                    if (i7 == profileActivity.f43723m4) {
                                                        return 32;
                                                    }
                                                    if (i7 == profileActivity.o4) {
                                                        return 33;
                                                    }
                                                    if (i7 == profileActivity.T3) {
                                                        return 27;
                                                    }
                                                    if (i7 != profileActivity.F3 && i7 != profileActivity.G3) {
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
    public final void t(v4.f1 r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jw0.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        boolean z10;
        boolean z11;
        int i10;
        ew0 saVar;
        float f10;
        View gw0Var;
        int i11 = 1;
        boolean z12 = false;
        Context context = this.f49217c;
        ProfileActivity profileActivity = this.f49218e;
        switch (i7) {
            case 1:
                saVar = new org.telegram.ui.Cells.o4(this.f49217c, org.telegram.ui.ActionBar.n6.L6, 18, 7, false, profileActivity.A0);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.i6 i6Var = profileActivity.A0;
                if (i7 == 30) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (i7 == 19) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                dw0 dw0Var = new dw0(this, this.f49217c, i6Var, z12, z11);
                dw0Var.setContentDescriptionValueFirst(true);
                saVar = dw0Var;
                break;
            case 3:
                ew0 ew0Var = new ew0(this, context, profileActivity, profileActivity.A0);
                profileActivity.f43706j6 = ew0Var;
                saVar = ew0Var;
                break;
            case 4:
                saVar = new or(this, context, profileActivity.A0);
                break;
            case 5:
                View f3Var = new org.telegram.ui.Cells.f3(context, profileActivity.A0);
                f3Var.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f), 0, 0);
                saVar = f3Var;
                break;
            case 6:
                saVar = new fw0(this, context, profileActivity.A0);
                break;
            case 7:
                saVar = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 8:
                if (profileActivity.f43816z4 == -1) {
                    i10 = 9;
                } else {
                    i10 = 6;
                }
                saVar = new org.telegram.ui.Cells.sa(i10, 0, this.f49217c, profileActivity.A0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(10, context, profileActivity.A0);
                z8Var.getTextView().setGravity(1);
                org.telegram.ui.ActionBar.u6.U(z8Var.getTextView(), org.telegram.ui.ActionBar.n6.A6, profileActivity.A0);
                z8Var.getTextView().setMovementMethod(null);
                z8Var.setText(org.telegram.messenger.g0.D0());
                z8Var.getTextView().setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
                saVar = z8Var;
                break;
            case 11:
            case 31:
                if (i7 == 31) {
                    f10 = 12.0f;
                } else {
                    f10 = 6.0f;
                }
                View w3Var = new org.telegram.ui.Cells.w3(context, org.telegram.messenger.g0.L(f10), 2);
                w3Var.setTag(-33024);
                saVar = w3Var;
                break;
            case 12:
                gw0Var = new gw0(this, context);
                gw0Var.setBackground(new ColorDrawable(0));
                gw0Var.setTag(-33024);
                saVar = gw0Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                gw0Var = profileActivity.O;
                gw0Var.setTag(-33024);
                saVar = gw0Var;
                break;
            case 15:
                saVar = new iw0(this, context, profileActivity.A0);
                break;
            case 17:
                saVar = new org.telegram.ui.Cells.z8(context, profileActivity.A0);
                break;
            case 18:
            case 24:
                if (i7 == 18) {
                    i11 = 0;
                }
                View o1Var = new ug.o1(i11, context, profileActivity.A0);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, o1Var, profileActivity.A0);
                saVar = o1Var;
                break;
            case 20:
                saVar = new org.telegram.ui.Cells.r8(18, context, profileActivity.A0, false);
                break;
            case 21:
                View j1Var = new kg.j1(context, profileActivity.A0);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, j1Var, profileActivity.A0);
                saVar = j1Var;
                break;
            case 22:
                View hw0Var = new hw0(this, context, profileActivity.A0);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, hw0Var, profileActivity.A0);
                saVar = hw0Var;
                break;
            case 23:
                saVar = new org.telegram.ui.Cells.f6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                hi.e eVar = new hi.e(context, profileActivity.A0, true);
                eVar.f();
                eVar.i(org.telegram.messenger.gd.N0(2131746512, null), false, true);
                eVar.setOnClickListener(new xv0(this, 0));
                frameLayout.addView(eVar, c8.na.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, frameLayout, profileActivity.A0);
                saVar = frameLayout;
                break;
            case 26:
                saVar = new org.telegram.ui.Cells.z8(context, profileActivity.A0);
                break;
            case 27:
                saVar = new ki.g(context, profileActivity.A0);
                break;
            case 28:
                gw0Var = new org.telegram.ui.Components.in(context, 21);
                gw0Var.setTag(-33024);
                saVar = gw0Var;
                break;
            case 32:
                saVar = new ww0(profileActivity, context);
                break;
            case 33:
                saVar = new mi.c(context, profileActivity.A0);
                break;
        }
        if (i7 != 13) {
            saVar.setLayoutParams(new v4.q0(-1, -2));
        }
        return new v4.f1(saVar);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        View view = f1Var.f59245a;
        ProfileActivity profileActivity = this.f49218e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.x8) {
            ((org.telegram.ui.Cells.x8) view).f32430a.setLoading(profileActivity.f43737o5);
            ((org.telegram.ui.Cells.x8) view).f32431b.setLoading(profileActivity.f43737o5);
        }
    }

    @Override
    public final void z(v4.f1 f1Var) {
        View view = f1Var.f59245a;
        ProfileActivity profileActivity = this.f49218e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
