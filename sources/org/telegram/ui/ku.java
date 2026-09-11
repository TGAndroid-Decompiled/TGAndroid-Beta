package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ku implements Runnable {
    public final int f38128a;
    public final DataSettingsActivity f38129b;

    public ku(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f38128a = i10;
        this.f38129b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38128a) {
            case 0:
                this.f38129b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f38129b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f33384a != null && (i10 = dataSettingsActivity.f33391s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                z6.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f38129b;
                ku kuVar = new ku(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(kuVar, 100L);
                z6.j0(new lu(dataSettingsActivity2, kuVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
