package org.telegram.ui;
public final class cq0 implements Runnable {
    public final PhotoViewer f36526a;

    public cq0(PhotoViewer photoViewer) {
        this.f36526a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f36526a;
        org.telegram.messenger.jj jjVar = photoViewer.T4;
        if (jjVar == null) {
            return;
        }
        org.telegram.messenger.b8.G(jjVar.I1).c0(photoViewer.T4.F0(), true, false);
    }
}
