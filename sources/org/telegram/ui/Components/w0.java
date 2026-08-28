package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.p91;
public final class w0 implements ToLongFunction {
    public final int f34066a;

    public w0(int i9) {
        this.f34066a = i9;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f34066a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((p91) obj).f41381b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
