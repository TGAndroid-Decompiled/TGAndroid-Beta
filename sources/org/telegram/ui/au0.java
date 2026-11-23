package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class au0 implements Runnable {
    public final int f45812a;
    public final ProfileActivity f45813b;
    public final TLRPC.TL_error f45814c;
    public final TLObject d;
    public final TLRPC.TL_channels_getParticipants f45815e;

    public au0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i7) {
        this.f45812a = i7;
        this.f45813b = profileActivity;
        this.f45814c = tL_error;
        this.d = tLObject;
        this.f45815e = tL_channels_getParticipants;
    }

    @Override
    public final void run() {
        switch (this.f45812a) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
                ProfileActivity profileActivity = this.f45813b;
                profileActivity.getNotificationCenter().d(new au0(profileActivity, this.f45814c, this.d, this.f45815e, 1));
                return;
            default:
                ProfileActivity profileActivity2 = this.f45813b;
                if (this.f45814c == null) {
                    RectF rectF2 = ProfileActivity.Z6;
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) this.d;
                    profileActivity2.getMessagesController().f4(tL_channels_channelParticipants.users, false);
                    profileActivity2.getMessagesController().Z3(tL_channels_channelParticipants.chats, false);
                    if (tL_channels_channelParticipants.users.size() < 200) {
                        profileActivity2.D1 = true;
                    }
                    if (this.f45815e.offset == 0) {
                        profileActivity2.C1.b();
                        profileActivity2.f43783v2.participants = new TLRPC.TL_chatParticipants();
                        profileActivity2.getMessagesStorage().m1(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                        org.telegram.messenger.tr messagesStorage = profileActivity2.getMessagesStorage();
                        messagesStorage.f27149a.c(new org.telegram.messenger.gr(messagesStorage, profileActivity2.f43674f1, tL_channels_channelParticipants.participants, 3));
                    }
                    for (int i7 = 0; i7 < tL_channels_channelParticipants.participants.size(); i7++) {
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i7);
                        tL_chatChannelParticipant.channelParticipant = channelParticipant;
                        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                        long B1 = org.telegram.messenger.fj.B1(channelParticipant.peer);
                        tL_chatChannelParticipant.user_id = B1;
                        tL_chatChannelParticipant.date = tL_chatChannelParticipant.channelParticipant.date;
                        if (profileActivity2.C1.h(B1) < 0) {
                            TLRPC.ChatFull chatFull = profileActivity2.f43783v2;
                            if (chatFull.participants == null) {
                                chatFull.participants = new TLRPC.TL_chatParticipants();
                            }
                            profileActivity2.f43783v2.participants.participants.add(tL_chatChannelParticipant);
                            profileActivity2.C1.k(tL_chatChannelParticipant, tL_chatChannelParticipant.user_id);
                        }
                    }
                }
                profileActivity2.B1 = false;
                profileActivity2.W4();
                profileActivity2.H5(true, false);
                return;
        }
    }
}
