package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class av0 implements fp {
    public final int f43849a;
    public final TLRPC.ChatParticipant f43850b;
    public final boolean f43851c;
    public final boolean[] d;
    public final ProfileActivity f43852e;

    public av0(ProfileActivity profileActivity, int i3, TLRPC.ChatParticipant chatParticipant, boolean z10, boolean[] zArr) {
        this.f43852e = profileActivity;
        this.f43849a = i3;
        this.f43850b = chatParticipant;
        this.f43851c = z10;
        this.d = zArr;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i3;
        ProfileActivity profileActivity = this.f43852e;
        UndoView undoView = profileActivity.M;
        long j10 = -profileActivity.f41759f1;
        if (profileActivity.E2.megagroup) {
            i3 = 10;
        } else {
            i3 = 9;
        }
        undoView.m(j10, user, i3);
    }

    @Override
    public final void b(int i3, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.ChatFull chatFull;
        boolean z10;
        TLRPC.ChatParticipant tL_chatParticipant;
        int i10 = 0;
        TLRPC.ChatParticipant chatParticipant = this.f43850b;
        ProfileActivity profileActivity = this.f43852e;
        int i11 = this.f43849a;
        if (i11 == 0) {
            if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                if (i3 == 1) {
                    TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                    tL_chatChannelParticipant.channelParticipant = tL_channelParticipantAdmin;
                    tL_channelParticipantAdmin.flags |= 4;
                } else {
                    tL_chatChannelParticipant.channelParticipant = new TLRPC.TL_channelParticipant();
                }
                tL_chatChannelParticipant.channelParticipant.inviter_id = profileActivity.getUserConfig().e();
                tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                channelParticipant.peer.user_id = chatParticipant.user_id;
                channelParticipant.date = chatParticipant.date;
                channelParticipant.banned_rights = tL_chatBannedRights;
                channelParticipant.admin_rights = tL_chatAdminRights;
                channelParticipant.rank = str;
            } else if (chatParticipant != null) {
                if (i3 == 1) {
                    tL_chatParticipant = new TLRPC.TL_chatParticipantAdmin();
                } else {
                    tL_chatParticipant = new TLRPC.TL_chatParticipant();
                }
                tL_chatParticipant.user_id = chatParticipant.user_id;
                tL_chatParticipant.date = chatParticipant.date;
                tL_chatParticipant.inviter_id = chatParticipant.inviter_id;
                int indexOf = profileActivity.f41861u2.participants.participants.indexOf(chatParticipant);
                if (indexOf >= 0) {
                    profileActivity.f41861u2.participants.participants.set(indexOf, tL_chatParticipant);
                }
            }
            if (i3 == 1 && !this.f43851c) {
                this.d[0] = true;
            }
        } else if (i11 == 1 && i3 == 0 && profileActivity.E2.megagroup && (chatFull = profileActivity.f41861u2) != null && chatFull.participants != null) {
            int i12 = 0;
            while (true) {
                if (i12 < profileActivity.f41861u2.participants.participants.size()) {
                    if (org.telegram.messenger.zi.C1(((TLRPC.TL_chatChannelParticipant) profileActivity.f41861u2.participants.participants.get(i12)).channelParticipant.peer) == chatParticipant.user_id) {
                        TLRPC.ChatFull chatFull2 = profileActivity.f41861u2;
                        chatFull2.participants_count--;
                        chatFull2.participants.participants.remove(i12);
                        z10 = true;
                        break;
                    }
                    i12++;
                } else {
                    z10 = false;
                    break;
                }
            }
            TLRPC.ChatFull chatFull3 = profileActivity.f41861u2;
            if (chatFull3 != null && chatFull3.participants != null) {
                while (true) {
                    if (i10 >= profileActivity.f41861u2.participants.participants.size()) {
                        break;
                    } else if (profileActivity.f41861u2.participants.participants.get(i10).user_id == chatParticipant.user_id) {
                        profileActivity.f41861u2.participants.participants.remove(i10);
                        z10 = true;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            if (z10) {
                profileActivity.G5(true);
                profileActivity.J5();
                profileActivity.d.f();
            }
        }
    }
}
