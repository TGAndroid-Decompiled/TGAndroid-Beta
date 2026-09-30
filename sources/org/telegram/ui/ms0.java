package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
public final class ms0 implements Runnable {
    public final PhotoViewer f35776a;

    public ms0(PhotoViewer photoViewer) {
        this.f35776a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f35776a;
        MessageObject messageObject = photoViewer.T4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.T4.getDocument(), true, false);
    }
}
