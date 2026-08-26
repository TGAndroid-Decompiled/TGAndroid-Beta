package org.telegram.ui.Components;

public final class ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId;
    public final ChatAttachAlertPhotoLayout f$0;

    public ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda12(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$hideCamera$16();
                break;
            case 1:
                ChatAttachAlertPhotoLayout.access$6800(this.f$0);
                break;
            case 2:
                ChatAttachAlertPhotoLayout.access$6700(this.f$0);
                break;
            case 3:
                this.f$0.lambda$onPreMeasure$29();
                break;
            case 4:
                this.f$0.lambda$showZoomControls$14();
                break;
            case 5:
                this.f$0.lambda$showZoomControls$15();
                break;
            default:
                this.f$0.lambda$onHide$28();
                break;
        }
    }
}
