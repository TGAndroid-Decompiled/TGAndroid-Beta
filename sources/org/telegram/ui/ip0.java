package org.telegram.ui;
public final class ip0 extends org.telegram.ui.Components.nz {
    public final ro0 f46705e;
    public final PhotoViewer f46706f;

    public ip0(PhotoViewer photoViewer, ro0 ro0Var) {
        super(false);
        this.f46706f = photoViewer;
        this.f46705e = ro0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f46706f;
        int[] iArr = photoViewer.f41447l3;
        sb2.append(org.telegram.messenger.id.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.id.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f41455m3;
        sb4.append(org.telegram.messenger.id.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.id.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.id.a0("AccDescrPlayerDuration", null, 2131754806, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f46706f.f41481p3.c();
    }

    @Override
    public final void l(float f10) {
        this.f46705e.a(f10);
        PhotoViewer photoViewer = this.f46706f;
        photoViewer.f41481p3.h(false, f10);
        photoViewer.f41490q3.invalidate();
    }
}
