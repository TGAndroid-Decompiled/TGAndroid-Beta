package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class bt0 implements org.telegram.ui.Components.h40 {
    public final PhotoViewer f34385a;

    public bt0(PhotoViewer photoViewer) {
        this.f34385a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f34385a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f31977j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f31977j5 = null;
        }
        photoViewer.f31993l5 = true;
        photoViewer.B2(i10);
        photoViewer.f31993l5 = false;
    }
}
