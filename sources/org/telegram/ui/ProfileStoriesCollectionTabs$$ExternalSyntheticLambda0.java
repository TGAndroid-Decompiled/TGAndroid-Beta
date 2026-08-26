package org.telegram.ui;

public final class ProfileStoriesCollectionTabs$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ProfileStoriesCollectionTabs f$0;
    public final int f$1;

    public ProfileStoriesCollectionTabs$$ExternalSyntheticLambda0(ProfileStoriesCollectionTabs profileStoriesCollectionTabs, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = profileStoriesCollectionTabs;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setInitialTabId$2(this.f$1);
                break;
            default:
                this.f$0.lambda$didReceivedNotification$3(this.f$1);
                break;
        }
    }
}
