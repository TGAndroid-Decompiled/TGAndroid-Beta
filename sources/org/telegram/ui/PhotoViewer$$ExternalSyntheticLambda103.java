package org.telegram.ui;

import android.animation.AnimatorSet;
import android.view.View;

public final class PhotoViewer$$ExternalSyntheticLambda103 implements Runnable {
    public final PhotoViewer f$0;
    public final View f$1;
    public final PhotoViewer.AnonymousClass43 f$2;
    public final float f$3;
    public final float f$4;
    public final AnimatorSet f$5;

    public PhotoViewer$$ExternalSyntheticLambda103(PhotoViewer photoViewer, View view, PhotoViewer.AnonymousClass43 anonymousClass43, float f, float f2, AnimatorSet animatorSet) {
        this.f$0 = photoViewer;
        this.f$1 = view;
        this.f$2 = anonymousClass43;
        this.f$3 = f;
        this.f$4 = f2;
        this.f$5 = animatorSet;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f$0;
        photoViewer.getClass();
        View view = this.f$1;
        PhotoViewer.AnonymousClass43 anonymousClass43 = this.f$2;
        view.setOutlineProvider(anonymousClass43);
        view.setClipToOutline(true);
        photoViewer.textureImageView.setOutlineProvider(anonymousClass43);
        photoViewer.textureImageView.setClipToOutline(true);
        PhotoViewer.FirstFrameView firstFrameView = photoViewer.firstFrameView;
        if (firstFrameView != null) {
            firstFrameView.setOutlineProvider(anonymousClass43);
            photoViewer.firstFrameView.setClipToOutline(true);
        }
        photoViewer.textureImageView.setTranslationY(this.f$3);
        float f = this.f$4;
        view.setTranslationY(f);
        PhotoViewer.FirstFrameView firstFrameView2 = photoViewer.firstFrameView;
        if (firstFrameView2 != null) {
            firstFrameView2.setTranslationY(f);
        }
        photoViewer.translationY = 0.0f;
        photoViewer.containerView.invalidate();
        this.f$5.start();
    }
}
