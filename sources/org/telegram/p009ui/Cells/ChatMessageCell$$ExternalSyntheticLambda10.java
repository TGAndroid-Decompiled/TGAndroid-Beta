package org.telegram.p009ui.Cells;

import java.util.Comparator;
import org.telegram.p009ui.Cells.ChatMessageCell;

public final class ChatMessageCell$$ExternalSyntheticLambda10 implements Comparator {
    public static final ChatMessageCell$$ExternalSyntheticLambda10 INSTANCE = new ChatMessageCell$$ExternalSyntheticLambda10();

    private ChatMessageCell$$ExternalSyntheticLambda10() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$setMessageContent$8;
        lambda$setMessageContent$8 = ChatMessageCell.lambda$setMessageContent$8((ChatMessageCell.PollButton) obj, (ChatMessageCell.PollButton) obj2);
        return lambda$setMessageContent$8;
    }
}
