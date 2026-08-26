package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ProfileActivity$$ExternalSyntheticLambda127 implements Runnable {
    public final int $r8$classId;
    public final ProfileActivity f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;
    public final TLRPC.TL_channels_getParticipants f$3;

    public ProfileActivity$$ExternalSyntheticLambda127(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$3 = tL_channels_getParticipants;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity profileActivity = this.f$0;
                profileActivity.getNotificationCenter().doOnIdle(new ProfileActivity$$ExternalSyntheticLambda127(profileActivity, this.f$1, this.f$2, this.f$3, 1));
                break;
            default:
                ProfileActivity profileActivity2 = this.f$0;
                if (this.f$1 == null) {
                    profileActivity2.getClass();
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) this.f$2;
                    profileActivity2.getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
                    profileActivity2.getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
                    if (tL_channels_channelParticipants.users.size() < 200) {
                        profileActivity2.usersEndReached = true;
                    }
                    if (this.f$3.offset == 0) {
                        profileActivity2.participantsMap.clear();
                        profileActivity2.chatInfo.participants = new TLRPC.TL_chatParticipants();
                        profileActivity2.getMessagesStorage().putUsersAndChats(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                        profileActivity2.getMessagesStorage().updateChannelUsers(profileActivity2.chatId, tL_channels_channelParticipants.participants);
                    }
                    for (int i = 0; i < tL_channels_channelParticipants.participants.size(); i++) {
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
                        tL_chatChannelParticipant.channelParticipant = channelParticipant;
                        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                        long peerId = MessageObject.getPeerId(channelParticipant.peer);
                        tL_chatChannelParticipant.user_id = peerId;
                        tL_chatChannelParticipant.date = tL_chatChannelParticipant.channelParticipant.date;
                        if (profileActivity2.participantsMap.indexOfKey(peerId) < 0) {
                            TLRPC.ChatFull chatFull = profileActivity2.chatInfo;
                            if (chatFull.participants == null) {
                                chatFull.participants = new TLRPC.TL_chatParticipants();
                            }
                            profileActivity2.chatInfo.participants.participants.add(tL_chatChannelParticipant);
                            profileActivity2.participantsMap.put(tL_chatChannelParticipant, tL_chatChannelParticipant.user_id);
                        }
                    }
                }
                profileActivity2.loadingUsers = false;
                profileActivity2.saveScrollPosition$1();
                profileActivity2.updateListAnimated(true, false);
                break;
        }
    }
}
