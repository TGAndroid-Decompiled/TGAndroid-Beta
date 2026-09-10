package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ku implements Runnable {
    public final int f34459a;
    public final DataSettingsActivity f34460b;

    public ku(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f34459a = i10;
        this.f34460b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f34459a) {
            case 0:
                this.f34460b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f34460b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f29892a != null && (i10 = dataSettingsActivity.f29898s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                y6.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f34460b;
                ku kuVar = new ku(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(kuVar, 100L);
                y6.j0(new lu(dataSettingsActivity2, kuVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
