package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class at0 extends org.telegram.ui.Components.d10 {
    public final is0 e;
    public final PhotoViewer f37821f;

    public at0(PhotoViewer photoViewer, is0 is0Var) {
        super(false);
        this.f37821f = photoViewer;
        this.e = is0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f37821f;
        int[] iArr = photoViewer.f35741m3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f35751n3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f37821f.f35778q3.c();
    }

    @Override
    public final void l(float f7) {
        this.e.c(f7);
        PhotoViewer photoViewer = this.f37821f;
        photoViewer.f35778q3.h(f7, false);
        photoViewer.f35787r3.invalidate();
    }
}
