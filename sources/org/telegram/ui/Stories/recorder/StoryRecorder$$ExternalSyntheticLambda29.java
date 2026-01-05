package org.telegram.ui.Stories.recorder;

import android.content.res.Resources;

public final class StoryRecorder$$ExternalSyntheticLambda29 implements Runnable {
    public final StoryRecorder f$0;

    public StoryRecorder$$ExternalSyntheticLambda29(StoryRecorder storyRecorder) {
        this.f$0 = storyRecorder;
    }

    @Override
    public final void run() throws Resources.NotFoundException {
        this.f$0.onOpenDone();
    }
}
