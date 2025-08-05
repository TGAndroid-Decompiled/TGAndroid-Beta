package org.telegram.ui;

public final class PhotoViewer$$ExternalSyntheticLambda74 implements Runnable {
    public final PhotoViewer f$0;

    public PhotoViewer$$ExternalSyntheticLambda74(PhotoViewer photoViewer) {
        this.f$0 = photoViewer;
    }

    @Override
    public final void run() {
        this.f$0.invalidateBlur();
    }
}
