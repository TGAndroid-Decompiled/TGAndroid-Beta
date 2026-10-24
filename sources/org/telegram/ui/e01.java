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
public final class e01 extends org.telegram.ui.Components.km0 {
    public final Context f36763c;
    public final HashMap d = new HashMap();
    public final ProfileActivity e;

    public e01(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.f36763c = context;
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
        if (profileActivity.f33932g3 != -1) {
            int b10 = b1Var.b();
            if (b10 != profileActivity.f33932g3 && b10 != profileActivity.U2 && b10 != profileActivity.f33946i3 && b10 != profileActivity.f33939h3 && b10 != profileActivity.W2 && b10 != profileActivity.X2 && b10 != profileActivity.A3 && b10 != profileActivity.f33953j3 && b10 != profileActivity.f33960k3 && b10 != profileActivity.f34006r3 && b10 != profileActivity.f33986o3 && b10 != profileActivity.f33966l3 && b10 != profileActivity.f33979n3 && b10 != profileActivity.f34014s3 && b10 != profileActivity.f34021t3 && b10 != profileActivity.f34043w3 && b10 != profileActivity.f34051x3 && b10 != profileActivity.y3 && b10 != profileActivity.f34065z3 && b10 != profileActivity.P2 && b10 != profileActivity.f33896b4 && b10 != profileActivity.f33911d4 && b10 != profileActivity.f33940h4 && b10 != profileActivity.f33933g4 && b10 != profileActivity.f33971m3 && b10 != profileActivity.V2 && b10 != profileActivity.R2 && b10 != profileActivity.f33918e4 && b10 != profileActivity.f33926f4 && b10 != profileActivity.f33972m4) {
                return false;
            }
        } else {
            View view = b1Var.f46342a;
            if (view instanceof org.telegram.ui.Cells.wa) {
                Object currentObject = ((org.telegram.ui.Cells.wa) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = b1Var.f46345f;
            if (i10 == 1 || i10 == 5 || i10 == 7 || i10 == 11 || i10 == 31 || i10 == 28 || i10 == 12 || i10 == 13 || i10 == 9 || i10 == 10 || i10 == 25 || i10 == 32) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.CharSequence E(java.lang.String r7, java.util.ArrayList r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e01.E(java.lang.String, java.util.ArrayList, java.lang.String):java.lang.CharSequence");
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
        if (i10 != profileActivity.E3 && i10 != profileActivity.f34029u4 && i10 != profileActivity.f33925f3 && i10 != profileActivity.T2 && i10 != profileActivity.f33999q3 && i10 != profileActivity.f34035v3 && i10 != profileActivity.f33987o4) {
            if (i10 != profileActivity.H3 && i10 != profileActivity.J3 && i10 != profileActivity.U2 && i10 != profileActivity.V2) {
                if (i10 != profileActivity.M3 && i10 != profileActivity.W2) {
                    if (i10 == profileActivity.I3) {
                        return 30;
                    }
                    if (i10 != profileActivity.K3 && i10 != profileActivity.L3 && i10 != profileActivity.X2) {
                        if (i10 != profileActivity.f34007r4 && i10 != profileActivity.f34015s4 && i10 != profileActivity.W3 && i10 != profileActivity.Y3 && i10 != profileActivity.X3 && i10 != profileActivity.f34059y4 && i10 != profileActivity.f34066z4 && i10 != profileActivity.A4 && i10 != profileActivity.B4 && i10 != profileActivity.H4 && i10 != profileActivity.f34052x4 && i10 != profileActivity.N4 && i10 != profileActivity.M4 && i10 != profileActivity.V3 && i10 != profileActivity.f33932g3 && i10 != profileActivity.f33946i3 && i10 != profileActivity.f33939h3 && i10 != profileActivity.f33953j3 && i10 != profileActivity.f33960k3 && i10 != profileActivity.f34006r3 && i10 != profileActivity.f33986o3 && i10 != profileActivity.f33966l3 && i10 != profileActivity.f33979n3 && i10 != profileActivity.f34014s3 && i10 != profileActivity.f34021t3 && i10 != profileActivity.f34043w3 && i10 != profileActivity.f34051x3 && i10 != profileActivity.y3 && i10 != profileActivity.f34065z3 && i10 != profileActivity.P2 && i10 != profileActivity.f33896b4 && i10 != profileActivity.f33888a4 && i10 != profileActivity.f33971m3 && i10 != profileActivity.f33940h4 && i10 != profileActivity.f33933g4 && i10 != profileActivity.C4 && i10 != profileActivity.D4 && i10 != profileActivity.E4) {
                            i11 = profileActivity.botPermissionLocation;
                            if (i10 != i11) {
                                i12 = profileActivity.botPermissionBiometry;
                                if (i10 != i12) {
                                    i13 = profileActivity.botPermissionEmojiStatus;
                                    if (i10 != i13 && i10 != profileActivity.f33926f4) {
                                        if (i10 == profileActivity.N3) {
                                            return 5;
                                        }
                                        if (i10 == profileActivity.O3) {
                                            return 6;
                                        }
                                        if (i10 == profileActivity.R3) {
                                            return 20;
                                        }
                                        if (i10 != profileActivity.O4 && i10 != profileActivity.I4 && i10 != profileActivity.f33980n4 && i10 != profileActivity.f34022t4 && i10 != profileActivity.f33917e3 && i10 != profileActivity.f33993p3 && i10 != profileActivity.f34028u3 && i10 != profileActivity.Q2 && i10 != profileActivity.f33903c3 && i10 != profileActivity.Y2 && i10 != profileActivity.f33947i4 && i10 != profileActivity.Z3 && i10 != profileActivity.S2 && i10 != profileActivity.f33887a3 && i10 != profileActivity.G4 && i10 != profileActivity.f34000q4 && i10 != profileActivity.F4 && i10 != profileActivity.l4) {
                                            if (i10 >= profileActivity.f34036v4 && i10 < profileActivity.f34044w4) {
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
                                            if (i10 != profileActivity.f33910d3 && i10 != profileActivity.f33895b3 && i10 != profileActivity.Z2) {
                                                if (i10 == profileActivity.f33904c4) {
                                                    return 17;
                                                }
                                                if (i10 == profileActivity.f33911d4) {
                                                    return 18;
                                                }
                                                if (i10 == profileActivity.f33918e4) {
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
                                                if (i10 == profileActivity.f33954j4) {
                                                    return 25;
                                                }
                                                if (i10 != profileActivity.S3 && i10 != profileActivity.U3) {
                                                    if (i10 == profileActivity.f33961k4) {
                                                        return 32;
                                                    }
                                                    if (i10 == profileActivity.f33972m4) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e01.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        zz0 waVar;
        float f7;
        View b01Var;
        int i12 = 1;
        boolean z12 = false;
        Context context = this.f36763c;
        ProfileActivity profileActivity = this.e;
        switch (i10) {
            case 1:
                waVar = new org.telegram.ui.Cells.l4(this.f36763c, org.telegram.ui.ActionBar.k6.L6, 18, 7, false, profileActivity.A0);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.g6 g6Var = profileActivity.A0;
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
                yz0 yz0Var = new yz0(this, this.f36763c, g6Var, z12, z11);
                yz0Var.setContentDescriptionValueFirst(true);
                waVar = yz0Var;
                break;
            case 3:
                zz0 zz0Var = new zz0(this, context, profileActivity, profileActivity.A0);
                profileActivity.P5 = zz0Var;
                waVar = zz0Var;
                break;
            case 4:
                waVar = new fs(this, context, profileActivity.A0);
                break;
            case 5:
                View b3Var = new org.telegram.ui.Cells.b3(context, profileActivity.A0);
                b3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                waVar = b3Var;
                break;
            case 6:
                waVar = new a01(this, context, profileActivity.A0);
                break;
            case 7:
                waVar = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                break;
            case 8:
                if (profileActivity.f34052x4 == -1) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                waVar = new org.telegram.ui.Cells.wa(i11, 0, this.f36763c, profileActivity.A0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 10, profileActivity.A0);
                e9Var.getTextView().setGravity(1);
                org.telegram.ui.ActionBar.r6.W(e9Var.getTextView(), org.telegram.ui.ActionBar.k6.A6, profileActivity.A0);
                e9Var.getTextView().setMovementMethod(null);
                e9Var.setText(AndroidUtilities.getBuildVersionInfo());
                e9Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                waVar = e9Var;
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
                waVar = s3Var;
                break;
            case 12:
                b01Var = new b01(this, context);
                b01Var.setBackground(new ColorDrawable(0));
                b01Var.setTag(-33024);
                waVar = b01Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                b01Var = profileActivity.O;
                b01Var.setTag(-33024);
                waVar = b01Var;
                break;
            case 15:
                waVar = new d01(this, context, profileActivity.A0);
                break;
            case 17:
                waVar = new org.telegram.ui.Cells.e9(context, profileActivity.A0);
                break;
            case 18:
            case 24:
                if (i10 == 18) {
                    i12 = 0;
                }
                View s1Var = new sg.s1(context, i12, profileActivity.A0);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, s1Var, profileActivity.A0);
                waVar = s1Var;
                break;
            case 20:
                waVar = new org.telegram.ui.Cells.w8(18, context, profileActivity.A0, false);
                break;
            case 21:
                View i1Var = new ig.i1(context, profileActivity.A0);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, i1Var, profileActivity.A0);
                waVar = i1Var;
                break;
            case 22:
                View c01Var = new c01(this, context, profileActivity.A0);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, c01Var, profileActivity.A0);
                waVar = c01Var;
                break;
            case 23:
                waVar = new org.telegram.ui.Cells.h6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                ei.d dVar = new ei.d(context, profileActivity.A0, true);
                dVar.f();
                dVar.i(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new tz0(this, 0));
                frameLayout.addView(dVar, w7.z5.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, frameLayout, profileActivity.A0);
                waVar = frameLayout;
                break;
            case 26:
                waVar = new org.telegram.ui.Cells.e9(context, profileActivity.A0);
                break;
            case 27:
                waVar = new gi.i(context, profileActivity.A0);
                break;
            case 28:
                b01Var = new org.telegram.ui.Components.sn(context, 22);
                b01Var.setTag(-33024);
                waVar = b01Var;
                break;
            case 32:
                waVar = new r01(profileActivity, context);
                break;
            case 33:
                waVar = new ii.c(context, profileActivity.A0);
                break;
        }
        if (i10 != 13) {
            waVar.setLayoutParams(new s4.o0(-1, -2));
        }
        return new s4.b1(waVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        View view = b1Var.f46342a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.c9) {
            ((org.telegram.ui.Cells.c9) view).f22216a.setLoading(profileActivity.f33962k5);
            ((org.telegram.ui.Cells.c9) view).f22217b.setLoading(profileActivity.f33962k5);
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        View view = b1Var.f46342a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
