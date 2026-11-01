package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class hq extends org.telegram.ui.Components.tk0 {
    public final Context f37849c;
    public boolean d;
    public final iq e;

    public hq(iq iqVar, Context context) {
        this.e = iqVar;
        if (iqVar.D == 2) {
            C(true);
        }
        this.f37849c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        TLRPC.Chat chat;
        int i10 = c1Var.f47912f;
        iq iqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = iqVar.P;
        int i11 = iqVar.D;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = iqVar.N;
        if (!iqVar.f38151x.creator || ((i11 != 0 && (i11 != 2 || !iqVar.K)) || i10 != 4 || c1Var.b() != iqVar.f38128e0)) {
            if (iqVar.I) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = c1Var.b();
                    if (b10 == iqVar.W) {
                        if (!tL_chatAdminRights.add_admins && ((chat = iqVar.f38151x) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i11 != 2 || iqVar.K) {
                        if (b10 == iqVar.X) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !iqVar.E) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == iqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == iqVar.Z) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == iqVar.f38120a0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == iqVar.f38123b0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == iqVar.f38126c0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == iqVar.K0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == iqVar.f38127d0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == iqVar.f38128e0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == iqVar.f38130f0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == iqVar.f38131g0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == iqVar.f38132h0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == iqVar.f38133i0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == iqVar.m0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == iqVar.U0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == iqVar.V0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == iqVar.W0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == iqVar.f38138n0) {
                                    return tL_chatAdminRights.manage_linked_peers;
                                }
                            }
                        }
                    } else {
                        return false;
                    }
                }
                if (i10 == 3 || i10 == 1 || i10 == 5 || i10 == 8 || i10 == 11) {
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
        return this.e.V;
    }

    @Override
    public final long c(int i10) {
        iq iqVar = this.e;
        if (iqVar.D == 2) {
            if (i10 == iqVar.W) {
                return 1L;
            }
            if (i10 == iqVar.X) {
                return 2L;
            }
            if (i10 == iqVar.Y) {
                return 3L;
            }
            if (i10 == iqVar.f38123b0) {
                return 4L;
            }
            if (i10 == iqVar.f38126c0) {
                return 5L;
            }
            if (i10 == iqVar.f38127d0) {
                return 6L;
            }
            if (i10 == iqVar.f38128e0) {
                return 7L;
            }
            if (i10 == iqVar.f38130f0) {
                return 8L;
            }
            if (i10 == iqVar.f38131g0) {
                return 9L;
            }
            if (i10 == iqVar.f38132h0) {
                return 10L;
            }
            if (i10 == iqVar.f38139o0) {
                return 11L;
            }
            if (i10 == iqVar.f38140p0) {
                return 12L;
            }
            if (i10 == iqVar.f38141q0) {
                return 13L;
            }
            if (i10 == iqVar.f38143r0) {
                return 14L;
            }
            if (i10 == iqVar.f38145s0) {
                return 15L;
            }
            if (i10 == iqVar.f38146t0) {
                return 16L;
            }
            if (i10 == iqVar.f38147u0) {
                return 17L;
            }
            if (i10 == iqVar.f38148v0) {
                return 18L;
            }
            if (i10 == iqVar.f38150w0) {
                return 19L;
            }
            if (i10 == iqVar.f38154y0) {
                return 20L;
            }
            if (i10 == iqVar.B0) {
                return 21L;
            }
            if (i10 == iqVar.H0) {
                return 22L;
            }
            if (i10 == iqVar.I0) {
                return 23L;
            }
            if (i10 == iqVar.J0) {
                return 24L;
            }
            if (i10 == iqVar.K0) {
                return 25L;
            }
            if (i10 == iqVar.L0) {
                return 26L;
            }
            if (i10 == iqVar.M0) {
                return 27L;
            }
            if (i10 == iqVar.f38152x0) {
                return 28L;
            }
            if (i10 == iqVar.m0) {
                return 29L;
            }
            if (i10 == iqVar.C0) {
                return 30L;
            }
            if (i10 == iqVar.E0) {
                return 31L;
            }
            if (i10 == iqVar.D0) {
                return 32L;
            }
            if (i10 == iqVar.F0) {
                return 33L;
            }
            if (i10 == iqVar.G0) {
                return 34L;
            }
            if (i10 == iqVar.f38155z0) {
                return 35L;
            }
            if (i10 == iqVar.N0) {
                return 36L;
            }
            if (i10 == iqVar.P0) {
                return 37L;
            }
            if (i10 == iqVar.Q0) {
                return 38L;
            }
            if (i10 == iqVar.R0) {
                return 39L;
            }
            if (i10 == iqVar.S0) {
                return 40L;
            }
            if (i10 == iqVar.U0) {
                return 41L;
            }
            if (i10 == iqVar.V0) {
                return 42L;
            }
            if (i10 == iqVar.W0) {
                return 43L;
            }
            if (i10 == iqVar.Z) {
                return 44L;
            }
            if (i10 == iqVar.f38133i0) {
                return 45L;
            }
            if (i10 == iqVar.f38134j0) {
                return 46L;
            }
            if (i10 == iqVar.f38135k0) {
                return 47L;
            }
            if (i10 == iqVar.f38136l0) {
                return 48L;
            }
            if (i10 == iqVar.f38138n0) {
                return 49L;
            }
            if (i10 == iqVar.f38120a0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int d(int i10) {
        iq iqVar = this.e;
        if (i10 != iqVar.H0 && i10 != iqVar.J0 && i10 != iqVar.I0 && i10 != iqVar.B0 && i10 != iqVar.C0 && i10 != iqVar.E0 && i10 != iqVar.D0 && i10 != iqVar.G0 && i10 != iqVar.F0 && i10 != iqVar.f38134j0 && i10 != iqVar.P0 && i10 != iqVar.Q0 && i10 != iqVar.R0 && i10 != iqVar.U0 && i10 != iqVar.V0 && i10 != iqVar.W0) {
            if (i10 != iqVar.f38155z0 && i10 != iqVar.N0 && i10 != iqVar.S0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != iqVar.f38139o0 && i10 != iqVar.f38141q0 && i10 != iqVar.L0 && i10 != iqVar.f38145s0) {
                    if (i10 != 2 && i10 != iqVar.f38147u0) {
                        if (i10 != iqVar.X && i10 != iqVar.Y && i10 != iqVar.Z && i10 != iqVar.f38123b0 && i10 != iqVar.f38126c0 && i10 != iqVar.f38127d0 && i10 != iqVar.f38130f0 && i10 != iqVar.f38131g0 && i10 != iqVar.f38132h0 && i10 != iqVar.f38133i0 && i10 != iqVar.f38154y0 && i10 != iqVar.f38128e0 && i10 != iqVar.K0 && i10 != iqVar.W && i10 != iqVar.m0 && i10 != iqVar.f38135k0 && i10 != iqVar.f38138n0 && i10 != iqVar.f38120a0) {
                            if (i10 == iqVar.f38143r0 || i10 == iqVar.f38150w0 || i10 == iqVar.f38136l0) {
                                return 1;
                            }
                            if (i10 == iqVar.M0) {
                                return 6;
                            }
                            if (i10 == iqVar.f38148v0) {
                                return 11;
                            }
                            if (i10 != iqVar.f38152x0) {
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
    public final void t(s4.c1 r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hq.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.c2 c2Var;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.p6 p6Var;
        Context context = this.f37849c;
        iq iqVar = this.e;
        switch (i10) {
            case 0:
                View oaVar = new org.telegram.ui.Cells.oa(context, null);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, oaVar, null);
                c2Var = oaVar;
                break;
            case 1:
                c2Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 2:
            default:
                View x9Var = new org.telegram.ui.Cells.x9(context);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, x9Var, null);
                c2Var = x9Var;
                break;
            case 3:
                View p4Var = new org.telegram.ui.Cells.p4(this.f37849c, org.telegram.ui.ActionBar.t6.L6, 21, 15, true, null);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p4Var, null);
                c2Var = p4Var;
                break;
            case 4:
            case 9:
                View s8Var = new org.telegram.ui.Cells.s8(context);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, s8Var, null);
                c2Var = s8Var;
                break;
            case 5:
                c2Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 6:
                View z8Var = new org.telegram.ui.Cells.z8(context, null, false);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, z8Var, null);
                c2Var = z8Var;
                break;
            case 7:
                org.telegram.ui.Cells.e6 e6Var = new org.telegram.ui.Cells.e6(context, 0, null, null);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, e6Var, null);
                e6Var.b(new n0(this, 5));
                c2Var = e6Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                iqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.t6.f20873a7;
                org.telegram.ui.ActionBar.a7.i(i13, frameLayout, null);
                iqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, true, false, false);
                iqVar.f38129f = f6Var;
                f6Var.setTypeface(org.telegram.messenger.i0.o());
                iqVar.f38129f.setTextColor(-1);
                iqVar.f38129f.setTextSize(org.telegram.messenger.i0.L(14.0f));
                iqVar.f38129f.setGravity(17);
                org.telegram.ui.Components.f6 f6Var2 = iqVar.f38129f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.a30.q(null, 2131754459, sb2, " ");
                if (iqVar.K) {
                    i11 = 2131754458;
                } else {
                    i11 = 2131754457;
                }
                sb2.append(org.telegram.messenger.dd.L0(i11, null));
                f6Var2.setText(sb2.toString());
                iqVar.e.addView(iqVar.f38129f, w7.b6.e(-2, -2, 17));
                iqVar.e.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 4.0f));
                iqVar.e.setOnClickListener(new a(this, 14));
                iqVar.d.addView(iqVar.e, w7.b6.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                iqVar.d.setLayoutParams(new s4.o0(-1, -2));
                View view = new View(context);
                org.telegram.ui.ActionBar.a7.i(i13, view, null);
                iqVar.d.setClipChildren(false);
                iqVar.d.setClipToPadding(false);
                iqVar.d.addView(view, w7.b6.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                c2Var = iqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(4, 21, this.f37849c, iqVar.getResourceProvider(), false);
                c2Var2.setPad(1);
                c2Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.t6.V6, org.telegram.ui.ActionBar.t6.f20987g7, org.telegram.ui.ActionBar.t6.f21060k7);
                c2Var2.setEnabled(true);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, c2Var2, null);
                c2Var = c2Var2;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.k2) iqVar).currentAccount;
                p6Var = ((org.telegram.ui.ActionBar.k2) iqVar).resourceProvider;
                c2Var = new org.telegram.ui.Components.jz0(i12, -iqVar.f38144s, this.f37849c, p6Var);
                break;
        }
        return new s4.c1(c2Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int b10 = c1Var.b();
        iq iqVar = this.e;
        if (b10 == iqVar.f38147u0) {
            iq.k0(iqVar, c1Var.f47909a);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int b10 = c1Var.b();
        iq iqVar = this.e;
        if (b10 == iqVar.f38148v0 && iqVar.getParentActivity() != null) {
            org.telegram.messenger.i0.v1(iqVar.getParentActivity().getCurrentFocus());
        }
    }
}
