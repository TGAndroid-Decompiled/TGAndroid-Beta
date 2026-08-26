package org.telegram.ui;

import android.telephony.PhoneNumberUtils;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

public final class LanguageSelectActivity$$ExternalSyntheticLambda9 implements Predicate {
    public final int $r8$classId;
    public final String f$0;

    public LanguageSelectActivity$$ExternalSyntheticLambda9(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
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
        String str = (String) obj;
        switch (this.$r8$classId) {
            case 0:
                return str != null && str.equals(this.f$0);
            case 1:
                return PhoneNumberUtils.compare(this.f$0, str);
            default:
                return str != null && str.equals(this.f$0);
        }
    }
}
