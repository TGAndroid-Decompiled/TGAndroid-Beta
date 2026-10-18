package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class cq extends org.telegram.ui.Components.hm0 {
    public final Context f35987c;
    public boolean d;
    public final dq e;

    public cq(dq dqVar, Context context) {
        this.e = dqVar;
        if (dqVar.f36301y == 2) {
            C(true);
        }
        this.f35987c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        TLRPC.Chat chat;
        int i10 = b1Var.f45961f;
        dq dqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = dqVar.P;
        int i11 = dqVar.f36301y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = dqVar.N;
        if (!dqVar.f36297w.creator || ((i11 != 0 && (i11 != 2 || !dqVar.K)) || i10 != 4 || b1Var.b() != dqVar.f36276e0)) {
            if (dqVar.I) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = b1Var.b();
                    if (b10 == dqVar.W) {
                        if (!tL_chatAdminRights.add_admins && ((chat = dqVar.f36297w) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i11 != 2 || dqVar.K) {
                        if (b10 == dqVar.X) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !dqVar.E) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == dqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == dqVar.Z) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == dqVar.f36267a0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == dqVar.f36270b0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == dqVar.f36273c0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == dqVar.K0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == dqVar.f36275d0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == dqVar.f36276e0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == dqVar.f36278f0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == dqVar.f36279g0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == dqVar.f36280h0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == dqVar.f36281i0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == dqVar.m0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == dqVar.U0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == dqVar.V0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == dqVar.W0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == dqVar.f36286n0) {
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
        dq dqVar = this.e;
        if (dqVar.f36301y == 2) {
            if (i10 == dqVar.W) {
                return 1L;
            }
            if (i10 == dqVar.X) {
                return 2L;
            }
            if (i10 == dqVar.Y) {
                return 3L;
            }
            if (i10 == dqVar.f36270b0) {
                return 4L;
            }
            if (i10 == dqVar.f36273c0) {
                return 5L;
            }
            if (i10 == dqVar.f36275d0) {
                return 6L;
            }
            if (i10 == dqVar.f36276e0) {
                return 7L;
            }
            if (i10 == dqVar.f36278f0) {
                return 8L;
            }
            if (i10 == dqVar.f36279g0) {
                return 9L;
            }
            if (i10 == dqVar.f36280h0) {
                return 10L;
            }
            if (i10 == dqVar.f36287o0) {
                return 11L;
            }
            if (i10 == dqVar.f36288p0) {
                return 12L;
            }
            if (i10 == dqVar.f36289q0) {
                return 13L;
            }
            if (i10 == dqVar.f36291r0) {
                return 14L;
            }
            if (i10 == dqVar.f36293s0) {
                return 15L;
            }
            if (i10 == dqVar.f36294t0) {
                return 16L;
            }
            if (i10 == dqVar.f36295u0) {
                return 17L;
            }
            if (i10 == dqVar.f36296v0) {
                return 18L;
            }
            if (i10 == dqVar.f36298w0) {
                return 19L;
            }
            if (i10 == dqVar.f36302y0) {
                return 20L;
            }
            if (i10 == dqVar.B0) {
                return 21L;
            }
            if (i10 == dqVar.H0) {
                return 22L;
            }
            if (i10 == dqVar.I0) {
                return 23L;
            }
            if (i10 == dqVar.J0) {
                return 24L;
            }
            if (i10 == dqVar.K0) {
                return 25L;
            }
            if (i10 == dqVar.L0) {
                return 26L;
            }
            if (i10 == dqVar.M0) {
                return 27L;
            }
            if (i10 == dqVar.f36300x0) {
                return 28L;
            }
            if (i10 == dqVar.m0) {
                return 29L;
            }
            if (i10 == dqVar.C0) {
                return 30L;
            }
            if (i10 == dqVar.E0) {
                return 31L;
            }
            if (i10 == dqVar.D0) {
                return 32L;
            }
            if (i10 == dqVar.F0) {
                return 33L;
            }
            if (i10 == dqVar.G0) {
                return 34L;
            }
            if (i10 == dqVar.f36303z0) {
                return 35L;
            }
            if (i10 == dqVar.N0) {
                return 36L;
            }
            if (i10 == dqVar.P0) {
                return 37L;
            }
            if (i10 == dqVar.Q0) {
                return 38L;
            }
            if (i10 == dqVar.R0) {
                return 39L;
            }
            if (i10 == dqVar.S0) {
                return 40L;
            }
            if (i10 == dqVar.U0) {
                return 41L;
            }
            if (i10 == dqVar.V0) {
                return 42L;
            }
            if (i10 == dqVar.W0) {
                return 43L;
            }
            if (i10 == dqVar.Z) {
                return 44L;
            }
            if (i10 == dqVar.f36281i0) {
                return 45L;
            }
            if (i10 == dqVar.f36282j0) {
                return 46L;
            }
            if (i10 == dqVar.f36283k0) {
                return 47L;
            }
            if (i10 == dqVar.f36284l0) {
                return 48L;
            }
            if (i10 == dqVar.f36286n0) {
                return 49L;
            }
            if (i10 == dqVar.f36267a0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        dq dqVar = this.e;
        if (i10 != dqVar.H0 && i10 != dqVar.J0 && i10 != dqVar.I0 && i10 != dqVar.B0 && i10 != dqVar.C0 && i10 != dqVar.E0 && i10 != dqVar.D0 && i10 != dqVar.G0 && i10 != dqVar.F0 && i10 != dqVar.f36282j0 && i10 != dqVar.P0 && i10 != dqVar.Q0 && i10 != dqVar.R0 && i10 != dqVar.U0 && i10 != dqVar.V0 && i10 != dqVar.W0) {
            if (i10 != dqVar.f36303z0 && i10 != dqVar.N0 && i10 != dqVar.S0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != dqVar.f36287o0 && i10 != dqVar.f36289q0 && i10 != dqVar.L0 && i10 != dqVar.f36293s0) {
                    if (i10 != 2 && i10 != dqVar.f36295u0) {
                        if (i10 != dqVar.X && i10 != dqVar.Y && i10 != dqVar.Z && i10 != dqVar.f36270b0 && i10 != dqVar.f36273c0 && i10 != dqVar.f36275d0 && i10 != dqVar.f36278f0 && i10 != dqVar.f36279g0 && i10 != dqVar.f36280h0 && i10 != dqVar.f36281i0 && i10 != dqVar.f36302y0 && i10 != dqVar.f36276e0 && i10 != dqVar.K0 && i10 != dqVar.W && i10 != dqVar.m0 && i10 != dqVar.f36283k0 && i10 != dqVar.f36286n0 && i10 != dqVar.f36267a0) {
                            if (i10 == dqVar.f36291r0 || i10 == dqVar.f36298w0 || i10 == dqVar.f36284l0) {
                                return 1;
                            }
                            if (i10 == dqVar.M0) {
                                return 6;
                            }
                            if (i10 == dqVar.f36296v0) {
                                return 11;
                            }
                            if (i10 != dqVar.f36300x0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cq.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.Cells.a2 a2Var;
        org.telegram.ui.Cells.c6 c6Var;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.f35987c;
        dq dqVar = this.e;
        switch (i10) {
            case 0:
                View uaVar = new org.telegram.ui.Cells.ua(context, null);
                uaVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                c6Var = uaVar;
                break;
            case 1:
                c6Var = new org.telegram.ui.Cells.d9(context);
                break;
            case 2:
            default:
                View baVar = new org.telegram.ui.Cells.ba(context);
                baVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                c6Var = baVar;
                break;
            case 3:
                View l4Var = new org.telegram.ui.Cells.l4(this.f35987c, org.telegram.ui.ActionBar.h6.L6, 21, 15, true, null);
                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                a2Var = l4Var;
                c6Var = a2Var;
                break;
            case 4:
            case 9:
                View u8Var = new org.telegram.ui.Cells.u8(context);
                u8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                c6Var = u8Var;
                break;
            case 5:
                c6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 6:
                View b9Var = new org.telegram.ui.Cells.b9(context, null, false);
                b9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                c6Var = b9Var;
                break;
            case 7:
                org.telegram.ui.Cells.c6 c6Var2 = new org.telegram.ui.Cells.c6(context, 0, null, null);
                c6Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                c6Var2.c(new o0(this, 4));
                c6Var = c6Var2;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                dqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.h6.f20935a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                dqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, false, false);
                dqVar.f36277f = q6Var;
                q6Var.setTypeface(AndroidUtilities.bold());
                dqVar.f36277f.setTextColor(-1);
                dqVar.f36277f.setTextSize(AndroidUtilities.dp(14.0f));
                dqVar.f36277f.setGravity(17);
                org.telegram.ui.Components.q6 q6Var2 = dqVar.f36277f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.n(R.string.AddBotButton, " ", sb2);
                if (dqVar.K) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb2.append(LocaleController.getString(i11));
                q6Var2.setText(sb2.toString());
                dqVar.e.addView(dqVar.f36277f, w7.z5.e(-2, -2, 17));
                dqVar.e.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                dqVar.e.setOnClickListener(new a(this, 14));
                dqVar.d.addView(dqVar.e, w7.z5.a(48.0f, 14.0f, 28.0f, 14.0f, 14.0f, -1, 119));
                dqVar.d.setLayoutParams(new s4.o0(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                dqVar.d.setClipChildren(false);
                dqVar.d.setClipToPadding(false);
                dqVar.d.addView(view, w7.z5.a(800.0f, 0.0f, 0.0f, 0.0f, -800.0f, -1, 87));
                c6Var = dqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, this.f35987c, dqVar.getResourceProvider(), false);
                a2Var2.setPad(1);
                a2Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.f21047g7, org.telegram.ui.ActionBar.h6.f21121k7);
                a2Var2.setEnabled(true);
                a2Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                a2Var = a2Var2;
                c6Var = a2Var;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.n2) dqVar).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.n2) dqVar).resourceProvider;
                c6Var = new org.telegram.ui.Components.v01(i12, -dqVar.f36292s, this.f35987c, d6Var);
                break;
        }
        return new s4.b1(c6Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int b10 = b1Var.b();
        dq dqVar = this.e;
        if (b10 == dqVar.f36295u0) {
            dq.f0(dqVar, b1Var.f45958a);
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        int b10 = b1Var.b();
        dq dqVar = this.e;
        if (b10 == dqVar.f36296v0 && dqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(dqVar.getParentActivity().getCurrentFocus());
        }
    }
}
