package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.GroupVoipInviteAlert;

public final class ChatUsersActivity$$ExternalSyntheticLambda10 implements Comparator {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public ChatUsersActivity$$ExternalSyntheticLambda10(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLObject tLObject = (TLObject) obj;
        TLObject tLObject2 = (TLObject) obj2;
        switch (this.$r8$classId) {
            case 0:
                ChatUsersActivity chatUsersActivity = (ChatUsersActivity) this.f$0;
                chatUsersActivity.getClass();
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject2;
                long peerId = MessageObject.getPeerId(channelParticipant.peer);
                long peerId2 = MessageObject.getPeerId(channelParticipant2.peer);
                int i2 = this.f$1;
                int i3 = -100;
                if (peerId > 0) {
                    TLRPC.User user = chatUsersActivity.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(channelParticipant.peer)));
                    if (user == null || (userStatus2 = user.status) == null) {
                        i = 0;
                    } else {
                        i = user.self ? i2 + 50000 : userStatus2.expires;
                    }
                } else {
                    i = -100;
                }
                if (peerId2 > 0) {
                    TLRPC.User user2 = chatUsersActivity.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(channelParticipant2.peer)));
                    if (user2 == null || (userStatus = user2.status) == null) {
                        i3 = 0;
                    } else {
                        i3 = user2.self ? i2 + 50000 : userStatus.expires;
                    }
                }
                if (i > 0 && i3 > 0) {
                    if (i <= i3) {
                        if (i < i3) {
                            return -1;
                        }
                        return 0;
                    }
                }
                if (i < 0 && i3 < 0) {
                    if (i <= i3) {
                        if (i < i3) {
                            return -1;
                        }
                        return 0;
                    }
                }
                if ((i >= 0 || i3 <= 0) && (i != 0 || i3 == 0)) {
                    return ((i3 >= 0 || i <= 0) && (i3 != 0 || i == 0)) ? 0 : 1;
                }
                return -1;
            default:
                return ((GroupVoipInviteAlert) this.f$0).lambda$loadChatParticipants$2(this.f$1, tLObject, tLObject2);
        }
    }
}
