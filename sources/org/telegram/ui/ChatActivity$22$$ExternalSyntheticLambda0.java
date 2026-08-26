package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public final class ChatActivity$22$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity.AnonymousClass22 f$0;

    public ChatActivity$22$$ExternalSyntheticLambda0(ChatActivity.AnonymousClass22 anonymousClass22, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass22;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.AnonymousClass22 anonymousClass22 = this.f$0;
                anonymousClass22.finishRunnable = null;
                ChatActivity chatActivity = ChatActivity.this;
                if (chatActivity.scrollAnimationIndex != -1) {
                    chatActivity.getNotificationCenter().onAnimationFinish(chatActivity.scrollAnimationIndex);
                    chatActivity.scrollAnimationIndex = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                }
                break;
            default:
                ChatActivity.AnonymousClass22 anonymousClass23 = this.f$0;
                anonymousClass23.finishRunnable = null;
                ChatActivity chatActivity2 = ChatActivity.this;
                if (chatActivity2.scrollAnimationIndex != -1) {
                    chatActivity2.getNotificationCenter().onAnimationFinish(chatActivity2.scrollAnimationIndex);
                    chatActivity2.scrollAnimationIndex = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                }
                break;
        }
    }
}
