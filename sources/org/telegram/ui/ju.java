package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ju implements Runnable {
    public final int f37757a;
    public final DataSettingsActivity f37758b;

    public ju(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f37757a = i10;
        this.f37758b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f37757a) {
            case 0:
                this.f37758b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f37758b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f33735a != null && (i10 = dataSettingsActivity.f33742s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                a7.f34681o0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f37758b;
                ju juVar = new ju(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(juVar, 100L);
                a7.g0(new ku(dataSettingsActivity2, juVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
