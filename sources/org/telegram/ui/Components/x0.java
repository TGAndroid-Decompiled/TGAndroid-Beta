package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ya1;
public final class x0 implements ToLongFunction {
    public final int f32701a;

    public x0(int i10) {
        this.f32701a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f32701a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((ya1) obj).f44306b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
