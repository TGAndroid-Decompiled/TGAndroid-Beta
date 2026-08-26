package org.telegram.ui.Stories;

import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;

public final class PeerStoriesView$8$$ExternalSyntheticLambda54 implements Runnable {
    public final int $r8$classId;
    public final StoryPrivacyBottomSheet f$0;

    public PeerStoriesView$8$$ExternalSyntheticLambda54(StoryPrivacyBottomSheet storyPrivacyBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = storyPrivacyBottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
            case 1:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
            default:
                this.f$0.lambda$openCrafting$8();
                break;
        }
    }
}
