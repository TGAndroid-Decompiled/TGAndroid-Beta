package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class is0 implements org.telegram.ui.Components.f40 {
    public final PhotoViewer f40349a;

    public is0(PhotoViewer photoViewer) {
        this.f40349a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f40349a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f35695j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f35695j5 = null;
        }
        photoViewer.f35711l5 = true;
        photoViewer.D2(i10);
        photoViewer.f35711l5 = false;
    }
}
