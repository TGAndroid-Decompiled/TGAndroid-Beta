package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ya1;
public final class y0 implements ToLongFunction {
    public final int f32823a;

    public y0(int i10) {
        this.f32823a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f32823a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((ya1) obj).f43095b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
