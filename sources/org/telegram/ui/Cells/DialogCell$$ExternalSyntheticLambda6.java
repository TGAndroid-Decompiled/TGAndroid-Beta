package org.telegram.ui.Cells;

import j$.util.function.ToIntFunction;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
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
