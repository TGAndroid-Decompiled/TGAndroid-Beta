package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class oq extends org.telegram.ui.Components.kl0 {
    public final Context f36322c;
    public boolean d;
    public final pq e;

    public oq(pq pqVar, Context context) {
        this.e = pqVar;
        if (pqVar.f36666y == 2) {
            C(true);
        }
        this.f36322c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        TLRPC.Chat chat;
        int i10 = c1Var.f42674f;
        pq pqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = pqVar.P;
        int i11 = pqVar.f36666y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = pqVar.N;
        if (!pqVar.f36662w.creator || ((i11 != 0 && (i11 != 2 || !pqVar.K)) || i10 != 4 || c1Var.b() != pqVar.f36641e0)) {
            if (pqVar.I) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = c1Var.b();
                    if (b10 == pqVar.W) {
                        if (!tL_chatAdminRights.add_admins && ((chat = pqVar.f36662w) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i11 != 2 || pqVar.K) {
                        if (b10 == pqVar.X) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !pqVar.E) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == pqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == pqVar.Z) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == pqVar.f36632a0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == pqVar.f36635b0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == pqVar.f36638c0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == pqVar.K0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == pqVar.f36640d0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == pqVar.f36641e0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == pqVar.f36643f0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == pqVar.f36644g0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == pqVar.f36645h0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == pqVar.f36646i0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == pqVar.m0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == pqVar.U0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == pqVar.V0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == pqVar.W0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == pqVar.f36651n0) {
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
        pq pqVar = this.e;
        if (pqVar.f36666y == 2) {
            if (i10 == pqVar.W) {
                return 1L;
            }
            if (i10 == pqVar.X) {
                return 2L;
            }
            if (i10 == pqVar.Y) {
                return 3L;
            }
            if (i10 == pqVar.f36635b0) {
                return 4L;
            }
            if (i10 == pqVar.f36638c0) {
                return 5L;
            }
            if (i10 == pqVar.f36640d0) {
                return 6L;
            }
            if (i10 == pqVar.f36641e0) {
                return 7L;
            }
            if (i10 == pqVar.f36643f0) {
                return 8L;
            }
            if (i10 == pqVar.f36644g0) {
                return 9L;
            }
            if (i10 == pqVar.f36645h0) {
                return 10L;
            }
            if (i10 == pqVar.f36652o0) {
                return 11L;
            }
            if (i10 == pqVar.f36653p0) {
                return 12L;
            }
            if (i10 == pqVar.f36654q0) {
                return 13L;
            }
            if (i10 == pqVar.f36656r0) {
                return 14L;
            }
            if (i10 == pqVar.f36658s0) {
                return 15L;
            }
            if (i10 == pqVar.f36659t0) {
                return 16L;
            }
            if (i10 == pqVar.f36660u0) {
                return 17L;
            }
            if (i10 == pqVar.f36661v0) {
                return 18L;
            }
            if (i10 == pqVar.f36663w0) {
                return 19L;
            }
            if (i10 == pqVar.f36667y0) {
                return 20L;
            }
            if (i10 == pqVar.B0) {
                return 21L;
            }
            if (i10 == pqVar.H0) {
                return 22L;
            }
            if (i10 == pqVar.I0) {
                return 23L;
            }
            if (i10 == pqVar.J0) {
                return 24L;
            }
            if (i10 == pqVar.K0) {
                return 25L;
            }
            if (i10 == pqVar.L0) {
                return 26L;
            }
            if (i10 == pqVar.M0) {
                return 27L;
            }
            if (i10 == pqVar.f36665x0) {
                return 28L;
            }
            if (i10 == pqVar.m0) {
                return 29L;
            }
            if (i10 == pqVar.C0) {
                return 30L;
            }
            if (i10 == pqVar.E0) {
                return 31L;
            }
            if (i10 == pqVar.D0) {
                return 32L;
            }
            if (i10 == pqVar.F0) {
                return 33L;
            }
            if (i10 == pqVar.G0) {
                return 34L;
            }
            if (i10 == pqVar.f36668z0) {
                return 35L;
            }
            if (i10 == pqVar.N0) {
                return 36L;
            }
            if (i10 == pqVar.P0) {
                return 37L;
            }
            if (i10 == pqVar.Q0) {
                return 38L;
            }
            if (i10 == pqVar.R0) {
                return 39L;
            }
            if (i10 == pqVar.S0) {
                return 40L;
            }
            if (i10 == pqVar.U0) {
                return 41L;
            }
            if (i10 == pqVar.V0) {
                return 42L;
            }
            if (i10 == pqVar.W0) {
                return 43L;
            }
            if (i10 == pqVar.Z) {
                return 44L;
            }
            if (i10 == pqVar.f36646i0) {
                return 45L;
            }
            if (i10 == pqVar.f36647j0) {
                return 46L;
            }
            if (i10 == pqVar.f36648k0) {
                return 47L;
            }
            if (i10 == pqVar.f36649l0) {
                return 48L;
            }
            if (i10 == pqVar.f36651n0) {
                return 49L;
            }
            if (i10 == pqVar.f36632a0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        pq pqVar = this.e;
        if (i10 != pqVar.H0 && i10 != pqVar.J0 && i10 != pqVar.I0 && i10 != pqVar.B0 && i10 != pqVar.C0 && i10 != pqVar.E0 && i10 != pqVar.D0 && i10 != pqVar.G0 && i10 != pqVar.F0 && i10 != pqVar.f36647j0 && i10 != pqVar.P0 && i10 != pqVar.Q0 && i10 != pqVar.R0 && i10 != pqVar.U0 && i10 != pqVar.V0 && i10 != pqVar.W0) {
            if (i10 != pqVar.f36668z0 && i10 != pqVar.N0 && i10 != pqVar.S0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != pqVar.f36652o0 && i10 != pqVar.f36654q0 && i10 != pqVar.L0 && i10 != pqVar.f36658s0) {
                    if (i10 != 2 && i10 != pqVar.f36660u0) {
                        if (i10 != pqVar.X && i10 != pqVar.Y && i10 != pqVar.Z && i10 != pqVar.f36635b0 && i10 != pqVar.f36638c0 && i10 != pqVar.f36640d0 && i10 != pqVar.f36643f0 && i10 != pqVar.f36644g0 && i10 != pqVar.f36645h0 && i10 != pqVar.f36646i0 && i10 != pqVar.f36667y0 && i10 != pqVar.f36641e0 && i10 != pqVar.K0 && i10 != pqVar.W && i10 != pqVar.m0 && i10 != pqVar.f36648k0 && i10 != pqVar.f36651n0 && i10 != pqVar.f36632a0) {
                            if (i10 == pqVar.f36656r0 || i10 == pqVar.f36663w0 || i10 == pqVar.f36649l0) {
                                return 1;
                            }
                            if (i10 == pqVar.M0) {
                                return 6;
                            }
                            if (i10 == pqVar.f36661v0) {
                                return 11;
                            }
                            if (i10 != pqVar.f36665x0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oq.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.Cells.z1 z1Var;
        org.telegram.ui.Cells.d6 d6Var;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = this.f36322c;
        pq pqVar = this.e;
        switch (i10) {
            case 0:
                View zaVar = new org.telegram.ui.Cells.za(context, null);
                zaVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
                d6Var = zaVar;
                break;
            case 1:
                d6Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
            default:
                View eaVar = new org.telegram.ui.Cells.ea(context);
                eaVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
                d6Var = eaVar;
                break;
            case 3:
                View m4Var = new org.telegram.ui.Cells.m4(this.f36322c, org.telegram.ui.ActionBar.i6.L6, 21, 15, true, null);
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
                z1Var = m4Var;
                d6Var = z1Var;
                break;
            case 4:
            case 9:
                View v8Var = new org.telegram.ui.Cells.v8(context);
                v8Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
                d6Var = v8Var;
                break;
            case 5:
                d6Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                break;
            case 6:
                View c9Var = new org.telegram.ui.Cells.c9(context, null, false);
                c9Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
                d6Var = c9Var;
                break;
            case 7:
                org.telegram.ui.Cells.d6 d6Var2 = new org.telegram.ui.Cells.d6(context, 0, null, null);
                d6Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
                d6Var2.c(new l0(this, 4));
                d6Var = d6Var2;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                pqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.i6.f18778a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
                pqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, false, false);
                pqVar.f36642f = n6Var;
                n6Var.setTypeface(AndroidUtilities.bold());
                pqVar.f36642f.setTextColor(-1);
                pqVar.f36642f.setTextSize(AndroidUtilities.dp(14.0f));
                pqVar.f36642f.setGravity(17);
                org.telegram.ui.Components.n6 n6Var2 = pqVar.f36642f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.vl.m(R.string.AddBotButton, " ", sb2);
                if (pqVar.K) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb2.append(LocaleController.getString(i11));
                n6Var2.setText(sb2.toString());
                pqVar.e.addView(pqVar.f36642f, w7.x5.e(-2, -2, 17));
                pqVar.e.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.Oh));
                pqVar.e.setOnClickListener(new a(this, 15));
                pqVar.d.addView(pqVar.e, w7.x5.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                pqVar.d.setLayoutParams(new s4.p0(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
                pqVar.d.setClipChildren(false);
                pqVar.d.setClipToPadding(false);
                pqVar.d.addView(view, w7.x5.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                d6Var = pqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, this.f36322c, pqVar.getResourceProvider(), false);
                z1Var2.setPad(1);
                z1Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.i6.V6, org.telegram.ui.ActionBar.i6.f18889g7, org.telegram.ui.ActionBar.i6.f18962k7);
                z1Var2.setEnabled(true);
                z1Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
                z1Var = z1Var2;
                d6Var = z1Var;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.n2) pqVar).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.n2) pqVar).resourceProvider;
                d6Var = new org.telegram.ui.Components.b01(i12, -pqVar.f36657s, this.f36322c, e6Var);
                break;
        }
        return new s4.c1(d6Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int b10 = c1Var.b();
        pq pqVar = this.e;
        if (b10 == pqVar.f36660u0) {
            pq.f0(pqVar, c1Var.f42671a);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int b10 = c1Var.b();
        pq pqVar = this.e;
        if (b10 == pqVar.f36661v0 && pqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(pqVar.getParentActivity().getCurrentFocus());
        }
    }
}
