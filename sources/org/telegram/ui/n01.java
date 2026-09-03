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
public final class n01 extends org.telegram.ui.Components.rl0 {
    public final Context f39151c;
    public final HashMap d = new HashMap();
    public final ProfileActivity f39152e;

    public n01(ProfileActivity profileActivity, Context context) {
        this.f39152e = profileActivity;
        this.f39151c = context;
    }

    @Override
    public final void A(f2.m1 m1Var) {
        int b10 = m1Var.b();
        ProfileActivity profileActivity = this.f39152e;
        if (b10 == profileActivity.L2) {
            profileActivity.J2 = null;
        }
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        ProfileActivity profileActivity = this.f39152e;
        if (profileActivity.c3 != -1) {
            int b10 = m1Var.b();
            if (b10 != profileActivity.c3 && b10 != profileActivity.Q2 && b10 != profileActivity.f34593e3 && b10 != profileActivity.f34585d3 && b10 != profileActivity.S2 && b10 != profileActivity.T2 && b10 != profileActivity.f34717w3 && b10 != profileActivity.f34600f3 && b10 != profileActivity.f34607g3 && b10 != profileActivity.f34655n3 && b10 != profileActivity.f34635k3 && b10 != profileActivity.f34614h3 && b10 != profileActivity.f34628j3 && b10 != profileActivity.f34662o3 && b10 != profileActivity.f34669p3 && b10 != profileActivity.f34692s3 && b10 != profileActivity.f34698t3 && b10 != profileActivity.f34704u3 && b10 != profileActivity.f34710v3 && b10 != profileActivity.L2 && b10 != profileActivity.X3 && b10 != profileActivity.Z3 && b10 != profileActivity.f34586d4 && b10 != profileActivity.f34579c4 && b10 != profileActivity.f34621i3 && b10 != profileActivity.R2 && b10 != profileActivity.N2 && b10 != profileActivity.f34564a4 && b10 != profileActivity.f34572b4 && b10 != profileActivity.f34622i4) {
                return false;
            }
        } else {
            View view = m1Var.f5875a;
            if (view instanceof org.telegram.ui.Cells.va) {
                Object currentObject = ((org.telegram.ui.Cells.va) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = m1Var.f5879f;
            if (i10 == 1 || i10 == 5 || i10 == 7 || i10 == 11 || i10 == 31 || i10 == 28 || i10 == 12 || i10 == 13 || i10 == 9 || i10 == 10 || i10 == 25 || i10 == 32) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.CharSequence E(java.lang.String r7, java.util.ArrayList r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n01.E(java.lang.String, java.util.ArrayList, java.lang.String):java.lang.CharSequence");
    }

    @Override
    public final int h() {
        return this.f39152e.K2;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.f39152e;
        if (i10 != profileActivity.A3 && i10 != profileActivity.f34677q4 && i10 != profileActivity.f34571b3 && i10 != profileActivity.P2 && i10 != profileActivity.f34647m3 && i10 != profileActivity.f34684r3 && i10 != profileActivity.f34636k4) {
            if (i10 != profileActivity.D3 && i10 != profileActivity.F3 && i10 != profileActivity.Q2 && i10 != profileActivity.R2) {
                if (i10 != profileActivity.I3 && i10 != profileActivity.S2) {
                    if (i10 == profileActivity.E3) {
                        return 30;
                    }
                    if (i10 != profileActivity.G3 && i10 != profileActivity.H3 && i10 != profileActivity.T2) {
                        if (i10 != profileActivity.f34656n4 && i10 != profileActivity.f34663o4 && i10 != profileActivity.S3 && i10 != profileActivity.U3 && i10 != profileActivity.T3 && i10 != profileActivity.f34705u4 && i10 != profileActivity.f34711v4 && i10 != profileActivity.f34718w4 && i10 != profileActivity.f34725x4 && i10 != profileActivity.D4 && i10 != profileActivity.f34699t4 && i10 != profileActivity.I4 && i10 != profileActivity.H4 && i10 != profileActivity.R3 && i10 != profileActivity.c3 && i10 != profileActivity.f34593e3 && i10 != profileActivity.f34585d3 && i10 != profileActivity.f34600f3 && i10 != profileActivity.f34607g3 && i10 != profileActivity.f34655n3 && i10 != profileActivity.f34635k3 && i10 != profileActivity.f34614h3 && i10 != profileActivity.f34628j3 && i10 != profileActivity.f34662o3 && i10 != profileActivity.f34669p3 && i10 != profileActivity.f34692s3 && i10 != profileActivity.f34698t3 && i10 != profileActivity.f34704u3 && i10 != profileActivity.f34710v3 && i10 != profileActivity.L2 && i10 != profileActivity.X3 && i10 != profileActivity.W3 && i10 != profileActivity.f34621i3 && i10 != profileActivity.f34586d4 && i10 != profileActivity.f34579c4 && i10 != profileActivity.f34732y4 && i10 != profileActivity.z4 && i10 != profileActivity.A4) {
                            i11 = profileActivity.botPermissionLocation;
                            if (i10 != i11) {
                                i12 = profileActivity.botPermissionBiometry;
                                if (i10 != i12) {
                                    i13 = profileActivity.botPermissionEmojiStatus;
                                    if (i10 != i13 && i10 != profileActivity.f34572b4) {
                                        if (i10 == profileActivity.J3) {
                                            return 5;
                                        }
                                        if (i10 == profileActivity.K3) {
                                            return 6;
                                        }
                                        if (i10 == profileActivity.N3) {
                                            return 20;
                                        }
                                        if (i10 != profileActivity.J4 && i10 != profileActivity.E4 && i10 != profileActivity.f34629j4 && i10 != profileActivity.f34670p4 && i10 != profileActivity.f34563a3 && i10 != profileActivity.f34641l3 && i10 != profileActivity.f34676q3 && i10 != profileActivity.M2 && i10 != profileActivity.Y2 && i10 != profileActivity.U2 && i10 != profileActivity.f34594e4 && i10 != profileActivity.V3 && i10 != profileActivity.O2 && i10 != profileActivity.W2 && i10 != profileActivity.C4 && i10 != profileActivity.f34648m4 && i10 != profileActivity.B4 && i10 != profileActivity.f34615h4) {
                                            if (i10 >= profileActivity.f34685r4 && i10 < profileActivity.f34693s4) {
                                                return 8;
                                            }
                                            if (i10 == profileActivity.f34724x3) {
                                                return 11;
                                            }
                                            if (i10 == profileActivity.f34731y3) {
                                                return 31;
                                            }
                                            if (i10 == profileActivity.f34737z3) {
                                                return 12;
                                            }
                                            if (i10 == profileActivity.G4) {
                                                return 13;
                                            }
                                            if (i10 == profileActivity.f34717w3) {
                                                return 14;
                                            }
                                            if (i10 != profileActivity.Z2 && i10 != profileActivity.X2 && i10 != profileActivity.V2) {
                                                if (i10 == profileActivity.Y3) {
                                                    return 17;
                                                }
                                                if (i10 == profileActivity.Z3) {
                                                    return 18;
                                                }
                                                if (i10 == profileActivity.f34564a4) {
                                                    return 24;
                                                }
                                                if (i10 == profileActivity.M3) {
                                                    return 21;
                                                }
                                                if (i10 == profileActivity.L3) {
                                                    return 22;
                                                }
                                                if (i10 == profileActivity.N2) {
                                                    return 23;
                                                }
                                                if (i10 == profileActivity.f34601f4) {
                                                    return 25;
                                                }
                                                if (i10 != profileActivity.O3 && i10 != profileActivity.Q3) {
                                                    if (i10 == profileActivity.f34608g4) {
                                                        return 32;
                                                    }
                                                    if (i10 == profileActivity.f34622i4) {
                                                        return 33;
                                                    }
                                                    if (i10 == profileActivity.P3) {
                                                        return 27;
                                                    }
                                                    if (i10 != profileActivity.B3 && i10 != profileActivity.C3) {
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
    public final void v(f2.m1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n01.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        boolean z4;
        int i11;
        i01 vaVar;
        float f10;
        View k01Var;
        int i12 = 1;
        boolean z10 = false;
        Context context = this.f39151c;
        ProfileActivity profileActivity = this.f39152e;
        switch (i10) {
            case 1:
                org.telegram.ui.ActionBar.g6 g6Var = profileActivity.f34714w0;
                vaVar = new org.telegram.ui.Cells.m4(this.f39151c, org.telegram.ui.ActionBar.k6.L6, 18, 7, false, g6Var);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.g6 g6Var2 = profileActivity.f34714w0;
                if (i10 == 30) {
                    z10 = true;
                }
                if (i10 == 19) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h01 h01Var = new h01(this, this.f39151c, g6Var2, z10, z4);
                h01Var.setContentDescriptionValueFirst(true);
                vaVar = h01Var;
                break;
            case 3:
                i01 i01Var = new i01(this, context, profileActivity, profileActivity.f34714w0);
                profileActivity.K5 = i01Var;
                vaVar = i01Var;
                break;
            case 4:
                vaVar = new ms(this, context, profileActivity.f34714w0);
                break;
            case 5:
                View c3Var = new org.telegram.ui.Cells.c3(context, profileActivity.f34714w0);
                c3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                vaVar = c3Var;
                break;
            case 6:
                vaVar = new j01(this, context, profileActivity.f34714w0);
                break;
            case 7:
                vaVar = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 8:
                if (profileActivity.f34699t4 == -1) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                org.telegram.ui.ActionBar.g6 g6Var3 = profileActivity.f34714w0;
                vaVar = new org.telegram.ui.Cells.va(i11, 0, this.f39151c, g6Var3, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context, 10, profileActivity.f34714w0);
                a9Var.getTextView().setGravity(1);
                a9Var.getTextView().setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A6, profileActivity.f34714w0));
                a9Var.getTextView().setMovementMethod(null);
                a9Var.setText(AndroidUtilities.getBuildVersionInfo());
                a9Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                vaVar = a9Var;
                break;
            case 11:
            case 31:
                if (i10 == 31) {
                    f10 = 12.0f;
                } else {
                    f10 = 6.0f;
                }
                View s3Var = new org.telegram.ui.Cells.s3(context, AndroidUtilities.dp(f10), 2);
                s3Var.setTag(-33024);
                vaVar = s3Var;
                break;
            case 12:
                k01Var = new k01(this, context);
                k01Var.setBackground(new ColorDrawable(0));
                k01Var.setTag(-33024);
                vaVar = k01Var;
                break;
            case 13:
                if (profileActivity.L.getParent() != null) {
                    ((ViewGroup) profileActivity.L.getParent()).removeView(profileActivity.L);
                }
                k01Var = profileActivity.L;
                k01Var.setTag(-33024);
                vaVar = k01Var;
                break;
            case 15:
                vaVar = new m01(this, context, profileActivity.f34714w0);
                break;
            case 17:
                vaVar = new org.telegram.ui.Cells.a9(context, profileActivity.f34714w0);
                break;
            case 18:
            case 24:
                if (i10 == 18) {
                    i12 = 0;
                }
                View k2Var = new fg.k2(context, i12, profileActivity.f34714w0);
                k2Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21661d6, profileActivity.f34714w0));
                vaVar = k2Var;
                break;
            case 20:
                vaVar = new org.telegram.ui.Cells.s8(18, context, profileActivity.f34714w0, false);
                break;
            case 21:
                View b1Var = new vf.b1(context, profileActivity.f34714w0);
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21661d6, profileActivity.f34714w0));
                vaVar = b1Var;
                break;
            case 22:
                View l01Var = new l01(this, context, profileActivity.f34714w0);
                l01Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21661d6, profileActivity.f34714w0));
                vaVar = l01Var;
                break;
            case 23:
                vaVar = new org.telegram.ui.Cells.g6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                qh.d dVar = new qh.d(context, profileActivity.f34714w0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new c01(this, 0));
                frameLayout.addView(dVar, k7.c6.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21661d6, profileActivity.f34714w0));
                vaVar = frameLayout;
                break;
            case 26:
                vaVar = new org.telegram.ui.Cells.a9(context, profileActivity.f34714w0);
                break;
            case 27:
                vaVar = new sh.g(context, profileActivity.f34714w0);
                break;
            case 28:
                k01Var = new org.telegram.ui.Components.in(context, 19);
                k01Var.setTag(-33024);
                vaVar = k01Var;
                break;
            case 32:
                vaVar = new z01(profileActivity, context);
                break;
            case 33:
                vaVar = new uh.b(context, profileActivity.f34714w0);
                break;
        }
        if (i10 != 13) {
            vaVar.setLayoutParams(new f2.x0(-1, -2));
        }
        return new f2.m1(vaVar);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        ProfileActivity profileActivity = this.f39152e;
        if (view == profileActivity.L) {
            profileActivity.N = true;
        }
        if (view instanceof org.telegram.ui.Cells.y8) {
            ((org.telegram.ui.Cells.y8) view).f24452a.setLoading(profileActivity.f34602f5);
            ((org.telegram.ui.Cells.y8) view).f24453b.setLoading(profileActivity.f34602f5);
        }
    }

    @Override
    public final void z(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        ProfileActivity profileActivity = this.f39152e;
        if (view == profileActivity.L) {
            profileActivity.N = false;
        }
    }
}
