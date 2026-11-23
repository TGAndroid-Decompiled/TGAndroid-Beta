package org.telegram.ui;
public final class kp0 extends org.telegram.ui.Components.zz {
    public final to0 f49327e;
    public final PhotoViewer f49328f;

    public kp0(PhotoViewer photoViewer, to0 to0Var) {
        super(false);
        this.f49328f = photoViewer;
        this.f49327e = to0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f49328f;
        int[] iArr = photoViewer.f43279m3;
        sb2.append(org.telegram.messenger.hd.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.hd.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f43288n3;
        sb4.append(org.telegram.messenger.hd.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.hd.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.hd.a0("AccDescrPlayerDuration", null, 2131754805, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f49328f.f43314q3.c();
    }

    @Override
    public final void l(float f10) {
        this.f49327e.a(f10);
        PhotoViewer photoViewer = this.f49328f;
        photoViewer.f43314q3.h(false, f10);
        photoViewer.f43324r3.invalidate();
    }
}
