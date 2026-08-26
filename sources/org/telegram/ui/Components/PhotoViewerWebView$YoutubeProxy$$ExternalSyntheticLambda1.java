package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.PhotoViewer;

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
                PhotoViewer.AnonymousClass79 anonymousClass79 = this.f$0.this$0;
                anonymousClass79.progressBar.setVisibility(4);
                if (anonymousClass79.setPlaybackSpeed) {
                    anonymousClass79.setPlaybackSpeed = false;
                    anonymousClass79.setPlaybackSpeed(anonymousClass79.playbackSpeed);
                }
                ActionBarMenuSubItem actionBarMenuSubItem = anonymousClass79.pipItem;
                actionBarMenuSubItem.setEnabled(true);
                actionBarMenuSubItem.setAlpha(1.0f);
                PhotoViewer photoViewer = anonymousClass79.photoViewer;
                if (photoViewer != null) {
                    photoViewer.checkFullscreenButton();
                }
                break;
            default:
                this.f$0.this$0.progressBarBlackBackground.setVisibility(4);
                break;
        }
    }
}
