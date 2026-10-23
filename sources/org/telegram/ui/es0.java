package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class es0 implements org.telegram.ui.Components.d40 {
    public final PhotoViewer f37021a;

    public es0(PhotoViewer photoViewer) {
        this.f37021a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f37021a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f33629j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f33629j5 = null;
        }
        photoViewer.f33645l5 = true;
        photoViewer.D2(i10);
        photoViewer.f33645l5 = false;
    }
}
