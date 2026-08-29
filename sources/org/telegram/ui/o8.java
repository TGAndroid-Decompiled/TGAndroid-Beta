package org.telegram.ui;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Predicate {
    public final int f41001a;
    public final long f41002b;

    public o8(long j10, int i10) {
        this.f41001a = i10;
        this.f41002b = j10;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f41001a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f41001a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f41001a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f41001a) {
            case 0:
                if (((TLRPC.User) obj).f22539id == this.f41002b) {
                    return true;
                }
                return false;
            case 1:
                if (((TLRPC.User) obj).f22539id == this.f41002b) {
                    return true;
                }
                return false;
            default:
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    if (((TLRPC.User) tLObject).f22539id != this.f41002b) {
                        return true;
                    }
                } else if (tLObject instanceof TLRPC.Chat) {
                    return true ^ ChatObject.hasAdminRights((TLRPC.Chat) tLObject);
                }
                return false;
        }
    }
}
