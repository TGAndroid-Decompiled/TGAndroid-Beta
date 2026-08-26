package org.telegram.ui.Stories.recorder;

import android.view.WindowManager;

public final class StoryRecorder$$ExternalSyntheticLambda95 implements Runnable {
    public final int $r8$classId;
    public final StoryRecorder f$0;

    public StoryRecorder$$ExternalSyntheticLambda95(StoryRecorder storyRecorder, int i) {
        this.$r8$classId = i;
        this.f$0 = storyRecorder;
    }

    @Override
    public final void run() {
        StoryRecorder.WindowView windowView;
        switch (this.$r8$classId) {
            case 0:
                StoryRecorder storyRecorder = this.f$0;
                storyRecorder.animateGalleryListView(false);
                storyRecorder.lastGallerySelectedAlbum = null;
                break;
            default:
                StoryRecorder storyRecorder2 = this.f$0;
                WindowManager windowManager = storyRecorder2.windowManager;
                if (windowManager != null && (windowView = storyRecorder2.windowView) != null && windowView.getParent() != null) {
                    windowManager.removeView(storyRecorder2.windowView);
                    break;
                }
                break;
        }
    }
}
