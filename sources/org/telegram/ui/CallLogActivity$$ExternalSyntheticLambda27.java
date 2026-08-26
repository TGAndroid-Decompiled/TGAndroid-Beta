package org.telegram.ui;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class CallLogActivity$$ExternalSyntheticLambda27 implements Predicate {
    public final int $r8$classId;
    public final long f$0;

    public CallLogActivity$$ExternalSyntheticLambda27(long j, int i) {
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
                return ((TLRPC.User) obj).id == this.f$0;
            case 1:
                return ((TLRPC.User) obj).id == this.f$0;
            default:
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    if (((TLRPC.User) tLObject).id != this.f$0) {
                        return true;
                    }
                } else if (tLObject instanceof TLRPC.Chat) {
                    return true ^ ChatObject.hasAdminRights((TLRPC.Chat) tLObject);
                }
                return false;
        }
    }
}
