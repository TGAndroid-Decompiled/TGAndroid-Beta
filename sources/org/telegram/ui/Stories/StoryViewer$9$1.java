package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class StoryViewer$9$1 extends AnimatorListenerAdapter {
    public final int $r8$classId;
    public final StoryViewer.AnonymousClass8 this$1;

    public StoryViewer$9$1(StoryViewer.AnonymousClass8 anonymousClass8, int i) {
        this.$r8$classId = i;
        this.this$1 = anonymousClass8;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.$r8$classId) {
            case 0:
                super.onAnimationEnd(animator);
                StoryViewer.AnonymousClass8 anonymousClass8 = this.this$1;
                StoriesIntro storiesIntro = anonymousClass8.this$0.storiesIntro;
                if (storiesIntro != null) {
                    storiesIntro.stopAnimation();
                    StoryViewer storyViewer = anonymousClass8.this$0;
                    storyViewer.containerView.removeView(storyViewer.storiesIntro);
                }
                StoryViewer storyViewer2 = anonymousClass8.this$0;
                storyViewer2.storiesIntro = null;
                storyViewer2.updatePlayingMode();
                break;
            default:
                super.onAnimationEnd(animator);
                StoriesIntro storiesIntro2 = this.this$1.this$0.storiesIntro;
                if (storiesIntro2 != null) {
                    storiesIntro2.startAnimation(true);
                }
                break;
        }
    }
}
