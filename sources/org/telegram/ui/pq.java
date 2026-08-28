package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pq implements yp {
    public final int f41574a;
    public final long f41575b;
    public final int f41576c;
    public final boolean d;
    public final boolean[] f41577e;
    public final jr f41578f;

    public pq(jr jrVar, int i9, long j10, int i10, boolean z10, boolean[] zArr) {
        this.f41578f = jrVar;
        this.f41574a = i9;
        this.f41575b = j10;
        this.f41576c = i10;
        this.d = z10;
        this.f41577e = zArr;
    }

    @Override
    public final void a(TLRPC.User user) {
        jr.b0(this.f41578f, user);
    }

    @Override
    public final void b(int i9, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.ChatParticipant tL_chatParticipant;
        TLRPC.ChannelParticipant tL_channelParticipant;
        jr jrVar = this.f41578f;
        ArrayList arrayList = jrVar.B;
        long j10 = this.f41575b;
        int i10 = this.f41574a;
        if (i10 == 0) {
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                TLObject tLObject = (TLObject) arrayList.get(i11);
                if (tLObject instanceof TLRPC.ChannelParticipant) {
                    if (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) == j10) {
                        if (i9 == 1) {
                            tL_channelParticipant = new TLRPC.TL_channelParticipantAdmin();
                        } else {
                            tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        }
                        tL_channelParticipant.admin_rights = tL_chatAdminRights;
                        tL_channelParticipant.banned_rights = tL_chatBannedRights;
                        tL_channelParticipant.inviter_id = jrVar.getUserConfig().getClientUserId();
                        if (j10 > 0) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_channelParticipant.peer = tL_peerUser;
                            tL_peerUser.user_id = j10;
                        } else {
                            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                            tL_channelParticipant.peer = tL_peerChannel;
                            tL_peerChannel.channel_id = -j10;
                        }
                        tL_channelParticipant.date = this.f41576c;
                        tL_channelParticipant.flags |= 4;
                        tL_channelParticipant.rank = str;
                        arrayList.set(i11, tL_channelParticipant);
                    }
                } else if (tLObject instanceof TLRPC.ChatParticipant) {
                    TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                    if (i9 == 1) {
                        tL_chatParticipant = new TLRPC.TL_chatParticipantAdmin();
                    } else {
                        tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    }
                    tL_chatParticipant.user_id = chatParticipant.user_id;
                    tL_chatParticipant.date = chatParticipant.date;
                    tL_chatParticipant.inviter_id = chatParticipant.inviter_id;
                    int indexOf = jrVar.f39598s.participants.participants.indexOf(chatParticipant);
                    if (indexOf >= 0) {
                        jrVar.f39598s.participants.participants.set(indexOf, tL_chatParticipant);
                    }
                    jrVar.q0();
                }
                i11++;
            }
            if (i9 == 1 && !this.d) {
                this.f41577e[0] = true;
            }
        } else if (i10 == 1 && i9 == 0) {
            jrVar.u0(j10);
        }
    }
}
