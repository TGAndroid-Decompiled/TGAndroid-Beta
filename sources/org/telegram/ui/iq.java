package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class iq extends org.telegram.ui.Components.rl0 {
    public final Context f35149c;
    public boolean d;
    public final jq e;

    public iq(jq jqVar, Context context) {
        this.e = jqVar;
        if (jqVar.f35462y == 2) {
            C(true);
        }
        this.f35149c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        TLRPC.Chat chat;
        int i10 = l1Var.f5788f;
        jq jqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = jqVar.M;
        int i11 = jqVar.f35462y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = jqVar.K;
        if (!jqVar.f35458w.creator || ((i11 != 0 && (i11 != 2 || !jqVar.H)) || i10 != 4 || l1Var.b() != jqVar.f35433b0)) {
            if (jqVar.F) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = l1Var.b();
                    if (b10 == jqVar.T) {
                        if (!tL_chatAdminRights.add_admins && ((chat = jqVar.f35458w) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i11 != 2 || jqVar.H) {
                        if (b10 == jqVar.U) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !jqVar.B) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == jqVar.V) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == jqVar.W) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == jqVar.X) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == jqVar.Y) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == jqVar.Z) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == jqVar.H0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == jqVar.f35431a0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == jqVar.f35433b0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == jqVar.f35435c0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == jqVar.f35436d0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == jqVar.f35437e0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == jqVar.f35439f0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == jqVar.f35443j0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == jqVar.R0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == jqVar.S0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == jqVar.T0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == jqVar.f35444k0) {
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
        return this.e.S;
    }

    @Override
    public final long i(int i10) {
        jq jqVar = this.e;
        if (jqVar.f35462y == 2) {
            if (i10 == jqVar.T) {
                return 1L;
            }
            if (i10 == jqVar.U) {
                return 2L;
            }
            if (i10 == jqVar.V) {
                return 3L;
            }
            if (i10 == jqVar.Y) {
                return 4L;
            }
            if (i10 == jqVar.Z) {
                return 5L;
            }
            if (i10 == jqVar.f35431a0) {
                return 6L;
            }
            if (i10 == jqVar.f35433b0) {
                return 7L;
            }
            if (i10 == jqVar.f35435c0) {
                return 8L;
            }
            if (i10 == jqVar.f35436d0) {
                return 9L;
            }
            if (i10 == jqVar.f35437e0) {
                return 10L;
            }
            if (i10 == jqVar.f35445l0) {
                return 11L;
            }
            if (i10 == jqVar.m0) {
                return 12L;
            }
            if (i10 == jqVar.f35447n0) {
                return 13L;
            }
            if (i10 == jqVar.f35448o0) {
                return 14L;
            }
            if (i10 == jqVar.f35449p0) {
                return 15L;
            }
            if (i10 == jqVar.f35450q0) {
                return 16L;
            }
            if (i10 == jqVar.f35452r0) {
                return 17L;
            }
            if (i10 == jqVar.f35454s0) {
                return 18L;
            }
            if (i10 == jqVar.f35455t0) {
                return 19L;
            }
            if (i10 == jqVar.f35457v0) {
                return 20L;
            }
            if (i10 == jqVar.f35463y0) {
                return 21L;
            }
            if (i10 == jqVar.E0) {
                return 22L;
            }
            if (i10 == jqVar.F0) {
                return 23L;
            }
            if (i10 == jqVar.G0) {
                return 24L;
            }
            if (i10 == jqVar.H0) {
                return 25L;
            }
            if (i10 == jqVar.I0) {
                return 26L;
            }
            if (i10 == jqVar.J0) {
                return 27L;
            }
            if (i10 == jqVar.f35456u0) {
                return 28L;
            }
            if (i10 == jqVar.f35443j0) {
                return 29L;
            }
            if (i10 == jqVar.f35464z0) {
                return 30L;
            }
            if (i10 == jqVar.B0) {
                return 31L;
            }
            if (i10 == jqVar.A0) {
                return 32L;
            }
            if (i10 == jqVar.C0) {
                return 33L;
            }
            if (i10 == jqVar.D0) {
                return 34L;
            }
            if (i10 == jqVar.f35459w0) {
                return 35L;
            }
            if (i10 == jqVar.K0) {
                return 36L;
            }
            if (i10 == jqVar.M0) {
                return 37L;
            }
            if (i10 == jqVar.N0) {
                return 38L;
            }
            if (i10 == jqVar.O0) {
                return 39L;
            }
            if (i10 == jqVar.P0) {
                return 40L;
            }
            if (i10 == jqVar.R0) {
                return 41L;
            }
            if (i10 == jqVar.S0) {
                return 42L;
            }
            if (i10 == jqVar.T0) {
                return 43L;
            }
            if (i10 == jqVar.W) {
                return 44L;
            }
            if (i10 == jqVar.f35439f0) {
                return 45L;
            }
            if (i10 == jqVar.f35440g0) {
                return 46L;
            }
            if (i10 == jqVar.f35441h0) {
                return 47L;
            }
            if (i10 == jqVar.f35442i0) {
                return 48L;
            }
            if (i10 == jqVar.f35444k0) {
                return 49L;
            }
            if (i10 == jqVar.X) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        jq jqVar = this.e;
        if (i10 != jqVar.E0 && i10 != jqVar.G0 && i10 != jqVar.F0 && i10 != jqVar.f35463y0 && i10 != jqVar.f35464z0 && i10 != jqVar.B0 && i10 != jqVar.A0 && i10 != jqVar.D0 && i10 != jqVar.C0 && i10 != jqVar.f35440g0 && i10 != jqVar.M0 && i10 != jqVar.N0 && i10 != jqVar.O0 && i10 != jqVar.R0 && i10 != jqVar.S0 && i10 != jqVar.T0) {
            if (i10 != jqVar.f35459w0 && i10 != jqVar.K0 && i10 != jqVar.P0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != jqVar.f35445l0 && i10 != jqVar.f35447n0 && i10 != jqVar.I0 && i10 != jqVar.f35449p0) {
                    if (i10 != 2 && i10 != jqVar.f35452r0) {
                        if (i10 != jqVar.U && i10 != jqVar.V && i10 != jqVar.W && i10 != jqVar.Y && i10 != jqVar.Z && i10 != jqVar.f35431a0 && i10 != jqVar.f35435c0 && i10 != jqVar.f35436d0 && i10 != jqVar.f35437e0 && i10 != jqVar.f35439f0 && i10 != jqVar.f35457v0 && i10 != jqVar.f35433b0 && i10 != jqVar.H0 && i10 != jqVar.T && i10 != jqVar.f35443j0 && i10 != jqVar.f35441h0 && i10 != jqVar.f35444k0 && i10 != jqVar.X) {
                            if (i10 == jqVar.f35448o0 || i10 == jqVar.f35455t0 || i10 == jqVar.f35442i0) {
                                return 1;
                            }
                            if (i10 == jqVar.J0) {
                                return 6;
                            }
                            if (i10 == jqVar.f35454s0) {
                                return 11;
                            }
                            if (i10 != jqVar.f35456u0) {
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
    public final void v(f2.l1 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iq.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.Cells.z1 z1Var;
        org.telegram.ui.Cells.c6 c6Var;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.f35149c;
        jq jqVar = this.e;
        switch (i10) {
            case 0:
                View uaVar = new org.telegram.ui.Cells.ua(context, null);
                uaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                c6Var = uaVar;
                break;
            case 1:
                c6Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 2:
            default:
                View aaVar = new org.telegram.ui.Cells.aa(context);
                aaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                c6Var = aaVar;
                break;
            case 3:
                View m4Var = new org.telegram.ui.Cells.m4(this.f35149c, org.telegram.ui.ActionBar.j6.L6, 21, 15, true, null);
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                z1Var = m4Var;
                c6Var = z1Var;
                break;
            case 4:
            case 9:
                View r8Var = new org.telegram.ui.Cells.r8(context);
                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                c6Var = r8Var;
                break;
            case 5:
                c6Var = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 6:
                View y8Var = new org.telegram.ui.Cells.y8(context, null, false);
                y8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                c6Var = y8Var;
                break;
            case 7:
                org.telegram.ui.Cells.c6 c6Var2 = new org.telegram.ui.Cells.c6(context, 0, null, null);
                c6Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                c6Var2.c(new n0(this, 4));
                c6Var = c6Var2;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                jqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.j6.f19852a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                jqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, false, false);
                jqVar.f35438f = k6Var;
                k6Var.setTypeface(AndroidUtilities.bold());
                jqVar.f35438f.setTextColor(-1);
                jqVar.f35438f.setTextSize(AndroidUtilities.dp(14.0f));
                jqVar.f35438f.setGravity(17);
                org.telegram.ui.Components.k6 k6Var2 = jqVar.f35438f;
                StringBuilder sb = new StringBuilder();
                b.i(R.string.AddBotButton, " ", sb);
                if (jqVar.H) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb.append(LocaleController.getString(i11));
                k6Var2.setText(sb.toString());
                jqVar.e.addView(jqVar.f35438f, k7.b6.e(-2, -2, 17));
                jqVar.e.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                jqVar.e.setOnClickListener(new a(this, 15));
                jqVar.d.addView(jqVar.e, k7.b6.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                jqVar.d.setLayoutParams(new f2.w0(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                jqVar.d.setClipChildren(false);
                jqVar.d.setClipToPadding(false);
                jqVar.d.addView(view, k7.b6.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                c6Var = jqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, this.f35149c, jqVar.getResourceProvider(), false);
                z1Var2.setPad(1);
                z1Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f19961g7, org.telegram.ui.ActionBar.j6.f20032k7);
                z1Var2.setEnabled(true);
                z1Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                z1Var = z1Var2;
                c6Var = z1Var;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.p2) jqVar).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.p2) jqVar).resourceProvider;
                c6Var = new org.telegram.ui.Components.f01(i12, -jqVar.f35453s, this.f35149c, f6Var);
                break;
        }
        return new f2.l1(c6Var);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        int b10 = l1Var.b();
        jq jqVar = this.e;
        if (b10 == jqVar.f35452r0) {
            jq.f0(jqVar, l1Var.f5785a);
        }
    }

    @Override
    public final void z(f2.l1 l1Var) {
        int b10 = l1Var.b();
        jq jqVar = this.e;
        if (b10 == jqVar.f35454s0 && jqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(jqVar.getParentActivity().getCurrentFocus());
        }
    }
}
