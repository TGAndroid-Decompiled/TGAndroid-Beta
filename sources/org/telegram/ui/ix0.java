package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ix0 implements Runnable {

    public final int f39170a;

    public final ProfileActivity f39171b;

    public final TLRPC.TL_error f39172c;
    public final TLObject d;

    public final TLRPC.TL_channels_getParticipants f39173e;

    public ix0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f39170a = i10;
        this.f39171b = profileActivity;
        this.f39172c = tL_error;
        this.d = tLObject;
        this.f39173e = tL_channels_getParticipants;
    }

    @Override
    public final void run() {
        switch (this.f39170a) {
            case 0:
                ProfileActivity profileActivity = this.f39171b;
                profileActivity.getNotificationCenter().doOnIdle(new ix0(profileActivity, this.f39172c, this.d, this.f39173e, 1));
                break;
            default:
                ProfileActivity profileActivity2 = this.f39171b;
                if (this.f39172c == null) {
                    profileActivity2.getClass();
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) this.d;
                    profileActivity2.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
                    profileActivity2.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
                    if (tL_channels_channelParticipants.users.size() < 200) {
                        profileActivity2.f36094z1 = true;
                    }
                    if (this.f39173e.offset == 0) {
                        profileActivity2.f36088y1.b();
                        profileActivity2.f36036q2.participants = new TLRPC.TL_chatParticipants();
                        profileActivity2.getMessagesStorage().putUsersAndChats(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                        profileActivity2.getMessagesStorage().updateChannelUsers(profileActivity2.f35929b1, tL_channels_channelParticipants.participants);
                    }
                    for (int i10 = 0; i10 < tL_channels_channelParticipants.participants.size(); i10++) {
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        tL_chatChannelParticipant.channelParticipant = channelParticipant;
                        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                        long peerId = MessageObject.getPeerId(channelParticipant.peer);
                        tL_chatChannelParticipant.user_id = peerId;
                        tL_chatChannelParticipant.date = tL_chatChannelParticipant.channelParticipant.date;
                        if (profileActivity2.f36088y1.h(peerId) < 0) {
                            TLRPC.ChatFull chatFull = profileActivity2.f36036q2;
                            if (chatFull.participants == null) {
                                chatFull.participants = new TLRPC.TL_chatParticipants();
                            }
                            profileActivity2.f36036q2.participants.participants.add(tL_chatChannelParticipant);
                            profileActivity2.f36088y1.k(tL_chatChannelParticipant, tL_chatChannelParticipant.user_id);
                        }
                    }
                }
                profileActivity2.f36081x1 = false;
                profileActivity2.F4();
                profileActivity2.e5(true, false);
                break;
        }
    }
}
