package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class aq extends org.telegram.ui.Components.im0 {
    public final Context f35405c;
    public boolean d;
    public final bq e;

    public aq(bq bqVar, Context context) {
        this.e = bqVar;
        if (bqVar.f35719y == 2) {
            C(true);
        }
        this.f35405c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        TLRPC.Chat chat;
        int i10 = b1Var.f45920f;
        bq bqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = bqVar.P;
        int i11 = bqVar.f35719y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = bqVar.N;
        if (!bqVar.f35715w.creator || ((i11 != 0 && (i11 != 2 || !bqVar.K)) || i10 != 4 || b1Var.b() != bqVar.f35694e0)) {
            if (bqVar.I) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = b1Var.b();
                    if (b10 == bqVar.W) {
                        if (!tL_chatAdminRights.add_admins && ((chat = bqVar.f35715w) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i11 != 2 || bqVar.K) {
                        if (b10 == bqVar.X) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !bqVar.E) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == bqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == bqVar.Z) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == bqVar.f35685a0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == bqVar.f35688b0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == bqVar.f35691c0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == bqVar.K0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == bqVar.f35693d0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == bqVar.f35694e0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == bqVar.f35696f0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == bqVar.f35697g0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == bqVar.f35698h0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == bqVar.f35699i0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == bqVar.m0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == bqVar.U0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == bqVar.V0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == bqVar.W0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == bqVar.f35704n0) {
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
        bq bqVar = this.e;
        if (bqVar.f35719y == 2) {
            if (i10 == bqVar.W) {
                return 1L;
            }
            if (i10 == bqVar.X) {
                return 2L;
            }
            if (i10 == bqVar.Y) {
                return 3L;
            }
            if (i10 == bqVar.f35688b0) {
                return 4L;
            }
            if (i10 == bqVar.f35691c0) {
                return 5L;
            }
            if (i10 == bqVar.f35693d0) {
                return 6L;
            }
            if (i10 == bqVar.f35694e0) {
                return 7L;
            }
            if (i10 == bqVar.f35696f0) {
                return 8L;
            }
            if (i10 == bqVar.f35697g0) {
                return 9L;
            }
            if (i10 == bqVar.f35698h0) {
                return 10L;
            }
            if (i10 == bqVar.f35705o0) {
                return 11L;
            }
            if (i10 == bqVar.f35706p0) {
                return 12L;
            }
            if (i10 == bqVar.f35707q0) {
                return 13L;
            }
            if (i10 == bqVar.f35709r0) {
                return 14L;
            }
            if (i10 == bqVar.f35711s0) {
                return 15L;
            }
            if (i10 == bqVar.f35712t0) {
                return 16L;
            }
            if (i10 == bqVar.f35713u0) {
                return 17L;
            }
            if (i10 == bqVar.f35714v0) {
                return 18L;
            }
            if (i10 == bqVar.f35716w0) {
                return 19L;
            }
            if (i10 == bqVar.f35720y0) {
                return 20L;
            }
            if (i10 == bqVar.B0) {
                return 21L;
            }
            if (i10 == bqVar.H0) {
                return 22L;
            }
            if (i10 == bqVar.I0) {
                return 23L;
            }
            if (i10 == bqVar.J0) {
                return 24L;
            }
            if (i10 == bqVar.K0) {
                return 25L;
            }
            if (i10 == bqVar.L0) {
                return 26L;
            }
            if (i10 == bqVar.M0) {
                return 27L;
            }
            if (i10 == bqVar.f35718x0) {
                return 28L;
            }
            if (i10 == bqVar.m0) {
                return 29L;
            }
            if (i10 == bqVar.C0) {
                return 30L;
            }
            if (i10 == bqVar.E0) {
                return 31L;
            }
            if (i10 == bqVar.D0) {
                return 32L;
            }
            if (i10 == bqVar.F0) {
                return 33L;
            }
            if (i10 == bqVar.G0) {
                return 34L;
            }
            if (i10 == bqVar.f35721z0) {
                return 35L;
            }
            if (i10 == bqVar.N0) {
                return 36L;
            }
            if (i10 == bqVar.P0) {
                return 37L;
            }
            if (i10 == bqVar.Q0) {
                return 38L;
            }
            if (i10 == bqVar.R0) {
                return 39L;
            }
            if (i10 == bqVar.S0) {
                return 40L;
            }
            if (i10 == bqVar.U0) {
                return 41L;
            }
            if (i10 == bqVar.V0) {
                return 42L;
            }
            if (i10 == bqVar.W0) {
                return 43L;
            }
            if (i10 == bqVar.Z) {
                return 44L;
            }
            if (i10 == bqVar.f35699i0) {
                return 45L;
            }
            if (i10 == bqVar.f35700j0) {
                return 46L;
            }
            if (i10 == bqVar.f35701k0) {
                return 47L;
            }
            if (i10 == bqVar.f35702l0) {
                return 48L;
            }
            if (i10 == bqVar.f35704n0) {
                return 49L;
            }
            if (i10 == bqVar.f35685a0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        bq bqVar = this.e;
        if (i10 != bqVar.H0 && i10 != bqVar.J0 && i10 != bqVar.I0 && i10 != bqVar.B0 && i10 != bqVar.C0 && i10 != bqVar.E0 && i10 != bqVar.D0 && i10 != bqVar.G0 && i10 != bqVar.F0 && i10 != bqVar.f35700j0 && i10 != bqVar.P0 && i10 != bqVar.Q0 && i10 != bqVar.R0 && i10 != bqVar.U0 && i10 != bqVar.V0 && i10 != bqVar.W0) {
            if (i10 != bqVar.f35721z0 && i10 != bqVar.N0 && i10 != bqVar.S0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != bqVar.f35705o0 && i10 != bqVar.f35707q0 && i10 != bqVar.L0 && i10 != bqVar.f35711s0) {
                    if (i10 != 2 && i10 != bqVar.f35713u0) {
                        if (i10 != bqVar.X && i10 != bqVar.Y && i10 != bqVar.Z && i10 != bqVar.f35688b0 && i10 != bqVar.f35691c0 && i10 != bqVar.f35693d0 && i10 != bqVar.f35696f0 && i10 != bqVar.f35697g0 && i10 != bqVar.f35698h0 && i10 != bqVar.f35699i0 && i10 != bqVar.f35720y0 && i10 != bqVar.f35694e0 && i10 != bqVar.K0 && i10 != bqVar.W && i10 != bqVar.m0 && i10 != bqVar.f35701k0 && i10 != bqVar.f35704n0 && i10 != bqVar.f35685a0) {
                            if (i10 == bqVar.f35709r0 || i10 == bqVar.f35716w0 || i10 == bqVar.f35702l0) {
                                return 1;
                            }
                            if (i10 == bqVar.M0) {
                                return 6;
                            }
                            if (i10 == bqVar.f35714v0) {
                                return 11;
                            }
                            if (i10 != bqVar.f35718x0) {
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
    public final void v(s4.b1 r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.aq.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.Cells.a2 a2Var;
        org.telegram.ui.Cells.c6 c6Var;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.f35405c;
        bq bqVar = this.e;
        switch (i10) {
            case 0:
                View uaVar = new org.telegram.ui.Cells.ua(context, null);
                uaVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
                c6Var = uaVar;
                break;
            case 1:
                c6Var = new org.telegram.ui.Cells.d9(context);
                break;
            case 2:
            default:
                View baVar = new org.telegram.ui.Cells.ba(context);
                baVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
                c6Var = baVar;
                break;
            case 3:
                View l4Var = new org.telegram.ui.Cells.l4(this.f35405c, org.telegram.ui.ActionBar.h6.L6, 21, 15, true, null);
                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
                a2Var = l4Var;
                c6Var = a2Var;
                break;
            case 4:
            case 9:
                View u8Var = new org.telegram.ui.Cells.u8(context);
                u8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
                c6Var = u8Var;
                break;
            case 5:
                c6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 6:
                View b9Var = new org.telegram.ui.Cells.b9(context, null, false);
                b9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
                c6Var = b9Var;
                break;
            case 7:
                org.telegram.ui.Cells.c6 c6Var2 = new org.telegram.ui.Cells.c6(context, 0, null, null);
                c6Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
                c6Var2.c(new o0(this, 4));
                c6Var = c6Var2;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                bqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.h6.f20932a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                bqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, false, false);
                bqVar.f35695f = q6Var;
                q6Var.setTypeface(AndroidUtilities.bold());
                bqVar.f35695f.setTextColor(-1);
                bqVar.f35695f.setTextSize(AndroidUtilities.dp(14.0f));
                bqVar.f35695f.setGravity(17);
                org.telegram.ui.Components.q6 q6Var2 = bqVar.f35695f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.n(R.string.AddBotButton, " ", sb2);
                if (bqVar.K) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb2.append(LocaleController.getString(i11));
                q6Var2.setText(sb2.toString());
                bqVar.e.addView(bqVar.f35695f, w7.z5.e(-2, -2, 17));
                bqVar.e.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                bqVar.e.setOnClickListener(new a(this, 15));
                bqVar.d.addView(bqVar.e, w7.z5.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                bqVar.d.setLayoutParams(new s4.o0(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                bqVar.d.setClipChildren(false);
                bqVar.d.setClipToPadding(false);
                bqVar.d.addView(view, w7.z5.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                c6Var = bqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, this.f35405c, bqVar.getResourceProvider(), false);
                a2Var2.setPad(1);
                a2Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.f21044g7, org.telegram.ui.ActionBar.h6.f21118k7);
                a2Var2.setEnabled(true);
                a2Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
                a2Var = a2Var2;
                c6Var = a2Var;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.n2) bqVar).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.n2) bqVar).resourceProvider;
                c6Var = new org.telegram.ui.Components.x01(i12, -bqVar.f35710s, this.f35405c, d6Var);
                break;
        }
        return new s4.b1(c6Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int b10 = b1Var.b();
        bq bqVar = this.e;
        if (b10 == bqVar.f35713u0) {
            bq.f0(bqVar, b1Var.f45917a);
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        int b10 = b1Var.b();
        bq bqVar = this.e;
        if (b10 == bqVar.f35714v0 && bqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(bqVar.getParentActivity().getCurrentFocus());
        }
    }
}
