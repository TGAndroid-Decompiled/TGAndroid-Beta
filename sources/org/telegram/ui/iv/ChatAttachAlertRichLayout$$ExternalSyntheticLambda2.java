package org.telegram.ui.iv;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.MessageSendPreview;

public final class ChatAttachAlertRichLayout$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlertRichLayout f$0;

    public ChatAttachAlertRichLayout$$ExternalSyntheticLambda2(ChatAttachAlertRichLayout chatAttachAlertRichLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertRichLayout;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatAttachAlertRichLayout chatAttachAlertRichLayout = this.f$0;
                if (!UserConfig.getInstance(chatAttachAlertRichLayout.currentAccount).isPremium()) {
                    new PremiumFeatureBottomSheet(chatAttachAlertRichLayout.parentAlert.baseFragment, chatAttachAlertRichLayout.getContext(), chatAttachAlertRichLayout.currentAccount, false, 43, true, null).show();
                }
                break;
            case 1:
                ChatAttachAlertRichLayout chatAttachAlertRichLayout2 = this.f$0;
                chatAttachAlertRichLayout2.sendSelectedItems(2147483646, true, 0, false, 0L);
                MessageSendPreview messageSendPreview = chatAttachAlertRichLayout2.messageSendPreview;
                if (messageSendPreview != null) {
                    messageSendPreview.sent = false;
                    messageSendPreview.dismiss();
                    chatAttachAlertRichLayout2.messageSendPreview = null;
                }
                break;
            case 2:
                ChatAttachAlertRichLayout chatAttachAlertRichLayout3 = this.f$0;
                chatAttachAlertRichLayout3.sendSelectedItems(0, false, 0, false, 0L);
                MessageSendPreview messageSendPreview2 = chatAttachAlertRichLayout3.messageSendPreview;
                if (messageSendPreview2 != null) {
                    messageSendPreview2.sent = true;
                    messageSendPreview2.dismiss();
                    chatAttachAlertRichLayout3.messageSendPreview = null;
                }
                break;
            case 3:
                this.f$0.updateToolbarTopOffset();
                break;
            default:
                ChatAttachAlertRichLayout chatAttachAlertRichLayout4 = this.f$0;
                RichEditorToolbar richEditorToolbar = chatAttachAlertRichLayout4.toolbar;
                if (richEditorToolbar != null) {
                    richEditorToolbar.setSendEnabled(chatAttachAlertRichLayout4.listView.isWithinLimits());
                }
                break;
        }
    }
}
