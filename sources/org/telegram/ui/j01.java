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
public final class j01 extends org.telegram.ui.Components.lm0 {
    public final Context f40379c;
    public final HashMap d = new HashMap();
    public final ProfileActivity e;

    public j01(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.f40379c = context;
    }

    @Override
    public final void A(s4.e1 e1Var) {
        int b10 = e1Var.b();
        ProfileActivity profileActivity = this.e;
        if (b10 == profileActivity.O2) {
            profileActivity.M2 = null;
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.f35989f3 != -1) {
            int b10 = e1Var.b();
            if (b10 != profileActivity.f35989f3 && b10 != profileActivity.T2 && b10 != profileActivity.f36003h3 && b10 != profileActivity.f35996g3 && b10 != profileActivity.V2 && b10 != profileActivity.W2 && b10 != profileActivity.f36129z3 && b10 != profileActivity.f36010i3 && b10 != profileActivity.f36017j3 && b10 != profileActivity.f36064q3 && b10 != profileActivity.f36043n3 && b10 != profileActivity.f36024k3 && b10 != profileActivity.f36035m3 && b10 != profileActivity.f36071r3 && b10 != profileActivity.f36078s3 && b10 != profileActivity.f36099v3 && b10 != profileActivity.f36107w3 && b10 != profileActivity.f36115x3 && b10 != profileActivity.y3 && b10 != profileActivity.O2 && b10 != profileActivity.f35952a4 && b10 != profileActivity.f35968c4 && b10 != profileActivity.f35997g4 && b10 != profileActivity.f35990f4 && b10 != profileActivity.f36030l3 && b10 != profileActivity.U2 && b10 != profileActivity.Q2 && b10 != profileActivity.f35975d4 && b10 != profileActivity.f35982e4 && b10 != profileActivity.f36065q4) {
                return false;
            }
        } else {
            View view = e1Var.f47738a;
            if (view instanceof org.telegram.ui.Cells.ab) {
                Object currentObject = ((org.telegram.ui.Cells.ab) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = e1Var.f47741f;
            if (i10 == 1 || i10 == 5 || i10 == 7 || i10 == 11 || i10 == 31 || i10 == 28 || i10 == 12 || i10 == 13 || i10 == 9 || i10 == 10 || i10 == 25 || i10 == 34 || i10 == 32) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.CharSequence E(java.lang.String r7, java.util.ArrayList r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j01.E(java.lang.String, java.util.ArrayList, java.lang.String):java.lang.CharSequence");
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
        if (i10 != profileActivity.D3 && i10 != profileActivity.f36123y4 && i10 != profileActivity.f35981e3 && i10 != profileActivity.S2 && i10 != profileActivity.f36057p3 && i10 != profileActivity.f36092u3 && i10 != profileActivity.f36079s4) {
            if (i10 != profileActivity.G3 && i10 != profileActivity.I3 && i10 != profileActivity.T2 && i10 != profileActivity.U2) {
                if (i10 != profileActivity.L3 && i10 != profileActivity.V2) {
                    if (i10 == profileActivity.H3) {
                        return 30;
                    }
                    if (i10 != profileActivity.J3 && i10 != profileActivity.K3 && i10 != profileActivity.W2) {
                        if (i10 != profileActivity.f36100v4 && i10 != profileActivity.f36108w4 && i10 != profileActivity.V3 && i10 != profileActivity.X3 && i10 != profileActivity.W3 && i10 != profileActivity.C4 && i10 != profileActivity.D4 && i10 != profileActivity.E4 && i10 != profileActivity.F4 && i10 != profileActivity.L4 && i10 != profileActivity.B4 && i10 != profileActivity.R4 && i10 != profileActivity.Q4 && i10 != profileActivity.U3 && i10 != profileActivity.f35989f3 && i10 != profileActivity.f36003h3 && i10 != profileActivity.f35996g3 && i10 != profileActivity.f36010i3 && i10 != profileActivity.f36017j3 && i10 != profileActivity.f36064q3 && i10 != profileActivity.f36043n3 && i10 != profileActivity.f36024k3 && i10 != profileActivity.f36035m3 && i10 != profileActivity.f36071r3 && i10 != profileActivity.f36078s3 && i10 != profileActivity.f36099v3 && i10 != profileActivity.f36107w3 && i10 != profileActivity.f36115x3 && i10 != profileActivity.y3 && i10 != profileActivity.O2 && i10 != profileActivity.f35952a4 && i10 != profileActivity.Z3 && i10 != profileActivity.f36030l3 && i10 != profileActivity.f35997g4 && i10 != profileActivity.f35990f4 && i10 != profileActivity.G4 && i10 != profileActivity.H4 && i10 != profileActivity.I4) {
                            i11 = profileActivity.botPermissionLocation;
                            if (i10 != i11) {
                                i12 = profileActivity.botPermissionBiometry;
                                if (i10 != i12) {
                                    i13 = profileActivity.botPermissionEmojiStatus;
                                    if (i10 != i13 && i10 != profileActivity.f35982e4) {
                                        if (i10 == profileActivity.M3) {
                                            return 5;
                                        }
                                        if (i10 == profileActivity.N3) {
                                            return 6;
                                        }
                                        if (i10 == profileActivity.Q3) {
                                            return 20;
                                        }
                                        if (i10 != profileActivity.S4 && i10 != profileActivity.M4 && i10 != profileActivity.f36072r4 && i10 != profileActivity.f36116x4 && i10 != profileActivity.f35974d3 && i10 != profileActivity.f36050o3 && i10 != profileActivity.f36085t3 && i10 != profileActivity.P2 && i10 != profileActivity.f35959b3 && i10 != profileActivity.X2 && i10 != profileActivity.f36004h4 && i10 != profileActivity.Y3 && i10 != profileActivity.R2 && i10 != profileActivity.Z2 && i10 != profileActivity.K4 && i10 != profileActivity.f36093u4 && i10 != profileActivity.J4 && i10 != profileActivity.f36058p4) {
                                            if (i10 >= profileActivity.f36130z4 && i10 < profileActivity.A4) {
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
                                            if (i10 == profileActivity.P4) {
                                                return 13;
                                            }
                                            if (i10 == profileActivity.f36129z3) {
                                                return 14;
                                            }
                                            if (i10 != profileActivity.f35967c3 && i10 != profileActivity.f35951a3 && i10 != profileActivity.Y2) {
                                                if (i10 == profileActivity.f35960b4) {
                                                    return 17;
                                                }
                                                if (i10 == profileActivity.f35968c4) {
                                                    return 18;
                                                }
                                                if (i10 == profileActivity.f35975d4) {
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
                                                if (i10 == profileActivity.f36011i4) {
                                                    return 25;
                                                }
                                                if (i10 == profileActivity.f36018j4) {
                                                    return 34;
                                                }
                                                if (i10 >= profileActivity.f36025k4 && i10 < profileActivity.l4) {
                                                    return 35;
                                                }
                                                if (i10 != profileActivity.f36036m4) {
                                                    if (i10 != profileActivity.R3 && i10 != profileActivity.T3 && i10 != profileActivity.f36044n4) {
                                                        if (i10 == profileActivity.f36051o4) {
                                                            return 32;
                                                        }
                                                        if (i10 == profileActivity.f36065q4) {
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
                                                return 4;
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
    public final void v(s4.e1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j01.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        e01 abVar;
        float f7;
        View g01Var;
        int i12;
        int i13 = 1;
        boolean z12 = false;
        Context context = this.f40379c;
        ProfileActivity profileActivity = this.e;
        switch (i10) {
            case 1:
                abVar = new org.telegram.ui.Cells.q4(this.f40379c, org.telegram.ui.ActionBar.y6.L6, 18, 7, false, profileActivity.f36126z0);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.u6 u6Var = profileActivity.f36126z0;
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
                d01 d01Var = new d01(this, this.f40379c, u6Var, z12, z11);
                d01Var.setContentDescriptionValueFirst(true);
                abVar = d01Var;
                break;
            case 3:
                e01 e01Var = new e01(this, context, profileActivity, profileActivity.f36126z0);
                profileActivity.U5 = e01Var;
                abVar = e01Var;
                break;
            case 4:
                abVar = new hs(this, context, profileActivity.f36126z0);
                break;
            case 5:
                View a3Var = new org.telegram.ui.Cells.a3(context, profileActivity.f36126z0);
                a3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                abVar = a3Var;
                break;
            case 6:
                abVar = new f01(this, context, profileActivity.f36126z0);
                break;
            case 7:
                abVar = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 8:
                if (profileActivity.B4 == -1) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                abVar = new org.telegram.ui.Cells.ab(i11, 0, this.f40379c, profileActivity.f36126z0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context, 10, profileActivity.f36126z0);
                i9Var.getTextView().setGravity(1);
                org.telegram.ui.ActionBar.f7.V(i9Var.getTextView(), org.telegram.ui.ActionBar.y6.A6, profileActivity.f36126z0);
                i9Var.getTextView().setMovementMethod(null);
                i9Var.setText(AndroidUtilities.getBuildVersionInfo());
                i9Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                abVar = i9Var;
                break;
            case 11:
            case 31:
                if (i10 == 31) {
                    f7 = 12.0f;
                } else {
                    f7 = 6.0f;
                }
                View x3Var = new org.telegram.ui.Cells.x3(context, AndroidUtilities.dp(f7), 2);
                x3Var.setTag(-33024);
                abVar = x3Var;
                break;
            case 12:
                g01Var = new g01(this, context);
                g01Var.setBackground(new ColorDrawable(0));
                g01Var.setTag(-33024);
                abVar = g01Var;
                break;
            case 13:
                if (profileActivity.N.getParent() != null) {
                    ((ViewGroup) profileActivity.N.getParent()).removeView(profileActivity.N);
                }
                g01Var = profileActivity.N;
                g01Var.setTag(-33024);
                abVar = g01Var;
                break;
            case 15:
                abVar = new i01(this, context, profileActivity.f36126z0);
                break;
            case 17:
                abVar = new org.telegram.ui.Cells.i9(context, profileActivity.f36126z0);
                break;
            case 18:
            case 24:
                if (i10 == 18) {
                    i13 = 0;
                }
                View s1Var = new tg.s1(context, i13, profileActivity.f36126z0);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, s1Var, profileActivity.f36126z0);
                abVar = s1Var;
                break;
            case 20:
                abVar = new org.telegram.ui.Cells.a9(18, context, profileActivity.f36126z0, false);
                break;
            case 21:
                View l1Var = new jg.l1(context, profileActivity.f36126z0);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, l1Var, profileActivity.f36126z0);
                abVar = l1Var;
                break;
            case 22:
                View h01Var = new h01(this, context, profileActivity.f36126z0);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, h01Var, profileActivity.f36126z0);
                abVar = h01Var;
                break;
            case 23:
                abVar = new org.telegram.ui.Cells.l6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                fi.d dVar = new fi.d(context, profileActivity.f36126z0, true);
                dVar.f();
                dVar.i(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new yz0(this, 1));
                frameLayout.addView(dVar, org.telegram.ui.Components.gb1.h(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, frameLayout, profileActivity.f36126z0);
                abVar = frameLayout;
                break;
            case 26:
                abVar = new org.telegram.ui.Cells.i9(context, profileActivity.f36126z0);
                break;
            case 27:
                abVar = new hi.h(context, profileActivity.f36126z0);
                break;
            case 28:
                g01Var = new org.telegram.ui.Components.vn(context, 22);
                g01Var.setTag(-33024);
                abVar = g01Var;
                break;
            case 32:
                abVar = new w01(profileActivity, context);
                break;
            case 33:
                abVar = new ji.c(context, profileActivity.f36126z0);
                break;
            case 34:
                FrameLayout frameLayout2 = new FrameLayout(context);
                fi.d dVar2 = new fi.d(context, profileActivity.f36126z0, true);
                dVar2.f();
                dVar2.i(LocaleController.getString(R.string.AgentAddApiKey), false, true);
                dVar2.setOnClickListener(new yz0(this, 0));
                frameLayout2.addView(dVar2, org.telegram.ui.Components.gb1.h(-1, 48.0f, 119, 18.0f, 10.0f, 18.0f, 10.0f));
                frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23356d6, profileActivity.f36126z0));
                abVar = frameLayout2;
                break;
            case 35:
                i12 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
                abVar = new hi.s(context, i12, profileActivity.f36126z0);
                break;
        }
        if (i10 != 13) {
            abVar.setLayoutParams(new s4.q0(-1, -2));
        }
        return new s4.e1(abVar);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        View view = e1Var.f47738a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.N) {
            profileActivity.P = true;
        }
        if (view instanceof org.telegram.ui.Cells.g9) {
            ((org.telegram.ui.Cells.g9) view).f24172a.setLoading(profileActivity.f36052o5);
            ((org.telegram.ui.Cells.g9) view).f24173b.setLoading(profileActivity.f36052o5);
        }
    }

    @Override
    public final void z(s4.e1 e1Var) {
        View view = e1Var.f47738a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.N) {
            profileActivity.P = false;
        }
    }
}
