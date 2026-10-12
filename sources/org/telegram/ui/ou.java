package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ou implements Runnable {
    public final int f39039a;
    public final DataSettingsActivity f39040b;

    public ou(DataSettingsActivity dataSettingsActivity, int i10) {
        this.f39039a = i10;
        this.f39040b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f39039a) {
            case 0:
                this.f39040b.getMediaDataController().clearAllDrafts(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f39040b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f32068a != null && (i10 = dataSettingsActivity.f32074s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            default:
                d7.m0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f39040b;
                ou ouVar = new ou(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(ouVar, 100L);
                d7.j0(new pu(dataSettingsActivity2, ouVar, System.currentTimeMillis(), 0));
                return;
        }
    }
}
