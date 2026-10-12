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
public final class a11 extends org.telegram.ui.Components.vm0 {
    public final Context f35663c;
    public final HashMap d = new HashMap();
    public final ProfileActivity f35664e;

    public a11(ProfileActivity profileActivity, Context context) {
        this.f35664e = profileActivity;
        this.f35663c = context;
    }

    @Override
    public final void A(s4.d1 d1Var) {
        int b10 = d1Var.b();
        ProfileActivity profileActivity = this.f35664e;
        if (b10 == profileActivity.O2) {
            profileActivity.M2 = null;
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        ProfileActivity profileActivity = this.f35664e;
        if (profileActivity.f34090f3 != -1) {
            int b10 = d1Var.b();
            if (b10 != profileActivity.f34090f3 && b10 != profileActivity.T2 && b10 != profileActivity.f34104h3 && b10 != profileActivity.f34097g3 && b10 != profileActivity.V2 && b10 != profileActivity.W2 && b10 != profileActivity.f34226z3 && b10 != profileActivity.f34111i3 && b10 != profileActivity.j3 && b10 != profileActivity.f34163q3 && b10 != profileActivity.f34143n3 && b10 != profileActivity.f34124k3 && b10 != profileActivity.f34135m3 && b10 != profileActivity.f34170r3 && b10 != profileActivity.f34178s3 && b10 != profileActivity.f34199v3 && b10 != profileActivity.f34207w3 && b10 != profileActivity.f34214x3 && b10 != profileActivity.y3 && b10 != profileActivity.O2 && b10 != profileActivity.f34052a4 && b10 != profileActivity.f34068c4 && b10 != profileActivity.f34098g4 && b10 != profileActivity.f34091f4 && b10 != profileActivity.f34130l3 && b10 != profileActivity.U2 && b10 != profileActivity.Q2 && b10 != profileActivity.f34075d4 && b10 != profileActivity.f34083e4 && b10 != profileActivity.l4) {
                return false;
            }
        } else {
            View view = d1Var.f47889a;
            if (view instanceof org.telegram.ui.Cells.xa) {
                Object currentObject = ((org.telegram.ui.Cells.xa) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = d1Var.f47893f;
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
        return this.f35664e.N2;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.f35664e;
        if (i10 != profileActivity.D3 && i10 != profileActivity.f34186t4 && i10 != profileActivity.f34082e3 && i10 != profileActivity.S2 && i10 != profileActivity.f34157p3 && i10 != profileActivity.f34192u3 && i10 != profileActivity.f34144n4) {
            if (i10 != profileActivity.G3 && i10 != profileActivity.I3 && i10 != profileActivity.T2 && i10 != profileActivity.U2) {
                if (i10 != profileActivity.L3 && i10 != profileActivity.V2) {
                    if (i10 == profileActivity.H3) {
                        return 30;
                    }
                    if (i10 != profileActivity.J3 && i10 != profileActivity.K3 && i10 != profileActivity.W2) {
                        if (i10 != profileActivity.f34164q4 && i10 != profileActivity.f34171r4 && i10 != profileActivity.V3 && i10 != profileActivity.X3 && i10 != profileActivity.W3 && i10 != profileActivity.f34215x4 && i10 != profileActivity.f34221y4 && i10 != profileActivity.f34227z4 && i10 != profileActivity.A4 && i10 != profileActivity.G4 && i10 != profileActivity.f34208w4 && i10 != profileActivity.L4 && i10 != profileActivity.K4 && i10 != profileActivity.U3 && i10 != profileActivity.f34090f3 && i10 != profileActivity.f34104h3 && i10 != profileActivity.f34097g3 && i10 != profileActivity.f34111i3 && i10 != profileActivity.j3 && i10 != profileActivity.f34163q3 && i10 != profileActivity.f34143n3 && i10 != profileActivity.f34124k3 && i10 != profileActivity.f34135m3 && i10 != profileActivity.f34170r3 && i10 != profileActivity.f34178s3 && i10 != profileActivity.f34199v3 && i10 != profileActivity.f34207w3 && i10 != profileActivity.f34214x3 && i10 != profileActivity.y3 && i10 != profileActivity.O2 && i10 != profileActivity.f34052a4 && i10 != profileActivity.Z3 && i10 != profileActivity.f34130l3 && i10 != profileActivity.f34098g4 && i10 != profileActivity.f34091f4 && i10 != profileActivity.B4 && i10 != profileActivity.C4 && i10 != profileActivity.D4) {
                            i11 = profileActivity.botPermissionLocation;
                            if (i10 != i11) {
                                i12 = profileActivity.botPermissionBiometry;
                                if (i10 != i12) {
                                    i13 = profileActivity.botPermissionEmojiStatus;
                                    if (i10 != i13 && i10 != profileActivity.f34083e4) {
                                        if (i10 == profileActivity.M3) {
                                            return 5;
                                        }
                                        if (i10 == profileActivity.N3) {
                                            return 6;
                                        }
                                        if (i10 == profileActivity.Q3) {
                                            return 20;
                                        }
                                        if (i10 != profileActivity.M4 && i10 != profileActivity.H4 && i10 != profileActivity.f34136m4 && i10 != profileActivity.f34179s4 && i10 != profileActivity.f34074d3 && i10 != profileActivity.f34150o3 && i10 != profileActivity.f34185t3 && i10 != profileActivity.P2 && i10 != profileActivity.f34059b3 && i10 != profileActivity.X2 && i10 != profileActivity.f34105h4 && i10 != profileActivity.Y3 && i10 != profileActivity.R2 && i10 != profileActivity.Z2 && i10 != profileActivity.F4 && i10 != profileActivity.f34158p4 && i10 != profileActivity.E4 && i10 != profileActivity.f34125k4) {
                                            if (i10 >= profileActivity.f34193u4 && i10 < profileActivity.f34200v4) {
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
                                            if (i10 == profileActivity.f34226z3) {
                                                return 14;
                                            }
                                            if (i10 != profileActivity.f34067c3 && i10 != profileActivity.f34051a3 && i10 != profileActivity.Y2) {
                                                if (i10 == profileActivity.f34060b4) {
                                                    return 17;
                                                }
                                                if (i10 == profileActivity.f34068c4) {
                                                    return 18;
                                                }
                                                if (i10 == profileActivity.f34075d4) {
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
                                                if (i10 == profileActivity.f34112i4) {
                                                    return 25;
                                                }
                                                if (i10 != profileActivity.R3 && i10 != profileActivity.T3) {
                                                    if (i10 == profileActivity.f34118j4) {
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
    public final void v(s4.d1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a11.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        v01 xaVar;
        float f7;
        View x01Var;
        int i12 = 1;
        boolean z12 = false;
        Context context = this.f35663c;
        ProfileActivity profileActivity = this.f35664e;
        switch (i10) {
            case 1:
                xaVar = new org.telegram.ui.Cells.m4(this.f35663c, org.telegram.ui.ActionBar.h6.L6, 18, 7, false, profileActivity.f34223z0);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.c6 c6Var = profileActivity.f34223z0;
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
                u01 u01Var = new u01(this, this.f35663c, c6Var, z12, z11);
                u01Var.setContentDescriptionValueFirst(true);
                xaVar = u01Var;
                break;
            case 3:
                v01 v01Var = new v01(this, context, profileActivity, profileActivity.f34223z0);
                profileActivity.N5 = v01Var;
                xaVar = v01Var;
                break;
            case 4:
                xaVar = new rs(this, context, profileActivity.f34223z0);
                break;
            case 5:
                View d3Var = new org.telegram.ui.Cells.d3(context, profileActivity.f34223z0);
                d3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                xaVar = d3Var;
                break;
            case 6:
                xaVar = new w01(this, context, profileActivity.f34223z0);
                break;
            case 7:
                xaVar = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 8:
                if (profileActivity.f34208w4 == -1) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                xaVar = new org.telegram.ui.Cells.xa(i11, 0, this.f35663c, profileActivity.f34223z0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 10, profileActivity.f34223z0);
                e9Var.getTextView().setGravity(1);
                e9Var.getTextView().setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A6, profileActivity.f34223z0));
                e9Var.getTextView().setMovementMethod(null);
                e9Var.setText(AndroidUtilities.getBuildVersionInfo());
                e9Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                xaVar = e9Var;
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
                xaVar = t3Var;
                break;
            case 12:
                x01Var = new x01(this, context);
                x01Var.setBackground(new ColorDrawable(0));
                x01Var.setTag(-33024);
                xaVar = x01Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                x01Var = profileActivity.O;
                x01Var.setTag(-33024);
                xaVar = x01Var;
                break;
            case 15:
                xaVar = new z01(this, context, profileActivity.f34223z0);
                break;
            case 17:
                xaVar = new org.telegram.ui.Cells.e9(context, profileActivity.f34223z0);
                break;
            case 18:
            case 24:
                if (i10 == 18) {
                    i12 = 0;
                }
                View r1Var = new rg.r1(context, i12, profileActivity.f34223z0);
                r1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, profileActivity.f34223z0));
                xaVar = r1Var;
                break;
            case 20:
                xaVar = new org.telegram.ui.Cells.w8(18, context, profileActivity.f34223z0, false);
                break;
            case 21:
                View k1Var = new hg.k1(context, profileActivity.f34223z0);
                k1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, profileActivity.f34223z0));
                xaVar = k1Var;
                break;
            case 22:
                View y01Var = new y01(this, context, profileActivity.f34223z0);
                y01Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, profileActivity.f34223z0));
                xaVar = y01Var;
                break;
            case 23:
                xaVar = new org.telegram.ui.Cells.h6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                ci.d dVar = new ci.d(context, profileActivity.f34223z0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new p01(this, 0));
                frameLayout.addView(dVar, w7.w5.a(48.0f, 18.0f, 14.0f, 18.0f, 14.0f, -1, 119));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, profileActivity.f34223z0));
                xaVar = frameLayout;
                break;
            case 26:
                xaVar = new org.telegram.ui.Cells.e9(context, profileActivity.f34223z0);
                break;
            case 27:
                xaVar = new ei.i(context, profileActivity.f34223z0);
                break;
            case 28:
                x01Var = new org.telegram.ui.Components.co(context, 22);
                x01Var.setTag(-33024);
                xaVar = x01Var;
                break;
            case 32:
                xaVar = new m11(profileActivity, context);
                break;
            case 33:
                xaVar = new gi.c(context, profileActivity.f34223z0);
                break;
        }
        if (i10 != 13) {
            xaVar.setLayoutParams(new s4.q0(-1, -2));
        }
        return new s4.d1(xaVar);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        View view = d1Var.f47889a;
        ProfileActivity profileActivity = this.f35664e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.c9) {
            ((org.telegram.ui.Cells.c9) view).f21693a.setLoading(profileActivity.f34113i5);
            ((org.telegram.ui.Cells.c9) view).f21694b.setLoading(profileActivity.f34113i5);
        }
    }

    @Override
    public final void z(s4.d1 d1Var) {
        View view = d1Var.f47889a;
        ProfileActivity profileActivity = this.f35664e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
