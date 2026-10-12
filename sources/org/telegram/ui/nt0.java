package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nt0 extends org.telegram.ui.Components.n10 {
    public final vs0 f40475e;
    public final PhotoViewer f40476f;

    public nt0(PhotoViewer photoViewer, vs0 vs0Var) {
        super(false);
        this.f40476f = photoViewer;
        this.f40475e = vs0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f40476f;
        int[] iArr = photoViewer.f33813m3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f33823n3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f40476f.f33849q3.c();
    }

    @Override
    public final void l(float f7) {
        this.f40475e.b(f7);
        PhotoViewer photoViewer = this.f40476f;
        photoViewer.f33849q3.h(f7, false);
        photoViewer.f33858r3.invalidate();
    }
}
