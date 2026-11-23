package org.telegram.ui;
public final class ip0 extends org.telegram.ui.Components.wz {
    public final fo0 f48898e;
    public final PhotoViewer f48899f;

    public ip0(PhotoViewer photoViewer, fo0 fo0Var) {
        super(false);
        this.f48899f = photoViewer;
        this.f48898e = fo0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f48899f;
        int[] iArr = photoViewer.f43395m3;
        sb2.append(org.telegram.messenger.gd.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.gd.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f43404n3;
        sb4.append(org.telegram.messenger.gd.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.gd.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.gd.a0("AccDescrPlayerDuration", null, 2131754805, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f48899f.f43430q3.c();
    }

    @Override
    public final void l(float f10) {
        this.f48898e.e(f10);
        PhotoViewer photoViewer = this.f48899f;
        photoViewer.f43430q3.h(false, f10);
        photoViewer.f43440r3.invalidate();
    }
}
