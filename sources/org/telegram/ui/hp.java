package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class hp extends org.telegram.ui.Components.sj0 {
    public final Context f45960c;
    public boolean d;
    public final ip f45961e;

    public hp(ip ipVar, Context context) {
        this.f45961e = ipVar;
        if (ipVar.E == 2) {
            C(true);
        }
        this.f45960c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        TLRPC.Chat chat;
        int i3 = d1Var.f55544f;
        ip ipVar = this.f45961e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = ipVar.Q;
        int i10 = ipVar.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = ipVar.O;
        if (!ipVar.f46357x.creator || ((i10 != 0 && (i10 != 2 || !ipVar.L)) || i3 != 4 || d1Var.b() != ipVar.f46336f0)) {
            if (ipVar.J) {
                if ((i10 == 0 || i10 == 2) && i3 == 4) {
                    int b10 = d1Var.b();
                    if (b10 == ipVar.X) {
                        if (!tL_chatAdminRights.add_admins && ((chat = ipVar.f46357x) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i10 != 2 || ipVar.L) {
                        if (b10 == ipVar.Y) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !ipVar.F) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == ipVar.Z) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == ipVar.f46324a0) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == ipVar.f46327b0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == ipVar.f46330c0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == ipVar.f46332d0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == ipVar.L0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == ipVar.f46334e0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == ipVar.f46336f0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == ipVar.f46337g0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == ipVar.f46338h0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == ipVar.f46339i0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == ipVar.f46340j0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == ipVar.f46344n0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == ipVar.V0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == ipVar.W0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == ipVar.X0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == ipVar.f46345o0) {
                                    return tL_chatAdminRights.manage_linked_peers;
                                }
                            }
                        }
                    } else {
                        return false;
                    }
                }
                if (i3 == 3 || i3 == 1 || i3 == 5 || i3 == 8 || i3 == 11) {
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
        return this.f45961e.W;
    }

    @Override
    public final long c(int i3) {
        ip ipVar = this.f45961e;
        if (ipVar.E == 2) {
            if (i3 == ipVar.X) {
                return 1L;
            }
            if (i3 == ipVar.Y) {
                return 2L;
            }
            if (i3 == ipVar.Z) {
                return 3L;
            }
            if (i3 == ipVar.f46330c0) {
                return 4L;
            }
            if (i3 == ipVar.f46332d0) {
                return 5L;
            }
            if (i3 == ipVar.f46334e0) {
                return 6L;
            }
            if (i3 == ipVar.f46336f0) {
                return 7L;
            }
            if (i3 == ipVar.f46337g0) {
                return 8L;
            }
            if (i3 == ipVar.f46338h0) {
                return 9L;
            }
            if (i3 == ipVar.f46339i0) {
                return 10L;
            }
            if (i3 == ipVar.f46346p0) {
                return 11L;
            }
            if (i3 == ipVar.f46347q0) {
                return 12L;
            }
            if (i3 == ipVar.f46349r0) {
                return 13L;
            }
            if (i3 == ipVar.f46351s0) {
                return 14L;
            }
            if (i3 == ipVar.f46352t0) {
                return 15L;
            }
            if (i3 == ipVar.f46353u0) {
                return 16L;
            }
            if (i3 == ipVar.f46354v0) {
                return 17L;
            }
            if (i3 == ipVar.f46356w0) {
                return 18L;
            }
            if (i3 == ipVar.f46358x0) {
                return 19L;
            }
            if (i3 == ipVar.f46361z0) {
                return 20L;
            }
            if (i3 == ipVar.C0) {
                return 21L;
            }
            if (i3 == ipVar.I0) {
                return 22L;
            }
            if (i3 == ipVar.J0) {
                return 23L;
            }
            if (i3 == ipVar.K0) {
                return 24L;
            }
            if (i3 == ipVar.L0) {
                return 25L;
            }
            if (i3 == ipVar.M0) {
                return 26L;
            }
            if (i3 == ipVar.N0) {
                return 27L;
            }
            if (i3 == ipVar.f46360y0) {
                return 28L;
            }
            if (i3 == ipVar.f46344n0) {
                return 29L;
            }
            if (i3 == ipVar.D0) {
                return 30L;
            }
            if (i3 == ipVar.F0) {
                return 31L;
            }
            if (i3 == ipVar.E0) {
                return 32L;
            }
            if (i3 == ipVar.G0) {
                return 33L;
            }
            if (i3 == ipVar.H0) {
                return 34L;
            }
            if (i3 == ipVar.A0) {
                return 35L;
            }
            if (i3 == ipVar.O0) {
                return 36L;
            }
            if (i3 == ipVar.Q0) {
                return 37L;
            }
            if (i3 == ipVar.R0) {
                return 38L;
            }
            if (i3 == ipVar.S0) {
                return 39L;
            }
            if (i3 == ipVar.T0) {
                return 40L;
            }
            if (i3 == ipVar.V0) {
                return 41L;
            }
            if (i3 == ipVar.W0) {
                return 42L;
            }
            if (i3 == ipVar.X0) {
                return 43L;
            }
            if (i3 == ipVar.f46324a0) {
                return 44L;
            }
            if (i3 == ipVar.f46340j0) {
                return 45L;
            }
            if (i3 == ipVar.f46341k0) {
                return 46L;
            }
            if (i3 == ipVar.f46342l0) {
                return 47L;
            }
            if (i3 == ipVar.m0) {
                return 48L;
            }
            if (i3 == ipVar.f46345o0) {
                return 49L;
            }
            if (i3 == ipVar.f46327b0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int d(int i3) {
        ip ipVar = this.f45961e;
        if (i3 != ipVar.I0 && i3 != ipVar.K0 && i3 != ipVar.J0 && i3 != ipVar.C0 && i3 != ipVar.D0 && i3 != ipVar.F0 && i3 != ipVar.E0 && i3 != ipVar.H0 && i3 != ipVar.G0 && i3 != ipVar.f46341k0 && i3 != ipVar.Q0 && i3 != ipVar.R0 && i3 != ipVar.S0 && i3 != ipVar.V0 && i3 != ipVar.W0 && i3 != ipVar.X0) {
            if (i3 != ipVar.A0 && i3 != ipVar.O0 && i3 != ipVar.T0) {
                if (i3 == 0) {
                    return 0;
                }
                if (i3 != 1 && i3 != ipVar.f46346p0 && i3 != ipVar.f46349r0 && i3 != ipVar.M0 && i3 != ipVar.f46352t0) {
                    if (i3 != 2 && i3 != ipVar.f46354v0) {
                        if (i3 != ipVar.Y && i3 != ipVar.Z && i3 != ipVar.f46324a0 && i3 != ipVar.f46330c0 && i3 != ipVar.f46332d0 && i3 != ipVar.f46334e0 && i3 != ipVar.f46337g0 && i3 != ipVar.f46338h0 && i3 != ipVar.f46339i0 && i3 != ipVar.f46340j0 && i3 != ipVar.f46361z0 && i3 != ipVar.f46336f0 && i3 != ipVar.L0 && i3 != ipVar.X && i3 != ipVar.f46344n0 && i3 != ipVar.f46342l0 && i3 != ipVar.f46345o0 && i3 != ipVar.f46327b0) {
                            if (i3 == ipVar.f46351s0 || i3 == ipVar.f46358x0 || i3 == ipVar.m0) {
                                return 1;
                            }
                            if (i3 == ipVar.N0) {
                                return 6;
                            }
                            if (i3 == ipVar.f46356w0) {
                                return 11;
                            }
                            if (i3 != ipVar.f46360y0) {
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
    public final void t(u4.d1 r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hp.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.c2 c2Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = this.f45960c;
        ip ipVar = this.f45961e;
        switch (i3) {
            case 0:
                View oaVar = new org.telegram.ui.Cells.oa(context, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, oaVar, null);
                c2Var = oaVar;
                break;
            case 1:
                c2Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 2:
            default:
                View v9Var = new org.telegram.ui.Cells.v9(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, v9Var, null);
                c2Var = v9Var;
                break;
            case 3:
                View n4Var = new org.telegram.ui.Cells.n4(this.f45960c, org.telegram.ui.ActionBar.k6.L6, 21, 15, true, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, n4Var, null);
                c2Var = n4Var;
                break;
            case 4:
            case 9:
                View p8Var = new org.telegram.ui.Cells.p8(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, p8Var, null);
                c2Var = p8Var;
                break;
            case 5:
                c2Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 6:
                View w8Var = new org.telegram.ui.Cells.w8(context, null, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, w8Var, null);
                c2Var = w8Var;
                break;
            case 7:
                org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context, 0, null, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, z5Var, null);
                z5Var.b(new n0(this, 5));
                c2Var = z5Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                ipVar.d = frameLayout;
                int i12 = org.telegram.ui.ActionBar.k6.f27824a7;
                org.telegram.ui.ActionBar.r6.i(i12, frameLayout, null);
                ipVar.f46333e = new FrameLayout(context);
                org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, false, false);
                ipVar.f46335f = h6Var;
                h6Var.setTypeface(org.telegram.messenger.g0.o());
                ipVar.f46335f.setTextColor(-1);
                ipVar.f46335f.setTextSize(org.telegram.messenger.g0.L(14.0f));
                ipVar.f46335f.setGravity(17);
                org.telegram.ui.Components.h6 h6Var2 = ipVar.f46335f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131754459, sb2, " ");
                if (ipVar.L) {
                    i10 = 2131754458;
                } else {
                    i10 = 2131754457;
                }
                sb2.append(org.telegram.messenger.bd.M0(i10, null));
                h6Var2.setText(sb2.toString());
                ipVar.f46333e.addView(ipVar.f46335f, b8.mf.e(-2, -2, 17));
                ipVar.f46333e.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
                ipVar.f46333e.setOnClickListener(new a(this, 14));
                ipVar.d.addView(ipVar.f46333e, b8.mf.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                ipVar.d.setLayoutParams(new u4.p0(-1, -2));
                View view = new View(context);
                org.telegram.ui.ActionBar.r6.i(i12, view, null);
                ipVar.d.setClipChildren(false);
                ipVar.d.setClipToPadding(false);
                ipVar.d.addView(view, b8.mf.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                c2Var = ipVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(this.f45960c, 4, 21, false, ipVar.getResourceProvider());
                c2Var2.setPad(1);
                c2Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.f28008k7);
                c2Var2.setEnabled(true);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, c2Var2, null);
                c2Var = c2Var2;
                break;
            case 11:
                i11 = ((org.telegram.ui.ActionBar.d2) ipVar).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.d2) ipVar).resourceProvider;
                c2Var = new org.telegram.ui.Components.dy0(i11, -ipVar.f46350s, this.f45960c, e6Var);
                break;
        }
        return new u4.d1(c2Var);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        int b10 = d1Var.b();
        ip ipVar = this.f45961e;
        if (b10 == ipVar.f46354v0) {
            ip.k0(ipVar, d1Var.f55540a);
        }
    }

    @Override
    public final void z(u4.d1 d1Var) {
        int b10 = d1Var.b();
        ip ipVar = this.f45961e;
        if (b10 == ipVar.f46356w0 && ipVar.getParentActivity() != null) {
            org.telegram.messenger.g0.v1(ipVar.getParentActivity().getCurrentFocus());
        }
    }
}
