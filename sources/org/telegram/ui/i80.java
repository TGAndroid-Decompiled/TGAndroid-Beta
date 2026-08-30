package org.telegram.ui;

import android.telephony.PhoneNumberUtils;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
public final class i80 implements Predicate {
    public final int f35042a;
    public final Object f35043b;

    public i80(Object obj, int i10) {
        this.f35042a = i10;
        this.f35043b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f35042a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f35042a) {
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
        int i10 = this.f35042a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f35042a) {
            case 0:
                String str = (String) this.f35043b;
                String str2 = (String) obj;
                if (str2 != null && str2.equals(str)) {
                    return true;
                }
                return false;
            case 1:
                return PhoneNumberUtils.compare((String) this.f35043b, (String) obj);
            case 2:
                String str3 = (String) this.f35043b;
                String str4 = (String) obj;
                if (str4 != null && str4.equals(str3)) {
                    return true;
                }
                return false;
            default:
                return xn.v1((xn) this.f35043b, (TLRPC.MessageEntity) obj);
        }
    }
}
