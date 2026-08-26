package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class DataSettingsActivity$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final DataSettingsActivity f$0;

    public DataSettingsActivity$$ExternalSyntheticLambda1(DataSettingsActivity dataSettingsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dataSettingsActivity;
    }

    @Override
    public final void run() {
        int i;
        switch (this.$r8$classId) {
            case 0:
                DataSettingsActivity dataSettingsActivity = this.f$0;
                dataSettingsActivity.storageUsageLoading = true;
                if (dataSettingsActivity.listAdapter != null && (i = dataSettingsActivity.storageUsageRow) >= 0) {
                    dataSettingsActivity.rebind$1(i);
                    break;
                }
                break;
            case 1:
                this.f$0.getMediaDataController().clearAllDrafts(true);
                break;
            default:
                DataSettingsActivity dataSettingsActivity2 = this.f$0;
                dataSettingsActivity2.getClass();
                CacheControlActivity.lastTotalSizeCalculated = null;
                DataSettingsActivity$$ExternalSyntheticLambda1 dataSettingsActivity$$ExternalSyntheticLambda1 = new DataSettingsActivity$$ExternalSyntheticLambda1(dataSettingsActivity2, 0);
                AndroidUtilities.runOnUIThread(dataSettingsActivity$$ExternalSyntheticLambda1, 100L);
                CacheControlActivity.calculateTotalSize(new ProfileActivity$$ExternalSyntheticLambda58(dataSettingsActivity2, dataSettingsActivity$$ExternalSyntheticLambda1, System.currentTimeMillis(), 1));
                break;
        }
    }
}
