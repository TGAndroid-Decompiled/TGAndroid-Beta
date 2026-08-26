package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class ChatAttachAlertAudioLayout$$ExternalSyntheticLambda9 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final ChatAttachAlertAudioLayout f$0;
    public final MessagesController f$1;
    public final int f$2;

    public ChatAttachAlertAudioLayout$$ExternalSyntheticLambda9(ChatAttachAlertAudioLayout chatAttachAlertAudioLayout, MessagesController messagesController, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = chatAttachAlertAudioLayout;
        this.f$1 = messagesController;
        this.f$2 = i;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$searchChats$5(this.f$1, this.f$2, (TLRPC.messages_Messages) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                this.f$0.lambda$searchGlobal$7(this.f$1, this.f$2, (TLRPC.messages_BotResults) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
