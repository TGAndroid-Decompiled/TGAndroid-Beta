package org.telegram.ui.Stories.recorder;

public final class CaptionStory$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final StoryRecorder.AnonymousClass8 f$0;

    public CaptionStory$$ExternalSyntheticLambda0(StoryRecorder.AnonymousClass8 anonymousClass8, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass8;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invalidateDrawOver2();
                break;
            case 1:
                StoryRecorder.AnonymousClass8 anonymousClass8 = this.f$0;
                anonymousClass8.collapsed = false;
                anonymousClass8.collapsedFromX = Integer.MIN_VALUE;
                anonymousClass8.invalidate();
                anonymousClass8.roundButton.setVisibility(0);
                anonymousClass8.periodButton.setVisibility(0);
                break;
            default:
                StoryRecorder storyRecorder = StoryRecorder.this;
                StoryRecorder.AnonymousClass7 anonymousClass7 = storyRecorder.previewView;
                if (anonymousClass7 != null) {
                    anonymousClass7.isMuted = false;
                    anonymousClass7.checkVolumes();
                    StoryRecorder.AnonymousClass7 anonymousClass9 = storyRecorder.previewView;
                    anonymousClass9.seekTo(0L);
                    TimelineView timelineView = anonymousClass9.timelineView;
                    if (timelineView != null) {
                        timelineView.setProgress(0L);
                    }
                }
                break;
        }
    }
}
