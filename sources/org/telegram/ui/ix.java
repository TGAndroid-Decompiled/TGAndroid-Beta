package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ix implements org.telegram.messenger.lc {
    public final jx f46770a;
    public final boolean f46771b;
    public final org.telegram.messenger.ij f46772c;
    public final kx d;

    public ix(kx kxVar, jx jxVar, boolean z9, org.telegram.messenger.ij ijVar) {
        this.d = kxVar;
        this.f46770a = jxVar;
        this.f46771b = z9;
        this.f46772c = ijVar;
    }

    @Override
    public final void O(ImageReceiver imageReceiver) {
        org.telegram.messenger.ij ijVar;
        if (this.f46771b && (ijVar = this.f46772c) != null && ijVar.F2() && imageReceiver.B() != null && imageReceiver.B().f31852y == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        ImageReceiver imageReceiver2 = this.f46770a.f47121r;
        if (imageReceiver2.B() != null) {
            imageReceiver2.B().N(0, false, true);
        }
    }

    @Override
    public final void t0(int i7, Drawable drawable) {
    }
}
