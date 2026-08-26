package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PollItemMenu;

public final class EmojiBottomSheet$$ExternalSyntheticLambda1 implements Utilities.Callback {
    public final int $r8$classId;
    public final EmojiBottomSheet f$0;

    public EmojiBottomSheet$$ExternalSyntheticLambda1(EmojiBottomSheet emojiBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = emojiBottomSheet;
    }

    @Override
    public final void run(Object obj) {
        EmojiBottomSheet emojiBottomSheet = this.f$0;
        Integer num = (Integer) obj;
        switch (this.$r8$classId) {
            case 0:
                emojiBottomSheet.lambda$new$2$41();
                break;
            case 1:
                PollItemMenu.AnonymousClass3 anonymousClass3 = emojiBottomSheet.viewPager;
                ValueAnimator valueAnimator = anonymousClass3.manualScrolling;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && anonymousClass3.getCurrentPosition() != num.intValue()) {
                    anonymousClass3.scrollToPosition$1(num.intValue());
                    float fIntValue = num.intValue();
                    EmojiBottomSheet.TabsView tabsView = emojiBottomSheet.tabsView;
                    tabsView.type = fIntValue;
                    tabsView.invalidate();
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
