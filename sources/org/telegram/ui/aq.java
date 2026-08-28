package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class aq extends org.telegram.ui.Components.vk0 {
    public final Context f36535c;
    public boolean d;
    public final bq f36536e;

    public aq(bq bqVar, Context context) {
        this.f36536e = bqVar;
        if (bqVar.f36952y == 2) {
            C(true);
        }
        this.f36535c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        TLRPC.Chat chat;
        int i9 = q1Var.f5505f;
        bq bqVar = this.f36536e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = bqVar.L;
        int i10 = bqVar.f36952y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = bqVar.J;
        if (!bqVar.f36948w.creator || ((i10 != 0 && (i10 != 2 || !bqVar.G)) || i9 != 4 || q1Var.b() != bqVar.f36920a0)) {
            if (bqVar.E) {
                if ((i10 == 0 || i10 == 2) && i9 == 4) {
                    int b10 = q1Var.b();
                    if (b10 == bqVar.S) {
                        if (!tL_chatAdminRights.add_admins && ((chat = bqVar.f36948w) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i10 != 2 || bqVar.G) {
                        if (b10 == bqVar.T) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !bqVar.A) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == bqVar.U) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == bqVar.V) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == bqVar.W) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == bqVar.X) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == bqVar.Y) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == bqVar.G0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == bqVar.Z) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == bqVar.f36920a0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == bqVar.f36922b0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == bqVar.f36924c0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == bqVar.f36925d0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == bqVar.f36927e0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == bqVar.f36932i0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == bqVar.Q0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == bqVar.R0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == bqVar.S0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == bqVar.f36933j0) {
                                    return tL_chatAdminRights.manage_linked_peers;
                                }
                            }
                        }
                    } else {
                        return false;
                    }
                }
                if (i9 == 3 || i9 == 1 || i9 == 5 || i9 == 8 || i9 == 11) {
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
        return this.f36536e.R;
    }

    @Override
    public final long i(int i9) {
        bq bqVar = this.f36536e;
        if (bqVar.f36952y == 2) {
            if (i9 == bqVar.S) {
                return 1L;
            }
            if (i9 == bqVar.T) {
                return 2L;
            }
            if (i9 == bqVar.U) {
                return 3L;
            }
            if (i9 == bqVar.X) {
                return 4L;
            }
            if (i9 == bqVar.Y) {
                return 5L;
            }
            if (i9 == bqVar.Z) {
                return 6L;
            }
            if (i9 == bqVar.f36920a0) {
                return 7L;
            }
            if (i9 == bqVar.f36922b0) {
                return 8L;
            }
            if (i9 == bqVar.f36924c0) {
                return 9L;
            }
            if (i9 == bqVar.f36925d0) {
                return 10L;
            }
            if (i9 == bqVar.f36934k0) {
                return 11L;
            }
            if (i9 == bqVar.f36935l0) {
                return 12L;
            }
            if (i9 == bqVar.m0) {
                return 13L;
            }
            if (i9 == bqVar.f36937n0) {
                return 14L;
            }
            if (i9 == bqVar.f36938o0) {
                return 15L;
            }
            if (i9 == bqVar.f36939p0) {
                return 16L;
            }
            if (i9 == bqVar.f36940q0) {
                return 17L;
            }
            if (i9 == bqVar.f36942r0) {
                return 18L;
            }
            if (i9 == bqVar.f36944s0) {
                return 19L;
            }
            if (i9 == bqVar.f36946u0) {
                return 20L;
            }
            if (i9 == bqVar.f36951x0) {
                return 21L;
            }
            if (i9 == bqVar.D0) {
                return 22L;
            }
            if (i9 == bqVar.E0) {
                return 23L;
            }
            if (i9 == bqVar.F0) {
                return 24L;
            }
            if (i9 == bqVar.G0) {
                return 25L;
            }
            if (i9 == bqVar.H0) {
                return 26L;
            }
            if (i9 == bqVar.I0) {
                return 27L;
            }
            if (i9 == bqVar.f36945t0) {
                return 28L;
            }
            if (i9 == bqVar.f36932i0) {
                return 29L;
            }
            if (i9 == bqVar.f36953y0) {
                return 30L;
            }
            if (i9 == bqVar.A0) {
                return 31L;
            }
            if (i9 == bqVar.f36954z0) {
                return 32L;
            }
            if (i9 == bqVar.B0) {
                return 33L;
            }
            if (i9 == bqVar.C0) {
                return 34L;
            }
            if (i9 == bqVar.f36947v0) {
                return 35L;
            }
            if (i9 == bqVar.J0) {
                return 36L;
            }
            if (i9 == bqVar.L0) {
                return 37L;
            }
            if (i9 == bqVar.M0) {
                return 38L;
            }
            if (i9 == bqVar.N0) {
                return 39L;
            }
            if (i9 == bqVar.O0) {
                return 40L;
            }
            if (i9 == bqVar.Q0) {
                return 41L;
            }
            if (i9 == bqVar.R0) {
                return 42L;
            }
            if (i9 == bqVar.S0) {
                return 43L;
            }
            if (i9 == bqVar.V) {
                return 44L;
            }
            if (i9 == bqVar.f36927e0) {
                return 45L;
            }
            if (i9 == bqVar.f36929f0) {
                return 46L;
            }
            if (i9 == bqVar.f36930g0) {
                return 47L;
            }
            if (i9 == bqVar.f36931h0) {
                return 48L;
            }
            if (i9 == bqVar.f36933j0) {
                return 49L;
            }
            if (i9 == bqVar.W) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i9) {
        bq bqVar = this.f36536e;
        if (i9 != bqVar.D0 && i9 != bqVar.F0 && i9 != bqVar.E0 && i9 != bqVar.f36951x0 && i9 != bqVar.f36953y0 && i9 != bqVar.A0 && i9 != bqVar.f36954z0 && i9 != bqVar.C0 && i9 != bqVar.B0 && i9 != bqVar.f36929f0 && i9 != bqVar.L0 && i9 != bqVar.M0 && i9 != bqVar.N0 && i9 != bqVar.Q0 && i9 != bqVar.R0 && i9 != bqVar.S0) {
            if (i9 != bqVar.f36947v0 && i9 != bqVar.J0 && i9 != bqVar.O0) {
                if (i9 == 0) {
                    return 0;
                }
                if (i9 != 1 && i9 != bqVar.f36934k0 && i9 != bqVar.m0 && i9 != bqVar.H0 && i9 != bqVar.f36938o0) {
                    if (i9 != 2 && i9 != bqVar.f36940q0) {
                        if (i9 != bqVar.T && i9 != bqVar.U && i9 != bqVar.V && i9 != bqVar.X && i9 != bqVar.Y && i9 != bqVar.Z && i9 != bqVar.f36922b0 && i9 != bqVar.f36924c0 && i9 != bqVar.f36925d0 && i9 != bqVar.f36927e0 && i9 != bqVar.f36946u0 && i9 != bqVar.f36920a0 && i9 != bqVar.G0 && i9 != bqVar.S && i9 != bqVar.f36932i0 && i9 != bqVar.f36930g0 && i9 != bqVar.f36933j0 && i9 != bqVar.W) {
                            if (i9 == bqVar.f36937n0 || i9 == bqVar.f36944s0 || i9 == bqVar.f36931h0) {
                                return 1;
                            }
                            if (i9 == bqVar.I0) {
                                return 6;
                            }
                            if (i9 == bqVar.f36942r0) {
                                return 11;
                            }
                            if (i9 != bqVar.f36945t0) {
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
    public final void v(f2.q1 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.aq.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        int i10;
        org.telegram.ui.Cells.z1 z1Var;
        org.telegram.ui.Cells.c6 c6Var;
        int i11;
        org.telegram.ui.ActionBar.b6 b6Var;
        Context context = this.f36535c;
        bq bqVar = this.f36536e;
        switch (i9) {
            case 0:
                View uaVar = new org.telegram.ui.Cells.ua(context, null);
                uaVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                c6Var = uaVar;
                break;
            case 1:
                c6Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 2:
            default:
                View baVar = new org.telegram.ui.Cells.ba(context);
                baVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                c6Var = baVar;
                break;
            case 3:
                View m4Var = new org.telegram.ui.Cells.m4(this.f36535c, org.telegram.ui.ActionBar.f6.L6, 21, 15, true, null);
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                z1Var = m4Var;
                c6Var = z1Var;
                break;
            case 4:
            case 9:
                View s8Var = new org.telegram.ui.Cells.s8(context);
                s8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                c6Var = s8Var;
                break;
            case 5:
                c6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            case 6:
                View z8Var = new org.telegram.ui.Cells.z8(context, null, false);
                z8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                c6Var = z8Var;
                break;
            case 7:
                org.telegram.ui.Cells.c6 c6Var2 = new org.telegram.ui.Cells.c6(context, 0, null, null);
                c6Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                c6Var2.b(new o0(this, 4));
                c6Var = c6Var2;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                bqVar.d = frameLayout;
                int i12 = org.telegram.ui.ActionBar.f6.f22947a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
                bqVar.f36926e = new FrameLayout(context);
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, false, false);
                bqVar.f36928f = j6Var;
                j6Var.setTypeface(AndroidUtilities.bold());
                bqVar.f36928f.setTextColor(-1);
                bqVar.f36928f.setTextSize(AndroidUtilities.dp(14.0f));
                bqVar.f36928f.setGravity(17);
                org.telegram.ui.Components.j6 j6Var2 = bqVar.f36928f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.j2.k(R.string.AddBotButton, " ", sb2);
                if (bqVar.G) {
                    i10 = R.string.AddBotButtonAsAdmin;
                } else {
                    i10 = R.string.AddBotButtonAsMember;
                }
                sb2.append(LocaleController.getString(i10));
                j6Var2.setText(sb2.toString());
                bqVar.f36926e.addView(bqVar.f36928f, g7.e6.e(-2, -2, 17));
                bqVar.f36926e.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.Oh));
                bqVar.f36926e.setOnClickListener(new a(this, 15));
                bqVar.d.addView(bqVar.f36926e, g7.e6.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                bqVar.d.setLayoutParams(new f2.a1(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
                bqVar.d.setClipChildren(false);
                bqVar.d.setClipToPadding(false);
                bqVar.d.addView(view, g7.e6.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                c6Var = bqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, this.f36535c, bqVar.getResourceProvider(), false);
                z1Var2.setPad(1);
                z1Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.f6.V6, org.telegram.ui.ActionBar.f6.f23056g7, org.telegram.ui.ActionBar.f6.f23128k7);
                z1Var2.setEnabled(true);
                z1Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                z1Var = z1Var2;
                c6Var = z1Var;
                break;
            case 11:
                i11 = ((org.telegram.ui.ActionBar.o2) bqVar).currentAccount;
                b6Var = ((org.telegram.ui.ActionBar.o2) bqVar).resourceProvider;
                c6Var = new org.telegram.ui.Components.iz0(i11, -bqVar.f36943s, this.f36535c, b6Var);
                break;
        }
        return new f2.q1(c6Var);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        int b10 = q1Var.b();
        bq bqVar = this.f36536e;
        if (b10 == bqVar.f36940q0) {
            bq.e0(bqVar, q1Var.f5501a);
        }
    }

    @Override
    public final void z(f2.q1 q1Var) {
        int b10 = q1Var.b();
        bq bqVar = this.f36536e;
        if (b10 == bqVar.f36942r0 && bqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(bqVar.getParentActivity().getCurrentFocus());
        }
    }
}
