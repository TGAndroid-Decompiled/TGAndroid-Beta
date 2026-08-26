package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.BaseFragment;

public final class EmojiView$23$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final BaseFragment f$0;

    public EmojiView$23$$ExternalSyntheticLambda2(BaseFragment baseFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                EmojiView.AnonymousClass23.lambda$stickerSetPositionChanged$1(this.f$0);
                break;
            case 1:
                ChatActivityEnterView.lambda$checkPremiumAnimatedEmoji$65(this.f$0);
                break;
            default:
                SharedMediaLayout.lambda$new$12(this.f$0);
                break;
        }
    }
}
