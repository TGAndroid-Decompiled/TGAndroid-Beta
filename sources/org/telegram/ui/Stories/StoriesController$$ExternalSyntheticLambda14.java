package org.telegram.ui.Stories;

public final class StoriesController$$ExternalSyntheticLambda14 implements Runnable {
    public final int $r8$classId;
    public final StoriesController f$0;

    public StoriesController$$ExternalSyntheticLambda14(StoriesController storiesController, int i) {
        this.$r8$classId = i;
        this.f$0 = storiesController;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StoriesController storiesController = this.f$0;
                storiesController.storiesReadLoaded = true;
                storiesController.mainSettings.edit().putBoolean("read_loaded", true).apply();
                break;
            case 1:
                StoriesController storiesController2 = this.f$0;
                storiesController2.storyLimitFetched = false;
                storiesController2.storyLimitCached = null;
                break;
            default:
                StoriesController storiesController3 = this.f$0;
                storiesController3.storyLimitFetched = false;
                storiesController3.storyLimitCached = null;
                break;
        }
    }
}
