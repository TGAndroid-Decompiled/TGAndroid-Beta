package org.telegram.ui;
public final class bt implements Runnable {
    public final int f46291a;
    public final DataSettingsActivity f46292b;

    public bt(DataSettingsActivity dataSettingsActivity, int i7) {
        this.f46291a = i7;
        this.f46292b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f46291a) {
            case 0:
                this.f46292b.getMediaDataController().G(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f46292b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f43012a != null && (i7 = dataSettingsActivity.f43019s) >= 0) {
                    dataSettingsActivity.s0(i7);
                    return;
                }
                return;
            default:
                x6.f53650k0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f46292b;
                bt btVar = new bt(dataSettingsActivity2, 1);
                org.telegram.messenger.g0.h3(btVar, 100L);
                x6.m0(new bi.x3(dataSettingsActivity2, btVar, System.currentTimeMillis(), 3));
                return;
        }
    }
}
