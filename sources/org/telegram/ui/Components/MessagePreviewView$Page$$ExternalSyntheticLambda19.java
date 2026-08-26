package org.telegram.ui.Components;

import android.content.Context;

public final class MessagePreviewView$Page$$ExternalSyntheticLambda19 implements Runnable {
    public final int $r8$classId;
    public final MessagePreviewView.Page f$0;
    public final Context f$1;

    public MessagePreviewView$Page$$ExternalSyntheticLambda19(MessagePreviewView.Page page, Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = page;
        this.f$1 = context;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$13(this.f$1);
                break;
            default:
                this.f$0.lambda$new$12(this.f$1);
                break;
        }
    }
}
