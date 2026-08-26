package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;

public final class TopicsFragment$2$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final TopicCreateFragment f$0;

    public TopicsFragment$2$$ExternalSyntheticLambda2(TopicCreateFragment topicCreateFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = topicCreateFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                TopicCreateFragment topicCreateFragment = this.f$0;
                topicCreateFragment.editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(topicCreateFragment.editTextBoldCursor);
                break;
            default:
                TopicCreateFragment topicCreateFragment2 = this.f$0;
                topicCreateFragment2.getClass();
                new PremiumFeatureBottomSheet(topicCreateFragment2, topicCreateFragment2.getParentActivity(), topicCreateFragment2.getCurrentAccount(), false, 11, false, null).show();
                break;
        }
    }
}
