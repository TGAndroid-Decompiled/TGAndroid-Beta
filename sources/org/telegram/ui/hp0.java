package org.telegram.ui;
public final class hp0 extends org.telegram.ui.Components.mz {
    public final qo0 f46455e;
    public final PhotoViewer f46456f;

    public hp0(PhotoViewer photoViewer, qo0 qo0Var) {
        super(false);
        this.f46456f = photoViewer;
        this.f46455e = qo0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f46456f;
        int[] iArr = photoViewer.f41419l3;
        sb2.append(org.telegram.messenger.hd.G(iArr[0], "Minutes", new Object[0]));
        sb2.append(' ');
        sb2.append(org.telegram.messenger.hd.G(iArr[1], "Seconds", new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f41427m3;
        sb4.append(org.telegram.messenger.hd.G(iArr2[0], "Minutes", new Object[0]));
        sb4.append(' ');
        sb4.append(org.telegram.messenger.hd.G(iArr2[1], "Seconds", new Object[0]));
        return org.telegram.messenger.hd.a0("AccDescrPlayerDuration", null, 2131754806, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f46456f.f41453p3.c();
    }

    @Override
    public final void l(float f10) {
        this.f46455e.a(f10);
        PhotoViewer photoViewer = this.f46456f;
        photoViewer.f41453p3.h(false, f10);
        photoViewer.f41462q3.invalidate();
    }
}
