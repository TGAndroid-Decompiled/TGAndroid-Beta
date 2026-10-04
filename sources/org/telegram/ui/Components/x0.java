package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.sa1;
public final class x0 implements ToLongFunction {
    public final int f32680a;

    public x0(int i10) {
        this.f32680a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f32680a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((sa1) obj).f40438b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
