package org.telegram.ui;
public final class bq0 implements org.telegram.ui.Components.c30 {
    public final PhotoViewer f36098a;

    public bq0(PhotoViewer photoViewer) {
        this.f36098a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f36098a;
        photoViewer.P4 = -1;
        org.telegram.messenger.lc lcVar = photoViewer.f33526j5;
        if (lcVar != null) {
            lcVar.a();
            photoViewer.f33526j5 = null;
        }
        photoViewer.f33542l5 = true;
        photoViewer.E2(i10);
        photoViewer.f33542l5 = false;
    }
}
