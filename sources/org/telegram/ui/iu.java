package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class iu implements Runnable {
    public final int f37927a;
    public final DataSettingsActivity f37928b;

    public iu(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f37927a = i10;
        this.f37928b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f37927a) {
            case 0:
                this.f37928b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f37928b;
                dataSettingsActivity.U = true;
                if (dataSettingsActivity.f34095a != null && (i10 = dataSettingsActivity.f34102s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                b7.f35349j0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f37928b;
                iu iuVar = new iu(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(iuVar, 100L);
                b7.j0(new ju(dataSettingsActivity2, iuVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
