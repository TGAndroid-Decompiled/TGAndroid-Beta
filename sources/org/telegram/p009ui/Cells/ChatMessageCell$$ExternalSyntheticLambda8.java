package org.telegram.p009ui.Cells;

import java.util.Comparator;
import org.telegram.p009ui.Cells.ChatMessageCell;

public final class ChatMessageCell$$ExternalSyntheticLambda8 implements Comparator {
    public static final ChatMessageCell$$ExternalSyntheticLambda8 INSTANCE = new ChatMessageCell$$ExternalSyntheticLambda8();

    private ChatMessageCell$$ExternalSyntheticLambda8() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$setMessageContent$7;
        lambda$setMessageContent$7 = ChatMessageCell.lambda$setMessageContent$7((ChatMessageCell.PollButton) obj, (ChatMessageCell.PollButton) obj2);
        return lambda$setMessageContent$7;
    }
}
