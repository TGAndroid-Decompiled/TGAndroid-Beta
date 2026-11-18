package org.telegram.ui;
public final class bt implements Runnable {
    public final int f46282a;
    public final DataSettingsActivity f46283b;

    public bt(DataSettingsActivity dataSettingsActivity, int i7) {
        this.f46282a = i7;
        this.f46283b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f46282a) {
            case 0:
                this.f46283b.getMediaDataController().G(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f46283b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f43012a != null && (i7 = dataSettingsActivity.f43019s) >= 0) {
                    dataSettingsActivity.s0(i7);
                    return;
                }
                return;
            default:
                x6.f53601k0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f46283b;
                bt btVar = new bt(dataSettingsActivity2, 1);
                org.telegram.messenger.g0.h3(btVar, 100L);
                x6.m0(new bi.x3(dataSettingsActivity2, btVar, System.currentTimeMillis(), 3));
                return;
        }
    }
}
