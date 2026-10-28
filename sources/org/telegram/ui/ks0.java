package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class ks0 implements org.telegram.ui.Components.f40 {
    public final PhotoViewer f40912a;

    public ks0(PhotoViewer photoViewer) {
        this.f40912a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f40912a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f35719j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f35719j5 = null;
        }
        photoViewer.f35735l5 = true;
        photoViewer.E2(i10);
        photoViewer.f35735l5 = false;
    }
}
