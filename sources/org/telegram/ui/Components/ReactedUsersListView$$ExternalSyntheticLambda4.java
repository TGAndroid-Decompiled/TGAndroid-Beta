package org.telegram.ui.Components;

import j$.util.function.ToIntFunction;
import org.telegram.tgnet.TLRPC$MessagePeerReaction;
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
