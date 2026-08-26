package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final AudioPlayerAlert.ListAdapter f$0;
    public final String f$1;

    public AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda3(AudioPlayerAlert.ListAdapter listAdapter, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = listAdapter;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AudioPlayerAlert.ListAdapter listAdapter = this.f$0;
                listAdapter.searchRunnable = null;
                AndroidUtilities.runOnUIThread(new AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda3(listAdapter, this.f$1, 1));
                break;
            default:
                AudioPlayerAlert.ListAdapter listAdapter2 = this.f$0;
                String str = this.f$1;
                listAdapter2.getClass();
                Utilities.searchQueue.postRunnable(new AudioPlayerAlert$ListAdapter$$ExternalSyntheticLambda7(listAdapter2, str, new ArrayList(AudioPlayerAlert.this.playlist)));
                break;
        }
    }
}
