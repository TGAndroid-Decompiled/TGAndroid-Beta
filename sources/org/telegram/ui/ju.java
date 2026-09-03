package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ju implements Runnable {
    public final int f35369a;
    public final DataSettingsActivity f35370b;

    public ju(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f35369a = i10;
        this.f35370b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f35369a) {
            case 0:
                this.f35370b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f35370b;
                dataSettingsActivity.U = true;
                if (dataSettingsActivity.f31551a != null && (i10 = dataSettingsActivity.f31557s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                d7.f33344j0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f35370b;
                ju juVar = new ju(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(juVar, 100L);
                d7.j0(new ku(dataSettingsActivity2, juVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
