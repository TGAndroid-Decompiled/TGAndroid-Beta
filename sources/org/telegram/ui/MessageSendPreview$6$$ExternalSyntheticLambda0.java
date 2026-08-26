package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public final class MessageSendPreview$6$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final MessageSendPreview.AnonymousClass6 f$0;

    public MessageSendPreview$6$$ExternalSyntheticLambda0(MessageSendPreview.AnonymousClass6 anonymousClass6, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass6;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.finishRunnable = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                }
                break;
            default:
                this.f$0.finishRunnable = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                }
                break;
        }
    }
}
