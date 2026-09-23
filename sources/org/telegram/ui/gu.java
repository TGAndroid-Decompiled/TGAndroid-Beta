package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gu implements Runnable {
    public final int f33654a;
    public final DataSettingsActivity f33655b;

    public gu(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f33654a = i10;
        this.f33655b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f33654a) {
            case 0:
                this.f33655b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f33655b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f30750a != null && (i10 = dataSettingsActivity.f30756s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                z6.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f33655b;
                gu guVar = new gu(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(guVar, 100L);
                z6.j0(new hu(dataSettingsActivity2, guVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
