package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;

public final class MessageSendPreview$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final MessageSendPreview f$0;

    public MessageSendPreview$$ExternalSyntheticLambda3(MessageSendPreview messageSendPreview, int i) {
        this.$r8$classId = i;
        this.f$0 = messageSendPreview;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                MessageSendPreview messageSendPreview = this.f$0;
                SpoilerEffect2.pause$1(false);
                SpoilerEffect2 spoilerEffect2 = messageSendPreview.spoilerEffect2;
                if (spoilerEffect2 != null) {
                    spoilerEffect2.detach(messageSendPreview.windowView);
                }
                AndroidUtilities.runOnUIThread(new MessageSendPreview$$ExternalSyntheticLambda3(messageSendPreview, 1));
                break;
            default:
                this.f$0.lambda$dismiss$9();
                break;
        }
    }
}
