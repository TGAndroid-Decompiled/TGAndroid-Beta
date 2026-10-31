package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class jy implements org.telegram.messenger.mc {
    public final ky f38629a;
    public final boolean f38630b;
    public final org.telegram.messenger.jj f38631c;
    public final ly d;

    public jy(ly lyVar, ky kyVar, boolean z10, org.telegram.messenger.jj jjVar) {
        this.d = lyVar;
        this.f38629a = kyVar;
        this.f38630b = z10;
        this.f38631c = jjVar;
    }

    @Override
    public final void j(ImageReceiver imageReceiver) {
        org.telegram.messenger.jj jjVar;
        if (this.f38630b && (jjVar = this.f38631c) != null && jjVar.F2() && imageReceiver.B() != null && imageReceiver.B().f24783y == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ImageReceiver imageReceiver2 = this.f38629a.f38986r;
        if (imageReceiver2.B() != null) {
            imageReceiver2.B().N(0, false, true);
        }
    }

    @Override
    public final void q(int i10, Drawable drawable) {
    }
}
