package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class iu implements Runnable {
    public final int f38754a;
    public final DataSettingsActivity f38755b;

    public iu(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f38754a = i10;
        this.f38755b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38754a) {
            case 0:
                this.f38755b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f38755b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f33738a != null && (i10 = dataSettingsActivity.f33745s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                y6.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f38755b;
                iu iuVar = new iu(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(iuVar, 100L);
                y6.j0(new ju(dataSettingsActivity2, iuVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
