package org.telegram.ui;

import org.telegram.messenger.Utilities;

public final class ChatActivity$$ExternalSyntheticLambda162 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final String f$1;

    public ChatActivity$$ExternalSyntheticLambda162(ChatActivity chatActivity, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didLongPressLink$412(this.f$1, bool, bool2);
                break;
            default:
                this.f$0.lambda$didLongPressLink$410(this.f$1, bool, bool2);
                break;
        }
    }
}
