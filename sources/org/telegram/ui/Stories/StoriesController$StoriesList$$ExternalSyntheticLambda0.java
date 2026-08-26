package org.telegram.ui.Stories;

import org.telegram.messenger.NotificationCenter;

public final class StoriesController$StoriesList$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final StoriesController.StoriesList f$0;

    public StoriesController$StoriesList$$ExternalSyntheticLambda0(StoriesController.StoriesList storiesList, int i) {
        this.$r8$classId = i;
        this.f$0 = storiesList;
    }

    @Override
    public final void run() {
        StoriesController.StoriesList storiesList = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                NotificationCenter.getInstance(storiesList.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, storiesList);
                break;
            case 1:
                storiesList.loading = false;
                storiesList.error = true;
                NotificationCenter.getInstance(storiesList.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, storiesList, Boolean.FALSE);
                break;
            case 2:
                storiesList.saving = false;
                break;
            default:
                storiesList.cachedObjects.clear();
                storiesList.fill(true);
                break;
        }
    }
}
