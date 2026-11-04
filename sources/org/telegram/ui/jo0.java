package org.telegram.ui;
public final class jo0 implements Runnable {
    public final PhotoViewer f46662a;

    public jo0(PhotoViewer photoViewer) {
        this.f46662a = photoViewer;
    }

    @Override
    public final void run() {
        PhotoViewer photoViewer = this.f46662a;
        org.telegram.messenger.zi ziVar = photoViewer.U4;
        if (ziVar == null) {
            return;
        }
        org.telegram.messenger.w7.G(ziVar.I1).c0(photoViewer.U4.F0(), true, false);
    }
}
