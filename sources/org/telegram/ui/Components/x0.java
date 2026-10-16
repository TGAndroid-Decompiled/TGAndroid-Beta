package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.eb1;
public final class x0 implements ToLongFunction {
    public final int f30786a;

    public x0(int i10) {
        this.f30786a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f30786a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((eb1) obj).f35246b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
