package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class lq extends org.telegram.ui.Components.yl0 {
    public final Context f38320c;
    public boolean d;
    public final mq f38321e;

    public lq(mq mqVar, Context context) {
        this.f38321e = mqVar;
        if (mqVar.f38746y == 2) {
            C(true);
        }
        this.f38320c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        TLRPC.Chat chat;
        int i10 = c1Var.f46535f;
        mq mqVar = this.f38321e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = mqVar.P;
        int i11 = mqVar.f38746y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = mqVar.N;
        if (!mqVar.f38742w.creator || ((i11 != 0 && (i11 != 2 || !mqVar.K)) || i10 != 4 || c1Var.b() != mqVar.f38721e0)) {
            if (mqVar.I) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = c1Var.b();
                    if (b10 == mqVar.W) {
                        if (!tL_chatAdminRights.add_admins && ((chat = mqVar.f38742w) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i11 != 2 || mqVar.K) {
                        if (b10 == mqVar.X) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !mqVar.E) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == mqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == mqVar.Z) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == mqVar.f38711a0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == mqVar.f38714b0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == mqVar.f38717c0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == mqVar.K0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == mqVar.f38719d0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == mqVar.f38721e0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == mqVar.f38723f0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == mqVar.f38724g0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == mqVar.f38725h0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == mqVar.f38726i0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == mqVar.m0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == mqVar.U0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == mqVar.V0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == mqVar.W0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == mqVar.f38731n0) {
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
        return this.f38321e.V;
    }

    @Override
    public final long i(int i10) {
        mq mqVar = this.f38321e;
        if (mqVar.f38746y == 2) {
            if (i10 == mqVar.W) {
                return 1L;
            }
            if (i10 == mqVar.X) {
                return 2L;
            }
            if (i10 == mqVar.Y) {
                return 3L;
            }
            if (i10 == mqVar.f38714b0) {
                return 4L;
            }
            if (i10 == mqVar.f38717c0) {
                return 5L;
            }
            if (i10 == mqVar.f38719d0) {
                return 6L;
            }
            if (i10 == mqVar.f38721e0) {
                return 7L;
            }
            if (i10 == mqVar.f38723f0) {
                return 8L;
            }
            if (i10 == mqVar.f38724g0) {
                return 9L;
            }
            if (i10 == mqVar.f38725h0) {
                return 10L;
            }
            if (i10 == mqVar.f38732o0) {
                return 11L;
            }
            if (i10 == mqVar.f38733p0) {
                return 12L;
            }
            if (i10 == mqVar.f38734q0) {
                return 13L;
            }
            if (i10 == mqVar.f38736r0) {
                return 14L;
            }
            if (i10 == mqVar.f38738s0) {
                return 15L;
            }
            if (i10 == mqVar.f38739t0) {
                return 16L;
            }
            if (i10 == mqVar.f38740u0) {
                return 17L;
            }
            if (i10 == mqVar.f38741v0) {
                return 18L;
            }
            if (i10 == mqVar.f38743w0) {
                return 19L;
            }
            if (i10 == mqVar.f38747y0) {
                return 20L;
            }
            if (i10 == mqVar.B0) {
                return 21L;
            }
            if (i10 == mqVar.H0) {
                return 22L;
            }
            if (i10 == mqVar.I0) {
                return 23L;
            }
            if (i10 == mqVar.J0) {
                return 24L;
            }
            if (i10 == mqVar.K0) {
                return 25L;
            }
            if (i10 == mqVar.L0) {
                return 26L;
            }
            if (i10 == mqVar.M0) {
                return 27L;
            }
            if (i10 == mqVar.f38745x0) {
                return 28L;
            }
            if (i10 == mqVar.m0) {
                return 29L;
            }
            if (i10 == mqVar.C0) {
                return 30L;
            }
            if (i10 == mqVar.E0) {
                return 31L;
            }
            if (i10 == mqVar.D0) {
                return 32L;
            }
            if (i10 == mqVar.F0) {
                return 33L;
            }
            if (i10 == mqVar.G0) {
                return 34L;
            }
            if (i10 == mqVar.f38748z0) {
                return 35L;
            }
            if (i10 == mqVar.N0) {
                return 36L;
            }
            if (i10 == mqVar.P0) {
                return 37L;
            }
            if (i10 == mqVar.Q0) {
                return 38L;
            }
            if (i10 == mqVar.R0) {
                return 39L;
            }
            if (i10 == mqVar.S0) {
                return 40L;
            }
            if (i10 == mqVar.U0) {
                return 41L;
            }
            if (i10 == mqVar.V0) {
                return 42L;
            }
            if (i10 == mqVar.W0) {
                return 43L;
            }
            if (i10 == mqVar.Z) {
                return 44L;
            }
            if (i10 == mqVar.f38726i0) {
                return 45L;
            }
            if (i10 == mqVar.f38727j0) {
                return 46L;
            }
            if (i10 == mqVar.f38728k0) {
                return 47L;
            }
            if (i10 == mqVar.f38729l0) {
                return 48L;
            }
            if (i10 == mqVar.f38731n0) {
                return 49L;
            }
            if (i10 == mqVar.f38711a0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        mq mqVar = this.f38321e;
        if (i10 != mqVar.H0 && i10 != mqVar.J0 && i10 != mqVar.I0 && i10 != mqVar.B0 && i10 != mqVar.C0 && i10 != mqVar.E0 && i10 != mqVar.D0 && i10 != mqVar.G0 && i10 != mqVar.F0 && i10 != mqVar.f38727j0 && i10 != mqVar.P0 && i10 != mqVar.Q0 && i10 != mqVar.R0 && i10 != mqVar.U0 && i10 != mqVar.V0 && i10 != mqVar.W0) {
            if (i10 != mqVar.f38748z0 && i10 != mqVar.N0 && i10 != mqVar.S0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != mqVar.f38732o0 && i10 != mqVar.f38734q0 && i10 != mqVar.L0 && i10 != mqVar.f38738s0) {
                    if (i10 != 2 && i10 != mqVar.f38740u0) {
                        if (i10 != mqVar.X && i10 != mqVar.Y && i10 != mqVar.Z && i10 != mqVar.f38714b0 && i10 != mqVar.f38717c0 && i10 != mqVar.f38719d0 && i10 != mqVar.f38723f0 && i10 != mqVar.f38724g0 && i10 != mqVar.f38725h0 && i10 != mqVar.f38726i0 && i10 != mqVar.f38747y0 && i10 != mqVar.f38721e0 && i10 != mqVar.K0 && i10 != mqVar.W && i10 != mqVar.m0 && i10 != mqVar.f38728k0 && i10 != mqVar.f38731n0 && i10 != mqVar.f38711a0) {
                            if (i10 == mqVar.f38736r0 || i10 == mqVar.f38743w0 || i10 == mqVar.f38729l0) {
                                return 1;
                            }
                            if (i10 == mqVar.M0) {
                                return 6;
                            }
                            if (i10 == mqVar.f38741v0) {
                                return 11;
                            }
                            if (i10 != mqVar.f38745x0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lq.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.Cells.a2 a2Var;
        org.telegram.ui.Cells.d6 d6Var;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var2;
        Context context = this.f38320c;
        mq mqVar = this.f38321e;
        switch (i10) {
            case 0:
                View yaVar = new org.telegram.ui.Cells.ya(context, null);
                yaVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20822d6, false));
                d6Var = yaVar;
                break;
            case 1:
                d6Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
            default:
                View eaVar = new org.telegram.ui.Cells.ea(context);
                eaVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20822d6, false));
                d6Var = eaVar;
                break;
            case 3:
                View m4Var = new org.telegram.ui.Cells.m4(this.f38320c, org.telegram.ui.ActionBar.i6.L6, 21, 15, true, null);
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20822d6, false));
                a2Var = m4Var;
                d6Var = a2Var;
                break;
            case 4:
            case 9:
                View v8Var = new org.telegram.ui.Cells.v8(context);
                v8Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20822d6, false));
                d6Var = v8Var;
                break;
            case 5:
                d6Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 6:
                View c9Var = new org.telegram.ui.Cells.c9(context, null, false);
                c9Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20822d6, false));
                d6Var = c9Var;
                break;
            case 7:
                org.telegram.ui.Cells.d6 d6Var3 = new org.telegram.ui.Cells.d6(context, 0, null, null);
                d6Var3.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20822d6, false));
                d6Var3.c(new m0(this, 4));
                d6Var = d6Var3;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                mqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.i6.f20766a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
                mqVar.f38720e = new FrameLayout(context);
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, false, false);
                mqVar.f38722f = p6Var;
                p6Var.setTypeface(AndroidUtilities.bold());
                mqVar.f38722f.setTextColor(-1);
                mqVar.f38722f.setTextSize(AndroidUtilities.dp(14.0f));
                mqVar.f38722f.setGravity(17);
                org.telegram.ui.Components.p6 p6Var2 = mqVar.f38722f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.n(R.string.AddBotButton, " ", sb2);
                if (mqVar.K) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb2.append(LocaleController.getString(i11));
                p6Var2.setText(sb2.toString());
                mqVar.f38720e.addView(mqVar.f38722f, w7.z5.e(-2, -2, 17));
                mqVar.f38720e.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.Oh));
                mqVar.f38720e.setOnClickListener(new a(this, 15));
                mqVar.d.addView(mqVar.f38720e, w7.z5.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                mqVar.d.setLayoutParams(new s4.p0(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
                mqVar.d.setClipChildren(false);
                mqVar.d.setClipToPadding(false);
                mqVar.d.addView(view, w7.z5.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                d6Var = mqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, this.f38320c, mqVar.getResourceProvider(), false);
                a2Var2.setPad(1);
                a2Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.i6.V6, org.telegram.ui.ActionBar.i6.f20878g7, org.telegram.ui.ActionBar.i6.f20952k7);
                a2Var2.setEnabled(true);
                a2Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20822d6, false));
                a2Var = a2Var2;
                d6Var = a2Var;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.n2) mqVar).currentAccount;
                d6Var2 = ((org.telegram.ui.ActionBar.n2) mqVar).resourceProvider;
                d6Var = new org.telegram.ui.Components.w01(i12, -mqVar.f38737s, this.f38320c, d6Var2);
                break;
        }
        return new s4.c1(d6Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int b10 = c1Var.b();
        mq mqVar = this.f38321e;
        if (b10 == mqVar.f38740u0) {
            mq.f0(mqVar, c1Var.f46531a);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int b10 = c1Var.b();
        mq mqVar = this.f38321e;
        if (b10 == mqVar.f38741v0 && mqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(mqVar.getParentActivity().getCurrentFocus());
        }
    }
}
