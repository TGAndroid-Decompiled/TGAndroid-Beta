package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class hz0 implements hq {
    public final int f37697a;
    public final TLRPC.ChatParticipant f37698b;
    public final boolean f37699c;
    public final boolean[] d;
    public final ProfileActivity f37700e;

    public hz0(ProfileActivity profileActivity, int i10, TLRPC.ChatParticipant chatParticipant, boolean z4, boolean[] zArr) {
        this.f37700e = profileActivity;
        this.f37697a = i10;
        this.f37698b = chatParticipant;
        this.f37699c = z4;
        this.d = zArr;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i10;
        ProfileActivity profileActivity = this.f37700e;
        UndoView undoView = profileActivity.J;
        long j10 = -profileActivity.f34577c1;
        if (profileActivity.B2.megagroup) {
            i10 = 10;
        } else {
            i10 = 9;
        }
        undoView.m(j10, user, i10);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.ChatFull chatFull;
        boolean z4;
        TLRPC.ChatParticipant tL_chatParticipant;
        int i11 = 0;
        TLRPC.ChatParticipant chatParticipant = this.f37698b;
        ProfileActivity profileActivity = this.f37700e;
        int i12 = this.f37697a;
        if (i12 == 0) {
            if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                if (i10 == 1) {
                    TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                    tL_chatChannelParticipant.channelParticipant = tL_channelParticipantAdmin;
                    tL_channelParticipantAdmin.flags |= 4;
                } else {
                    tL_chatChannelParticipant.channelParticipant = new TLRPC.TL_channelParticipant();
                }
                tL_chatChannelParticipant.channelParticipant.inviter_id = profileActivity.getUserConfig().getClientUserId();
                tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                channelParticipant.peer.user_id = chatParticipant.user_id;
                channelParticipant.date = chatParticipant.date;
                channelParticipant.banned_rights = tL_chatBannedRights;
                channelParticipant.admin_rights = tL_chatAdminRights;
                channelParticipant.rank = str;
            } else if (chatParticipant != null) {
                if (i10 == 1) {
                    tL_chatParticipant = new TLRPC.TL_chatParticipantAdmin();
                } else {
                    tL_chatParticipant = new TLRPC.TL_chatParticipant();
                }
                tL_chatParticipant.user_id = chatParticipant.user_id;
                tL_chatParticipant.date = chatParticipant.date;
                tL_chatParticipant.inviter_id = chatParticipant.inviter_id;
                int indexOf = profileActivity.f34683r2.participants.participants.indexOf(chatParticipant);
                if (indexOf >= 0) {
                    profileActivity.f34683r2.participants.participants.set(indexOf, tL_chatParticipant);
                }
            }
            if (i10 == 1 && !this.f37699c) {
                this.d[0] = true;
            }
        } else if (i12 == 1 && i10 == 0 && profileActivity.B2.megagroup && (chatFull = profileActivity.f34683r2) != null && chatFull.participants != null) {
            int i13 = 0;
            while (true) {
                if (i13 < profileActivity.f34683r2.participants.participants.size()) {
                    if (MessageObject.getPeerId(((TLRPC.TL_chatChannelParticipant) profileActivity.f34683r2.participants.participants.get(i13)).channelParticipant.peer) == chatParticipant.user_id) {
                        TLRPC.ChatFull chatFull2 = profileActivity.f34683r2;
                        chatFull2.participants_count--;
                        chatFull2.participants.participants.remove(i13);
                        z4 = true;
                        break;
                    }
                    i13++;
                } else {
                    z4 = false;
                    break;
                }
            }
            TLRPC.ChatFull chatFull3 = profileActivity.f34683r2;
            if (chatFull3 != null && chatFull3.participants != null) {
                while (true) {
                    if (i11 >= profileActivity.f34683r2.participants.participants.size()) {
                        break;
                    } else if (profileActivity.f34683r2.participants.participants.get(i11).user_id == chatParticipant.user_id) {
                        profileActivity.f34683r2.participants.participants.remove(i11);
                        z4 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            if (z4) {
                profileActivity.h5(true);
                profileActivity.j5();
                profileActivity.d.l();
            }
        }
    }
}
