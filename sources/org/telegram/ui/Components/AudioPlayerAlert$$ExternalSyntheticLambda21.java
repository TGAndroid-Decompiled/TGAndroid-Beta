package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

public final class AudioPlayerAlert$$ExternalSyntheticLambda21 implements Runnable {
    public final int $r8$classId;
    public final AudioPlayerAlert f$0;
    public final MessageObject f$1;

    public AudioPlayerAlert$$ExternalSyntheticLambda21(AudioPlayerAlert audioPlayerAlert, MessageObject messageObject, int i) {
        this.$r8$classId = i;
        this.f$0 = audioPlayerAlert;
        this.f$1 = messageObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onSubItemClick$15(this.f$1);
                break;
            default:
                this.f$0.lambda$showOptions$49(this.f$1);
                break;
        }
    }
}
