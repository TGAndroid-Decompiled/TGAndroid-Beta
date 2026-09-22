package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mq extends org.telegram.ui.Components.xl0 {
    public final Context f35805c;
    public boolean d;
    public final nq e;

    public mq(nq nqVar, Context context) {
        this.e = nqVar;
        if (nqVar.f36129y == 2) {
            C(true);
        }
        this.f35805c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        TLRPC.Chat chat;
        int i10 = c1Var.f42998f;
        nq nqVar = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = nqVar.P;
        int i11 = nqVar.f36129y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = nqVar.N;
        if (!nqVar.f36125w.creator || ((i11 != 0 && (i11 != 2 || !nqVar.K)) || i10 != 4 || c1Var.b() != nqVar.f36104e0)) {
            if (nqVar.I) {
                if ((i11 == 0 || i11 == 2) && i10 == 4) {
                    int b10 = c1Var.b();
                    if (b10 == nqVar.W) {
                        if (!tL_chatAdminRights.add_admins && ((chat = nqVar.f36125w) == null || !chat.creator)) {
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
                            if (b10 == nqVar.f36095a0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b10 == nqVar.f36098b0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b10 == nqVar.f36101c0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b10 == nqVar.K0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b10 == nqVar.f36103d0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b10 == nqVar.f36104e0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b10 == nqVar.f36106f0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b10 == nqVar.f36107g0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b10 == nqVar.f36108h0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b10 == nqVar.f36109i0) {
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
                                if (b10 == nqVar.f36114n0) {
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
        if (nqVar.f36129y == 2) {
            if (i10 == nqVar.W) {
                return 1L;
            }
            if (i10 == nqVar.X) {
                return 2L;
            }
            if (i10 == nqVar.Y) {
                return 3L;
            }
            if (i10 == nqVar.f36098b0) {
                return 4L;
            }
            if (i10 == nqVar.f36101c0) {
                return 5L;
            }
            if (i10 == nqVar.f36103d0) {
                return 6L;
            }
            if (i10 == nqVar.f36104e0) {
                return 7L;
            }
            if (i10 == nqVar.f36106f0) {
                return 8L;
            }
            if (i10 == nqVar.f36107g0) {
                return 9L;
            }
            if (i10 == nqVar.f36108h0) {
                return 10L;
            }
            if (i10 == nqVar.f36115o0) {
                return 11L;
            }
            if (i10 == nqVar.f36116p0) {
                return 12L;
            }
            if (i10 == nqVar.f36117q0) {
                return 13L;
            }
            if (i10 == nqVar.f36119r0) {
                return 14L;
            }
            if (i10 == nqVar.f36121s0) {
                return 15L;
            }
            if (i10 == nqVar.f36122t0) {
                return 16L;
            }
            if (i10 == nqVar.f36123u0) {
                return 17L;
            }
            if (i10 == nqVar.f36124v0) {
                return 18L;
            }
            if (i10 == nqVar.f36126w0) {
                return 19L;
            }
            if (i10 == nqVar.f36130y0) {
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
            if (i10 == nqVar.f36128x0) {
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
            if (i10 == nqVar.f36131z0) {
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
            if (i10 == nqVar.f36109i0) {
                return 45L;
            }
            if (i10 == nqVar.f36110j0) {
                return 46L;
            }
            if (i10 == nqVar.f36111k0) {
                return 47L;
            }
            if (i10 == nqVar.f36112l0) {
                return 48L;
            }
            if (i10 == nqVar.f36114n0) {
                return 49L;
            }
            if (i10 == nqVar.f36095a0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        nq nqVar = this.e;
        if (i10 != nqVar.H0 && i10 != nqVar.J0 && i10 != nqVar.I0 && i10 != nqVar.B0 && i10 != nqVar.C0 && i10 != nqVar.E0 && i10 != nqVar.D0 && i10 != nqVar.G0 && i10 != nqVar.F0 && i10 != nqVar.f36110j0 && i10 != nqVar.P0 && i10 != nqVar.Q0 && i10 != nqVar.R0 && i10 != nqVar.U0 && i10 != nqVar.V0 && i10 != nqVar.W0) {
            if (i10 != nqVar.f36131z0 && i10 != nqVar.N0 && i10 != nqVar.S0) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 != 1 && i10 != nqVar.f36115o0 && i10 != nqVar.f36117q0 && i10 != nqVar.L0 && i10 != nqVar.f36121s0) {
                    if (i10 != 2 && i10 != nqVar.f36123u0) {
                        if (i10 != nqVar.X && i10 != nqVar.Y && i10 != nqVar.Z && i10 != nqVar.f36098b0 && i10 != nqVar.f36101c0 && i10 != nqVar.f36103d0 && i10 != nqVar.f36106f0 && i10 != nqVar.f36107g0 && i10 != nqVar.f36108h0 && i10 != nqVar.f36109i0 && i10 != nqVar.f36130y0 && i10 != nqVar.f36104e0 && i10 != nqVar.K0 && i10 != nqVar.W && i10 != nqVar.m0 && i10 != nqVar.f36111k0 && i10 != nqVar.f36114n0 && i10 != nqVar.f36095a0) {
                            if (i10 == nqVar.f36119r0 || i10 == nqVar.f36126w0 || i10 == nqVar.f36112l0) {
                                return 1;
                            }
                            if (i10 == nqVar.M0) {
                                return 6;
                            }
                            if (i10 == nqVar.f36124v0) {
                                return 11;
                            }
                            if (i10 != nqVar.f36128x0) {
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
        org.telegram.ui.Cells.e6 e6Var;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.f35805c;
        nq nqVar = this.e;
        switch (i10) {
            case 0:
                View zaVar = new org.telegram.ui.Cells.za(context, null);
                zaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
                e6Var = zaVar;
                break;
            case 1:
                e6Var = new org.telegram.ui.Cells.f9(context);
                break;
            case 2:
            default:
                View faVar = new org.telegram.ui.Cells.fa(context);
                faVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
                e6Var = faVar;
                break;
            case 3:
                View n4Var = new org.telegram.ui.Cells.n4(this.f35805c, org.telegram.ui.ActionBar.j6.L6, 21, 15, true, null);
                n4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
                a2Var = n4Var;
                e6Var = a2Var;
                break;
            case 4:
            case 9:
                View w8Var = new org.telegram.ui.Cells.w8(context);
                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
                e6Var = w8Var;
                break;
            case 5:
                e6Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 6:
                View d9Var = new org.telegram.ui.Cells.d9(context, null, false);
                d9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
                e6Var = d9Var;
                break;
            case 7:
                org.telegram.ui.Cells.e6 e6Var2 = new org.telegram.ui.Cells.e6(context, 0, null, null);
                e6Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
                e6Var2.c(new l0(this, 4));
                e6Var = e6Var2;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                nqVar.d = frameLayout;
                int i13 = org.telegram.ui.ActionBar.j6.f19053a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                nqVar.e = new FrameLayout(context);
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, false, false);
                nqVar.f36105f = o6Var;
                o6Var.setTypeface(AndroidUtilities.bold());
                nqVar.f36105f.setTextColor(-1);
                nqVar.f36105f.setTextSize(AndroidUtilities.dp(14.0f));
                nqVar.f36105f.setGravity(17);
                org.telegram.ui.Components.o6 o6Var2 = nqVar.f36105f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.o(R.string.AddBotButton, " ", sb2);
                if (nqVar.K) {
                    i11 = R.string.AddBotButtonAsAdmin;
                } else {
                    i11 = R.string.AddBotButtonAsMember;
                }
                sb2.append(LocaleController.getString(i11));
                o6Var2.setText(sb2.toString());
                nqVar.e.addView(nqVar.f36105f, w7.y5.e(-2, -2, 17));
                nqVar.e.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
                nqVar.e.setOnClickListener(new a(this, 15));
                nqVar.d.addView(nqVar.e, w7.y5.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                nqVar.d.setLayoutParams(new s4.p0(-1, -2));
                View view = new View(context);
                view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                nqVar.d.setClipChildren(false);
                nqVar.d.setClipToPadding(false);
                nqVar.d.addView(view, w7.y5.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                e6Var = nqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, this.f35805c, nqVar.getResourceProvider(), false);
                a2Var2.setPad(1);
                a2Var2.getCheckBoxRound().setDrawBackgroundAsArc(14);
                a2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.f19164g7, org.telegram.ui.ActionBar.j6.f19238k7);
                a2Var2.setEnabled(true);
                a2Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
                a2Var = a2Var2;
                e6Var = a2Var;
                break;
            case 11:
                i12 = ((org.telegram.ui.ActionBar.n2) nqVar).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.n2) nqVar).resourceProvider;
                e6Var = new org.telegram.ui.Components.o01(i12, -nqVar.f36120s, this.f35805c, f6Var);
                break;
        }
        return new s4.c1(e6Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int b10 = c1Var.b();
        nq nqVar = this.e;
        if (b10 == nqVar.f36123u0) {
            nq.f0(nqVar, c1Var.f42995a);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int b10 = c1Var.b();
        nq nqVar = this.e;
        if (b10 == nqVar.f36124v0 && nqVar.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(nqVar.getParentActivity().getCurrentFocus());
        }
    }
}
