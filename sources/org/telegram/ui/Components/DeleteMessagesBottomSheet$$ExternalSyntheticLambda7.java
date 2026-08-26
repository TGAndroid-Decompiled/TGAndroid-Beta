package org.telegram.ui.Components;

import j$.util.function.Function$CC;
import java.util.function.Function;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class DeleteMessagesBottomSheet$$ExternalSyntheticLambda7 implements Function {
    public final int $r8$classId;

    public DeleteMessagesBottomSheet$$ExternalSyntheticLambda7(int i) {
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
                return DeleteMessagesBottomSheet.lambda$new$3((TLRPC.ChannelParticipant) obj);
            default:
                return Integer.valueOf(((MessageObject) obj).getId());
        }
    }

    public final Function compose(Function function) {
        int i = this.$r8$classId;
        return Function$CC.$default$compose(this, function);
    }
}
