package org.telegram.ui;

public final class DataSettingsActivity$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final DataSettingsActivity f$0;

    public DataSettingsActivity$$ExternalSyntheticLambda4(DataSettingsActivity dataSettingsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dataSettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setStorageDirectory$10();
                break;
            case 1:
                this.f$0.lambda$createView$6();
                break;
            default:
                this.f$0.lambda$loadCacheSize$0();
                break;
        }
    }
}
