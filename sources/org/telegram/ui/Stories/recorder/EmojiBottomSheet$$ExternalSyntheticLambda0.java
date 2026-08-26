package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.Utilities;
import org.telegram.ui.community.CommunitySheet;

public final class EmojiBottomSheet$$ExternalSyntheticLambda0 implements Utilities.Callback {
    public final int $r8$classId;
    public final EmojiBottomSheet f$0;

    public EmojiBottomSheet$$ExternalSyntheticLambda0(EmojiBottomSheet emojiBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = emojiBottomSheet;
    }

    @Override
    public final void run(Object obj) {
        EmojiBottomSheet emojiBottomSheet = this.f$0;
        Integer num = (Integer) obj;
        switch (this.$r8$classId) {
            case 0:
                emojiBottomSheet.lambda$new$2$16();
                break;
            case 1:
                CommunitySheet.AnonymousClass9 anonymousClass9 = emojiBottomSheet.viewPager;
                if (!anonymousClass9.isManualScrolling() && anonymousClass9.getCurrentPosition() != num.intValue()) {
                    anonymousClass9.scrollToPosition(num.intValue());
                    float fIntValue = num.intValue();
                    EmojiBottomSheet.TabsView tabsView = emojiBottomSheet.tabsView;
                    tabsView.type = fIntValue;
                    tabsView.invalidate();
                    break;
                }
                break;
            default:
                int iIntValue = num.intValue();
                int i = EmojiBottomSheet.savedPosition;
                emojiBottomSheet.onWidgetClick(iIntValue);
                break;
        }
    }
}
