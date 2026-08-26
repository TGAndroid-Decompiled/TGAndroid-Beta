package org.telegram.ui.Components;

public final class AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final AudioPlayerAlert.ListAdapter f$0;
    public final String f$1;

    public AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda4(AudioPlayerAlert.ListAdapter listAdapter, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = listAdapter;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$search$5(this.f$1);
                break;
            default:
                this.f$0.lambda$processSearch$7(this.f$1);
                break;
        }
    }
}
