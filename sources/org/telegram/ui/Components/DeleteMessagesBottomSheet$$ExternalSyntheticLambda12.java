package org.telegram.ui.Components;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.MessageObject;

public final class DeleteMessagesBottomSheet$$ExternalSyntheticLambda12 implements Predicate {
    public final int $r8$classId;
    public final DeleteMessagesBottomSheet f$0;

    public DeleteMessagesBottomSheet$$ExternalSyntheticLambda12(DeleteMessagesBottomSheet deleteMessagesBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = deleteMessagesBottomSheet;
    }

    public final Predicate and(Predicate predicate) {
        int i = this.$r8$classId;
        return Predicate$CC.$default$and(this, predicate);
    }

    public final Predicate negate() {
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
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
                return this.f$0.lambda$performDelete$19((MessageObject) obj);
            case 1:
                return this.f$0.lambda$performDelete$15((MessageObject) obj);
            default:
                return this.f$0.lambda$performDelete$16((MessageObject) obj);
        }
    }
}
