package org.telegram.ui.ActionBar;

import android.util.Pair;
import org.telegram.messenger.d20;
import org.telegram.messenger.q20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bw0;
public final class u3 implements q20 {
    public final int f21345a;
    public final long f21346b;
    public final Object f21347c;

    public u3(Object obj, long j10, int i10) {
        this.f21345a = i10;
        this.f21347c = obj;
        this.f21346b = j10;
    }

    @Override
    public final void a(Object obj) {
        long j10;
        switch (this.f21345a) {
            case 0:
                ResultCallback resultCallback = (ResultCallback) this.f21347c;
                wf.a aVar = (wf.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f21346b), aVar));
                    return;
                }
                return;
            case 1:
                bw0 bw0Var = (bw0) this.f21347c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    zs.f(d20.f15147s0).d(new a3.i0(bw0Var, tL_messages_emojiGroups, this.f21346b, 16));
                    return;
                }
                return;
            default:
                vh.r6 r6Var = (vh.r6) this.f21347c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                x1 x1Var = r6Var.G;
                if (x1Var != null) {
                    x1Var.c(350L);
                    r6Var.G = null;
                }
                if (tL_channels_channelParticipants != null && !tL_channels_channelParticipants.participants.isEmpty()) {
                    TLRPC.TL_chatParticipants tL_chatParticipants = new TLRPC.TL_chatParticipants();
                    for (int i10 = 0; i10 < tL_channels_channelParticipants.participants.size(); i10++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        TLRPC.Peer peer = channelParticipant.peer;
                        if (peer != null) {
                            j10 = org.telegram.messenger.o5.o(peer);
                            if (j10 < 0) {
                            }
                        } else {
                            j10 = channelParticipant.user_id;
                        }
                        tL_chatParticipant.user_id = j10;
                        tL_chatParticipants.participants.add(tL_chatParticipant);
                    }
                    r6Var.e(this.f21346b, tL_chatParticipants);
                    return;
                }
                return;
        }
    }
}
