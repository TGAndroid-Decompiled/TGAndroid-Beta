package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dr implements ir {
    public final pr f33154a;

    public dr(pr prVar) {
        this.f33154a = prVar;
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        pr prVar = this.f33154a;
        if (prVar.K.f(j3) == null) {
            jr w02 = prVar.w0();
            prVar.F.add(tLObject);
            prVar.K.k(tLObject, j3);
            prVar.z0(prVar.F);
            prVar.A0(w02);
        }
    }

    @Override
    public final void d(long j3) {
        pr prVar = this.f33154a;
        if (prVar.K.f(j3) == null) {
            jr w02 = prVar.w0();
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
            tL_channelParticipantBanned.date = prVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = prVar.getAccountInstance().getUserConfig().clientUserId;
            prVar.f36638s.kicked_count++;
            prVar.F.add(tL_channelParticipantBanned);
            prVar.K.k(tL_channelParticipantBanned, j3);
            prVar.z0(prVar.F);
            prVar.A0(w02);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j3) {
    }
}
