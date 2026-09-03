package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fr implements kr {
    public final rr f34210a;

    public fr(rr rrVar) {
        this.f34210a = rrVar;
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        rr rrVar = this.f34210a;
        if (rrVar.H.f(j10) == null) {
            lr w02 = rrVar.w0();
            rrVar.C.add(tLObject);
            rrVar.H.k(tLObject, j10);
            rrVar.z0(rrVar.C);
            rrVar.A0(w02);
        }
    }

    @Override
    public final void d(long j10) {
        rr rrVar = this.f34210a;
        if (rrVar.H.f(j10) == null) {
            lr w02 = rrVar.w0();
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
            tL_channelParticipantBanned.date = rrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = rrVar.getAccountInstance().getUserConfig().clientUserId;
            rrVar.f37995s.kicked_count++;
            rrVar.C.add(tL_channelParticipantBanned);
            rrVar.H.k(tL_channelParticipantBanned, j10);
            rrVar.z0(rrVar.C);
            rrVar.A0(w02);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j10) {
    }
}
