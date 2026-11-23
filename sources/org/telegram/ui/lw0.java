package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class lw0 extends org.telegram.ui.Components.dk0 {
    public final Context f49717c;
    public final HashMap d = new HashMap();
    public final ProfileActivity f49718e;

    public lw0(ProfileActivity profileActivity, Context context) {
        this.f49718e = profileActivity;
        this.f49717c = context;
    }

    @Override
    public final void A(v4.f1 f1Var) {
        int b10 = f1Var.b();
        ProfileActivity profileActivity = this.f49718e;
        if (b10 == profileActivity.P2) {
            profileActivity.N2 = null;
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        ProfileActivity profileActivity = this.f49718e;
        if (profileActivity.f43602g3 != -1) {
            int b10 = f1Var.b();
            if (b10 != profileActivity.f43602g3 && b10 != profileActivity.U2 && b10 != profileActivity.f43616i3 && b10 != profileActivity.f43609h3 && b10 != profileActivity.W2 && b10 != profileActivity.X2 && b10 != profileActivity.A3 && b10 != profileActivity.j3 && b10 != profileActivity.f43629k3 && b10 != profileActivity.f43676r3 && b10 != profileActivity.f43655o3 && b10 != profileActivity.f43635l3 && b10 != profileActivity.f43648n3 && b10 != profileActivity.f43684s3 && b10 != profileActivity.f43690t3 && b10 != profileActivity.f43711w3 && b10 != profileActivity.f43719x3 && b10 != profileActivity.f43727y3 && b10 != profileActivity.f43734z3 && b10 != profileActivity.P2 && b10 != profileActivity.f43580d4 && b10 != profileActivity.f43596f4 && b10 != profileActivity.f43623j4 && b10 != profileActivity.f43617i4 && b10 != profileActivity.f43641m3 && b10 != profileActivity.V2 && b10 != profileActivity.R2 && b10 != profileActivity.f43603g4 && b10 != profileActivity.f43610h4 && b10 != profileActivity.o4) {
                return false;
            }
        } else {
            View view = f1Var.f59165a;
            if (view instanceof org.telegram.ui.Cells.ra) {
                Object currentObject = ((org.telegram.ui.Cells.ra) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && org.telegram.messenger.p10.C((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i7 = f1Var.f59169f;
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
        return this.f49718e.O2;
    }

    @Override
    public final int d(int i7) {
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.f49718e;
        if (i7 != profileActivity.E3 && i7 != profileActivity.f43712w4 && i7 != profileActivity.f43595f3 && i7 != profileActivity.T2 && i7 != profileActivity.f43668q3 && i7 != profileActivity.f43703v3 && i7 != profileActivity.f43669q4) {
            if (i7 != profileActivity.H3 && i7 != profileActivity.J3 && i7 != profileActivity.U2 && i7 != profileActivity.V2) {
                if (i7 != profileActivity.M3 && i7 != profileActivity.W2) {
                    if (i7 == profileActivity.I3) {
                        return 30;
                    }
                    if (i7 != profileActivity.K3 && i7 != profileActivity.L3 && i7 != profileActivity.X2) {
                        if (i7 != profileActivity.f43691t4 && i7 != profileActivity.f43697u4 && i7 != profileActivity.W3 && i7 != profileActivity.Y3 && i7 != profileActivity.X3 && i7 != profileActivity.A4 && i7 != profileActivity.B4 && i7 != profileActivity.C4 && i7 != profileActivity.D4 && i7 != profileActivity.J4 && i7 != profileActivity.f43735z4 && i7 != profileActivity.P4 && i7 != profileActivity.O4 && i7 != profileActivity.V3 && i7 != profileActivity.f43602g3 && i7 != profileActivity.f43616i3 && i7 != profileActivity.f43609h3 && i7 != profileActivity.j3 && i7 != profileActivity.f43629k3 && i7 != profileActivity.f43676r3 && i7 != profileActivity.f43655o3 && i7 != profileActivity.f43635l3 && i7 != profileActivity.f43648n3 && i7 != profileActivity.f43684s3 && i7 != profileActivity.f43690t3 && i7 != profileActivity.f43711w3 && i7 != profileActivity.f43719x3 && i7 != profileActivity.f43727y3 && i7 != profileActivity.f43734z3 && i7 != profileActivity.P2 && i7 != profileActivity.f43580d4 && i7 != profileActivity.f43566b4 && i7 != profileActivity.f43558a4 && i7 != profileActivity.f43641m3 && i7 != profileActivity.f43623j4 && i7 != profileActivity.f43617i4 && i7 != profileActivity.E4 && i7 != profileActivity.F4 && i7 != profileActivity.G4) {
                            i10 = profileActivity.botPermissionLocation;
                            if (i7 != i10) {
                                i11 = profileActivity.botPermissionBiometry;
                                if (i7 != i11) {
                                    i12 = profileActivity.botPermissionEmojiStatus;
                                    if (i7 != i12 && i7 != profileActivity.f43610h4) {
                                        if (i7 == profileActivity.N3) {
                                            return 5;
                                        }
                                        if (i7 == profileActivity.O3) {
                                            return 6;
                                        }
                                        if (i7 == profileActivity.R3) {
                                            return 20;
                                        }
                                        if (i7 != profileActivity.Q4 && i7 != profileActivity.K4 && i7 != profileActivity.f43662p4 && i7 != profileActivity.f43704v4 && i7 != profileActivity.f43587e3 && i7 != profileActivity.f43661p3 && i7 != profileActivity.f43696u3 && i7 != profileActivity.Q2 && i7 != profileActivity.f43573c3 && i7 != profileActivity.Y2 && i7 != profileActivity.f43630k4 && i7 != profileActivity.Z3 && i7 != profileActivity.f43574c4 && i7 != profileActivity.S2 && i7 != profileActivity.f43557a3 && i7 != profileActivity.I4 && i7 != profileActivity.f43685s4 && i7 != profileActivity.H4 && i7 != profileActivity.f43649n4) {
                                            if (i7 >= profileActivity.f43720x4 && i7 < profileActivity.f43728y4) {
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
                                            if (i7 != profileActivity.f43579d3 && i7 != profileActivity.f43565b3 && i7 != profileActivity.Z2) {
                                                if (i7 == profileActivity.f43588e4) {
                                                    return 17;
                                                }
                                                if (i7 == profileActivity.f43596f4) {
                                                    return 18;
                                                }
                                                if (i7 == profileActivity.f43603g4) {
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
                                                if (i7 == profileActivity.f43636l4) {
                                                    return 25;
                                                }
                                                if (i7 != profileActivity.S3 && i7 != profileActivity.U3) {
                                                    if (i7 == profileActivity.f43642m4) {
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
    public final void t(v4.f1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lw0.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        boolean z10;
        boolean z11;
        int i10;
        fw0 raVar;
        float f10;
        View hw0Var;
        int i11 = 1;
        boolean z12 = false;
        Context context = this.f49717c;
        ProfileActivity profileActivity = this.f49718e;
        switch (i7) {
            case 1:
                raVar = new org.telegram.ui.Cells.o4(this.f49717c, org.telegram.ui.ActionBar.m6.L6, 18, 7, false, profileActivity.A0);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.h6 h6Var = profileActivity.A0;
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
                ew0 ew0Var = new ew0(this, this.f49717c, h6Var, z12, z11);
                ew0Var.setContentDescriptionValueFirst(true);
                raVar = ew0Var;
                break;
            case 3:
                fw0 fw0Var = new fw0(this, context, profileActivity, profileActivity.A0);
                profileActivity.f43625j6 = fw0Var;
                raVar = fw0Var;
                break;
            case 4:
                raVar = new or(this, context, profileActivity.A0);
                break;
            case 5:
                View f3Var = new org.telegram.ui.Cells.f3(context, profileActivity.A0);
                f3Var.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f), 0, 0);
                raVar = f3Var;
                break;
            case 6:
                raVar = new gw0(this, context, profileActivity.A0);
                break;
            case 7:
                raVar = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 8:
                if (profileActivity.f43735z4 == -1) {
                    i10 = 9;
                } else {
                    i10 = 6;
                }
                raVar = new org.telegram.ui.Cells.ra(i10, 0, this.f49717c, profileActivity.A0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(10, context, profileActivity.A0);
                a9Var.getTextView().setGravity(1);
                org.telegram.ui.ActionBar.t6.U(a9Var.getTextView(), org.telegram.ui.ActionBar.m6.A6, profileActivity.A0);
                a9Var.getTextView().setMovementMethod(null);
                a9Var.setText(org.telegram.messenger.g0.D0());
                a9Var.getTextView().setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
                raVar = a9Var;
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
                raVar = w3Var;
                break;
            case 12:
                hw0Var = new hw0(this, context);
                hw0Var.setBackground(new ColorDrawable(0));
                hw0Var.setTag(-33024);
                raVar = hw0Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                hw0Var = profileActivity.O;
                hw0Var.setTag(-33024);
                raVar = hw0Var;
                break;
            case 15:
                raVar = new kw0(this, context, profileActivity.A0);
                break;
            case 17:
                raVar = new org.telegram.ui.Cells.a9(context, profileActivity.A0);
                break;
            case 18:
            case 24:
                if (i7 == 18) {
                    i11 = 0;
                }
                View o1Var = new ug.o1(i11, context, profileActivity.A0);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, o1Var, profileActivity.A0);
                raVar = o1Var;
                break;
            case 20:
                raVar = new org.telegram.ui.Cells.s8(18, context, profileActivity.A0, false);
                break;
            case 21:
                View i1Var = new kg.i1(context, profileActivity.A0);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, i1Var, profileActivity.A0);
                raVar = i1Var;
                break;
            case 22:
                View iw0Var = new iw0(this, context, profileActivity.A0);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, iw0Var, profileActivity.A0);
                raVar = iw0Var;
                break;
            case 23:
                raVar = new org.telegram.ui.Cells.g6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                hi.e eVar = new hi.e(context, profileActivity.A0, true);
                eVar.f();
                eVar.i(org.telegram.messenger.hd.N0(2131746512, null), false, true);
                eVar.setOnClickListener(new yv0(this, 0));
                frameLayout.addView(eVar, c8.ma.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, frameLayout, profileActivity.A0);
                raVar = frameLayout;
                break;
            case 26:
                raVar = new org.telegram.ui.Cells.a9(context, profileActivity.A0);
                break;
            case 27:
                raVar = new ki.g(context, profileActivity.A0);
                break;
            case 28:
                hw0Var = new org.telegram.ui.Components.ln(context, 21);
                hw0Var.setTag(-33024);
                raVar = hw0Var;
                break;
            case 32:
                raVar = new yw0(profileActivity, context);
                break;
            case 33:
                raVar = new mi.c(context, profileActivity.A0);
                break;
        }
        if (i7 != 13) {
            raVar.setLayoutParams(new v4.q0(-1, -2));
        }
        return new v4.f1(raVar);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        View view = f1Var.f59165a;
        ProfileActivity profileActivity = this.f49718e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.y8) {
            ((org.telegram.ui.Cells.y8) view).f32515a.setLoading(profileActivity.f43656o5);
            ((org.telegram.ui.Cells.y8) view).f32516b.setLoading(profileActivity.f43656o5);
        }
    }

    @Override
    public final void z(v4.f1 f1Var) {
        View view = f1Var.f59165a;
        ProfileActivity profileActivity = this.f49718e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
