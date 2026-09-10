package org.telegram.ui;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q8 implements Predicate {
    public final int f35988a;
    public final long f35989b;

    public q8(long j3, int i10) {
        this.f35988a = i10;
        this.f35989b = j3;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f35988a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f35988a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f35988a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f35988a) {
            case 0:
                if (((TLRPC.User) obj).f17342id == this.f35989b) {
                    return true;
                }
                return false;
            case 1:
                if (((TLRPC.User) obj).f17342id == this.f35989b) {
                    return true;
                }
                return false;
            default:
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    if (((TLRPC.User) tLObject).f17342id != this.f35989b) {
                        return true;
                    }
                } else if (tLObject instanceof TLRPC.Chat) {
                    return true ^ ChatObject.hasAdminRights((TLRPC.Chat) tLObject);
                }
                return false;
        }
    }
}
