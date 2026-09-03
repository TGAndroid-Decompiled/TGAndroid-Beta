package org.telegram.ui;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
public final class fs0 implements Runnable {
    public final PhotoViewer f34219a;

    public fs0(PhotoViewer photoViewer) {
        this.f34219a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f34219a;
        MessageObject messageObject = photoViewer.Q4;
        if (messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideo(photoViewer.Q4.getDocument(), true, false);
    }
}
