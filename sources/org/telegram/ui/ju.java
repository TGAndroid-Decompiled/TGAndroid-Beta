package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ju implements Runnable {
    public final int f34973a;
    public final DataSettingsActivity f34974b;

    public ju(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f34973a = i10;
        this.f34974b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f34973a) {
            case 0:
                z6.m0 = null;
                DataSettingsActivity dataSettingsActivity = this.f34974b;
                ju juVar = new ju(dataSettingsActivity, 2);
                AndroidUtilities.runOnUIThread(juVar, 100L);
                z6.j0(new ku(dataSettingsActivity, juVar, System.currentTimeMillis(), 0));
                return;
            case 1:
                this.f34974b.getMediaDataController().clearAllDrafts(true);
                return;
            default:
                DataSettingsActivity dataSettingsActivity2 = this.f34974b;
                dataSettingsActivity2.X = true;
                if (dataSettingsActivity2.f30779a != null && (i10 = dataSettingsActivity2.f30785s) >= 0) {
                    dataSettingsActivity2.n0(i10);
                    return;
                }
                return;
        }
    }
}
