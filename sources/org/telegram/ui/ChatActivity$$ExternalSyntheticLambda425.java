package org.telegram.ui;

import android.telephony.PhoneNumberUtils;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;

public final class ChatActivity$$ExternalSyntheticLambda425 implements Predicate {
    public final int $r8$classId;
    public final Object f$0;

    public ChatActivity$$ExternalSyntheticLambda425(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
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
            case 2:
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
                return ((ChatActivity) this.f$0).lambda$applyChatLinkMessageMaybe$246((TLRPC.MessageEntity) obj);
            case 1:
                return LanguageSelectActivity.lambda$createView$3((String) this.f$0, (String) obj);
            case 2:
                return PhoneNumberUtils.compare((String) this.f$0, (String) obj);
            default:
                return RestrictedLanguagesSelectActivity.lambda$createView$0((String) this.f$0, (String) obj);
        }
    }
}
