package org.telegram.ui.Components;

import org.telegram.messenger.R;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.BaseFragment;

public final class EmojiPacksAlert$EmojiPacksLoader$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final EmojiPacksAlert.EmojiPacksLoader f$0;

    public EmojiPacksAlert$EmojiPacksLoader$$ExternalSyntheticLambda1(EmojiPacksAlert.EmojiPacksLoader emojiPacksLoader, int i) {
        this.$r8$classId = i;
        this.f$0 = emojiPacksLoader;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.this$0.lambda$showGiftOfferSheet$15();
                break;
            default:
                EmojiPacksAlert emojiPacksAlert = this.f$0.this$0;
                emojiPacksAlert.lambda$showGiftOfferSheet$15();
                BaseFragment baseFragment = emojiPacksAlert.fragment;
                if (baseFragment != null && baseFragment.getParentActivity() != null) {
                    UserNameResolver$$ExternalSyntheticOutline0.m(R.string.AddEmojiNotFound, BulletinFactory.of(baseFragment), null);
                    break;
                }
                break;
        }
    }
}
