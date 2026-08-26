package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

public final class AudioPlayerAlert$$ExternalSyntheticLambda24 implements Runnable {
    public final int $r8$classId;
    public final AudioPlayerAlert f$0;
    public final ItemOptions f$1;
    public final MessageObject f$2;

    public AudioPlayerAlert$$ExternalSyntheticLambda24(AudioPlayerAlert audioPlayerAlert, MessageObject messageObject, ItemOptions itemOptions, int i) {
        this.$r8$classId = i;
        this.f$0 = audioPlayerAlert;
        this.f$2 = messageObject;
        this.f$1 = itemOptions;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AudioPlayerAlert audioPlayerAlert = this.f$0;
                audioPlayerAlert.getClass();
                this.f$1.dismiss();
                audioPlayerAlert.forward(this.f$2);
                break;
            case 1:
                AudioPlayerAlert audioPlayerAlert2 = this.f$0;
                audioPlayerAlert2.getClass();
                this.f$1.dismiss();
                audioPlayerAlert2.share(this.f$2);
                break;
            case 2:
                AudioPlayerAlert audioPlayerAlert3 = this.f$0;
                audioPlayerAlert3.getClass();
                ItemOptions itemOptions = this.f$1;
                MessageObject messageObject = this.f$2;
                audioPlayerAlert3.saveToProfile(messageObject, false, new AudioPlayerAlert$$ExternalSyntheticLambda24(audioPlayerAlert3, messageObject, itemOptions, 5), false);
                break;
            case 3:
                AudioPlayerAlert audioPlayerAlert4 = this.f$0;
                audioPlayerAlert4.getClass();
                this.f$1.dismiss();
                audioPlayerAlert4.forward(this.f$2);
                break;
            case 4:
                AudioPlayerAlert audioPlayerAlert5 = this.f$0;
                audioPlayerAlert5.getClass();
                this.f$1.dismiss();
                audioPlayerAlert5.share(this.f$2);
                break;
            case 5:
                this.f$0.lambda$showOptions$44(this.f$2, this.f$1);
                break;
            case 6:
                AudioPlayerAlert audioPlayerAlert6 = this.f$0;
                audioPlayerAlert6.getClass();
                audioPlayerAlert6.saveToProfile(this.f$2, true, new AudioPlayerAlert$$ExternalSyntheticLambda32(audioPlayerAlert6, this.f$1, 4), false);
                break;
            case 7:
                this.f$0.lambda$buildSaveOptions$40(this.f$2, this.f$1);
                break;
            default:
                this.f$0.saveToMusic(this.f$2);
                this.f$1.dismiss();
                break;
        }
    }

    public AudioPlayerAlert$$ExternalSyntheticLambda24(AudioPlayerAlert audioPlayerAlert, ItemOptions itemOptions, MessageObject messageObject, int i) {
        this.$r8$classId = i;
        this.f$0 = audioPlayerAlert;
        this.f$1 = itemOptions;
        this.f$2 = messageObject;
    }
}
