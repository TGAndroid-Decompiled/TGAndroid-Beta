package org.telegram.ui;
public final class ko0 implements org.telegram.ui.Components.g20 {
    public final PhotoViewer f46994a;

    public ko0(PhotoViewer photoViewer) {
        this.f46994a = photoViewer;
    }

    public final void a(int i3) {
        PhotoViewer photoViewer = this.f46994a;
        photoViewer.Q4 = -1;
        org.telegram.messenger.cc ccVar = photoViewer.f41466k5;
        if (ccVar != null) {
            ccVar.a();
            photoViewer.f41466k5 = null;
        }
        photoViewer.f41482m5 = true;
        photoViewer.E2(i3);
        photoViewer.f41482m5 = false;
    }
}
