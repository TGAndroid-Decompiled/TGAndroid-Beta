package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gr implements lr {
    public final sr f33917a;

    public gr(sr srVar) {
        this.f33917a = srVar;
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        sr srVar = this.f33917a;
        if (srVar.K.f(j3) == null) {
            mr w02 = srVar.w0();
            srVar.F.add(tLObject);
            srVar.K.k(tLObject, j3);
            srVar.z0(srVar.F);
            srVar.A0(w02);
        }
    }

    @Override
    public final void d(long j3) {
        sr srVar = this.f33917a;
        if (srVar.K.f(j3) == null) {
            mr w02 = srVar.w0();
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
            tL_channelParticipantBanned.date = srVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = srVar.getAccountInstance().getUserConfig().clientUserId;
            srVar.f37432s.kicked_count++;
            srVar.F.add(tL_channelParticipantBanned);
            srVar.K.k(tL_channelParticipantBanned, j3);
            srVar.z0(srVar.F);
            srVar.A0(w02);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j3) {
    }
}
