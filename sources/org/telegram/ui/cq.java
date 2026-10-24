package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class cq extends org.telegram.ui.Components.km0 {
    public final Context f36385c;
    public boolean d;
    public final dq e;

    public cq(dq dqVar, Context context) {
        this.e = dqVar;
        if (dqVar.E == 2) {
            C(true);
        }
        this.f36385c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        TLRPC.Chat chat;
        int i10 = b1Var.f46345f;
        dq dqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = dqVar.Q;
        int i11 = dqVar.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = dqVar.O;
        if (!dqVar.f36697x.creator || ((i11 != 0 && (i11 != 2 || !dqVar.L)) || i10 != 4 || b1Var.b() != dqVar.f36676f0)) {
            if (dqVar.J) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = b1Var.b();
                    if (b10 == dqVar.X) {
                        if (!tL_chatAdminRights.add_admins && ((chat = dqVar.f36697x) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i11 != 2 || dqVar.L) {
                        if (b10 == dqVar.Y) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !dqVar.F) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == dqVar.Z) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == dqVar.f36664a0) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == dqVar.f36667b0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == dqVar.f36670c0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == dqVar.f36672d0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == dqVar.L0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == dqVar.f36674e0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == dqVar.f36676f0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == dqVar.f36677g0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == dqVar.f36678h0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == dqVar.f36679i0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == dqVar.f36680j0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == dqVar.f36684n0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == dqVar.V0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == dqVar.W0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == dqVar.X0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == dqVar.f36685o0) {
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
        return this.e.W;
    }

    @Override
    public final long i(int i10) {
        dq dqVar = this.e;
        if (dqVar.E == 2) {
            if (i10 == dqVar.X) {
                return 1L;
            }
            if (i10 == dqVar.Y) {
                return 2L;
            }
            if (i10 == dqVar.Z) {
                return 3L;
            }
            if (i10 == dqVar.f36670c0) {
                return 4L;
            }
            if (i10 == dqVar.f36672d0) {
                return 5L;
            }
            if (i10 == dqVar.f36674e0) {
                return 6L;
            }
            if (i10 == dqVar.f36676f0) {
                return 7L;
            }
            if (i10 == dqVar.f36677g0) {
                return 8L;
            }
            if (i10 == dqVar.f36678h0) {
                return 9L;
            }
            if (i10 == dqVar.f36679i0) {
                return 10L;
            }
            if (i10 == dqVar.f36686p0) {
                return 11L;
            }
            if (i10 == dqVar.f36687q0) {
                return 12L;
            }
            if (i10 == dqVar.f36689r0) {
                return 13L;
            }
            if (i10 == dqVar.f36691s0) {
                return 14L;
            }
            if (i10 == dqVar.f36692t0) {
                return 15L;
            }
            if (i10 == dqVar.f36693u0) {
                return 16L;
            }
            if (i10 == dqVar.f36694v0) {
                return 17L;
            }
            if (i10 == dqVar.f36696w0) {
                return 18L;
            }
            if (i10 == dqVar.f36698x0) {
                return 19L;
            }
            if (i10 == dqVar.f36701z0) {
                return 20L;
            }
            if (i10 == dqVar.C0) {
                return 21L;
            }
            if (i10 == dqVar.I0) {
                return 22L;
            }
            if (i10 == dqVar.J0) {
                return 23L;
            }
            if (i10 == dqVar.K0) {
                return 24L;
            }
            if (i10 == dqVar.L0) {
                return 25L;
            }
            if (i10 == dqVar.M0) {
                return 26L;
            }
            if (i10 == dqVar.N0) {
                return 27L;
            }
            if (i10 == dqVar.f36700y0) {
                return 28L;
            }
            if (i10 == dqVar.f36684n0) {
                return 29L;
            }
            if (i10 == dqVar.D0) {
                return 30L;
            }
            if (i10 == dqVar.F0) {
                return 31L;
            }
            if (i10 == dqVar.E0) {
                return 32L;
            }
            if (i10 == dqVar.G0) {
                return 33L;
            }
            if (i10 == dqVar.H0) {
                return 34L;
            }
            if (i10 == dqVar.A0) {
                return 35L;
            }
            if (i10 == dqVar.O0) {
                return 36L;
            }
            if (i10 == dqVar.Q0) {
                return 37L;
            }
            if (i10 == dqVar.R0) {
                return 38L;
            }
            if (i10 == dqVar.S0) {
                return 39L;
            }
            if (i10 == dqVar.T0) {
                return 40L;
            }
            if (i10 == dqVar.V0) {
                return 41L;
            }
            if (i10 == dqVar.W0) {
                return 42L;
            }
            if (i10 == dqVar.X0) {
                return 43L;
            }
            if (i10 == dqVar.f36664a0) {
                return 44L;
            }
            if (i10 == dqVar.f36680j0) {
                return 45L;
            }
            if (i10 == dqVar.f36681k0) {
                return 46L;
            }
            if (i10 == dqVar.f36682l0) {
                return 47L;
            }
            if (i10 == dqVar.m0) {
                return 48L;
            }
            if (i10 == dqVar.f36685o0) {
                return 49L;
            }
            if (i10 == dqVar.f36667b0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        dq dqVar = this.e;
        if (i10 != dqVar.I0 && i10 != dqVar.K0 && i10 != dqVar.J0 && i10 != dqVar.C0 && i10 != dqVar.D0 && i10 != dqVar.F0 && i10 != dqVar.E0 && i10 != dqVar.H0 && i10 != dqVar.G0 && i10 != dqVar.f36681k0 && i10 != dqVar.Q0 && i10 != dqVar.R0 && i10 != dqVar.S0 && i10 != dqVar.V0 && i10 != dqVar.W0 && i10 != dqVar.X0) {
            if (i10 != dqVar.A0 && i10 != dqVar.O0 && i10 != dqVar.T0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != dqVar.f36686p0 && i10 != dqVar.f36689r0 && i10 != dqVar.M0 && i10 != dqVar.f36692t0) {
                    if (i10 != 2 && i10 != dqVar.f36694v0) {
                        if (i10 != dqVar.Y && i10 != dqVar.Z && i10 != dqVar.f36664a0 && i10 != dqVar.f36670c0 && i10 != dqVar.f36672d0 && i10 != dqVar.f36674e0 && i10 != dqVar.f36677g0 && i10 != dqVar.f36678h0 && i10 != dqVar.f36679i0 && i10 != dqVar.f36680j0 && i10 != dqVar.f36701z0 && i10 != dqVar.f36676f0 && i10 != dqVar.L0 && i10 != dqVar.X && i10 != dqVar.f36684n0 && i10 != dqVar.f36682l0 && i10 != dqVar.f36685o0 && i10 != dqVar.f36667b0) {
                            if (i10 == dqVar.f36691s0 || i10 == dqVar.f36698x0 || i10 == dqVar.m0) {
                                return 1;
                            }
                            if (i10 == dqVar.N0) {
                                return 6;
                            }
                            if (i10 == dqVar.f36696w0) {
                                return 11;
                            }
                            if (i10 != dqVar.f36700y0) {
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
    public final void v(s4.b1 r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cq.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z1 z1Var;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = this.f36385c;
        dq dqVar = this.e;
        switch (i10) {
            case 0:
                View vaVar = new org.telegram.ui.Cells.va(context, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, vaVar, null);
                z1Var = vaVar;
                break;
            case 1:
                z1Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
            default:
                View caVar = new org.telegram.ui.Cells.ca(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, caVar, null);
                z1Var = caVar;
                break;
            case 3:
                View l4Var = new org.telegram.ui.Cells.l4(this.f36385c, org.telegram.ui.ActionBar.k6.L6, 21, 15, true, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, l4Var, null);
                z1Var = l4Var;
                break;
            case 4:
            case 9:
                View v8Var = new org.telegram.ui.Cells.v8(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, v8Var, null);
                z1Var = v8Var;
                break;
            case 5:
                z1Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                break;
            case 6:
                View c9Var = new org.telegram.ui.Cells.c9(context, null, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, c9Var, null);
                z1Var = c9Var;
                break;
            case 7:
                org.telegram.ui.Cells.d6 d6Var = new org.telegram.ui.Cells.d6(context, 0, null, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, d6Var, null);
                d6Var.b(new n0(this, 4));
                z1Var = d6Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                dqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.k6.f21126a7;
                org.telegram.ui.ActionBar.r6.i(i13, frameLayout, null);
                dqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, false, false);
                dqVar.f36675f = o6Var;
                o6Var.setTypeface(AndroidUtilities.bold());
                dqVar.f36675f.setTextColor(-1);
                dqVar.f36675f.setTextSize(AndroidUtilities.dp(14.0f));
                dqVar.f36675f.setGravity(17);
                org.telegram.ui.Components.o6 o6Var2 = dqVar.f36675f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.b1.o(R.string.AddBotButton, " ", sb2);
                if (dqVar.L) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb2.append(LocaleController.getString(i11));
                o6Var2.setText(sb2.toString());
                dqVar.e.addView(dqVar.f36675f, w7.z5.e(-2, -2, 17));
                dqVar.e.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
                dqVar.e.setOnClickListener(new a(this, 15));
                dqVar.d.addView(dqVar.e, w7.z5.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                dqVar.d.setLayoutParams(new s4.o0(-1, -2));
                View view = new View(context);
                org.telegram.ui.ActionBar.r6.i(i13, view, null);
                dqVar.d.setClipChildren(false);
                dqVar.d.setClipToPadding(false);
                dqVar.d.addView(view, w7.z5.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                z1Var = dqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, this.f36385c, dqVar.getResourceProvider(), false);
                z1Var2.setPad(1);
                z1Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                z1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.f21238g7, org.telegram.ui.ActionBar.k6.f21312k7);
                z1Var2.setEnabled(true);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, z1Var2, null);
                z1Var = z1Var2;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.o2) dqVar).currentAccount;
                g6Var = ((org.telegram.ui.ActionBar.o2) dqVar).resourceProvider;
                z1Var = new org.telegram.ui.Components.z01(i12, -dqVar.v, this.f36385c, g6Var);
                break;
        }
        return new s4.b1(z1Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int b10 = b1Var.b();
        dq dqVar = this.e;
        if (b10 == dqVar.f36694v0) {
            dq.f0(dqVar, b1Var.f46342a);
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        int b10 = b1Var.b();
        dq dqVar = this.e;
        if (b10 == dqVar.f36696w0 && dqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(dqVar.getParentActivity().getCurrentFocus());
        }
    }
}
