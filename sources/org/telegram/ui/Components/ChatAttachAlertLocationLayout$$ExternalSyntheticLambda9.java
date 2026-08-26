package org.telegram.ui.Components;

import org.telegram.messenger.IMapsProvider;

public final class ChatAttachAlertLocationLayout$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlertLocationLayout f$0;
    public final IMapsProvider.IMapView f$1;

    public ChatAttachAlertLocationLayout$$ExternalSyntheticLambda9(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, IMapsProvider.IMapView iMapView, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertLocationLayout;
        this.f$1 = iMapView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$15(this.f$1);
                break;
            default:
                this.f$0.lambda$new$16(this.f$1);
                break;
        }
    }
}
