package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.xa1;
public final class x0 implements ToLongFunction {
    public final int f29796a;

    public x0(int i10) {
        this.f29796a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f29796a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((xa1) obj).f39506b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
