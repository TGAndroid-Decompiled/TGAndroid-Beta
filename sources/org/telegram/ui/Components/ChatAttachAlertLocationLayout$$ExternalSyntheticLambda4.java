package org.telegram.ui.Components;

public final class ChatAttachAlertLocationLayout$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlertLocationLayout f$0;

    public ChatAttachAlertLocationLayout$$ExternalSyntheticLambda4(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertLocationLayout;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$positionMarker$29();
                break;
            case 1:
                this.f$0.lambda$onMapInit$23();
                break;
            case 2:
                this.f$0.lambda$onMapInit$26();
                break;
            case 3:
                this.f$0.lambda$onMapInit$27();
                break;
            case 4:
                this.f$0.updateClipView();
                break;
            case 5:
                this.f$0.lambda$new$13();
                break;
            case 6:
                this.f$0.lambda$onShow$33();
                break;
            case 7:
                this.f$0.openShareLiveLocation();
                break;
            case 8:
                this.f$0.lambda$positionMarker$32();
                break;
            default:
                this.f$0.lambda$new$12();
                break;
        }
    }
}
