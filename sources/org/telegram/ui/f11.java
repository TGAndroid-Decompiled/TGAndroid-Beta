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
public final class f11 extends org.telegram.ui.Components.lm0 {
    public final Context f35711c;
    public final HashMap d = new HashMap();
    public final ProfileActivity e;

    public f11(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.f35711c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        int b10 = b1Var.b();
        ProfileActivity profileActivity = this.e;
        if (b10 == profileActivity.O2) {
            profileActivity.M2 = null;
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.f32569f3 != -1) {
            int b10 = b1Var.b();
            if (b10 != profileActivity.f32569f3 && b10 != profileActivity.T2 && b10 != profileActivity.f32583h3 && b10 != profileActivity.f32576g3 && b10 != profileActivity.V2 && b10 != profileActivity.W2 && b10 != profileActivity.f32706z3 && b10 != profileActivity.f32590i3 && b10 != profileActivity.f32597j3 && b10 != profileActivity.f32643q3 && b10 != profileActivity.f32623n3 && b10 != profileActivity.f32604k3 && b10 != profileActivity.f32615m3 && b10 != profileActivity.f32650r3 && b10 != profileActivity.f32658s3 && b10 != profileActivity.f32679v3 && b10 != profileActivity.f32687w3 && b10 != profileActivity.f32694x3 && b10 != profileActivity.y3 && b10 != profileActivity.O2 && b10 != profileActivity.f32532a4 && b10 != profileActivity.f32548c4 && b10 != profileActivity.f32577g4 && b10 != profileActivity.f32570f4 && b10 != profileActivity.f32610l3 && b10 != profileActivity.U2 && b10 != profileActivity.Q2 && b10 != profileActivity.f32555d4 && b10 != profileActivity.f32562e4 && b10 != profileActivity.l4) {
                return false;
            }
        } else {
            View view = b1Var.f44838a;
            if (view instanceof org.telegram.ui.Cells.xa) {
                Object currentObject = ((org.telegram.ui.Cells.xa) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = b1Var.f44841f;
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
        if (i10 != profileActivity.D3 && i10 != profileActivity.f32666t4 && i10 != profileActivity.f32561e3 && i10 != profileActivity.S2 && i10 != profileActivity.f32637p3 && i10 != profileActivity.f32672u3 && i10 != profileActivity.f32624n4) {
            if (i10 != profileActivity.G3 && i10 != profileActivity.I3 && i10 != profileActivity.T2 && i10 != profileActivity.U2) {
                if (i10 != profileActivity.L3 && i10 != profileActivity.V2) {
                    if (i10 == profileActivity.H3) {
                        return 30;
                    }
                    if (i10 != profileActivity.J3 && i10 != profileActivity.K3 && i10 != profileActivity.W2) {
                        if (i10 != profileActivity.f32644q4 && i10 != profileActivity.f32651r4 && i10 != profileActivity.V3 && i10 != profileActivity.X3 && i10 != profileActivity.W3 && i10 != profileActivity.f32695x4 && i10 != profileActivity.f32701y4 && i10 != profileActivity.f32707z4 && i10 != profileActivity.A4 && i10 != profileActivity.G4 && i10 != profileActivity.f32688w4 && i10 != profileActivity.L4 && i10 != profileActivity.K4 && i10 != profileActivity.U3 && i10 != profileActivity.f32569f3 && i10 != profileActivity.f32583h3 && i10 != profileActivity.f32576g3 && i10 != profileActivity.f32590i3 && i10 != profileActivity.f32597j3 && i10 != profileActivity.f32643q3 && i10 != profileActivity.f32623n3 && i10 != profileActivity.f32604k3 && i10 != profileActivity.f32615m3 && i10 != profileActivity.f32650r3 && i10 != profileActivity.f32658s3 && i10 != profileActivity.f32679v3 && i10 != profileActivity.f32687w3 && i10 != profileActivity.f32694x3 && i10 != profileActivity.y3 && i10 != profileActivity.O2 && i10 != profileActivity.f32532a4 && i10 != profileActivity.Z3 && i10 != profileActivity.f32610l3 && i10 != profileActivity.f32577g4 && i10 != profileActivity.f32570f4 && i10 != profileActivity.B4 && i10 != profileActivity.C4 && i10 != profileActivity.D4) {
                            i11 = profileActivity.botPermissionLocation;
                            if (i10 != i11) {
                                i12 = profileActivity.botPermissionBiometry;
                                if (i10 != i12) {
                                    i13 = profileActivity.botPermissionEmojiStatus;
                                    if (i10 != i13 && i10 != profileActivity.f32562e4) {
                                        if (i10 == profileActivity.M3) {
                                            return 5;
                                        }
                                        if (i10 == profileActivity.N3) {
                                            return 6;
                                        }
                                        if (i10 == profileActivity.Q3) {
                                            return 20;
                                        }
                                        if (i10 != profileActivity.M4 && i10 != profileActivity.H4 && i10 != profileActivity.f32616m4 && i10 != profileActivity.f32659s4 && i10 != profileActivity.f32554d3 && i10 != profileActivity.f32630o3 && i10 != profileActivity.f32665t3 && i10 != profileActivity.P2 && i10 != profileActivity.f32539b3 && i10 != profileActivity.X2 && i10 != profileActivity.f32584h4 && i10 != profileActivity.Y3 && i10 != profileActivity.R2 && i10 != profileActivity.Z2 && i10 != profileActivity.F4 && i10 != profileActivity.f32638p4 && i10 != profileActivity.E4 && i10 != profileActivity.f32605k4) {
                                            if (i10 >= profileActivity.f32673u4 && i10 < profileActivity.f32680v4) {
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
                                            if (i10 == profileActivity.f32706z3) {
                                                return 14;
                                            }
                                            if (i10 != profileActivity.f32547c3 && i10 != profileActivity.f32531a3 && i10 != profileActivity.Y2) {
                                                if (i10 == profileActivity.f32540b4) {
                                                    return 17;
                                                }
                                                if (i10 == profileActivity.f32548c4) {
                                                    return 18;
                                                }
                                                if (i10 == profileActivity.f32555d4) {
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
                                                if (i10 == profileActivity.f32591i4) {
                                                    return 25;
                                                }
                                                if (i10 != profileActivity.R3 && i10 != profileActivity.T3) {
                                                    if (i10 == profileActivity.f32598j4) {
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
    public final void v(s4.b1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f11.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        a11 xaVar;
        float f7;
        View c11Var;
        int i12 = 1;
        boolean z12 = false;
        Context context = this.f35711c;
        ProfileActivity profileActivity = this.e;
        switch (i10) {
            case 1:
                xaVar = new org.telegram.ui.Cells.m4(this.f35711c, org.telegram.ui.ActionBar.g6.L6, 18, 7, false, profileActivity.f32703z0);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.c6 c6Var = profileActivity.f32703z0;
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
                z01 z01Var = new z01(this, this.f35711c, c6Var, z12, z11);
                z01Var.setContentDescriptionValueFirst(true);
                xaVar = z01Var;
                break;
            case 3:
                a11 a11Var = new a11(this, context, profileActivity, profileActivity.f32703z0);
                profileActivity.N5 = a11Var;
                xaVar = a11Var;
                break;
            case 4:
                xaVar = new us(this, context, profileActivity.f32703z0);
                break;
            case 5:
                View d3Var = new org.telegram.ui.Cells.d3(context, profileActivity.f32703z0);
                d3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                xaVar = d3Var;
                break;
            case 6:
                xaVar = new b11(this, context, profileActivity.f32703z0);
                break;
            case 7:
                xaVar = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
                break;
            case 8:
                if (profileActivity.f32688w4 == -1) {
                    i11 = 9;
                } else {
                    i11 = 6;
                }
                xaVar = new org.telegram.ui.Cells.xa(i11, 0, this.f35711c, profileActivity.f32703z0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 10, profileActivity.f32703z0);
                e9Var.getTextView().setGravity(1);
                e9Var.getTextView().setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.A6, profileActivity.f32703z0));
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
                c11Var = new c11(this, context);
                c11Var.setBackground(new ColorDrawable(0));
                c11Var.setTag(-33024);
                xaVar = c11Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                c11Var = profileActivity.O;
                c11Var.setTag(-33024);
                xaVar = c11Var;
                break;
            case 15:
                xaVar = new e11(this, context, profileActivity.f32703z0);
                break;
            case 17:
                xaVar = new org.telegram.ui.Cells.e9(context, profileActivity.f32703z0);
                break;
            case 18:
            case 24:
                if (i10 == 18) {
                    i12 = 0;
                }
                View s1Var = new sg.s1(context, i12, profileActivity.f32703z0);
                s1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, profileActivity.f32703z0));
                xaVar = s1Var;
                break;
            case 20:
                xaVar = new org.telegram.ui.Cells.w8(18, context, profileActivity.f32703z0, false);
                break;
            case 21:
                View k1Var = new ig.k1(context, profileActivity.f32703z0);
                k1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, profileActivity.f32703z0));
                xaVar = k1Var;
                break;
            case 22:
                View d11Var = new d11(this, context, profileActivity.f32703z0);
                d11Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, profileActivity.f32703z0));
                xaVar = d11Var;
                break;
            case 23:
                xaVar = new org.telegram.ui.Cells.h6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                di.d dVar = new di.d(context, profileActivity.f32703z0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new u01(this, 0));
                frameLayout.addView(dVar, w7.a6.a(48.0f, 18.0f, 14.0f, 18.0f, 14.0f, -1, 119));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, profileActivity.f32703z0));
                xaVar = frameLayout;
                break;
            case 26:
                xaVar = new org.telegram.ui.Cells.e9(context, profileActivity.f32703z0);
                break;
            case 27:
                xaVar = new fi.i(context, profileActivity.f32703z0);
                break;
            case 28:
                c11Var = new org.telegram.ui.Components.xn(context, 22);
                c11Var.setTag(-33024);
                xaVar = c11Var;
                break;
            case 32:
                xaVar = new r11(profileActivity, context);
                break;
            case 33:
                xaVar = new hi.c(context, profileActivity.f32703z0);
                break;
        }
        if (i10 != 13) {
            xaVar.setLayoutParams(new s4.o0(-1, -2));
        }
        return new s4.b1(xaVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.c9) {
            ((org.telegram.ui.Cells.c9) view).f21034a.setLoading(profileActivity.f32592i5);
            ((org.telegram.ui.Cells.c9) view).f21035b.setLoading(profileActivity.f32592i5);
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
