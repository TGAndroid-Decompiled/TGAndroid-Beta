package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ku implements Runnable {
    public final int f35173a;
    public final DataSettingsActivity f35174b;

    public ku(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f35173a = i10;
        this.f35174b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f35173a) {
            case 0:
                this.f35174b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f35174b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f31023a != null && (i10 = dataSettingsActivity.f31029s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                z6.f39979n0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f35174b;
                ku kuVar = new ku(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(kuVar, 100L);
                z6.j0(new lu(dataSettingsActivity2, kuVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
