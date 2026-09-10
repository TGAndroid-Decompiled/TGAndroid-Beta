package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kr implements pr {
    public final wr f34448a;

    public kr(wr wrVar) {
        this.f34448a = wrVar;
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        wr wrVar = this.f34448a;
        if (wrVar.K.f(j3) == null) {
            qr w02 = wrVar.w0();
            wrVar.F.add(tLObject);
            wrVar.K.k(tLObject, j3);
            wrVar.z0(wrVar.F);
            wrVar.A0(w02);
        }
    }

    @Override
    public final void d(long j3) {
        wr wrVar = this.f34448a;
        if (wrVar.K.f(j3) == null) {
            qr w02 = wrVar.w0();
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
            tL_channelParticipantBanned.date = wrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = wrVar.getAccountInstance().getUserConfig().clientUserId;
            wrVar.f38357s.kicked_count++;
            wrVar.F.add(tL_channelParticipantBanned);
            wrVar.K.k(tL_channelParticipantBanned, j3);
            wrVar.z0(wrVar.F);
            wrVar.A0(w02);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j3) {
    }
}
