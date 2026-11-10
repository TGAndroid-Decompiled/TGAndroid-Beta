package org.telegram.ui;
public final class lp0 extends org.telegram.ui.Components.mz {
    public final uo0 f47650e;
    public final PhotoViewer f47651f;

    public lp0(PhotoViewer photoViewer, uo0 uo0Var) {
        super(false);
        this.f47651f = photoViewer;
        this.f47650e = uo0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f47651f;
        int[] iArr = photoViewer.f41445l3;
        sb2.append(org.telegram.messenger.id.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.id.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f41453m3;
        sb4.append(org.telegram.messenger.id.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.id.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.id.a0("AccDescrPlayerDuration", null, 2131754806, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f47651f.f41479p3.c();
    }

    @Override
    public final void l(float f10) {
        this.f47650e.a(f10);
        PhotoViewer photoViewer = this.f47651f;
        photoViewer.f41479p3.h(false, f10);
        photoViewer.f41488q3.invalidate();
    }
}
