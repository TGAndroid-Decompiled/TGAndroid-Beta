package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
public final class cs0 implements Runnable {
    public final PhotoViewer f36395a;

    public cs0(PhotoViewer photoViewer) {
        this.f36395a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f36395a;
        MessageObject messageObject = photoViewer.T4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.T4.getDocument(), true, false);
    }
}
