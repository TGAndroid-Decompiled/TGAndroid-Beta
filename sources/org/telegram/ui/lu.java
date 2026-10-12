package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class lu implements Runnable {
    public final int f39843a;
    public final DataSettingsActivity f39844b;

    public lu(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f39843a = i10;
        this.f39844b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39843a) {
            case 0:
                this.f39844b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f39844b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f33575a != null && (i10 = dataSettingsActivity.f33582s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                b7.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f39844b;
                lu luVar = new lu(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(luVar, 100L);
                b7.j0(new mu(dataSettingsActivity2, luVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
