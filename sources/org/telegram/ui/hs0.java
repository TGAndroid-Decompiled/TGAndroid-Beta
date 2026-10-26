package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
public final class hs0 implements Runnable {
    public final PhotoViewer f40065a;

    public hs0(PhotoViewer photoViewer) {
        this.f40065a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f40065a;
        MessageObject messageObject = photoViewer.T4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.T4.getDocument(), true, false);
    }
}
