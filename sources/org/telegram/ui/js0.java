package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class js0 extends org.telegram.ui.Components.i00 {

    public final rr0 f39494e;

    public final PhotoViewer f39495f;

    public js0(PhotoViewer photoViewer, rr0 rr0Var) {
        super(false);
        this.f39495f = photoViewer;
        this.f39494e = rr0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f39495f;
        int[] iArr = photoViewer.f35660i3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        int[] iArr2 = photoViewer.f35669j3;
        sb3.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb3.append(' ');
        sb3.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, string, sb3.toString());
    }

    @Override
    public final float k() {
        return this.f39495f.f35694m3.c();
    }

    @Override
    public final void l(float f10) {
        this.f39494e.b(f10);
        PhotoViewer photoViewer = this.f39495f;
        photoViewer.f35694m3.h(f10, false);
        photoViewer.f35704n3.invalidate();
    }
}
