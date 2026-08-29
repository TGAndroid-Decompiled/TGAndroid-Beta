package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hs0 extends org.telegram.ui.Components.q00 {
    public final pr0 f39014e;
    public final PhotoViewer f39015f;

    public hs0(PhotoViewer photoViewer, pr0 pr0Var) {
        super(false);
        this.f39015f = photoViewer;
        this.f39014e = pr0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f39015f;
        int[] iArr = photoViewer.f35723i3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f35732j3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f39015f.f35757m3.c();
    }

    @Override
    public final void l(float f9) {
        this.f39014e.c(f9);
        PhotoViewer photoViewer = this.f39015f;
        photoViewer.f35757m3.h(f9, false);
        photoViewer.f35767n3.invalidate();
    }
}
