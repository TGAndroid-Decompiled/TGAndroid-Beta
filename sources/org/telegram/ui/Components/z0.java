package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.q91;
public final class z0 implements ToLongFunction {
    public final int f35165a;

    public z0(int i10) {
        this.f35165a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f35165a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((q91) obj).f41602b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
