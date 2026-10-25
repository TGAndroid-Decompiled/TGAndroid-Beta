package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class is0 implements org.telegram.ui.Components.f40 {
    public final PhotoViewer f40346a;

    public is0(PhotoViewer photoViewer) {
        this.f40346a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f40346a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f35692j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f35692j5 = null;
        }
        photoViewer.f35708l5 = true;
        photoViewer.D2(i10);
        photoViewer.f35708l5 = false;
    }
}
