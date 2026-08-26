package org.telegram.ui.Stars;

import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.chat.ChatInputViewsContainer;
import org.telegram.ui.Components.inset.WindowInsetsStateHolder;
import org.telegram.ui.Gifts.GiftMessageBottomSheet;

public final class StarGiftSheet$$ExternalSyntheticLambda182 implements Runnable {
    public final int $r8$classId;
    public final GiftMessageBottomSheet f$0;

    public StarGiftSheet$$ExternalSyntheticLambda182(GiftMessageBottomSheet giftMessageBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = giftMessageBottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showGiftOfferSheet$15();
                break;
            case 1:
                GiftMessageBottomSheet giftMessageBottomSheet = this.f$0;
                ChatInputViewsContainer chatInputViewsContainer = giftMessageBottomSheet.chatInputViewsContainer;
                if (chatInputViewsContainer != null) {
                    chatInputViewsContainer.checkInsets();
                }
                WindowInsetsStateHolder windowInsetsStateHolder = giftMessageBottomSheet.windowInsetsStateHolder;
                GiftMessageBottomSheet.AnonymousClass4 anonymousClass4 = giftMessageBottomSheet.writeButton;
                if (anonymousClass4 != null) {
                    anonymousClass4.setTranslationY(-windowInsetsStateHolder.getAnimatedMaxBottomInset());
                }
                AnimatedTextView animatedTextView = giftMessageBottomSheet.captionLimitView;
                if (animatedTextView != null) {
                    animatedTextView.setTranslationY(-windowInsetsStateHolder.getAnimatedMaxBottomInset());
                }
                giftMessageBottomSheet.checkUi_GiftLayoutPosition();
                break;
            default:
                this.f$0.writeButton.performClick();
                break;
        }
    }
}
