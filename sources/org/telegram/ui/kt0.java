package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kt0 extends org.telegram.ui.Components.u00 {
    public final ss0 f38126e;
    public final PhotoViewer f38127f;

    public kt0(PhotoViewer photoViewer, ss0 ss0Var) {
        super(false);
        this.f38127f = photoViewer;
        this.f38126e = ss0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f38127f;
        int[] iArr = photoViewer.f33619m3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f33629n3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f38127f.f33655q3.c();
    }

    @Override
    public final void l(float f7) {
        this.f38126e.b(f7);
        PhotoViewer photoViewer = this.f38127f;
        photoViewer.f33655q3.h(f7, false);
        photoViewer.f33664r3.invalidate();
    }
}
