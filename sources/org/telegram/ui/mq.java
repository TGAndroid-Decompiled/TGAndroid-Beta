package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mq extends org.telegram.ui.Components.qm0 {
    public final Context f40007c;
    public boolean d;
    public final nq f40008e;

    public mq(nq nqVar, Context context) {
        this.f40008e = nqVar;
        if (nqVar.f40391y == 2) {
            C(true);
        }
        this.f40007c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        TLRPC.Chat chat;
        int i10 = d1Var.f47706f;
        nq nqVar = this.f40008e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = nqVar.P;
        int i11 = nqVar.f40391y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = nqVar.N;
        if (!nqVar.f40387w.creator || ((i11 != 0 && (i11 != 2 || !nqVar.K)) || i10 != 4 || d1Var.b() != nqVar.f40366e0)) {
            if (nqVar.I) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = d1Var.b();
                    if (b10 == nqVar.W) {
                        if (!tL_chatAdminRights.add_admins && ((chat = nqVar.f40387w) == null || !chat.creator)) {
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
                            if (b10 == nqVar.f40356a0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == nqVar.f40359b0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == nqVar.f40362c0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == nqVar.K0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == nqVar.f40364d0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == nqVar.f40366e0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == nqVar.f40368f0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == nqVar.f40369g0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == nqVar.f40370h0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == nqVar.f40371i0) {
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
                                if (b10 == nqVar.f40376n0) {
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
        return this.f40008e.V;
    }

    @Override
    public final long i(int i10) {
        nq nqVar = this.f40008e;
        if (nqVar.f40391y == 2) {
            if (i10 == nqVar.W) {
                return 1L;
            }
            if (i10 == nqVar.X) {
                return 2L;
            }
            if (i10 == nqVar.Y) {
                return 3L;
            }
            if (i10 == nqVar.f40359b0) {
                return 4L;
            }
            if (i10 == nqVar.f40362c0) {
                return 5L;
            }
            if (i10 == nqVar.f40364d0) {
                return 6L;
            }
            if (i10 == nqVar.f40366e0) {
                return 7L;
            }
            if (i10 == nqVar.f40368f0) {
                return 8L;
            }
            if (i10 == nqVar.f40369g0) {
                return 9L;
            }
            if (i10 == nqVar.f40370h0) {
                return 10L;
            }
            if (i10 == nqVar.f40377o0) {
                return 11L;
            }
            if (i10 == nqVar.f40378p0) {
                return 12L;
            }
            if (i10 == nqVar.f40379q0) {
                return 13L;
            }
            if (i10 == nqVar.f40381r0) {
                return 14L;
            }
            if (i10 == nqVar.f40383s0) {
                return 15L;
            }
            if (i10 == nqVar.f40384t0) {
                return 16L;
            }
            if (i10 == nqVar.f40385u0) {
                return 17L;
            }
            if (i10 == nqVar.f40386v0) {
                return 18L;
            }
            if (i10 == nqVar.f40388w0) {
                return 19L;
            }
            if (i10 == nqVar.f40392y0) {
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
            if (i10 == nqVar.f40390x0) {
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
            if (i10 == nqVar.f40393z0) {
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
            if (i10 == nqVar.f40371i0) {
                return 45L;
            }
            if (i10 == nqVar.f40372j0) {
                return 46L;
            }
            if (i10 == nqVar.f40373k0) {
                return 47L;
            }
            if (i10 == nqVar.f40374l0) {
                return 48L;
            }
            if (i10 == nqVar.f40376n0) {
                return 49L;
            }
            if (i10 == nqVar.f40356a0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        nq nqVar = this.f40008e;
        if (i10 != nqVar.H0 && i10 != nqVar.J0 && i10 != nqVar.I0 && i10 != nqVar.B0 && i10 != nqVar.C0 && i10 != nqVar.E0 && i10 != nqVar.D0 && i10 != nqVar.G0 && i10 != nqVar.F0 && i10 != nqVar.f40372j0 && i10 != nqVar.P0 && i10 != nqVar.Q0 && i10 != nqVar.R0 && i10 != nqVar.U0 && i10 != nqVar.V0 && i10 != nqVar.W0) {
            if (i10 != nqVar.f40393z0 && i10 != nqVar.N0 && i10 != nqVar.S0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != nqVar.f40377o0 && i10 != nqVar.f40379q0 && i10 != nqVar.L0 && i10 != nqVar.f40383s0) {
                    if (i10 != 2 && i10 != nqVar.f40385u0) {
                        if (i10 != nqVar.X && i10 != nqVar.Y && i10 != nqVar.Z && i10 != nqVar.f40359b0 && i10 != nqVar.f40362c0 && i10 != nqVar.f40364d0 && i10 != nqVar.f40368f0 && i10 != nqVar.f40369g0 && i10 != nqVar.f40370h0 && i10 != nqVar.f40371i0 && i10 != nqVar.f40392y0 && i10 != nqVar.f40366e0 && i10 != nqVar.K0 && i10 != nqVar.W && i10 != nqVar.m0 && i10 != nqVar.f40373k0 && i10 != nqVar.f40376n0 && i10 != nqVar.f40356a0) {
                            if (i10 == nqVar.f40381r0 || i10 == nqVar.f40388w0 || i10 == nqVar.f40374l0) {
                                return 1;
                            }
                            if (i10 == nqVar.M0) {
                                return 6;
                            }
                            if (i10 == nqVar.f40386v0) {
                                return 11;
                            }
                            if (i10 != nqVar.f40390x0) {
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
    public final void v(s4.d1 r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mq.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.Cells.a2 a2Var;
        org.telegram.ui.Cells.d6 d6Var;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = this.f40007c;
        nq nqVar = this.f40008e;
        switch (i10) {
            case 0:
                View waVar = new org.telegram.ui.Cells.wa(context, null);
                waVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
                d6Var = waVar;
                break;
            case 1:
                d6Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
            default:
                View caVar = new org.telegram.ui.Cells.ca(context);
                caVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
                d6Var = caVar;
                break;
            case 3:
                View m4Var = new org.telegram.ui.Cells.m4(this.f40007c, org.telegram.ui.ActionBar.i6.L6, 21, 15, true, null);
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
                a2Var = m4Var;
                d6Var = a2Var;
                break;
            case 4:
            case 9:
                View v8Var = new org.telegram.ui.Cells.v8(context);
                v8Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
                d6Var = v8Var;
                break;
            case 5:
                d6Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 6:
                View c9Var = new org.telegram.ui.Cells.c9(context, null, false);
                c9Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
                d6Var = c9Var;
                break;
            case 7:
                org.telegram.ui.Cells.d6 d6Var2 = new org.telegram.ui.Cells.d6(context, 0, null, null);
                d6Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
                d6Var2.c(new m0(this, 4));
                d6Var = d6Var2;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                nqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.i6.f20745a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
                nqVar.f40365e = new FrameLayout(context);
                org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, true, false, false);
                nqVar.f40367f = r6Var;
                r6Var.setTypeface(AndroidUtilities.bold());
                nqVar.f40367f.setTextColor(-1);
                nqVar.f40367f.setTextSize(AndroidUtilities.dp(14.0f));
                nqVar.f40367f.setGravity(17);
                org.telegram.ui.Components.r6 r6Var2 = nqVar.f40367f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.l(R.string.AddBotButton, " ", sb2);
                if (nqVar.K) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb2.append(LocaleController.getString(i11));
                r6Var2.setText(sb2.toString());
                nqVar.f40365e.addView(nqVar.f40367f, w7.x5.e(-2, -2, 17));
                nqVar.f40365e.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.Oh));
                nqVar.f40365e.setOnClickListener(new a(this, 14));
                nqVar.d.addView(nqVar.f40365e, w7.x5.a(48.0f, 14.0f, 28.0f, 14.0f, 14.0f, -1, 119));
                nqVar.d.setLayoutParams(new s4.q0(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
                nqVar.d.setClipChildren(false);
                nqVar.d.setClipToPadding(false);
                nqVar.d.addView(view, w7.x5.a(800.0f, 0.0f, 0.0f, 0.0f, -800.0f, -1, 87));
                d6Var = nqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, this.f40007c, nqVar.getResourceProvider(), false);
                a2Var2.setPad(1);
                a2Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.i6.V6, org.telegram.ui.ActionBar.i6.f20858g7, org.telegram.ui.ActionBar.i6.f20930k7);
                a2Var2.setEnabled(true);
                a2Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
                a2Var = a2Var2;
                d6Var = a2Var;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.n2) nqVar).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.n2) nqVar).resourceProvider;
                d6Var = new org.telegram.ui.Components.e11(i12, -nqVar.f40382s, this.f40007c, e6Var);
                break;
        }
        return new s4.d1(d6Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        int b10 = d1Var.b();
        nq nqVar = this.f40008e;
        if (b10 == nqVar.f40385u0) {
            nq.f0(nqVar, d1Var.f47702a);
        }
    }

    @Override
    public final void z(s4.d1 d1Var) {
        int b10 = d1Var.b();
        nq nqVar = this.f40008e;
        if (b10 == nqVar.f40386v0 && nqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(nqVar.getParentActivity().getCurrentFocus());
        }
    }
}
