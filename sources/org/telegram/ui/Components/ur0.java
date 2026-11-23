package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ur0 extends dk0 {
    public final Context f40445c;
    public TLRPC.ChatFull d;
    public ArrayList f40446e;
    public final it0 f40447f;

    public ur0(it0 it0Var, Context context) {
        this.f40447f = it0Var;
        this.f40445c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
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
    public final int d(int i7) {
        TLRPC.ChatFull chatFull = this.d;
        if (chatFull != null && chatFull.participants.participants.isEmpty()) {
            return 20;
        }
        return 21;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
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
        it0 it0Var = this.f40447f;
        org.telegram.ui.ActionBar.g2 g2Var = it0Var.f36166y1;
        View view = f1Var.f59245a;
        if (view instanceof org.telegram.ui.Cells.sa) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            if (!this.f40446e.isEmpty()) {
                chatParticipant = this.d.participants.participants.get(((Integer) this.f40446e.get(i7)).intValue());
            } else {
                chatParticipant = this.d.participants.participants.get(i7);
            }
            if (chatParticipant != null) {
                boolean z18 = true;
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String str2 = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.gd.N0(2131752411, "ChannelCreator");
                        }
                        z16 = true;
                        z17 = true;
                        z15 = false;
                    } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.gd.N0(2131752508, "ChannelAdmin");
                        }
                        if (channelParticipant.promoted_by == g2Var.getUserConfig().e()) {
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
                            str3 = org.telegram.messenger.gd.N0(2131752411, "ChannelCreator");
                        }
                        str = str3;
                        z10 = true;
                        z11 = true;
                        z12 = false;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = org.telegram.messenger.gd.N0(2131752508, "ChannelAdmin");
                        }
                        if (chatParticipant.inviter_id == g2Var.getUserConfig().e()) {
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
                TLRPC.User c22 = g2Var.getMessagesController().c2(Long.valueOf(chatParticipant.user_id));
                if (org.telegram.messenger.n10.C(c22) && org.telegram.messenger.v3.h(g2Var.getMessagesController().O0(Long.valueOf(-it0Var.f36130m1)))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                saVar.a(str, z10, z11, z14, new n50(this, c22, str, z10, z11, z12, 1));
                if (i7 == this.d.participants.participants.size() - 1) {
                    z18 = false;
                }
                saVar.d(c22, null, null, z18);
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        it0 it0Var = this.f40447f;
        if (i7 == 20) {
            x3 X = it0.X(7, it0Var.f36130m1, this.f40445c, it0Var.I1);
            X.setLayoutParams(new v4.q0(-1, -1));
            return new v4.f1(X);
        }
        org.telegram.ui.Cells.sa saVar = new org.telegram.ui.Cells.sa(9, 0, this.f40445c, it0Var.I1, true, false);
        saVar.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(saVar);
    }
}
