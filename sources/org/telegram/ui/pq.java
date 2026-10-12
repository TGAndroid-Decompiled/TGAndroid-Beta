package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class pq extends org.telegram.ui.Components.vm0 {
    public final Context f41066c;
    public boolean d;
    public final qq f41067e;

    public pq(qq qqVar, Context context) {
        this.f41067e = qqVar;
        if (qqVar.f41419y == 2) {
            C(true);
        }
        this.f41066c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        TLRPC.Chat chat;
        int i10 = d1Var.f47893f;
        qq qqVar = this.f41067e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = qqVar.P;
        int i11 = qqVar.f41419y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = qqVar.N;
        if (!qqVar.f41415w.creator || ((i11 != 0 && (i11 != 2 || !qqVar.K)) || i10 != 4 || d1Var.b() != qqVar.f41394e0)) {
            if (qqVar.I) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = d1Var.b();
                    if (b10 == qqVar.W) {
                        if (!tL_chatAdminRights.add_admins && ((chat = qqVar.f41415w) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i11 != 2 || qqVar.K) {
                        if (b10 == qqVar.X) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !qqVar.E) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b10 == qqVar.Y) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b10 == qqVar.Z) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b10 == qqVar.f41384a0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == qqVar.f41387b0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == qqVar.f41390c0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == qqVar.K0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == qqVar.f41392d0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == qqVar.f41394e0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == qqVar.f41396f0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == qqVar.f41397g0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == qqVar.f41398h0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == qqVar.f41399i0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b10 == qqVar.m0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b10 == qqVar.U0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b10 == qqVar.V0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b10 == qqVar.W0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b10 == qqVar.f41404n0) {
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
        return this.f41067e.V;
    }

    @Override
    public final long i(int i10) {
        qq qqVar = this.f41067e;
        if (qqVar.f41419y == 2) {
            if (i10 == qqVar.W) {
                return 1L;
            }
            if (i10 == qqVar.X) {
                return 2L;
            }
            if (i10 == qqVar.Y) {
                return 3L;
            }
            if (i10 == qqVar.f41387b0) {
                return 4L;
            }
            if (i10 == qqVar.f41390c0) {
                return 5L;
            }
            if (i10 == qqVar.f41392d0) {
                return 6L;
            }
            if (i10 == qqVar.f41394e0) {
                return 7L;
            }
            if (i10 == qqVar.f41396f0) {
                return 8L;
            }
            if (i10 == qqVar.f41397g0) {
                return 9L;
            }
            if (i10 == qqVar.f41398h0) {
                return 10L;
            }
            if (i10 == qqVar.f41405o0) {
                return 11L;
            }
            if (i10 == qqVar.f41406p0) {
                return 12L;
            }
            if (i10 == qqVar.f41407q0) {
                return 13L;
            }
            if (i10 == qqVar.f41409r0) {
                return 14L;
            }
            if (i10 == qqVar.f41411s0) {
                return 15L;
            }
            if (i10 == qqVar.f41412t0) {
                return 16L;
            }
            if (i10 == qqVar.f41413u0) {
                return 17L;
            }
            if (i10 == qqVar.f41414v0) {
                return 18L;
            }
            if (i10 == qqVar.f41416w0) {
                return 19L;
            }
            if (i10 == qqVar.f41420y0) {
                return 20L;
            }
            if (i10 == qqVar.B0) {
                return 21L;
            }
            if (i10 == qqVar.H0) {
                return 22L;
            }
            if (i10 == qqVar.I0) {
                return 23L;
            }
            if (i10 == qqVar.J0) {
                return 24L;
            }
            if (i10 == qqVar.K0) {
                return 25L;
            }
            if (i10 == qqVar.L0) {
                return 26L;
            }
            if (i10 == qqVar.M0) {
                return 27L;
            }
            if (i10 == qqVar.f41418x0) {
                return 28L;
            }
            if (i10 == qqVar.m0) {
                return 29L;
            }
            if (i10 == qqVar.C0) {
                return 30L;
            }
            if (i10 == qqVar.E0) {
                return 31L;
            }
            if (i10 == qqVar.D0) {
                return 32L;
            }
            if (i10 == qqVar.F0) {
                return 33L;
            }
            if (i10 == qqVar.G0) {
                return 34L;
            }
            if (i10 == qqVar.f41421z0) {
                return 35L;
            }
            if (i10 == qqVar.N0) {
                return 36L;
            }
            if (i10 == qqVar.P0) {
                return 37L;
            }
            if (i10 == qqVar.Q0) {
                return 38L;
            }
            if (i10 == qqVar.R0) {
                return 39L;
            }
            if (i10 == qqVar.S0) {
                return 40L;
            }
            if (i10 == qqVar.U0) {
                return 41L;
            }
            if (i10 == qqVar.V0) {
                return 42L;
            }
            if (i10 == qqVar.W0) {
                return 43L;
            }
            if (i10 == qqVar.Z) {
                return 44L;
            }
            if (i10 == qqVar.f41399i0) {
                return 45L;
            }
            if (i10 == qqVar.f41400j0) {
                return 46L;
            }
            if (i10 == qqVar.f41401k0) {
                return 47L;
            }
            if (i10 == qqVar.f41402l0) {
                return 48L;
            }
            if (i10 == qqVar.f41404n0) {
                return 49L;
            }
            if (i10 == qqVar.f41384a0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        qq qqVar = this.f41067e;
        if (i10 != qqVar.H0 && i10 != qqVar.J0 && i10 != qqVar.I0 && i10 != qqVar.B0 && i10 != qqVar.C0 && i10 != qqVar.E0 && i10 != qqVar.D0 && i10 != qqVar.G0 && i10 != qqVar.F0 && i10 != qqVar.f41400j0 && i10 != qqVar.P0 && i10 != qqVar.Q0 && i10 != qqVar.R0 && i10 != qqVar.U0 && i10 != qqVar.V0 && i10 != qqVar.W0) {
            if (i10 != qqVar.f41421z0 && i10 != qqVar.N0 && i10 != qqVar.S0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != qqVar.f41405o0 && i10 != qqVar.f41407q0 && i10 != qqVar.L0 && i10 != qqVar.f41411s0) {
                    if (i10 != 2 && i10 != qqVar.f41413u0) {
                        if (i10 != qqVar.X && i10 != qqVar.Y && i10 != qqVar.Z && i10 != qqVar.f41387b0 && i10 != qqVar.f41390c0 && i10 != qqVar.f41392d0 && i10 != qqVar.f41396f0 && i10 != qqVar.f41397g0 && i10 != qqVar.f41398h0 && i10 != qqVar.f41399i0 && i10 != qqVar.f41420y0 && i10 != qqVar.f41394e0 && i10 != qqVar.K0 && i10 != qqVar.W && i10 != qqVar.m0 && i10 != qqVar.f41401k0 && i10 != qqVar.f41404n0 && i10 != qqVar.f41384a0) {
                            if (i10 == qqVar.f41409r0 || i10 == qqVar.f41416w0 || i10 == qqVar.f41402l0) {
                                return 1;
                            }
                            if (i10 == qqVar.M0) {
                                return 6;
                            }
                            if (i10 == qqVar.f41414v0) {
                                return 11;
                            }
                            if (i10 != qqVar.f41418x0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pq.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.Cells.a2 a2Var;
        org.telegram.ui.Cells.d6 d6Var;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = this.f41066c;
        qq qqVar = this.f41067e;
        switch (i10) {
            case 0:
                View waVar = new org.telegram.ui.Cells.wa(context, null);
                waVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
                d6Var = waVar;
                break;
            case 1:
                d6Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 2:
            default:
                View caVar = new org.telegram.ui.Cells.ca(context);
                caVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
                d6Var = caVar;
                break;
            case 3:
                View m4Var = new org.telegram.ui.Cells.m4(this.f41066c, org.telegram.ui.ActionBar.h6.L6, 21, 15, true, null);
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
                a2Var = m4Var;
                d6Var = a2Var;
                break;
            case 4:
            case 9:
                View v8Var = new org.telegram.ui.Cells.v8(context);
                v8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
                d6Var = v8Var;
                break;
            case 5:
                d6Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 6:
                View c9Var = new org.telegram.ui.Cells.c9(context, null, false);
                c9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
                d6Var = c9Var;
                break;
            case 7:
                org.telegram.ui.Cells.d6 d6Var2 = new org.telegram.ui.Cells.d6(context, 0, null, null);
                d6Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
                d6Var2.c(new m0(this, 4));
                d6Var = d6Var2;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                qqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.h6.f20503a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                qqVar.f41393e = new FrameLayout(context);
                org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, true, false, false);
                qqVar.f41395f = r6Var;
                r6Var.setTypeface(AndroidUtilities.bold());
                qqVar.f41395f.setTextColor(-1);
                qqVar.f41395f.setTextSize(AndroidUtilities.dp(14.0f));
                qqVar.f41395f.setGravity(17);
                org.telegram.ui.Components.r6 r6Var2 = qqVar.f41395f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.l(R.string.AddBotButton, " ", sb2);
                if (qqVar.K) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb2.append(LocaleController.getString(i11));
                r6Var2.setText(sb2.toString());
                qqVar.f41393e.addView(qqVar.f41395f, w7.w5.e(-2, -2, 17));
                qqVar.f41393e.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
                qqVar.f41393e.setOnClickListener(new a(this, 14));
                qqVar.d.addView(qqVar.f41393e, w7.w5.a(48.0f, 14.0f, 28.0f, 14.0f, 14.0f, -1, 119));
                qqVar.d.setLayoutParams(new s4.q0(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                qqVar.d.setClipChildren(false);
                qqVar.d.setClipToPadding(false);
                qqVar.d.addView(view, w7.w5.a(800.0f, 0.0f, 0.0f, 0.0f, -800.0f, -1, 87));
                d6Var = qqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, this.f41066c, qqVar.getResourceProvider(), false);
                a2Var2.setPad(1);
                a2Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.h6.V6, org.telegram.ui.ActionBar.h6.f20616g7, org.telegram.ui.ActionBar.h6.f20688k7);
                a2Var2.setEnabled(true);
                a2Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
                a2Var = a2Var2;
                d6Var = a2Var;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.m2) qqVar).currentAccount;
                c6Var = ((org.telegram.ui.ActionBar.m2) qqVar).resourceProvider;
                d6Var = new org.telegram.ui.Components.j11(i12, -qqVar.f41410s, this.f41066c, c6Var);
                break;
        }
        return new s4.d1(d6Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        int b10 = d1Var.b();
        qq qqVar = this.f41067e;
        if (b10 == qqVar.f41413u0) {
            qq.f0(qqVar, d1Var.f47889a);
        }
    }

    @Override
    public final void z(s4.d1 d1Var) {
        int b10 = d1Var.b();
        qq qqVar = this.f41067e;
        if (b10 == qqVar.f41414v0 && qqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(qqVar.getParentActivity().getCurrentFocus());
        }
    }
}
