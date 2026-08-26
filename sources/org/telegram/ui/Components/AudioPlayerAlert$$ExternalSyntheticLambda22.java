package org.telegram.ui.Components;

public final class AudioPlayerAlert$$ExternalSyntheticLambda22 implements Runnable {
    public final int $r8$classId;
    public final AudioPlayerAlert f$0;

    public AudioPlayerAlert$$ExternalSyntheticLambda22(AudioPlayerAlert audioPlayerAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = audioPlayerAlert;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$saveToProfile$26();
                break;
            default:
                this.f$0.lambda$saveToProfile$23();
                break;
        }
    }
}
