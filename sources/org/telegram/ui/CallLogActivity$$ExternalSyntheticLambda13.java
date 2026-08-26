package org.telegram.ui;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AlertsCreator;

public final class CallLogActivity$$ExternalSyntheticLambda13 implements Predicate {
    public final int $r8$classId;
    public final long f$0;

    public CallLogActivity$$ExternalSyntheticLambda13(long j, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
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
                return CallLogActivity.lambda$getCalls$18(this.f$0, (TLRPC.User) obj);
            case 1:
                return CallLogActivity.lambda$getCalls$19(this.f$0, (TLRPC.User) obj);
            default:
                return AlertsCreator.lambda$createDeleteMessagesAlert$227(this.f$0, (TLObject) obj);
        }
    }
}
