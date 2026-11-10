package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class eu0 implements Runnable {
    public final int f45446a;
    public final ProfileActivity f45447b;
    public final TLRPC.TL_error f45448c;
    public final TLObject d;
    public final TLRPC.TL_channels_getParticipants f45449e;

    public eu0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i7) {
        this.f45446a = i7;
        this.f45447b = profileActivity;
        this.f45448c = tL_error;
        this.d = tLObject;
        this.f45449e = tL_channels_getParticipants;
    }

    @Override
    public final void run() {
        switch (this.f45446a) {
            case 0:
                RectF rectF = ProfileActivity.V6;
                ProfileActivity profileActivity = this.f45447b;
                profileActivity.getNotificationCenter().d(new eu0(profileActivity, this.f45448c, this.d, this.f45449e, 1));
                return;
            default:
                ProfileActivity profileActivity2 = this.f45447b;
                if (this.f45448c == null) {
                    RectF rectF2 = ProfileActivity.V6;
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) this.d;
                    profileActivity2.getMessagesController().Y3(tL_channels_channelParticipants.users, false);
                    profileActivity2.getMessagesController().S3(tL_channels_channelParticipants.chats, false);
                    if (tL_channels_channelParticipants.users.size() < 200) {
                        profileActivity2.C1 = true;
                    }
                    if (this.f45449e.offset == 0) {
                        profileActivity2.B1.b();
                        profileActivity2.f41825t2.participants = new TLRPC.TL_chatParticipants();
                        profileActivity2.getMessagesStorage().m1(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                        org.telegram.messenger.yr messagesStorage = profileActivity2.getMessagesStorage();
                        messagesStorage.f26723a.c(new org.telegram.messenger.lr(messagesStorage, profileActivity2.f41721e1, tL_channels_channelParticipants.participants, 2));
                    }
                    for (int i7 = 0; i7 < tL_channels_channelParticipants.participants.size(); i7++) {
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i7);
                        tL_chatChannelParticipant.channelParticipant = channelParticipant;
                        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                        long B1 = org.telegram.messenger.ij.B1(channelParticipant.peer);
                        tL_chatChannelParticipant.user_id = B1;
                        tL_chatChannelParticipant.date = tL_chatChannelParticipant.channelParticipant.date;
                        if (profileActivity2.B1.h(B1) < 0) {
                            TLRPC.ChatFull chatFull = profileActivity2.f41825t2;
                            if (chatFull.participants == null) {
                                chatFull.participants = new TLRPC.TL_chatParticipants();
                            }
                            profileActivity2.f41825t2.participants.participants.add(tL_chatChannelParticipant);
                            profileActivity2.B1.k(tL_chatChannelParticipant, tL_chatChannelParticipant.user_id);
                        }
                    }
                }
                profileActivity2.A1 = false;
                profileActivity2.W4();
                profileActivity2.G5(true, false);
                return;
        }
    }
}
