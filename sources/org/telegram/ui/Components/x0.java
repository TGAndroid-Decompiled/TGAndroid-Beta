package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.pa1;
public final class x0 implements ToLongFunction {
    public final int f30224a;

    public x0(int i10) {
        this.f30224a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f30224a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((pa1) obj).f36486b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
