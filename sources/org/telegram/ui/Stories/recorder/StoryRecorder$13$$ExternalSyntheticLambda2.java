package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class StoryRecorder$13$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId = 1;
    public final StoryRecorder.AnonymousClass13 f$0;
    public final boolean f$1;
    public final Runnable f$2;

    public StoryRecorder$13$$ExternalSyntheticLambda2(StoryRecorder.AnonymousClass13 anonymousClass13, Runnable runnable, boolean z) {
        this.f$0 = anonymousClass13;
        this.f$2 = runnable;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.startRecording(this.f$1, this.f$2);
                break;
            default:
                StoryRecorder.AnonymousClass13 anonymousClass13 = this.f$0;
                anonymousClass13.getClass();
                this.f$2.run();
                StoryRecorder storyRecorder = StoryRecorder.this;
                HintTextView hintTextView = storyRecorder.hintTextView;
                hintTextView.textDrawable.setText(LocaleController.getString(this.f$1 ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false);
                hintTextView.invalidate();
                storyRecorder.animateRecording(true, true);
                storyRecorder.setAwakeLock(true);
                storyRecorder.collageListView.setVisible(false, true);
                storyRecorder.videoTimerView.setRecording(true, true);
                storyRecorder.showVideoTimer(true, true);
                break;
        }
    }

    public StoryRecorder$13$$ExternalSyntheticLambda2(StoryRecorder.AnonymousClass13 anonymousClass13, boolean z, Runnable runnable) {
        this.f$0 = anonymousClass13;
        this.f$1 = z;
        this.f$2 = runnable;
    }
}
