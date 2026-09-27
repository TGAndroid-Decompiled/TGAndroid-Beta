package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hu implements Runnable {
    public final int f34284a;
    public final DataSettingsActivity f34285b;

    public hu(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f34284a = i10;
        this.f34285b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f34284a) {
            case 0:
                this.f34285b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f34285b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f31067a != null && (i10 = dataSettingsActivity.f31073s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                b7.f32252n0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f34285b;
                hu huVar = new hu(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(huVar, 100L);
                b7.j0(new iu(dataSettingsActivity2, huVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
