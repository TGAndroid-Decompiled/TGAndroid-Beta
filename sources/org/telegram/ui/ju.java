package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ju implements Runnable {
    public final int f37765a;
    public final DataSettingsActivity f37766b;

    public ju(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f37765a = i10;
        this.f37766b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f37765a) {
            case 0:
                this.f37766b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f37766b;
                dataSettingsActivity.W = true;
                if (dataSettingsActivity.f33748a != null && (i10 = dataSettingsActivity.f33755s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                a7.f34689o0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f37766b;
                ju juVar = new ju(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(juVar, 100L);
                a7.g0(new ku(dataSettingsActivity2, juVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
