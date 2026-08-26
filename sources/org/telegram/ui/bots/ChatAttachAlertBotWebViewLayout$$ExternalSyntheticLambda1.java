package org.telegram.ui.bots;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda1 implements AlertDialog.OnButtonClickListener, ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.Delegate, GenericProvider {
    public final ChatAttachAlertBotWebViewLayout f$0;

    public ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda1(ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout) {
        this.f$0 = chatAttachAlertBotWebViewLayout;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.parentAlert.lambda$showGiftOfferSheet$15();
    }

    @Override
    public void onDismiss(boolean z) {
        ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.f$0;
        if (chatAttachAlertBotWebViewLayout.onCheckDismissByUser()) {
            return;
        }
        chatAttachAlertBotWebViewLayout.swipeContainer.stickTo(0.0f, false, null);
    }

    @Override
    public Object provide(Object obj) {
        return Boolean.valueOf(this.f$0.parentAlert.sizeNotifierFrameLayout.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
