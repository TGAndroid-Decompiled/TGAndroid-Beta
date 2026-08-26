package org.telegram.ui.Components;

public final class SearchStateDrawable$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final int f$1;
    public final boolean f$2;

    public SearchStateDrawable$$ExternalSyntheticLambda1(PhotoViewerWebView.YoutubeProxy youtubeProxy, boolean z, int i) {
        this.f$0 = youtubeProxy;
        this.f$2 = z;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((SearchStateDrawable) this.f$0).lambda$setIconState$0(this.f$1, this.f$2);
                break;
            default:
                ((PhotoViewerWebView.YoutubeProxy) this.f$0).lambda$onPlayerStateChange$4(this.f$2, this.f$1);
                break;
        }
    }

    public SearchStateDrawable$$ExternalSyntheticLambda1(SearchStateDrawable searchStateDrawable, int i, boolean z) {
        this.f$0 = searchStateDrawable;
        this.f$1 = i;
        this.f$2 = z;
    }
}
