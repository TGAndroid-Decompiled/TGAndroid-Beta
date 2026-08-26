package org.telegram.ui.bots;

import j$.util.function.Predicate$CC;
import java.util.HashSet;
import java.util.function.Predicate;

public final class BotStorage$$ExternalSyntheticLambda3 implements Predicate {
    public final int $r8$classId;
    public final HashSet f$0;

    public BotStorage$$ExternalSyntheticLambda3(HashSet hashSet, int i) {
        this.$r8$classId = i;
        this.f$0 = hashSet;
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
        BotStorage.StorageConfig storageConfig = (BotStorage.StorageConfig) obj;
        switch (this.$r8$classId) {
            case 0:
                return !this.f$0.contains(Long.valueOf(storageConfig.user_id));
            default:
                return !this.f$0.contains(Long.valueOf(storageConfig.user_id));
        }
    }
}
