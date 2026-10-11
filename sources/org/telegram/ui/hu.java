package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hu implements Runnable {
    public final int f38506a;
    public final DataSettingsActivity f38507b;

    public hu(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f38506a = i10;
        this.f38507b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38506a) {
            case 0:
                this.f38507b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f38507b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f33766a != null && (i10 = dataSettingsActivity.f33773s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                x6.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f38507b;
                hu huVar = new hu(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(huVar, 100L);
                x6.j0(new iu(dataSettingsActivity2, huVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
