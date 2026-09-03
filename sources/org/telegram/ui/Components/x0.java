package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.la1;
public final class x0 implements ToLongFunction {
    public final int f30396a;

    public x0(int i10) {
        this.f30396a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f30396a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((la1) obj).f35727b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
