package org.telegram.ui.ActionBar;

import android.util.Pair;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
import org.telegram.messenger.r20;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cw0;
public final class u3 implements r20 {
    public final int f21346a;
    public final long f21347b;
    public final Object f21348c;

    public u3(Object obj, long j10, int i10) {
        this.f21346a = i10;
        this.f21348c = obj;
        this.f21347b = j10;
    }

    @Override
    public final void a(Object obj) {
        long j10;
        switch (this.f21346a) {
            case 0:
                ResultCallback resultCallback = (ResultCallback) this.f21348c;
                wf.a aVar = (wf.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f21347b), aVar));
                    return;
                }
                return;
            case 1:
                cw0 cw0Var = (cw0) this.f21348c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    at.f(e20.f15506s0).d(new a3.i0(cw0Var, tL_messages_emojiGroups, this.f21347b, 16));
                    return;
                }
                return;
            default:
                vh.r6 r6Var = (vh.r6) this.f21348c;
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
                    r6Var.e(this.f21347b, tL_chatParticipants);
                    return;
                }
                return;
        }
    }
}
