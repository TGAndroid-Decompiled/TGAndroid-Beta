package org.telegram.ui.Components;

public final class AudioPlayerAlert$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final AudioPlayerAlert f$0;
    public final ItemOptions f$1;

    public AudioPlayerAlert$$ExternalSyntheticLambda4(AudioPlayerAlert audioPlayerAlert, ItemOptions itemOptions, int i) {
        this.$r8$classId = i;
        this.f$0 = audioPlayerAlert;
        this.f$1 = itemOptions;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$buildSaveOptions$38(this.f$1);
                break;
            case 1:
                this.f$0.lambda$showMenuOptions$33(this.f$1);
                break;
            case 2:
                this.f$0.lambda$showMenuOptions$34(this.f$1);
                break;
            case 3:
                this.f$0.lambda$showMenuOptions$35(this.f$1);
                break;
            default:
                this.f$0.lambda$showMenuOptions$37(this.f$1);
                break;
        }
    }
}
