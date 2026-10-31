package org.telegram.ui;
public final class dq0 implements org.telegram.ui.Components.c30 {
    public final PhotoViewer f36813a;

    public dq0(PhotoViewer photoViewer) {
        this.f36813a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.f36813a;
        photoViewer.P4 = -1;
        org.telegram.messenger.kc kcVar = photoViewer.f33519j5;
        if (kcVar != null) {
            kcVar.a();
            photoViewer.f33519j5 = null;
        }
        photoViewer.f33535l5 = true;
        photoViewer.E2(i10);
        photoViewer.f33535l5 = false;
    }
}
