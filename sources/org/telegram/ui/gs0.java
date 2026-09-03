package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class gs0 implements org.telegram.ui.Components.x30 {
    public final PhotoViewer f34504a;

    public gs0(PhotoViewer photoViewer) {
        this.f34504a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f34504a;
        photoViewer.M4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f31729g5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f31729g5 = null;
        }
        photoViewer.f31747i5 = true;
        photoViewer.B2(i10);
        photoViewer.f31747i5 = false;
    }
}
