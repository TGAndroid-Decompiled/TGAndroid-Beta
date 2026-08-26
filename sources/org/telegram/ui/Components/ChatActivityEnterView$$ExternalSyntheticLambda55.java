package org.telegram.ui.Components;

import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;

public final class ChatActivityEnterView$$ExternalSyntheticLambda55 implements Utilities.Callback {
    public final int $r8$classId;
    public final ChatActivityEnterView f$0;

    public ChatActivityEnterView$$ExternalSyntheticLambda55(ChatActivityEnterView chatActivityEnterView, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivityEnterView;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.saveRichDraft((TL_iv.RichMessage) obj);
                break;
            case 1:
                this.f$0.lambda$new$6((CharSequence) obj);
                break;
            default:
                this.f$0.lambda$onSendLongClick$44((Canvas) obj);
                break;
        }
    }
}
