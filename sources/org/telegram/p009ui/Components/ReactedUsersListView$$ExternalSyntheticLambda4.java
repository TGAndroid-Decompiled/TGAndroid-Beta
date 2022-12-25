package org.telegram.p009ui.Components;

import org.telegram.tgnet.TLRPC$MessagePeerReaction;
import p008j$.util.function.ToIntFunction;

public final class ReactedUsersListView$$ExternalSyntheticLambda4 implements ToIntFunction {
    public static final ReactedUsersListView$$ExternalSyntheticLambda4 INSTANCE = new ReactedUsersListView$$ExternalSyntheticLambda4();

    private ReactedUsersListView$$ExternalSyntheticLambda4() {
    }

    @Override
    public final int applyAsInt(Object obj) {
        int lambda$load$2;
        lambda$load$2 = ReactedUsersListView.lambda$load$2((TLRPC$MessagePeerReaction) obj);
        return lambda$load$2;
    }
}
