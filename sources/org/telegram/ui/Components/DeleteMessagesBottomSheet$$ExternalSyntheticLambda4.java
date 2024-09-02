package org.telegram.ui.Components;

import j$.util.function.Function;
import org.telegram.messenger.MessageObject;

public final class DeleteMessagesBottomSheet$$ExternalSyntheticLambda4 implements Function {
    public static final DeleteMessagesBottomSheet$$ExternalSyntheticLambda4 INSTANCE = new DeleteMessagesBottomSheet$$ExternalSyntheticLambda4();

    private DeleteMessagesBottomSheet$$ExternalSyntheticLambda4() {
    }

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
