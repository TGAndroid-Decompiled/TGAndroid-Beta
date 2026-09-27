package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gt0 extends org.telegram.ui.Components.w00 {
    public final os0 e;
    public final PhotoViewer f34039f;

    public gt0(PhotoViewer photoViewer, os0 os0Var) {
        super(false);
        this.f34039f = photoViewer;
        this.e = os0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f34039f;
        int[] iArr = photoViewer.f31295m3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f31305n3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f34039f.f31331q3.c();
    }

    @Override
    public final void l(float f7) {
        this.e.b(f7);
        PhotoViewer photoViewer = this.f34039f;
        photoViewer.f31331q3.h(f7, false);
        photoViewer.f31340r3.invalidate();
    }
}
