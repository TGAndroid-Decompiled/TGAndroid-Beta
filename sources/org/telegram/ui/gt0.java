package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gt0 extends org.telegram.ui.Components.x00 {
    public final os0 f36729e;
    public final PhotoViewer f36730f;

    public gt0(PhotoViewer photoViewer, os0 os0Var) {
        super(false);
        this.f36730f = photoViewer;
        this.f36729e = os0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f36730f;
        int[] iArr = photoViewer.f33971m3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f33981n3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f36730f.f34007q3.c();
    }

    @Override
    public final void l(float f7) {
        this.f36729e.b(f7);
        PhotoViewer photoViewer = this.f36730f;
        photoViewer.f34007q3.h(f7, false);
        photoViewer.f34016r3.invalidate();
    }
}
