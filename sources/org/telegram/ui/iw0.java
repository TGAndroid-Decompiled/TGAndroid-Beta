package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class iw0 extends org.telegram.ui.Components.tj0 {
    public final Context f48122c;
    public final HashMap d = new HashMap();
    public final ProfileActivity f48123e;

    public iw0(ProfileActivity profileActivity, Context context) {
        this.f48123e = profileActivity;
        this.f48122c = context;
    }

    @Override
    public final void A(v4.e1 e1Var) {
        int b10 = e1Var.b();
        ProfileActivity profileActivity = this.f48123e;
        if (b10 == profileActivity.P2) {
            profileActivity.N2 = null;
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        ProfileActivity profileActivity = this.f48123e;
        if (profileActivity.f43111g3 != -1) {
            int b10 = e1Var.b();
            if (b10 != profileActivity.f43111g3 && b10 != profileActivity.U2 && b10 != profileActivity.f43125i3 && b10 != profileActivity.f43118h3 && b10 != profileActivity.W2 && b10 != profileActivity.X2 && b10 != profileActivity.A3 && b10 != profileActivity.j3 && b10 != profileActivity.f43138k3 && b10 != profileActivity.f43185r3 && b10 != profileActivity.f43164o3 && b10 != profileActivity.f43144l3 && b10 != profileActivity.f43157n3 && b10 != profileActivity.f43193s3 && b10 != profileActivity.f43199t3 && b10 != profileActivity.f43220w3 && b10 != profileActivity.f43228x3 && b10 != profileActivity.f43236y3 && b10 != profileActivity.f43243z3 && b10 != profileActivity.P2 && b10 != profileActivity.f43075b4 && b10 != profileActivity.f43089d4 && b10 != profileActivity.f43119h4 && b10 != profileActivity.f43112g4 && b10 != profileActivity.f43150m3 && b10 != profileActivity.V2 && b10 != profileActivity.R2 && b10 != profileActivity.f43097e4 && b10 != profileActivity.f43105f4 && b10 != profileActivity.f43151m4) {
                return false;
            }
        } else {
            View view = e1Var.f58535a;
            if (view instanceof org.telegram.ui.Cells.pa) {
                Object currentObject = ((org.telegram.ui.Cells.pa) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && org.telegram.messenger.q10.B((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i7 = e1Var.f58539f;
            if (i7 == 1 || i7 == 5 || i7 == 7 || i7 == 11 || i7 == 31 || i7 == 28 || i7 == 12 || i7 == 13 || i7 == 9 || i7 == 10 || i7 == 25 || i7 == 32) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.CharSequence E(java.lang.String r7, java.util.ArrayList r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iw0.E(java.lang.String, java.util.ArrayList, java.lang.String):java.lang.CharSequence");
    }

    @Override
    public final int b() {
        return this.f48123e.O2;
    }

    @Override
    public final int d(int i7) {
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.f48123e;
        if (i7 != profileActivity.E3 && i7 != profileActivity.f43206u4 && i7 != profileActivity.f43104f3 && i7 != profileActivity.T2 && i7 != profileActivity.f43177q3 && i7 != profileActivity.f43212v3 && i7 != profileActivity.o4) {
            if (i7 != profileActivity.H3 && i7 != profileActivity.J3 && i7 != profileActivity.U2 && i7 != profileActivity.V2) {
                if (i7 != profileActivity.M3 && i7 != profileActivity.W2) {
                    if (i7 == profileActivity.I3) {
                        return 30;
                    }
                    if (i7 != profileActivity.K3 && i7 != profileActivity.L3 && i7 != profileActivity.X2) {
                        if (i7 != profileActivity.f43186r4 && i7 != profileActivity.f43194s4 && i7 != profileActivity.W3 && i7 != profileActivity.Y3 && i7 != profileActivity.X3 && i7 != profileActivity.f43237y4 && i7 != profileActivity.f43244z4 && i7 != profileActivity.A4 && i7 != profileActivity.B4 && i7 != profileActivity.H4 && i7 != profileActivity.f43229x4 && i7 != profileActivity.N4 && i7 != profileActivity.M4 && i7 != profileActivity.V3 && i7 != profileActivity.f43111g3 && i7 != profileActivity.f43125i3 && i7 != profileActivity.f43118h3 && i7 != profileActivity.j3 && i7 != profileActivity.f43138k3 && i7 != profileActivity.f43185r3 && i7 != profileActivity.f43164o3 && i7 != profileActivity.f43144l3 && i7 != profileActivity.f43157n3 && i7 != profileActivity.f43193s3 && i7 != profileActivity.f43199t3 && i7 != profileActivity.f43220w3 && i7 != profileActivity.f43228x3 && i7 != profileActivity.f43236y3 && i7 != profileActivity.f43243z3 && i7 != profileActivity.P2 && i7 != profileActivity.f43075b4 && i7 != profileActivity.f43067a4 && i7 != profileActivity.f43150m3 && i7 != profileActivity.f43119h4 && i7 != profileActivity.f43112g4 && i7 != profileActivity.C4 && i7 != profileActivity.D4 && i7 != profileActivity.E4) {
                            i10 = profileActivity.botPermissionLocation;
                            if (i7 != i10) {
                                i11 = profileActivity.botPermissionBiometry;
                                if (i7 != i11) {
                                    i12 = profileActivity.botPermissionEmojiStatus;
                                    if (i7 != i12 && i7 != profileActivity.f43105f4) {
                                        if (i7 == profileActivity.N3) {
                                            return 5;
                                        }
                                        if (i7 == profileActivity.O3) {
                                            return 6;
                                        }
                                        if (i7 == profileActivity.R3) {
                                            return 20;
                                        }
                                        if (i7 != profileActivity.O4 && i7 != profileActivity.I4 && i7 != profileActivity.f43158n4 && i7 != profileActivity.f43200t4 && i7 != profileActivity.f43096e3 && i7 != profileActivity.f43170p3 && i7 != profileActivity.f43205u3 && i7 != profileActivity.Q2 && i7 != profileActivity.f43082c3 && i7 != profileActivity.Y2 && i7 != profileActivity.f43126i4 && i7 != profileActivity.Z3 && i7 != profileActivity.S2 && i7 != profileActivity.f43066a3 && i7 != profileActivity.G4 && i7 != profileActivity.f43178q4 && i7 != profileActivity.F4 && i7 != profileActivity.f43145l4) {
                                            if (i7 >= profileActivity.f43213v4 && i7 < profileActivity.f43221w4) {
                                                return 8;
                                            }
                                            if (i7 == profileActivity.B3) {
                                                return 11;
                                            }
                                            if (i7 == profileActivity.C3) {
                                                return 31;
                                            }
                                            if (i7 == profileActivity.D3) {
                                                return 12;
                                            }
                                            if (i7 == profileActivity.L4) {
                                                return 13;
                                            }
                                            if (i7 == profileActivity.A3) {
                                                return 14;
                                            }
                                            if (i7 != profileActivity.f43088d3 && i7 != profileActivity.f43074b3 && i7 != profileActivity.Z2) {
                                                if (i7 == profileActivity.f43083c4) {
                                                    return 17;
                                                }
                                                if (i7 == profileActivity.f43089d4) {
                                                    return 18;
                                                }
                                                if (i7 == profileActivity.f43097e4) {
                                                    return 24;
                                                }
                                                if (i7 == profileActivity.Q3) {
                                                    return 21;
                                                }
                                                if (i7 == profileActivity.P3) {
                                                    return 22;
                                                }
                                                if (i7 == profileActivity.R2) {
                                                    return 23;
                                                }
                                                if (i7 == profileActivity.f43132j4) {
                                                    return 25;
                                                }
                                                if (i7 != profileActivity.S3 && i7 != profileActivity.U3) {
                                                    if (i7 == profileActivity.f43139k4) {
                                                        return 32;
                                                    }
                                                    if (i7 == profileActivity.f43151m4) {
                                                        return 33;
                                                    }
                                                    if (i7 == profileActivity.T3) {
                                                        return 27;
                                                    }
                                                    if (i7 != profileActivity.F3 && i7 != profileActivity.G3) {
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
    public final void t(v4.e1 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iw0.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        boolean z10;
        boolean z11;
        int i10;
        dw0 paVar;
        float f10;
        View fw0Var;
        int i11 = 1;
        boolean z12 = false;
        Context context = this.f48122c;
        ProfileActivity profileActivity = this.f48123e;
        switch (i7) {
            case 1:
                paVar = new org.telegram.ui.Cells.n4(this.f48122c, org.telegram.ui.ActionBar.j6.L6, 18, 7, false, profileActivity.A0);
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.ActionBar.e6 e6Var = profileActivity.A0;
                if (i7 == 30) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (i7 == 19) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                cw0 cw0Var = new cw0(this, this.f48122c, e6Var, z12, z11);
                cw0Var.setContentDescriptionValueFirst(true);
                paVar = cw0Var;
                break;
            case 3:
                dw0 dw0Var = new dw0(this, context, profileActivity, profileActivity.A0);
                profileActivity.f43121h6 = dw0Var;
                paVar = dw0Var;
                break;
            case 4:
                paVar = new nr(this, context, profileActivity.A0);
                break;
            case 5:
                View e3Var = new org.telegram.ui.Cells.e3(context, profileActivity.A0);
                e3Var.setPadding(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f), 0, 0);
                paVar = e3Var;
                break;
            case 6:
                paVar = new ew0(this, context, profileActivity.A0);
                break;
            case 7:
                paVar = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                break;
            case 8:
                if (profileActivity.f43229x4 == -1) {
                    i10 = 9;
                } else {
                    i10 = 6;
                }
                paVar = new org.telegram.ui.Cells.pa(i10, 0, this.f48122c, profileActivity.A0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(10, context, profileActivity.A0);
                y8Var.getTextView().setGravity(1);
                org.telegram.ui.ActionBar.q6.U(y8Var.getTextView(), org.telegram.ui.ActionBar.j6.A6, profileActivity.A0);
                y8Var.getTextView().setMovementMethod(null);
                y8Var.setText(org.telegram.messenger.g0.D0());
                y8Var.getTextView().setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f));
                paVar = y8Var;
                break;
            case 11:
            case 31:
                if (i7 == 31) {
                    f10 = 12.0f;
                } else {
                    f10 = 6.0f;
                }
                View v3Var = new org.telegram.ui.Cells.v3(context, org.telegram.messenger.g0.L(f10), 2);
                v3Var.setTag(-33024);
                paVar = v3Var;
                break;
            case 12:
                fw0Var = new fw0(this, context);
                fw0Var.setBackground(new ColorDrawable(0));
                fw0Var.setTag(-33024);
                paVar = fw0Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                fw0Var = profileActivity.O;
                fw0Var.setTag(-33024);
                paVar = fw0Var;
                break;
            case 15:
                paVar = new hw0(this, context, profileActivity.A0);
                break;
            case 17:
                paVar = new org.telegram.ui.Cells.y8(context, profileActivity.A0);
                break;
            case 18:
            case 24:
                if (i7 == 18) {
                    i11 = 0;
                }
                View m1Var = new ug.m1(i11, context, profileActivity.A0);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, m1Var, profileActivity.A0);
                paVar = m1Var;
                break;
            case 20:
                paVar = new org.telegram.ui.Cells.q8(18, context, profileActivity.A0, false);
                break;
            case 21:
                View g1Var = new kg.g1(context, profileActivity.A0);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, g1Var, profileActivity.A0);
                paVar = g1Var;
                break;
            case 22:
                View gw0Var = new gw0(this, context, profileActivity.A0);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, gw0Var, profileActivity.A0);
                paVar = gw0Var;
                break;
            case 23:
                paVar = new org.telegram.ui.Cells.e6(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                hi.d dVar = new hi.d(context, profileActivity.A0, true);
                dVar.f();
                dVar.i(org.telegram.messenger.hd.M0(2131746708, null), false, true);
                dVar.setOnClickListener(new xv0(this, 0));
                frameLayout.addView(dVar, c8.ja.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, frameLayout, profileActivity.A0);
                paVar = frameLayout;
                break;
            case 26:
                paVar = new org.telegram.ui.Cells.y8(context, profileActivity.A0);
                break;
            case 27:
                paVar = new ki.h(context, profileActivity.A0);
                break;
            case 28:
                fw0Var = new org.telegram.ui.Components.bn(context, 21);
                fw0Var.setTag(-33024);
                paVar = fw0Var;
                break;
            case 32:
                paVar = new uw0(profileActivity, context);
                break;
            case 33:
                paVar = new mi.c(context, profileActivity.A0);
                break;
        }
        if (i7 != 13) {
            paVar.setLayoutParams(new v4.p0(-1, -2));
        }
        return new v4.e1(paVar);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        ProfileActivity profileActivity = this.f48123e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof org.telegram.ui.Cells.w8) {
            ((org.telegram.ui.Cells.w8) view).f31898a.setLoading(profileActivity.f43152m5);
            ((org.telegram.ui.Cells.w8) view).f31899b.setLoading(profileActivity.f43152m5);
        }
    }

    @Override
    public final void z(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        ProfileActivity profileActivity = this.f48123e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
