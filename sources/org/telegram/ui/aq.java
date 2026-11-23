package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class aq implements kp {
    public final int f45786a;
    public final long f45787b;
    public final int f45788c;
    public final boolean d;
    public final boolean[] f45789e;
    public final rq f45790f;

    public aq(rq rqVar, int i7, long j3, int i10, boolean z10, boolean[] zArr) {
        this.f45790f = rqVar;
        this.f45786a = i7;
        this.f45787b = j3;
        this.f45788c = i10;
        this.d = z10;
        this.f45789e = zArr;
    }

    @Override
    public final void a(TLRPC.User user) {
        rq.h0(this.f45790f, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.ChatParticipant tL_chatParticipant;
        TLRPC.ChannelParticipant tL_channelParticipant;
        rq rqVar = this.f45790f;
        ArrayList arrayList = rqVar.F;
        long j3 = this.f45787b;
        int i10 = this.f45786a;
        if (i10 == 0) {
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                TLObject tLObject = (TLObject) arrayList.get(i11);
                if (tLObject instanceof TLRPC.ChannelParticipant) {
                    if (org.telegram.messenger.fj.B1(((TLRPC.ChannelParticipant) tLObject).peer) == j3) {
                        if (i7 == 1) {
                            tL_channelParticipant = new TLRPC.TL_channelParticipantAdmin();
                        } else {
                            tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        }
                        tL_channelParticipant.admin_rights = tL_chatAdminRights;
                        tL_channelParticipant.banned_rights = tL_chatBannedRights;
                        tL_channelParticipant.inviter_id = rqVar.getUserConfig().e();
                        if (j3 > 0) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_channelParticipant.peer = tL_peerUser;
                            tL_peerUser.user_id = j3;
                        } else {
                            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                            tL_channelParticipant.peer = tL_peerChannel;
                            tL_peerChannel.channel_id = -j3;
                        }
                        tL_channelParticipant.date = this.f45788c;
                        tL_channelParticipant.flags |= 4;
                        tL_channelParticipant.rank = str;
                        arrayList.set(i11, tL_channelParticipant);
                    }
                } else if (tLObject instanceof TLRPC.ChatParticipant) {
                    TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                    if (i7 == 1) {
                        tL_chatParticipant = new TLRPC.TL_chatParticipantAdmin();
                    } else {
                        tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    }
                    tL_chatParticipant.user_id = chatParticipant.user_id;
                    tL_chatParticipant.date = chatParticipant.date;
                    tL_chatParticipant.inviter_id = chatParticipant.inviter_id;
                    int indexOf = rqVar.f51847r.participants.participants.indexOf(chatParticipant);
                    if (indexOf >= 0) {
                        rqVar.f51847r.participants.participants.set(indexOf, tL_chatParticipant);
                    }
                    rqVar.w0();
                }
                i11++;
            }
            if (i7 == 1 && !this.d) {
                this.f45789e[0] = true;
            }
        } else if (i10 == 1 && i7 == 0) {
            rqVar.A0(j3);
        }
    }
}
