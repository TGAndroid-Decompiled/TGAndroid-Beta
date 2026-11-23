package org.telegram.ui;
public final class bt implements Runnable {
    public final int f46309a;
    public final DataSettingsActivity f46310b;

    public bt(DataSettingsActivity dataSettingsActivity, int i7) {
        this.f46309a = i7;
        this.f46310b = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f46309a) {
            case 0:
                this.f46310b.getMediaDataController().G(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.f46310b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.f43057a != null && (i7 = dataSettingsActivity.f43064s) >= 0) {
                    dataSettingsActivity.s0(i7);
                    return;
                }
                return;
            default:
                x6.f53646k0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.f46310b;
                bt btVar = new bt(dataSettingsActivity2, 1);
                org.telegram.messenger.g0.h3(btVar, 100L);
                x6.m0(new bi.b4(dataSettingsActivity2, btVar, System.currentTimeMillis(), 3));
                return;
        }
    }
}
