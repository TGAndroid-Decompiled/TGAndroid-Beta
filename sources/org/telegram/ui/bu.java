package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class bu implements Runnable {

    public final int f36884a;

    public final DataSettingsActivity f36885b;

    public bu(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f36884a = i10;
        this.f36885b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f36884a) {
            case 0:
                this.f36885b.getMediaDataController().clearAllDrafts(true);
                break;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f36885b;
                dataSettingsActivity.T = true;
                if (dataSettingsActivity.f35457a != null && (i10 = dataSettingsActivity.f35464s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    break;
                }
                break;
            default:
                z6.f45034i0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f36885b;
                bu buVar = new bu(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(buVar, 100L);
                z6.j0(new cu(dataSettingsActivity2, buVar, System.currentTimeMillis(), 0));
                break;
        }
    }
}
