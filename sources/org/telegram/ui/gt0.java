package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gt0 extends org.telegram.ui.Components.x00 {
    public final os0 f36724e;
    public final PhotoViewer f36725f;

    public gt0(PhotoViewer photoViewer, os0 os0Var) {
        super(false);
        this.f36725f = photoViewer;
        this.f36724e = os0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f36725f;
        int[] iArr = photoViewer.f33965m3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f33975n3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f36725f.f34001q3.c();
    }

    @Override
    public final void l(float f7) {
        this.f36724e.b(f7);
        PhotoViewer photoViewer = this.f36725f;
        photoViewer.f34001q3.h(f7, false);
        photoViewer.f34010r3.invalidate();
    }
}
