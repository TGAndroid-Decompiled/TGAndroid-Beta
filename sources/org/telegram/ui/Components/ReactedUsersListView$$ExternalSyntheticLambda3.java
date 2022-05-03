package org.telegram.ui.Components;

import j$.util.function.ToIntFunction;
import org.telegram.tgnet.TLRPC$TL_messagePeerReaction;

public final class ReactedUsersListView$$ExternalSyntheticLambda3 implements ToIntFunction {
    public static final ReactedUsersListView$$ExternalSyntheticLambda3 INSTANCE = new ReactedUsersListView$$ExternalSyntheticLambda3();

    private ReactedUsersListView$$ExternalSyntheticLambda3() {
    }

    @Override
    public final int applyAsInt(Object obj) {
        int lambda$load$1;
        lambda$load$1 = ReactedUsersListView.lambda$load$1((TLRPC$TL_messagePeerReaction) obj);
        return lambda$load$1;
    }
}
