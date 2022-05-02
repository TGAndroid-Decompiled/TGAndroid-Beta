package org.telegram.ui.Cells;

import java.util.Comparator;
import org.telegram.ui.Cells.ChatMessageCell;

public final class ChatMessageCell$$ExternalSyntheticLambda5 implements Comparator {
    public static final ChatMessageCell$$ExternalSyntheticLambda5 INSTANCE = new ChatMessageCell$$ExternalSyntheticLambda5();

    private ChatMessageCell$$ExternalSyntheticLambda5() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$setMessageContent$4;
        lambda$setMessageContent$4 = ChatMessageCell.lambda$setMessageContent$4((ChatMessageCell.PollButton) obj, (ChatMessageCell.PollButton) obj2);
        return lambda$setMessageContent$4;
    }
}
