package org.telegram.ui;

import org.telegram.ui.Components.CaptionPhotoViewer;

public final class PhotoViewer$$ExternalSyntheticLambda83 implements Runnable {
    public final int $r8$classId;
    public final CaptionPhotoViewer f$0;

    public PhotoViewer$$ExternalSyntheticLambda83(CaptionPhotoViewer captionPhotoViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = captionPhotoViewer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.setVisibility(8);
                break;
            default:
                CaptionPhotoViewer captionPhotoViewer = this.f$0;
                if (captionPhotoViewer.moveButtonExpanded) {
                    captionPhotoViewer.moveButtonExpanded = false;
                    captionPhotoViewer.invalidate();
                }
                break;
        }
    }
}
