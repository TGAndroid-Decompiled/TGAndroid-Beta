package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nt0 extends org.telegram.ui.Components.n10 {
    public final vs0 f40472e;
    public final PhotoViewer f40473f;

    public nt0(PhotoViewer photoViewer, vs0 vs0Var) {
        super(false);
        this.f40473f = photoViewer;
        this.f40472e = vs0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f40473f;
        int[] iArr = photoViewer.f33811m3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f33821n3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f40473f.f33847q3.c();
    }

    @Override
    public final void l(float f7) {
        this.f40472e.b(f7);
        PhotoViewer photoViewer = this.f40473f;
        photoViewer.f33847q3.h(f7, false);
        photoViewer.f33856r3.invalidate();
    }
}
