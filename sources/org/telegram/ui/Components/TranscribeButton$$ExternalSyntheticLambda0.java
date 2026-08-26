package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;

public final class TranscribeButton$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final MessageObject f$0;

    public TranscribeButton$$ExternalSyntheticLambda0(MessageObject messageObject, int i) {
        this.$r8$classId = i;
        this.f$0 = messageObject;
    }

    @Override
    public final void run() {
        MessageObject messageObject = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
                break;
            default:
                messageObject.settingAvatar = false;
                break;
        }
    }
}
