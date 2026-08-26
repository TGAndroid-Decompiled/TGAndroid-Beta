package org.telegram.ui.bots;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.ActionBar.AlertDialog;

public final class BotWebViewSheet$$ExternalSyntheticLambda15 implements ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.Delegate, GenericProvider, AlertDialog.OnButtonClickListener {
    public final BotWebViewSheet f$0;

    public BotWebViewSheet$$ExternalSyntheticLambda15(BotWebViewSheet botWebViewSheet) {
        this.f$0 = botWebViewSheet;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.dismiss$1(false);
    }

    @Override
    public void onDismiss(boolean z) {
        BotWebViewSheet botWebViewSheet = this.f$0;
        if (botWebViewSheet.fullscreen && z) {
            return;
        }
        botWebViewSheet.dismiss$1(true);
    }

    @Override
    public Object provide(Object obj) {
        return Boolean.valueOf(this.f$0.windowView.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
