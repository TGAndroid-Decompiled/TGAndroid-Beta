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
public final class a11 extends org.telegram.ui.Components.kl0 {
    public final Context f34291c;
    public final HashMap d = new HashMap();
    public final ProfileActivity f34292e;

    public a11(ProfileActivity profileActivity, Context context) {
        this.f34292e = profileActivity;
        this.f34291c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        int b10 = c1Var.b();
        ProfileActivity profileActivity = this.f34292e;
        if (b10 == profileActivity.O2) {
            profileActivity.M2 = null;
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        ProfileActivity profileActivity = this.f34292e;
        if (profileActivity.f33899f3 != -1) {
            int b10 = c1Var.b();
            if (b10 != profileActivity.f33899f3 && b10 != profileActivity.T2 && b10 != profileActivity.f33913h3 && b10 != profileActivity.f33906g3 && b10 != profileActivity.V2 && b10 != profileActivity.W2 && b10 != profileActivity.f34035z3 && b10 != profileActivity.f33920i3 && b10 != profileActivity.j3 && b10 != profileActivity.f33972q3 && b10 != profileActivity.f33952n3 && b10 != profileActivity.f33933k3 && b10 != profileActivity.f33944m3 && b10 != profileActivity.f33979r3 && b10 != profileActivity.f33987s3 && b10 != profileActivity.f34008v3 && b10 != profileActivity.f34016w3 && b10 != profileActivity.f34023x3 && b10 != profileActivity.y3 && b10 != profileActivity.O2 && b10 != profileActivity.f33861a4 && b10 != profileActivity.f33877c4 && b10 != profileActivity.f33907g4 && b10 != profileActivity.f33900f4 && b10 != profileActivity.f33939l3 && b10 != profileActivity.U2 && b10 != profileActivity.Q2 && b10 != profileActivity.f33884d4 && b10 != profileActivity.f33892e4 && b10 != profileActivity.l4) {
                return false;
            }
        } else {
            View view = c1Var.f45739a;
            if (view instanceof org.telegram.ui.Cells.za) {
                Object currentObject = ((org.telegram.ui.Cells.za) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = c1Var.f45743f;
            if (i10 == 1 || i10 == 5 || i10 == 7 || i10 == 11 || i10 == 31 || i10 == 28 || i10 == 12 || i10 == 13 || i10 == 9 || i10 == 10 || i10 == 25 || i10 == 32) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.CharSequence E(java.lang.String r7, java.util.ArrayList r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a11.E(java.lang.String, java.util.ArrayList, java.lang.String):java.lang.CharSequence");
    }

    @Override
    public final int h() {
        return this.f34292e.N2;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.f34292e;
        if (i10 != profileActivity.D3 && i10 != profileActivity.f33995t4 && i10 != profileActivity.f33891e3 && i10 != profileActivity.S2 && i10 != profileActivity.f33966p3 && i10 != profileActivity.f34001u3 && i10 != profileActivity.f33953n4) {
            if (i10 != profileActivity.G3 && i10 != profileActivity.I3 && i10 != profileActivity.T2 && i10 != profileActivity.U2) {
                if (i10 != profileActivity.L3 && i10 != profileActivity.V2) {
                    if (i10 == profileActivity.H3) {
                        return 30;
                    }
                    if (i10 != profileActivity.J3 && i10 != profileActivity.K3 && i10 != profileActivity.W2) {
                        if (i10 != profileActivity.f33973q4 && i10 != profileActivity.f33980r4 && i10 != profileActivity.V3 && i10 != profileActivity.X3 && i10 != profileActivity.W3 && i10 != profileActivity.f34024x4 && i10 != profileActivity.f34030y4 && i10 != profileActivity.f34036z4 && i10 != profileActivity.A4 && i10 != profileActivity.G4 && i10 != profileActivity.f34017w4 && i10 != profileActivity.L4 && i10 != profileActivity.K4 && i10 != profileActivity.U3 && i10 != profileActivity.f33899f3 && i10 != profileActivity.f33913h3 && i10 != profileActivity.f33906g3 && i10 != profileActivity.f33920i3 && i10 != profileActivity.j3 && i10 != profileActivity.f33972q3 && i10 != profileActivity.f33952n3 && i10 != profileActivity.f33933k3 && i10 != profileActivity.f33944m3 && i10 != profileActivity.f33979r3 && i10 != profileActivity.f33987s3 && i10 != profileActivity.f34008v3 && i10 != profileActivity.f34016w3 && i10 != profileActivity.f34023x3 && i10 != profileActivity.y3 && i10 != profileActivity.O2 && i10 != profileActivity.f33861a4 && i10 != profileActivity.Z3 && i10 != profileActivity.f33939l3 && i10 != profileActivity.f33907g4 && i10 != profileActivity.f33900f4 && i10 != profileActivity.B4 && i10 != profileActivity.C4 && i10 != profileActivity.D4) {
                            i11 = profileActivity.botPermissionLocation;
                            if (i10 != i11) {
                                i12 = profileActivity.botPermissionBiometry;
                                if (i10 != i12) {
                                    i13 = profileActivity.botPermissionEmojiStatus;
                                    if (i10 != i13 && i10 != profileActivity.f33892e4) {
                                        if (i10 == profileActivity.M3) {
                                            return 5;
                                        }
                                        if (i10 == profileActivity.N3) {
                                            return 6;
                                        }
                                        if (i10 == profileActivity.Q3) {
                                            return 20;
                                        }
                                        if (i10 != profileActivity.M4 && i10 != profileActivity.H4 && i10 != profileActivity.f33945m4 && i10 != profileActivity.f33988s4 && i10 != profileActivity.f33883d3 && i10 != profileActivity.f33959o3 && i10 != profileActivity.f33994t3 && i10 != profileActivity.P2 && i10 != profileActivity.f33868b3 && i10 != profileActivity.X2 && i10 != profileActivity.f33914h4 && i10 != profileActivity.Y3 && i10 != profileActivity.R2 && i10 != profileActivity.Z2 && i10 != profileActivity.F4 && i10 != profileActivity.f33967p4 && i10 != profileActivity.E4 && i10 != profileActivity.f33934k4) {
                                            if (i10 >= profileActivity.f34002u4 && i10 < profileActivity.f34009v4) {
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
                                            if (i10 == profileActivity.f34035z3) {
                                                return 14;
                                            }
                                            if (i10 != profileActivity.f33876c3 && i10 != profileActivity.f33860a3 && i10 != profileActivity.Y2) {
                                                if (i10 == profileActivity.f33869b4) {
                                                    return 17;
                                                }
                                                if (i10 == profileActivity.f33877c4) {
                                                    return 18;
                                                }
                                                if (i10 == profileActivity.f33884d4) {
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
                                                if (i10 == profileActivity.f33921i4) {
                                                    return 25;
                                                }
                                                if (i10 != profileActivity.R3 && i10 != profileActivity.T3) {
                                                    if (i10 == profileActivity.f33927j4) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a11.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        v01 zaVar;
        float f7;
        View x01Var;
        int i12 = 1;
        boolean z11 = false;
        Context context = this.f34291c;
        ProfileActivity profileActivity = this.f34292e;
        switch (i10) {
            case 1:
                org.telegram.ui.ActionBar.f6 f6Var = profileActivity.f34032z0;
                zaVar = new org.telegram.ui.Cells.l4(this.f34291c, org.telegram.ui.ActionBar.j6.L6, 18, 7, false, f6Var);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.f6 f6Var2 = profileActivity.f34032z0;
                if (i10 == 30) {
                    z11 = true;
                }
                if (i10 == 19) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u01 u01Var = new u01(this, this.f34291c, f6Var2, z11, z10);
                u01Var.setContentDescriptionValueFirst(true);
                zaVar = u01Var;
                break;
            case 3:
                v01 v01Var = new v01(this, context, profileActivity, profileActivity.f34032z0);
                profileActivity.N5 = v01Var;
                zaVar = v01Var;
                break;
            case 4:
                zaVar = new qs(this, context, profileActivity.f34032z0);
                break;
            case 5:
                View c3Var = new org.telegram.ui.Cells.c3(context, profileActivity.f34032z0);
                c3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                zaVar = c3Var;
                break;
            case 6:
                zaVar = new w01(this, context, profileActivity.f34032z0);
                break;
            case 7:
                zaVar = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                break;
            case 8:
                if (profileActivity.f34017w4 == -1) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                org.telegram.ui.ActionBar.f6 f6Var3 = profileActivity.f34032z0;
                zaVar = new org.telegram.ui.Cells.za(i11, 0, this.f34291c, f6Var3, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 10, profileActivity.f34032z0);
                e9Var.getTextView().setGravity(1);
                e9Var.getTextView().setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, profileActivity.f34032z0));
                e9Var.getTextView().setMovementMethod(null);
                e9Var.setText(AndroidUtilities.getBuildVersionInfo());
                e9Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                zaVar = e9Var;
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
                zaVar = s3Var;
                break;
            case 12:
                x01Var = new x01(this, context);
                x01Var.setBackground(new ColorDrawable(0));
                x01Var.setTag(-33024);
                zaVar = x01Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                x01Var = profileActivity.O;
                x01Var.setTag(-33024);
                zaVar = x01Var;
                break;
            case 15:
                zaVar = new z01(this, context, profileActivity.f34032z0);
                break;
            case 17:
                zaVar = new org.telegram.ui.Cells.e9(context, profileActivity.f34032z0);
                break;
            case 18:
            case 24:
                if (i10 == 18) {
                    i12 = 0;
                }
                View u1Var = new sg.u1(context, i12, profileActivity.f34032z0);
                u1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20664d6, profileActivity.f34032z0));
                zaVar = u1Var;
                break;
            case 20:
                zaVar = new org.telegram.ui.Cells.w8(18, context, profileActivity.f34032z0, false);
                break;
            case 21:
                View k1Var = new ig.k1(context, profileActivity.f34032z0);
                k1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20664d6, profileActivity.f34032z0));
                zaVar = k1Var;
                break;
            case 22:
                View y01Var = new y01(this, context, profileActivity.f34032z0);
                y01Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20664d6, profileActivity.f34032z0));
                zaVar = y01Var;
                break;
            case 23:
                zaVar = new org.telegram.ui.Cells.g6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                di.d dVar = new di.d(context, profileActivity.f34032z0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new p01(this, 0));
                frameLayout.addView(dVar, w7.x5.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20664d6, profileActivity.f34032z0));
                zaVar = frameLayout;
                break;
            case 26:
                zaVar = new org.telegram.ui.Cells.e9(context, profileActivity.f34032z0);
                break;
            case 27:
                zaVar = new fi.j(context, profileActivity.f34032z0);
                break;
            case 28:
                x01Var = new org.telegram.ui.Components.jn(context, 22);
                x01Var.setTag(-33024);
                zaVar = x01Var;
                break;
            case 32:
                zaVar = new n11(profileActivity, context);
                break;
            case 33:
                zaVar = new hi.c(context, profileActivity.f34032z0);
                break;
        }
        if (i10 != 13) {
            zaVar.setLayoutParams(new s4.p0(-1, -2));
        }
        return new s4.c1(zaVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f45739a;
        ProfileActivity profileActivity = this.f34292e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.c9) {
            ((org.telegram.ui.Cells.c9) view).f21705a.setLoading(profileActivity.f33922i5);
            ((org.telegram.ui.Cells.c9) view).f21706b.setLoading(profileActivity.f33922i5);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        View view = c1Var.f45739a;
        ProfileActivity profileActivity = this.f34292e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
