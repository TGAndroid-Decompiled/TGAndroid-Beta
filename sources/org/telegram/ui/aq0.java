package org.telegram.ui;
public final class aq0 implements Runnable {
    public final PhotoViewer f35825a;

    public aq0(PhotoViewer photoViewer) {
        this.f35825a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f35825a;
        org.telegram.messenger.kj kjVar = photoViewer.T4;
        if (kjVar == null) {
            return;
        }
        org.telegram.messenger.b8.G(kjVar.I1).c0(photoViewer.T4.F0(), true, false);
    }
}
