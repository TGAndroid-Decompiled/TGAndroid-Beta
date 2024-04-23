package org.telegram.ui.Components;

import j$.util.function.Function;
import org.telegram.messenger.MessageObject;
public final class DeleteMessagesBottomSheet$$ExternalSyntheticLambda3 implements Function {
    public static final DeleteMessagesBottomSheet$$ExternalSyntheticLambda3 INSTANCE = new DeleteMessagesBottomSheet$$ExternalSyntheticLambda3();

    private DeleteMessagesBottomSheet$$ExternalSyntheticLambda3() {
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
