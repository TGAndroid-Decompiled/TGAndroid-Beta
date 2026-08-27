package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.n91;

public final class w0 implements ToLongFunction {

    public final int f34080a;

    public w0(int i10) {
        this.f34080a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f34080a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                MessageObject messageObject = ((n91) obj).f40699b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
        }
    }
}
