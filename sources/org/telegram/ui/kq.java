package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class kq extends org.telegram.ui.Components.ql0 {
    public final Context f35574c;
    public boolean d;
    public final lq e;

    public kq(lq lqVar, Context context) {
        this.e = lqVar;
        if (lqVar.f35895y == 2) {
            C(true);
        }
        this.f35574c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        TLRPC.Chat chat;
        int i10 = l1Var.f5777f;
        lq lqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = lqVar.M;
        int i11 = lqVar.f35895y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = lqVar.K;
        if (!lqVar.f35891w.creator || ((i11 != 0 && (i11 != 2 || !lqVar.H)) || i10 != 4 || l1Var.b() != lqVar.f35866b0)) {
            if (lqVar.F) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = l1Var.b();
                    if (b10 == lqVar.T) {
                        if (!tL_chatAdminRights.add_admins && ((chat = lqVar.f35891w) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i11 != 2 || lqVar.H) {
                        if (b10 == lqVar.U) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !lqVar.B) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == lqVar.V) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == lqVar.W) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == lqVar.X) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == lqVar.Y) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == lqVar.Z) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == lqVar.H0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == lqVar.f35864a0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == lqVar.f35866b0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == lqVar.f35868c0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == lqVar.f35869d0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == lqVar.f35870e0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == lqVar.f35872f0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == lqVar.f35876j0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == lqVar.R0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == lqVar.S0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == lqVar.T0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == lqVar.f35877k0) {
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
        lq lqVar = this.e;
        if (lqVar.f35895y == 2) {
            if (i10 == lqVar.T) {
                return 1L;
            }
            if (i10 == lqVar.U) {
                return 2L;
            }
            if (i10 == lqVar.V) {
                return 3L;
            }
            if (i10 == lqVar.Y) {
                return 4L;
            }
            if (i10 == lqVar.Z) {
                return 5L;
            }
            if (i10 == lqVar.f35864a0) {
                return 6L;
            }
            if (i10 == lqVar.f35866b0) {
                return 7L;
            }
            if (i10 == lqVar.f35868c0) {
                return 8L;
            }
            if (i10 == lqVar.f35869d0) {
                return 9L;
            }
            if (i10 == lqVar.f35870e0) {
                return 10L;
            }
            if (i10 == lqVar.f35878l0) {
                return 11L;
            }
            if (i10 == lqVar.m0) {
                return 12L;
            }
            if (i10 == lqVar.f35880n0) {
                return 13L;
            }
            if (i10 == lqVar.f35881o0) {
                return 14L;
            }
            if (i10 == lqVar.f35882p0) {
                return 15L;
            }
            if (i10 == lqVar.f35883q0) {
                return 16L;
            }
            if (i10 == lqVar.f35885r0) {
                return 17L;
            }
            if (i10 == lqVar.f35887s0) {
                return 18L;
            }
            if (i10 == lqVar.f35888t0) {
                return 19L;
            }
            if (i10 == lqVar.f35890v0) {
                return 20L;
            }
            if (i10 == lqVar.f35896y0) {
                return 21L;
            }
            if (i10 == lqVar.E0) {
                return 22L;
            }
            if (i10 == lqVar.F0) {
                return 23L;
            }
            if (i10 == lqVar.G0) {
                return 24L;
            }
            if (i10 == lqVar.H0) {
                return 25L;
            }
            if (i10 == lqVar.I0) {
                return 26L;
            }
            if (i10 == lqVar.J0) {
                return 27L;
            }
            if (i10 == lqVar.f35889u0) {
                return 28L;
            }
            if (i10 == lqVar.f35876j0) {
                return 29L;
            }
            if (i10 == lqVar.f35897z0) {
                return 30L;
            }
            if (i10 == lqVar.B0) {
                return 31L;
            }
            if (i10 == lqVar.A0) {
                return 32L;
            }
            if (i10 == lqVar.C0) {
                return 33L;
            }
            if (i10 == lqVar.D0) {
                return 34L;
            }
            if (i10 == lqVar.f35892w0) {
                return 35L;
            }
            if (i10 == lqVar.K0) {
                return 36L;
            }
            if (i10 == lqVar.M0) {
                return 37L;
            }
            if (i10 == lqVar.N0) {
                return 38L;
            }
            if (i10 == lqVar.O0) {
                return 39L;
            }
            if (i10 == lqVar.P0) {
                return 40L;
            }
            if (i10 == lqVar.R0) {
                return 41L;
            }
            if (i10 == lqVar.S0) {
                return 42L;
            }
            if (i10 == lqVar.T0) {
                return 43L;
            }
            if (i10 == lqVar.W) {
                return 44L;
            }
            if (i10 == lqVar.f35872f0) {
                return 45L;
            }
            if (i10 == lqVar.f35873g0) {
                return 46L;
            }
            if (i10 == lqVar.f35874h0) {
                return 47L;
            }
            if (i10 == lqVar.f35875i0) {
                return 48L;
            }
            if (i10 == lqVar.f35877k0) {
                return 49L;
            }
            if (i10 == lqVar.X) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        lq lqVar = this.e;
        if (i10 != lqVar.E0 && i10 != lqVar.G0 && i10 != lqVar.F0 && i10 != lqVar.f35896y0 && i10 != lqVar.f35897z0 && i10 != lqVar.B0 && i10 != lqVar.A0 && i10 != lqVar.D0 && i10 != lqVar.C0 && i10 != lqVar.f35873g0 && i10 != lqVar.M0 && i10 != lqVar.N0 && i10 != lqVar.O0 && i10 != lqVar.R0 && i10 != lqVar.S0 && i10 != lqVar.T0) {
            if (i10 != lqVar.f35892w0 && i10 != lqVar.K0 && i10 != lqVar.P0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != lqVar.f35878l0 && i10 != lqVar.f35880n0 && i10 != lqVar.I0 && i10 != lqVar.f35882p0) {
                    if (i10 != 2 && i10 != lqVar.f35885r0) {
                        if (i10 != lqVar.U && i10 != lqVar.V && i10 != lqVar.W && i10 != lqVar.Y && i10 != lqVar.Z && i10 != lqVar.f35864a0 && i10 != lqVar.f35868c0 && i10 != lqVar.f35869d0 && i10 != lqVar.f35870e0 && i10 != lqVar.f35872f0 && i10 != lqVar.f35890v0 && i10 != lqVar.f35866b0 && i10 != lqVar.H0 && i10 != lqVar.T && i10 != lqVar.f35876j0 && i10 != lqVar.f35874h0 && i10 != lqVar.f35877k0 && i10 != lqVar.X) {
                            if (i10 == lqVar.f35881o0 || i10 == lqVar.f35888t0 || i10 == lqVar.f35875i0) {
                                return 1;
                            }
                            if (i10 == lqVar.J0) {
                                return 6;
                            }
                            if (i10 == lqVar.f35887s0) {
                                return 11;
                            }
                            if (i10 != lqVar.f35889u0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kq.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.Cells.y1 y1Var;
        org.telegram.ui.Cells.b6 b6Var;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.f35574c;
        lq lqVar = this.e;
        switch (i10) {
            case 0:
                View taVar = new org.telegram.ui.Cells.ta(context, null);
                taVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                b6Var = taVar;
                break;
            case 1:
                b6Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 2:
            default:
                View z9Var = new org.telegram.ui.Cells.z9(context);
                z9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                b6Var = z9Var;
                break;
            case 3:
                View l4Var = new org.telegram.ui.Cells.l4(this.f35574c, org.telegram.ui.ActionBar.j6.L6, 21, 15, true, null);
                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                y1Var = l4Var;
                b6Var = y1Var;
                break;
            case 4:
            case 9:
                View q8Var = new org.telegram.ui.Cells.q8(context);
                q8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                b6Var = q8Var;
                break;
            case 5:
                b6Var = new org.telegram.ui.Cells.y6(context, (b) null);
                break;
            case 6:
                View x8Var = new org.telegram.ui.Cells.x8(context, null, false);
                x8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                b6Var = x8Var;
                break;
            case 7:
                org.telegram.ui.Cells.b6 b6Var2 = new org.telegram.ui.Cells.b6(context, 0, null, null);
                b6Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                b6Var2.c(new p0(this, 4));
                b6Var = b6Var2;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                lqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.j6.f19827a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                lqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, false, false);
                lqVar.f35871f = k6Var;
                k6Var.setTypeface(AndroidUtilities.bold());
                lqVar.f35871f.setTextColor(-1);
                lqVar.f35871f.setTextSize(AndroidUtilities.dp(14.0f));
                lqVar.f35871f.setGravity(17);
                org.telegram.ui.Components.k6 k6Var2 = lqVar.f35871f;
                StringBuilder sb = new StringBuilder();
                b.i(R.string.AddBotButton, " ", sb);
                if (lqVar.H) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb.append(LocaleController.getString(i11));
                k6Var2.setText(sb.toString());
                lqVar.e.addView(lqVar.f35871f, k7.b6.e(-2, -2, 17));
                lqVar.e.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                lqVar.e.setOnClickListener(new a(this, 15));
                lqVar.d.addView(lqVar.e, k7.b6.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                lqVar.d.setLayoutParams(new f2.w0(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                lqVar.d.setClipChildren(false);
                lqVar.d.setClipToPadding(false);
                lqVar.d.addView(view, k7.b6.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                b6Var = lqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(4, 21, this.f35574c, lqVar.getResourceProvider(), false);
                y1Var2.setPad(1);
                y1Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                y1Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f19936g7, org.telegram.ui.ActionBar.j6.f20007k7);
                y1Var2.setEnabled(true);
                y1Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                y1Var = y1Var2;
                b6Var = y1Var;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.p2) lqVar).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.p2) lqVar).resourceProvider;
                b6Var = new org.telegram.ui.Components.f01(i12, -lqVar.f35886s, this.f35574c, f6Var);
                break;
        }
        return new f2.l1(b6Var);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        int b10 = l1Var.b();
        lq lqVar = this.e;
        if (b10 == lqVar.f35885r0) {
            lq.f0(lqVar, l1Var.f5774a);
        }
    }

    @Override
    public final void z(f2.l1 l1Var) {
        int b10 = l1Var.b();
        lq lqVar = this.e;
        if (b10 == lqVar.f35887s0 && lqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(lqVar.getParentActivity().getCurrentFocus());
        }
    }
}
