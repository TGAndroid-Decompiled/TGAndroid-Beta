package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class gs0 implements org.telegram.ui.Components.y30 {
    public final PhotoViewer f37159a;

    public gs0(PhotoViewer photoViewer) {
        this.f37159a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f37159a;
        photoViewer.M4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f34281g5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f34281g5 = null;
        }
        photoViewer.f34299i5 = true;
        photoViewer.B2(i10);
        photoViewer.f34299i5 = false;
    }
}
