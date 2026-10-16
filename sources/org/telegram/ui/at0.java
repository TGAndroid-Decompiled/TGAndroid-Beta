package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
public final class at0 implements Runnable {
    public final PhotoViewer f34083a;

    public at0(PhotoViewer photoViewer) {
        this.f34083a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f34083a;
        MessageObject messageObject = photoViewer.T4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.T4.getDocument(), true, false);
    }
}
