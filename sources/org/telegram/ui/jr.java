package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jr implements or {
    public final vr f37860a;

    public jr(vr vrVar) {
        this.f37860a = vrVar;
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        vr vrVar = this.f37860a;
        if (vrVar.K.f(j3) == null) {
            pr w02 = vrVar.w0();
            vrVar.F.add(tLObject);
            vrVar.K.k(tLObject, j3);
            vrVar.z0(vrVar.F);
            vrVar.A0(w02);
        }
    }

    @Override
    public final void d(long j3) {
        vr vrVar = this.f37860a;
        if (vrVar.K.f(j3) == null) {
            pr w02 = vrVar.w0();
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
            tL_channelParticipantBanned.date = vrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = vrVar.getAccountInstance().getUserConfig().clientUserId;
            vrVar.f41697s.kicked_count++;
            vrVar.F.add(tL_channelParticipantBanned);
            vrVar.K.k(tL_channelParticipantBanned, j3);
            vrVar.z0(vrVar.F);
            vrVar.A0(w02);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j3) {
    }
}
