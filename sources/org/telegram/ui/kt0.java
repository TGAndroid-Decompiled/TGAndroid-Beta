package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kt0 extends org.telegram.ui.Components.l10 {
    public final ss0 f39415e;
    public final PhotoViewer f39416f;

    public kt0(PhotoViewer photoViewer, ss0 ss0Var) {
        super(false);
        this.f39416f = photoViewer;
        this.f39415e = ss0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f39416f;
        int[] iArr = photoViewer.f34002m3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f34012n3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f39416f.f34038q3.c();
    }

    @Override
    public final void l(float f7) {
        this.f39415e.b(f7);
        PhotoViewer photoViewer = this.f39416f;
        photoViewer.f34038q3.h(f7, false);
        photoViewer.f34047r3.invalidate();
    }
}
