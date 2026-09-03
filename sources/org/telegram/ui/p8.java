package org.telegram.ui;

import j$.util.function.Function$CC;
import java.util.function.Function;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class p8 implements Function {
    public final int f36992a;

    public p8(int i10) {
        this.f36992a = i10;
    }

    public Function andThen(Function function) {
        int i10 = this.f36992a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.f36992a) {
            case 0:
                return Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) obj));
            case 1:
                return Long.valueOf(((MessageObject) obj).getFromChatId());
            case 2:
                return Integer.valueOf(((MessageObject) obj).getId());
            case 3:
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj;
                if (channelParticipant == null) {
                    return null;
                }
                return channelParticipant.banned_rights;
            case 4:
                return Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.GroupCallParticipant) obj).peer));
            case 5:
                return Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.GroupCallParticipant) obj).peer));
            case 6:
                return ((ut) obj).f38913a;
            default:
                return ((ut) obj).f38913a;
        }
    }

    public Function compose(Function function) {
        int i10 = this.f36992a;
        return Function$CC.$default$compose(this, function);
    }
}
