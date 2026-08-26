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
                CaptionPhotoViewer captionPhotoViewer = this.f$0;
                if (!this.f$1) {
                    captionPhotoViewer.aiButton.setVisibility(8);
                } else {
                    captionPhotoViewer.getClass();
                }
                break;
            default:
                CaptionPhotoViewer captionPhotoViewer2 = this.f$0;
                if (!this.f$1) {
                    captionPhotoViewer2.timerButton.setVisibility(8);
                } else {
                    captionPhotoViewer2.getClass();
                }
                break;
        }
    }
}
