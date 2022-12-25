package org.telegram.p009ui.Cells;

import java.util.Comparator;
import org.telegram.p009ui.Cells.ChatMessageCell;

public final class ChatMessageCell$$ExternalSyntheticLambda9 implements Comparator {
    public static final ChatMessageCell$$ExternalSyntheticLambda9 INSTANCE = new ChatMessageCell$$ExternalSyntheticLambda9();

    private ChatMessageCell$$ExternalSyntheticLambda9() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$setMessageContent$7;
        lambda$setMessageContent$7 = ChatMessageCell.lambda$setMessageContent$7((ChatMessageCell.PollButton) obj, (ChatMessageCell.PollButton) obj2);
        return lambda$setMessageContent$7;
    }
}
