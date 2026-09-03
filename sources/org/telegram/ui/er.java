package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class er implements jr {
    public final qr f36565a;

    public er(qr qrVar) {
        this.f36565a = qrVar;
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        qr qrVar = this.f36565a;
        if (qrVar.H.f(j10) == null) {
            kr w02 = qrVar.w0();
            qrVar.C.add(tLObject);
            qrVar.H.k(tLObject, j10);
            qrVar.z0(qrVar.C);
            qrVar.A0(w02);
        }
    }

    @Override
    public final void d(long j10) {
        qr qrVar = this.f36565a;
        if (qrVar.H.f(j10) == null) {
            kr w02 = qrVar.w0();
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
            tL_channelParticipantBanned.date = qrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = qrVar.getAccountInstance().getUserConfig().clientUserId;
            qrVar.f40608s.kicked_count++;
            qrVar.C.add(tL_channelParticipantBanned);
            qrVar.H.k(tL_channelParticipantBanned, j10);
            qrVar.z0(qrVar.C);
            qrVar.A0(w02);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j10) {
    }
}
