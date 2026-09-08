package org.telegram.ui;

import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class ab implements Predicate {
    public final int f34396a;

    public ab(int i10) {
        this.f34396a = i10;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f34396a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f34396a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            case 2:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f34396a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f34396a) {
            case 0:
                if (((String) obj) != null) {
                    return true;
                }
                return false;
            case 1:
                return !((MessageObject) obj).isEphemeral();
            case 2:
                return Objects.nonNull((TLObject) obj);
            default:
                return !((TL_stars.StarGift) obj).auction;
        }
    }
}
