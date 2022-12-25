package org.telegram.p009ui.Cells;

import org.telegram.tgnet.TLRPC$TL_forumTopic;
import p008j$.util.function.ToIntFunction;

public final class DialogCell$$ExternalSyntheticLambda6 implements ToIntFunction {
    public static final DialogCell$$ExternalSyntheticLambda6 INSTANCE = new DialogCell$$ExternalSyntheticLambda6();

    private DialogCell$$ExternalSyntheticLambda6() {
    }

    @Override
    public final int applyAsInt(Object obj) {
        int lambda$formatTopicsNames$0;
        lambda$formatTopicsNames$0 = DialogCell.lambda$formatTopicsNames$0((TLRPC$TL_forumTopic) obj);
        return lambda$formatTopicsNames$0;
    }
}
