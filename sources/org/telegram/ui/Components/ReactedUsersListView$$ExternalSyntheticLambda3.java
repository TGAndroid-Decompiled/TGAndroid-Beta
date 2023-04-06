package org.telegram.ui.Components;

import j$.util.function.ToIntFunction;
import org.telegram.tgnet.TLRPC$MessagePeerReaction;
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
