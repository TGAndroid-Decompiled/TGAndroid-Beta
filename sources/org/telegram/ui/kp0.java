package org.telegram.ui;
public final class kp0 extends org.telegram.ui.Components.nz {
    public final to0 f47326e;
    public final PhotoViewer f47327f;

    public kp0(PhotoViewer photoViewer, to0 to0Var) {
        super(false);
        this.f47327f = photoViewer;
        this.f47326e = to0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f47327f;
        int[] iArr = photoViewer.f41454l3;
        sb2.append(org.telegram.messenger.id.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.id.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f41462m3;
        sb4.append(org.telegram.messenger.id.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.id.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.id.a0("AccDescrPlayerDuration", null, 2131754806, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f47327f.f41488p3.c();
    }

    @Override
    public final void l(float f10) {
        this.f47326e.a(f10);
        PhotoViewer photoViewer = this.f47327f;
        photoViewer.f41488p3.h(false, f10);
        photoViewer.f41497q3.invalidate();
    }
}
