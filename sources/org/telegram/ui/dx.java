package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class dx implements org.telegram.messenger.ec {
    public final ex f44822a;
    public final boolean f44823b;
    public final org.telegram.messenger.zi f44824c;
    public final fx d;

    public dx(fx fxVar, ex exVar, boolean z10, org.telegram.messenger.zi ziVar) {
        this.d = fxVar;
        this.f44822a = exVar;
        this.f44823b = z10;
        this.f44824c = ziVar;
    }

    @Override
    public final void D(ImageReceiver imageReceiver) {
        org.telegram.messenger.zi ziVar;
        if (this.f44823b && (ziVar = this.f44824c) != null && ziVar.G2() && imageReceiver.B() != null && imageReceiver.B().f32751y == null) {
            try {
                this.d.H.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ImageReceiver imageReceiver2 = this.f44822a.f45078r;
        if (imageReceiver2.B() != null) {
            imageReceiver2.B().N(0, false, true);
        }
    }

    @Override
    public final void F0(int i3, Drawable drawable) {
    }
}
