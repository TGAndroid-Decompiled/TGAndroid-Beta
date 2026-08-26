package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;

public final class ChatAttachAlertLocationLayout$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlertLocationLayout f$0;
    public final IMapsProvider.IMapView f$1;

    public ChatAttachAlertLocationLayout$$ExternalSyntheticLambda8(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, IMapsProvider.IMapView iMapView, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertLocationLayout;
        this.f$1 = iMapView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                IMapsProvider.IMapView iMapView = this.f$1;
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = this.f$0;
                chatAttachAlertLocationLayout.getClass();
                try {
                    iMapView.onCreate(null);
                    break;
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda8(chatAttachAlertLocationLayout, iMapView, 1));
                break;
            default:
                this.f$0.lambda$new$15(this.f$1);
                break;
        }
    }
}
