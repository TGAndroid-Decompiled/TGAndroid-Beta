package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q30 extends xl0 {
    public final Context f27525c;
    public final u30 d;

    public q30(u30 u30Var, Context context) {
        this.d = u30Var;
        this.f27525c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42961a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        View view = c1Var.f42961a;
        if (!(view instanceof org.telegram.ui.Cells.b5) || !this.d.f28714f0.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) {
            int i10 = c1Var.f42964f;
            if (i10 == 0 || i10 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f28725r0;
    }

    @Override
    public final int j(int i10) {
        u30 u30Var = this.d;
        if ((i10 >= u30Var.f28719k0 && i10 < u30Var.f28720l0) || (i10 >= u30Var.f28721n0 && i10 < u30Var.f28722o0)) {
            return 0;
        }
        if (i10 == u30Var.f28717i0) {
            return 1;
        }
        if (i10 != u30Var.f28723p0 && i10 != u30Var.m0) {
            u30Var.getClass();
            if (i10 == 0) {
                return 3;
            }
            if (i10 == u30Var.f28718j0) {
                return 4;
            }
            if (i10 != u30Var.f28724q0) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLObject tLObject;
        int i11;
        long j3;
        int i12;
        u30 u30Var = this.d;
        ArrayList arrayList = u30Var.X;
        int i13 = c1Var.f42964f;
        View view = c1Var.f42961a;
        boolean z10 = false;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
                    if (i10 == u30Var.f28723p0) {
                        v3Var.setText(LocaleController.getString(R.string.ChannelOtherMembers));
                        return;
                    } else if (i10 == u30Var.m0) {
                        if (u30Var.f28716h0) {
                            v3Var.setText(LocaleController.getString(R.string.YourContactsToInvite));
                            return;
                        } else {
                            v3Var.setText(LocaleController.getString(R.string.GroupContacts));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (i10 == u30Var.f28717i0) {
                if ((!u30Var.f28711c0 || u30Var.f28712d0) && u30Var.f28723p0 == -1 && !arrayList.isEmpty()) {
                    z10 = true;
                }
                y4Var.b(LocaleController.getString(R.string.VoipGroupCopyInviteLink), R.drawable.msg_link, 7, z10);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        b5Var.setTag(Integer.valueOf(i10));
        int i14 = u30Var.f28719k0;
        if (i10 >= i14 && i10 < u30Var.f28720l0) {
            tLObject = (TLObject) arrayList.get(i10 - i14);
        } else {
            int i15 = u30Var.f28721n0;
            if (i10 >= i15 && i10 < u30Var.f28722o0) {
                tLObject = (TLObject) u30Var.Y.get(i10 - i15);
            } else {
                tLObject = null;
            }
        }
        if (i10 < u30Var.f28719k0 || i10 >= (i11 = u30Var.f28720l0)) {
            i11 = u30Var.f28722o0;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j3 = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j3 = ((TLRPC.User) tLObject).f18483id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j3 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j3 = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        i12 = ((org.telegram.ui.ActionBar.e3) u30Var).currentAccount;
        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j3));
        if (user != null) {
            b5Var.setCustomImageVisible(u30Var.f28714f0.contains(Long.valueOf(user.f18483id)));
            if (i10 != i11 - 1) {
                z10 = true;
            }
            b5Var.b(user, null, null, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var;
        if (i10 != 0) {
            Context context = this.f27525c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            b5Var = new View(context);
                        } else {
                            ?? v00Var = new v00(context, null);
                            v00Var.setViewType(6);
                            v00Var.setIsSingleCell(true);
                            v00Var.f(org.telegram.ui.ActionBar.h6.f19104fg, org.telegram.ui.ActionBar.h6.Rg, org.telegram.ui.ActionBar.h6.f19177jg);
                            b5Var = v00Var;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                        b5Var = view;
                    }
                } else {
                    ?? v3Var = new org.telegram.ui.Cells.v3(context, null);
                    v3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19177jg, false));
                    v3Var.setTextColor(org.telegram.ui.ActionBar.h6.Qg);
                    b5Var = v3Var;
                }
            } else {
                ?? y4Var = new org.telegram.ui.Cells.y4(context);
                int i11 = org.telegram.ui.ActionBar.h6.f19289pg;
                y4Var.a(i11, i11);
                y4Var.setDividerColor(org.telegram.ui.ActionBar.h6.f19122gg);
                b5Var = y4Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(6, 2, this.f27525c, null, false);
            b5Var2.setCustomRightImage(R.drawable.msg_invited);
            b5Var2.setNameColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19251ng, false));
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19215lg, false);
            int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19289pg, false);
            b5Var2.H = w02;
            b5Var2.I = w03;
            b5Var2.setDividerColor(org.telegram.ui.ActionBar.h6.f19122gg);
            b5Var = b5Var2;
        }
        return new s4.c1(b5Var);
    }
}
