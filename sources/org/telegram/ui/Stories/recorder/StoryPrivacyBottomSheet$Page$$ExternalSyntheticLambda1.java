package org.telegram.ui.Stories.recorder;

import org.telegram.ui.Components.Bulletin;

public final class StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final StoryPrivacyBottomSheet.Page f$0;

    public StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1(StoryPrivacyBottomSheet.Page page, int i) {
        this.$r8$classId = i;
        this.f$0 = page;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.keyboardMoving = false;
                break;
            case 1:
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                Bulletin.removeDelegate(storyPrivacyBottomSheet.container);
                super/*org.telegram.ui.ActionBar.BottomSheet*/.lambda$showGiftOfferSheet$15();
                break;
            case 2:
                StoryPrivacyBottomSheet.Page page = this.f$0;
                page.button.setLoading(false);
                StoryPrivacyBottomSheet storyPrivacyBottomSheet2 = StoryPrivacyBottomSheet.this;
                storyPrivacyBottomSheet2.closeKeyboard();
                storyPrivacyBottomSheet2.viewPager.scrollToPosition$1(0);
                break;
            case 3:
                StoryPrivacyBottomSheet storyPrivacyBottomSheet3 = StoryPrivacyBottomSheet.this;
                storyPrivacyBottomSheet3.activePage = 6;
                storyPrivacyBottomSheet3.viewPager.scrollToPosition$1(1);
                break;
            case 4:
                StoryPrivacyBottomSheet.Page page2 = this.f$0;
                page2.adapter.notifyItemChanged(2);
                page2.listView.forceLayout();
                page2.updateTops();
                break;
            default:
                StoryPrivacyBottomSheet.Page page3 = this.f$0;
                int i = page3.pageType;
                StoryPrivacyBottomSheet storyPrivacyBottomSheet4 = StoryPrivacyBottomSheet.this;
                if (i != 0) {
                    storyPrivacyBottomSheet4.lambda$openCrafting$8();
                } else {
                    storyPrivacyBottomSheet4.lambda$showGiftOfferSheet$15();
                }
                break;
        }
    }
}
