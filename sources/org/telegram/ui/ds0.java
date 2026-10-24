package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class ds0 implements org.telegram.ui.Components.b40 {
    public final PhotoViewer f36720a;

    public ds0(PhotoViewer photoViewer) {
        this.f36720a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f36720a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f33631j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f33631j5 = null;
        }
        photoViewer.f33647l5 = true;
        photoViewer.D2(i10);
        photoViewer.f33647l5 = false;
    }
}
