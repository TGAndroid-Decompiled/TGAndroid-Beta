package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;

public final class TranscribeButton$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final MessageObject f$0;
    public final long f$1;
    public final String f$2;

    public TranscribeButton$$ExternalSyntheticLambda1(String str, MessageObject messageObject, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = messageObject;
        this.f$1 = j;
        this.f$2 = str;
    }

    @Override
    public final void run() {
        String str = this.f$2;
        long j = this.f$1;
        MessageObject messageObject = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i = NotificationCenter.voiceTranscriptionUpdate;
                Long lValueOf = Long.valueOf(j);
                Boolean bool = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i, messageObject, lValueOf, str, bool, bool);
                break;
            default:
                TranscribeButton.finishTranscription(messageObject, j, str);
                break;
        }
    }
}
