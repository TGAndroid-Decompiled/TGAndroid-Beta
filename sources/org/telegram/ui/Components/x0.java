package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.va1;
public final class x0 implements ToLongFunction {
    public final int f29836a;

    public x0(int i10) {
        this.f29836a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f29836a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((va1) obj).f38488b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
