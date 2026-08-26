package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

public final class AudioPlayerAlert$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final AudioPlayerAlert f$0;
    public final MessageObject f$1;
    public final ItemOptions f$2;

    public AudioPlayerAlert$$ExternalSyntheticLambda3(AudioPlayerAlert audioPlayerAlert, MessageObject messageObject, ItemOptions itemOptions, int i) {
        this.$r8$classId = i;
        this.f$0 = audioPlayerAlert;
        this.f$1 = messageObject;
        this.f$2 = itemOptions;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showOptions$44(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$buildSaveOptions$39(this.f$1, this.f$2);
                break;
            case 2:
                this.f$0.lambda$buildSaveOptions$40(this.f$1, this.f$2);
                break;
            case 3:
                this.f$0.lambda$buildSaveOptions$41(this.f$1, this.f$2);
                break;
            case 4:
                this.f$0.lambda$showOptions$42(this.f$2, this.f$1);
                break;
            case 5:
                this.f$0.lambda$showOptions$43(this.f$2, this.f$1);
                break;
            case 6:
                this.f$0.lambda$showOptions$45(this.f$1, this.f$2);
                break;
            case 7:
                this.f$0.lambda$showOptions$47(this.f$2, this.f$1);
                break;
            default:
                this.f$0.lambda$showOptions$48(this.f$2, this.f$1);
                break;
        }
    }

    public AudioPlayerAlert$$ExternalSyntheticLambda3(AudioPlayerAlert audioPlayerAlert, ItemOptions itemOptions, MessageObject messageObject, int i) {
        this.$r8$classId = i;
        this.f$0 = audioPlayerAlert;
        this.f$2 = itemOptions;
        this.f$1 = messageObject;
    }
}
