package org.telegram.p009ui.Components;

import org.telegram.messenger.ImageReceiver;
import org.telegram.p009ui.Components.ChatAttachAlert;

public final class ChatAttachAlert$AttachBotButton$1$$ExternalSyntheticLambda0 implements ImageReceiver.ImageReceiverDelegate {
    public static final ChatAttachAlert$AttachBotButton$1$$ExternalSyntheticLambda0 INSTANCE = new ChatAttachAlert$AttachBotButton$1$$ExternalSyntheticLambda0();

    private ChatAttachAlert$AttachBotButton$1$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ChatAttachAlert.AttachBotButton.C19991.lambda$new$0(imageReceiver, z, z2, z3);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }
}
