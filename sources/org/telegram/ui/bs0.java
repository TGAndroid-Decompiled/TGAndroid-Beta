package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class bs0 implements org.telegram.ui.Components.d40 {
    public final PhotoViewer f35740a;

    public bs0(PhotoViewer photoViewer) {
        this.f35740a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f35740a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f33328j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f33328j5 = null;
        }
        photoViewer.f33344l5 = true;
        photoViewer.D2(i10);
        photoViewer.f33344l5 = false;
    }
}
