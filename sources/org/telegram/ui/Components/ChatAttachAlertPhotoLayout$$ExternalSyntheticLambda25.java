package org.telegram.ui.Components;

public final class ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda25 implements Runnable {
    public final int $r8$classId = 0;
    public final ChatAttachAlertPhotoLayout f$0;
    public final ChatAttachAlertPhotoLayoutPreview f$1;

    public ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda25(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview) {
        this.f$0 = chatAttachAlertPhotoLayout;
        this.f$1 = chatAttachAlertPhotoLayoutPreview;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onShow$27(this.f$1);
                break;
            default:
                this.f$1.lambda$onShow$0(this.f$0);
                break;
        }
    }

    public ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda25(ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview, ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f$1 = chatAttachAlertPhotoLayoutPreview;
        this.f$0 = chatAttachAlertPhotoLayout;
    }
}
