package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cq implements hq {
    public final oq f44875a;

    public cq(oq oqVar) {
        this.f44875a = oqVar;
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        oq oqVar = this.f44875a;
        if (oqVar.J.f(j3) == null) {
            iq B0 = oqVar.B0();
            oqVar.E.add(tLObject);
            oqVar.J.k(tLObject, j3);
            oqVar.E0(oqVar.E);
            oqVar.F0(B0);
        }
    }

    @Override
    public final void d(long j3) {
        oq oqVar = this.f44875a;
        if (oqVar.J.f(j3) == null) {
            iq B0 = oqVar.B0();
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
            tL_channelParticipantBanned.date = oqVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = org.telegram.messenger.p10.i(oqVar.getAccountInstance().f21765a).f24489n;
            oqVar.f48499r.kicked_count++;
            oqVar.E.add(tL_channelParticipantBanned);
            oqVar.J.k(tL_channelParticipantBanned, j3);
            oqVar.E0(oqVar.E);
            oqVar.F0(B0);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j3) {
    }
}
