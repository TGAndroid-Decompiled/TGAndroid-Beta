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
public final class n01 extends org.telegram.ui.Components.ql0 {
    public final Context f36298c;
    public final HashMap d = new HashMap();
    public final ProfileActivity e;

    public n01(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.f36298c = context;
    }

    @Override
    public final void A(f2.l1 l1Var) {
        int b10 = l1Var.b();
        ProfileActivity profileActivity = this.e;
        if (b10 == profileActivity.L2) {
            profileActivity.J2 = null;
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.c3 != -1) {
            int b10 = l1Var.b();
            if (b10 != profileActivity.c3 && b10 != profileActivity.Q2 && b10 != profileActivity.f32034e3 && b10 != profileActivity.f32027d3 && b10 != profileActivity.S2 && b10 != profileActivity.T2 && b10 != profileActivity.f32158w3 && b10 != profileActivity.f32041f3 && b10 != profileActivity.f32048g3 && b10 != profileActivity.f32096n3 && b10 != profileActivity.f32076k3 && b10 != profileActivity.f32055h3 && b10 != profileActivity.f32069j3 && b10 != profileActivity.f32103o3 && b10 != profileActivity.f32110p3 && b10 != profileActivity.f32133s3 && b10 != profileActivity.f32139t3 && b10 != profileActivity.f32145u3 && b10 != profileActivity.f32151v3 && b10 != profileActivity.L2 && b10 != profileActivity.X3 && b10 != profileActivity.Z3 && b10 != profileActivity.f32028d4 && b10 != profileActivity.f32021c4 && b10 != profileActivity.f32062i3 && b10 != profileActivity.R2 && b10 != profileActivity.N2 && b10 != profileActivity.f32006a4 && b10 != profileActivity.f32014b4 && b10 != profileActivity.f32063i4) {
                return false;
            }
        } else {
            View view = l1Var.f5774a;
            if (view instanceof org.telegram.ui.Cells.ua) {
                Object currentObject = ((org.telegram.ui.Cells.ua) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = l1Var.f5777f;
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
        return this.e.K2;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.e;
        if (i10 != profileActivity.A3 && i10 != profileActivity.f32118q4 && i10 != profileActivity.f32013b3 && i10 != profileActivity.P2 && i10 != profileActivity.f32088m3 && i10 != profileActivity.f32125r3 && i10 != profileActivity.f32077k4) {
            if (i10 != profileActivity.D3 && i10 != profileActivity.F3 && i10 != profileActivity.Q2 && i10 != profileActivity.R2) {
                if (i10 != profileActivity.I3 && i10 != profileActivity.S2) {
                    if (i10 == profileActivity.E3) {
                        return 30;
                    }
                    if (i10 != profileActivity.G3 && i10 != profileActivity.H3 && i10 != profileActivity.T2) {
                        if (i10 != profileActivity.f32097n4 && i10 != profileActivity.f32104o4 && i10 != profileActivity.S3 && i10 != profileActivity.U3 && i10 != profileActivity.T3 && i10 != profileActivity.f32146u4 && i10 != profileActivity.f32152v4 && i10 != profileActivity.f32159w4 && i10 != profileActivity.f32166x4 && i10 != profileActivity.D4 && i10 != profileActivity.f32140t4 && i10 != profileActivity.I4 && i10 != profileActivity.H4 && i10 != profileActivity.R3 && i10 != profileActivity.c3 && i10 != profileActivity.f32034e3 && i10 != profileActivity.f32027d3 && i10 != profileActivity.f32041f3 && i10 != profileActivity.f32048g3 && i10 != profileActivity.f32096n3 && i10 != profileActivity.f32076k3 && i10 != profileActivity.f32055h3 && i10 != profileActivity.f32069j3 && i10 != profileActivity.f32103o3 && i10 != profileActivity.f32110p3 && i10 != profileActivity.f32133s3 && i10 != profileActivity.f32139t3 && i10 != profileActivity.f32145u3 && i10 != profileActivity.f32151v3 && i10 != profileActivity.L2 && i10 != profileActivity.X3 && i10 != profileActivity.W3 && i10 != profileActivity.f32062i3 && i10 != profileActivity.f32028d4 && i10 != profileActivity.f32021c4 && i10 != profileActivity.f32173y4 && i10 != profileActivity.z4 && i10 != profileActivity.A4) {
                            i11 = profileActivity.botPermissionLocation;
                            if (i10 != i11) {
                                i12 = profileActivity.botPermissionBiometry;
                                if (i10 != i12) {
                                    i13 = profileActivity.botPermissionEmojiStatus;
                                    if (i10 != i13 && i10 != profileActivity.f32014b4) {
                                        if (i10 == profileActivity.J3) {
                                            return 5;
                                        }
                                        if (i10 == profileActivity.K3) {
                                            return 6;
                                        }
                                        if (i10 == profileActivity.N3) {
                                            return 20;
                                        }
                                        if (i10 != profileActivity.J4 && i10 != profileActivity.E4 && i10 != profileActivity.f32070j4 && i10 != profileActivity.f32111p4 && i10 != profileActivity.f32005a3 && i10 != profileActivity.f32082l3 && i10 != profileActivity.f32117q3 && i10 != profileActivity.M2 && i10 != profileActivity.Y2 && i10 != profileActivity.U2 && i10 != profileActivity.f32035e4 && i10 != profileActivity.V3 && i10 != profileActivity.O2 && i10 != profileActivity.W2 && i10 != profileActivity.C4 && i10 != profileActivity.f32089m4 && i10 != profileActivity.B4 && i10 != profileActivity.f32056h4) {
                                            if (i10 >= profileActivity.f32126r4 && i10 < profileActivity.f32134s4) {
                                                return 8;
                                            }
                                            if (i10 == profileActivity.f32165x3) {
                                                return 11;
                                            }
                                            if (i10 == profileActivity.f32172y3) {
                                                return 31;
                                            }
                                            if (i10 == profileActivity.f32178z3) {
                                                return 12;
                                            }
                                            if (i10 == profileActivity.G4) {
                                                return 13;
                                            }
                                            if (i10 == profileActivity.f32158w3) {
                                                return 14;
                                            }
                                            if (i10 != profileActivity.Z2 && i10 != profileActivity.X2 && i10 != profileActivity.V2) {
                                                if (i10 == profileActivity.Y3) {
                                                    return 17;
                                                }
                                                if (i10 == profileActivity.Z3) {
                                                    return 18;
                                                }
                                                if (i10 == profileActivity.f32006a4) {
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
                                                if (i10 == profileActivity.f32042f4) {
                                                    return 25;
                                                }
                                                if (i10 != profileActivity.O3 && i10 != profileActivity.Q3) {
                                                    if (i10 == profileActivity.f32049g4) {
                                                        return 32;
                                                    }
                                                    if (i10 == profileActivity.f32063i4) {
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
    public final void v(f2.l1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n01.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        boolean z4;
        int i11;
        i01 uaVar;
        float f10;
        View k01Var;
        int i12 = 1;
        boolean z10 = false;
        Context context = this.f36298c;
        ProfileActivity profileActivity = this.e;
        switch (i10) {
            case 1:
                org.telegram.ui.ActionBar.f6 f6Var = profileActivity.f32155w0;
                uaVar = new org.telegram.ui.Cells.l4(this.f36298c, org.telegram.ui.ActionBar.j6.L6, 18, 7, false, f6Var);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.f6 f6Var2 = profileActivity.f32155w0;
                if (i10 == 30) {
                    z10 = true;
                }
                if (i10 == 19) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h01 h01Var = new h01(this, this.f36298c, f6Var2, z10, z4);
                h01Var.setContentDescriptionValueFirst(true);
                uaVar = h01Var;
                break;
            case 3:
                i01 i01Var = new i01(this, context, profileActivity, profileActivity.f32155w0);
                profileActivity.K5 = i01Var;
                uaVar = i01Var;
                break;
            case 4:
                uaVar = new ns(this, context, profileActivity.f32155w0);
                break;
            case 5:
                View b3Var = new org.telegram.ui.Cells.b3(context, profileActivity.f32155w0);
                b3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                uaVar = b3Var;
                break;
            case 6:
                uaVar = new j01(this, context, profileActivity.f32155w0);
                break;
            case 7:
                uaVar = new org.telegram.ui.Cells.y6(context, (b) null);
                break;
            case 8:
                if (profileActivity.f32140t4 == -1) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                org.telegram.ui.ActionBar.f6 f6Var3 = profileActivity.f32155w0;
                uaVar = new org.telegram.ui.Cells.ua(i11, 0, this.f36298c, f6Var3, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context, 10, profileActivity.f32155w0);
                z8Var.getTextView().setGravity(1);
                z8Var.getTextView().setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, profileActivity.f32155w0));
                z8Var.getTextView().setMovementMethod(null);
                z8Var.setText(AndroidUtilities.getBuildVersionInfo());
                z8Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                uaVar = z8Var;
                break;
            case 11:
            case 31:
                if (i10 == 31) {
                    f10 = 12.0f;
                } else {
                    f10 = 6.0f;
                }
                View r3Var = new org.telegram.ui.Cells.r3(context, AndroidUtilities.dp(f10), 2);
                r3Var.setTag(-33024);
                uaVar = r3Var;
                break;
            case 12:
                k01Var = new k01(this, context);
                k01Var.setBackground(new ColorDrawable(0));
                k01Var.setTag(-33024);
                uaVar = k01Var;
                break;
            case 13:
                if (profileActivity.L.getParent() != null) {
                    ((ViewGroup) profileActivity.L.getParent()).removeView(profileActivity.L);
                }
                k01Var = profileActivity.L;
                k01Var.setTag(-33024);
                uaVar = k01Var;
                break;
            case 15:
                uaVar = new m01(this, context, profileActivity.f32155w0);
                break;
            case 17:
                uaVar = new org.telegram.ui.Cells.z8(context, profileActivity.f32155w0);
                break;
            case 18:
            case 24:
                if (i10 == 18) {
                    i12 = 0;
                }
                View l2Var = new eg.l2(context, i12, profileActivity.f32155w0);
                l2Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, profileActivity.f32155w0));
                uaVar = l2Var;
                break;
            case 20:
                uaVar = new org.telegram.ui.Cells.r8(18, context, profileActivity.f32155w0, false);
                break;
            case 21:
                View b1Var = new uf.b1(context, profileActivity.f32155w0);
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, profileActivity.f32155w0));
                uaVar = b1Var;
                break;
            case 22:
                View l01Var = new l01(this, context, profileActivity.f32155w0);
                l01Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, profileActivity.f32155w0));
                uaVar = l01Var;
                break;
            case 23:
                uaVar = new org.telegram.ui.Cells.f6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                ph.d dVar = new ph.d(context, profileActivity.f32155w0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new c01(this, 0));
                frameLayout.addView(dVar, k7.b6.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, profileActivity.f32155w0));
                uaVar = frameLayout;
                break;
            case 26:
                uaVar = new org.telegram.ui.Cells.z8(context, profileActivity.f32155w0);
                break;
            case 27:
                uaVar = new rh.g(context, profileActivity.f32155w0);
                break;
            case 28:
                k01Var = new org.telegram.ui.Components.gn(context, 19);
                k01Var.setTag(-33024);
                uaVar = k01Var;
                break;
            case 32:
                uaVar = new z01(profileActivity, context);
                break;
            case 33:
                uaVar = new th.b(context, profileActivity.f32155w0);
                break;
        }
        if (i10 != 13) {
            uaVar.setLayoutParams(new f2.w0(-1, -2));
        }
        return new f2.l1(uaVar);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.L) {
            profileActivity.N = true;
        }
        if (view instanceof org.telegram.ui.Cells.x8) {
            ((org.telegram.ui.Cells.x8) view).f22552a.setLoading(profileActivity.f32043f5);
            ((org.telegram.ui.Cells.x8) view).f22553b.setLoading(profileActivity.f32043f5);
        }
    }

    @Override
    public final void z(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.L) {
            profileActivity.N = false;
        }
    }
}
