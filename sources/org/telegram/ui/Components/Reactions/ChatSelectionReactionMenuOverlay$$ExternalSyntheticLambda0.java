package org.telegram.ui.Components.Reactions;

import com.stripe.android.Stripe;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.LayoutHelper;

public final class ChatSelectionReactionMenuOverlay$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatSelectionReactionMenuOverlay f$0;

    public ChatSelectionReactionMenuOverlay$$ExternalSyntheticLambda0(ChatSelectionReactionMenuOverlay chatSelectionReactionMenuOverlay, int i) {
        this.$r8$classId = i;
        this.f$0 = chatSelectionReactionMenuOverlay;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invalidatePosition(true);
                break;
            default:
                ChatSelectionReactionMenuOverlay chatSelectionReactionMenuOverlay = this.f$0;
                chatSelectionReactionMenuOverlay.currentPrimaryObject = chatSelectionReactionMenuOverlay.findPrimaryObject();
                ChatSelectionReactionMenuOverlay.AnonymousClass2 anonymousClass2 = chatSelectionReactionMenuOverlay.reactionsContainerLayout;
                ChatActivity chatActivity = chatSelectionReactionMenuOverlay.parentFragment;
                if (anonymousClass2 == null) {
                    ChatSelectionReactionMenuOverlay.AnonymousClass2 anonymousClass3 = new ChatSelectionReactionMenuOverlay.AnonymousClass2((chatActivity.getUserConfig().getClientUserId() > chatActivity.getDialogId() ? 1 : (chatActivity.getUserConfig().getClientUserId() == chatActivity.getDialogId() ? 0 : -1)) == 0 ? 3 : 0, chatActivity.getCurrentAccount(), chatSelectionReactionMenuOverlay.getContext(), chatSelectionReactionMenuOverlay.parentFragment, chatActivity.getResourceProvider());
                    anonymousClass3.enabledAlpha = 1.0f;
                    anonymousClass3.setWillNotDraw(false);
                    chatSelectionReactionMenuOverlay.reactionsContainerLayout = anonymousClass3;
                    int iDp = AndroidUtilities.dp(4.0f);
                    boolean z = LocaleController.isRTL;
                    int i = chatSelectionReactionMenuOverlay.mSidePadding;
                    int i2 = iDp + (z ? 0 : i);
                    int iDp2 = AndroidUtilities.dp(4.0f);
                    int iDp3 = AndroidUtilities.dp(4.0f);
                    if (!LocaleController.isRTL) {
                        i = 0;
                    }
                    int i3 = iDp3 + i;
                    int i4 = chatSelectionReactionMenuOverlay.mPadding;
                    anonymousClass3.setPadding(i2, iDp2, i3, AndroidUtilities.dp(i4));
                    chatSelectionReactionMenuOverlay.reactionsContainerLayout.setDelegate(new Stripe.AnonymousClass1(chatSelectionReactionMenuOverlay, 29));
                    chatSelectionReactionMenuOverlay.reactionsContainerLayout.setClipChildren(false);
                    chatSelectionReactionMenuOverlay.reactionsContainerLayout.setClipToPadding(false);
                    chatSelectionReactionMenuOverlay.addView(chatSelectionReactionMenuOverlay.reactionsContainerLayout, LayoutHelper.createFrame(-2, i4 + 70, 5));
                }
                chatSelectionReactionMenuOverlay.invalidatePosition(false);
                if (!chatSelectionReactionMenuOverlay.reactionsContainerLayout.isEnabled()) {
                    chatSelectionReactionMenuOverlay.messageSet = false;
                    chatSelectionReactionMenuOverlay.reactionsContainerLayout.setTransitionProgress(1.0f);
                } else {
                    chatSelectionReactionMenuOverlay.messageSet = true;
                    chatSelectionReactionMenuOverlay.reactionsContainerLayout.setMessage(chatSelectionReactionMenuOverlay.currentPrimaryObject, chatActivity.chatInfo, true);
                    chatSelectionReactionMenuOverlay.reactionsContainerLayout.startEnterAnimation(false);
                }
                break;
        }
    }
}
