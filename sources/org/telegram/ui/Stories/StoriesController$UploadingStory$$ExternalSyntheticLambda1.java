package org.telegram.ui.Stories;

public final class StoriesController$UploadingStory$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final StoriesController.UploadingStory f$0;

    public StoriesController$UploadingStory$$ExternalSyntheticLambda1(StoriesController.UploadingStory uploadingStory, int i) {
        this.$r8$classId = i;
        this.f$0 = uploadingStory;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.cleanup();
                break;
            default:
                this.f$0.upload();
                break;
        }
    }
}
