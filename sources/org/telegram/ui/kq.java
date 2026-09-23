package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class kq extends org.telegram.ui.Components.ll0 {
    public final Context f34782c;
    public boolean d;
    public final lq e;

    public kq(lq lqVar, Context context) {
        this.e = lqVar;
        if (lqVar.f35075y == 2) {
            C(true);
        }
        this.f34782c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        TLRPC.Chat chat;
        int i10 = c1Var.f42630f;
        lq lqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = lqVar.P;
        int i11 = lqVar.f35075y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = lqVar.N;
        if (!lqVar.f35071w.creator || ((i11 != 0 && (i11 != 2 || !lqVar.K)) || i10 != 4 || c1Var.b() != lqVar.f35050e0)) {
            if (lqVar.I) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = c1Var.b();
                    if (b10 == lqVar.W) {
                        if (!tL_chatAdminRights.add_admins && ((chat = lqVar.f35071w) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i11 != 2 || lqVar.K) {
                        if (b10 == lqVar.X) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !lqVar.E) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == lqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == lqVar.Z) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == lqVar.f35041a0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == lqVar.f35044b0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == lqVar.f35047c0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == lqVar.K0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == lqVar.f35049d0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == lqVar.f35050e0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == lqVar.f35052f0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == lqVar.f35053g0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == lqVar.f35054h0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == lqVar.f35055i0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == lqVar.m0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == lqVar.U0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == lqVar.V0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == lqVar.W0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == lqVar.f35060n0) {
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
    public final int h() {
        return this.e.V;
    }

    @Override
    public final long i(int i10) {
        lq lqVar = this.e;
        if (lqVar.f35075y == 2) {
            if (i10 == lqVar.W) {
                return 1L;
            }
            if (i10 == lqVar.X) {
                return 2L;
            }
            if (i10 == lqVar.Y) {
                return 3L;
            }
            if (i10 == lqVar.f35044b0) {
                return 4L;
            }
            if (i10 == lqVar.f35047c0) {
                return 5L;
            }
            if (i10 == lqVar.f35049d0) {
                return 6L;
            }
            if (i10 == lqVar.f35050e0) {
                return 7L;
            }
            if (i10 == lqVar.f35052f0) {
                return 8L;
            }
            if (i10 == lqVar.f35053g0) {
                return 9L;
            }
            if (i10 == lqVar.f35054h0) {
                return 10L;
            }
            if (i10 == lqVar.f35061o0) {
                return 11L;
            }
            if (i10 == lqVar.f35062p0) {
                return 12L;
            }
            if (i10 == lqVar.f35063q0) {
                return 13L;
            }
            if (i10 == lqVar.f35065r0) {
                return 14L;
            }
            if (i10 == lqVar.f35067s0) {
                return 15L;
            }
            if (i10 == lqVar.f35068t0) {
                return 16L;
            }
            if (i10 == lqVar.f35069u0) {
                return 17L;
            }
            if (i10 == lqVar.f35070v0) {
                return 18L;
            }
            if (i10 == lqVar.f35072w0) {
                return 19L;
            }
            if (i10 == lqVar.f35076y0) {
                return 20L;
            }
            if (i10 == lqVar.B0) {
                return 21L;
            }
            if (i10 == lqVar.H0) {
                return 22L;
            }
            if (i10 == lqVar.I0) {
                return 23L;
            }
            if (i10 == lqVar.J0) {
                return 24L;
            }
            if (i10 == lqVar.K0) {
                return 25L;
            }
            if (i10 == lqVar.L0) {
                return 26L;
            }
            if (i10 == lqVar.M0) {
                return 27L;
            }
            if (i10 == lqVar.f35074x0) {
                return 28L;
            }
            if (i10 == lqVar.m0) {
                return 29L;
            }
            if (i10 == lqVar.C0) {
                return 30L;
            }
            if (i10 == lqVar.E0) {
                return 31L;
            }
            if (i10 == lqVar.D0) {
                return 32L;
            }
            if (i10 == lqVar.F0) {
                return 33L;
            }
            if (i10 == lqVar.G0) {
                return 34L;
            }
            if (i10 == lqVar.f35077z0) {
                return 35L;
            }
            if (i10 == lqVar.N0) {
                return 36L;
            }
            if (i10 == lqVar.P0) {
                return 37L;
            }
            if (i10 == lqVar.Q0) {
                return 38L;
            }
            if (i10 == lqVar.R0) {
                return 39L;
            }
            if (i10 == lqVar.S0) {
                return 40L;
            }
            if (i10 == lqVar.U0) {
                return 41L;
            }
            if (i10 == lqVar.V0) {
                return 42L;
            }
            if (i10 == lqVar.W0) {
                return 43L;
            }
            if (i10 == lqVar.Z) {
                return 44L;
            }
            if (i10 == lqVar.f35055i0) {
                return 45L;
            }
            if (i10 == lqVar.f35056j0) {
                return 46L;
            }
            if (i10 == lqVar.f35057k0) {
                return 47L;
            }
            if (i10 == lqVar.f35058l0) {
                return 48L;
            }
            if (i10 == lqVar.f35060n0) {
                return 49L;
            }
            if (i10 == lqVar.f35041a0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        lq lqVar = this.e;
        if (i10 != lqVar.H0 && i10 != lqVar.J0 && i10 != lqVar.I0 && i10 != lqVar.B0 && i10 != lqVar.C0 && i10 != lqVar.E0 && i10 != lqVar.D0 && i10 != lqVar.G0 && i10 != lqVar.F0 && i10 != lqVar.f35056j0 && i10 != lqVar.P0 && i10 != lqVar.Q0 && i10 != lqVar.R0 && i10 != lqVar.U0 && i10 != lqVar.V0 && i10 != lqVar.W0) {
            if (i10 != lqVar.f35077z0 && i10 != lqVar.N0 && i10 != lqVar.S0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != lqVar.f35061o0 && i10 != lqVar.f35063q0 && i10 != lqVar.L0 && i10 != lqVar.f35067s0) {
                    if (i10 != 2 && i10 != lqVar.f35069u0) {
                        if (i10 != lqVar.X && i10 != lqVar.Y && i10 != lqVar.Z && i10 != lqVar.f35044b0 && i10 != lqVar.f35047c0 && i10 != lqVar.f35049d0 && i10 != lqVar.f35052f0 && i10 != lqVar.f35053g0 && i10 != lqVar.f35054h0 && i10 != lqVar.f35055i0 && i10 != lqVar.f35076y0 && i10 != lqVar.f35050e0 && i10 != lqVar.K0 && i10 != lqVar.W && i10 != lqVar.m0 && i10 != lqVar.f35057k0 && i10 != lqVar.f35060n0 && i10 != lqVar.f35041a0) {
                            if (i10 == lqVar.f35065r0 || i10 == lqVar.f35072w0 || i10 == lqVar.f35058l0) {
                                return 1;
                            }
                            if (i10 == lqVar.M0) {
                                return 6;
                            }
                            if (i10 == lqVar.f35070v0) {
                                return 11;
                            }
                            if (i10 != lqVar.f35074x0) {
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
    public final void v(s4.c1 r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kq.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.Cells.z1 z1Var;
        org.telegram.ui.Cells.d6 d6Var;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var2;
        Context context = this.f34782c;
        lq lqVar = this.e;
        switch (i10) {
            case 0:
                View abVar = new org.telegram.ui.Cells.ab(context, null);
                abVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                d6Var = abVar;
                break;
            case 1:
                d6Var = new org.telegram.ui.Cells.f9(context);
                break;
            case 2:
            default:
                View faVar = new org.telegram.ui.Cells.fa(context);
                faVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                d6Var = faVar;
                break;
            case 3:
                View m4Var = new org.telegram.ui.Cells.m4(this.f34782c, org.telegram.ui.ActionBar.h6.L6, 21, 15, true, null);
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                z1Var = m4Var;
                d6Var = z1Var;
                break;
            case 4:
            case 9:
                View w8Var = new org.telegram.ui.Cells.w8(context);
                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                d6Var = w8Var;
                break;
            case 5:
                d6Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                break;
            case 6:
                View d9Var = new org.telegram.ui.Cells.d9(context, null, false);
                d9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                d6Var = d9Var;
                break;
            case 7:
                org.telegram.ui.Cells.d6 d6Var3 = new org.telegram.ui.Cells.d6(context, 0, null, null);
                d6Var3.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                d6Var3.c(new m0(this, 4));
                d6Var = d6Var3;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                lqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.h6.f18733a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
                lqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, false, false);
                lqVar.f35051f = p6Var;
                p6Var.setTypeface(AndroidUtilities.bold());
                lqVar.f35051f.setTextColor(-1);
                lqVar.f35051f.setTextSize(AndroidUtilities.dp(14.0f));
                lqVar.f35051f.setGravity(17);
                org.telegram.ui.Components.p6 p6Var2 = lqVar.f35051f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.ul.m(R.string.AddBotButton, " ", sb2);
                if (lqVar.K) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb2.append(LocaleController.getString(i11));
                p6Var2.setText(sb2.toString());
                lqVar.e.addView(lqVar.f35051f, w7.x5.e(-2, -2, 17));
                lqVar.e.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                lqVar.e.setOnClickListener(new a(this, 15));
                lqVar.d.addView(lqVar.e, w7.x5.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                lqVar.d.setLayoutParams(new s4.p0(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
                lqVar.d.setClipChildren(false);
                lqVar.d.setClipToPadding(false);
                lqVar.d.addView(view, w7.x5.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                d6Var = lqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, this.f34782c, lqVar.getResourceProvider(), false);
                z1Var2.setPad(1);
                z1Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.f18844g7, org.telegram.ui.ActionBar.h6.f18917k7);
                z1Var2.setEnabled(true);
                z1Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                z1Var = z1Var2;
                d6Var = z1Var;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.n2) lqVar).currentAccount;
                d6Var2 = ((org.telegram.ui.ActionBar.n2) lqVar).resourceProvider;
                d6Var = new org.telegram.ui.Components.a01(i12, -lqVar.f35066s, this.f34782c, d6Var2);
                break;
        }
        return new s4.c1(d6Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int b10 = c1Var.b();
        lq lqVar = this.e;
        if (b10 == lqVar.f35069u0) {
            lq.f0(lqVar, c1Var.f42627a);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int b10 = c1Var.b();
        lq lqVar = this.e;
        if (b10 == lqVar.f35070v0 && lqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(lqVar.getParentActivity().getCurrentFocus());
        }
    }
}
