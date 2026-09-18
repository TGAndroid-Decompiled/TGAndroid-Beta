package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mq extends org.telegram.ui.Components.vl0 {
    public final Context f35709c;
    public boolean d;
    public final nq e;

    public mq(nq nqVar, Context context) {
        this.e = nqVar;
        if (nqVar.f36034y == 2) {
            C(true);
        }
        this.f35709c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        TLRPC.Chat chat;
        int i10 = c1Var.f42932f;
        nq nqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = nqVar.P;
        int i11 = nqVar.f36034y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = nqVar.N;
        if (!nqVar.f36030w.creator || ((i11 != 0 && (i11 != 2 || !nqVar.K)) || i10 != 4 || c1Var.b() != nqVar.f36009e0)) {
            if (nqVar.I) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = c1Var.b();
                    if (b10 == nqVar.W) {
                        if (!tL_chatAdminRights.add_admins && ((chat = nqVar.f36030w) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i11 != 2 || nqVar.K) {
                        if (b10 == nqVar.X) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !nqVar.E) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == nqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == nqVar.Z) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == nqVar.f36000a0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == nqVar.f36003b0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == nqVar.f36006c0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == nqVar.K0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == nqVar.f36008d0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == nqVar.f36009e0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == nqVar.f36011f0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == nqVar.f36012g0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == nqVar.f36013h0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == nqVar.f36014i0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == nqVar.m0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == nqVar.U0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == nqVar.V0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == nqVar.W0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == nqVar.f36019n0) {
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
        nq nqVar = this.e;
        if (nqVar.f36034y == 2) {
            if (i10 == nqVar.W) {
                return 1L;
            }
            if (i10 == nqVar.X) {
                return 2L;
            }
            if (i10 == nqVar.Y) {
                return 3L;
            }
            if (i10 == nqVar.f36003b0) {
                return 4L;
            }
            if (i10 == nqVar.f36006c0) {
                return 5L;
            }
            if (i10 == nqVar.f36008d0) {
                return 6L;
            }
            if (i10 == nqVar.f36009e0) {
                return 7L;
            }
            if (i10 == nqVar.f36011f0) {
                return 8L;
            }
            if (i10 == nqVar.f36012g0) {
                return 9L;
            }
            if (i10 == nqVar.f36013h0) {
                return 10L;
            }
            if (i10 == nqVar.f36020o0) {
                return 11L;
            }
            if (i10 == nqVar.f36021p0) {
                return 12L;
            }
            if (i10 == nqVar.f36022q0) {
                return 13L;
            }
            if (i10 == nqVar.f36024r0) {
                return 14L;
            }
            if (i10 == nqVar.f36026s0) {
                return 15L;
            }
            if (i10 == nqVar.f36027t0) {
                return 16L;
            }
            if (i10 == nqVar.f36028u0) {
                return 17L;
            }
            if (i10 == nqVar.f36029v0) {
                return 18L;
            }
            if (i10 == nqVar.f36031w0) {
                return 19L;
            }
            if (i10 == nqVar.f36035y0) {
                return 20L;
            }
            if (i10 == nqVar.B0) {
                return 21L;
            }
            if (i10 == nqVar.H0) {
                return 22L;
            }
            if (i10 == nqVar.I0) {
                return 23L;
            }
            if (i10 == nqVar.J0) {
                return 24L;
            }
            if (i10 == nqVar.K0) {
                return 25L;
            }
            if (i10 == nqVar.L0) {
                return 26L;
            }
            if (i10 == nqVar.M0) {
                return 27L;
            }
            if (i10 == nqVar.f36033x0) {
                return 28L;
            }
            if (i10 == nqVar.m0) {
                return 29L;
            }
            if (i10 == nqVar.C0) {
                return 30L;
            }
            if (i10 == nqVar.E0) {
                return 31L;
            }
            if (i10 == nqVar.D0) {
                return 32L;
            }
            if (i10 == nqVar.F0) {
                return 33L;
            }
            if (i10 == nqVar.G0) {
                return 34L;
            }
            if (i10 == nqVar.f36036z0) {
                return 35L;
            }
            if (i10 == nqVar.N0) {
                return 36L;
            }
            if (i10 == nqVar.P0) {
                return 37L;
            }
            if (i10 == nqVar.Q0) {
                return 38L;
            }
            if (i10 == nqVar.R0) {
                return 39L;
            }
            if (i10 == nqVar.S0) {
                return 40L;
            }
            if (i10 == nqVar.U0) {
                return 41L;
            }
            if (i10 == nqVar.V0) {
                return 42L;
            }
            if (i10 == nqVar.W0) {
                return 43L;
            }
            if (i10 == nqVar.Z) {
                return 44L;
            }
            if (i10 == nqVar.f36014i0) {
                return 45L;
            }
            if (i10 == nqVar.f36015j0) {
                return 46L;
            }
            if (i10 == nqVar.f36016k0) {
                return 47L;
            }
            if (i10 == nqVar.f36017l0) {
                return 48L;
            }
            if (i10 == nqVar.f36019n0) {
                return 49L;
            }
            if (i10 == nqVar.f36000a0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        nq nqVar = this.e;
        if (i10 != nqVar.H0 && i10 != nqVar.J0 && i10 != nqVar.I0 && i10 != nqVar.B0 && i10 != nqVar.C0 && i10 != nqVar.E0 && i10 != nqVar.D0 && i10 != nqVar.G0 && i10 != nqVar.F0 && i10 != nqVar.f36015j0 && i10 != nqVar.P0 && i10 != nqVar.Q0 && i10 != nqVar.R0 && i10 != nqVar.U0 && i10 != nqVar.V0 && i10 != nqVar.W0) {
            if (i10 != nqVar.f36036z0 && i10 != nqVar.N0 && i10 != nqVar.S0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != nqVar.f36020o0 && i10 != nqVar.f36022q0 && i10 != nqVar.L0 && i10 != nqVar.f36026s0) {
                    if (i10 != 2 && i10 != nqVar.f36028u0) {
                        if (i10 != nqVar.X && i10 != nqVar.Y && i10 != nqVar.Z && i10 != nqVar.f36003b0 && i10 != nqVar.f36006c0 && i10 != nqVar.f36008d0 && i10 != nqVar.f36011f0 && i10 != nqVar.f36012g0 && i10 != nqVar.f36013h0 && i10 != nqVar.f36014i0 && i10 != nqVar.f36035y0 && i10 != nqVar.f36009e0 && i10 != nqVar.K0 && i10 != nqVar.W && i10 != nqVar.m0 && i10 != nqVar.f36016k0 && i10 != nqVar.f36019n0 && i10 != nqVar.f36000a0) {
                            if (i10 == nqVar.f36024r0 || i10 == nqVar.f36031w0 || i10 == nqVar.f36017l0) {
                                return 1;
                            }
                            if (i10 == nqVar.M0) {
                                return 6;
                            }
                            if (i10 == nqVar.f36029v0) {
                                return 11;
                            }
                            if (i10 != nqVar.f36033x0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mq.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.Cells.a2 a2Var;
        org.telegram.ui.Cells.d6 d6Var;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = this.f35709c;
        nq nqVar = this.e;
        switch (i10) {
            case 0:
                View yaVar = new org.telegram.ui.Cells.ya(context, null);
                yaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false));
                d6Var = yaVar;
                break;
            case 1:
                d6Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
            default:
                View eaVar = new org.telegram.ui.Cells.ea(context);
                eaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false));
                d6Var = eaVar;
                break;
            case 3:
                View m4Var = new org.telegram.ui.Cells.m4(this.f35709c, org.telegram.ui.ActionBar.j6.L6, 21, 15, true, null);
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false));
                a2Var = m4Var;
                d6Var = a2Var;
                break;
            case 4:
            case 9:
                View v8Var = new org.telegram.ui.Cells.v8(context);
                v8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false));
                d6Var = v8Var;
                break;
            case 5:
                d6Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 6:
                View c9Var = new org.telegram.ui.Cells.c9(context, null, false);
                c9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false));
                d6Var = c9Var;
                break;
            case 7:
                org.telegram.ui.Cells.d6 d6Var2 = new org.telegram.ui.Cells.d6(context, 0, null, null);
                d6Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false));
                d6Var2.c(new l0(this, 4));
                d6Var = d6Var2;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                nqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.j6.f19006a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                nqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, false, false);
                nqVar.f36010f = p6Var;
                p6Var.setTypeface(AndroidUtilities.bold());
                nqVar.f36010f.setTextColor(-1);
                nqVar.f36010f.setTextSize(AndroidUtilities.dp(14.0f));
                nqVar.f36010f.setGravity(17);
                org.telegram.ui.Components.p6 p6Var2 = nqVar.f36010f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.l(R.string.AddBotButton, " ", sb2);
                if (nqVar.K) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb2.append(LocaleController.getString(i11));
                p6Var2.setText(sb2.toString());
                nqVar.e.addView(nqVar.f36010f, w7.y5.e(-2, -2, 17));
                nqVar.e.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                nqVar.e.setOnClickListener(new a(this, 15));
                nqVar.d.addView(nqVar.e, w7.y5.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                nqVar.d.setLayoutParams(new s4.p0(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                nqVar.d.setClipChildren(false);
                nqVar.d.setClipToPadding(false);
                nqVar.d.addView(view, w7.y5.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                d6Var = nqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, this.f35709c, nqVar.getResourceProvider(), false);
                a2Var2.setPad(1);
                a2Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f19117g7, org.telegram.ui.ActionBar.j6.f19191k7);
                a2Var2.setEnabled(true);
                a2Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false));
                a2Var = a2Var2;
                d6Var = a2Var;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.n2) nqVar).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.n2) nqVar).resourceProvider;
                d6Var = new org.telegram.ui.Components.n01(i12, -nqVar.f36025s, this.f35709c, e6Var);
                break;
        }
        return new s4.c1(d6Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int b10 = c1Var.b();
        nq nqVar = this.e;
        if (b10 == nqVar.f36028u0) {
            nq.f0(nqVar, c1Var.f42929a);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int b10 = c1Var.b();
        nq nqVar = this.e;
        if (b10 == nqVar.f36029v0 && nqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(nqVar.getParentActivity().getCurrentFocus());
        }
    }
}
