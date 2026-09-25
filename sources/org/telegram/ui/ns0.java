package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class ns0 implements org.telegram.ui.Components.v30 {
    public final PhotoViewer f35970a;

    public ns0(PhotoViewer photoViewer) {
        this.f35970a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f35970a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f31272j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f31272j5 = null;
        }
        photoViewer.f31288l5 = true;
        photoViewer.A2(i10);
        photoViewer.f31288l5 = false;
    }
}
