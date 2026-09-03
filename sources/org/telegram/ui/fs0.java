package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
public final class fs0 implements Runnable {
    public final PhotoViewer f36907a;

    public fs0(PhotoViewer photoViewer) {
        this.f36907a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f36907a;
        MessageObject messageObject = photoViewer.Q4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.Q4.getDocument(), true, false);
    }
}
