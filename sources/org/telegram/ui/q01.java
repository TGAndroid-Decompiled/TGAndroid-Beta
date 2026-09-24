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
public final class q01 extends org.telegram.ui.Components.vl0 {
    public final Context f36705c;
    public final HashMap d = new HashMap();
    public final ProfileActivity e;

    public q01(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.f36705c = context;
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
        if (profileActivity.f31551f3 != -1) {
            int b10 = c1Var.b();
            if (b10 != profileActivity.f31551f3 && b10 != profileActivity.T2 && b10 != profileActivity.f31565h3 && b10 != profileActivity.f31558g3 && b10 != profileActivity.V2 && b10 != profileActivity.W2 && b10 != profileActivity.f31687z3 && b10 != profileActivity.f31572i3 && b10 != profileActivity.j3 && b10 != profileActivity.f31624q3 && b10 != profileActivity.f31604n3 && b10 != profileActivity.f31585k3 && b10 != profileActivity.f31596m3 && b10 != profileActivity.f31631r3 && b10 != profileActivity.f31639s3 && b10 != profileActivity.f31660v3 && b10 != profileActivity.f31668w3 && b10 != profileActivity.f31675x3 && b10 != profileActivity.y3 && b10 != profileActivity.O2 && b10 != profileActivity.f31514a4 && b10 != profileActivity.f31530c4 && b10 != profileActivity.f31559g4 && b10 != profileActivity.f31552f4 && b10 != profileActivity.f31591l3 && b10 != profileActivity.U2 && b10 != profileActivity.Q2 && b10 != profileActivity.f31537d4 && b10 != profileActivity.f31544e4 && b10 != profileActivity.l4) {
                return false;
            }
        } else {
            View view = c1Var.f42946a;
            if (view instanceof org.telegram.ui.Cells.za) {
                Object currentObject = ((org.telegram.ui.Cells.za) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = c1Var.f42949f;
            if (i10 == 1 || i10 == 5 || i10 == 7 || i10 == 11 || i10 == 31 || i10 == 28 || i10 == 12 || i10 == 13 || i10 == 9 || i10 == 10 || i10 == 25 || i10 == 32) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.CharSequence E(java.lang.String r7, java.util.ArrayList r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q01.E(java.lang.String, java.util.ArrayList, java.lang.String):java.lang.CharSequence");
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
        if (i10 != profileActivity.D3 && i10 != profileActivity.f31647t4 && i10 != profileActivity.f31543e3 && i10 != profileActivity.S2 && i10 != profileActivity.f31618p3 && i10 != profileActivity.f31653u3 && i10 != profileActivity.f31605n4) {
            if (i10 != profileActivity.G3 && i10 != profileActivity.I3 && i10 != profileActivity.T2 && i10 != profileActivity.U2) {
                if (i10 != profileActivity.L3 && i10 != profileActivity.V2) {
                    if (i10 == profileActivity.H3) {
                        return 30;
                    }
                    if (i10 != profileActivity.J3 && i10 != profileActivity.K3 && i10 != profileActivity.W2) {
                        if (i10 != profileActivity.f31625q4 && i10 != profileActivity.f31632r4 && i10 != profileActivity.V3 && i10 != profileActivity.X3 && i10 != profileActivity.W3 && i10 != profileActivity.f31676x4 && i10 != profileActivity.f31682y4 && i10 != profileActivity.f31688z4 && i10 != profileActivity.A4 && i10 != profileActivity.G4 && i10 != profileActivity.f31669w4 && i10 != profileActivity.L4 && i10 != profileActivity.K4 && i10 != profileActivity.U3 && i10 != profileActivity.f31551f3 && i10 != profileActivity.f31565h3 && i10 != profileActivity.f31558g3 && i10 != profileActivity.f31572i3 && i10 != profileActivity.j3 && i10 != profileActivity.f31624q3 && i10 != profileActivity.f31604n3 && i10 != profileActivity.f31585k3 && i10 != profileActivity.f31596m3 && i10 != profileActivity.f31631r3 && i10 != profileActivity.f31639s3 && i10 != profileActivity.f31660v3 && i10 != profileActivity.f31668w3 && i10 != profileActivity.f31675x3 && i10 != profileActivity.y3 && i10 != profileActivity.O2 && i10 != profileActivity.f31514a4 && i10 != profileActivity.Z3 && i10 != profileActivity.f31591l3 && i10 != profileActivity.f31559g4 && i10 != profileActivity.f31552f4 && i10 != profileActivity.B4 && i10 != profileActivity.C4 && i10 != profileActivity.D4) {
                            i11 = profileActivity.botPermissionLocation;
                            if (i10 != i11) {
                                i12 = profileActivity.botPermissionBiometry;
                                if (i10 != i12) {
                                    i13 = profileActivity.botPermissionEmojiStatus;
                                    if (i10 != i13 && i10 != profileActivity.f31544e4) {
                                        if (i10 == profileActivity.M3) {
                                            return 5;
                                        }
                                        if (i10 == profileActivity.N3) {
                                            return 6;
                                        }
                                        if (i10 == profileActivity.Q3) {
                                            return 20;
                                        }
                                        if (i10 != profileActivity.M4 && i10 != profileActivity.H4 && i10 != profileActivity.f31597m4 && i10 != profileActivity.f31640s4 && i10 != profileActivity.f31536d3 && i10 != profileActivity.f31611o3 && i10 != profileActivity.f31646t3 && i10 != profileActivity.P2 && i10 != profileActivity.f31521b3 && i10 != profileActivity.X2 && i10 != profileActivity.f31566h4 && i10 != profileActivity.Y3 && i10 != profileActivity.R2 && i10 != profileActivity.Z2 && i10 != profileActivity.F4 && i10 != profileActivity.f31619p4 && i10 != profileActivity.E4 && i10 != profileActivity.f31586k4) {
                                            if (i10 >= profileActivity.f31654u4 && i10 < profileActivity.f31661v4) {
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
                                            if (i10 == profileActivity.f31687z3) {
                                                return 14;
                                            }
                                            if (i10 != profileActivity.f31529c3 && i10 != profileActivity.f31513a3 && i10 != profileActivity.Y2) {
                                                if (i10 == profileActivity.f31522b4) {
                                                    return 17;
                                                }
                                                if (i10 == profileActivity.f31530c4) {
                                                    return 18;
                                                }
                                                if (i10 == profileActivity.f31537d4) {
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
                                                if (i10 == profileActivity.f31573i4) {
                                                    return 25;
                                                }
                                                if (i10 != profileActivity.R3 && i10 != profileActivity.T3) {
                                                    if (i10 == profileActivity.f31579j4) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q01.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        l01 zaVar;
        float f7;
        View n01Var;
        int i12 = 1;
        boolean z11 = false;
        Context context = this.f36705c;
        ProfileActivity profileActivity = this.e;
        switch (i10) {
            case 1:
                org.telegram.ui.ActionBar.d6 d6Var = profileActivity.f31684z0;
                zaVar = new org.telegram.ui.Cells.m4(this.f36705c, org.telegram.ui.ActionBar.h6.L6, 18, 7, false, d6Var);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.d6 d6Var2 = profileActivity.f31684z0;
                if (i10 == 30) {
                    z11 = true;
                }
                if (i10 == 19) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k01 k01Var = new k01(this, this.f36705c, d6Var2, z11, z10);
                k01Var.setContentDescriptionValueFirst(true);
                zaVar = k01Var;
                break;
            case 3:
                l01 l01Var = new l01(this, context, profileActivity, profileActivity.f31684z0);
                profileActivity.N5 = l01Var;
                zaVar = l01Var;
                break;
            case 4:
                zaVar = new ks(this, context, profileActivity.f31684z0);
                break;
            case 5:
                View d3Var = new org.telegram.ui.Cells.d3(context, profileActivity.f31684z0);
                d3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                zaVar = d3Var;
                break;
            case 6:
                zaVar = new m01(this, context, profileActivity.f31684z0);
                break;
            case 7:
                zaVar = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                if (profileActivity.f31669w4 == -1) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                org.telegram.ui.ActionBar.d6 d6Var3 = profileActivity.f31684z0;
                zaVar = new org.telegram.ui.Cells.za(i11, 0, this.f36705c, d6Var3, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 10, profileActivity.f31684z0);
                e9Var.getTextView().setGravity(1);
                e9Var.getTextView().setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A6, profileActivity.f31684z0));
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
                View t3Var = new org.telegram.ui.Cells.t3(context, AndroidUtilities.dp(f7), 2);
                t3Var.setTag(-33024);
                zaVar = t3Var;
                break;
            case 12:
                n01Var = new n01(this, context);
                n01Var.setBackground(new ColorDrawable(0));
                n01Var.setTag(-33024);
                zaVar = n01Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                n01Var = profileActivity.O;
                n01Var.setTag(-33024);
                zaVar = n01Var;
                break;
            case 15:
                zaVar = new p01(this, context, profileActivity.f31684z0);
                break;
            case 17:
                zaVar = new org.telegram.ui.Cells.e9(context, profileActivity.f31684z0);
                break;
            case 18:
            case 24:
                if (i10 == 18) {
                    i12 = 0;
                }
                View r1Var = new rg.r1(context, i12, profileActivity.f31684z0);
                r1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19045d6, profileActivity.f31684z0));
                zaVar = r1Var;
                break;
            case 20:
                zaVar = new org.telegram.ui.Cells.w8(18, context, profileActivity.f31684z0, false);
                break;
            case 21:
                View l1Var = new hg.l1(context, profileActivity.f31684z0);
                l1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19045d6, profileActivity.f31684z0));
                zaVar = l1Var;
                break;
            case 22:
                View o01Var = new o01(this, context, profileActivity.f31684z0);
                o01Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19045d6, profileActivity.f31684z0));
                zaVar = o01Var;
                break;
            case 23:
                zaVar = new org.telegram.ui.Cells.h6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                ci.d dVar = new ci.d(context, profileActivity.f31684z0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new f01(this, 0));
                frameLayout.addView(dVar, w7.y5.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19045d6, profileActivity.f31684z0));
                zaVar = frameLayout;
                break;
            case 26:
                zaVar = new org.telegram.ui.Cells.e9(context, profileActivity.f31684z0);
                break;
            case 27:
                zaVar = new ei.i(context, profileActivity.f31684z0);
                break;
            case 28:
                n01Var = new org.telegram.ui.Components.ln(context, 22);
                n01Var.setTag(-33024);
                zaVar = n01Var;
                break;
            case 32:
                zaVar = new c11(profileActivity, context);
                break;
            case 33:
                zaVar = new gi.c(context, profileActivity.f31684z0);
                break;
        }
        if (i10 != 13) {
            zaVar.setLayoutParams(new s4.p0(-1, -2));
        }
        return new s4.c1(zaVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f42946a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.c9) {
            ((org.telegram.ui.Cells.c9) view).f20092a.setLoading(profileActivity.f31574i5);
            ((org.telegram.ui.Cells.c9) view).f20093b.setLoading(profileActivity.f31574i5);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        View view = c1Var.f42946a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
