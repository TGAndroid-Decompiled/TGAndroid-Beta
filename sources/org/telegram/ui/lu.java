package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class lu implements Runnable {
    public final int f35623a;
    public final DataSettingsActivity f35624b;

    public lu(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f35623a = i10;
        this.f35624b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f35623a) {
            case 0:
                this.f35624b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f35624b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f30793a != null && (i10 = dataSettingsActivity.f30799s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                a7.f31729n0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f35624b;
                lu luVar = new lu(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(luVar, 100L);
                a7.j0(new mu(dataSettingsActivity2, luVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
