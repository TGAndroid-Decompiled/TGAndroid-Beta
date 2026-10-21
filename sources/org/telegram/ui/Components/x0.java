package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
public final class x0 implements ToLongFunction {
    public final int f32285a;

    public x0(int i10) {
        this.f32285a = i10;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.f32285a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            case 1:
                MessageObject messageObject = ((org.telegram.ui.m91) obj).f39163b;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
            case 2:
                return ((org.telegram.ui.Wallet.s7) obj).I;
            default:
                return ((org.telegram.ui.Wallet.s7) obj).J;
        }
    }
}
