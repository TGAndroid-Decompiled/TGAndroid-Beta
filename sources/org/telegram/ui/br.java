package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class br implements kq {
    public final int f32445a;
    public final long f32446b;
    public final int f32447c;
    public final boolean d;
    public final boolean[] e;
    public final sr f32448f;

    public br(sr srVar, int i10, long j3, int i11, boolean z10, boolean[] zArr) {
        this.f32448f = srVar;
        this.f32445a = i10;
        this.f32446b = j3;
        this.f32447c = i11;
        this.d = z10;
        this.e = zArr;
    }

    @Override
    public final void a(TLRPC.User user) {
        sr.c0(this.f32448f, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.ChatParticipant tL_chatParticipant;
        TLRPC.ChannelParticipant tL_channelParticipant;
        sr srVar = this.f32448f;
        ArrayList arrayList = srVar.F;
        long j3 = this.f32446b;
        int i11 = this.f32445a;
        if (i11 == 0) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                TLObject tLObject = (TLObject) arrayList.get(i12);
                if (tLObject instanceof TLRPC.ChannelParticipant) {
                    if (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) == j3) {
                        if (i10 == 1) {
                            tL_channelParticipant = new TLRPC.TL_channelParticipantAdmin();
                        } else {
                            tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        }
                        tL_channelParticipant.admin_rights = tL_chatAdminRights;
                        tL_channelParticipant.banned_rights = tL_chatBannedRights;
                        tL_channelParticipant.inviter_id = srVar.getUserConfig().getClientUserId();
                        if (j3 > 0) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_channelParticipant.peer = tL_peerUser;
                            tL_peerUser.user_id = j3;
                        } else {
                            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                            tL_channelParticipant.peer = tL_peerChannel;
                            tL_peerChannel.channel_id = -j3;
                        }
                        tL_channelParticipant.date = this.f32447c;
                        tL_channelParticipant.flags |= 4;
                        tL_channelParticipant.rank = str;
                        arrayList.set(i12, tL_channelParticipant);
                    }
                } else if (tLObject instanceof TLRPC.ChatParticipant) {
                    TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                    if (i10 == 1) {
                        tL_chatParticipant = new TLRPC.TL_chatParticipantAdmin();
                    } else {
                        tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    }
                    tL_chatParticipant.user_id = chatParticipant.user_id;
                    tL_chatParticipant.date = chatParticipant.date;
                    tL_chatParticipant.inviter_id = chatParticipant.inviter_id;
                    int indexOf = srVar.f37432s.participants.participants.indexOf(chatParticipant);
                    if (indexOf >= 0) {
                        srVar.f37432s.participants.participants.set(indexOf, tL_chatParticipant);
                    }
                    srVar.r0();
                }
                i12++;
            }
            if (i10 == 1 && !this.d) {
                this.e[0] = true;
            }
        } else if (i11 == 1 && i10 == 0) {
            srVar.v0(j3);
        }
    }
}
