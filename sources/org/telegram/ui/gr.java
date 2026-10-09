package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gr implements lr {
    public final tr f38082a;

    public gr(tr trVar) {
        this.f38082a = trVar;
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        tr trVar = this.f38082a;
        if (trVar.K.f(j3) == null) {
            mr w02 = trVar.w0();
            trVar.F.add(tLObject);
            trVar.K.k(tLObject, j3);
            trVar.z0(trVar.F);
            trVar.A0(w02);
        }
    }

    @Override
    public final void d(long j3) {
        tr trVar = this.f38082a;
        if (trVar.K.f(j3) == null) {
            mr w02 = trVar.w0();
            TLRPC.TL_channelParticipantBanned tL_channelParticipantBanned = new TLRPC.TL_channelParticipantBanned();
            if (j3 > 0) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantBanned.peer = tL_peerUser;
                tL_peerUser.user_id = j3;
            } else {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_channelParticipantBanned.peer = tL_peerChannel;
                tL_peerChannel.channel_id = -j3;
            }
            tL_channelParticipantBanned.date = trVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = trVar.getAccountInstance().getUserConfig().clientUserId;
            trVar.f42093s.kicked_count++;
            trVar.F.add(tL_channelParticipantBanned);
            trVar.K.k(tL_channelParticipantBanned, j3);
            trVar.z0(trVar.F);
            trVar.A0(w02);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j3) {
    }
}
