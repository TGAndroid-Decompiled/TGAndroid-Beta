package org.telegram.ui.Stories.recorder;

public final class StoryRecorder$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final StoryRecorder f$0;
    public final boolean f$1;

    public StoryRecorder$$ExternalSyntheticLambda6(StoryRecorder storyRecorder, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = storyRecorder;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StoryRecorder storyRecorder = this.f$0;
                storyRecorder.onClosePrepareListener = null;
                storyRecorder.prepareClosing = false;
                storyRecorder.close(this.f$1);
                break;
            case 1:
                StoryRecorder storyRecorder2 = this.f$0;
                if (!this.f$1) {
                    storyRecorder2.videoTimerView.setRecording(false, false);
                } else {
                    storyRecorder2.getClass();
                }
                break;
            default:
                this.f$0.animateGalleryListView(this.f$1);
                break;
        }
    }
}
