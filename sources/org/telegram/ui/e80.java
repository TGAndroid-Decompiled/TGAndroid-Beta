package org.telegram.ui;

import android.telephony.PhoneNumberUtils;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
public final class e80 implements Predicate {
    public final int f36848a;
    public final Object f36849b;

    public e80(Object obj, int i10) {
        this.f36848a = i10;
        this.f36849b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f36848a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f36848a) {
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
        int i10 = this.f36848a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f36848a) {
            case 0:
                String str = (String) this.f36849b;
                String str2 = (String) obj;
                if (str2 != null && str2.equals(str)) {
                    return true;
                }
                return false;
            case 1:
                return PhoneNumberUtils.compare((String) this.f36849b, (String) obj);
            case 2:
                String str3 = (String) this.f36849b;
                String str4 = (String) obj;
                if (str4 != null && str4.equals(str3)) {
                    return true;
                }
                return false;
            default:
                return sn.T0((sn) this.f36849b, (TLRPC.MessageEntity) obj);
        }
    }
}
