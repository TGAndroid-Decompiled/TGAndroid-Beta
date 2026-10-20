package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class bs0 implements org.telegram.ui.Components.d40 {
    public final PhotoViewer f35739a;

    public bs0(PhotoViewer photoViewer) {
        this.f35739a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f35739a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f33327j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f33327j5 = null;
        }
        photoViewer.f33343l5 = true;
        photoViewer.D2(i10);
        photoViewer.f33343l5 = false;
    }
}
