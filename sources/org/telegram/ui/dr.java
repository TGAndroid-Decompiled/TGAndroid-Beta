package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dr implements ir {
    public final pr f33788a;

    public dr(pr prVar) {
        this.f33788a = prVar;
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        pr prVar = this.f33788a;
        if (prVar.H.f(j10) == null) {
            jr w02 = prVar.w0();
            prVar.C.add(tLObject);
            prVar.H.k(tLObject, j10);
            prVar.z0(prVar.C);
            prVar.A0(w02);
        }
    }

    @Override
    public final void d(long j10) {
        pr prVar = this.f33788a;
        if (prVar.H.f(j10) == null) {
            jr w02 = prVar.w0();
            TLRPC.TL_channelParticipantBanned tL_channelParticipantBanned = new TLRPC.TL_channelParticipantBanned();
            if (j10 > 0) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantBanned.peer = tL_peerUser;
                tL_peerUser.user_id = j10;
            } else {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_channelParticipantBanned.peer = tL_peerChannel;
                tL_peerChannel.channel_id = -j10;
            }
            tL_channelParticipantBanned.date = prVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = prVar.getAccountInstance().getUserConfig().clientUserId;
            prVar.f37484s.kicked_count++;
            prVar.C.add(tL_channelParticipantBanned);
            prVar.H.k(tL_channelParticipantBanned, j10);
            prVar.z0(prVar.C);
            prVar.A0(w02);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j10) {
    }
}
