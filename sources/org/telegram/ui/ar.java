package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ar implements fr {
    public final mr f37810a;

    public ar(mr mrVar) {
        this.f37810a = mrVar;
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        mr mrVar = this.f37810a;
        if (mrVar.J.f(j10) == null) {
            gr x02 = mrVar.x0();
            mrVar.E.add(tLObject);
            mrVar.J.k(tLObject, j10);
            mrVar.A0(mrVar.E);
            mrVar.B0(x02);
        }
    }

    @Override
    public final void d(long j10) {
        mr mrVar = this.f37810a;
        if (mrVar.J.f(j10) == null) {
            gr x02 = mrVar.x0();
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
            tL_channelParticipantBanned.date = mrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = mrVar.getAccountInstance().getUserConfig().clientUserId;
            mrVar.f41539r.kicked_count++;
            mrVar.E.add(tL_channelParticipantBanned);
            mrVar.J.k(tL_channelParticipantBanned, j10);
            mrVar.A0(mrVar.E);
            mrVar.B0(x02);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j10) {
    }
}
