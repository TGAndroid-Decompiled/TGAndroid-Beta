package org.telegram.ui;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

public final class ChannelAdminLogActivity$$ExternalSyntheticLambda30 implements Predicate {
    public final Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public final Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public final Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        return ChannelAdminLogActivity.lambda$actionMessagesDeletedBy$6((String) obj);
    }
}
