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
public final class f11 extends org.telegram.ui.Components.ul0 {
    public final Context f32669c;
    public final HashMap d = new HashMap();
    public final ProfileActivity e;

    public f11(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.f32669c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        int b10 = c1Var.b();
        ProfileActivity profileActivity = this.e;
        if (b10 == profileActivity.O2) {
            profileActivity.M2 = null;
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.f30391f3 != -1) {
            int b10 = c1Var.b();
            if (b10 != profileActivity.f30391f3 && b10 != profileActivity.T2 && b10 != profileActivity.f30405h3 && b10 != profileActivity.f30398g3 && b10 != profileActivity.V2 && b10 != profileActivity.W2 && b10 != profileActivity.f30527z3 && b10 != profileActivity.f30412i3 && b10 != profileActivity.j3 && b10 != profileActivity.f30464q3 && b10 != profileActivity.f30444n3 && b10 != profileActivity.f30425k3 && b10 != profileActivity.f30436m3 && b10 != profileActivity.f30471r3 && b10 != profileActivity.f30479s3 && b10 != profileActivity.f30500v3 && b10 != profileActivity.f30508w3 && b10 != profileActivity.f30515x3 && b10 != profileActivity.y3 && b10 != profileActivity.O2 && b10 != profileActivity.f30354a4 && b10 != profileActivity.f30370c4 && b10 != profileActivity.f30399g4 && b10 != profileActivity.f30392f4 && b10 != profileActivity.f30431l3 && b10 != profileActivity.U2 && b10 != profileActivity.Q2 && b10 != profileActivity.f30377d4 && b10 != profileActivity.f30384e4 && b10 != profileActivity.l4) {
                return false;
            }
        } else {
            View view = c1Var.f41610a;
            if (view instanceof org.telegram.ui.Cells.bb) {
                Object currentObject = ((org.telegram.ui.Cells.bb) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = c1Var.f41613f;
            if (i10 == 1 || i10 == 5 || i10 == 7 || i10 == 11 || i10 == 31 || i10 == 28 || i10 == 12 || i10 == 13 || i10 == 9 || i10 == 10 || i10 == 25 || i10 == 32) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.CharSequence E(java.lang.String r7, java.util.ArrayList r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f11.E(java.lang.String, java.util.ArrayList, java.lang.String):java.lang.CharSequence");
    }

    @Override
    public final int h() {
        return this.e.N2;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.e;
        if (i10 != profileActivity.D3 && i10 != profileActivity.f30487t4 && i10 != profileActivity.f30383e3 && i10 != profileActivity.S2 && i10 != profileActivity.f30458p3 && i10 != profileActivity.f30493u3 && i10 != profileActivity.f30445n4) {
            if (i10 != profileActivity.G3 && i10 != profileActivity.I3 && i10 != profileActivity.T2 && i10 != profileActivity.U2) {
                if (i10 != profileActivity.L3 && i10 != profileActivity.V2) {
                    if (i10 == profileActivity.H3) {
                        return 30;
                    }
                    if (i10 != profileActivity.J3 && i10 != profileActivity.K3 && i10 != profileActivity.W2) {
                        if (i10 != profileActivity.f30465q4 && i10 != profileActivity.f30472r4 && i10 != profileActivity.V3 && i10 != profileActivity.X3 && i10 != profileActivity.W3 && i10 != profileActivity.f30516x4 && i10 != profileActivity.f30522y4 && i10 != profileActivity.f30528z4 && i10 != profileActivity.A4 && i10 != profileActivity.G4 && i10 != profileActivity.f30509w4 && i10 != profileActivity.L4 && i10 != profileActivity.K4 && i10 != profileActivity.U3 && i10 != profileActivity.f30391f3 && i10 != profileActivity.f30405h3 && i10 != profileActivity.f30398g3 && i10 != profileActivity.f30412i3 && i10 != profileActivity.j3 && i10 != profileActivity.f30464q3 && i10 != profileActivity.f30444n3 && i10 != profileActivity.f30425k3 && i10 != profileActivity.f30436m3 && i10 != profileActivity.f30471r3 && i10 != profileActivity.f30479s3 && i10 != profileActivity.f30500v3 && i10 != profileActivity.f30508w3 && i10 != profileActivity.f30515x3 && i10 != profileActivity.y3 && i10 != profileActivity.O2 && i10 != profileActivity.f30354a4 && i10 != profileActivity.Z3 && i10 != profileActivity.f30431l3 && i10 != profileActivity.f30399g4 && i10 != profileActivity.f30392f4 && i10 != profileActivity.B4 && i10 != profileActivity.C4 && i10 != profileActivity.D4) {
                            i11 = profileActivity.botPermissionLocation;
                            if (i10 != i11) {
                                i12 = profileActivity.botPermissionBiometry;
                                if (i10 != i12) {
                                    i13 = profileActivity.botPermissionEmojiStatus;
                                    if (i10 != i13 && i10 != profileActivity.f30384e4) {
                                        if (i10 == profileActivity.M3) {
                                            return 5;
                                        }
                                        if (i10 == profileActivity.N3) {
                                            return 6;
                                        }
                                        if (i10 == profileActivity.Q3) {
                                            return 20;
                                        }
                                        if (i10 != profileActivity.M4 && i10 != profileActivity.H4 && i10 != profileActivity.f30437m4 && i10 != profileActivity.f30480s4 && i10 != profileActivity.f30376d3 && i10 != profileActivity.f30451o3 && i10 != profileActivity.f30486t3 && i10 != profileActivity.P2 && i10 != profileActivity.f30361b3 && i10 != profileActivity.X2 && i10 != profileActivity.f30406h4 && i10 != profileActivity.Y3 && i10 != profileActivity.R2 && i10 != profileActivity.Z2 && i10 != profileActivity.F4 && i10 != profileActivity.f30459p4 && i10 != profileActivity.E4 && i10 != profileActivity.f30426k4) {
                                            if (i10 >= profileActivity.f30494u4 && i10 < profileActivity.f30501v4) {
                                                return 8;
                                            }
                                            if (i10 == profileActivity.A3) {
                                                return 11;
                                            }
                                            if (i10 == profileActivity.B3) {
                                                return 31;
                                            }
                                            if (i10 == profileActivity.C3) {
                                                return 12;
                                            }
                                            if (i10 == profileActivity.J4) {
                                                return 13;
                                            }
                                            if (i10 == profileActivity.f30527z3) {
                                                return 14;
                                            }
                                            if (i10 != profileActivity.f30369c3 && i10 != profileActivity.f30353a3 && i10 != profileActivity.Y2) {
                                                if (i10 == profileActivity.f30362b4) {
                                                    return 17;
                                                }
                                                if (i10 == profileActivity.f30370c4) {
                                                    return 18;
                                                }
                                                if (i10 == profileActivity.f30377d4) {
                                                    return 24;
                                                }
                                                if (i10 == profileActivity.P3) {
                                                    return 21;
                                                }
                                                if (i10 == profileActivity.O3) {
                                                    return 22;
                                                }
                                                if (i10 == profileActivity.Q2) {
                                                    return 23;
                                                }
                                                if (i10 == profileActivity.f30413i4) {
                                                    return 25;
                                                }
                                                if (i10 != profileActivity.R3 && i10 != profileActivity.T3) {
                                                    if (i10 == profileActivity.f30419j4) {
                                                        return 32;
                                                    }
                                                    if (i10 == profileActivity.l4) {
                                                        return 33;
                                                    }
                                                    if (i10 == profileActivity.S3) {
                                                        return 27;
                                                    }
                                                    if (i10 != profileActivity.E3 && i10 != profileActivity.F3) {
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
    public final void v(s4.c1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f11.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        a11 bbVar;
        float f7;
        View c11Var;
        int i12 = 1;
        boolean z11 = false;
        Context context = this.f32669c;
        ProfileActivity profileActivity = this.e;
        switch (i10) {
            case 1:
                org.telegram.ui.ActionBar.f6 f6Var = profileActivity.f30524z0;
                bbVar = new org.telegram.ui.Cells.m4(this.f32669c, org.telegram.ui.ActionBar.j6.L6, 18, 7, false, f6Var);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.f6 f6Var2 = profileActivity.f30524z0;
                if (i10 == 30) {
                    z11 = true;
                }
                if (i10 == 19) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z01 z01Var = new z01(this, this.f32669c, f6Var2, z11, z10);
                z01Var.setContentDescriptionValueFirst(true);
                bbVar = z01Var;
                break;
            case 3:
                a11 a11Var = new a11(this, context, profileActivity, profileActivity.f30524z0);
                profileActivity.N5 = a11Var;
                bbVar = a11Var;
                break;
            case 4:
                bbVar = new rs(this, context, profileActivity.f30524z0);
                break;
            case 5:
                View c3Var = new org.telegram.ui.Cells.c3(context, profileActivity.f30524z0);
                c3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                bbVar = c3Var;
                break;
            case 6:
                bbVar = new b11(this, context, profileActivity.f30524z0);
                break;
            case 7:
                bbVar = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                break;
            case 8:
                if (profileActivity.f30509w4 == -1) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                org.telegram.ui.ActionBar.f6 f6Var3 = profileActivity.f30524z0;
                bbVar = new org.telegram.ui.Cells.bb(i11, 0, this.f32669c, f6Var3, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context, 10, profileActivity.f30524z0);
                f9Var.getTextView().setGravity(1);
                f9Var.getTextView().setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, profileActivity.f30524z0));
                f9Var.getTextView().setMovementMethod(null);
                f9Var.setText(AndroidUtilities.getBuildVersionInfo());
                f9Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                bbVar = f9Var;
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
                bbVar = s3Var;
                break;
            case 12:
                c11Var = new c11(this, context);
                c11Var.setBackground(new ColorDrawable(0));
                c11Var.setTag(-33024);
                bbVar = c11Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                c11Var = profileActivity.O;
                c11Var.setTag(-33024);
                bbVar = c11Var;
                break;
            case 15:
                bbVar = new e11(this, context, profileActivity.f30524z0);
                break;
            case 17:
                bbVar = new org.telegram.ui.Cells.f9(context, profileActivity.f30524z0);
                break;
            case 18:
            case 24:
                if (i10 == 18) {
                    i12 = 0;
                }
                View s1Var = new qg.s1(context, i12, profileActivity.f30524z0);
                s1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, profileActivity.f30524z0));
                bbVar = s1Var;
                break;
            case 20:
                bbVar = new org.telegram.ui.Cells.x8(18, context, profileActivity.f30524z0, false);
                break;
            case 21:
                View q1Var = new gg.q1(context, profileActivity.f30524z0);
                q1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, profileActivity.f30524z0));
                bbVar = q1Var;
                break;
            case 22:
                View d11Var = new d11(this, context, profileActivity.f30524z0);
                d11Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, profileActivity.f30524z0));
                bbVar = d11Var;
                break;
            case 23:
                bbVar = new org.telegram.ui.Cells.i6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                bi.d dVar = new bi.d(context, profileActivity.f30524z0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new u01(this, 0));
                frameLayout.addView(dVar, w7.a6.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, profileActivity.f30524z0));
                bbVar = frameLayout;
                break;
            case 26:
                bbVar = new org.telegram.ui.Cells.f9(context, profileActivity.f30524z0);
                break;
            case 27:
                bbVar = new di.j(context, profileActivity.f30524z0);
                break;
            case 28:
                c11Var = new org.telegram.ui.Components.qn(context, 21);
                c11Var.setTag(-33024);
                bbVar = c11Var;
                break;
            case 32:
                bbVar = new r11(profileActivity, context);
                break;
            case 33:
                bbVar = new fi.c(context, profileActivity.f30524z0);
                break;
        }
        if (i10 != 13) {
            bbVar.setLayoutParams(new s4.p0(-1, -2));
        }
        return new s4.c1(bbVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f41610a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.d9) {
            ((org.telegram.ui.Cells.d9) view).f19011a.setLoading(profileActivity.f30414i5);
            ((org.telegram.ui.Cells.d9) view).f19012b.setLoading(profileActivity.f30414i5);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        View view = c1Var.f41610a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
