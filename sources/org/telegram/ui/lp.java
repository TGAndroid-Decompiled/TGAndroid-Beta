package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class lp extends org.telegram.ui.Components.oj0 {
    public final Context f47648c;
    public boolean d;
    public final mp f47649e;

    public lp(mp mpVar, Context context) {
        this.f47649e = mpVar;
        if (mpVar.D == 2) {
            C(true);
        }
        this.f47648c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        TLRPC.Chat chat;
        int i7 = d1Var.f57056f;
        mp mpVar = this.f47649e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = mpVar.P;
        int i10 = mpVar.D;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = mpVar.N;
        if (!mpVar.f48033x.creator || ((i10 != 0 && (i10 != 2 || !mpVar.K)) || i7 != 4 || d1Var.b() != mpVar.f48010e0)) {
            if (mpVar.I) {
                if ((i10 == 0 || i10 == 2) && i7 == 4) {
                    int b10 = d1Var.b();
                    if (b10 == mpVar.W) {
                        if (!tL_chatAdminRights.add_admins && ((chat = mpVar.f48033x) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i10 != 2 || mpVar.K) {
                        if (b10 == mpVar.X) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !mpVar.E) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == mpVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == mpVar.Z) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == mpVar.f48001a0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == mpVar.f48004b0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == mpVar.f48007c0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == mpVar.K0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == mpVar.f48008d0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == mpVar.f48010e0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == mpVar.f48012f0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == mpVar.f48013g0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == mpVar.f48014h0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == mpVar.f48015i0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == mpVar.m0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == mpVar.U0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == mpVar.V0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == mpVar.W0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == mpVar.f48020n0) {
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
        return this.f47649e.V;
    }

    @Override
    public final long c(int i7) {
        mp mpVar = this.f47649e;
        if (mpVar.D == 2) {
            if (i7 == mpVar.W) {
                return 1L;
            }
            if (i7 == mpVar.X) {
                return 2L;
            }
            if (i7 == mpVar.Y) {
                return 3L;
            }
            if (i7 == mpVar.f48004b0) {
                return 4L;
            }
            if (i7 == mpVar.f48007c0) {
                return 5L;
            }
            if (i7 == mpVar.f48008d0) {
                return 6L;
            }
            if (i7 == mpVar.f48010e0) {
                return 7L;
            }
            if (i7 == mpVar.f48012f0) {
                return 8L;
            }
            if (i7 == mpVar.f48013g0) {
                return 9L;
            }
            if (i7 == mpVar.f48014h0) {
                return 10L;
            }
            if (i7 == mpVar.f48021o0) {
                return 11L;
            }
            if (i7 == mpVar.f48022p0) {
                return 12L;
            }
            if (i7 == mpVar.f48023q0) {
                return 13L;
            }
            if (i7 == mpVar.f48025r0) {
                return 14L;
            }
            if (i7 == mpVar.f48027s0) {
                return 15L;
            }
            if (i7 == mpVar.f48028t0) {
                return 16L;
            }
            if (i7 == mpVar.f48029u0) {
                return 17L;
            }
            if (i7 == mpVar.f48030v0) {
                return 18L;
            }
            if (i7 == mpVar.f48032w0) {
                return 19L;
            }
            if (i7 == mpVar.f48036y0) {
                return 20L;
            }
            if (i7 == mpVar.B0) {
                return 21L;
            }
            if (i7 == mpVar.H0) {
                return 22L;
            }
            if (i7 == mpVar.I0) {
                return 23L;
            }
            if (i7 == mpVar.J0) {
                return 24L;
            }
            if (i7 == mpVar.K0) {
                return 25L;
            }
            if (i7 == mpVar.L0) {
                return 26L;
            }
            if (i7 == mpVar.M0) {
                return 27L;
            }
            if (i7 == mpVar.f48034x0) {
                return 28L;
            }
            if (i7 == mpVar.m0) {
                return 29L;
            }
            if (i7 == mpVar.C0) {
                return 30L;
            }
            if (i7 == mpVar.E0) {
                return 31L;
            }
            if (i7 == mpVar.D0) {
                return 32L;
            }
            if (i7 == mpVar.F0) {
                return 33L;
            }
            if (i7 == mpVar.G0) {
                return 34L;
            }
            if (i7 == mpVar.f48037z0) {
                return 35L;
            }
            if (i7 == mpVar.N0) {
                return 36L;
            }
            if (i7 == mpVar.P0) {
                return 37L;
            }
            if (i7 == mpVar.Q0) {
                return 38L;
            }
            if (i7 == mpVar.R0) {
                return 39L;
            }
            if (i7 == mpVar.S0) {
                return 40L;
            }
            if (i7 == mpVar.U0) {
                return 41L;
            }
            if (i7 == mpVar.V0) {
                return 42L;
            }
            if (i7 == mpVar.W0) {
                return 43L;
            }
            if (i7 == mpVar.Z) {
                return 44L;
            }
            if (i7 == mpVar.f48015i0) {
                return 45L;
            }
            if (i7 == mpVar.f48016j0) {
                return 46L;
            }
            if (i7 == mpVar.f48017k0) {
                return 47L;
            }
            if (i7 == mpVar.f48018l0) {
                return 48L;
            }
            if (i7 == mpVar.f48020n0) {
                return 49L;
            }
            if (i7 == mpVar.f48001a0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int d(int i7) {
        mp mpVar = this.f47649e;
        if (i7 != mpVar.H0 && i7 != mpVar.J0 && i7 != mpVar.I0 && i7 != mpVar.B0 && i7 != mpVar.C0 && i7 != mpVar.E0 && i7 != mpVar.D0 && i7 != mpVar.G0 && i7 != mpVar.F0 && i7 != mpVar.f48016j0 && i7 != mpVar.P0 && i7 != mpVar.Q0 && i7 != mpVar.R0 && i7 != mpVar.U0 && i7 != mpVar.V0 && i7 != mpVar.W0) {
            if (i7 != mpVar.f48037z0 && i7 != mpVar.N0 && i7 != mpVar.S0) {
                if (i7 == 0) {
                    return 0;
                }
                if (i7 != 1 && i7 != mpVar.f48021o0 && i7 != mpVar.f48023q0 && i7 != mpVar.L0 && i7 != mpVar.f48027s0) {
                    if (i7 != 2 && i7 != mpVar.f48029u0) {
                        if (i7 != mpVar.X && i7 != mpVar.Y && i7 != mpVar.Z && i7 != mpVar.f48004b0 && i7 != mpVar.f48007c0 && i7 != mpVar.f48008d0 && i7 != mpVar.f48012f0 && i7 != mpVar.f48013g0 && i7 != mpVar.f48014h0 && i7 != mpVar.f48015i0 && i7 != mpVar.f48036y0 && i7 != mpVar.f48010e0 && i7 != mpVar.K0 && i7 != mpVar.W && i7 != mpVar.m0 && i7 != mpVar.f48017k0 && i7 != mpVar.f48020n0 && i7 != mpVar.f48001a0) {
                            if (i7 == mpVar.f48025r0 || i7 == mpVar.f48032w0 || i7 == mpVar.f48018l0) {
                                return 1;
                            }
                            if (i7 == mpVar.M0) {
                                return 6;
                            }
                            if (i7 == mpVar.f48030v0) {
                                return 11;
                            }
                            if (i7 != mpVar.f48034x0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lp.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.c2 c2Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.h6 h6Var;
        Context context = this.f47648c;
        mp mpVar = this.f47649e;
        switch (i7) {
            case 0:
                View oaVar = new org.telegram.ui.Cells.oa(context, null);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, oaVar, null);
                c2Var = oaVar;
                break;
            case 1:
                c2Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 2:
            default:
                View w9Var = new org.telegram.ui.Cells.w9(context);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, w9Var, null);
                c2Var = w9Var;
                break;
            case 3:
                View n4Var = new org.telegram.ui.Cells.n4(this.f47648c, org.telegram.ui.ActionBar.m6.L6, 21, 15, true, null);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, n4Var, null);
                c2Var = n4Var;
                break;
            case 4:
            case 9:
                View q8Var = new org.telegram.ui.Cells.q8(context);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, q8Var, null);
                c2Var = q8Var;
                break;
            case 5:
                c2Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 6:
                View x8Var = new org.telegram.ui.Cells.x8(context, null, false);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, x8Var, null);
                c2Var = x8Var;
                break;
            case 7:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, 0, null, null);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, a6Var, null);
                a6Var.b(new m0(this, 5));
                c2Var = a6Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                mpVar.d = frameLayout;
                int i12 = org.telegram.ui.ActionBar.m6.f27834a7;
                org.telegram.ui.ActionBar.t6.h(i12, frameLayout, null);
                mpVar.f48009e = new FrameLayout(context);
                org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, true, false, false);
                mpVar.f48011f = i6Var;
                i6Var.setTypeface(org.telegram.messenger.g0.o());
                mpVar.f48011f.setTextColor(-1);
                mpVar.f48011f.setTextSize(org.telegram.messenger.g0.L(14.0f));
                mpVar.f48011f.setGravity(17);
                org.telegram.ui.Components.i6 i6Var2 = mpVar.f48011f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131754459, sb2, " ");
                if (mpVar.K) {
                    i10 = 2131754458;
                } else {
                    i10 = 2131754457;
                }
                sb2.append(org.telegram.messenger.id.M0(i10, null));
                i6Var2.setText(sb2.toString());
                mpVar.f48009e.addView(mpVar.f48011f, c8.ha.e(-2, -2, 17));
                mpVar.f48009e.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.m6.Ci, 4.0f));
                mpVar.f48009e.setOnClickListener(new a(this, 14));
                mpVar.d.addView(mpVar.f48009e, c8.ha.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                mpVar.d.setLayoutParams(new v4.o0(-1, -2));
                View view = new View(context);
                org.telegram.ui.ActionBar.t6.h(i12, view, null);
                mpVar.d.setClipChildren(false);
                mpVar.d.setClipToPadding(false);
                mpVar.d.addView(view, c8.ha.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                c2Var = mpVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(this.f47648c, 4, 21, false, mpVar.getResourceProvider());
                c2Var2.setPad(1);
                c2Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.m6.V6, org.telegram.ui.ActionBar.m6.f27946g7, org.telegram.ui.ActionBar.m6.f28020k7);
                c2Var2.setEnabled(true);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, c2Var2, null);
                c2Var = c2Var2;
                break;
            case 11:
                i11 = ((org.telegram.ui.ActionBar.f2) mpVar).currentAccount;
                h6Var = ((org.telegram.ui.ActionBar.f2) mpVar).resourceProvider;
                c2Var = new org.telegram.ui.Components.ey0(i11, -mpVar.f48026s, this.f47648c, h6Var);
                break;
        }
        return new v4.d1(c2Var);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        int b10 = d1Var.b();
        mp mpVar = this.f47649e;
        if (b10 == mpVar.f48029u0) {
            mp.k0(mpVar, d1Var.f57052a);
        }
    }

    @Override
    public final void z(v4.d1 d1Var) {
        int b10 = d1Var.b();
        mp mpVar = this.f47649e;
        if (b10 == mpVar.f48030v0 && mpVar.getParentActivity() != null) {
            org.telegram.messenger.g0.v1(mpVar.getParentActivity().getCurrentFocus());
        }
    }
}
