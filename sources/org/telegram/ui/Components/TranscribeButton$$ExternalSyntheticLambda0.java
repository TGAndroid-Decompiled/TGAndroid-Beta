package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

public final class TranscribeButton$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final MessageObject f$0;
    public final long f$1;
    public final String f$2;

    public TranscribeButton$$ExternalSyntheticLambda0(String str, MessageObject messageObject, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = messageObject;
        this.f$1 = j;
        this.f$2 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                TranscribeButton.lambda$finishTranscription$8(this.f$0, this.f$1, this.f$2);
                break;
            default:
                TranscribeButton.finishTranscription(this.f$0, this.f$1, this.f$2);
                break;
        }
    }
}
