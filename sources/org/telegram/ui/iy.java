package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class iy implements org.telegram.messenger.nc {
    public final jy f38212a;
    public final boolean f38213b;
    public final org.telegram.messenger.kj f38214c;
    public final ky d;

    public iy(ky kyVar, jy jyVar, boolean z10, org.telegram.messenger.kj kjVar) {
        this.d = kyVar;
        this.f38212a = jyVar;
        this.f38213b = z10;
        this.f38214c = kjVar;
    }

    @Override
    public final void j(ImageReceiver imageReceiver) {
        org.telegram.messenger.kj kjVar;
        if (this.f38213b && (kjVar = this.f38214c) != null && kjVar.F2() && imageReceiver.B() != null && imageReceiver.B().f25162y == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ImageReceiver imageReceiver2 = this.f38212a.f38592r;
        if (imageReceiver2.B() != null) {
            imageReceiver2.B().N(0, false, true);
        }
    }

    @Override
    public final void s(int i10, Drawable drawable) {
    }
}
