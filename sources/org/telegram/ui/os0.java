package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
public final class os0 implements org.telegram.ui.Components.v30 {
    public final PhotoViewer f35952a;

    public os0(PhotoViewer photoViewer) {
        this.f35952a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f35952a;
        photoViewer.P4 = -1;
        ImageReceiver.BitmapHolder bitmapHolder = photoViewer.f30956j5;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            photoViewer.f30956j5 = null;
        }
        photoViewer.f30972l5 = true;
        photoViewer.A2(i10);
        photoViewer.f30972l5 = false;
    }
}
