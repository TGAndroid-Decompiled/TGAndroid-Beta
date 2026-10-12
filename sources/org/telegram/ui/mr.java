package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mr implements rr {
    public final yr f38316a;

    public mr(yr yrVar) {
        this.f38316a = yrVar;
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        yr yrVar = this.f38316a;
        if (yrVar.K.f(j10) == null) {
            sr w02 = yrVar.w0();
            yrVar.F.add(tLObject);
            yrVar.K.k(tLObject, j10);
            yrVar.z0(yrVar.F);
            yrVar.A0(w02);
        }
    }

    @Override
    public final void d(long j10) {
        yr yrVar = this.f38316a;
        if (yrVar.K.f(j10) == null) {
            sr w02 = yrVar.w0();
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
            tL_channelParticipantBanned.date = yrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantBanned.kicked_by = yrVar.getAccountInstance().getUserConfig().clientUserId;
            yrVar.f42252s.kicked_count++;
            yrVar.F.add(tL_channelParticipantBanned);
            yrVar.K.k(tL_channelParticipantBanned, j10);
            yrVar.z0(yrVar.F);
            yrVar.A0(w02);
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }

    @Override
    public final void b(long j10) {
    }
}
