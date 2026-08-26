package org.telegram.ui.Gifts;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.tl.TL_stars;

public final class GiftSheet$$ExternalSyntheticLambda20 implements Predicate {
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
        return !((TL_stars.StarGift) obj).auction;
    }
}
