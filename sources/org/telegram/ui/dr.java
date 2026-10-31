package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dr implements ir {
    public final pr f36814a;

    public dr(pr prVar) {
        this.f36814a = prVar;
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        pr prVar = this.f36814a;
        if (prVar.J.f(j10) == null) {
            jr A0 = prVar.A0();
            prVar.E.add(tLObject);
            prVar.J.k(tLObject, j10);
            prVar.D0(prVar.E);
            prVar.E0(A0);
        }
    }

    @Override
    public final void d(long j10) {
        pr prVar = this.f36814a;
        if (prVar.J.f(j10) == null) {
            jr A0 = prVar.A0();
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
            tL_channelParticipantBanned.kicked_by = org.telegram.messenger.d20.i(prVar.getAccountInstance().f14863a).f15165n;
            prVar.f40755r.kicked_count++;
            prVar.E.add(tL_channelParticipantBanned);
            prVar.J.k(tL_channelParticipantBanned, j10);
            prVar.D0(prVar.E);
            prVar.E0(A0);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j10) {
    }
}
