package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ju implements Runnable {
    public final int f37752a;
    public final DataSettingsActivity f37753b;

    public ju(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f37752a = i10;
        this.f37753b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f37752a) {
            case 0:
                this.f37753b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f37753b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f33729a != null && (i10 = dataSettingsActivity.f33736s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                a7.f34675o0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f37753b;
                ju juVar = new ju(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(juVar, 100L);
                a7.g0(new ku(dataSettingsActivity2, juVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
