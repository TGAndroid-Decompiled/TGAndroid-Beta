package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class lu implements Runnable {
    public final int f39846a;
    public final DataSettingsActivity f39847b;

    public lu(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f39846a = i10;
        this.f39847b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39846a) {
            case 0:
                this.f39847b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f39847b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f33577a != null && (i10 = dataSettingsActivity.f33584s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                b7.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f39847b;
                lu luVar = new lu(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(luVar, 100L);
                b7.j0(new mu(dataSettingsActivity2, luVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
