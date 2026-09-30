package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class ns0 implements org.telegram.ui.Components.x30 {
    public final PhotoViewer f35963a;

    public ns0(PhotoViewer photoViewer) {
        this.f35963a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f35963a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f31273j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f31273j5 = null;
        }
        photoViewer.f31289l5 = true;
        photoViewer.B2(i10);
        photoViewer.f31289l5 = false;
    }
}
