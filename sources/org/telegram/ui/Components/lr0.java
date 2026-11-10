package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lr0 extends oj0 {
    public final Context f35733c;
    public TLRPC.ChatFull d;
    public ArrayList f35734e;
    public final ys0 f35735f;

    public lr0(ys0 ys0Var, Context context) {
        this.f35735f = ys0Var;
        this.f35733c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
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
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.ChatParticipant chatParticipant;
        String str;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        ys0 ys0Var = this.f35735f;
        org.telegram.ui.ActionBar.f2 f2Var = ys0Var.f40719x1;
        View view = d1Var.f57052a;
        if (view instanceof org.telegram.ui.Cells.pa) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            if (!this.f35734e.isEmpty()) {
                chatParticipant = this.d.participants.participants.get(((Integer) this.f35734e.get(i7)).intValue());
            } else {
                chatParticipant = this.d.participants.participants.get(i7);
            }
            if (chatParticipant != null) {
                boolean z17 = true;
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String str2 = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.id.M0(2131752423, "ChannelCreator");
                        }
                        z15 = true;
                        z16 = true;
                        z14 = false;
                    } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = org.telegram.messenger.id.M0(2131752520, "ChannelAdmin");
                        }
                        if (channelParticipant.promoted_by == f2Var.getUserConfig().e()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = true;
                        z16 = false;
                    } else {
                        z14 = false;
                        z15 = false;
                        z16 = false;
                    }
                    boolean z18 = z16;
                    z11 = z14;
                    z9 = z15;
                    z10 = z18;
                    str = str2;
                } else {
                    String str3 = chatParticipant.rank;
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = org.telegram.messenger.id.M0(2131752423, "ChannelCreator");
                        }
                        str = str3;
                        z9 = true;
                        z10 = true;
                        z11 = false;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = org.telegram.messenger.id.M0(2131752520, "ChannelAdmin");
                        }
                        if (chatParticipant.inviter_id == f2Var.getUserConfig().e()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z11 = z12;
                        str = str3;
                        z9 = true;
                        z10 = false;
                    } else {
                        str = str3;
                        z9 = false;
                        z10 = false;
                        z11 = false;
                    }
                }
                TLRPC.User a22 = f2Var.getMessagesController().a2(Long.valueOf(chatParticipant.user_id));
                if (org.telegram.messenger.t10.B(a22) && org.telegram.messenger.t3.h(f2Var.getMessagesController().M0(Long.valueOf(-ys0Var.l1)))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                paVar.a(str, z9, z10, z13, new c50(this, a22, str, z9, z10, z11, 1));
                if (i7 == this.d.participants.participants.size() - 1) {
                    z17 = false;
                }
                paVar.d(a22, null, null, z17);
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ys0 ys0Var = this.f35735f;
        if (i7 == 20) {
            q3 X = ys0.X(7, ys0Var.l1, this.f35733c, ys0Var.H1);
            X.setLayoutParams(new v4.o0(-1, -1));
            return new v4.d1(X);
        }
        org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(9, 0, this.f35733c, ys0Var.H1, true, false);
        paVar.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(paVar);
    }
}
