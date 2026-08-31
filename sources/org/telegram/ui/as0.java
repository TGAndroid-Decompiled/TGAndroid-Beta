package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
public final class as0 implements Runnable {
    public final PhotoViewer f35239a;

    public as0(PhotoViewer photoViewer) {
        this.f35239a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f35239a;
        MessageObject messageObject = photoViewer.Q4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.Q4.getDocument(), true, false);
    }
}
