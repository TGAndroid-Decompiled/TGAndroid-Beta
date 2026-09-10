package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kt0 extends org.telegram.ui.Components.b10 {
    public final ss0 e;
    public final PhotoViewer f34458f;

    public kt0(PhotoViewer photoViewer, ss0 ss0Var) {
        super(false);
        this.f34458f = photoViewer;
        this.e = ss0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f34458f;
        int[] iArr = photoViewer.f30119m3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f30129n3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f34458f.f30155q3.c();
    }

    @Override
    public final void l(float f7) {
        this.e.b(f7);
        PhotoViewer photoViewer = this.f34458f;
        photoViewer.f30155q3.h(f7, false);
        photoViewer.f30164r3.invalidate();
    }
}
