package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ya1;
public final class x0 implements ToLongFunction {
    public final int f32793a;

    public x0(int i10) {
        this.f32793a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f32793a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((ya1) obj).f44350b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
