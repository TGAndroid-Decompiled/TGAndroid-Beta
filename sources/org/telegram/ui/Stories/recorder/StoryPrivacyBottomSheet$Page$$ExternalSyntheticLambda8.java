package org.telegram.ui.Stories.recorder;

public final class StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final StoryPrivacyBottomSheet f$0;

    public StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda8(StoryPrivacyBottomSheet storyPrivacyBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = storyPrivacyBottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$openCrafting$8();
                break;
            default:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
        }
    }
}
