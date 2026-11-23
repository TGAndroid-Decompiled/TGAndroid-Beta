package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vr0 extends dk0 {
    public final Context f41545c;
    public TLRPC.ChatFull d;
    public ArrayList f41546e;
    public final jt0 f41547f;

    public vr0(jt0 jt0Var, Context context) {
        this.f41547f = jt0Var;
        this.f41545c = context;
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
        jt0 jt0Var = this.f41547f;
        org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36684y1;
        View view = f1Var.f59165a;
        if (view instanceof org.telegram.ui.Cells.ra) {
            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
            if (!this.f41546e.isEmpty()) {
                chatParticipant = this.d.participants.participants.get(((Integer) this.f41546e.get(i7)).intValue());
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
                            str2 = org.telegram.messenger.hd.N0(2131752411, "ChannelCreator");
                        }
                        z16 = true;
                        z17 = true;
                        z15 = false;
                    } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.hd.N0(2131752508, "ChannelAdmin");
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
                            str3 = org.telegram.messenger.hd.N0(2131752411, "ChannelCreator");
                        }
                        str = str3;
                        z10 = true;
                        z11 = true;
                        z12 = false;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = org.telegram.messenger.hd.N0(2131752508, "ChannelAdmin");
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
                if (org.telegram.messenger.p10.C(c22) && org.telegram.messenger.v3.h(g2Var.getMessagesController().O0(Long.valueOf(-jt0Var.f36648m1)))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                raVar.a(str, z10, z11, z14, new q50(this, c22, str, z10, z11, z12, 1));
                if (i7 == this.d.participants.participants.size() - 1) {
                    z18 = false;
                }
                raVar.d(c22, null, null, z18);
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        jt0 jt0Var = this.f41547f;
        if (i7 == 20) {
            y3 X = jt0.X(7, jt0Var.f36648m1, this.f41545c, jt0Var.I1);
            X.setLayoutParams(new v4.q0(-1, -1));
            return new v4.f1(X);
        }
        org.telegram.ui.Cells.ra raVar = new org.telegram.ui.Cells.ra(9, 0, this.f41545c, jt0Var.I1, true, false);
        raVar.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(raVar);
    }
}
