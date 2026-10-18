package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class ds0 implements org.telegram.ui.Components.d40 {
    public final PhotoViewer f36322a;

    public ds0(PhotoViewer photoViewer) {
        this.f36322a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f36322a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f33322j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f33322j5 = null;
        }
        photoViewer.f33338l5 = true;
        photoViewer.B2(i10);
        photoViewer.f33338l5 = false;
    }
}
