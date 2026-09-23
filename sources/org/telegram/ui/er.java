package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class er implements jr {
    public final qr f33008a;

    public er(qr qrVar) {
        this.f33008a = qrVar;
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        qr qrVar = this.f33008a;
        if (qrVar.K.f(j3) == null) {
            kr w02 = qrVar.w0();
            qrVar.F.add(tLObject);
            qrVar.K.k(tLObject, j3);
            qrVar.z0(qrVar.F);
            qrVar.A0(w02);
        }
    }

    @Override
    public final void d(long j3) {
        qr qrVar = this.f33008a;
        if (qrVar.K.f(j3) == null) {
            kr w02 = qrVar.w0();
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
            tL_channelParticipantBanned.date = qrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = qrVar.getAccountInstance().getUserConfig().clientUserId;
            qrVar.f36585s.kicked_count++;
            qrVar.F.add(tL_channelParticipantBanned);
            qrVar.K.k(tL_channelParticipantBanned, j3);
            qrVar.z0(qrVar.F);
            qrVar.A0(w02);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j3) {
    }
}
