package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class is0 extends org.telegram.ui.Components.f00 {
    public final qr0 f39280e;
    public final PhotoViewer f39281f;

    public is0(PhotoViewer photoViewer, qr0 qr0Var) {
        super(false);
        this.f39281f = photoViewer;
        this.f39280e = qr0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f39281f;
        int[] iArr = photoViewer.f35657i3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f35666j3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f39281f.f35691m3.c();
    }

    @Override
    public final void l(float f10) {
        this.f39280e.b(f10);
        PhotoViewer photoViewer = this.f39281f;
        photoViewer.f35691m3.h(f10, false);
        photoViewer.f35701n3.invalidate();
    }
}
