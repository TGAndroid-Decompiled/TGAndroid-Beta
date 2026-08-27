package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class mq implements Comparator {

    public final int f40580a;

    public final int f40581b;

    public final Object f40582c;

    public mq(Object obj, int i10, int i11) {
        this.f40580a = i11;
        this.f40582c = obj;
        this.f40581b = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        switch (this.f40580a) {
            case 0:
                lr lrVar = (lr) this.f40582c;
                lrVar.getClass();
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) ((TLObject) obj);
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) ((TLObject) obj2);
                long peerId = MessageObject.getPeerId(channelParticipant.peer);
                long peerId2 = MessageObject.getPeerId(channelParticipant2.peer);
                int i11 = this.f40581b;
                int i12 = -100;
                if (peerId > 0) {
                    TLRPC.User user = lrVar.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(channelParticipant.peer)));
                    if (user == null || (userStatus2 = user.status) == null) {
                        i10 = 0;
                    } else {
                        i10 = user.self ? i11 + 50000 : userStatus2.expires;
                    }
                } else {
                    i10 = -100;
                }
                if (peerId2 > 0) {
                    TLRPC.User user2 = lrVar.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(channelParticipant2.peer)));
                    if (user2 == null || (userStatus = user2.status) == null) {
                        i12 = 0;
                    } else {
                        i12 = user2.self ? i11 + 50000 : userStatus.expires;
                    }
                }
                if (i10 > 0 && i12 > 0) {
                    if (i10 <= i12) {
                        if (i10 < i12) {
                            return -1;
                        }
                        return 0;
                    }
                }
                if (i10 < 0 && i12 < 0) {
                    if (i10 <= i12) {
                        if (i10 < i12) {
                            return -1;
                        }
                        return 0;
                    }
                }
                if ((i10 >= 0 || i12 <= 0) && (i10 != 0 || i12 == 0)) {
                    return ((i12 >= 0 || i10 <= 0) && (i12 != 0 || i10 == 0)) ? 0 : 1;
                }
                return -1;
            default:
                return org.telegram.ui.Components.g30.M((org.telegram.ui.Components.g30) this.f40582c, this.f40581b, (TLObject) obj, (TLObject) obj2);
        }
    }
}
