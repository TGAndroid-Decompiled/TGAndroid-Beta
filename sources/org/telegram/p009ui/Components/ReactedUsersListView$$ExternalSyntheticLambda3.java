package org.telegram.p009ui.Components;

import org.telegram.tgnet.TLRPC$MessagePeerReaction;
import p008j$.util.function.ToIntFunction;

public final class ReactedUsersListView$$ExternalSyntheticLambda3 implements ToIntFunction {
    public static final ReactedUsersListView$$ExternalSyntheticLambda3 INSTANCE = new ReactedUsersListView$$ExternalSyntheticLambda3();

    private ReactedUsersListView$$ExternalSyntheticLambda3() {
    }

    @Override
    public final int applyAsInt(Object obj) {
        int lambda$setSeenUsers$1;
        lambda$setSeenUsers$1 = ReactedUsersListView.lambda$setSeenUsers$1((TLRPC$MessagePeerReaction) obj);
        return lambda$setSeenUsers$1;
    }
}
