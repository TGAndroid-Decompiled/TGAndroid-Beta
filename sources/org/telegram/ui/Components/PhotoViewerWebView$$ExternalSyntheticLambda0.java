package org.telegram.ui.Components;

public final class PhotoViewerWebView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final PhotoViewerWebView f$0;

    public PhotoViewerWebView$$ExternalSyntheticLambda0(PhotoViewerWebView photoViewerWebView, int i) {
        this.$r8$classId = i;
        this.f$0 = photoViewerWebView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.playVideo();
                break;
            case 1:
                this.f$0.lambda$new$0();
                break;
            default:
                this.f$0.openInPip();
                break;
        }
    }
}
