package org.telegram.ui.Components;

import j$.util.function.Function;
import org.telegram.messenger.MessageObject;
public final class DeleteMessagesBottomSheet$$ExternalSyntheticLambda8 implements Function {
    @Override
    public Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object obj) {
        return Integer.valueOf(((MessageObject) obj).getId());
    }

    @Override
    public Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
