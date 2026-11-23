package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cu0 implements Runnable {
    public final int f46645a;
    public final ProfileActivity f46646b;
    public final TLRPC.TL_error f46647c;
    public final TLObject d;
    public final TLRPC.TL_channels_getParticipants f46648e;

    public cu0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i7) {
        this.f46645a = i7;
        this.f46646b = profileActivity;
        this.f46647c = tL_error;
        this.d = tLObject;
        this.f46648e = tL_channels_getParticipants;
    }

    @Override
    public final void run() {
        switch (this.f46645a) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
                ProfileActivity profileActivity = this.f46646b;
                profileActivity.getNotificationCenter().d(new cu0(profileActivity, this.f46647c, this.d, this.f46648e, 1));
                return;
            default:
                ProfileActivity profileActivity2 = this.f46646b;
                if (this.f46647c == null) {
                    RectF rectF2 = ProfileActivity.Z6;
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) this.d;
                    profileActivity2.getMessagesController().f4(tL_channels_channelParticipants.users, false);
                    profileActivity2.getMessagesController().Z3(tL_channels_channelParticipants.chats, false);
                    if (tL_channels_channelParticipants.users.size() < 200) {
                        profileActivity2.D1 = true;
                    }
                    if (this.f46648e.offset == 0) {
                        profileActivity2.C1.b();
                        profileActivity2.f43667v2.participants = new TLRPC.TL_chatParticipants();
                        profileActivity2.getMessagesStorage().m1(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                        org.telegram.messenger.ur messagesStorage = profileActivity2.getMessagesStorage();
                        messagesStorage.f27214a.c(new org.telegram.messenger.hr(messagesStorage, profileActivity2.f43558f1, tL_channels_channelParticipants.participants, 3));
                    }
                    for (int i7 = 0; i7 < tL_channels_channelParticipants.participants.size(); i7++) {
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i7);
                        tL_chatChannelParticipant.channelParticipant = channelParticipant;
                        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                        long B1 = org.telegram.messenger.gj.B1(channelParticipant.peer);
                        tL_chatChannelParticipant.user_id = B1;
                        tL_chatChannelParticipant.date = tL_chatChannelParticipant.channelParticipant.date;
                        if (profileActivity2.C1.h(B1) < 0) {
                            TLRPC.ChatFull chatFull = profileActivity2.f43667v2;
                            if (chatFull.participants == null) {
                                chatFull.participants = new TLRPC.TL_chatParticipants();
                            }
                            profileActivity2.f43667v2.participants.participants.add(tL_chatChannelParticipant);
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
