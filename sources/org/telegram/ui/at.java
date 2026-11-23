package org.telegram.ui;
public final class at implements Runnable {
    public final int f45805a;
    public final DataSettingsActivity f45806b;

    public at(DataSettingsActivity dataSettingsActivity, int i7) {
        this.f45805a = i7;
        this.f45806b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f45805a) {
            case 0:
                this.f45806b.getMediaDataController().G(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f45806b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f43132a != null && (i7 = dataSettingsActivity.f43139s) >= 0) {
                    dataSettingsActivity.s0(i7);
                    return;
                }
                return;
            default:
                y6.f54238k0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f45806b;
                at atVar = new at(dataSettingsActivity2, 1);
                org.telegram.messenger.g0.h3(atVar, 100L);
                y6.m0(new bi.d4(dataSettingsActivity2, atVar, System.currentTimeMillis(), 3));
                return;
        }
    }
}
