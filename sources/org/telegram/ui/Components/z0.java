package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.cb1;
public final class z0 implements ToLongFunction {
    public final int f29550a;

    public z0(int i10) {
        this.f29550a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f29550a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((cb1) obj).f31603b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
