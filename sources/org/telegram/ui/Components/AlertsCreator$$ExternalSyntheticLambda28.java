package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;

public final class AlertsCreator$$ExternalSyntheticLambda28 implements ToLongFunction {
    @Override
    public final long applyAsLong(Object obj) {
        return ((MessageObject) obj).getFromChatId();
    }
}
