package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fq implements kq {
    public final rq f47808a;

    public fq(rq rqVar) {
        this.f47808a = rqVar;
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        rq rqVar = this.f47808a;
        if (rqVar.K.f(j3) == null) {
            lq B0 = rqVar.B0();
            rqVar.F.add(tLObject);
            rqVar.K.k(tLObject, j3);
            rqVar.E0(rqVar.F);
            rqVar.F0(B0);
        }
    }

    @Override
    public final void d(long j3) {
        rq rqVar = this.f47808a;
        if (rqVar.K.f(j3) == null) {
            lq B0 = rqVar.B0();
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
            tL_channelParticipantBanned.date = rqVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = org.telegram.messenger.j10.i(rqVar.getAccountInstance().f23246a).f24817n;
            rqVar.f51728r.kicked_count++;
            rqVar.F.add(tL_channelParticipantBanned);
            rqVar.K.k(tL_channelParticipantBanned, j3);
            rqVar.E0(rqVar.F);
            rqVar.F0(B0);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j3) {
    }
}
