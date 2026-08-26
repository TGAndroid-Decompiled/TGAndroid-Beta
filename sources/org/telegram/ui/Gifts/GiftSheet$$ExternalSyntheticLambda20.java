package org.telegram.ui.Gifts;

import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

public final class GiftSheet$$ExternalSyntheticLambda20 implements Predicate {
    public final int $r8$classId;

    public GiftSheet$$ExternalSyntheticLambda20(int i) {
        this.$r8$classId = i;
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
            case 2:
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
                return !((TL_stars.StarGift) obj).auction;
            case 1:
                return ((String) obj) != null;
            case 2:
                return !((MessageObject) obj).isEphemeral();
            default:
                return Objects.nonNull((TLObject) obj);
        }
    }
}
