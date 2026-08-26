package org.telegram.ui;

import j$.util.function.Function$CC;
import java.util.function.Function;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class GroupCallSheet$$ExternalSyntheticLambda3 implements Function {
    public final int $r8$classId;

    public GroupCallSheet$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    public final Function andThen(Function function) {
        int i = this.$r8$classId;
        return Function$CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.GroupCallParticipant) obj).peer));
            case 1:
                return Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) obj));
            case 2:
                return Long.valueOf(((MessageObject) obj).getFromChatId());
            case 3:
                return Integer.valueOf(((MessageObject) obj).getId());
            case 4:
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj;
                if (channelParticipant == null) {
                    return null;
                }
                return channelParticipant.banned_rights;
            case 5:
                return Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.GroupCallParticipant) obj).peer));
            case 6:
                return ((CountrySelectActivity.Country) obj).name;
            default:
                return ((CountrySelectActivity.Country) obj).name;
        }
    }

    public final Function compose(Function function) {
        int i = this.$r8$classId;
        return Function$CC.$default$compose(this, function);
    }
}
