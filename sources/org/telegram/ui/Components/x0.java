package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.qa1;
public final class x0 implements ToLongFunction {
    public final int f32775a;

    public x0(int i10) {
        this.f32775a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f32775a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((qa1) obj).f39754b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
