package org.telegram.ui;
public final class gp0 extends org.telegram.ui.Components.qz {
    public final po0 f47492e;
    public final PhotoViewer f47493f;

    public gp0(PhotoViewer photoViewer, po0 po0Var) {
        super(false);
        this.f47493f = photoViewer;
        this.f47492e = po0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f47493f;
        int[] iArr = photoViewer.f42824m3;
        sb2.append(org.telegram.messenger.hd.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.hd.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f42833n3;
        sb4.append(org.telegram.messenger.hd.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.hd.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.hd.a0("AccDescrPlayerDuration", null, 2131754806, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f47493f.f42859q3.c();
    }

    @Override
    public final void l(float f10) {
        this.f47492e.e(f10);
        PhotoViewer photoViewer = this.f47493f;
        photoViewer.f42859q3.h(false, f10);
        photoViewer.f42869r3.invalidate();
    }
}
