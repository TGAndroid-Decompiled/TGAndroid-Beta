package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ku implements Runnable {
    public final int f35236a;
    public final DataSettingsActivity f35237b;

    public ku(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f35236a = i10;
        this.f35237b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f35236a) {
            case 0:
                this.f35237b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f35237b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f31063a != null && (i10 = dataSettingsActivity.f31069s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                z6.f40104n0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f35237b;
                ku kuVar = new ku(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(kuVar, 100L);
                z6.j0(new lu(dataSettingsActivity2, kuVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
