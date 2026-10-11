package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hu implements Runnable {
    public final int f38540a;
    public final DataSettingsActivity f38541b;

    public hu(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f38540a = i10;
        this.f38541b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38540a) {
            case 0:
                this.f38541b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f38541b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f33800a != null && (i10 = dataSettingsActivity.f33807s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                x6.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f38541b;
                hu huVar = new hu(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(huVar, 100L);
                x6.j0(new iu(dataSettingsActivity2, huVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
