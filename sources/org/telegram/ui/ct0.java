package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class ct0 implements org.telegram.ui.Components.h40 {
    public final PhotoViewer f35071a;

    public ct0(PhotoViewer photoViewer) {
        this.f35071a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f35071a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f32275j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f32275j5 = null;
        }
        photoViewer.f32291l5 = true;
        photoViewer.B2(i10);
        photoViewer.f32291l5 = false;
    }
}
