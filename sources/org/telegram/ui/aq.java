package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class aq implements fq {
    public final nq f43823a;

    public aq(nq nqVar) {
        this.f43823a = nqVar;
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        nq nqVar = this.f43823a;
        if (nqVar.K.f(j10) == null) {
            gq B0 = nqVar.B0();
            nqVar.F.add(tLObject);
            nqVar.K.k(tLObject, j10);
            nqVar.E0(nqVar.F);
            nqVar.F0(B0);
        }
    }

    @Override
    public final void d(long j10) {
        nq nqVar = this.f43823a;
        if (nqVar.K.f(j10) == null) {
            gq B0 = nqVar.B0();
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
            tL_channelParticipantBanned.date = nqVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = org.telegram.messenger.h10.i(nqVar.getAccountInstance().f21919a).f22848n;
            nqVar.f48083r.kicked_count++;
            nqVar.F.add(tL_channelParticipantBanned);
            nqVar.K.k(tL_channelParticipantBanned, j10);
            nqVar.E0(nqVar.F);
            nqVar.F0(B0);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j10) {
    }
}
