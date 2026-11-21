package org.telegram.ui;
public final class jp0 extends org.telegram.ui.Components.zz {
    public final so0 f49062e;
    public final PhotoViewer f49063f;

    public jp0(PhotoViewer photoViewer, so0 so0Var) {
        super(false);
        this.f49063f = photoViewer;
        this.f49062e = so0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f49063f;
        int[] iArr = photoViewer.f43310m3;
        sb2.append(org.telegram.messenger.gd.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.gd.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f43319n3;
        sb4.append(org.telegram.messenger.gd.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.gd.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.gd.a0("AccDescrPlayerDuration", null, 2131754805, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f49063f.f43345q3.c();
    }

    @Override
    public final void l(float f10) {
        this.f49062e.a(f10);
        PhotoViewer photoViewer = this.f49063f;
        photoViewer.f43345q3.h(false, f10);
        photoViewer.f43355r3.invalidate();
    }
}
