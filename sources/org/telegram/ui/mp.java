package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class mp extends org.telegram.ui.Components.bk0 {
    public final Context f49936c;
    public boolean d;
    public final np f49937e;

    public mp(np npVar, Context context) {
        this.f49937e = npVar;
        if (npVar.E == 2) {
            C(true);
        }
        this.f49936c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        TLRPC.Chat chat;
        int i7 = f1Var.f59126f;
        np npVar = this.f49937e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = npVar.Q;
        int i10 = npVar.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = npVar.O;
        if (!npVar.f50273x.creator || ((i10 != 0 && (i10 != 2 || !npVar.L)) || i7 != 4 || f1Var.b() != npVar.f50252f0)) {
            if (npVar.J) {
                if ((i10 == 0 || i10 == 2) && i7 == 4) {
                    int b10 = f1Var.b();
                    if (b10 == npVar.X) {
                        if (!tL_chatAdminRights.add_admins && ((chat = npVar.f50273x) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i10 != 2 || npVar.L) {
                        if (b10 == npVar.Y) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !npVar.F) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == npVar.Z) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == npVar.f50240a0) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == npVar.f50243b0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == npVar.f50246c0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == npVar.f50248d0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == npVar.L0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == npVar.f50250e0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == npVar.f50252f0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == npVar.f50253g0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == npVar.f50254h0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == npVar.f50255i0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == npVar.f50256j0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == npVar.f50260n0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == npVar.V0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == npVar.W0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == npVar.X0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == npVar.f50261o0) {
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
        return this.f49937e.W;
    }

    @Override
    public final long c(int i7) {
        np npVar = this.f49937e;
        if (npVar.E == 2) {
            if (i7 == npVar.X) {
                return 1L;
            }
            if (i7 == npVar.Y) {
                return 2L;
            }
            if (i7 == npVar.Z) {
                return 3L;
            }
            if (i7 == npVar.f50246c0) {
                return 4L;
            }
            if (i7 == npVar.f50248d0) {
                return 5L;
            }
            if (i7 == npVar.f50250e0) {
                return 6L;
            }
            if (i7 == npVar.f50252f0) {
                return 7L;
            }
            if (i7 == npVar.f50253g0) {
                return 8L;
            }
            if (i7 == npVar.f50254h0) {
                return 9L;
            }
            if (i7 == npVar.f50255i0) {
                return 10L;
            }
            if (i7 == npVar.f50262p0) {
                return 11L;
            }
            if (i7 == npVar.f50263q0) {
                return 12L;
            }
            if (i7 == npVar.f50265r0) {
                return 13L;
            }
            if (i7 == npVar.f50267s0) {
                return 14L;
            }
            if (i7 == npVar.f50268t0) {
                return 15L;
            }
            if (i7 == npVar.f50269u0) {
                return 16L;
            }
            if (i7 == npVar.f50270v0) {
                return 17L;
            }
            if (i7 == npVar.f50272w0) {
                return 18L;
            }
            if (i7 == npVar.f50274x0) {
                return 19L;
            }
            if (i7 == npVar.f50277z0) {
                return 20L;
            }
            if (i7 == npVar.C0) {
                return 21L;
            }
            if (i7 == npVar.I0) {
                return 22L;
            }
            if (i7 == npVar.J0) {
                return 23L;
            }
            if (i7 == npVar.K0) {
                return 24L;
            }
            if (i7 == npVar.L0) {
                return 25L;
            }
            if (i7 == npVar.M0) {
                return 26L;
            }
            if (i7 == npVar.N0) {
                return 27L;
            }
            if (i7 == npVar.f50276y0) {
                return 28L;
            }
            if (i7 == npVar.f50260n0) {
                return 29L;
            }
            if (i7 == npVar.D0) {
                return 30L;
            }
            if (i7 == npVar.F0) {
                return 31L;
            }
            if (i7 == npVar.E0) {
                return 32L;
            }
            if (i7 == npVar.G0) {
                return 33L;
            }
            if (i7 == npVar.H0) {
                return 34L;
            }
            if (i7 == npVar.A0) {
                return 35L;
            }
            if (i7 == npVar.O0) {
                return 36L;
            }
            if (i7 == npVar.Q0) {
                return 37L;
            }
            if (i7 == npVar.R0) {
                return 38L;
            }
            if (i7 == npVar.S0) {
                return 39L;
            }
            if (i7 == npVar.T0) {
                return 40L;
            }
            if (i7 == npVar.V0) {
                return 41L;
            }
            if (i7 == npVar.W0) {
                return 42L;
            }
            if (i7 == npVar.X0) {
                return 43L;
            }
            if (i7 == npVar.f50240a0) {
                return 44L;
            }
            if (i7 == npVar.f50256j0) {
                return 45L;
            }
            if (i7 == npVar.f50257k0) {
                return 46L;
            }
            if (i7 == npVar.f50258l0) {
                return 47L;
            }
            if (i7 == npVar.m0) {
                return 48L;
            }
            if (i7 == npVar.f50261o0) {
                return 49L;
            }
            if (i7 == npVar.f50243b0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int d(int i7) {
        np npVar = this.f49937e;
        if (i7 != npVar.I0 && i7 != npVar.K0 && i7 != npVar.J0 && i7 != npVar.C0 && i7 != npVar.D0 && i7 != npVar.F0 && i7 != npVar.E0 && i7 != npVar.H0 && i7 != npVar.G0 && i7 != npVar.f50257k0 && i7 != npVar.Q0 && i7 != npVar.R0 && i7 != npVar.S0 && i7 != npVar.V0 && i7 != npVar.W0 && i7 != npVar.X0) {
            if (i7 != npVar.A0 && i7 != npVar.O0 && i7 != npVar.T0) {
                if (i7 == 0) {
                    return 0;
                }
                if (i7 != 1 && i7 != npVar.f50262p0 && i7 != npVar.f50265r0 && i7 != npVar.M0 && i7 != npVar.f50268t0) {
                    if (i7 != 2 && i7 != npVar.f50270v0) {
                        if (i7 != npVar.Y && i7 != npVar.Z && i7 != npVar.f50240a0 && i7 != npVar.f50246c0 && i7 != npVar.f50248d0 && i7 != npVar.f50250e0 && i7 != npVar.f50253g0 && i7 != npVar.f50254h0 && i7 != npVar.f50255i0 && i7 != npVar.f50256j0 && i7 != npVar.f50277z0 && i7 != npVar.f50252f0 && i7 != npVar.L0 && i7 != npVar.X && i7 != npVar.f50260n0 && i7 != npVar.f50258l0 && i7 != npVar.f50261o0 && i7 != npVar.f50243b0) {
                            if (i7 == npVar.f50267s0 || i7 == npVar.f50274x0 || i7 == npVar.m0) {
                                return 1;
                            }
                            if (i7 == npVar.N0) {
                                return 6;
                            }
                            if (i7 == npVar.f50272w0) {
                                return 11;
                            }
                            if (i7 != npVar.f50276y0) {
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
    public final void t(v4.f1 r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mp.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.c2 c2Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.i6 i6Var;
        Context context = this.f49936c;
        np npVar = this.f49937e;
        switch (i7) {
            case 0:
                View paVar = new org.telegram.ui.Cells.pa(context, null);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, paVar, null);
                c2Var = paVar;
                break;
            case 1:
                c2Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 2:
            default:
                View w9Var = new org.telegram.ui.Cells.w9(context);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, w9Var, null);
                c2Var = w9Var;
                break;
            case 3:
                View n4Var = new org.telegram.ui.Cells.n4(this.f49936c, org.telegram.ui.ActionBar.n6.L6, 21, 15, true, null);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, n4Var, null);
                c2Var = n4Var;
                break;
            case 4:
            case 9:
                View q8Var = new org.telegram.ui.Cells.q8(context);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, q8Var, null);
                c2Var = q8Var;
                break;
            case 5:
                c2Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 6:
                View x8Var = new org.telegram.ui.Cells.x8(context, null, false);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, x8Var, null);
                c2Var = x8Var;
                break;
            case 7:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, 0, null, null);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, a6Var, null);
                a6Var.c(new m0(this, 5));
                c2Var = a6Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                npVar.d = frameLayout;
                int i12 = org.telegram.ui.ActionBar.n6.f29339a7;
                org.telegram.ui.ActionBar.u6.h(i12, frameLayout, null);
                npVar.f50249e = new FrameLayout(context);
                org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, false, false);
                npVar.f50251f = n6Var;
                n6Var.setTypeface(org.telegram.messenger.g0.o());
                npVar.f50251f.setTextColor(-1);
                npVar.f50251f.setTextSize(org.telegram.messenger.g0.L(14.0f));
                npVar.f50251f.setGravity(17);
                org.telegram.ui.Components.n6 n6Var2 = npVar.f50251f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c0.u(null, 2131754457, sb2, " ");
                if (npVar.L) {
                    i10 = 2131754456;
                } else {
                    i10 = 2131754455;
                }
                sb2.append(org.telegram.messenger.gd.M0(i10, null));
                n6Var2.setText(sb2.toString());
                npVar.f50249e.addView(npVar.f50251f, c8.ma.e(-2, -2, 17));
                npVar.f50249e.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 4.0f));
                npVar.f50249e.setOnClickListener(new a(this, 14));
                npVar.d.addView(npVar.f50249e, c8.ma.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                npVar.d.setLayoutParams(new v4.q0(-1, -2));
                View view = new View(context);
                org.telegram.ui.ActionBar.u6.h(i12, view, null);
                npVar.d.setClipChildren(false);
                npVar.d.setClipToPadding(false);
                npVar.d.addView(view, c8.ma.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                c2Var = npVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(this.f49936c, 4, 21, false, npVar.getResourceProvider());
                c2Var2.setPad(1);
                c2Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                c2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.n6.V6, org.telegram.ui.ActionBar.n6.f29452g7, org.telegram.ui.ActionBar.n6.f29526k7);
                c2Var2.setEnabled(true);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, c2Var2, null);
                c2Var = c2Var2;
                break;
            case 11:
                i11 = ((org.telegram.ui.ActionBar.h2) npVar).currentAccount;
                i6Var = ((org.telegram.ui.ActionBar.h2) npVar).resourceProvider;
                c2Var = new org.telegram.ui.Components.ny0(i11, -npVar.f50266s, this.f49936c, i6Var);
                break;
        }
        return new v4.f1(c2Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        int b10 = f1Var.b();
        np npVar = this.f49937e;
        if (b10 == npVar.f50270v0) {
            np.k0(npVar, f1Var.f59122a);
        }
    }

    @Override
    public final void z(v4.f1 f1Var) {
        int b10 = f1Var.b();
        np npVar = this.f49937e;
        if (b10 == npVar.f50272w0 && npVar.getParentActivity() != null) {
            org.telegram.messenger.g0.v1(npVar.getParentActivity().getCurrentFocus());
        }
    }
}
