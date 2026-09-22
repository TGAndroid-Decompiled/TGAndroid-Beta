package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ju implements Runnable {
    public final int f34985a;
    public final DataSettingsActivity f34986b;

    public ju(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f34985a = i10;
        this.f34986b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f34985a) {
            case 0:
                this.f34986b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f34986b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f30776a != null && (i10 = dataSettingsActivity.f30782s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                z6.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f34986b;
                ju juVar = new ju(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(juVar, 100L);
                z6.j0(new ku(dataSettingsActivity2, juVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
