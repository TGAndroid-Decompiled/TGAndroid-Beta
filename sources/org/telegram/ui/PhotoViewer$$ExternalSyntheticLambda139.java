package org.telegram.ui;

public final class PhotoViewer$$ExternalSyntheticLambda139 implements Runnable {
    public final PhotoViewer f$0;

    public PhotoViewer$$ExternalSyntheticLambda139(PhotoViewer photoViewer) {
        this.f$0 = photoViewer;
    }

    @Override
    public final void run() {
        this.f$0.applyCurrentEditMode();
    }
}
