package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hu implements Runnable {
    public final int f34952a;
    public final DataSettingsActivity f34953b;

    public hu(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f34952a = i10;
        this.f34953b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f34952a) {
            case 0:
                this.f34953b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f34953b;
                dataSettingsActivity.U = true;
                if (dataSettingsActivity.f31577a != null && (i10 = dataSettingsActivity.f31583s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                b7.f32808j0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f34953b;
                hu huVar = new hu(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(huVar, 100L);
                b7.j0(new iu(dataSettingsActivity2, huVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
