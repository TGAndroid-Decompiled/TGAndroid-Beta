package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
public final class ps0 implements Runnable {
    public final PhotoViewer f36540a;

    public ps0(PhotoViewer photoViewer) {
        this.f36540a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f36540a;
        MessageObject messageObject = photoViewer.T4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.T4.getDocument(), true, false);
    }
}
