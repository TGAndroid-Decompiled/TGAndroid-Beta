package org.telegram.ui.Stories.recorder;

public final class TimelineView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final TimelineView f$0;

    public TimelineView$$ExternalSyntheticLambda1(TimelineView timelineView, int i) {
        this.$r8$classId = i;
        this.f$0 = timelineView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                TimelineView timelineView = this.f$0;
                TimelineView.VideoThumbsLoader videoThumbsLoader = timelineView.roundThumbs;
                if (videoThumbsLoader != null) {
                    long j = videoThumbsLoader.duration;
                    if (j > 0) {
                        timelineView.roundDuration = j;
                    }
                }
                break;
            case 1:
                TimelineView.TimelineDelegate timelineDelegate = this.f$0.delegate;
                if (timelineDelegate != null) {
                    timelineDelegate.onAudioRemove();
                }
                break;
            default:
                TimelineView.TimelineDelegate timelineDelegate2 = this.f$0.delegate;
                if (timelineDelegate2 != null) {
                    timelineDelegate2.onRoundRemove();
                }
                break;
        }
    }
}
