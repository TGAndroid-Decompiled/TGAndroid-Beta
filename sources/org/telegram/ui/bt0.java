package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
public final class bt0 implements Runnable {
    public final PhotoViewer f34626a;

    public bt0(PhotoViewer photoViewer) {
        this.f34626a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f34626a;
        MessageObject messageObject = photoViewer.T4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.T4.getDocument(), true, false);
    }
}
