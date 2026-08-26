package org.telegram.ui.bots;

import org.telegram.messenger.GenericProvider;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda2 implements AlertDialog.OnButtonClickListener, ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.Delegate, GenericProvider {
    public final ChatAttachAlertBotWebViewLayout f$0;

    public ChatAttachAlertBotWebViewLayout$$ExternalSyntheticLambda2(ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout) {
        this.f$0 = chatAttachAlertBotWebViewLayout;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$onCheckDismissByUser$9();
    }

    @Override
    public void onDismiss(boolean z) {
        ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.f$0;
        if (chatAttachAlertBotWebViewLayout.onCheckDismissByUser()) {
            return;
        }
        chatAttachAlertBotWebViewLayout.swipeContainer.stickTo(0.0f);
    }

    @Override
    public Object provide(Object obj) {
        return this.f$0.lambda$new$6();
    }
}
