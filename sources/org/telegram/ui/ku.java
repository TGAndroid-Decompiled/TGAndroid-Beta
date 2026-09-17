package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ku implements Runnable {
    public final int f38156a;
    public final DataSettingsActivity f38157b;

    public ku(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f38156a = i10;
        this.f38157b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38156a) {
            case 0:
                this.f38157b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f38157b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f33412a != null && (i10 = dataSettingsActivity.f33419s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                z6.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f38157b;
                ku kuVar = new ku(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(kuVar, 100L);
                z6.j0(new lu(dataSettingsActivity2, kuVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
