package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import org.telegram.ui.DialogsActivity;

public final class DialogStoriesCell$StoryCell$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final DialogStoriesCell.StoryCell f$0;

    public DialogStoriesCell$StoryCell$$ExternalSyntheticLambda2(DialogStoriesCell.StoryCell storyCell, int i) {
        this.$r8$classId = i;
        this.f$0 = storyCell;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                DialogsActivity.AnonymousClass25 anonymousClass25 = this.f$0.this$0;
                ValueAnimator valueAnimator = anonymousClass25.textAnimator;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                anonymousClass25.animationRunnable = null;
                break;
            default:
                DialogStoriesCell.StoryCell storyCell = this.f$0;
                storyCell.drawAvatar = false;
                storyCell.invalidate();
                break;
        }
    }
}
