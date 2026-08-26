package org.telegram.ui.Components;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.MessagesController;

public final class ChatAttachAlert$$ExternalSyntheticLambda15 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ChatAttachAlert$$ExternalSyntheticLambda15(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatAttachAlert) this.f$0).lambda$new$13((ChatAttachAlert.AttachBotButton) this.f$1, (Boolean) obj);
                break;
            default:
                ((ChatAttachAlertAudioLayout) this.f$0).lambda$searchGlobal$6((MessagesController) this.f$1, (Long) obj);
                break;
        }
    }
}
