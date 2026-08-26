package org.telegram.ui.Components;

public final class AudioPlayerAlert$$ExternalSyntheticLambda32 implements Runnable {
    public final int $r8$classId;
    public final AudioPlayerAlert f$0;
    public final ItemOptions f$1;

    public AudioPlayerAlert$$ExternalSyntheticLambda32(AudioPlayerAlert audioPlayerAlert, ItemOptions itemOptions, int i) {
        this.$r8$classId = i;
        this.f$0 = audioPlayerAlert;
        this.f$1 = itemOptions;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AudioPlayerAlert audioPlayerAlert = this.f$0;
                audioPlayerAlert.getClass();
                this.f$1.dismiss();
                audioPlayerAlert.onSubItemClick(1);
                break;
            case 1:
                AudioPlayerAlert audioPlayerAlert2 = this.f$0;
                audioPlayerAlert2.getClass();
                this.f$1.dismiss();
                audioPlayerAlert2.onSubItemClick(2);
                break;
            case 2:
                AudioPlayerAlert audioPlayerAlert3 = this.f$0;
                audioPlayerAlert3.getClass();
                this.f$1.dismiss();
                audioPlayerAlert3.onSubItemClick(4);
                break;
            case 3:
                AudioPlayerAlert audioPlayerAlert4 = this.f$0;
                audioPlayerAlert4.getClass();
                this.f$1.dismiss();
                audioPlayerAlert4.onSubItemClick(7);
                break;
            default:
                this.f$0.lambda$buildSaveOptions$38(this.f$1);
                break;
        }
    }
}
