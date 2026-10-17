package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class ds0 implements org.telegram.ui.Components.d40 {
    public final PhotoViewer f36318a;

    public ds0(PhotoViewer photoViewer) {
        this.f36318a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f36318a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f33315j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f33315j5 = null;
        }
        photoViewer.f33331l5 = true;
        photoViewer.B2(i10);
        photoViewer.f33331l5 = false;
    }
}
