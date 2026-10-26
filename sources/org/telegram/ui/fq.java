package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class fq extends org.telegram.ui.Components.lm0 {
    public final Context f39436c;
    public boolean d;
    public final gq e;

    public fq(gq gqVar, Context context) {
        this.e = gqVar;
        if (gqVar.f39769y == 2) {
            C(true);
        }
        this.f39436c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        TLRPC.Chat chat;
        int i10 = e1Var.f47741f;
        gq gqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = gqVar.P;
        int i11 = gqVar.f39769y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = gqVar.N;
        if (!gqVar.f39765w.creator || ((i11 != 0 && (i11 != 2 || !gqVar.K)) || i10 != 4 || e1Var.b() != gqVar.f39744e0)) {
            if (gqVar.I) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = e1Var.b();
                    if (b10 == gqVar.W) {
                        if (!tL_chatAdminRights.add_admins && ((chat = gqVar.f39765w) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i11 != 2 || gqVar.K) {
                        if (b10 == gqVar.X) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !gqVar.E) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == gqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == gqVar.Z) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == gqVar.f39736a0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == gqVar.f39739b0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == gqVar.f39742c0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == gqVar.K0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == gqVar.f39743d0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == gqVar.f39744e0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == gqVar.f39746f0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == gqVar.f39747g0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == gqVar.f39748h0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == gqVar.f39749i0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == gqVar.m0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == gqVar.U0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == gqVar.V0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == gqVar.W0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == gqVar.f39754n0) {
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
        gq gqVar = this.e;
        if (gqVar.f39769y == 2) {
            if (i10 == gqVar.W) {
                return 1L;
            }
            if (i10 == gqVar.X) {
                return 2L;
            }
            if (i10 == gqVar.Y) {
                return 3L;
            }
            if (i10 == gqVar.f39739b0) {
                return 4L;
            }
            if (i10 == gqVar.f39742c0) {
                return 5L;
            }
            if (i10 == gqVar.f39743d0) {
                return 6L;
            }
            if (i10 == gqVar.f39744e0) {
                return 7L;
            }
            if (i10 == gqVar.f39746f0) {
                return 8L;
            }
            if (i10 == gqVar.f39747g0) {
                return 9L;
            }
            if (i10 == gqVar.f39748h0) {
                return 10L;
            }
            if (i10 == gqVar.f39755o0) {
                return 11L;
            }
            if (i10 == gqVar.f39756p0) {
                return 12L;
            }
            if (i10 == gqVar.f39757q0) {
                return 13L;
            }
            if (i10 == gqVar.f39759r0) {
                return 14L;
            }
            if (i10 == gqVar.f39761s0) {
                return 15L;
            }
            if (i10 == gqVar.f39762t0) {
                return 16L;
            }
            if (i10 == gqVar.f39763u0) {
                return 17L;
            }
            if (i10 == gqVar.f39764v0) {
                return 18L;
            }
            if (i10 == gqVar.f39766w0) {
                return 19L;
            }
            if (i10 == gqVar.f39770y0) {
                return 20L;
            }
            if (i10 == gqVar.B0) {
                return 21L;
            }
            if (i10 == gqVar.H0) {
                return 22L;
            }
            if (i10 == gqVar.I0) {
                return 23L;
            }
            if (i10 == gqVar.J0) {
                return 24L;
            }
            if (i10 == gqVar.K0) {
                return 25L;
            }
            if (i10 == gqVar.L0) {
                return 26L;
            }
            if (i10 == gqVar.M0) {
                return 27L;
            }
            if (i10 == gqVar.f39768x0) {
                return 28L;
            }
            if (i10 == gqVar.m0) {
                return 29L;
            }
            if (i10 == gqVar.C0) {
                return 30L;
            }
            if (i10 == gqVar.E0) {
                return 31L;
            }
            if (i10 == gqVar.D0) {
                return 32L;
            }
            if (i10 == gqVar.F0) {
                return 33L;
            }
            if (i10 == gqVar.G0) {
                return 34L;
            }
            if (i10 == gqVar.f39771z0) {
                return 35L;
            }
            if (i10 == gqVar.N0) {
                return 36L;
            }
            if (i10 == gqVar.P0) {
                return 37L;
            }
            if (i10 == gqVar.Q0) {
                return 38L;
            }
            if (i10 == gqVar.R0) {
                return 39L;
            }
            if (i10 == gqVar.S0) {
                return 40L;
            }
            if (i10 == gqVar.U0) {
                return 41L;
            }
            if (i10 == gqVar.V0) {
                return 42L;
            }
            if (i10 == gqVar.W0) {
                return 43L;
            }
            if (i10 == gqVar.Z) {
                return 44L;
            }
            if (i10 == gqVar.f39749i0) {
                return 45L;
            }
            if (i10 == gqVar.f39750j0) {
                return 46L;
            }
            if (i10 == gqVar.f39751k0) {
                return 47L;
            }
            if (i10 == gqVar.f39752l0) {
                return 48L;
            }
            if (i10 == gqVar.f39754n0) {
                return 49L;
            }
            if (i10 == gqVar.f39736a0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        gq gqVar = this.e;
        if (i10 != gqVar.H0 && i10 != gqVar.J0 && i10 != gqVar.I0 && i10 != gqVar.B0 && i10 != gqVar.C0 && i10 != gqVar.E0 && i10 != gqVar.D0 && i10 != gqVar.G0 && i10 != gqVar.F0 && i10 != gqVar.f39750j0 && i10 != gqVar.P0 && i10 != gqVar.Q0 && i10 != gqVar.R0 && i10 != gqVar.U0 && i10 != gqVar.V0 && i10 != gqVar.W0) {
            if (i10 != gqVar.f39771z0 && i10 != gqVar.N0 && i10 != gqVar.S0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != gqVar.f39755o0 && i10 != gqVar.f39757q0 && i10 != gqVar.L0 && i10 != gqVar.f39761s0) {
                    if (i10 != 2 && i10 != gqVar.f39763u0) {
                        if (i10 != gqVar.X && i10 != gqVar.Y && i10 != gqVar.Z && i10 != gqVar.f39739b0 && i10 != gqVar.f39742c0 && i10 != gqVar.f39743d0 && i10 != gqVar.f39746f0 && i10 != gqVar.f39747g0 && i10 != gqVar.f39748h0 && i10 != gqVar.f39749i0 && i10 != gqVar.f39770y0 && i10 != gqVar.f39744e0 && i10 != gqVar.K0 && i10 != gqVar.W && i10 != gqVar.m0 && i10 != gqVar.f39751k0 && i10 != gqVar.f39754n0 && i10 != gqVar.f39736a0) {
                            if (i10 == gqVar.f39759r0 || i10 == gqVar.f39766w0 || i10 == gqVar.f39752l0) {
                                return 1;
                            }
                            if (i10 == gqVar.M0) {
                                return 6;
                            }
                            if (i10 == gqVar.f39764v0) {
                                return 11;
                            }
                            if (i10 != gqVar.f39768x0) {
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
    public final void v(s4.e1 r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fq.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.y1 y1Var;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.u6 u6Var;
        Context context = this.f39436c;
        gq gqVar = this.e;
        switch (i10) {
            case 0:
                View zaVar = new org.telegram.ui.Cells.za(context, null);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, zaVar, null);
                y1Var = zaVar;
                break;
            case 1:
                y1Var = new org.telegram.ui.Cells.i9(context);
                break;
            case 2:
            default:
                View gaVar = new org.telegram.ui.Cells.ga(context);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, gaVar, null);
                y1Var = gaVar;
                break;
            case 3:
                View q4Var = new org.telegram.ui.Cells.q4(this.f39436c, org.telegram.ui.ActionBar.y6.L6, 21, 15, true, null);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, q4Var, null);
                y1Var = q4Var;
                break;
            case 4:
            case 9:
                View z8Var = new org.telegram.ui.Cells.z8(context);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, z8Var, null);
                y1Var = z8Var;
                break;
            case 5:
                y1Var = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 6:
                View g9Var = new org.telegram.ui.Cells.g9(context, null, false);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, g9Var, null);
                y1Var = g9Var;
                break;
            case 7:
                org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, 0, null, null);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, h6Var, null);
                h6Var.b(new m0(this, 4));
                y1Var = h6Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                gqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.y6.f23299a7;
                org.telegram.ui.ActionBar.f7.i(i13, frameLayout, null);
                gqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, true, false, false);
                gqVar.f39745f = s6Var;
                s6Var.setTypeface(AndroidUtilities.bold());
                gqVar.f39745f.setTextColor(-1);
                gqVar.f39745f.setTextSize(AndroidUtilities.dp(14.0f));
                gqVar.f39745f.setGravity(17);
                org.telegram.ui.Components.s6 s6Var2 = gqVar.f39745f;
                StringBuilder sb2 = new StringBuilder();
                d3.p(R.string.AddBotButton, " ", sb2);
                if (gqVar.K) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb2.append(LocaleController.getString(i11));
                s6Var2.setText(sb2.toString());
                gqVar.e.addView(gqVar.f39745f, org.telegram.ui.Components.gb1.i(-2, -2, 17));
                gqVar.e.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.Oh));
                gqVar.e.setOnClickListener(new a(this, 14));
                gqVar.d.addView(gqVar.e, org.telegram.ui.Components.gb1.h(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                gqVar.d.setLayoutParams(new s4.q0(-1, -2));
                View view = new View(context);
                org.telegram.ui.ActionBar.f7.i(i13, view, null);
                gqVar.d.setClipChildren(false);
                gqVar.d.setClipToPadding(false);
                gqVar.d.addView(view, org.telegram.ui.Components.gb1.h(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                y1Var = gqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(4, 21, this.f39436c, gqVar.getResourceProvider(), false);
                y1Var2.setPad(1);
                y1Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                y1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.y6.V6, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.f23485k7);
                y1Var2.setEnabled(true);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, y1Var2, null);
                y1Var = y1Var2;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.r2) gqVar).currentAccount;
                u6Var = ((org.telegram.ui.ActionBar.r2) gqVar).resourceProvider;
                y1Var = new org.telegram.ui.Components.i11(i12, -gqVar.f39760s, this.f39436c, u6Var);
                break;
        }
        return new s4.e1(y1Var);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        int b10 = e1Var.b();
        gq gqVar = this.e;
        if (b10 == gqVar.f39763u0) {
            gq.g0(gqVar, e1Var.f47738a);
        }
    }

    @Override
    public final void z(s4.e1 e1Var) {
        int b10 = e1Var.b();
        gq gqVar = this.e;
        if (b10 == gqVar.f39764v0 && gqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(gqVar.getParentActivity().getCurrentFocus());
        }
    }
}
