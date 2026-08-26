package org.telegram.ui.Components;

import java.util.ArrayList;

public final class AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId = 1;
    public final AudioPlayerAlert.ListAdapter f$0;
    public final ArrayList f$1;
    public final String f$2;

    public AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda0(AudioPlayerAlert.ListAdapter listAdapter, String str, ArrayList arrayList) {
        this.f$0 = listAdapter;
        this.f$2 = str;
        this.f$1 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateSearchResults$8(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$processSearch$6(this.f$2, this.f$1);
                break;
        }
    }

    public AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda0(AudioPlayerAlert.ListAdapter listAdapter, ArrayList arrayList, String str) {
        this.f$0 = listAdapter;
        this.f$1 = arrayList;
        this.f$2 = str;
    }
}
