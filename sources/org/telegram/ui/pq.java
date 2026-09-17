package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class pq extends org.telegram.ui.Components.kl0 {
    public final Context f39616c;
    public boolean d;
    public final qq f39617e;

    public pq(qq qqVar, Context context) {
        this.f39617e = qqVar;
        if (qqVar.f39970y == 2) {
            C(true);
        }
        this.f39616c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        TLRPC.Chat chat;
        int i10 = c1Var.f45743f;
        qq qqVar = this.f39617e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = qqVar.P;
        int i11 = qqVar.f39970y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = qqVar.N;
        if (!qqVar.f39966w.creator || ((i11 != 0 && (i11 != 2 || !qqVar.K)) || i10 != 4 || c1Var.b() != qqVar.f39945e0)) {
            if (qqVar.I) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = c1Var.b();
                    if (b10 == qqVar.W) {
                        if (!tL_chatAdminRights.add_admins && ((chat = qqVar.f39966w) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i11 != 2 || qqVar.K) {
                        if (b10 == qqVar.X) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !qqVar.E) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == qqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == qqVar.Z) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == qqVar.f39935a0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == qqVar.f39938b0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == qqVar.f39941c0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == qqVar.K0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == qqVar.f39943d0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == qqVar.f39945e0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == qqVar.f39947f0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == qqVar.f39948g0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == qqVar.f39949h0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == qqVar.f39950i0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == qqVar.m0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == qqVar.U0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == qqVar.V0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == qqVar.W0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == qqVar.f39955n0) {
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
        return this.f39617e.V;
    }

    @Override
    public final long i(int i10) {
        qq qqVar = this.f39617e;
        if (qqVar.f39970y == 2) {
            if (i10 == qqVar.W) {
                return 1L;
            }
            if (i10 == qqVar.X) {
                return 2L;
            }
            if (i10 == qqVar.Y) {
                return 3L;
            }
            if (i10 == qqVar.f39938b0) {
                return 4L;
            }
            if (i10 == qqVar.f39941c0) {
                return 5L;
            }
            if (i10 == qqVar.f39943d0) {
                return 6L;
            }
            if (i10 == qqVar.f39945e0) {
                return 7L;
            }
            if (i10 == qqVar.f39947f0) {
                return 8L;
            }
            if (i10 == qqVar.f39948g0) {
                return 9L;
            }
            if (i10 == qqVar.f39949h0) {
                return 10L;
            }
            if (i10 == qqVar.f39956o0) {
                return 11L;
            }
            if (i10 == qqVar.f39957p0) {
                return 12L;
            }
            if (i10 == qqVar.f39958q0) {
                return 13L;
            }
            if (i10 == qqVar.f39960r0) {
                return 14L;
            }
            if (i10 == qqVar.f39962s0) {
                return 15L;
            }
            if (i10 == qqVar.f39963t0) {
                return 16L;
            }
            if (i10 == qqVar.f39964u0) {
                return 17L;
            }
            if (i10 == qqVar.f39965v0) {
                return 18L;
            }
            if (i10 == qqVar.f39967w0) {
                return 19L;
            }
            if (i10 == qqVar.f39971y0) {
                return 20L;
            }
            if (i10 == qqVar.B0) {
                return 21L;
            }
            if (i10 == qqVar.H0) {
                return 22L;
            }
            if (i10 == qqVar.I0) {
                return 23L;
            }
            if (i10 == qqVar.J0) {
                return 24L;
            }
            if (i10 == qqVar.K0) {
                return 25L;
            }
            if (i10 == qqVar.L0) {
                return 26L;
            }
            if (i10 == qqVar.M0) {
                return 27L;
            }
            if (i10 == qqVar.f39969x0) {
                return 28L;
            }
            if (i10 == qqVar.m0) {
                return 29L;
            }
            if (i10 == qqVar.C0) {
                return 30L;
            }
            if (i10 == qqVar.E0) {
                return 31L;
            }
            if (i10 == qqVar.D0) {
                return 32L;
            }
            if (i10 == qqVar.F0) {
                return 33L;
            }
            if (i10 == qqVar.G0) {
                return 34L;
            }
            if (i10 == qqVar.f39972z0) {
                return 35L;
            }
            if (i10 == qqVar.N0) {
                return 36L;
            }
            if (i10 == qqVar.P0) {
                return 37L;
            }
            if (i10 == qqVar.Q0) {
                return 38L;
            }
            if (i10 == qqVar.R0) {
                return 39L;
            }
            if (i10 == qqVar.S0) {
                return 40L;
            }
            if (i10 == qqVar.U0) {
                return 41L;
            }
            if (i10 == qqVar.V0) {
                return 42L;
            }
            if (i10 == qqVar.W0) {
                return 43L;
            }
            if (i10 == qqVar.Z) {
                return 44L;
            }
            if (i10 == qqVar.f39950i0) {
                return 45L;
            }
            if (i10 == qqVar.f39951j0) {
                return 46L;
            }
            if (i10 == qqVar.f39952k0) {
                return 47L;
            }
            if (i10 == qqVar.f39953l0) {
                return 48L;
            }
            if (i10 == qqVar.f39955n0) {
                return 49L;
            }
            if (i10 == qqVar.f39935a0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        qq qqVar = this.f39617e;
        if (i10 != qqVar.H0 && i10 != qqVar.J0 && i10 != qqVar.I0 && i10 != qqVar.B0 && i10 != qqVar.C0 && i10 != qqVar.E0 && i10 != qqVar.D0 && i10 != qqVar.G0 && i10 != qqVar.F0 && i10 != qqVar.f39951j0 && i10 != qqVar.P0 && i10 != qqVar.Q0 && i10 != qqVar.R0 && i10 != qqVar.U0 && i10 != qqVar.V0 && i10 != qqVar.W0) {
            if (i10 != qqVar.f39972z0 && i10 != qqVar.N0 && i10 != qqVar.S0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != qqVar.f39956o0 && i10 != qqVar.f39958q0 && i10 != qqVar.L0 && i10 != qqVar.f39962s0) {
                    if (i10 != 2 && i10 != qqVar.f39964u0) {
                        if (i10 != qqVar.X && i10 != qqVar.Y && i10 != qqVar.Z && i10 != qqVar.f39938b0 && i10 != qqVar.f39941c0 && i10 != qqVar.f39943d0 && i10 != qqVar.f39947f0 && i10 != qqVar.f39948g0 && i10 != qqVar.f39949h0 && i10 != qqVar.f39950i0 && i10 != qqVar.f39971y0 && i10 != qqVar.f39945e0 && i10 != qqVar.K0 && i10 != qqVar.W && i10 != qqVar.m0 && i10 != qqVar.f39952k0 && i10 != qqVar.f39955n0 && i10 != qqVar.f39935a0) {
                            if (i10 == qqVar.f39960r0 || i10 == qqVar.f39967w0 || i10 == qqVar.f39953l0) {
                                return 1;
                            }
                            if (i10 == qqVar.M0) {
                                return 6;
                            }
                            if (i10 == qqVar.f39965v0) {
                                return 11;
                            }
                            if (i10 != qqVar.f39969x0) {
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
    public final void v(s4.c1 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pq.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.Cells.z1 z1Var;
        org.telegram.ui.Cells.c6 c6Var;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.f39616c;
        qq qqVar = this.f39617e;
        switch (i10) {
            case 0:
                View yaVar = new org.telegram.ui.Cells.ya(context, null);
                yaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664d6, false));
                c6Var = yaVar;
                break;
            case 1:
                c6Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
            default:
                View eaVar = new org.telegram.ui.Cells.ea(context);
                eaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664d6, false));
                c6Var = eaVar;
                break;
            case 3:
                View l4Var = new org.telegram.ui.Cells.l4(this.f39616c, org.telegram.ui.ActionBar.j6.L6, 21, 15, true, null);
                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664d6, false));
                z1Var = l4Var;
                c6Var = z1Var;
                break;
            case 4:
            case 9:
                View v8Var = new org.telegram.ui.Cells.v8(context);
                v8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664d6, false));
                c6Var = v8Var;
                break;
            case 5:
                c6Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                break;
            case 6:
                View c9Var = new org.telegram.ui.Cells.c9(context, null, false);
                c9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664d6, false));
                c6Var = c9Var;
                break;
            case 7:
                org.telegram.ui.Cells.c6 c6Var2 = new org.telegram.ui.Cells.c6(context, 0, null, null);
                c6Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664d6, false));
                c6Var2.b(new l0(this, 4));
                c6Var = c6Var2;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                qqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.j6.f20608a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                qqVar.f39944e = new FrameLayout(context);
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, false, false);
                qqVar.f39946f = q6Var;
                q6Var.setTypeface(AndroidUtilities.bold());
                qqVar.f39946f.setTextColor(-1);
                qqVar.f39946f.setTextSize(AndroidUtilities.dp(14.0f));
                qqVar.f39946f.setGravity(17);
                org.telegram.ui.Components.q6 q6Var2 = qqVar.f39946f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.vl.l(R.string.AddBotButton, " ", sb2);
                if (qqVar.K) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb2.append(LocaleController.getString(i11));
                q6Var2.setText(sb2.toString());
                qqVar.f39944e.addView(qqVar.f39946f, w7.x5.e(-2, -2, 17));
                qqVar.f39944e.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                qqVar.f39944e.setOnClickListener(new a(this, 15));
                qqVar.d.addView(qqVar.f39944e, w7.x5.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                qqVar.d.setLayoutParams(new s4.p0(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                qqVar.d.setClipChildren(false);
                qqVar.d.setClipToPadding(false);
                qqVar.d.addView(view, w7.x5.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                c6Var = qqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, this.f39616c, qqVar.getResourceProvider(), false);
                z1Var2.setPad(1);
                z1Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f20720g7, org.telegram.ui.ActionBar.j6.f20793k7);
                z1Var2.setEnabled(true);
                z1Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664d6, false));
                z1Var = z1Var2;
                c6Var = z1Var;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.n2) qqVar).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.n2) qqVar).resourceProvider;
                c6Var = new org.telegram.ui.Components.a01(i12, -qqVar.f39961s, this.f39616c, f6Var);
                break;
        }
        return new s4.c1(c6Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int b10 = c1Var.b();
        qq qqVar = this.f39617e;
        if (b10 == qqVar.f39964u0) {
            qq.f0(qqVar, c1Var.f45739a);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int b10 = c1Var.b();
        qq qqVar = this.f39617e;
        if (b10 == qqVar.f39965v0 && qqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(qqVar.getParentActivity().getCurrentFocus());
        }
    }
}
