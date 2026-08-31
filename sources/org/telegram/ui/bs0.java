package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class bs0 implements org.telegram.ui.Components.y30 {
    public final PhotoViewer f35585a;

    public bs0(PhotoViewer photoViewer) {
        this.f35585a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f35585a;
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
