package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class cq extends org.telegram.ui.Components.il0 {
    public final Context f37191c;
    public boolean d;
    public final dq f37192e;

    public cq(dq dqVar, Context context) {
        this.f37192e = dqVar;
        if (dqVar.f37606y == 2) {
            C(true);
        }
        this.f37191c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        TLRPC.Chat chat;
        int i10 = n1Var.f6436f;
        dq dqVar = this.f37192e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = dqVar.L;
        int i11 = dqVar.f37606y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = dqVar.J;
        if (!dqVar.f37602w.creator || ((i11 != 0 && (i11 != 2 || !dqVar.G)) || i10 != 4 || n1Var.b() != dqVar.f37574a0)) {
            if (dqVar.E) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = n1Var.b();
                    if (b10 == dqVar.S) {
                        if (!tL_chatAdminRights.add_admins && ((chat = dqVar.f37602w) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i11 != 2 || dqVar.G) {
                        if (b10 == dqVar.T) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !dqVar.A) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == dqVar.U) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == dqVar.V) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == dqVar.W) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == dqVar.X) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == dqVar.Y) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == dqVar.G0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == dqVar.Z) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == dqVar.f37574a0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == dqVar.f37576b0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == dqVar.f37578c0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == dqVar.f37579d0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == dqVar.f37581e0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == dqVar.f37586i0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == dqVar.Q0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == dqVar.R0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == dqVar.S0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == dqVar.f37587j0) {
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
        return this.f37192e.R;
    }

    @Override
    public final long i(int i10) {
        dq dqVar = this.f37192e;
        if (dqVar.f37606y == 2) {
            if (i10 == dqVar.S) {
                return 1L;
            }
            if (i10 == dqVar.T) {
                return 2L;
            }
            if (i10 == dqVar.U) {
                return 3L;
            }
            if (i10 == dqVar.X) {
                return 4L;
            }
            if (i10 == dqVar.Y) {
                return 5L;
            }
            if (i10 == dqVar.Z) {
                return 6L;
            }
            if (i10 == dqVar.f37574a0) {
                return 7L;
            }
            if (i10 == dqVar.f37576b0) {
                return 8L;
            }
            if (i10 == dqVar.f37578c0) {
                return 9L;
            }
            if (i10 == dqVar.f37579d0) {
                return 10L;
            }
            if (i10 == dqVar.f37588k0) {
                return 11L;
            }
            if (i10 == dqVar.f37589l0) {
                return 12L;
            }
            if (i10 == dqVar.m0) {
                return 13L;
            }
            if (i10 == dqVar.f37591n0) {
                return 14L;
            }
            if (i10 == dqVar.f37592o0) {
                return 15L;
            }
            if (i10 == dqVar.f37593p0) {
                return 16L;
            }
            if (i10 == dqVar.f37594q0) {
                return 17L;
            }
            if (i10 == dqVar.f37596r0) {
                return 18L;
            }
            if (i10 == dqVar.f37598s0) {
                return 19L;
            }
            if (i10 == dqVar.f37600u0) {
                return 20L;
            }
            if (i10 == dqVar.f37605x0) {
                return 21L;
            }
            if (i10 == dqVar.D0) {
                return 22L;
            }
            if (i10 == dqVar.E0) {
                return 23L;
            }
            if (i10 == dqVar.F0) {
                return 24L;
            }
            if (i10 == dqVar.G0) {
                return 25L;
            }
            if (i10 == dqVar.H0) {
                return 26L;
            }
            if (i10 == dqVar.I0) {
                return 27L;
            }
            if (i10 == dqVar.f37599t0) {
                return 28L;
            }
            if (i10 == dqVar.f37586i0) {
                return 29L;
            }
            if (i10 == dqVar.f37607y0) {
                return 30L;
            }
            if (i10 == dqVar.A0) {
                return 31L;
            }
            if (i10 == dqVar.f37608z0) {
                return 32L;
            }
            if (i10 == dqVar.B0) {
                return 33L;
            }
            if (i10 == dqVar.C0) {
                return 34L;
            }
            if (i10 == dqVar.f37601v0) {
                return 35L;
            }
            if (i10 == dqVar.J0) {
                return 36L;
            }
            if (i10 == dqVar.L0) {
                return 37L;
            }
            if (i10 == dqVar.M0) {
                return 38L;
            }
            if (i10 == dqVar.N0) {
                return 39L;
            }
            if (i10 == dqVar.O0) {
                return 40L;
            }
            if (i10 == dqVar.Q0) {
                return 41L;
            }
            if (i10 == dqVar.R0) {
                return 42L;
            }
            if (i10 == dqVar.S0) {
                return 43L;
            }
            if (i10 == dqVar.V) {
                return 44L;
            }
            if (i10 == dqVar.f37581e0) {
                return 45L;
            }
            if (i10 == dqVar.f37583f0) {
                return 46L;
            }
            if (i10 == dqVar.f37584g0) {
                return 47L;
            }
            if (i10 == dqVar.f37585h0) {
                return 48L;
            }
            if (i10 == dqVar.f37587j0) {
                return 49L;
            }
            if (i10 == dqVar.W) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        dq dqVar = this.f37192e;
        if (i10 != dqVar.D0 && i10 != dqVar.F0 && i10 != dqVar.E0 && i10 != dqVar.f37605x0 && i10 != dqVar.f37607y0 && i10 != dqVar.A0 && i10 != dqVar.f37608z0 && i10 != dqVar.C0 && i10 != dqVar.B0 && i10 != dqVar.f37583f0 && i10 != dqVar.L0 && i10 != dqVar.M0 && i10 != dqVar.N0 && i10 != dqVar.Q0 && i10 != dqVar.R0 && i10 != dqVar.S0) {
            if (i10 != dqVar.f37601v0 && i10 != dqVar.J0 && i10 != dqVar.O0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != dqVar.f37588k0 && i10 != dqVar.m0 && i10 != dqVar.H0 && i10 != dqVar.f37592o0) {
                    if (i10 != 2 && i10 != dqVar.f37594q0) {
                        if (i10 != dqVar.T && i10 != dqVar.U && i10 != dqVar.V && i10 != dqVar.X && i10 != dqVar.Y && i10 != dqVar.Z && i10 != dqVar.f37576b0 && i10 != dqVar.f37578c0 && i10 != dqVar.f37579d0 && i10 != dqVar.f37581e0 && i10 != dqVar.f37600u0 && i10 != dqVar.f37574a0 && i10 != dqVar.G0 && i10 != dqVar.S && i10 != dqVar.f37586i0 && i10 != dqVar.f37584g0 && i10 != dqVar.f37587j0 && i10 != dqVar.W) {
                            if (i10 == dqVar.f37591n0 || i10 == dqVar.f37598s0 || i10 == dqVar.f37585h0) {
                                return 1;
                            }
                            if (i10 == dqVar.I0) {
                                return 6;
                            }
                            if (i10 == dqVar.f37596r0) {
                                return 11;
                            }
                            if (i10 != dqVar.f37599t0) {
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
    public final void v(f2.n1 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cq.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.Cells.y1 y1Var;
        org.telegram.ui.Cells.a6 a6Var;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = this.f37191c;
        dq dqVar = this.f37192e;
        switch (i10) {
            case 0:
                View raVar = new org.telegram.ui.Cells.ra(context, null);
                raVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                a6Var = raVar;
                break;
            case 1:
                a6Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 2:
            default:
                View y9Var = new org.telegram.ui.Cells.y9(context);
                y9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                a6Var = y9Var;
                break;
            case 3:
                View k4Var = new org.telegram.ui.Cells.k4(this.f37191c, org.telegram.ui.ActionBar.g6.L6, 21, 15, true, null);
                k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                y1Var = k4Var;
                a6Var = y1Var;
                break;
            case 4:
            case 9:
                View p8Var = new org.telegram.ui.Cells.p8(context);
                p8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                a6Var = p8Var;
                break;
            case 5:
                a6Var = new org.telegram.ui.Cells.x6(context, (b) null);
                break;
            case 6:
                View w8Var = new org.telegram.ui.Cells.w8(context, null, false);
                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                a6Var = w8Var;
                break;
            case 7:
                org.telegram.ui.Cells.a6 a6Var2 = new org.telegram.ui.Cells.a6(context, 0, null, null);
                a6Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                a6Var2.b(new p0(this, 4));
                a6Var = a6Var2;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                dqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.g6.f23009a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                dqVar.f37580e = new FrameLayout(context);
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, false, false);
                dqVar.f37582f = o6Var;
                o6Var.setTypeface(AndroidUtilities.bold());
                dqVar.f37582f.setTextColor(-1);
                dqVar.f37582f.setTextSize(AndroidUtilities.dp(14.0f));
                dqVar.f37582f.setGravity(17);
                org.telegram.ui.Components.o6 o6Var2 = dqVar.f37582f;
                StringBuilder sb2 = new StringBuilder();
                b.j(R.string.AddBotButton, " ", sb2);
                if (dqVar.G) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb2.append(LocaleController.getString(i11));
                o6Var2.setText(sb2.toString());
                dqVar.f37580e.addView(dqVar.f37582f, i7.f6.e(-2, -2, 17));
                dqVar.f37580e.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                dqVar.f37580e.setOnClickListener(new a(this, 15));
                dqVar.d.addView(dqVar.f37580e, i7.f6.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                dqVar.d.setLayoutParams(new f2.x0(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                dqVar.d.setClipChildren(false);
                dqVar.d.setClipToPadding(false);
                dqVar.d.addView(view, i7.f6.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                a6Var = dqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(4, 21, this.f37191c, dqVar.getResourceProvider(), false);
                y1Var2.setPad(1);
                y1Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                y1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.g6.V6, org.telegram.ui.ActionBar.g6.f23118g7, org.telegram.ui.ActionBar.g6.f23190k7);
                y1Var2.setEnabled(true);
                y1Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                y1Var = y1Var2;
                a6Var = y1Var;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.o2) dqVar).currentAccount;
                c6Var = ((org.telegram.ui.ActionBar.o2) dqVar).resourceProvider;
                a6Var = new org.telegram.ui.Components.uz0(i12, -dqVar.f37597s, this.f37191c, c6Var);
                break;
        }
        return new f2.n1(a6Var);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        int b10 = n1Var.b();
        dq dqVar = this.f37192e;
        if (b10 == dqVar.f37594q0) {
            dq.f0(dqVar, n1Var.f6432a);
        }
    }

    @Override
    public final void z(f2.n1 n1Var) {
        int b10 = n1Var.b();
        dq dqVar = this.f37192e;
        if (b10 == dqVar.f37596r0 && dqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(dqVar.getParentActivity().getCurrentFocus());
        }
    }
}
