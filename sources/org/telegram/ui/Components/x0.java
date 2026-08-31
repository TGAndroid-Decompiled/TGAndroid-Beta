package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ea1;
public final class x0 implements ToLongFunction {
    public final int f32877a;

    public x0(int i10) {
        this.f32877a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f32877a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((ea1) obj).f36456b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
