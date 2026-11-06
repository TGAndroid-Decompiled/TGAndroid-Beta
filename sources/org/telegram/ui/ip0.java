package org.telegram.ui;
public final class ip0 extends org.telegram.ui.Components.mz {
    public final ro0 f46703e;
    public final PhotoViewer f46704f;

    public ip0(PhotoViewer photoViewer, ro0 ro0Var) {
        super(false);
        this.f46704f = photoViewer;
        this.f46703e = ro0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f46704f;
        int[] iArr = photoViewer.f41444l3;
        sb2.append(org.telegram.messenger.hd.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.hd.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f41452m3;
        sb4.append(org.telegram.messenger.hd.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.hd.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.hd.a0("AccDescrPlayerDuration", null, 2131754806, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f46704f.f41478p3.c();
    }

    @Override
    public final void l(float f10) {
        this.f46703e.a(f10);
        PhotoViewer photoViewer = this.f46704f;
        photoViewer.f41478p3.h(false, f10);
        photoViewer.f41487q3.invalidate();
    }
}
