package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;

public final class MessageSendPreview$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlert.AnonymousClass25 f$0;

    public MessageSendPreview$$ExternalSyntheticLambda1(ChatAttachAlert.AnonymousClass25 anonymousClass25, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass25;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatAttachAlert.AnonymousClass25 anonymousClass25 = this.f$0;
                anonymousClass25.getClass();
                SpoilerEffect2.pause$1(false);
                SpoilerEffect2 spoilerEffect2 = anonymousClass25.spoilerEffect2;
                if (spoilerEffect2 != null) {
                    spoilerEffect2.detach(anonymousClass25.windowView);
                }
                AndroidUtilities.runOnUIThread(new MessageSendPreview$$ExternalSyntheticLambda1(anonymousClass25, 1));
                break;
            default:
                this.f$0.lambda$dismissInto$7();
                break;
        }
    }
}
