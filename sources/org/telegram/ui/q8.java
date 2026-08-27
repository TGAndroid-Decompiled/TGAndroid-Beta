package org.telegram.ui;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class q8 implements Predicate {

    public final int f41536a;

    public final long f41537b;

    public q8(long j10, int i10) {
        this.f41536a = i10;
        this.f41537b = j10;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f41536a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f41536a) {
            case 0:
                break;
            case 1:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f41536a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f41536a) {
            case 0:
                return ((TLRPC.User) obj).f22527id == this.f41537b;
            case 1:
                return ((TLRPC.User) obj).f22527id == this.f41537b;
            default:
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    if (((TLRPC.User) tLObject).f22527id != this.f41537b) {
                        return true;
                    }
                } else if (tLObject instanceof TLRPC.Chat) {
                    return true ^ ChatObject.hasAdminRights((TLRPC.Chat) tLObject);
                }
                return false;
        }
    }
}
