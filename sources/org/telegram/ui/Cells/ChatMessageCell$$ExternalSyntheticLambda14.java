package org.telegram.ui.Cells;

import java.util.Comparator;
import org.telegram.ui.Cells.ChatMessageCell;
public final class ChatMessageCell$$ExternalSyntheticLambda14 implements Comparator {
    public static final ChatMessageCell$$ExternalSyntheticLambda14 INSTANCE = new ChatMessageCell$$ExternalSyntheticLambda14();

    private ChatMessageCell$$ExternalSyntheticLambda14() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$setMessageContent$12;
        lambda$setMessageContent$12 = ChatMessageCell.lambda$setMessageContent$12((ChatMessageCell.PollButton) obj, (ChatMessageCell.PollButton) obj2);
        return lambda$setMessageContent$12;
    }
}
