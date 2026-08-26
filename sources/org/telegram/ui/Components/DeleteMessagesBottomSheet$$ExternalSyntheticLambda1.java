package org.telegram.ui.Components;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class DeleteMessagesBottomSheet$$ExternalSyntheticLambda1 implements Predicate {
    public final int $r8$classId;
    public final TLObject f$0;

    public DeleteMessagesBottomSheet$$ExternalSyntheticLambda1(TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = tLObject;
    }

    public final Predicate and(Predicate predicate) {
        int i = this.$r8$classId;
        return Predicate$CC.$default$and(this, predicate);
    }

    public final Predicate negate() {
        switch (this.$r8$classId) {
            case 0:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    public final Predicate or(Predicate predicate) {
        int i = this.$r8$classId;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return DeleteMessagesBottomSheet.lambda$updateParticipantMessageCounts$5((TLRPC.InputPeer) this.f$0, (MessageObject) obj);
            default:
                return DeleteMessagesBottomSheet.lambda$performDelete$20(this.f$0, (MessageObject) obj);
        }
    }
}
