package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class ns0 implements org.telegram.ui.Components.y30 {
    public final PhotoViewer f36107a;

    public ns0(PhotoViewer photoViewer) {
        this.f36107a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f36107a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f31345j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f31345j5 = null;
        }
        photoViewer.f31361l5 = true;
        photoViewer.B2(i10);
        photoViewer.f31361l5 = false;
    }
}
