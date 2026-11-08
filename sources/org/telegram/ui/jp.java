package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class jp extends org.telegram.ui.Components.oj0 {
    public final Context f47018c;
    public boolean d;
    public final kp f47019e;

    public jp(kp kpVar, Context context) {
        this.f47019e = kpVar;
        if (kpVar.D == 2) {
            C(true);
        }
        this.f47018c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        TLRPC.Chat chat;
        int i7 = d1Var.f57047f;
        kp kpVar = this.f47019e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = kpVar.P;
        int i10 = kpVar.D;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = kpVar.N;
        if (!kpVar.f47257x.creator || ((i10 != 0 && (i10 != 2 || !kpVar.K)) || i7 != 4 || d1Var.b() != kpVar.f47234e0)) {
            if (kpVar.I) {
                if ((i10 == 0 || i10 == 2) && i7 == 4) {
                    int b10 = d1Var.b();
                    if (b10 == kpVar.W) {
                        if (!tL_chatAdminRights.add_admins && ((chat = kpVar.f47257x) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i10 != 2 || kpVar.K) {
                        if (b10 == kpVar.X) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !kpVar.E) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == kpVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == kpVar.Z) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == kpVar.f47225a0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == kpVar.f47228b0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == kpVar.f47231c0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == kpVar.K0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == kpVar.f47232d0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == kpVar.f47234e0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == kpVar.f47236f0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == kpVar.f47237g0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == kpVar.f47238h0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == kpVar.f47239i0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == kpVar.m0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == kpVar.U0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == kpVar.V0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == kpVar.W0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == kpVar.f47244n0) {
                                    return tL_chatAdminRights.manage_linked_peers;
                                }
                            }
                        }
                    } else {
                        return false;
                    }
                }
                if (i7 == 3 || i7 == 1 || i7 == 5 || i7 == 8 || i7 == 11) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f47019e.V;
    }

    @Override
    public final long c(int i7) {
        kp kpVar = this.f47019e;
        if (kpVar.D == 2) {
            if (i7 == kpVar.W) {
                return 1L;
            }
            if (i7 == kpVar.X) {
                return 2L;
            }
            if (i7 == kpVar.Y) {
                return 3L;
            }
            if (i7 == kpVar.f47228b0) {
                return 4L;
            }
            if (i7 == kpVar.f47231c0) {
                return 5L;
            }
            if (i7 == kpVar.f47232d0) {
                return 6L;
            }
            if (i7 == kpVar.f47234e0) {
                return 7L;
            }
            if (i7 == kpVar.f47236f0) {
                return 8L;
            }
            if (i7 == kpVar.f47237g0) {
                return 9L;
            }
            if (i7 == kpVar.f47238h0) {
                return 10L;
            }
            if (i7 == kpVar.f47245o0) {
                return 11L;
            }
            if (i7 == kpVar.f47246p0) {
                return 12L;
            }
            if (i7 == kpVar.f47247q0) {
                return 13L;
            }
            if (i7 == kpVar.f47249r0) {
                return 14L;
            }
            if (i7 == kpVar.f47251s0) {
                return 15L;
            }
            if (i7 == kpVar.f47252t0) {
                return 16L;
            }
            if (i7 == kpVar.f47253u0) {
                return 17L;
            }
            if (i7 == kpVar.f47254v0) {
                return 18L;
            }
            if (i7 == kpVar.f47256w0) {
                return 19L;
            }
            if (i7 == kpVar.f47260y0) {
                return 20L;
            }
            if (i7 == kpVar.B0) {
                return 21L;
            }
            if (i7 == kpVar.H0) {
                return 22L;
            }
            if (i7 == kpVar.I0) {
                return 23L;
            }
            if (i7 == kpVar.J0) {
                return 24L;
            }
            if (i7 == kpVar.K0) {
                return 25L;
            }
            if (i7 == kpVar.L0) {
                return 26L;
            }
            if (i7 == kpVar.M0) {
                return 27L;
            }
            if (i7 == kpVar.f47258x0) {
                return 28L;
            }
            if (i7 == kpVar.m0) {
                return 29L;
            }
            if (i7 == kpVar.C0) {
                return 30L;
            }
            if (i7 == kpVar.E0) {
                return 31L;
            }
            if (i7 == kpVar.D0) {
                return 32L;
            }
            if (i7 == kpVar.F0) {
                return 33L;
            }
            if (i7 == kpVar.G0) {
                return 34L;
            }
            if (i7 == kpVar.f47261z0) {
                return 35L;
            }
            if (i7 == kpVar.N0) {
                return 36L;
            }
            if (i7 == kpVar.P0) {
                return 37L;
            }
            if (i7 == kpVar.Q0) {
                return 38L;
            }
            if (i7 == kpVar.R0) {
                return 39L;
            }
            if (i7 == kpVar.S0) {
                return 40L;
            }
            if (i7 == kpVar.U0) {
                return 41L;
            }
            if (i7 == kpVar.V0) {
                return 42L;
            }
            if (i7 == kpVar.W0) {
                return 43L;
            }
            if (i7 == kpVar.Z) {
                return 44L;
            }
            if (i7 == kpVar.f47239i0) {
                return 45L;
            }
            if (i7 == kpVar.f47240j0) {
                return 46L;
            }
            if (i7 == kpVar.f47241k0) {
                return 47L;
            }
            if (i7 == kpVar.f47242l0) {
                return 48L;
            }
            if (i7 == kpVar.f47244n0) {
                return 49L;
            }
            if (i7 == kpVar.f47225a0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int d(int i7) {
        kp kpVar = this.f47019e;
        if (i7 != kpVar.H0 && i7 != kpVar.J0 && i7 != kpVar.I0 && i7 != kpVar.B0 && i7 != kpVar.C0 && i7 != kpVar.E0 && i7 != kpVar.D0 && i7 != kpVar.G0 && i7 != kpVar.F0 && i7 != kpVar.f47240j0 && i7 != kpVar.P0 && i7 != kpVar.Q0 && i7 != kpVar.R0 && i7 != kpVar.U0 && i7 != kpVar.V0 && i7 != kpVar.W0) {
            if (i7 != kpVar.f47261z0 && i7 != kpVar.N0 && i7 != kpVar.S0) {
                if (i7 == 0) {
                    return 0;
                }
                if (i7 != 1 && i7 != kpVar.f47245o0 && i7 != kpVar.f47247q0 && i7 != kpVar.L0 && i7 != kpVar.f47251s0) {
                    if (i7 != 2 && i7 != kpVar.f47253u0) {
                        if (i7 != kpVar.X && i7 != kpVar.Y && i7 != kpVar.Z && i7 != kpVar.f47228b0 && i7 != kpVar.f47231c0 && i7 != kpVar.f47232d0 && i7 != kpVar.f47236f0 && i7 != kpVar.f47237g0 && i7 != kpVar.f47238h0 && i7 != kpVar.f47239i0 && i7 != kpVar.f47260y0 && i7 != kpVar.f47234e0 && i7 != kpVar.K0 && i7 != kpVar.W && i7 != kpVar.m0 && i7 != kpVar.f47241k0 && i7 != kpVar.f47244n0 && i7 != kpVar.f47225a0) {
                            if (i7 == kpVar.f47249r0 || i7 == kpVar.f47256w0 || i7 == kpVar.f47242l0) {
                                return 1;
                            }
                            if (i7 == kpVar.M0) {
                                return 6;
                            }
                            if (i7 == kpVar.f47254v0) {
                                return 11;
                            }
                            if (i7 != kpVar.f47258x0) {
                                return 2;
                            }
                            return 8;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 5;
            }
            return 9;
        }
        return 10;
    }

    @Override
    public final void t(v4.d1 r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jp.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.c2 c2Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.f47018c;
        kp kpVar = this.f47019e;
        switch (i7) {
            case 0:
                View oaVar = new org.telegram.ui.Cells.oa(context, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, oaVar, null);
                c2Var = oaVar;
                break;
            case 1:
                c2Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 2:
            default:
                View w9Var = new org.telegram.ui.Cells.w9(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, w9Var, null);
                c2Var = w9Var;
                break;
            case 3:
                View n4Var = new org.telegram.ui.Cells.n4(this.f47018c, org.telegram.ui.ActionBar.k6.L6, 21, 15, true, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, n4Var, null);
                c2Var = n4Var;
                break;
            case 4:
            case 9:
                View q8Var = new org.telegram.ui.Cells.q8(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, q8Var, null);
                c2Var = q8Var;
                break;
            case 5:
                c2Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 6:
                View x8Var = new org.telegram.ui.Cells.x8(context, null, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, x8Var, null);
                c2Var = x8Var;
                break;
            case 7:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, 0, null, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, a6Var, null);
                a6Var.b(new m0(this, 5));
                c2Var = a6Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                kpVar.d = frameLayout;
                int i12 = org.telegram.ui.ActionBar.k6.f27796a7;
                org.telegram.ui.ActionBar.r6.i(i12, frameLayout, null);
                kpVar.f47233e = new FrameLayout(context);
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, false, false);
                kpVar.f47235f = j6Var;
                j6Var.setTypeface(org.telegram.messenger.g0.o());
                kpVar.f47235f.setTextColor(-1);
                kpVar.f47235f.setTextSize(org.telegram.messenger.g0.L(14.0f));
                kpVar.f47235f.setGravity(17);
                org.telegram.ui.Components.j6 j6Var2 = kpVar.f47235f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131754459, sb2, " ");
                if (kpVar.K) {
                    i10 = 2131754458;
                } else {
                    i10 = 2131754457;
                }
                sb2.append(org.telegram.messenger.id.M0(i10, null));
                j6Var2.setText(sb2.toString());
                kpVar.f47233e.addView(kpVar.f47235f, c8.ha.e(-2, -2, 17));
                kpVar.f47233e.setBackground(org.telegram.ui.ActionBar.z5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
                kpVar.f47233e.setOnClickListener(new a(this, 14));
                kpVar.d.addView(kpVar.f47233e, c8.ha.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                kpVar.d.setLayoutParams(new v4.o0(-1, -2));
                View view = new View(context);
                org.telegram.ui.ActionBar.r6.i(i12, view, null);
                kpVar.d.setClipChildren(false);
                kpVar.d.setClipToPadding(false);
                kpVar.d.addView(view, c8.ha.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                c2Var = kpVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(this.f47018c, 4, 21, false, kpVar.getResourceProvider());
                c2Var2.setPad(1);
                c2Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.f27908g7, org.telegram.ui.ActionBar.k6.f27982k7);
                c2Var2.setEnabled(true);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, c2Var2, null);
                c2Var = c2Var2;
                break;
            case 11:
                i11 = ((org.telegram.ui.ActionBar.f2) kpVar).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.f2) kpVar).resourceProvider;
                c2Var = new org.telegram.ui.Components.ey0(i11, -kpVar.f47250s, this.f47018c, f6Var);
                break;
        }
        return new v4.d1(c2Var);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        int b10 = d1Var.b();
        kp kpVar = this.f47019e;
        if (b10 == kpVar.f47253u0) {
            kp.k0(kpVar, d1Var.f57043a);
        }
    }

    @Override
    public final void z(v4.d1 d1Var) {
        int b10 = d1Var.b();
        kp kpVar = this.f47019e;
        if (b10 == kpVar.f47254v0 && kpVar.getParentActivity() != null) {
            org.telegram.messenger.g0.v1(kpVar.getParentActivity().getCurrentFocus());
        }
    }
}
