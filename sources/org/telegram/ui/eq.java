package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class eq implements jq {
    public final qq f45485a;

    public eq(qq qqVar) {
        this.f45485a = qqVar;
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        qq qqVar = this.f45485a;
        if (qqVar.J.f(j3) == null) {
            kq B0 = qqVar.B0();
            qqVar.E.add(tLObject);
            qqVar.J.k(tLObject, j3);
            qqVar.E0(qqVar.E);
            qqVar.F0(B0);
        }
    }

    @Override
    public final void d(long j3) {
        qq qqVar = this.f45485a;
        if (qqVar.J.f(j3) == null) {
            kq B0 = qqVar.B0();
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
            tL_channelParticipantBanned.date = qqVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = org.telegram.messenger.p10.i(qqVar.getAccountInstance().f21765a).f24489n;
            qqVar.f49152r.kicked_count++;
            qqVar.E.add(tL_channelParticipantBanned);
            qqVar.J.k(tL_channelParticipantBanned, j3);
            qqVar.E0(qqVar.E);
            qqVar.F0(B0);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j3) {
    }
}
