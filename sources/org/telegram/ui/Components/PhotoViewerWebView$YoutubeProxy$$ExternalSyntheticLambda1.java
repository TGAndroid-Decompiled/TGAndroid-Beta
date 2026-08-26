package org.telegram.ui.Components;

public final class PhotoViewerWebView$YoutubeProxy$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final PhotoViewerWebView.YoutubeProxy f$0;

    public PhotoViewerWebView$YoutubeProxy$$ExternalSyntheticLambda1(PhotoViewerWebView.YoutubeProxy youtubeProxy, int i) {
        this.$r8$classId = i;
        this.f$0 = youtubeProxy;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onPlayerLoaded$0();
                break;
            default:
                this.f$0.lambda$onPlayerStateChange$3();
                break;
        }
    }
}
