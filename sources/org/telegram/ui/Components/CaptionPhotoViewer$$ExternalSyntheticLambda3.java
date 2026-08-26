package org.telegram.ui.Components;

public final class CaptionPhotoViewer$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final CaptionPhotoViewer f$0;
    public final boolean f$1;

    public CaptionPhotoViewer$$ExternalSyntheticLambda3(CaptionPhotoViewer captionPhotoViewer, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = captionPhotoViewer;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setAddPhotoVisible$6(this.f$1);
                break;
            case 1:
                this.f$0.lambda$setTimerVisible$7(this.f$1);
                break;
            default:
                this.f$0.lambda$showAiButton$8(this.f$1);
                break;
        }
    }
}
