package org.telegram.ui;

import android.telephony.PhoneNumberUtils;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;

public final class a80 implements Predicate {

    public final int f36451a;

    public final Object f36452b;

    public a80(Object obj, int i10) {
        this.f36451a = i10;
        this.f36452b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f36451a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f36451a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f36451a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f36451a) {
            case 0:
                String str = (String) obj;
                return str != null && str.equals((String) this.f36452b);
            case 1:
                return PhoneNumberUtils.compare((String) this.f36452b, (String) obj);
            case 2:
                String str2 = (String) obj;
                return str2 != null && str2.equals((String) this.f36452b);
            default:
                return rn.v1((rn) this.f36452b, (TLRPC.MessageEntity) obj);
        }
    }
}
