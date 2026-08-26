package org.telegram.ui;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;

public final class StatisticActivity$$ExternalSyntheticLambda4 implements ToLongFunction {
    public final int $r8$classId;

    public StatisticActivity$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final long applyAsLong(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                MessageObject messageObject = ((StatisticActivity.RecentPostInfo) obj).message;
                if (messageObject == null) {
                    return 0L;
                }
                return messageObject.messageOwner.date;
            default:
                return ((MessageObject) obj).getFromChatId();
        }
    }
}
