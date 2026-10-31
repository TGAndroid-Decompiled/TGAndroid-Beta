package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ks0 extends sk0 {
    public final Context f27900c;
    public TLRPC.ChatFull d;
    public ArrayList e;
    public final zt0 f27901f;

    public ks0(zt0 zt0Var, Context context) {
        this.f27901f = zt0Var;
        this.f27900c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        TLRPC.ChatFull chatFull = this.d;
        if (chatFull != null && chatFull.participants.participants.isEmpty()) {
            return 1;
        }
        TLRPC.ChatFull chatFull2 = this.d;
        if (chatFull2 != null) {
            return chatFull2.participants.participants.size();
        }
        return 0;
    }

    @Override
    public final int d(int i10) {
        TLRPC.ChatFull chatFull = this.d;
        if (chatFull != null && chatFull.participants.participants.isEmpty()) {
            return 20;
        }
        return 21;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.ChatParticipant chatParticipant;
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        zt0 zt0Var = this.f27901f;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.f33240x1;
        View view = c1Var.f47898a;
        if (view instanceof org.telegram.ui.Cells.pa) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            if (!this.e.isEmpty()) {
                chatParticipant = this.d.participants.participants.get(((Integer) this.e.get(i10)).intValue());
            } else {
                chatParticipant = this.d.participants.participants.get(i10);
            }
            if (chatParticipant != null) {
                boolean z18 = true;
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String str2 = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.cd.L0(2131752423, "ChannelCreator");
                        }
                        z16 = true;
                        z17 = true;
                        z15 = false;
                    } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.cd.L0(2131752520, "ChannelAdmin");
                        }
                        if (channelParticipant.promoted_by == k2Var.getUserConfig().e()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = true;
                        z17 = false;
                    } else {
                        z15 = false;
                        z16 = false;
                        z17 = false;
                    }
                    boolean z19 = z17;
                    z12 = z15;
                    z10 = z16;
                    z11 = z19;
                    str = str2;
                } else {
                    String str3 = chatParticipant.rank;
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = org.telegram.messenger.cd.L0(2131752423, "ChannelCreator");
                        }
                        str = str3;
                        z10 = true;
                        z11 = true;
                        z12 = false;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = org.telegram.messenger.cd.L0(2131752520, "ChannelAdmin");
                        }
                        if (chatParticipant.inviter_id == k2Var.getUserConfig().e()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z12 = z13;
                        str = str3;
                        z10 = true;
                        z11 = false;
                    } else {
                        str = str3;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                    }
                }
                TLRPC.User Z1 = k2Var.getMessagesController().Z1(Long.valueOf(chatParticipant.user_id));
                if (org.telegram.messenger.h20.B(Z1) && org.telegram.messenger.w3.h(k2Var.getMessagesController().L0(Long.valueOf(-zt0Var.l1)))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                paVar.a(str, z10, z11, z14, new s50(this, Z1, str, z10, z11, z12, 1));
                if (i10 == this.d.participants.participants.size() - 1) {
                    z18 = false;
                }
                paVar.d(Z1, null, null, z18);
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        zt0 zt0Var = this.f27901f;
        if (i10 == 20) {
            p3 V = zt0.V(7, zt0Var.l1, this.f27900c, zt0Var.H1);
            V.setLayoutParams(new s4.o0(-1, -1));
            return new s4.c1(V);
        }
        org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(9, 0, this.f27900c, zt0Var.H1, true, false);
        paVar.setLayoutParams(new s4.o0(-1, -2));
        return new s4.c1(paVar);
    }
}
