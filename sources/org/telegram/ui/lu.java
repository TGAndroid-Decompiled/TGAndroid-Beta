package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class lu implements Runnable {
    public final int f35628a;
    public final DataSettingsActivity f35629b;

    public lu(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f35628a = i10;
        this.f35629b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f35628a) {
            case 0:
                this.f35629b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f35629b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f30796a != null && (i10 = dataSettingsActivity.f30802s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                a7.f31733n0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f35629b;
                lu luVar = new lu(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(luVar, 100L);
                a7.j0(new mu(dataSettingsActivity2, luVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
