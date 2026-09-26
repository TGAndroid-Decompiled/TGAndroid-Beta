package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fu implements Runnable {
    public final int f33757a;
    public final DataSettingsActivity f33758b;

    public fu(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f33757a = i10;
        this.f33758b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f33757a) {
            case 0:
                this.f33758b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f33758b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f31064a != null && (i10 = dataSettingsActivity.f31070s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                z6.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f33758b;
                fu fuVar = new fu(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(fuVar, 100L);
                z6.j0(new gu(dataSettingsActivity2, fuVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
