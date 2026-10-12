package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ab1;
public final class x0 implements ToLongFunction {
    public final int f32597a;

    public x0(int i10) {
        this.f32597a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f32597a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((ab1) obj).f35755b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
