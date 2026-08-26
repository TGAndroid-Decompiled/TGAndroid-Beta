package org.telegram.ui.Stories.recorder;

public final class StoryRecorder$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final StoryRecorder f$0;

    public StoryRecorder$$ExternalSyntheticLambda9(StoryRecorder storyRecorder, int i) {
        this.$r8$classId = i;
        this.f$0 = storyRecorder;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.requestCameraPermission(false);
                break;
            default:
                StoryRecorder storyRecorder = this.f$0;
                storyRecorder.animateGalleryListView(false);
                storyRecorder.lastGallerySelectedAlbum = null;
                break;
        }
    }
}
