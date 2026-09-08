package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ku implements Runnable {
    public final int f38155a;
    public final DataSettingsActivity f38156b;

    public ku(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f38155a = i10;
        this.f38156b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38155a) {
            case 0:
                this.f38156b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f38156b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f33411a != null && (i10 = dataSettingsActivity.f33418s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                z6.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f38156b;
                ku kuVar = new ku(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(kuVar, 100L);
                z6.j0(new lu(dataSettingsActivity2, kuVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
