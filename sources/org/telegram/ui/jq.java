package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jq extends org.telegram.ui.Components.sl0 {
    public final Context f38198c;
    public boolean d;
    public final kq f38199e;

    public jq(kq kqVar, Context context) {
        this.f38199e = kqVar;
        if (kqVar.f38488y == 2) {
            C(true);
        }
        this.f38198c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        TLRPC.Chat chat;
        int i10 = m1Var.f5879f;
        kq kqVar = this.f38199e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = kqVar.M;
        int i11 = kqVar.f38488y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = kqVar.K;
        if (!kqVar.f38484w.creator || ((i11 != 0 && (i11 != 2 || !kqVar.H)) || i10 != 4 || m1Var.b() != kqVar.f38458b0)) {
            if (kqVar.F) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = m1Var.b();
                    if (b10 == kqVar.T) {
                        if (!tL_chatAdminRights.add_admins && ((chat = kqVar.f38484w) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i11 != 2 || kqVar.H) {
                        if (b10 == kqVar.U) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !kqVar.B) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == kqVar.V) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == kqVar.W) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == kqVar.X) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == kqVar.Y) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == kqVar.Z) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == kqVar.H0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == kqVar.f38456a0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == kqVar.f38458b0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == kqVar.f38460c0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == kqVar.f38461d0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == kqVar.f38463e0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == kqVar.f38465f0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == kqVar.f38469j0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == kqVar.R0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == kqVar.S0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == kqVar.T0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == kqVar.f38470k0) {
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
        return this.f38199e.S;
    }

    @Override
    public final long i(int i10) {
        kq kqVar = this.f38199e;
        if (kqVar.f38488y == 2) {
            if (i10 == kqVar.T) {
                return 1L;
            }
            if (i10 == kqVar.U) {
                return 2L;
            }
            if (i10 == kqVar.V) {
                return 3L;
            }
            if (i10 == kqVar.Y) {
                return 4L;
            }
            if (i10 == kqVar.Z) {
                return 5L;
            }
            if (i10 == kqVar.f38456a0) {
                return 6L;
            }
            if (i10 == kqVar.f38458b0) {
                return 7L;
            }
            if (i10 == kqVar.f38460c0) {
                return 8L;
            }
            if (i10 == kqVar.f38461d0) {
                return 9L;
            }
            if (i10 == kqVar.f38463e0) {
                return 10L;
            }
            if (i10 == kqVar.f38471l0) {
                return 11L;
            }
            if (i10 == kqVar.m0) {
                return 12L;
            }
            if (i10 == kqVar.f38473n0) {
                return 13L;
            }
            if (i10 == kqVar.f38474o0) {
                return 14L;
            }
            if (i10 == kqVar.f38475p0) {
                return 15L;
            }
            if (i10 == kqVar.f38476q0) {
                return 16L;
            }
            if (i10 == kqVar.f38478r0) {
                return 17L;
            }
            if (i10 == kqVar.f38480s0) {
                return 18L;
            }
            if (i10 == kqVar.f38481t0) {
                return 19L;
            }
            if (i10 == kqVar.f38483v0) {
                return 20L;
            }
            if (i10 == kqVar.f38489y0) {
                return 21L;
            }
            if (i10 == kqVar.E0) {
                return 22L;
            }
            if (i10 == kqVar.F0) {
                return 23L;
            }
            if (i10 == kqVar.G0) {
                return 24L;
            }
            if (i10 == kqVar.H0) {
                return 25L;
            }
            if (i10 == kqVar.I0) {
                return 26L;
            }
            if (i10 == kqVar.J0) {
                return 27L;
            }
            if (i10 == kqVar.f38482u0) {
                return 28L;
            }
            if (i10 == kqVar.f38469j0) {
                return 29L;
            }
            if (i10 == kqVar.f38490z0) {
                return 30L;
            }
            if (i10 == kqVar.B0) {
                return 31L;
            }
            if (i10 == kqVar.A0) {
                return 32L;
            }
            if (i10 == kqVar.C0) {
                return 33L;
            }
            if (i10 == kqVar.D0) {
                return 34L;
            }
            if (i10 == kqVar.f38485w0) {
                return 35L;
            }
            if (i10 == kqVar.K0) {
                return 36L;
            }
            if (i10 == kqVar.M0) {
                return 37L;
            }
            if (i10 == kqVar.N0) {
                return 38L;
            }
            if (i10 == kqVar.O0) {
                return 39L;
            }
            if (i10 == kqVar.P0) {
                return 40L;
            }
            if (i10 == kqVar.R0) {
                return 41L;
            }
            if (i10 == kqVar.S0) {
                return 42L;
            }
            if (i10 == kqVar.T0) {
                return 43L;
            }
            if (i10 == kqVar.W) {
                return 44L;
            }
            if (i10 == kqVar.f38465f0) {
                return 45L;
            }
            if (i10 == kqVar.f38466g0) {
                return 46L;
            }
            if (i10 == kqVar.f38467h0) {
                return 47L;
            }
            if (i10 == kqVar.f38468i0) {
                return 48L;
            }
            if (i10 == kqVar.f38470k0) {
                return 49L;
            }
            if (i10 == kqVar.X) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        kq kqVar = this.f38199e;
        if (i10 != kqVar.E0 && i10 != kqVar.G0 && i10 != kqVar.F0 && i10 != kqVar.f38489y0 && i10 != kqVar.f38490z0 && i10 != kqVar.B0 && i10 != kqVar.A0 && i10 != kqVar.D0 && i10 != kqVar.C0 && i10 != kqVar.f38466g0 && i10 != kqVar.M0 && i10 != kqVar.N0 && i10 != kqVar.O0 && i10 != kqVar.R0 && i10 != kqVar.S0 && i10 != kqVar.T0) {
            if (i10 != kqVar.f38485w0 && i10 != kqVar.K0 && i10 != kqVar.P0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != kqVar.f38471l0 && i10 != kqVar.f38473n0 && i10 != kqVar.I0 && i10 != kqVar.f38475p0) {
                    if (i10 != 2 && i10 != kqVar.f38478r0) {
                        if (i10 != kqVar.U && i10 != kqVar.V && i10 != kqVar.W && i10 != kqVar.Y && i10 != kqVar.Z && i10 != kqVar.f38456a0 && i10 != kqVar.f38460c0 && i10 != kqVar.f38461d0 && i10 != kqVar.f38463e0 && i10 != kqVar.f38465f0 && i10 != kqVar.f38483v0 && i10 != kqVar.f38458b0 && i10 != kqVar.H0 && i10 != kqVar.T && i10 != kqVar.f38469j0 && i10 != kqVar.f38467h0 && i10 != kqVar.f38470k0 && i10 != kqVar.X) {
                            if (i10 == kqVar.f38474o0 || i10 == kqVar.f38481t0 || i10 == kqVar.f38468i0) {
                                return 1;
                            }
                            if (i10 == kqVar.J0) {
                                return 6;
                            }
                            if (i10 == kqVar.f38480s0) {
                                return 11;
                            }
                            if (i10 != kqVar.f38482u0) {
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
    public final void v(f2.m1 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jq.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.Cells.z1 z1Var;
        org.telegram.ui.Cells.c6 c6Var;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = this.f38198c;
        kq kqVar = this.f38199e;
        switch (i10) {
            case 0:
                View uaVar = new org.telegram.ui.Cells.ua(context, null);
                uaVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                c6Var = uaVar;
                break;
            case 1:
                c6Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 2:
            default:
                View aaVar = new org.telegram.ui.Cells.aa(context);
                aaVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                c6Var = aaVar;
                break;
            case 3:
                View m4Var = new org.telegram.ui.Cells.m4(this.f38198c, org.telegram.ui.ActionBar.k6.L6, 21, 15, true, null);
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                z1Var = m4Var;
                c6Var = z1Var;
                break;
            case 4:
            case 9:
                View r8Var = new org.telegram.ui.Cells.r8(context);
                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                c6Var = r8Var;
                break;
            case 5:
                c6Var = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 6:
                View y8Var = new org.telegram.ui.Cells.y8(context, null, false);
                y8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                c6Var = y8Var;
                break;
            case 7:
                org.telegram.ui.Cells.c6 c6Var2 = new org.telegram.ui.Cells.c6(context, 0, null, null);
                c6Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                c6Var2.c(new n0(this, 4));
                c6Var = c6Var2;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                kqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.k6.f21605a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
                kqVar.f38462e = new FrameLayout(context);
                org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, false, false);
                kqVar.f38464f = k6Var;
                k6Var.setTypeface(AndroidUtilities.bold());
                kqVar.f38464f.setTextColor(-1);
                kqVar.f38464f.setTextSize(AndroidUtilities.dp(14.0f));
                kqVar.f38464f.setGravity(17);
                org.telegram.ui.Components.k6 k6Var2 = kqVar.f38464f;
                StringBuilder sb = new StringBuilder();
                b.i(R.string.AddBotButton, " ", sb);
                if (kqVar.H) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb.append(LocaleController.getString(i11));
                k6Var2.setText(sb.toString());
                kqVar.f38462e.addView(kqVar.f38464f, k7.c6.e(-2, -2, 17));
                kqVar.f38462e.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                kqVar.f38462e.setOnClickListener(new a(this, 15));
                kqVar.d.addView(kqVar.f38462e, k7.c6.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                kqVar.d.setLayoutParams(new f2.x0(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
                kqVar.d.setClipChildren(false);
                kqVar.d.setClipToPadding(false);
                kqVar.d.addView(view, k7.c6.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                c6Var = kqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, this.f38198c, kqVar.getResourceProvider(), false);
                z1Var2.setPad(1);
                z1Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.f21715g7, org.telegram.ui.ActionBar.k6.f21786k7);
                z1Var2.setEnabled(true);
                z1Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                z1Var = z1Var2;
                c6Var = z1Var;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.p2) kqVar).currentAccount;
                g6Var = ((org.telegram.ui.ActionBar.p2) kqVar).resourceProvider;
                c6Var = new org.telegram.ui.Components.g01(i12, -kqVar.f38479s, this.f38198c, g6Var);
                break;
        }
        return new f2.m1(c6Var);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        int b10 = m1Var.b();
        kq kqVar = this.f38199e;
        if (b10 == kqVar.f38478r0) {
            kq.f0(kqVar, m1Var.f5875a);
        }
    }

    @Override
    public final void z(f2.m1 m1Var) {
        int b10 = m1Var.b();
        kq kqVar = this.f38199e;
        if (b10 == kqVar.f38480s0 && kqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(kqVar.getParentActivity().getCurrentFocus());
        }
    }
}
