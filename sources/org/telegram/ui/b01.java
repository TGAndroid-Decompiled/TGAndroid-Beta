package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class b01 extends org.telegram.ui.Components.im0 {
    public final Context f35473c;
    public final HashMap d = new HashMap();
    public final ProfileActivity e;

    public b01(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.f35473c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        int b10 = b1Var.b();
        ProfileActivity profileActivity = this.e;
        if (b10 == profileActivity.P2) {
            profileActivity.N2 = null;
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.f33633g3 != -1) {
            int b10 = b1Var.b();
            if (b10 != profileActivity.f33633g3 && b10 != profileActivity.U2 && b10 != profileActivity.f33647i3 && b10 != profileActivity.f33640h3 && b10 != profileActivity.W2 && b10 != profileActivity.X2 && b10 != profileActivity.A3 && b10 != profileActivity.f33654j3 && b10 != profileActivity.f33661k3 && b10 != profileActivity.f33707r3 && b10 != profileActivity.f33687o3 && b10 != profileActivity.f33667l3 && b10 != profileActivity.f33680n3 && b10 != profileActivity.f33715s3 && b10 != profileActivity.f33722t3 && b10 != profileActivity.f33744w3 && b10 != profileActivity.f33752x3 && b10 != profileActivity.y3 && b10 != profileActivity.f33766z3 && b10 != profileActivity.P2 && b10 != profileActivity.f33597b4 && b10 != profileActivity.f33612d4 && b10 != profileActivity.f33641h4 && b10 != profileActivity.f33634g4 && b10 != profileActivity.f33672m3 && b10 != profileActivity.V2 && b10 != profileActivity.R2 && b10 != profileActivity.f33619e4 && b10 != profileActivity.f33627f4 && b10 != profileActivity.f33673m4) {
                return false;
            }
        } else {
            View view = b1Var.f45921a;
            if (view instanceof org.telegram.ui.Cells.va) {
                Object currentObject = ((org.telegram.ui.Cells.va) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = b1Var.f45924f;
            if (i10 == 1 || i10 == 5 || i10 == 7 || i10 == 11 || i10 == 31 || i10 == 28 || i10 == 12 || i10 == 13 || i10 == 9 || i10 == 10 || i10 == 25 || i10 == 32) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.CharSequence E(java.lang.String r7, java.util.ArrayList r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b01.E(java.lang.String, java.util.ArrayList, java.lang.String):java.lang.CharSequence");
    }

    @Override
    public final int h() {
        return this.e.O2;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.e;
        if (i10 != profileActivity.E3 && i10 != profileActivity.f33730u4 && i10 != profileActivity.f33626f3 && i10 != profileActivity.T2 && i10 != profileActivity.f33700q3 && i10 != profileActivity.f33736v3 && i10 != profileActivity.f33688o4) {
            if (i10 != profileActivity.H3 && i10 != profileActivity.J3 && i10 != profileActivity.U2 && i10 != profileActivity.V2) {
                if (i10 != profileActivity.M3 && i10 != profileActivity.W2) {
                    if (i10 == profileActivity.I3) {
                        return 30;
                    }
                    if (i10 != profileActivity.K3 && i10 != profileActivity.L3 && i10 != profileActivity.X2) {
                        if (i10 != profileActivity.f33708r4 && i10 != profileActivity.f33716s4 && i10 != profileActivity.W3 && i10 != profileActivity.Y3 && i10 != profileActivity.X3 && i10 != profileActivity.f33760y4 && i10 != profileActivity.f33767z4 && i10 != profileActivity.A4 && i10 != profileActivity.B4 && i10 != profileActivity.H4 && i10 != profileActivity.f33753x4 && i10 != profileActivity.N4 && i10 != profileActivity.M4 && i10 != profileActivity.V3 && i10 != profileActivity.f33633g3 && i10 != profileActivity.f33647i3 && i10 != profileActivity.f33640h3 && i10 != profileActivity.f33654j3 && i10 != profileActivity.f33661k3 && i10 != profileActivity.f33707r3 && i10 != profileActivity.f33687o3 && i10 != profileActivity.f33667l3 && i10 != profileActivity.f33680n3 && i10 != profileActivity.f33715s3 && i10 != profileActivity.f33722t3 && i10 != profileActivity.f33744w3 && i10 != profileActivity.f33752x3 && i10 != profileActivity.y3 && i10 != profileActivity.f33766z3 && i10 != profileActivity.P2 && i10 != profileActivity.f33597b4 && i10 != profileActivity.f33589a4 && i10 != profileActivity.f33672m3 && i10 != profileActivity.f33641h4 && i10 != profileActivity.f33634g4 && i10 != profileActivity.C4 && i10 != profileActivity.D4 && i10 != profileActivity.E4) {
                            i11 = profileActivity.botPermissionLocation;
                            if (i10 != i11) {
                                i12 = profileActivity.botPermissionBiometry;
                                if (i10 != i12) {
                                    i13 = profileActivity.botPermissionEmojiStatus;
                                    if (i10 != i13 && i10 != profileActivity.f33627f4) {
                                        if (i10 == profileActivity.N3) {
                                            return 5;
                                        }
                                        if (i10 == profileActivity.O3) {
                                            return 6;
                                        }
                                        if (i10 == profileActivity.R3) {
                                            return 20;
                                        }
                                        if (i10 != profileActivity.O4 && i10 != profileActivity.I4 && i10 != profileActivity.f33681n4 && i10 != profileActivity.f33723t4 && i10 != profileActivity.f33618e3 && i10 != profileActivity.f33694p3 && i10 != profileActivity.f33729u3 && i10 != profileActivity.Q2 && i10 != profileActivity.f33604c3 && i10 != profileActivity.Y2 && i10 != profileActivity.f33648i4 && i10 != profileActivity.Z3 && i10 != profileActivity.S2 && i10 != profileActivity.f33588a3 && i10 != profileActivity.G4 && i10 != profileActivity.f33701q4 && i10 != profileActivity.F4 && i10 != profileActivity.l4) {
                                            if (i10 >= profileActivity.f33737v4 && i10 < profileActivity.f33745w4) {
                                                return 8;
                                            }
                                            if (i10 == profileActivity.B3) {
                                                return 11;
                                            }
                                            if (i10 == profileActivity.C3) {
                                                return 31;
                                            }
                                            if (i10 == profileActivity.D3) {
                                                return 12;
                                            }
                                            if (i10 == profileActivity.L4) {
                                                return 13;
                                            }
                                            if (i10 == profileActivity.A3) {
                                                return 14;
                                            }
                                            if (i10 != profileActivity.f33611d3 && i10 != profileActivity.f33596b3 && i10 != profileActivity.Z2) {
                                                if (i10 == profileActivity.f33605c4) {
                                                    return 17;
                                                }
                                                if (i10 == profileActivity.f33612d4) {
                                                    return 18;
                                                }
                                                if (i10 == profileActivity.f33619e4) {
                                                    return 24;
                                                }
                                                if (i10 == profileActivity.Q3) {
                                                    return 21;
                                                }
                                                if (i10 == profileActivity.P3) {
                                                    return 22;
                                                }
                                                if (i10 == profileActivity.R2) {
                                                    return 23;
                                                }
                                                if (i10 == profileActivity.f33655j4) {
                                                    return 25;
                                                }
                                                if (i10 != profileActivity.S3 && i10 != profileActivity.U3) {
                                                    if (i10 == profileActivity.f33662k4) {
                                                        return 32;
                                                    }
                                                    if (i10 == profileActivity.f33673m4) {
                                                        return 33;
                                                    }
                                                    if (i10 == profileActivity.T3) {
                                                        return 27;
                                                    }
                                                    if (i10 != profileActivity.F3 && i10 != profileActivity.G3) {
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
    public final void v(s4.b1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b01.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        wz0 vaVar;
        float f7;
        View yz0Var;
        int i12 = 1;
        boolean z12 = false;
        Context context = this.f35473c;
        ProfileActivity profileActivity = this.e;
        switch (i10) {
            case 1:
                vaVar = new org.telegram.ui.Cells.l4(this.f35473c, org.telegram.ui.ActionBar.h6.L6, 18, 7, false, profileActivity.A0);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.d6 d6Var = profileActivity.A0;
                if (i10 == 30) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (i10 == 19) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                vz0 vz0Var = new vz0(this, this.f35473c, d6Var, z12, z11);
                vz0Var.setContentDescriptionValueFirst(true);
                vaVar = vz0Var;
                break;
            case 3:
                wz0 wz0Var = new wz0(this, context, profileActivity, profileActivity.A0);
                profileActivity.P5 = wz0Var;
                vaVar = wz0Var;
                break;
            case 4:
                vaVar = new ds(this, context, profileActivity.A0);
                break;
            case 5:
                View c3Var = new org.telegram.ui.Cells.c3(context, profileActivity.A0);
                c3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                vaVar = c3Var;
                break;
            case 6:
                vaVar = new xz0(this, context, profileActivity.A0);
                break;
            case 7:
                vaVar = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                if (profileActivity.f33753x4 == -1) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                vaVar = new org.telegram.ui.Cells.va(i11, 0, this.f35473c, profileActivity.A0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context, 10, profileActivity.A0);
                d9Var.getTextView().setGravity(1);
                d9Var.getTextView().setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A6, profileActivity.A0));
                d9Var.getTextView().setMovementMethod(null);
                d9Var.setText(AndroidUtilities.getBuildVersionInfo());
                d9Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                vaVar = d9Var;
                break;
            case 11:
            case 31:
                if (i10 == 31) {
                    f7 = 12.0f;
                } else {
                    f7 = 6.0f;
                }
                View s3Var = new org.telegram.ui.Cells.s3(context, AndroidUtilities.dp(f7), 2);
                s3Var.setTag(-33024);
                vaVar = s3Var;
                break;
            case 12:
                yz0Var = new yz0(this, context);
                yz0Var.setBackground(new ColorDrawable(0));
                yz0Var.setTag(-33024);
                vaVar = yz0Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                yz0Var = profileActivity.O;
                yz0Var.setTag(-33024);
                vaVar = yz0Var;
                break;
            case 15:
                vaVar = new a01(this, context, profileActivity.A0);
                break;
            case 17:
                vaVar = new org.telegram.ui.Cells.d9(context, profileActivity.A0);
                break;
            case 18:
            case 24:
                if (i10 == 18) {
                    i12 = 0;
                }
                View s1Var = new sg.s1(context, i12, profileActivity.A0);
                s1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20994d6, profileActivity.A0));
                vaVar = s1Var;
                break;
            case 20:
                vaVar = new org.telegram.ui.Cells.v8(18, context, profileActivity.A0, false);
                break;
            case 21:
                View j1Var = new ig.j1(context, profileActivity.A0);
                j1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20994d6, profileActivity.A0));
                vaVar = j1Var;
                break;
            case 22:
                View zz0Var = new zz0(this, context, profileActivity.A0);
                zz0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20994d6, profileActivity.A0));
                vaVar = zz0Var;
                break;
            case 23:
                vaVar = new org.telegram.ui.Cells.g6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                ei.d dVar = new ei.d(context, profileActivity.A0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new qz0(this, 0));
                frameLayout.addView(dVar, w7.z5.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20994d6, profileActivity.A0));
                vaVar = frameLayout;
                break;
            case 26:
                vaVar = new org.telegram.ui.Cells.d9(context, profileActivity.A0);
                break;
            case 27:
                vaVar = new gi.i(context, profileActivity.A0);
                break;
            case 28:
                yz0Var = new org.telegram.ui.Components.un(context, 22);
                yz0Var.setTag(-33024);
                vaVar = yz0Var;
                break;
            case 32:
                vaVar = new o01(profileActivity, context);
                break;
            case 33:
                vaVar = new ii.b(context, profileActivity.A0);
                break;
        }
        if (i10 != 13) {
            vaVar.setLayoutParams(new s4.o0(-1, -2));
        }
        return new s4.b1(vaVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        View view = b1Var.f45921a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.b9) {
            ((org.telegram.ui.Cells.b9) view).f22063a.setLoading(profileActivity.f33663k5);
            ((org.telegram.ui.Cells.b9) view).f22064b.setLoading(profileActivity.f33663k5);
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        View view = b1Var.f45921a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
