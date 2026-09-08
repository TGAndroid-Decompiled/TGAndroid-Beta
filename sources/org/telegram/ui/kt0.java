package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kt0 extends org.telegram.ui.Components.u00 {
    public final ss0 f38153e;
    public final PhotoViewer f38154f;

    public kt0(PhotoViewer photoViewer, ss0 ss0Var) {
        super(false);
        this.f38154f = photoViewer;
        this.f38153e = ss0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f38154f;
        int[] iArr = photoViewer.f33646m3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f33656n3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f38154f.f33682q3.c();
    }

    @Override
    public final void l(float f7) {
        this.f38153e.b(f7);
        PhotoViewer photoViewer = this.f38154f;
        photoViewer.f33682q3.h(f7, false);
        photoViewer.f33691r3.invalidate();
    }
}
