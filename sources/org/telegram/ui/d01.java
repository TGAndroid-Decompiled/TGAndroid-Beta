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
public final class d01 extends org.telegram.ui.Components.hm0 {
    public final Context f36024c;
    public final HashMap d = new HashMap();
    public final ProfileActivity e;

    public d01(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.f36024c = context;
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
        if (profileActivity.f33616g3 != -1) {
            int b10 = b1Var.b();
            if (b10 != profileActivity.f33616g3 && b10 != profileActivity.U2 && b10 != profileActivity.f33630i3 && b10 != profileActivity.f33623h3 && b10 != profileActivity.W2 && b10 != profileActivity.X2 && b10 != profileActivity.A3 && b10 != profileActivity.f33637j3 && b10 != profileActivity.f33644k3 && b10 != profileActivity.f33690r3 && b10 != profileActivity.f33670o3 && b10 != profileActivity.f33650l3 && b10 != profileActivity.f33663n3 && b10 != profileActivity.f33698s3 && b10 != profileActivity.f33705t3 && b10 != profileActivity.f33727w3 && b10 != profileActivity.f33735x3 && b10 != profileActivity.y3 && b10 != profileActivity.f33748z3 && b10 != profileActivity.P2 && b10 != profileActivity.f33580b4 && b10 != profileActivity.f33595d4 && b10 != profileActivity.f33624h4 && b10 != profileActivity.f33617g4 && b10 != profileActivity.f33655m3 && b10 != profileActivity.V2 && b10 != profileActivity.R2 && b10 != profileActivity.f33602e4 && b10 != profileActivity.f33610f4 && b10 != profileActivity.f33656m4) {
                return false;
            }
        } else {
            View view = b1Var.f45938a;
            if (view instanceof org.telegram.ui.Cells.va) {
                Object currentObject = ((org.telegram.ui.Cells.va) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = b1Var.f45941f;
            if (i10 == 1 || i10 == 5 || i10 == 7 || i10 == 11 || i10 == 31 || i10 == 28 || i10 == 12 || i10 == 13 || i10 == 9 || i10 == 10 || i10 == 25 || i10 == 32) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.CharSequence E(java.lang.String r7, java.util.ArrayList r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d01.E(java.lang.String, java.util.ArrayList, java.lang.String):java.lang.CharSequence");
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
        if (i10 != profileActivity.E3 && i10 != profileActivity.f33713u4 && i10 != profileActivity.f33609f3 && i10 != profileActivity.T2 && i10 != profileActivity.f33683q3 && i10 != profileActivity.f33719v3 && i10 != profileActivity.f33671o4) {
            if (i10 != profileActivity.H3 && i10 != profileActivity.J3 && i10 != profileActivity.U2 && i10 != profileActivity.V2) {
                if (i10 != profileActivity.M3 && i10 != profileActivity.W2) {
                    if (i10 == profileActivity.I3) {
                        return 30;
                    }
                    if (i10 != profileActivity.K3 && i10 != profileActivity.L3 && i10 != profileActivity.X2) {
                        if (i10 != profileActivity.f33691r4 && i10 != profileActivity.f33699s4 && i10 != profileActivity.W3 && i10 != profileActivity.Y3 && i10 != profileActivity.X3 && i10 != profileActivity.f33743y4 && i10 != profileActivity.f33749z4 && i10 != profileActivity.A4 && i10 != profileActivity.B4 && i10 != profileActivity.H4 && i10 != profileActivity.f33736x4 && i10 != profileActivity.N4 && i10 != profileActivity.M4 && i10 != profileActivity.V3 && i10 != profileActivity.f33616g3 && i10 != profileActivity.f33630i3 && i10 != profileActivity.f33623h3 && i10 != profileActivity.f33637j3 && i10 != profileActivity.f33644k3 && i10 != profileActivity.f33690r3 && i10 != profileActivity.f33670o3 && i10 != profileActivity.f33650l3 && i10 != profileActivity.f33663n3 && i10 != profileActivity.f33698s3 && i10 != profileActivity.f33705t3 && i10 != profileActivity.f33727w3 && i10 != profileActivity.f33735x3 && i10 != profileActivity.y3 && i10 != profileActivity.f33748z3 && i10 != profileActivity.P2 && i10 != profileActivity.f33580b4 && i10 != profileActivity.f33572a4 && i10 != profileActivity.f33655m3 && i10 != profileActivity.f33624h4 && i10 != profileActivity.f33617g4 && i10 != profileActivity.C4 && i10 != profileActivity.D4 && i10 != profileActivity.E4) {
                            i11 = profileActivity.botPermissionLocation;
                            if (i10 != i11) {
                                i12 = profileActivity.botPermissionBiometry;
                                if (i10 != i12) {
                                    i13 = profileActivity.botPermissionEmojiStatus;
                                    if (i10 != i13 && i10 != profileActivity.f33610f4) {
                                        if (i10 == profileActivity.N3) {
                                            return 5;
                                        }
                                        if (i10 == profileActivity.O3) {
                                            return 6;
                                        }
                                        if (i10 == profileActivity.R3) {
                                            return 20;
                                        }
                                        if (i10 != profileActivity.O4 && i10 != profileActivity.I4 && i10 != profileActivity.f33664n4 && i10 != profileActivity.f33706t4 && i10 != profileActivity.f33601e3 && i10 != profileActivity.f33677p3 && i10 != profileActivity.f33712u3 && i10 != profileActivity.Q2 && i10 != profileActivity.f33587c3 && i10 != profileActivity.Y2 && i10 != profileActivity.f33631i4 && i10 != profileActivity.Z3 && i10 != profileActivity.S2 && i10 != profileActivity.f33571a3 && i10 != profileActivity.G4 && i10 != profileActivity.f33684q4 && i10 != profileActivity.F4 && i10 != profileActivity.l4) {
                                            if (i10 >= profileActivity.f33720v4 && i10 < profileActivity.f33728w4) {
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
                                            if (i10 != profileActivity.f33594d3 && i10 != profileActivity.f33579b3 && i10 != profileActivity.Z2) {
                                                if (i10 == profileActivity.f33588c4) {
                                                    return 17;
                                                }
                                                if (i10 == profileActivity.f33595d4) {
                                                    return 18;
                                                }
                                                if (i10 == profileActivity.f33602e4) {
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
                                                if (i10 == profileActivity.f33638j4) {
                                                    return 25;
                                                }
                                                if (i10 != profileActivity.S3 && i10 != profileActivity.U3) {
                                                    if (i10 == profileActivity.f33645k4) {
                                                        return 32;
                                                    }
                                                    if (i10 == profileActivity.f33656m4) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d01.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        yz0 vaVar;
        float f7;
        View a01Var;
        int i12 = 1;
        boolean z12 = false;
        Context context = this.f36024c;
        ProfileActivity profileActivity = this.e;
        switch (i10) {
            case 1:
                vaVar = new org.telegram.ui.Cells.l4(this.f36024c, org.telegram.ui.ActionBar.h6.L6, 18, 7, false, profileActivity.A0);
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
                xz0 xz0Var = new xz0(this, this.f36024c, d6Var, z12, z11);
                xz0Var.setContentDescriptionValueFirst(true);
                vaVar = xz0Var;
                break;
            case 3:
                yz0 yz0Var = new yz0(this, context, profileActivity, profileActivity.A0);
                profileActivity.P5 = yz0Var;
                vaVar = yz0Var;
                break;
            case 4:
                vaVar = new fs(this, context, profileActivity.A0);
                break;
            case 5:
                View c3Var = new org.telegram.ui.Cells.c3(context, profileActivity.A0);
                c3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                vaVar = c3Var;
                break;
            case 6:
                vaVar = new zz0(this, context, profileActivity.A0);
                break;
            case 7:
                vaVar = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.t0) null);
                break;
            case 8:
                if (profileActivity.f33736x4 == -1) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                vaVar = new org.telegram.ui.Cells.va(i11, 0, this.f36024c, profileActivity.A0, true, false);
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
                a01Var = new a01(this, context);
                a01Var.setBackground(new ColorDrawable(0));
                a01Var.setTag(-33024);
                vaVar = a01Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                a01Var = profileActivity.O;
                a01Var.setTag(-33024);
                vaVar = a01Var;
                break;
            case 15:
                vaVar = new c01(this, context, profileActivity.A0);
                break;
            case 17:
                vaVar = new org.telegram.ui.Cells.d9(context, profileActivity.A0);
                break;
            case 18:
            case 24:
                if (i10 == 18) {
                    i12 = 0;
                }
                View r1Var = new sg.r1(context, i12, profileActivity.A0);
                r1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, profileActivity.A0));
                vaVar = r1Var;
                break;
            case 20:
                vaVar = new org.telegram.ui.Cells.v8(18, context, profileActivity.A0, false);
                break;
            case 21:
                View h1Var = new ig.h1(context, profileActivity.A0);
                h1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, profileActivity.A0));
                vaVar = h1Var;
                break;
            case 22:
                View b01Var = new b01(this, context, profileActivity.A0);
                b01Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, profileActivity.A0));
                vaVar = b01Var;
                break;
            case 23:
                vaVar = new org.telegram.ui.Cells.g6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                ei.d dVar = new ei.d(context, profileActivity.A0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new sz0(this, 0));
                frameLayout.addView(dVar, w7.z5.a(48.0f, 18.0f, 14.0f, 18.0f, 14.0f, -1, 119));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, profileActivity.A0));
                vaVar = frameLayout;
                break;
            case 26:
                vaVar = new org.telegram.ui.Cells.d9(context, profileActivity.A0);
                break;
            case 27:
                vaVar = new gi.i(context, profileActivity.A0);
                break;
            case 28:
                a01Var = new org.telegram.ui.Components.un(context, 22);
                a01Var.setTag(-33024);
                vaVar = a01Var;
                break;
            case 32:
                vaVar = new q01(profileActivity, context);
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
        View view = b1Var.f45938a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.b9) {
            ((org.telegram.ui.Cells.b9) view).f22056a.setLoading(profileActivity.f33646k5);
            ((org.telegram.ui.Cells.b9) view).f22057b.setLoading(profileActivity.f33646k5);
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        View view = b1Var.f45938a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
