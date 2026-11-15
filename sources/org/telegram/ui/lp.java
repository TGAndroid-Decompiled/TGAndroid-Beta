package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class lp extends org.telegram.ui.Components.tj0 {
    public final Context f49018c;
    public boolean d;
    public final mp f49019e;

    public lp(mp mpVar, Context context) {
        this.f49019e = mpVar;
        if (mpVar.E == 2) {
            C(true);
        }
        this.f49018c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        TLRPC.Chat chat;
        int i7 = e1Var.f58539f;
        mp mpVar = this.f49019e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = mpVar.Q;
        int i10 = mpVar.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = mpVar.O;
        if (!mpVar.f49301x.creator || ((i10 != 0 && (i10 != 2 || !mpVar.L)) || i7 != 4 || e1Var.b() != mpVar.f49280f0)) {
            if (mpVar.J) {
                if ((i10 == 0 || i10 == 2) && i7 == 4) {
                    int b10 = e1Var.b();
                    if (b10 == mpVar.X) {
                        if (!tL_chatAdminRights.add_admins && ((chat = mpVar.f49301x) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i10 != 2 || mpVar.L) {
                        if (b10 == mpVar.Y) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !mpVar.F) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == mpVar.Z) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == mpVar.f49268a0) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == mpVar.f49271b0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == mpVar.f49274c0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == mpVar.f49276d0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == mpVar.L0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == mpVar.f49278e0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == mpVar.f49280f0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == mpVar.f49281g0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == mpVar.f49282h0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == mpVar.f49283i0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == mpVar.f49284j0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == mpVar.f49288n0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == mpVar.V0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == mpVar.W0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == mpVar.X0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == mpVar.f49289o0) {
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
        return this.f49019e.W;
    }

    @Override
    public final long c(int i7) {
        mp mpVar = this.f49019e;
        if (mpVar.E == 2) {
            if (i7 == mpVar.X) {
                return 1L;
            }
            if (i7 == mpVar.Y) {
                return 2L;
            }
            if (i7 == mpVar.Z) {
                return 3L;
            }
            if (i7 == mpVar.f49274c0) {
                return 4L;
            }
            if (i7 == mpVar.f49276d0) {
                return 5L;
            }
            if (i7 == mpVar.f49278e0) {
                return 6L;
            }
            if (i7 == mpVar.f49280f0) {
                return 7L;
            }
            if (i7 == mpVar.f49281g0) {
                return 8L;
            }
            if (i7 == mpVar.f49282h0) {
                return 9L;
            }
            if (i7 == mpVar.f49283i0) {
                return 10L;
            }
            if (i7 == mpVar.f49290p0) {
                return 11L;
            }
            if (i7 == mpVar.f49291q0) {
                return 12L;
            }
            if (i7 == mpVar.f49293r0) {
                return 13L;
            }
            if (i7 == mpVar.f49295s0) {
                return 14L;
            }
            if (i7 == mpVar.f49296t0) {
                return 15L;
            }
            if (i7 == mpVar.f49297u0) {
                return 16L;
            }
            if (i7 == mpVar.f49298v0) {
                return 17L;
            }
            if (i7 == mpVar.f49300w0) {
                return 18L;
            }
            if (i7 == mpVar.f49302x0) {
                return 19L;
            }
            if (i7 == mpVar.f49305z0) {
                return 20L;
            }
            if (i7 == mpVar.C0) {
                return 21L;
            }
            if (i7 == mpVar.I0) {
                return 22L;
            }
            if (i7 == mpVar.J0) {
                return 23L;
            }
            if (i7 == mpVar.K0) {
                return 24L;
            }
            if (i7 == mpVar.L0) {
                return 25L;
            }
            if (i7 == mpVar.M0) {
                return 26L;
            }
            if (i7 == mpVar.N0) {
                return 27L;
            }
            if (i7 == mpVar.f49304y0) {
                return 28L;
            }
            if (i7 == mpVar.f49288n0) {
                return 29L;
            }
            if (i7 == mpVar.D0) {
                return 30L;
            }
            if (i7 == mpVar.F0) {
                return 31L;
            }
            if (i7 == mpVar.E0) {
                return 32L;
            }
            if (i7 == mpVar.G0) {
                return 33L;
            }
            if (i7 == mpVar.H0) {
                return 34L;
            }
            if (i7 == mpVar.A0) {
                return 35L;
            }
            if (i7 == mpVar.O0) {
                return 36L;
            }
            if (i7 == mpVar.Q0) {
                return 37L;
            }
            if (i7 == mpVar.R0) {
                return 38L;
            }
            if (i7 == mpVar.S0) {
                return 39L;
            }
            if (i7 == mpVar.T0) {
                return 40L;
            }
            if (i7 == mpVar.V0) {
                return 41L;
            }
            if (i7 == mpVar.W0) {
                return 42L;
            }
            if (i7 == mpVar.X0) {
                return 43L;
            }
            if (i7 == mpVar.f49268a0) {
                return 44L;
            }
            if (i7 == mpVar.f49284j0) {
                return 45L;
            }
            if (i7 == mpVar.f49285k0) {
                return 46L;
            }
            if (i7 == mpVar.f49286l0) {
                return 47L;
            }
            if (i7 == mpVar.m0) {
                return 48L;
            }
            if (i7 == mpVar.f49289o0) {
                return 49L;
            }
            if (i7 == mpVar.f49271b0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int d(int i7) {
        mp mpVar = this.f49019e;
        if (i7 != mpVar.I0 && i7 != mpVar.K0 && i7 != mpVar.J0 && i7 != mpVar.C0 && i7 != mpVar.D0 && i7 != mpVar.F0 && i7 != mpVar.E0 && i7 != mpVar.H0 && i7 != mpVar.G0 && i7 != mpVar.f49285k0 && i7 != mpVar.Q0 && i7 != mpVar.R0 && i7 != mpVar.S0 && i7 != mpVar.V0 && i7 != mpVar.W0 && i7 != mpVar.X0) {
            if (i7 != mpVar.A0 && i7 != mpVar.O0 && i7 != mpVar.T0) {
                if (i7 == 0) {
                    return 0;
                }
                if (i7 != 1 && i7 != mpVar.f49290p0 && i7 != mpVar.f49293r0 && i7 != mpVar.M0 && i7 != mpVar.f49296t0) {
                    if (i7 != 2 && i7 != mpVar.f49298v0) {
                        if (i7 != mpVar.Y && i7 != mpVar.Z && i7 != mpVar.f49268a0 && i7 != mpVar.f49274c0 && i7 != mpVar.f49276d0 && i7 != mpVar.f49278e0 && i7 != mpVar.f49281g0 && i7 != mpVar.f49282h0 && i7 != mpVar.f49283i0 && i7 != mpVar.f49284j0 && i7 != mpVar.f49305z0 && i7 != mpVar.f49280f0 && i7 != mpVar.L0 && i7 != mpVar.X && i7 != mpVar.f49288n0 && i7 != mpVar.f49286l0 && i7 != mpVar.f49289o0 && i7 != mpVar.f49271b0) {
                            if (i7 == mpVar.f49295s0 || i7 == mpVar.f49302x0 || i7 == mpVar.m0) {
                                return 1;
                            }
                            if (i7 == mpVar.N0) {
                                return 6;
                            }
                            if (i7 == mpVar.f49300w0) {
                                return 11;
                            }
                            if (i7 != mpVar.f49304y0) {
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
    public final void t(v4.e1 r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lp.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.c2 c2Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = this.f49018c;
        mp mpVar = this.f49019e;
        switch (i7) {
            case 0:
                View oaVar = new org.telegram.ui.Cells.oa(context, null);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, oaVar, null);
                c2Var = oaVar;
                break;
            case 1:
                c2Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 2:
            default:
                View v9Var = new org.telegram.ui.Cells.v9(context);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, v9Var, null);
                c2Var = v9Var;
                break;
            case 3:
                View n4Var = new org.telegram.ui.Cells.n4(this.f49018c, org.telegram.ui.ActionBar.j6.L6, 21, 15, true, null);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var, null);
                c2Var = n4Var;
                break;
            case 4:
            case 9:
                View p8Var = new org.telegram.ui.Cells.p8(context);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, p8Var, null);
                c2Var = p8Var;
                break;
            case 5:
                c2Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                break;
            case 6:
                View w8Var = new org.telegram.ui.Cells.w8(context, null, false);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, w8Var, null);
                c2Var = w8Var;
                break;
            case 7:
                org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context, 0, null, null);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, z5Var, null);
                z5Var.c(new m0(this, 5));
                c2Var = z5Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                mpVar.d = frameLayout;
                int i12 = org.telegram.ui.ActionBar.j6.f28792a7;
                org.telegram.ui.ActionBar.q6.h(i12, frameLayout, null);
                mpVar.f49277e = new FrameLayout(context);
                org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, false, false);
                mpVar.f49279f = h6Var;
                h6Var.setTypeface(org.telegram.messenger.g0.o());
                mpVar.f49279f.setTextColor(-1);
                mpVar.f49279f.setTextSize(org.telegram.messenger.g0.L(14.0f));
                mpVar.f49279f.setGravity(17);
                org.telegram.ui.Components.h6 h6Var2 = mpVar.f49279f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.y0.r(null, 2131754459, sb2, " ");
                if (mpVar.L) {
                    i10 = 2131754458;
                } else {
                    i10 = 2131754457;
                }
                sb2.append(org.telegram.messenger.hd.M0(i10, null));
                h6Var2.setText(sb2.toString());
                mpVar.f49277e.addView(mpVar.f49279f, c8.ja.e(-2, -2, 17));
                mpVar.f49277e.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 4.0f));
                mpVar.f49277e.setOnClickListener(new a(this, 14));
                mpVar.d.addView(mpVar.f49277e, c8.ja.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                mpVar.d.setLayoutParams(new v4.p0(-1, -2));
                View view = new View(context);
                org.telegram.ui.ActionBar.q6.h(i12, view, null);
                mpVar.d.setClipChildren(false);
                mpVar.d.setClipToPadding(false);
                mpVar.d.addView(view, c8.ja.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                c2Var = mpVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(this.f49018c, 4, 21, false, mpVar.getResourceProvider());
                c2Var2.setPad(1);
                c2Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f28905g7, org.telegram.ui.ActionBar.j6.f28979k7);
                c2Var2.setEnabled(true);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, c2Var2, null);
                c2Var = c2Var2;
                break;
            case 11:
                i11 = ((org.telegram.ui.ActionBar.e2) mpVar).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.e2) mpVar).resourceProvider;
                c2Var = new org.telegram.ui.Components.gy0(i11, -mpVar.f49294s, this.f49018c, e6Var);
                break;
        }
        return new v4.e1(c2Var);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        int b10 = e1Var.b();
        mp mpVar = this.f49019e;
        if (b10 == mpVar.f49298v0) {
            mp.k0(mpVar, e1Var.f58535a);
        }
    }

    @Override
    public final void z(v4.e1 e1Var) {
        int b10 = e1Var.b();
        mp mpVar = this.f49019e;
        if (b10 == mpVar.f49300w0 && mpVar.getParentActivity() != null) {
            org.telegram.messenger.g0.v1(mpVar.getParentActivity().getCurrentFocus());
        }
    }
}
