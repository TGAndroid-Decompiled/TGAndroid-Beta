package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
public final class ds0 implements Runnable {
    public final PhotoViewer f36728a;

    public ds0(PhotoViewer photoViewer) {
        this.f36728a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f36728a;
        MessageObject messageObject = photoViewer.T4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.T4.getDocument(), true, false);
    }
}
