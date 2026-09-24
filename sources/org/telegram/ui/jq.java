package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jq extends org.telegram.ui.Components.vl0 {
    public final Context f34838c;
    public boolean d;
    public final kq e;

    public jq(kq kqVar, Context context) {
        this.e = kqVar;
        if (kqVar.f35124y == 2) {
            C(true);
        }
        this.f34838c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        TLRPC.Chat chat;
        int i10 = c1Var.f42949f;
        kq kqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = kqVar.P;
        int i11 = kqVar.f35124y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = kqVar.N;
        if (!kqVar.f35120w.creator || ((i11 != 0 && (i11 != 2 || !kqVar.K)) || i10 != 4 || c1Var.b() != kqVar.f35099e0)) {
            if (kqVar.I) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = c1Var.b();
                    if (b10 == kqVar.W) {
                        if (!tL_chatAdminRights.add_admins && ((chat = kqVar.f35120w) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i11 != 2 || kqVar.K) {
                        if (b10 == kqVar.X) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !kqVar.E) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == kqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == kqVar.Z) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == kqVar.f35090a0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == kqVar.f35093b0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == kqVar.f35096c0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == kqVar.K0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == kqVar.f35098d0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == kqVar.f35099e0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == kqVar.f35101f0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == kqVar.f35102g0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == kqVar.f35103h0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == kqVar.f35104i0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == kqVar.m0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == kqVar.U0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == kqVar.V0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == kqVar.W0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == kqVar.f35109n0) {
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
        kq kqVar = this.e;
        if (kqVar.f35124y == 2) {
            if (i10 == kqVar.W) {
                return 1L;
            }
            if (i10 == kqVar.X) {
                return 2L;
            }
            if (i10 == kqVar.Y) {
                return 3L;
            }
            if (i10 == kqVar.f35093b0) {
                return 4L;
            }
            if (i10 == kqVar.f35096c0) {
                return 5L;
            }
            if (i10 == kqVar.f35098d0) {
                return 6L;
            }
            if (i10 == kqVar.f35099e0) {
                return 7L;
            }
            if (i10 == kqVar.f35101f0) {
                return 8L;
            }
            if (i10 == kqVar.f35102g0) {
                return 9L;
            }
            if (i10 == kqVar.f35103h0) {
                return 10L;
            }
            if (i10 == kqVar.f35110o0) {
                return 11L;
            }
            if (i10 == kqVar.f35111p0) {
                return 12L;
            }
            if (i10 == kqVar.f35112q0) {
                return 13L;
            }
            if (i10 == kqVar.f35114r0) {
                return 14L;
            }
            if (i10 == kqVar.f35116s0) {
                return 15L;
            }
            if (i10 == kqVar.f35117t0) {
                return 16L;
            }
            if (i10 == kqVar.f35118u0) {
                return 17L;
            }
            if (i10 == kqVar.f35119v0) {
                return 18L;
            }
            if (i10 == kqVar.f35121w0) {
                return 19L;
            }
            if (i10 == kqVar.f35125y0) {
                return 20L;
            }
            if (i10 == kqVar.B0) {
                return 21L;
            }
            if (i10 == kqVar.H0) {
                return 22L;
            }
            if (i10 == kqVar.I0) {
                return 23L;
            }
            if (i10 == kqVar.J0) {
                return 24L;
            }
            if (i10 == kqVar.K0) {
                return 25L;
            }
            if (i10 == kqVar.L0) {
                return 26L;
            }
            if (i10 == kqVar.M0) {
                return 27L;
            }
            if (i10 == kqVar.f35123x0) {
                return 28L;
            }
            if (i10 == kqVar.m0) {
                return 29L;
            }
            if (i10 == kqVar.C0) {
                return 30L;
            }
            if (i10 == kqVar.E0) {
                return 31L;
            }
            if (i10 == kqVar.D0) {
                return 32L;
            }
            if (i10 == kqVar.F0) {
                return 33L;
            }
            if (i10 == kqVar.G0) {
                return 34L;
            }
            if (i10 == kqVar.f35126z0) {
                return 35L;
            }
            if (i10 == kqVar.N0) {
                return 36L;
            }
            if (i10 == kqVar.P0) {
                return 37L;
            }
            if (i10 == kqVar.Q0) {
                return 38L;
            }
            if (i10 == kqVar.R0) {
                return 39L;
            }
            if (i10 == kqVar.S0) {
                return 40L;
            }
            if (i10 == kqVar.U0) {
                return 41L;
            }
            if (i10 == kqVar.V0) {
                return 42L;
            }
            if (i10 == kqVar.W0) {
                return 43L;
            }
            if (i10 == kqVar.Z) {
                return 44L;
            }
            if (i10 == kqVar.f35104i0) {
                return 45L;
            }
            if (i10 == kqVar.f35105j0) {
                return 46L;
            }
            if (i10 == kqVar.f35106k0) {
                return 47L;
            }
            if (i10 == kqVar.f35107l0) {
                return 48L;
            }
            if (i10 == kqVar.f35109n0) {
                return 49L;
            }
            if (i10 == kqVar.f35090a0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        kq kqVar = this.e;
        if (i10 != kqVar.H0 && i10 != kqVar.J0 && i10 != kqVar.I0 && i10 != kqVar.B0 && i10 != kqVar.C0 && i10 != kqVar.E0 && i10 != kqVar.D0 && i10 != kqVar.G0 && i10 != kqVar.F0 && i10 != kqVar.f35105j0 && i10 != kqVar.P0 && i10 != kqVar.Q0 && i10 != kqVar.R0 && i10 != kqVar.U0 && i10 != kqVar.V0 && i10 != kqVar.W0) {
            if (i10 != kqVar.f35126z0 && i10 != kqVar.N0 && i10 != kqVar.S0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != kqVar.f35110o0 && i10 != kqVar.f35112q0 && i10 != kqVar.L0 && i10 != kqVar.f35116s0) {
                    if (i10 != 2 && i10 != kqVar.f35118u0) {
                        if (i10 != kqVar.X && i10 != kqVar.Y && i10 != kqVar.Z && i10 != kqVar.f35093b0 && i10 != kqVar.f35096c0 && i10 != kqVar.f35098d0 && i10 != kqVar.f35101f0 && i10 != kqVar.f35102g0 && i10 != kqVar.f35103h0 && i10 != kqVar.f35104i0 && i10 != kqVar.f35125y0 && i10 != kqVar.f35099e0 && i10 != kqVar.K0 && i10 != kqVar.W && i10 != kqVar.m0 && i10 != kqVar.f35106k0 && i10 != kqVar.f35109n0 && i10 != kqVar.f35090a0) {
                            if (i10 == kqVar.f35114r0 || i10 == kqVar.f35121w0 || i10 == kqVar.f35107l0) {
                                return 1;
                            }
                            if (i10 == kqVar.M0) {
                                return 6;
                            }
                            if (i10 == kqVar.f35119v0) {
                                return 11;
                            }
                            if (i10 != kqVar.f35123x0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jq.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.Cells.a2 a2Var;
        org.telegram.ui.Cells.d6 d6Var;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var2;
        Context context = this.f34838c;
        kq kqVar = this.e;
        switch (i10) {
            case 0:
                View yaVar = new org.telegram.ui.Cells.ya(context, null);
                yaVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
                d6Var = yaVar;
                break;
            case 1:
                d6Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
            default:
                View eaVar = new org.telegram.ui.Cells.ea(context);
                eaVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
                d6Var = eaVar;
                break;
            case 3:
                View m4Var = new org.telegram.ui.Cells.m4(this.f34838c, org.telegram.ui.ActionBar.h6.L6, 21, 15, true, null);
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
                a2Var = m4Var;
                d6Var = a2Var;
                break;
            case 4:
            case 9:
                View v8Var = new org.telegram.ui.Cells.v8(context);
                v8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
                d6Var = v8Var;
                break;
            case 5:
                d6Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 6:
                View c9Var = new org.telegram.ui.Cells.c9(context, null, false);
                c9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
                d6Var = c9Var;
                break;
            case 7:
                org.telegram.ui.Cells.d6 d6Var3 = new org.telegram.ui.Cells.d6(context, 0, null, null);
                d6Var3.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
                d6Var3.c(new m0(this, 4));
                d6Var = d6Var3;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                kqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.h6.f18989a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
                kqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, false, false);
                kqVar.f35100f = p6Var;
                p6Var.setTypeface(AndroidUtilities.bold());
                kqVar.f35100f.setTextColor(-1);
                kqVar.f35100f.setTextSize(AndroidUtilities.dp(14.0f));
                kqVar.f35100f.setGravity(17);
                org.telegram.ui.Components.p6 p6Var2 = kqVar.f35100f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.n(R.string.AddBotButton, " ", sb2);
                if (kqVar.K) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb2.append(LocaleController.getString(i11));
                p6Var2.setText(sb2.toString());
                kqVar.e.addView(kqVar.f35100f, w7.y5.e(-2, -2, 17));
                kqVar.e.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                kqVar.e.setOnClickListener(new a(this, 15));
                kqVar.d.addView(kqVar.e, w7.y5.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                kqVar.d.setLayoutParams(new s4.p0(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
                kqVar.d.setClipChildren(false);
                kqVar.d.setClipToPadding(false);
                kqVar.d.addView(view, w7.y5.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                d6Var = kqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, this.f34838c, kqVar.getResourceProvider(), false);
                a2Var2.setPad(1);
                a2Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.f19100g7, org.telegram.ui.ActionBar.h6.f19173k7);
                a2Var2.setEnabled(true);
                a2Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
                a2Var = a2Var2;
                d6Var = a2Var;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.m2) kqVar).currentAccount;
                d6Var2 = ((org.telegram.ui.ActionBar.m2) kqVar).resourceProvider;
                d6Var = new org.telegram.ui.Components.l01(i12, -kqVar.f35115s, this.f34838c, d6Var2);
                break;
        }
        return new s4.c1(d6Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int b10 = c1Var.b();
        kq kqVar = this.e;
        if (b10 == kqVar.f35118u0) {
            kq.f0(kqVar, c1Var.f42946a);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int b10 = c1Var.b();
        kq kqVar = this.e;
        if (b10 == kqVar.f35119v0 && kqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(kqVar.getParentActivity().getCurrentFocus());
        }
    }
}
