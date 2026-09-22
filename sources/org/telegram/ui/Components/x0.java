package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ya1;
public final class x0 implements ToLongFunction {
    public final int f30176a;

    public x0(int i10) {
        this.f30176a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f30176a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((ya1) obj).f39896b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
