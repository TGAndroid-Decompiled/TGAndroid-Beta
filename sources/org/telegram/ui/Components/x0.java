package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.wa1;
public final class x0 implements ToLongFunction {
    public final int f29833a;

    public x0(int i10) {
        this.f29833a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f29833a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((wa1) obj).f38764b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
