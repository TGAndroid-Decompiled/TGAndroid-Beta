package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jr0 extends sj0 {
    public final Context f35171c;
    public TLRPC.ChatFull d;
    public ArrayList f35172e;
    public final ws0 f35173f;

    public jr0(ws0 ws0Var, Context context) {
        this.f35173f = ws0Var;
        this.f35171c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
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
    public final int d(int i3) {
        TLRPC.ChatFull chatFull = this.d;
        if (chatFull != null && chatFull.participants.participants.isEmpty()) {
            return 20;
        }
        return 21;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
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
        ws0 ws0Var = this.f35173f;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.f40142y1;
        View view = d1Var.f55540a;
        if (view instanceof org.telegram.ui.Cells.pa) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            if (!this.f35172e.isEmpty()) {
                chatParticipant = this.d.participants.participants.get(((Integer) this.f35172e.get(i3)).intValue());
            } else {
                chatParticipant = this.d.participants.participants.get(i3);
            }
            if (chatParticipant != null) {
                boolean z18 = true;
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String str2 = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.bd.M0(2131752423, "ChannelCreator");
                        }
                        z16 = true;
                        z17 = true;
                        z15 = false;
                    } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.bd.M0(2131752520, "ChannelAdmin");
                        }
                        if (channelParticipant.promoted_by == d2Var.getUserConfig().e()) {
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
                            str3 = org.telegram.messenger.bd.M0(2131752423, "ChannelCreator");
                        }
                        str = str3;
                        z10 = true;
                        z11 = true;
                        z12 = false;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = org.telegram.messenger.bd.M0(2131752520, "ChannelAdmin");
                        }
                        if (chatParticipant.inviter_id == d2Var.getUserConfig().e()) {
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
                TLRPC.User a22 = d2Var.getMessagesController().a2(Long.valueOf(chatParticipant.user_id));
                if (org.telegram.messenger.l10.B(a22) && org.telegram.messenger.t3.h(d2Var.getMessagesController().M0(Long.valueOf(-ws0Var.m1)))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                paVar.a(str, z10, z11, z14, new y40(this, a22, str, z10, z11, z12, 1));
                if (i3 == this.d.participants.participants.size() - 1) {
                    z18 = false;
                }
                paVar.d(a22, null, null, z18);
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ws0 ws0Var = this.f35173f;
        if (i3 == 20) {
            p3 X = ws0.X(7, ws0Var.m1, this.f35171c, ws0Var.I1);
            X.setLayoutParams(new u4.p0(-1, -1));
            return new u4.d1(X);
        }
        org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(9, 0, this.f35171c, ws0Var.I1, true, false);
        paVar.setLayoutParams(new u4.p0(-1, -2));
        return new u4.d1(paVar);
    }
}
