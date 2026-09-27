package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.oa1;
public final class x0 implements ToLongFunction {
    public final int f30220a;

    public x0(int i10) {
        this.f30220a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f30220a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((oa1) obj).f36173b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
